package com.facebook.login;

import android.app.Activity;
import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookActivity;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphResponse;
import com.facebook.LoginStatusCallback;
import com.facebook.Profile;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CustomTabUtils;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.PlatformServiceClient;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.login.FBLoginSSOLauncher;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginManager;
import defpackage.b4;
import defpackage.ch2;
import defpackage.ey;
import defpackage.fa0;
import defpackage.fr0;
import defpackage.kr0;
import defpackage.m4;
import defpackage.oi;
import defpackage.q40;
import defpackage.t50;
import defpackage.tp2;
import defpackage.u3;
import defpackage.v50;
import defpackage.w20;
import defpackage.w3;
import defpackage.zv;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class LoginManager {
    public static final Companion Companion;
    private static final String EXPRESS_LOGIN_ALLOWED = "express_login_allowed";
    private static final String MANAGE_PERMISSION_PREFIX = "manage";
    private static final Set<String> OTHER_PUBLISH_PERMISSIONS;
    private static final String PREFERENCE_LOGIN_MANAGER = "com.facebook.loginManager";
    private static final String PUBLISH_PERMISSION_PREFIX = "publish";
    private static final String TAG;
    private static volatile LoginManager instance;
    private boolean isFamilyLogin;
    private String messengerPageId;
    private boolean resetMessengerState;
    private final SharedPreferences sharedPreferences;
    private boolean shouldSkipAccountDeduplication;
    private LoginBehavior loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;
    private DefaultAudience defaultAudience = DefaultAudience.FRIENDS;
    private String authType = ServerProtocol.DIALOG_REREQUEST_AUTH_TYPE;
    private LoginTargetApp loginTargetApp = LoginTargetApp.FACEBOOK;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class ActivityStartActivityDelegate implements StartActivityDelegate {
        private final Activity activityContext;

        public ActivityStartActivityDelegate(Activity activity) {
            activity.getClass();
            this.activityContext = activity;
        }

        @Override // com.facebook.login.StartActivityDelegate
        public Activity getActivityContext() {
            return this.activityContext;
        }

        @Override // com.facebook.login.StartActivityDelegate
        public void startActivityForResult(Intent intent, int i) {
            intent.getClass();
            getActivityContext().startActivityForResult(intent, i);
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class AndroidxActivityResultRegistryOwnerStartActivityDelegate implements StartActivityDelegate {
        private final m4 activityResultRegistryOwner;
        private final CallbackManager callbackManager;

        public AndroidxActivityResultRegistryOwnerStartActivityDelegate(m4 m4Var, CallbackManager callbackManager) {
            m4Var.getClass();
            callbackManager.getClass();
            this.activityResultRegistryOwner = m4Var;
            this.callbackManager = callbackManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void startActivityForResult$lambda$0(AndroidxActivityResultRegistryOwnerStartActivityDelegate androidxActivityResultRegistryOwnerStartActivityDelegate, LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder, Pair pair) {
            androidxActivityResultRegistryOwnerStartActivityDelegate.getClass();
            loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder.getClass();
            CallbackManager callbackManager = androidxActivityResultRegistryOwnerStartActivityDelegate.callbackManager;
            int requestCode = CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
            Object obj = pair.first;
            obj.getClass();
            callbackManager.onActivityResult(requestCode, ((Number) obj).intValue(), (Intent) pair.second);
            b4 launcher = loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder.getLauncher();
            if (launcher != null) {
                launcher.c();
            }
            loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder.setLauncher(null);
        }

        @Override // com.facebook.login.StartActivityDelegate
        public Activity getActivityContext() {
            Object obj = this.activityResultRegistryOwner;
            if (obj instanceof Activity) {
                return (Activity) obj;
            }
            return null;
        }

        @Override // com.facebook.login.StartActivityDelegate
        public void startActivityForResult(Intent intent, int i) {
            intent.getClass();
            final LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder = new LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder();
            loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder.setLauncher(this.activityResultRegistryOwner.getActivityResultRegistry().c("facebook-login", new w3() { // from class: com.facebook.login.LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$1
                @Override // defpackage.w3
                public Intent createIntent(Context context, Intent intent2) {
                    context.getClass();
                    intent2.getClass();
                    return intent2;
                }

                @Override // defpackage.w3
                public Pair<Integer, Intent> parseResult(int i2, Intent intent2) {
                    Pair<Integer, Intent> create = Pair.create(Integer.valueOf(i2), intent2);
                    create.getClass();
                    return create;
                }
            }, new u3() { // from class: com.facebook.login.b
                @Override // defpackage.u3
                public final void a(Object obj) {
                    LoginManager.AndroidxActivityResultRegistryOwnerStartActivityDelegate.startActivityForResult$lambda$0(LoginManager.AndroidxActivityResultRegistryOwnerStartActivityDelegate.this, loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder, (Pair) obj);
                }
            }));
            b4 launcher = loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder.getLauncher();
            if (launcher != null) {
                launcher.b(intent);
            }
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class FragmentStartActivityDelegate implements StartActivityDelegate {
        private final Activity activityContext;
        private final FragmentWrapper fragment;

        public FragmentStartActivityDelegate(FragmentWrapper fragmentWrapper) {
            fragmentWrapper.getClass();
            this.fragment = fragmentWrapper;
            this.activityContext = fragmentWrapper.getActivity();
        }

        @Override // com.facebook.login.StartActivityDelegate
        public Activity getActivityContext() {
            return this.activityContext;
        }

        @Override // com.facebook.login.StartActivityDelegate
        public void startActivityForResult(Intent intent, int i) {
            intent.getClass();
            this.fragment.startActivityForResult(intent, i);
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class LoginLoggerHolder {
        public static final LoginLoggerHolder INSTANCE = new LoginLoggerHolder();
        private static LoginLogger logger;

        private LoginLoggerHolder() {
        }

        public final synchronized LoginLogger getLogger(Context context) {
            if (context == null) {
                context = FacebookSdk.getApplicationContext();
            }
            if (context == null) {
                return null;
            }
            if (logger == null) {
                logger = new LoginLogger(context, FacebookSdk.getApplicationId());
            }
            return logger;
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        OTHER_PUBLISH_PERMISSIONS = companion.getOtherPublishPermissions();
        String cls = LoginManager.class.toString();
        cls.getClass();
        TAG = cls;
    }

    public LoginManager() {
        Validate.sdkInitialized();
        SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences(PREFERENCE_LOGIN_MANAGER, 0);
        sharedPreferences.getClass();
        this.sharedPreferences = sharedPreferences;
        if (!FacebookSdk.hasCustomTabsPrefetching || CustomTabUtils.getChromePackage() == null) {
            return;
        }
        v50.a(FacebookSdk.getApplicationContext(), "com.android.chrome", new CustomTabPrefetchHelper());
        Context applicationContext = FacebookSdk.getApplicationContext();
        String packageName = FacebookSdk.getApplicationContext().getPackageName();
        if (packageName == null) {
            return;
        }
        Context applicationContext2 = applicationContext.getApplicationContext();
        try {
            v50.a(applicationContext2, packageName, new t50(applicationContext2));
        } catch (SecurityException unused) {
        }
    }

    public static final LoginResult computeLoginResult(LoginClient.Request request, AccessToken accessToken, AuthenticationToken authenticationToken) {
        return Companion.computeLoginResult(request, accessToken, authenticationToken);
    }

    public static /* synthetic */ FacebookLoginActivityResultContract createLogInActivityResultContract$default(LoginManager loginManager, CallbackManager callbackManager, String str, int i, Object obj) {
        if (obj != null) {
            ch2.h("Super calls with default arguments not supported in this target, function: createLogInActivityResultContract");
            return null;
        }
        if ((i & 1) != 0) {
            callbackManager = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return loginManager.createLogInActivityResultContract(callbackManager, str);
    }

    private final LoginClient.Request createLoginRequestFromResponse(GraphResponse graphResponse) {
        Set<String> permissions;
        AccessToken accessToken = graphResponse.getRequest().getAccessToken();
        return createLoginRequest((accessToken == null || (permissions = accessToken.getPermissions()) == null) ? null : zv.s(permissions));
    }

    private final void finishLogin(AccessToken accessToken, AuthenticationToken authenticationToken, LoginClient.Request request, FacebookException facebookException, boolean z, FacebookCallback<LoginResult> facebookCallback) {
        if (accessToken != null) {
            AccessToken.Companion.setCurrentAccessToken(accessToken);
            Profile.Companion.fetchProfileForCurrentAccessToken();
        }
        if (authenticationToken != null) {
            AuthenticationToken.Companion.setCurrentAuthenticationToken(authenticationToken);
        }
        if (facebookCallback != null) {
            LoginResult computeLoginResult = (accessToken == null || request == null) ? null : Companion.computeLoginResult(request, accessToken, authenticationToken);
            if (z || (computeLoginResult != null && computeLoginResult.getRecentlyGrantedPermissions().isEmpty())) {
                facebookCallback.onCancel();
                return;
            }
            if (facebookException != null) {
                facebookCallback.onError(facebookException);
            } else {
                if (accessToken == null || computeLoginResult == null) {
                    return;
                }
                setExpressLoginStatus(true);
                facebookCallback.onSuccess(computeLoginResult);
            }
        }
    }

    public static final Map<String, String> getExtraDataFromIntent(Intent intent) {
        return Companion.getExtraDataFromIntent(intent);
    }

    public static LoginManager getInstance() {
        return Companion.getInstance();
    }

    private final boolean isExpressLoginAllowed() {
        return this.sharedPreferences.getBoolean(EXPRESS_LOGIN_ALLOWED, true);
    }

    public static final boolean isPublishPermission(String str) {
        return Companion.isPublishPermission(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logCompleteLogin(Context context, LoginClient.Result.Code code, Map<String, String> map, Exception exc, boolean z, LoginClient.Request request) {
        LoginLogger logger = LoginLoggerHolder.INSTANCE.getLogger(context);
        if (logger == null) {
            return;
        }
        if (request == null) {
            LoginLogger.logUnexpectedError$default(logger, LoginLogger.EVENT_NAME_LOGIN_COMPLETE, "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", null, 4, null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(LoginLogger.EVENT_EXTRAS_TRY_LOGIN_ACTIVITY, z ? AppEventsConstants.EVENT_PARAM_VALUE_YES : AppEventsConstants.EVENT_PARAM_VALUE_NO);
        hashMap.put(LoginLogger.EVENT_EXTRAS_FROM_SSO, "false");
        logger.logCompleteLogin(request.getAuthId(), hashMap, code, map, exc, request.isFamilyLogin() ? LoginLogger.EVENT_NAME_FOA_LOGIN_COMPLETE : LoginLogger.EVENT_NAME_LOGIN_COMPLETE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logStartLogin(Context context, LoginClient.Request request) {
        LoginLogger logger = LoginLoggerHolder.INSTANCE.getLogger(context);
        if (logger == null || request == null) {
            return;
        }
        logger.logStartLogin(request, request.isFamilyLogin() ? LoginLogger.EVENT_NAME_FOA_LOGIN_START : LoginLogger.EVENT_NAME_LOGIN_START);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean onActivityResult$default(LoginManager loginManager, int i, Intent intent, FacebookCallback facebookCallback, int i2, Object obj) {
        if (obj != null) {
            ch2.h("Super calls with default arguments not supported in this target, function: onActivityResult");
            return false;
        }
        if ((i2 & 4) != 0) {
            facebookCallback = null;
        }
        return loginManager.onActivityResult(i, intent, facebookCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean registerCallback$lambda$0(LoginManager loginManager, FacebookCallback facebookCallback, int i, Intent intent) {
        loginManager.getClass();
        return loginManager.onActivityResult(i, intent, facebookCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean resolveIntent(Intent intent) {
        return FacebookSdk.getApplicationContext().getPackageManager().resolveActivity(intent, 0) != null;
    }

    private final void retrieveLoginStatusImpl(Context context, final LoginStatusCallback loginStatusCallback, long j) {
        final String applicationId = FacebookSdk.getApplicationId();
        String redirectURI = FacebookSdk.getRedirectURI();
        final String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        final LoginLogger loginLogger = new LoginLogger(context == null ? FacebookSdk.getApplicationContext() : context, applicationId);
        if (!isExpressLoginAllowed()) {
            loginLogger.logLoginStatusFailure(uuid);
            loginStatusCallback.onFailure();
            return;
        }
        if (redirectURI == null) {
            loginLogger.logLoginStatusFailure(uuid);
            loginStatusCallback.onFailure();
            return;
        }
        LoginStatusClient newInstance$facebook_common_release = LoginStatusClient.Companion.newInstance$facebook_common_release(context, applicationId, redirectURI, uuid, FacebookSdk.getGraphApiVersion(), j, null);
        newInstance$facebook_common_release.setCompletedListener(new PlatformServiceClient.CompletedListener() { // from class: hg1
            @Override // com.facebook.internal.PlatformServiceClient.CompletedListener
            public final void completed(Bundle bundle) {
                LoginManager.retrieveLoginStatusImpl$lambda$4(uuid, loginLogger, loginStatusCallback, applicationId, bundle);
            }
        });
        loginLogger.logLoginStatusStart(uuid);
        if (newInstance$facebook_common_release.start()) {
            return;
        }
        loginLogger.logLoginStatusFailure(uuid);
        loginStatusCallback.onFailure();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void retrieveLoginStatusImpl$lambda$4(String str, LoginLogger loginLogger, LoginStatusCallback loginStatusCallback, String str2, Bundle bundle) {
        str.getClass();
        loginLogger.getClass();
        loginStatusCallback.getClass();
        str2.getClass();
        if (bundle == null) {
            loginLogger.logLoginStatusFailure(str);
            loginStatusCallback.onFailure();
            return;
        }
        String string = bundle.getString(NativeProtocol.STATUS_ERROR_TYPE);
        String string2 = bundle.getString(NativeProtocol.STATUS_ERROR_DESCRIPTION);
        if (string != null) {
            Companion.handleLoginStatusError(string, string2, str, loginLogger, loginStatusCallback);
            return;
        }
        String string3 = bundle.getString(NativeProtocol.EXTRA_ACCESS_TOKEN);
        Date bundleLongAsDate = Utility.getBundleLongAsDate(bundle, NativeProtocol.EXTRA_EXPIRES_SECONDS_SINCE_EPOCH, new Date(0L));
        ArrayList<String> stringArrayList = bundle.getStringArrayList(NativeProtocol.EXTRA_PERMISSIONS);
        String string4 = bundle.getString(NativeProtocol.RESULT_ARGS_SIGNED_REQUEST);
        String string5 = bundle.getString("graph_domain");
        Date bundleLongAsDate2 = Utility.getBundleLongAsDate(bundle, NativeProtocol.EXTRA_DATA_ACCESS_EXPIRATION_TIME, new Date(0L));
        String userIDFromSignedRequest = (string4 == null || string4.length() == 0) ? null : LoginMethodHandler.Companion.getUserIDFromSignedRequest(string4);
        if (string3 == null || string3.length() == 0 || stringArrayList == null || stringArrayList.isEmpty() || userIDFromSignedRequest == null || userIDFromSignedRequest.length() == 0) {
            loginLogger.logLoginStatusFailure(str);
            loginStatusCallback.onFailure();
            return;
        }
        AccessToken accessToken = new AccessToken(string3, str2, userIDFromSignedRequest, stringArrayList, null, null, null, bundleLongAsDate, null, bundleLongAsDate2, string5);
        AccessToken.Companion.setCurrentAccessToken(accessToken);
        Profile.Companion.fetchProfileForCurrentAccessToken();
        loginLogger.logLoginStatusSuccess(str);
        loginStatusCallback.onCompleted(accessToken);
    }

    private final void setExpressLoginStatus(boolean z) {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putBoolean(EXPRESS_LOGIN_ALLOWED, z);
        edit.apply();
    }

    private final void startLogin(StartActivityDelegate startActivityDelegate, LoginClient.Request request) {
        logStartLogin(startActivityDelegate.getActivityContext(), request);
        Utility.logd(TAG, "auth_logger_id: " + request.getAuthId());
        CallbackManagerImpl.Companion.registerStaticCallback(CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode(), new CallbackManagerImpl.Callback() { // from class: ig1
            @Override // com.facebook.internal.CallbackManagerImpl.Callback
            public final boolean onActivityResult(int i, Intent intent) {
                boolean startLogin$lambda$3;
                startLogin$lambda$3 = LoginManager.startLogin$lambda$3(LoginManager.this, i, intent);
                return startLogin$lambda$3;
            }
        });
        if (tryFacebookActivity(startActivityDelegate, request)) {
            return;
        }
        FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        logCompleteLogin(startActivityDelegate.getActivityContext(), LoginClient.Result.Code.ERROR, null, facebookException, false, request);
        throw facebookException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean startLogin$lambda$3(LoginManager loginManager, int i, Intent intent) {
        loginManager.getClass();
        return onActivityResult$default(loginManager, i, intent, null, 4, null);
    }

    public static /* synthetic */ void startLoginWithForceConfirmation$facebook_common_release$default(LoginManager loginManager, Activity activity, Collection collection, String str, String str2, int i, Object obj) {
        if (obj != null) {
            ch2.h("Super calls with default arguments not supported in this target, function: startLoginWithForceConfirmation");
            return;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        loginManager.startLoginWithForceConfirmation$facebook_common_release(activity, collection, str, str2);
    }

    private final boolean tryFacebookActivity(StartActivityDelegate startActivityDelegate, LoginClient.Request request) {
        Intent facebookActivityIntent = getFacebookActivityIntent(request);
        if (!resolveIntent(facebookActivityIntent)) {
            return false;
        }
        try {
            startActivityDelegate.startActivityForResult(facebookActivityIntent, LoginClient.Companion.getLoginRequestCode());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    private final void validatePublishPermissions(Collection<String> collection) {
        if (collection == null) {
            return;
        }
        for (String str : collection) {
            if (!Companion.isPublishPermission(str)) {
                throw new FacebookException(q40.m("Cannot pass a read permission (", str, ") to a request for publish authorization"));
            }
        }
    }

    private final void validateReadPermissions(Collection<String> collection) {
        if (collection == null) {
            return;
        }
        for (String str : collection) {
            if (Companion.isPublishPermission(str)) {
                throw new FacebookException(q40.m("Cannot pass a publish or manage permission (", str, ") to a request for read authorization"));
            }
        }
    }

    public final FacebookLoginActivityResultContract createLogInActivityResultContract() {
        return createLogInActivityResultContract$default(this, null, null, 3, null);
    }

    public LoginClient.Request createLoginRequest(Collection<String> collection) {
        LoginBehavior loginBehavior = this.loginBehavior;
        Set Q = collection != null ? zv.Q(collection) : null;
        DefaultAudience defaultAudience = this.defaultAudience;
        String str = this.authType;
        String applicationId = FacebookSdk.getApplicationId();
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        LoginClient.Request request = new LoginClient.Request(loginBehavior, Q, defaultAudience, str, applicationId, uuid, this.loginTargetApp, null, null, null, null, FacebookSdk.getRedirectURI().toString(), FacebookSdk.getIntentUriPackageTarget(), 1920, null);
        request.setRerequest(AccessToken.Companion.isCurrentAccessTokenActive());
        request.setMessengerPageId(this.messengerPageId);
        request.setResetMessengerState(this.resetMessengerState);
        request.setFamilyLogin(this.isFamilyLogin);
        request.setShouldSkipAccountDeduplication(this.shouldSkipAccountDeduplication);
        FBLoginSSOLauncher.Companion companion = FBLoginSSOLauncher.Companion;
        String pendingSsoContext = companion.getPendingSsoContext();
        if (pendingSsoContext != null) {
            request.setAndroidSsoContext(pendingSsoContext);
            companion.setPendingSsoContext$facebook_common_release(null);
        }
        return request;
    }

    public LoginClient.Request createLoginRequestWithConfig(LoginConfiguration loginConfiguration) {
        String codeVerifier;
        loginConfiguration.getClass();
        CodeChallengeMethod codeChallengeMethod = CodeChallengeMethod.S256;
        try {
            codeVerifier = PKCEUtil.generateCodeChallenge(loginConfiguration.getCodeVerifier(), codeChallengeMethod);
        } catch (FacebookException unused) {
            codeChallengeMethod = CodeChallengeMethod.PLAIN;
            codeVerifier = loginConfiguration.getCodeVerifier();
        }
        CodeChallengeMethod codeChallengeMethod2 = codeChallengeMethod;
        String str = codeVerifier;
        LoginBehavior loginBehavior = this.loginBehavior;
        Set Q = zv.Q(loginConfiguration.getPermissions());
        DefaultAudience defaultAudience = this.defaultAudience;
        String str2 = this.authType;
        String applicationId = FacebookSdk.getApplicationId();
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        LoginClient.Request request = new LoginClient.Request(loginBehavior, Q, defaultAudience, str2, applicationId, uuid, this.loginTargetApp, loginConfiguration.getNonce(), loginConfiguration.getCodeVerifier(), str, codeChallengeMethod2, FacebookSdk.getRedirectURI(), FacebookSdk.getIntentUriPackageTarget());
        request.setRerequest(AccessToken.Companion.isCurrentAccessTokenActive());
        request.setMessengerPageId(this.messengerPageId);
        request.setResetMessengerState(this.resetMessengerState);
        request.setFamilyLogin(this.isFamilyLogin);
        request.setShouldSkipAccountDeduplication(this.shouldSkipAccountDeduplication);
        FBLoginSSOLauncher.Companion companion = FBLoginSSOLauncher.Companion;
        String pendingSsoContext = companion.getPendingSsoContext();
        if (pendingSsoContext != null) {
            request.setAndroidSsoContext(pendingSsoContext);
            companion.setPendingSsoContext$facebook_common_release(null);
        }
        return request;
    }

    public LoginClient.Request createReauthorizeRequest() {
        LoginBehavior loginBehavior = LoginBehavior.DIALOG_ONLY;
        HashSet hashSet = new HashSet();
        DefaultAudience defaultAudience = this.defaultAudience;
        String applicationId = FacebookSdk.getApplicationId();
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        LoginClient.Request request = new LoginClient.Request(loginBehavior, hashSet, defaultAudience, "reauthorize", applicationId, uuid, this.loginTargetApp, null, null, null, null, FacebookSdk.getRedirectURI().toString(), FacebookSdk.getIntentUriPackageTarget(), 1920, null);
        request.setFamilyLogin(this.isFamilyLogin);
        request.setShouldSkipAccountDeduplication(this.shouldSkipAccountDeduplication);
        return request;
    }

    public final String getAuthType() {
        return this.authType;
    }

    public final DefaultAudience getDefaultAudience() {
        return this.defaultAudience;
    }

    public Intent getFacebookActivityIntent(LoginClient.Request request) {
        request.getClass();
        Intent intent = new Intent();
        intent.setClass(FacebookSdk.getApplicationContext(), FacebookActivity.class);
        intent.setAction(request.getLoginBehavior().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra(LoginFragment.REQUEST_KEY, bundle);
        return intent;
    }

    public final LoginBehavior getLoginBehavior() {
        return this.loginBehavior;
    }

    public final LoginTargetApp getLoginTargetApp() {
        return this.loginTargetApp;
    }

    public final boolean getShouldSkipAccountDeduplication() {
        return this.shouldSkipAccountDeduplication;
    }

    public final boolean isFamilyLogin() {
        return this.isFamilyLogin;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void logIn(m4 m4Var, CallbackManager callbackManager, Collection<String> collection, String str) {
        m4Var.getClass();
        callbackManager.getClass();
        collection.getClass();
        LoginClient.Request createLoginRequestWithConfig = createLoginRequestWithConfig(new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0));
        if (str != null) {
            createLoginRequestWithConfig.setAuthId(str);
        }
        startLogin(new AndroidxActivityResultRegistryOwnerStartActivityDelegate(m4Var, callbackManager), createLoginRequestWithConfig);
    }

    public final void logInWithConfiguration(fr0 fr0Var, LoginConfiguration loginConfiguration) {
        fr0Var.getClass();
        loginConfiguration.getClass();
        loginWithConfiguration(new FragmentWrapper(fr0Var), loginConfiguration);
    }

    public final void logInWithPublishPermissions(fr0 fr0Var, CallbackManager callbackManager, Collection<String> collection) {
        fr0Var.getClass();
        callbackManager.getClass();
        collection.getClass();
        kr0 activity = fr0Var.getActivity();
        if (activity != null) {
            logInWithPublishPermissions(activity, callbackManager, collection);
        } else {
            throw new FacebookException("Cannot obtain activity context on the fragment " + fr0Var);
        }
    }

    public final void logInWithReadPermissions(fr0 fr0Var, CallbackManager callbackManager, Collection<String> collection) {
        fr0Var.getClass();
        callbackManager.getClass();
        collection.getClass();
        kr0 activity = fr0Var.getActivity();
        if (activity != null) {
            logInWithReadPermissions(activity, callbackManager, collection);
        } else {
            throw new FacebookException("Cannot obtain activity context on the fragment " + fr0Var);
        }
    }

    public void logOut() {
        AccessToken.Companion.setCurrentAccessToken(null);
        AuthenticationToken.Companion.setCurrentAuthenticationToken(null);
        Profile.Companion.setCurrentProfile(null);
        setExpressLoginStatus(false);
    }

    public final void loginWithConfiguration(Activity activity, LoginConfiguration loginConfiguration) {
        activity.getClass();
        loginConfiguration.getClass();
        logIn(activity, loginConfiguration);
    }

    public boolean onActivityResult(int i, Intent intent, FacebookCallback<LoginResult> facebookCallback) {
        LoginClient.Result.Code code;
        boolean z;
        AccessToken accessToken;
        AuthenticationToken authenticationToken;
        Map<String, String> map;
        LoginClient.Request request;
        AuthenticationToken authenticationToken2;
        LoginClient.Result.Code code2 = LoginClient.Result.Code.ERROR;
        FacebookException facebookException = null;
        if (intent != null) {
            intent.setExtrasClassLoader(LoginClient.Result.class.getClassLoader());
            LoginClient.Result result = (LoginClient.Result) intent.getParcelableExtra(LoginFragment.RESULT_KEY);
            if (result != null) {
                LoginClient.Request request2 = result.request;
                LoginClient.Result.Code code3 = result.code;
                if (i != -1) {
                    r5 = i == 0;
                    accessToken = null;
                    authenticationToken2 = null;
                } else if (code3 == LoginClient.Result.Code.SUCCESS) {
                    accessToken = result.token;
                    authenticationToken2 = result.authenticationToken;
                } else {
                    authenticationToken2 = null;
                    facebookException = new FacebookAuthorizationException(result.errorMessage);
                    accessToken = null;
                }
                map = result.loggingExtras;
                request = request2;
                z = r5;
                authenticationToken = authenticationToken2;
                code = code3;
            }
            code = code2;
            accessToken = null;
            authenticationToken = null;
            map = null;
            request = null;
            z = false;
        } else {
            if (i == 0) {
                code = LoginClient.Result.Code.CANCEL;
                z = true;
                accessToken = null;
                authenticationToken = null;
                map = null;
                request = null;
            }
            code = code2;
            accessToken = null;
            authenticationToken = null;
            map = null;
            request = null;
            z = false;
        }
        if (facebookException == null && accessToken == null && !z) {
            facebookException = new FacebookException("Unexpected call to LoginManager.onActivityResult");
        }
        FacebookException facebookException2 = facebookException;
        logCompleteLogin(null, code, map, facebookException2, true, request);
        finishLogin(accessToken, authenticationToken, request, facebookException2, z, facebookCallback);
        return true;
    }

    public final void reauthorizeDataAccess(Activity activity) {
        activity.getClass();
        startLogin(new ActivityStartActivityDelegate(activity), createReauthorizeRequest());
    }

    public final void registerCallback(CallbackManager callbackManager, FacebookCallback<LoginResult> facebookCallback) {
        if (callbackManager instanceof CallbackManagerImpl) {
            ((CallbackManagerImpl) callbackManager).registerCallback(CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode(), new w20(3, this, facebookCallback));
        } else {
            ey.i("Unexpected CallbackManager, please use the provided Factory.");
        }
    }

    public final void resolveError(fr0 fr0Var, CallbackManager callbackManager, GraphResponse graphResponse) {
        fr0Var.getClass();
        callbackManager.getClass();
        graphResponse.getClass();
        kr0 activity = fr0Var.getActivity();
        if (activity != null) {
            resolveError(activity, callbackManager, graphResponse);
        } else {
            throw new FacebookException("Cannot obtain activity context on the fragment " + fr0Var);
        }
    }

    public final void retrieveLoginStatus(Context context, LoginStatusCallback loginStatusCallback) {
        context.getClass();
        loginStatusCallback.getClass();
        retrieveLoginStatus(context, 5000L, loginStatusCallback);
    }

    public final LoginManager setAuthType(String str) {
        str.getClass();
        this.authType = str;
        return this;
    }

    public final LoginManager setDefaultAudience(DefaultAudience defaultAudience) {
        defaultAudience.getClass();
        this.defaultAudience = defaultAudience;
        return this;
    }

    public final LoginManager setFamilyLogin(boolean z) {
        this.isFamilyLogin = z;
        return this;
    }

    public final LoginManager setLoginBehavior(LoginBehavior loginBehavior) {
        loginBehavior.getClass();
        this.loginBehavior = loginBehavior;
        return this;
    }

    public final LoginManager setLoginTargetApp(LoginTargetApp loginTargetApp) {
        loginTargetApp.getClass();
        this.loginTargetApp = loginTargetApp;
        return this;
    }

    public final LoginManager setMessengerPageId(String str) {
        this.messengerPageId = str;
        return this;
    }

    public final LoginManager setResetMessengerState(boolean z) {
        this.resetMessengerState = z;
        return this;
    }

    public final LoginManager setShouldSkipAccountDeduplication(boolean z) {
        this.shouldSkipAccountDeduplication = z;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void startLoginWithForceConfirmation$facebook_common_release(Activity activity, Collection<String> collection, String str, String str2) {
        activity.getClass();
        collection.getClass();
        LoginClient.Request createLoginRequestWithConfig = createLoginRequestWithConfig(new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0));
        createLoginRequestWithConfig.setForceConfirmation(true);
        if (str != null) {
            createLoginRequestWithConfig.setAndroidSsoContext(str);
        }
        if (str2 != null) {
            createLoginRequestWithConfig.setAuthId(str2);
        }
        startLogin(new ActivityStartActivityDelegate(activity), createLoginRequestWithConfig);
    }

    public final void unregisterCallback(CallbackManager callbackManager) {
        if (callbackManager instanceof CallbackManagerImpl) {
            ((CallbackManagerImpl) callbackManager).unregisterCallback(CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode());
        } else {
            ey.i("Unexpected CallbackManager, please use the provided Factory.");
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set<String> getOtherPublishPermissions() {
            return oi.z(new String[]{"ads_management", "create_event", "rsvp_event"});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void handleLoginStatusError(String str, String str2, String str3, LoginLogger loginLogger, LoginStatusCallback loginStatusCallback) {
            FacebookException facebookException = new FacebookException(str + ": " + str2);
            loginLogger.logLoginStatusError(str3, facebookException);
            loginStatusCallback.onError(facebookException);
        }

        public final LoginResult computeLoginResult(LoginClient.Request request, AccessToken accessToken, AuthenticationToken authenticationToken) {
            request.getClass();
            accessToken.getClass();
            Set<String> permissions = request.getPermissions();
            Set P = zv.P(zv.s(accessToken.getPermissions()));
            if (request.isRerequest()) {
                P.retainAll(permissions);
            }
            Set P2 = zv.P(zv.s(permissions));
            P2.removeAll(P);
            return new LoginResult(accessToken, authenticationToken, P, P2);
        }

        public final Map<String, String> getExtraDataFromIntent(Intent intent) {
            if (intent == null) {
                return null;
            }
            intent.setExtrasClassLoader(LoginClient.Result.class.getClassLoader());
            LoginClient.Result result = (LoginClient.Result) intent.getParcelableExtra(LoginFragment.RESULT_KEY);
            if (result == null) {
                return null;
            }
            return result.extraData;
        }

        public LoginManager getInstance() {
            if (LoginManager.instance == null) {
                synchronized (this) {
                    LoginManager.instance = new LoginManager();
                    Unit unit = Unit.a;
                }
            }
            LoginManager loginManager = LoginManager.instance;
            if (loginManager != null) {
                return loginManager;
            }
            Intrinsics.f("instance");
            throw null;
        }

        public final boolean isPublishPermission(String str) {
            if (str != null) {
                return tp2.o(str, LoginManager.PUBLISH_PERMISSION_PREFIX, false) || tp2.o(str, LoginManager.MANAGE_PERMISSION_PREFIX, false) || LoginManager.OTHER_PUBLISH_PERMISSIONS.contains(str);
            }
            return false;
        }

        private Companion() {
        }
    }

    public final FacebookLoginActivityResultContract createLogInActivityResultContract(CallbackManager callbackManager) {
        return createLogInActivityResultContract$default(this, callbackManager, null, 2, null);
    }

    public final FacebookLoginActivityResultContract createLogInActivityResultContract(CallbackManager callbackManager, String str) {
        return new FacebookLoginActivityResultContract(callbackManager, str);
    }

    private final void loginWithConfiguration(FragmentWrapper fragmentWrapper, LoginConfiguration loginConfiguration) {
        logIn(fragmentWrapper, loginConfiguration);
    }

    public final void retrieveLoginStatus(Context context, long j, LoginStatusCallback loginStatusCallback) {
        context.getClass();
        loginStatusCallback.getClass();
        retrieveLoginStatusImpl(context, loginStatusCallback, j);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public final class FacebookLoginActivityResultContract extends w3 {
        private CallbackManager callbackManager;
        private String loggerID;

        public /* synthetic */ FacebookLoginActivityResultContract(LoginManager loginManager, CallbackManager callbackManager, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : callbackManager, (i & 2) != 0 ? null : str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.w3
        public Intent createIntent(Context context, Collection<String> collection) {
            context.getClass();
            collection.getClass();
            LoginClient.Request createLoginRequestWithConfig = LoginManager.this.createLoginRequestWithConfig(new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0));
            String str = this.loggerID;
            if (str != null) {
                createLoginRequestWithConfig.setAuthId(str);
            }
            LoginManager.this.logStartLogin(context, createLoginRequestWithConfig);
            Intent facebookActivityIntent = LoginManager.this.getFacebookActivityIntent(createLoginRequestWithConfig);
            if (LoginManager.this.resolveIntent(facebookActivityIntent)) {
                return facebookActivityIntent;
            }
            FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            LoginManager.this.logCompleteLogin(context, LoginClient.Result.Code.ERROR, null, facebookException, false, createLoginRequestWithConfig);
            throw facebookException;
        }

        public final CallbackManager getCallbackManager() {
            return this.callbackManager;
        }

        public final String getLoggerID() {
            return this.loggerID;
        }

        @Override // defpackage.w3
        public CallbackManager.ActivityResultParameters parseResult(int i, Intent intent) {
            LoginManager.onActivityResult$default(LoginManager.this, i, intent, null, 4, null);
            int requestCode = CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
            CallbackManager callbackManager = this.callbackManager;
            if (callbackManager != null) {
                callbackManager.onActivityResult(requestCode, i, intent);
            }
            return new CallbackManager.ActivityResultParameters(requestCode, i, intent);
        }

        public final void setCallbackManager(CallbackManager callbackManager) {
            this.callbackManager = callbackManager;
        }

        public final void setLoggerID(String str) {
            this.loggerID = str;
        }

        public FacebookLoginActivityResultContract(CallbackManager callbackManager, String str) {
            this.callbackManager = callbackManager;
            this.loggerID = str;
        }
    }

    public final void reauthorizeDataAccess(fr0 fr0Var) {
        fr0Var.getClass();
        reauthorizeDataAccess(new FragmentWrapper(fr0Var));
    }

    private final void reauthorizeDataAccess(FragmentWrapper fragmentWrapper) {
        startLogin(new FragmentStartActivityDelegate(fragmentWrapper), createReauthorizeRequest());
    }

    public final void logIn(fr0 fr0Var, Collection<String> collection, String str) {
        fr0Var.getClass();
        logIn(new FragmentWrapper(fr0Var), collection, str);
    }

    public final void logIn(Fragment fragment, Collection<String> collection) {
        fragment.getClass();
        logIn(new FragmentWrapper(fragment), collection);
    }

    public final void logIn(Fragment fragment, Collection<String> collection, String str) {
        fragment.getClass();
        logIn(new FragmentWrapper(fragment), collection, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void logIn(FragmentWrapper fragmentWrapper, Collection<String> collection) {
        fragmentWrapper.getClass();
        logIn(fragmentWrapper, new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void logIn(FragmentWrapper fragmentWrapper, Collection<String> collection, String str) {
        fragmentWrapper.getClass();
        LoginClient.Request createLoginRequestWithConfig = createLoginRequestWithConfig(new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0));
        if (str != null) {
            createLoginRequestWithConfig.setAuthId(str);
        }
        startLogin(new FragmentStartActivityDelegate(fragmentWrapper), createLoginRequestWithConfig);
    }

    @fa0
    public final void logInWithPublishPermissions(fr0 fr0Var, Collection<String> collection) {
        fr0Var.getClass();
        collection.getClass();
        logInWithPublishPermissions(new FragmentWrapper(fr0Var), collection);
    }

    @fa0
    public final void logInWithReadPermissions(fr0 fr0Var, Collection<String> collection) {
        fr0Var.getClass();
        collection.getClass();
        logInWithReadPermissions(new FragmentWrapper(fr0Var), collection);
    }

    @fa0
    public final void resolveError(fr0 fr0Var, GraphResponse graphResponse) {
        fr0Var.getClass();
        graphResponse.getClass();
        resolveError(new FragmentWrapper(fr0Var), graphResponse);
    }

    public final void logInWithPublishPermissions(Fragment fragment, Collection<String> collection) {
        fragment.getClass();
        collection.getClass();
        logInWithPublishPermissions(new FragmentWrapper(fragment), collection);
    }

    public final void logInWithReadPermissions(Fragment fragment, Collection<String> collection) {
        fragment.getClass();
        collection.getClass();
        logInWithReadPermissions(new FragmentWrapper(fragment), collection);
    }

    public final void resolveError(Activity activity, GraphResponse graphResponse) {
        activity.getClass();
        graphResponse.getClass();
        startLogin(new ActivityStartActivityDelegate(activity), createLoginRequestFromResponse(graphResponse));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void logInWithPublishPermissions(FragmentWrapper fragmentWrapper, Collection<String> collection) {
        validatePublishPermissions(collection);
        loginWithConfiguration(fragmentWrapper, new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void logInWithReadPermissions(FragmentWrapper fragmentWrapper, Collection<String> collection) {
        validateReadPermissions(collection);
        logIn(fragmentWrapper, new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0));
    }

    public final void resolveError(Fragment fragment, GraphResponse graphResponse) {
        fragment.getClass();
        graphResponse.getClass();
        resolveError(new FragmentWrapper(fragment), graphResponse);
    }

    private final void resolveError(FragmentWrapper fragmentWrapper, GraphResponse graphResponse) {
        startLogin(new FragmentStartActivityDelegate(fragmentWrapper), createLoginRequestFromResponse(graphResponse));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void logIn(Activity activity, Collection<String> collection) {
        activity.getClass();
        logIn(activity, new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0));
    }

    public final void resolveError(m4 m4Var, CallbackManager callbackManager, GraphResponse graphResponse) {
        m4Var.getClass();
        callbackManager.getClass();
        graphResponse.getClass();
        startLogin(new AndroidxActivityResultRegistryOwnerStartActivityDelegate(m4Var, callbackManager), createLoginRequestFromResponse(graphResponse));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void logInWithPublishPermissions(Activity activity, Collection<String> collection) {
        activity.getClass();
        validatePublishPermissions(collection);
        loginWithConfiguration(activity, new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void logInWithReadPermissions(Activity activity, Collection<String> collection) {
        activity.getClass();
        validateReadPermissions(collection);
        logIn(activity, new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0));
    }

    public final void logIn(FragmentWrapper fragmentWrapper, LoginConfiguration loginConfiguration) {
        fragmentWrapper.getClass();
        loginConfiguration.getClass();
        startLogin(new FragmentStartActivityDelegate(fragmentWrapper), createLoginRequestWithConfig(loginConfiguration));
    }

    public final void logIn(Activity activity, LoginConfiguration loginConfiguration) {
        activity.getClass();
        loginConfiguration.getClass();
        if (activity instanceof m4) {
            Log.w(TAG, "You're calling logging in Facebook with an activity supports androidx activity result APIs. Please follow our document to upgrade to new APIs to avoid overriding onActivityResult().");
        }
        startLogin(new ActivityStartActivityDelegate(activity), createLoginRequestWithConfig(loginConfiguration));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void logInWithPublishPermissions(m4 m4Var, CallbackManager callbackManager, Collection<String> collection) {
        m4Var.getClass();
        callbackManager.getClass();
        collection.getClass();
        validatePublishPermissions(collection);
        logIn(m4Var, callbackManager, new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void logInWithReadPermissions(m4 m4Var, CallbackManager callbackManager, Collection<String> collection) {
        m4Var.getClass();
        callbackManager.getClass();
        collection.getClass();
        validateReadPermissions(collection);
        logIn(m4Var, callbackManager, new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void logIn(Activity activity, Collection<String> collection, String str) {
        activity.getClass();
        LoginClient.Request createLoginRequestWithConfig = createLoginRequestWithConfig(new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0));
        if (str != null) {
            createLoginRequestWithConfig.setAuthId(str);
        }
        startLogin(new ActivityStartActivityDelegate(activity), createLoginRequestWithConfig);
    }

    private final void logIn(m4 m4Var, CallbackManager callbackManager, LoginConfiguration loginConfiguration) {
        startLogin(new AndroidxActivityResultRegistryOwnerStartActivityDelegate(m4Var, callbackManager), createLoginRequestWithConfig(loginConfiguration));
    }

    public final void logIn(fr0 fr0Var, Collection<String> collection) {
        fr0Var.getClass();
        logIn(new FragmentWrapper(fr0Var), collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void logIn(m4 m4Var, CallbackManager callbackManager, Collection<String> collection) {
        m4Var.getClass();
        callbackManager.getClass();
        collection.getClass();
        logIn(m4Var, callbackManager, new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0));
    }

    public final boolean onActivityResult(int i, Intent intent) {
        return onActivityResult$default(this, i, intent, null, 4, null);
    }
}
