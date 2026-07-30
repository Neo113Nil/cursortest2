package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.login.LoginClient;
import defpackage.ey;
import defpackage.fr0;
import defpackage.kr0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class LoginClient implements Parcelable {
    private BackgroundProcessingListener backgroundProcessingListener;
    private boolean checkedInternetPermission;
    private int currentHandler;
    private Map<String, String> extraData;
    private fr0 fragment;
    private LoginMethodHandler[] handlersToTry;
    private Map<String, String> loggingExtras;
    private LoginLogger loginLogger;
    private int numActivitiesReturned;
    private int numTotalIntentsFired;
    private OnCompletedListener onCompletedListener;
    private Request pendingRequest;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "LoginClient";
    public static final Parcelable.Creator<LoginClient> CREATOR = new Parcelable.Creator<LoginClient>() { // from class: com.facebook.login.LoginClient$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LoginClient createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new LoginClient(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LoginClient[] newArray(int i) {
            return new LoginClient[i];
        }
    };

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface BackgroundProcessingListener {
        void onBackgroundProcessingStarted();

        void onBackgroundProcessingStopped();
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface OnCompletedListener {
        void onCompleted(Result result);
    }

    public LoginClient(Parcel parcel) {
        parcel.getClass();
        this.currentHandler = -1;
        Parcelable[] readParcelableArray = parcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        readParcelableArray = readParcelableArray == null ? new Parcelable[0] : readParcelableArray;
        ArrayList arrayList = new ArrayList();
        int length = readParcelableArray.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Parcelable parcelable = readParcelableArray[i];
            LoginMethodHandler loginMethodHandler = parcelable instanceof LoginMethodHandler ? (LoginMethodHandler) parcelable : null;
            if (loginMethodHandler != null) {
                loginMethodHandler.setLoginClient(this);
            }
            if (loginMethodHandler != null) {
                arrayList.add(loginMethodHandler);
            }
            i++;
        }
        this.handlersToTry = (LoginMethodHandler[]) arrayList.toArray(new LoginMethodHandler[0]);
        this.currentHandler = parcel.readInt();
        this.pendingRequest = (Request) parcel.readParcelable(Request.class.getClassLoader());
        Map<String, String> readNonnullStringMapFromParcel = Utility.readNonnullStringMapFromParcel(parcel);
        this.loggingExtras = readNonnullStringMapFromParcel != null ? new LinkedHashMap(readNonnullStringMapFromParcel) : null;
        Map<String, String> readNonnullStringMapFromParcel2 = Utility.readNonnullStringMapFromParcel(parcel);
        this.extraData = readNonnullStringMapFromParcel2 != null ? new LinkedHashMap(readNonnullStringMapFromParcel2) : null;
    }

    private final void addLoggingExtra(String str, String str2, boolean z) {
        Map<String, String> map = this.loggingExtras;
        if (map == null) {
            map = new HashMap<>();
        }
        if (this.loggingExtras == null) {
            this.loggingExtras = map;
        }
        if (map.containsKey(str) && z) {
            str2 = map.get(str) + ',' + str2;
        }
        map.put(str, str2);
    }

    private final void completeWithFailure() {
        complete(Result.Companion.createErrorResult$default(Result.Companion, this.pendingRequest, "Login attempt failed.", null, null, 8, null));
    }

    public static final String getE2E() {
        return Companion.getE2E();
    }

    private final LoginLogger getLogger() {
        String applicationId;
        LoginLogger loginLogger = this.loginLogger;
        if (loginLogger != null) {
            String applicationId2 = loginLogger.getApplicationId();
            Request request = this.pendingRequest;
            if (Intrinsics.b(applicationId2, request != null ? request.getApplicationId() : null)) {
                return loginLogger;
            }
        }
        Context activity = getActivity();
        if (activity == null) {
            activity = FacebookSdk.getApplicationContext();
        }
        Request request2 = this.pendingRequest;
        if (request2 == null || (applicationId = request2.getApplicationId()) == null) {
            applicationId = FacebookSdk.getApplicationId();
        }
        LoginLogger loginLogger2 = new LoginLogger(activity, applicationId);
        this.loginLogger = loginLogger2;
        return loginLogger2;
    }

    public static final int getLoginRequestCode() {
        return Companion.getLoginRequestCode();
    }

    private final void logAuthorizationMethodComplete(String str, String str2, String str3, String str4, Map<String, String> map) {
        Request request = this.pendingRequest;
        String str5 = LoginLogger.EVENT_NAME_LOGIN_METHOD_COMPLETE;
        if (request == null) {
            getLogger().logUnexpectedError(LoginLogger.EVENT_NAME_LOGIN_METHOD_COMPLETE, "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
            return;
        }
        LoginLogger logger = getLogger();
        String authId = request.getAuthId();
        if (request.isFamilyLogin()) {
            str5 = LoginLogger.EVENT_NAME_FOA_LOGIN_METHOD_COMPLETE;
        }
        logger.logAuthorizationMethodComplete(authId, str, str2, str3, str4, map, str5);
    }

    private final void notifyOnCompleteListener(Result result) {
        OnCompletedListener onCompletedListener = this.onCompletedListener;
        if (onCompletedListener != null) {
            onCompletedListener.onCompleted(result);
        }
    }

    public final void addExtraData(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        Map<String, String> map = this.extraData;
        if (map == null) {
            map = new HashMap<>();
        }
        if (this.extraData == null) {
            this.extraData = map;
        }
        if (map.containsKey(str) && z) {
            str2 = map.get(str) + ',' + str2;
        }
        map.put(str, str2);
    }

    public final void authorize(Request request) {
        if (request == null) {
            return;
        }
        if (this.pendingRequest != null) {
            ey.i("Attempted to authorize while a request is pending.");
        } else if (!AccessToken.Companion.isCurrentAccessTokenActive() || checkInternetPermission()) {
            this.pendingRequest = request;
            this.handlersToTry = getHandlersToTry(request);
            tryNextHandler();
        }
    }

    public final void cancelCurrentHandler() {
        LoginMethodHandler currentHandler = getCurrentHandler();
        if (currentHandler != null) {
            currentHandler.cancel();
        }
    }

    public final boolean checkInternetPermission() {
        if (this.checkedInternetPermission) {
            return true;
        }
        if (checkPermission("android.permission.INTERNET") == 0) {
            this.checkedInternetPermission = true;
            return true;
        }
        kr0 activity = getActivity();
        complete(Result.Companion.createErrorResult$default(Result.Companion, this.pendingRequest, activity != null ? activity.getString(com.facebook.common.R.string.com_facebook_internet_permission_error_title) : null, activity != null ? activity.getString(com.facebook.common.R.string.com_facebook_internet_permission_error_message) : null, null, 8, null));
        return false;
    }

    public final int checkPermission(String str) {
        str.getClass();
        kr0 activity = getActivity();
        if (activity != null) {
            return activity.checkCallingOrSelfPermission(str);
        }
        return -1;
    }

    public final void complete(Result result) {
        result.getClass();
        LoginMethodHandler currentHandler = getCurrentHandler();
        if (currentHandler != null) {
            logAuthorizationMethodComplete(currentHandler.getNameForLogging(), result, currentHandler.getMethodLoggingExtras());
        }
        Map<String, String> map = this.loggingExtras;
        if (map != null) {
            result.loggingExtras = map;
        }
        Map<String, String> map2 = this.extraData;
        if (map2 != null) {
            result.extraData = map2;
        }
        this.handlersToTry = null;
        this.currentHandler = -1;
        this.pendingRequest = null;
        this.loggingExtras = null;
        this.numActivitiesReturned = 0;
        this.numTotalIntentsFired = 0;
        notifyOnCompleteListener(result);
    }

    public final void completeAndValidate(Result result) {
        result.getClass();
        if (result.token == null || !AccessToken.Companion.isCurrentAccessTokenActive()) {
            complete(result);
        } else {
            validateSameFbidAndFinish(result);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final kr0 getActivity() {
        fr0 fr0Var = this.fragment;
        if (fr0Var != null) {
            return fr0Var.getActivity();
        }
        return null;
    }

    public final BackgroundProcessingListener getBackgroundProcessingListener() {
        return this.backgroundProcessingListener;
    }

    public final boolean getCheckedInternetPermission() {
        return this.checkedInternetPermission;
    }

    public final LoginMethodHandler getCurrentHandler() {
        LoginMethodHandler[] loginMethodHandlerArr;
        int i = this.currentHandler;
        if (i < 0 || (loginMethodHandlerArr = this.handlersToTry) == null) {
            return null;
        }
        return loginMethodHandlerArr[i];
    }

    public final Map<String, String> getExtraData() {
        return this.extraData;
    }

    public final fr0 getFragment() {
        return this.fragment;
    }

    public LoginMethodHandler[] getHandlersToTry(Request request) {
        request.getClass();
        ArrayList arrayList = new ArrayList();
        LoginBehavior loginBehavior = request.getLoginBehavior();
        if (!request.isInstagramLogin()) {
            if (loginBehavior.allowsGetTokenAuth()) {
                arrayList.add(new GetTokenLoginMethodHandler(this));
            }
            if (!FacebookSdk.bypassAppSwitch && loginBehavior.allowsKatanaAuth()) {
                arrayList.add(new KatanaProxyLoginMethodHandler(this));
            }
        } else if (!FacebookSdk.bypassAppSwitch && loginBehavior.allowsInstagramAppAuth()) {
            arrayList.add(new InstagramAppLoginMethodHandler(this));
        }
        if (loginBehavior.allowsCustomTabAuth()) {
            arrayList.add(new CustomTabLoginMethodHandler(this));
        }
        if (loginBehavior.allowsWebViewAuth()) {
            arrayList.add(new WebViewLoginMethodHandler(this));
        }
        if (!request.isInstagramLogin() && loginBehavior.allowsDeviceAuth()) {
            arrayList.add(new DeviceAuthMethodHandler(this));
        }
        return (LoginMethodHandler[]) arrayList.toArray(new LoginMethodHandler[0]);
    }

    public final boolean getInProgress() {
        return this.pendingRequest != null && this.currentHandler >= 0;
    }

    public final Map<String, String> getLoggingExtras() {
        return this.loggingExtras;
    }

    public final OnCompletedListener getOnCompletedListener() {
        return this.onCompletedListener;
    }

    public final Request getPendingRequest() {
        return this.pendingRequest;
    }

    public final void notifyBackgroundProcessingStart() {
        BackgroundProcessingListener backgroundProcessingListener = this.backgroundProcessingListener;
        if (backgroundProcessingListener != null) {
            backgroundProcessingListener.onBackgroundProcessingStarted();
        }
    }

    public final void notifyBackgroundProcessingStop() {
        BackgroundProcessingListener backgroundProcessingListener = this.backgroundProcessingListener;
        if (backgroundProcessingListener != null) {
            backgroundProcessingListener.onBackgroundProcessingStopped();
        }
    }

    public final boolean onActivityResult(int i, int i2, Intent intent) {
        this.numActivitiesReturned++;
        if (this.pendingRequest != null) {
            if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.NO_ACTIVITY_EXCEPTION, false)) {
                tryNextHandler();
                return false;
            }
            LoginMethodHandler currentHandler = getCurrentHandler();
            if (currentHandler != null && (!currentHandler.shouldKeepTrackOfMultipleIntents() || intent != null || this.numActivitiesReturned >= this.numTotalIntentsFired)) {
                return currentHandler.onActivityResult(i, i2, intent);
            }
        }
        return false;
    }

    public final void setBackgroundProcessingListener(BackgroundProcessingListener backgroundProcessingListener) {
        this.backgroundProcessingListener = backgroundProcessingListener;
    }

    public final void setCheckedInternetPermission(boolean z) {
        this.checkedInternetPermission = z;
    }

    public final void setCurrentHandlerIndex(int i) {
        this.currentHandler = i;
    }

    public final void setExtraData(Map<String, String> map) {
        this.extraData = map;
    }

    public final void setFragment(fr0 fr0Var) {
        if (this.fragment == null) {
            this.fragment = fr0Var;
        } else {
            ey.i("Can't set fragment once it is already set.");
        }
    }

    public final void setHandlersToTry(LoginMethodHandler[] loginMethodHandlerArr) {
        this.handlersToTry = loginMethodHandlerArr;
    }

    public final void setLoggingExtras(Map<String, String> map) {
        this.loggingExtras = map;
    }

    public final void setOnCompletedListener(OnCompletedListener onCompletedListener) {
        this.onCompletedListener = onCompletedListener;
    }

    public final void setPendingRequest(Request request) {
        this.pendingRequest = request;
    }

    public final void startOrContinueAuth(Request request) {
        if (getInProgress()) {
            return;
        }
        authorize(request);
    }

    public final boolean tryCurrentHandler() {
        LoginMethodHandler currentHandler = getCurrentHandler();
        if (currentHandler == null) {
            return false;
        }
        if (currentHandler.needsInternetPermission() && !checkInternetPermission()) {
            addLoggingExtra(LoginLogger.EVENT_EXTRAS_MISSING_INTERNET_PERMISSION, AppEventsConstants.EVENT_PARAM_VALUE_YES, false);
            return false;
        }
        Request request = this.pendingRequest;
        if (request == null) {
            return false;
        }
        int tryAuthorize = currentHandler.tryAuthorize(request);
        this.numActivitiesReturned = 0;
        if (tryAuthorize > 0) {
            getLogger().logAuthorizationMethodStart(request.getAuthId(), currentHandler.getNameForLogging(), request.isFamilyLogin() ? LoginLogger.EVENT_NAME_FOA_LOGIN_METHOD_START : LoginLogger.EVENT_NAME_LOGIN_METHOD_START);
            this.numTotalIntentsFired = tryAuthorize;
        } else {
            getLogger().logAuthorizationMethodNotTried(request.getAuthId(), currentHandler.getNameForLogging(), request.isFamilyLogin() ? LoginLogger.EVENT_NAME_FOA_LOGIN_METHOD_NOT_TRIED : LoginLogger.EVENT_NAME_LOGIN_METHOD_NOT_TRIED);
            addLoggingExtra(LoginLogger.EVENT_EXTRAS_NOT_TRIED, currentHandler.getNameForLogging(), true);
        }
        return tryAuthorize > 0;
    }

    public final void tryNextHandler() {
        LoginClient loginClient;
        LoginMethodHandler currentHandler = getCurrentHandler();
        if (currentHandler != null) {
            loginClient = this;
            loginClient.logAuthorizationMethodComplete(currentHandler.getNameForLogging(), LoginLogger.EVENT_PARAM_METHOD_RESULT_SKIPPED, null, null, currentHandler.getMethodLoggingExtras());
        } else {
            loginClient = this;
        }
        LoginMethodHandler[] loginMethodHandlerArr = loginClient.handlersToTry;
        while (loginMethodHandlerArr != null) {
            int i = loginClient.currentHandler;
            if (i >= loginMethodHandlerArr.length - 1) {
                break;
            }
            loginClient.currentHandler = i + 1;
            if (loginClient.tryCurrentHandler()) {
                return;
            }
        }
        if (loginClient.pendingRequest != null) {
            loginClient.completeWithFailure();
        }
    }

    public final void validateSameFbidAndFinish(Result result) {
        Result createCompositeTokenResult;
        result.getClass();
        if (result.token == null) {
            ey.i("Can't validate without a token");
            return;
        }
        AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
        AccessToken accessToken = result.token;
        if (currentAccessToken != null) {
            try {
                if (Intrinsics.b(currentAccessToken.getUserId(), accessToken.getUserId())) {
                    createCompositeTokenResult = Result.Companion.createCompositeTokenResult(this.pendingRequest, result.token, result.authenticationToken);
                    complete(createCompositeTokenResult);
                }
            } catch (Exception e) {
                complete(Result.Companion.createErrorResult$default(Result.Companion, this.pendingRequest, "Caught exception", e.getMessage(), null, 8, null));
                return;
            }
        }
        createCompositeTokenResult = Result.Companion.createErrorResult$default(Result.Companion, this.pendingRequest, "User logged in as different Facebook user.", null, null, 8, null);
        complete(createCompositeTokenResult);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelableArray(this.handlersToTry, i);
        parcel.writeInt(this.currentHandler);
        parcel.writeParcelable(this.pendingRequest, i);
        Utility.writeNonnullStringMapToParcel(parcel, this.loggingExtras);
        Utility.writeNonnullStringMapToParcel(parcel, this.extraData);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Request implements Parcelable {
        private String androidSsoContext;
        private final String applicationId;
        private String authId;
        private String authType;
        private final String codeChallenge;
        private final CodeChallengeMethod codeChallengeMethod;
        private final String codeVerifier;
        private final DefaultAudience defaultAudience;
        private String deviceAuthTargetUserId;
        private String deviceRedirectUriString;
        private boolean forceConfirmation;
        private String intentUriPackageTarget;
        private boolean isFamilyLogin;
        private boolean isRerequest;
        private final LoginBehavior loginBehavior;
        private final LoginTargetApp loginTargetApp;
        private String messengerPageId;
        private final String nonce;
        private Set<String> permissions;
        private String redirectURI;
        private boolean resetMessengerState;
        private boolean shouldSkipAccountDeduplication;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Request> CREATOR = new Parcelable.Creator<Request>() { // from class: com.facebook.login.LoginClient$Request$Companion$CREATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LoginClient.Request createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new LoginClient.Request(parcel, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LoginClient.Request[] newArray(int i) {
                return new LoginClient.Request[i];
            }
        };

        private Request(Parcel parcel) {
            this.loginBehavior = LoginBehavior.valueOf(Validate.notNullOrEmpty(parcel.readString(), "loginBehavior"));
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.permissions = new HashSet(arrayList);
            String readString = parcel.readString();
            this.defaultAudience = readString != null ? DefaultAudience.valueOf(readString) : DefaultAudience.NONE;
            this.applicationId = Validate.notNullOrEmpty(parcel.readString(), "applicationId");
            this.redirectURI = parcel.readString();
            this.intentUriPackageTarget = parcel.readString();
            this.authId = Validate.notNullOrEmpty(parcel.readString(), "authId");
            this.isRerequest = parcel.readByte() != 0;
            this.deviceRedirectUriString = parcel.readString();
            this.authType = Validate.notNullOrEmpty(parcel.readString(), "authType");
            this.deviceAuthTargetUserId = parcel.readString();
            this.messengerPageId = parcel.readString();
            this.resetMessengerState = parcel.readByte() != 0;
            String readString2 = parcel.readString();
            this.loginTargetApp = readString2 != null ? LoginTargetApp.valueOf(readString2) : LoginTargetApp.FACEBOOK;
            this.isFamilyLogin = parcel.readByte() != 0;
            this.shouldSkipAccountDeduplication = parcel.readByte() != 0;
            this.forceConfirmation = parcel.readByte() != 0;
            this.androidSsoContext = parcel.readString();
            this.nonce = Validate.notNullOrEmpty(parcel.readString(), "nonce");
            this.codeVerifier = parcel.readString();
            this.codeChallenge = parcel.readString();
            String readString3 = parcel.readString();
            this.codeChallengeMethod = readString3 != null ? CodeChallengeMethod.valueOf(readString3) : null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String getAndroidSsoContext() {
            return this.androidSsoContext;
        }

        public final String getApplicationId() {
            return this.applicationId;
        }

        public final String getAuthId() {
            return this.authId;
        }

        public final String getAuthType() {
            return this.authType;
        }

        public final String getCodeChallenge() {
            return this.codeChallenge;
        }

        public final CodeChallengeMethod getCodeChallengeMethod() {
            return this.codeChallengeMethod;
        }

        public final String getCodeVerifier() {
            return this.codeVerifier;
        }

        public final DefaultAudience getDefaultAudience() {
            return this.defaultAudience;
        }

        public final String getDeviceAuthTargetUserId() {
            return this.deviceAuthTargetUserId;
        }

        public final String getDeviceRedirectUriString() {
            return this.deviceRedirectUriString;
        }

        public final boolean getForceConfirmation() {
            return this.forceConfirmation;
        }

        public final String getIntentUriPackageTarget() {
            return this.intentUriPackageTarget;
        }

        public final LoginBehavior getLoginBehavior() {
            return this.loginBehavior;
        }

        public final LoginTargetApp getLoginTargetApp() {
            return this.loginTargetApp;
        }

        public final String getMessengerPageId() {
            return this.messengerPageId;
        }

        public final String getNonce() {
            return this.nonce;
        }

        public final Set<String> getPermissions() {
            return this.permissions;
        }

        public final String getRedirectURI() {
            return this.redirectURI;
        }

        public final boolean getResetMessengerState() {
            return this.resetMessengerState;
        }

        public final boolean hasPublishPermission() {
            Iterator<String> it = this.permissions.iterator();
            while (it.hasNext()) {
                if (LoginManager.Companion.isPublishPermission(it.next())) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isFamilyLogin() {
            return this.isFamilyLogin;
        }

        public final boolean isInstagramLogin() {
            return this.loginTargetApp == LoginTargetApp.INSTAGRAM;
        }

        public final boolean isRerequest() {
            return this.isRerequest;
        }

        public final void setAndroidSsoContext(String str) {
            this.androidSsoContext = str;
        }

        public final void setAuthId(String str) {
            str.getClass();
            this.authId = str;
        }

        public final void setAuthType(String str) {
            str.getClass();
            this.authType = str;
        }

        public final void setDeviceAuthTargetUserId(String str) {
            this.deviceAuthTargetUserId = str;
        }

        public final void setDeviceRedirectUriString(String str) {
            this.deviceRedirectUriString = str;
        }

        public final void setFamilyLogin(boolean z) {
            this.isFamilyLogin = z;
        }

        public final void setForceConfirmation(boolean z) {
            this.forceConfirmation = z;
        }

        public final void setIntentUriPackageTarget(String str) {
            this.intentUriPackageTarget = str;
        }

        public final void setMessengerPageId(String str) {
            this.messengerPageId = str;
        }

        public final void setPermissions(Set<String> set) {
            set.getClass();
            this.permissions = set;
        }

        public final void setRedirectURI(String str) {
            this.redirectURI = str;
        }

        public final void setRerequest(boolean z) {
            this.isRerequest = z;
        }

        public final void setResetMessengerState(boolean z) {
            this.resetMessengerState = z;
        }

        public final void setShouldSkipAccountDeduplication(boolean z) {
            this.shouldSkipAccountDeduplication = z;
        }

        public final boolean shouldSkipAccountDeduplication() {
            return this.shouldSkipAccountDeduplication;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.loginBehavior.name());
            parcel.writeStringList(new ArrayList(this.permissions));
            parcel.writeString(this.defaultAudience.name());
            parcel.writeString(this.applicationId);
            parcel.writeString(this.redirectURI);
            parcel.writeString(this.intentUriPackageTarget);
            parcel.writeString(this.authId);
            parcel.writeByte(this.isRerequest ? (byte) 1 : (byte) 0);
            parcel.writeString(this.deviceRedirectUriString);
            parcel.writeString(this.authType);
            parcel.writeString(this.deviceAuthTargetUserId);
            parcel.writeString(this.messengerPageId);
            parcel.writeByte(this.resetMessengerState ? (byte) 1 : (byte) 0);
            parcel.writeString(this.loginTargetApp.name());
            parcel.writeByte(this.isFamilyLogin ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.shouldSkipAccountDeduplication ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.forceConfirmation ? (byte) 1 : (byte) 0);
            parcel.writeString(this.androidSsoContext);
            parcel.writeString(this.nonce);
            parcel.writeString(this.codeVerifier);
            parcel.writeString(this.codeChallenge);
            CodeChallengeMethod codeChallengeMethod = this.codeChallengeMethod;
            parcel.writeString(codeChallengeMethod != null ? codeChallengeMethod.name() : null);
        }

        /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Request(LoginBehavior loginBehavior, Set<String> set, DefaultAudience defaultAudience, String str, String str2, String str3) {
            this(loginBehavior, set, defaultAudience, str, str2, str3, null, null, null, null, null, null, null, 8128, null);
            loginBehavior.getClass();
            defaultAudience.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Request(LoginBehavior loginBehavior, Set<String> set, DefaultAudience defaultAudience, String str, String str2, String str3, LoginTargetApp loginTargetApp) {
            this(loginBehavior, set, defaultAudience, str, str2, str3, loginTargetApp, null, null, null, null, null, null, 8064, null);
            loginBehavior.getClass();
            defaultAudience.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Request(LoginBehavior loginBehavior, Set<String> set, DefaultAudience defaultAudience, String str, String str2, String str3, LoginTargetApp loginTargetApp, String str4) {
            this(loginBehavior, set, defaultAudience, str, str2, str3, loginTargetApp, str4, null, null, null, null, null, 7936, null);
            loginBehavior.getClass();
            defaultAudience.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Request(LoginBehavior loginBehavior, Set<String> set, DefaultAudience defaultAudience, String str, String str2, String str3, LoginTargetApp loginTargetApp, String str4, String str5) {
            this(loginBehavior, set, defaultAudience, str, str2, str3, loginTargetApp, str4, str5, null, null, null, null, 7680, null);
            loginBehavior.getClass();
            defaultAudience.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Request(LoginBehavior loginBehavior, Set<String> set, DefaultAudience defaultAudience, String str, String str2, String str3, LoginTargetApp loginTargetApp, String str4, String str5, String str6) {
            this(loginBehavior, set, defaultAudience, str, str2, str3, loginTargetApp, str4, str5, str6, null, null, null, 7168, null);
            loginBehavior.getClass();
            defaultAudience.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Request(LoginBehavior loginBehavior, Set<String> set, DefaultAudience defaultAudience, String str, String str2, String str3, LoginTargetApp loginTargetApp, String str4, String str5, String str6, CodeChallengeMethod codeChallengeMethod) {
            this(loginBehavior, set, defaultAudience, str, str2, str3, loginTargetApp, str4, str5, str6, codeChallengeMethod, null, null, 6144, null);
            loginBehavior.getClass();
            defaultAudience.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Request(LoginBehavior loginBehavior, Set<String> set, DefaultAudience defaultAudience, String str, String str2, String str3, LoginTargetApp loginTargetApp, String str4, String str5, String str6, CodeChallengeMethod codeChallengeMethod, String str7) {
            this(loginBehavior, set, defaultAudience, str, str2, str3, loginTargetApp, str4, str5, str6, codeChallengeMethod, str7, null, 4096, null);
            loginBehavior.getClass();
            defaultAudience.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
            	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
            	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
            */
        public /* synthetic */ Request(com.facebook.login.LoginBehavior r17, java.util.Set r18, com.facebook.login.DefaultAudience r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, com.facebook.login.LoginTargetApp r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, com.facebook.login.CodeChallengeMethod r27, java.lang.String r28, java.lang.String r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
            /*
                r16 = this;
                r0 = r30
                r1 = r0 & 64
                if (r1 == 0) goto La
                com.facebook.login.LoginTargetApp r1 = com.facebook.login.LoginTargetApp.FACEBOOK
                r9 = r1
                goto Lc
            La:
                r9 = r23
            Lc:
                r1 = r0 & 128(0x80, float:1.8E-43)
                r2 = 0
                if (r1 == 0) goto L13
                r10 = r2
                goto L15
            L13:
                r10 = r24
            L15:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L1b
                r11 = r2
                goto L1d
            L1b:
                r11 = r25
            L1d:
                r1 = r0 & 512(0x200, float:7.17E-43)
                if (r1 == 0) goto L23
                r12 = r2
                goto L25
            L23:
                r12 = r26
            L25:
                r1 = r0 & 1024(0x400, float:1.435E-42)
                if (r1 == 0) goto L2b
                r13 = r2
                goto L2d
            L2b:
                r13 = r27
            L2d:
                r1 = r0 & 2048(0x800, float:2.87E-42)
                if (r1 == 0) goto L33
                r14 = r2
                goto L35
            L33:
                r14 = r28
            L35:
                r0 = r0 & 4096(0x1000, float:5.74E-42)
                if (r0 == 0) goto L49
                r15 = r2
                r3 = r17
                r4 = r18
                r5 = r19
                r6 = r20
                r7 = r21
                r8 = r22
                r2 = r16
                goto L59
            L49:
                r15 = r29
                r2 = r16
                r3 = r17
                r4 = r18
                r5 = r19
                r6 = r20
                r7 = r21
                r8 = r22
            L59:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginClient.Request.<init>(com.facebook.login.LoginBehavior, java.util.Set, com.facebook.login.DefaultAudience, java.lang.String, java.lang.String, java.lang.String, com.facebook.login.LoginTargetApp, java.lang.String, java.lang.String, java.lang.String, com.facebook.login.CodeChallengeMethod, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public Request(LoginBehavior loginBehavior, Set<String> set, DefaultAudience defaultAudience, String str, String str2, String str3, LoginTargetApp loginTargetApp, String str4, String str5, String str6, CodeChallengeMethod codeChallengeMethod, String str7, String str8) {
            loginBehavior.getClass();
            defaultAudience.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
            this.loginBehavior = loginBehavior;
            this.permissions = set == null ? new HashSet<>() : set;
            this.defaultAudience = defaultAudience;
            this.authType = str;
            this.applicationId = str2;
            this.redirectURI = str7;
            this.intentUriPackageTarget = str8;
            this.authId = str3;
            this.loginTargetApp = loginTargetApp == null ? LoginTargetApp.FACEBOOK : loginTargetApp;
            if (str4 != null && str4.length() != 0) {
                this.nonce = str4;
            } else {
                String uuid = UUID.randomUUID().toString();
                uuid.getClass();
                this.nonce = uuid;
            }
            this.codeVerifier = str5;
            this.codeChallenge = str6;
            this.codeChallengeMethod = codeChallengeMethod;
        }

        public /* synthetic */ Request(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Result implements Parcelable {
        public final AuthenticationToken authenticationToken;
        public final Code code;
        public final String errorCode;
        public final String errorMessage;
        public Map<String, String> extraData;
        public Map<String, String> loggingExtras;
        public final Request request;
        public final AccessToken token;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Result> CREATOR = new Parcelable.Creator<Result>() { // from class: com.facebook.login.LoginClient$Result$Companion$CREATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LoginClient.Result createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new LoginClient.Result(parcel, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LoginClient.Result[] newArray(int i) {
                return new LoginClient.Result[i];
            }
        };

        /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
        public enum Code {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");

            private final String loggingValue;

            Code(String str) {
                this.loggingValue = str;
            }

            public final String getLoggingValue() {
                return this.loggingValue;
            }
        }

        private Result(Parcel parcel) {
            String readString = parcel.readString();
            this.code = Code.valueOf(readString == null ? "error" : readString);
            this.token = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.authenticationToken = (AuthenticationToken) parcel.readParcelable(AuthenticationToken.class.getClassLoader());
            this.errorMessage = parcel.readString();
            this.errorCode = parcel.readString();
            this.request = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.loggingExtras = Utility.readNonnullStringMapFromParcel(parcel);
            this.extraData = Utility.readNonnullStringMapFromParcel(parcel);
        }

        public static final Result createCancelResult(Request request, String str) {
            return Companion.createCancelResult(request, str);
        }

        public static final Result createCompositeTokenResult(Request request, AccessToken accessToken, AuthenticationToken authenticationToken) {
            return Companion.createCompositeTokenResult(request, accessToken, authenticationToken);
        }

        public static final Result createErrorResult(Request request, String str, String str2) {
            return Companion.createErrorResult(request, str, str2);
        }

        public static final Result createTokenResult(Request request, AccessToken accessToken) {
            return Companion.createTokenResult(request, accessToken);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.code.name());
            parcel.writeParcelable(this.token, i);
            parcel.writeParcelable(this.authenticationToken, i);
            parcel.writeString(this.errorMessage);
            parcel.writeString(this.errorCode);
            parcel.writeParcelable(this.request, i);
            Utility.writeNonnullStringMapToParcel(parcel, this.loggingExtras);
            Utility.writeNonnullStringMapToParcel(parcel, this.extraData);
        }

        /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ Result createErrorResult$default(Companion companion, Request request, String str, String str2, String str3, int i, Object obj) {
                if ((i & 8) != 0) {
                    str3 = null;
                }
                return companion.createErrorResult(request, str, str2, str3);
            }

            public final Result createCancelResult(Request request, String str) {
                return new Result(request, Code.CANCEL, null, str, null);
            }

            public final Result createCompositeTokenResult(Request request, AccessToken accessToken, AuthenticationToken authenticationToken) {
                return new Result(request, Code.SUCCESS, accessToken, authenticationToken, null, null);
            }

            public final Result createErrorResult(Request request, String str, String str2, String str3) {
                ArrayList arrayList = new ArrayList();
                if (str != null) {
                    arrayList.add(str);
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
                return new Result(request, Code.ERROR, null, TextUtils.join(": ", arrayList), str3);
            }

            public final Result createTokenResult(Request request, AccessToken accessToken) {
                accessToken.getClass();
                return new Result(request, Code.SUCCESS, accessToken, null, null);
            }

            private Companion() {
            }

            public final Result createErrorResult(Request request, String str, String str2) {
                return createErrorResult$default(this, request, str, str2, null, 8, null);
            }
        }

        public static final Result createErrorResult(Request request, String str, String str2, String str3) {
            return Companion.createErrorResult(request, str, str2, str3);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Result(Request request, Code code, AccessToken accessToken, String str, String str2) {
            this(request, code, accessToken, null, str, str2);
            code.getClass();
        }

        public Result(Request request, Code code, AccessToken accessToken, AuthenticationToken authenticationToken, String str, String str2) {
            code.getClass();
            this.request = request;
            this.token = accessToken;
            this.authenticationToken = authenticationToken;
            this.errorMessage = str;
            this.code = code;
            this.errorCode = str2;
        }

        public /* synthetic */ Result(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getE2E() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("init", System.currentTimeMillis());
            } catch (JSONException e) {
                Utility.logd(LoginClient.TAG, "Failed to create e2e JSON", e);
            }
            String jSONObject2 = jSONObject.toString();
            jSONObject2.getClass();
            return jSONObject2;
        }

        public final int getLoginRequestCode() {
            return CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
        }

        private Companion() {
        }
    }

    private final void logAuthorizationMethodComplete(String str, Result result, Map<String, String> map) {
        logAuthorizationMethodComplete(str, result.code.getLoggingValue(), result.errorMessage, result.errorCode, map);
    }

    public LoginClient(fr0 fr0Var) {
        fr0Var.getClass();
        this.currentHandler = -1;
        setFragment(fr0Var);
    }

    public final LoginMethodHandler[] getHandlersToTry() {
        return this.handlersToTry;
    }
}
