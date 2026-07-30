package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginMethodHandler;
import defpackage.ah0;
import defpackage.fh0;
import defpackage.lh;
import defpackage.lv;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class GetTokenLoginMethodHandler extends LoginMethodHandler {
    private GetTokenClient getTokenClient;
    private final String nameForLogging;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new Parcelable.Creator<GetTokenLoginMethodHandler>() { // from class: com.facebook.login.GetTokenLoginMethodHandler$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GetTokenLoginMethodHandler createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new GetTokenLoginMethodHandler(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GetTokenLoginMethodHandler[] newArray(int i) {
            return new GetTokenLoginMethodHandler[i];
        }
    };

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        loginClient.getClass();
        this.nameForLogging = "get_token";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryAuthorize$lambda$1(GetTokenLoginMethodHandler getTokenLoginMethodHandler, LoginClient.Request request, Bundle bundle) {
        getTokenLoginMethodHandler.getClass();
        request.getClass();
        getTokenLoginMethodHandler.getTokenCompleted(request, bundle);
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void cancel() {
        GetTokenClient getTokenClient = this.getTokenClient;
        if (getTokenClient != null) {
            getTokenClient.cancel();
            getTokenClient.setCompletedListener(null);
            this.getTokenClient = null;
        }
    }

    public final void complete(final LoginClient.Request request, final Bundle bundle) {
        request.getClass();
        bundle.getClass();
        String string = bundle.getString(NativeProtocol.EXTRA_USER_ID);
        if (string != null && string.length() != 0) {
            onComplete(request, bundle);
            return;
        }
        getLoginClient().notifyBackgroundProcessingStart();
        String string2 = bundle.getString(NativeProtocol.EXTRA_ACCESS_TOKEN);
        if (string2 != null) {
            Utility.getGraphMeRequestWithCacheAsync(string2, new Utility.GraphMeRequestWithCacheCallback() { // from class: com.facebook.login.GetTokenLoginMethodHandler$complete$1
                @Override // com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
                public void onFailure(FacebookException facebookException) {
                    this.getLoginClient().complete(LoginClient.Result.Companion.createErrorResult$default(LoginClient.Result.Companion, this.getLoginClient().getPendingRequest(), "Caught exception", facebookException != null ? facebookException.getMessage() : null, null, 8, null));
                }

                @Override // com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
                public void onSuccess(JSONObject jSONObject) {
                    try {
                        bundle.putString(NativeProtocol.EXTRA_USER_ID, jSONObject != null ? jSONObject.getString("id") : null);
                        this.onComplete(request, bundle);
                    } catch (JSONException e) {
                        this.getLoginClient().complete(LoginClient.Result.Companion.createErrorResult$default(LoginClient.Result.Companion, this.getLoginClient().getPendingRequest(), "Caught exception", e.getMessage(), null, 8, null));
                    }
                }
            });
        } else {
            lh.g("Required value was null.");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public String getNameForLogging() {
        return this.nameForLogging;
    }

    public final void getTokenCompleted(LoginClient.Request request, Bundle bundle) {
        request.getClass();
        GetTokenClient getTokenClient = this.getTokenClient;
        if (getTokenClient != null) {
            getTokenClient.setCompletedListener(null);
        }
        this.getTokenClient = null;
        getLoginClient().notifyBackgroundProcessingStop();
        if (bundle != null) {
            List stringArrayList = bundle.getStringArrayList(NativeProtocol.EXTRA_PERMISSIONS);
            if (stringArrayList == null) {
                stringArrayList = ah0.m;
            }
            Set<String> permissions = request.getPermissions();
            if (permissions == null) {
                permissions = fh0.m;
            }
            String string = bundle.getString(NativeProtocol.EXTRA_AUTHENTICATION_TOKEN);
            if (permissions.contains(LoginConfiguration.OPENID) && (string == null || string.length() == 0)) {
                getLoginClient().tryNextHandler();
                return;
            }
            if (stringArrayList.containsAll(permissions)) {
                complete(request, bundle);
                return;
            }
            HashSet hashSet = new HashSet();
            for (String str : permissions) {
                if (!stringArrayList.contains(str)) {
                    hashSet.add(str);
                }
            }
            if (!hashSet.isEmpty()) {
                addLoggingExtra(LoginLogger.EVENT_EXTRAS_NEW_PERMISSIONS, TextUtils.join(",", hashSet));
            }
            request.setPermissions(hashSet);
        }
        getLoginClient().tryNextHandler();
    }

    public final void onComplete(LoginClient.Request request, Bundle bundle) {
        LoginClient.Result createErrorResult$default;
        request.getClass();
        bundle.getClass();
        try {
            LoginMethodHandler.Companion companion = LoginMethodHandler.Companion;
            createErrorResult$default = LoginClient.Result.Companion.createCompositeTokenResult(request, companion.createAccessTokenFromNativeLogin(bundle, AccessTokenSource.FACEBOOK_APPLICATION_SERVICE, request.getApplicationId()), companion.createAuthenticationTokenFromNativeLogin(bundle, request.getNonce()));
        } catch (FacebookException e) {
            createErrorResult$default = LoginClient.Result.Companion.createErrorResult$default(LoginClient.Result.Companion, getLoginClient().getPendingRequest(), null, e.getMessage(), null, 8, null);
        }
        getLoginClient().completeAndValidate(createErrorResult$default);
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int tryAuthorize(LoginClient.Request request) {
        request.getClass();
        Context activity = getLoginClient().getActivity();
        if (activity == null) {
            activity = FacebookSdk.getApplicationContext();
        }
        GetTokenClient getTokenClient = new GetTokenClient(activity, request);
        this.getTokenClient = getTokenClient;
        if (!getTokenClient.start()) {
            return 0;
        }
        getLoginClient().notifyBackgroundProcessingStart();
        lv lvVar = new lv(2, this, request);
        GetTokenClient getTokenClient2 = this.getTokenClient;
        if (getTokenClient2 == null) {
            return 1;
        }
        getTokenClient2.setCompletedListener(lvVar);
        return 1;
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
    public GetTokenLoginMethodHandler(Parcel parcel) {
        super(parcel);
        parcel.getClass();
        this.nameForLogging = "get_token";
    }
}
