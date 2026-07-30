package com.facebook.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AccessTokenSource;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.CustomTab;
import com.facebook.internal.CustomTabUtils;
import com.facebook.internal.InstagramCustomTab;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.login.LoginClient;
import defpackage.fr0;
import defpackage.kr0;
import defpackage.q40;
import defpackage.s50;
import defpackage.tp2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class CustomTabLoginMethodHandler extends WebLoginMethodHandler {
    private static final int API_EC_DIALOG_CANCEL = 4201;
    private static final int CHALLENGE_LENGTH = 20;
    private static final int CUSTOM_TAB_REQUEST_CODE = 1;
    public static final String OAUTH_DIALOG = "oauth";
    public static boolean calledThroughLoggedOutAppSwitch;
    private String currentPackage;
    private String expectedChallenge;
    private final String nameForLogging;
    private final AccessTokenSource tokenSource;
    private String validRedirectURI;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CustomTabLoginMethodHandler> CREATOR = new Parcelable.Creator<CustomTabLoginMethodHandler>() { // from class: com.facebook.login.CustomTabLoginMethodHandler$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CustomTabLoginMethodHandler createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new CustomTabLoginMethodHandler(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CustomTabLoginMethodHandler[] newArray(int i) {
            return new CustomTabLoginMethodHandler[i];
        }
    };

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        loginClient.getClass();
        this.nameForLogging = "custom_tab";
        this.tokenSource = AccessTokenSource.CHROME_CUSTOM_TAB;
        this.expectedChallenge = Utility.generateRandomString(CHALLENGE_LENGTH);
        calledThroughLoggedOutAppSwitch = false;
        this.validRedirectURI = CustomTabUtils.getValidRedirectURI(getDeveloperDefinedRedirectURI());
    }

    private final String buildIntentUriFromPackage(String str) {
        return q40.l("intent://", str);
    }

    private final String getChromePackage() {
        String str = this.currentPackage;
        if (str != null) {
            return str;
        }
        String chromePackage = CustomTabUtils.getChromePackage();
        this.currentPackage = chromePackage;
        return chromePackage;
    }

    private final String getDeveloperDefinedRedirectURI() {
        return super.getRedirectUrl();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onCustomTabComplete(String str, LoginClient.Request request) {
        int parseInt;
        if (str == null) {
            return;
        }
        int i = 0;
        if (!tp2.o(str, Validate.CUSTOM_TAB_REDIRECT_URI_PREFIX, false) && !tp2.o(str, super.getRedirectUrl(), false)) {
            return;
        }
        Uri parse = Uri.parse(str);
        Bundle parseUrlQueryString = Utility.parseUrlQueryString(parse.getQuery());
        parseUrlQueryString.putAll(Utility.parseUrlQueryString(parse.getFragment()));
        if (!validateChallengeParam(parseUrlQueryString)) {
            super.onComplete(request, null, new FacebookException("Invalid state parameter"));
            return;
        }
        String string = parseUrlQueryString.getString("error");
        if (string == null) {
            string = parseUrlQueryString.getString("error_type");
        }
        String string2 = parseUrlQueryString.getString("error_msg");
        if (string2 == null) {
            string2 = parseUrlQueryString.getString("error_message");
        }
        if (string2 == null) {
            string2 = parseUrlQueryString.getString(NativeProtocol.BRIDGE_ARG_ERROR_DESCRIPTION);
        }
        String string3 = parseUrlQueryString.getString("error_code");
        if (string3 != null) {
            try {
                parseInt = Integer.parseInt(string3);
            } catch (NumberFormatException unused) {
            }
            if (!Utility.isNullOrEmpty(string) && Utility.isNullOrEmpty(string2) && parseInt == -1) {
                if (parseUrlQueryString.containsKey("access_token")) {
                    super.onComplete(request, parseUrlQueryString, null);
                    return;
                } else {
                    FacebookSdk.getExecutor().execute(new s50(this, request, parseUrlQueryString, i));
                    return;
                }
            }
            if (string == null && (string.equals("access_denied") || string.equals("OAuthAccessDeniedException"))) {
                super.onComplete(request, null, new FacebookOperationCanceledException());
                return;
            } else if (parseInt != API_EC_DIALOG_CANCEL) {
                super.onComplete(request, null, new FacebookOperationCanceledException());
                return;
            } else {
                super.onComplete(request, null, new FacebookServiceException(new FacebookRequestError(parseInt, string, string2), string2));
                return;
            }
        }
        parseInt = -1;
        if (!Utility.isNullOrEmpty(string)) {
        }
        if (string == null) {
        }
        if (parseInt != API_EC_DIALOG_CANCEL) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCustomTabComplete$lambda$0(CustomTabLoginMethodHandler customTabLoginMethodHandler, LoginClient.Request request, Bundle bundle) {
        customTabLoginMethodHandler.getClass();
        request.getClass();
        bundle.getClass();
        try {
            customTabLoginMethodHandler.onComplete(request, customTabLoginMethodHandler.processCodeExchange(request, bundle), null);
        } catch (FacebookException e) {
            customTabLoginMethodHandler.onComplete(request, null, e);
        }
    }

    private final boolean validateChallengeParam(Bundle bundle) {
        try {
            String string = bundle.getString(ServerProtocol.DIALOG_PARAM_STATE);
            if (string == null) {
                return false;
            }
            return Intrinsics.b(new JSONObject(string).getString(LoginLogger.EVENT_PARAM_CHALLENGE), this.expectedChallenge);
        } catch (JSONException unused) {
            return false;
        }
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    public Bundle addExtraParameters(Bundle bundle, LoginClient.Request request) {
        String redirectUrl;
        bundle.getClass();
        request.getClass();
        Bundle addExtraParameters = super.addExtraParameters(bundle, request);
        String redirectURI = request.getRedirectURI();
        if (redirectURI == null || redirectURI.length() == 0) {
            String intentUriPackageTarget = request.getIntentUriPackageTarget();
            if (intentUriPackageTarget == null || intentUriPackageTarget.length() == 0) {
                redirectUrl = getRedirectUrl();
            } else {
                String intentUriPackageTarget2 = request.getIntentUriPackageTarget();
                intentUriPackageTarget2.getClass();
                redirectUrl = buildIntentUriFromPackage(intentUriPackageTarget2);
            }
        } else {
            redirectUrl = request.getRedirectURI();
        }
        addExtraParameters.putString(ServerProtocol.DIALOG_PARAM_REDIRECT_URI, redirectUrl);
        return addExtraParameters;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public String getNameForLogging() {
        return this.nameForLogging;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public String getRedirectUrl() {
        return this.validRedirectURI;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    public String getSSODevice() {
        return "chrome_custom_tab";
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    public AccessTokenSource getTokenSource() {
        return this.tokenSource;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public boolean onActivityResult(int i, int i2, Intent intent) {
        if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.NO_ACTIVITY_EXCEPTION, false)) {
            return super.onActivityResult(i, i2, intent);
        }
        if (i != 1) {
            return super.onActivityResult(i, i2, intent);
        }
        LoginClient.Request pendingRequest = getLoginClient().getPendingRequest();
        if (pendingRequest == null) {
            return false;
        }
        if (i2 == -1) {
            onCustomTabComplete(intent != null ? intent.getStringExtra(CustomTabMainActivity.EXTRA_URL) : null, pendingRequest);
            return true;
        }
        super.onComplete(pendingRequest, null, new FacebookOperationCanceledException());
        return false;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void putChallengeParam(JSONObject jSONObject) {
        jSONObject.getClass();
        jSONObject.put(LoginLogger.EVENT_PARAM_CHALLENGE, this.expectedChallenge);
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int tryAuthorize(LoginClient.Request request) {
        request.getClass();
        LoginClient loginClient = getLoginClient();
        if (getRedirectUrl().length() == 0) {
            return 0;
        }
        Bundle addExtraParameters = addExtraParameters(getParameters(request), request);
        if (calledThroughLoggedOutAppSwitch) {
            addExtraParameters.putString(ServerProtocol.DIALOG_PARAM_CCT_OVER_LOGGED_OUT_APP_SWITCH, AppEventsConstants.EVENT_PARAM_VALUE_YES);
        }
        if (FacebookSdk.hasCustomTabsPrefetching) {
            if (request.isInstagramLogin()) {
                CustomTabPrefetchHelper.Companion.mayLaunchUrl(InstagramCustomTab.Companion.getURIForAction(OAUTH_DIALOG, addExtraParameters));
            } else {
                CustomTabPrefetchHelper.Companion.mayLaunchUrl(CustomTab.Companion.getURIForAction(OAUTH_DIALOG, addExtraParameters));
            }
        }
        kr0 activity = loginClient.getActivity();
        if (activity == null) {
            return 0;
        }
        Intent intent = new Intent(activity, (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.EXTRA_ACTION, OAUTH_DIALOG);
        intent.putExtra(CustomTabMainActivity.EXTRA_PARAMS, addExtraParameters);
        intent.putExtra(CustomTabMainActivity.EXTRA_CHROME_PACKAGE, getChromePackage());
        intent.putExtra(CustomTabMainActivity.EXTRA_TARGET_APP, request.getLoginTargetApp().toString());
        fr0 fragment = loginClient.getFragment();
        if (fragment != null) {
            fragment.startActivityForResult(intent, 1);
        }
        return 1;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        super.writeToParcel(parcel, i);
        parcel.writeString(this.expectedChallenge);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabLoginMethodHandler(Parcel parcel) {
        super(parcel);
        parcel.getClass();
        this.nameForLogging = "custom_tab";
        this.tokenSource = AccessTokenSource.CHROME_CUSTOM_TAB;
        this.expectedChallenge = parcel.readString();
        this.validRedirectURI = CustomTabUtils.getValidRedirectURI(getDeveloperDefinedRedirectURI());
    }
}
