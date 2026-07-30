package com.facebook.login.widget;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.CallbackManager;
import com.facebook.FacebookButtonBase;
import com.facebook.FacebookCallback;
import com.facebook.FacebookSdk;
import com.facebook.Profile;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginBehavior;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.LoginTargetApp;
import com.facebook.login.R;
import com.facebook.login.widget.ToolTipPopup;
import defpackage.ah0;
import defpackage.b4;
import defpackage.b71;
import defpackage.fa0;
import defpackage.fr0;
import defpackage.j8;
import defpackage.ka0;
import defpackage.m4;
import defpackage.oi;
import defpackage.q1;
import defpackage.w3;
import defpackage.y91;
import defpackage.ya1;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class LoginButton extends FacebookButtonBase {
    private static final int MAX_BUTTON_TRANSPARENCY = 255;
    private static final int MIN_BUTTON_TRANSPARENCY = 0;
    private AccessTokenTracker accessTokenTracker;
    private b4 androidXLoginCaller;
    private CallbackManager callbackManager;
    private boolean confirmLogout;
    private Float customButtonRadius;
    private int customButtonTransparency;
    private final String loggerID;
    private y91 loginManagerLazy;
    private String loginText;
    private String logoutText;
    private final LoginButtonProperties properties;
    private boolean toolTipChecked;
    private long toolTipDisplayTime;
    private ToolTipMode toolTipMode;
    private ToolTipPopup toolTipPopup;
    private ToolTipPopup.Style toolTipStyle;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = LoginButton.class.getName();

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static class LoginButtonProperties {
        private String messengerPageId;
        private boolean resetMessengerState;
        private boolean shouldSkipAccountDeduplication;
        private DefaultAudience defaultAudience = DefaultAudience.FRIENDS;
        private List<String> permissions = ah0.m;
        private LoginBehavior loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;
        private String authType = ServerProtocol.DIALOG_REREQUEST_AUTH_TYPE;
        private LoginTargetApp loginTargetApp = LoginTargetApp.FACEBOOK;

        public final void clearPermissions() {
            this.permissions = ah0.m;
        }

        public final String getAuthType() {
            return this.authType;
        }

        public final DefaultAudience getDefaultAudience() {
            return this.defaultAudience;
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

        public final List<String> getPermissions() {
            return this.permissions;
        }

        public final boolean getResetMessengerState() {
            return this.resetMessengerState;
        }

        public final boolean getShouldSkipAccountDeduplication() {
            return this.shouldSkipAccountDeduplication;
        }

        public final void setAuthType(String str) {
            str.getClass();
            this.authType = str;
        }

        public final void setDefaultAudience(DefaultAudience defaultAudience) {
            defaultAudience.getClass();
            this.defaultAudience = defaultAudience;
        }

        public final void setLoginBehavior(LoginBehavior loginBehavior) {
            loginBehavior.getClass();
            this.loginBehavior = loginBehavior;
        }

        public final void setLoginTargetApp(LoginTargetApp loginTargetApp) {
            loginTargetApp.getClass();
            this.loginTargetApp = loginTargetApp;
        }

        public final void setMessengerPageId(String str) {
            this.messengerPageId = str;
        }

        public final void setPermissions(List<String> list) {
            list.getClass();
            this.permissions = list;
        }

        public final void setResetMessengerState(boolean z) {
            this.resetMessengerState = z;
        }

        public final void setShouldSkipAccountDeduplication(boolean z) {
            this.shouldSkipAccountDeduplication = z;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public class LoginClickListener implements View.OnClickListener {
        public LoginClickListener() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void performLogout$lambda$2(LoginManager loginManager, DialogInterface dialogInterface, int i) {
            if (CrashShieldHandler.isObjectCrashing(LoginClickListener.class)) {
                return;
            }
            try {
                loginManager.getClass();
                loginManager.logOut();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, LoginClickListener.class);
            }
        }

        public LoginManager getLoginManager() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                LoginManager companion = LoginManager.Companion.getInstance();
                companion.setDefaultAudience(LoginButton.this.getDefaultAudience());
                companion.setLoginBehavior(LoginButton.this.getLoginBehavior());
                companion.setLoginTargetApp(getLoginTargetApp());
                companion.setAuthType(LoginButton.this.getAuthType());
                companion.setFamilyLogin(isFamilyLogin());
                companion.setShouldSkipAccountDeduplication(LoginButton.this.getShouldSkipAccountDeduplication());
                companion.setMessengerPageId(LoginButton.this.getMessengerPageId());
                companion.setResetMessengerState(LoginButton.this.getResetMessengerState());
                return companion;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }

        public final LoginTargetApp getLoginTargetApp() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                return LoginTargetApp.FACEBOOK;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }

        public final boolean isFamilyLogin() {
            CrashShieldHandler.isObjectCrashing(this);
            return false;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                if (CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    view.getClass();
                    LoginButton.this.callExternalOnClickListener(view);
                    AccessToken.Companion companion = AccessToken.Companion;
                    AccessToken currentAccessToken = companion.getCurrentAccessToken();
                    boolean isCurrentAccessTokenActive = companion.isCurrentAccessTokenActive();
                    if (isCurrentAccessTokenActive) {
                        Context context = LoginButton.this.getContext();
                        context.getClass();
                        performLogout(context);
                    } else {
                        performLogin();
                    }
                    InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(LoginButton.this.getContext());
                    Bundle bundle = new Bundle();
                    bundle.putInt("logging_in", currentAccessToken != null ? 0 : 1);
                    bundle.putInt("access_token_expired", isCurrentAccessTokenActive ? 1 : 0);
                    internalAppEventsLogger.logEventImplicitly(AnalyticsEvents.EVENT_LOGIN_VIEW_USAGE, bundle);
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            } catch (Throwable th2) {
                CrashShieldHandler.handleThrowable(th2, this);
            }
        }

        public final void performLogin() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                LoginManager loginManager = getLoginManager();
                b4 b4Var = LoginButton.this.androidXLoginCaller;
                if (b4Var != null) {
                    w3 a = b4Var.a();
                    a.getClass();
                    LoginManager.FacebookLoginActivityResultContract facebookLoginActivityResultContract = (LoginManager.FacebookLoginActivityResultContract) a;
                    CallbackManager callbackManager = LoginButton.this.getCallbackManager();
                    if (callbackManager == null) {
                        callbackManager = new CallbackManagerImpl();
                    }
                    facebookLoginActivityResultContract.setCallbackManager(callbackManager);
                    b4Var.b(LoginButton.this.getProperties().getPermissions());
                    return;
                }
                fr0 fragment = LoginButton.this.getFragment();
                LoginButton loginButton = LoginButton.this;
                if (fragment != null) {
                    fr0 fragment2 = loginButton.getFragment();
                    if (fragment2 != null) {
                        LoginButton loginButton2 = LoginButton.this;
                        loginManager.logIn(fragment2, loginButton2.getProperties().getPermissions(), loginButton2.getLoggerID());
                        return;
                    }
                    return;
                }
                Fragment nativeFragment = loginButton.getNativeFragment();
                LoginButton loginButton3 = LoginButton.this;
                if (nativeFragment == null) {
                    loginManager.logIn(loginButton3.getActivity(), LoginButton.this.getProperties().getPermissions(), LoginButton.this.getLoggerID());
                    return;
                }
                Fragment nativeFragment2 = loginButton3.getNativeFragment();
                if (nativeFragment2 != null) {
                    LoginButton loginButton4 = LoginButton.this;
                    loginManager.logIn(nativeFragment2, loginButton4.getProperties().getPermissions(), loginButton4.getLoggerID());
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }

        public final void performLogout(Context context) {
            String string;
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                context.getClass();
                LoginManager loginManager = getLoginManager();
                if (!LoginButton.this.confirmLogout) {
                    loginManager.logOut();
                    return;
                }
                String string2 = LoginButton.this.getResources().getString(R.string.com_facebook_loginview_log_out_action);
                string2.getClass();
                String string3 = LoginButton.this.getResources().getString(R.string.com_facebook_loginview_cancel_action);
                string3.getClass();
                Profile currentProfile = Profile.Companion.getCurrentProfile();
                int i = 1;
                if ((currentProfile != null ? currentProfile.getName() : null) != null) {
                    String string4 = LoginButton.this.getResources().getString(R.string.com_facebook_loginview_logged_in_as);
                    string4.getClass();
                    string = String.format(string4, Arrays.copyOf(new Object[]{currentProfile.getName()}, 1));
                } else {
                    string = LoginButton.this.getResources().getString(R.string.com_facebook_loginview_logged_in_using_facebook);
                    string.getClass();
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage(string).setCancelable(true).setPositiveButton(string2, new ka0(i, loginManager)).setNegativeButton(string3, (DialogInterface.OnClickListener) null);
                builder.create().show();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToolTipMode.values().length];
            try {
                iArr[ToolTipMode.AUTOMATIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToolTipMode.DISPLAY_ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToolTipMode.NEVER_DISPLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginButton(Context context, AttributeSet attributeSet, int i, int i2, String str, String str2) {
        super(context, attributeSet, i, i2, str, str2);
        context.getClass();
        str.getClass();
        str2.getClass();
        this.properties = new LoginButtonProperties();
        this.toolTipStyle = ToolTipPopup.Style.BLUE;
        this.toolTipMode = ToolTipMode.Companion.getDEFAULT();
        this.toolTipDisplayTime = ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME;
        this.loginManagerLazy = ya1.b(LoginButton$loginManagerLazy$1.INSTANCE);
        this.customButtonTransparency = MAX_BUTTON_TRANSPARENCY;
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        this.loggerID = uuid;
    }

    private final void checkToolTipSettings() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            int i = WhenMappings.$EnumSwitchMapping$0[this.toolTipMode.ordinal()];
            if (i == 1) {
                FacebookSdk.getExecutor().execute(new q1(15, Utility.getMetadataApplicationId(getContext()), this));
            } else {
                if (i != 2) {
                    return;
                }
                String string = getResources().getString(R.string.com_facebook_tooltip_default);
                string.getClass();
                displayToolTip(string);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkToolTipSettings$lambda$3(String str, LoginButton loginButton) {
        str.getClass();
        loginButton.getClass();
        loginButton.getActivity().runOnUiThread(new q1(14, loginButton, FetchedAppSettingsManager.queryAppSettings(str, false)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkToolTipSettings$lambda$3$lambda$2(LoginButton loginButton, FetchedAppSettings fetchedAppSettings) {
        loginButton.getClass();
        loginButton.showToolTipPerSettings(fetchedAppSettings);
    }

    private final void displayToolTip(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            ToolTipPopup toolTipPopup = new ToolTipPopup(str, this);
            toolTipPopup.setStyle(this.toolTipStyle);
            toolTipPopup.setNuxDisplayTime(this.toolTipDisplayTime);
            toolTipPopup.show();
            this.toolTipPopup = toolTipPopup;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final int measureButtonWidth(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            return getCompoundPaddingLeft() + getCompoundDrawablePadding() + measureTextWidth(str) + getCompoundPaddingRight();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    private final void showToolTipPerSettings(FetchedAppSettings fetchedAppSettings) {
        if (CrashShieldHandler.isObjectCrashing(this) || fetchedAppSettings == null) {
            return;
        }
        try {
            if (fetchedAppSettings.getNuxEnabled() && getVisibility() == 0) {
                displayToolTip(fetchedAppSettings.getNuxContent());
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void clearPermissions() {
        this.properties.clearPermissions();
    }

    @Override // com.facebook.FacebookButtonBase
    public void configureButton(Context context, AttributeSet attributeSet, int i, int i2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            context.getClass();
            super.configureButton(context, attributeSet, i, i2);
            setInternalOnClickListener(getNewLoginClickListener());
            parseLoginButtonAttributes(context, attributeSet, i, i2);
            if (isInEditMode()) {
                setBackgroundColor(getResources().getColor(com.facebook.common.R.color.com_facebook_blue));
                setLoginText("Continue with Facebook");
            } else {
                this.accessTokenTracker = new AccessTokenTracker() { // from class: com.facebook.login.widget.LoginButton$configureButton$1
                    @Override // com.facebook.AccessTokenTracker
                    public void onCurrentAccessTokenChanged(AccessToken accessToken, AccessToken accessToken2) {
                        LoginButton.this.setButtonText();
                        LoginButton.this.setButtonIcon();
                    }
                };
            }
            setButtonText();
            setButtonRadius();
            setButtonTransparency();
            setButtonIcon();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void dismissToolTip() {
        ToolTipPopup toolTipPopup = this.toolTipPopup;
        if (toolTipPopup != null) {
            toolTipPopup.dismiss();
        }
        this.toolTipPopup = null;
    }

    public final String getAuthType() {
        return this.properties.getAuthType();
    }

    public final CallbackManager getCallbackManager() {
        return this.callbackManager;
    }

    public final DefaultAudience getDefaultAudience() {
        return this.properties.getDefaultAudience();
    }

    @Override // com.facebook.FacebookButtonBase
    public int getDefaultRequestCode() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            return CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    @Override // com.facebook.FacebookButtonBase
    public int getDefaultStyleResource() {
        return R.style.com_facebook_loginview_default_style;
    }

    public final String getLoggerID() {
        return this.loggerID;
    }

    public final LoginBehavior getLoginBehavior() {
        return this.properties.getLoginBehavior();
    }

    public final int getLoginButtonContinueLabel() {
        return R.string.com_facebook_loginview_log_in_button_continue;
    }

    public final int getLoginButtonWidth(int i) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            Resources resources = getResources();
            String str = this.loginText;
            if (str == null) {
                str = resources.getString(R.string.com_facebook_loginview_log_in_button_continue);
                int measureButtonWidth = measureButtonWidth(str);
                if (View.resolveSize(measureButtonWidth, i) < measureButtonWidth) {
                    str = resources.getString(R.string.com_facebook_loginview_log_in_button);
                }
            }
            return measureButtonWidth(str);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    public final y91 getLoginManagerLazy() {
        return this.loginManagerLazy;
    }

    public final LoginTargetApp getLoginTargetApp() {
        return this.properties.getLoginTargetApp();
    }

    public final String getLoginText() {
        return this.loginText;
    }

    public final String getLogoutText() {
        return this.logoutText;
    }

    public final String getMessengerPageId() {
        return this.properties.getMessengerPageId();
    }

    public LoginClickListener getNewLoginClickListener() {
        return new LoginClickListener();
    }

    public final List<String> getPermissions() {
        return this.properties.getPermissions();
    }

    public final LoginButtonProperties getProperties() {
        return this.properties;
    }

    public final boolean getResetMessengerState() {
        return this.properties.getResetMessengerState();
    }

    public final boolean getShouldSkipAccountDeduplication() {
        return this.properties.getShouldSkipAccountDeduplication();
    }

    public final long getToolTipDisplayTime() {
        return this.toolTipDisplayTime;
    }

    public final ToolTipMode getToolTipMode() {
        return this.toolTipMode;
    }

    public final ToolTipPopup.Style getToolTipStyle() {
        return this.toolTipStyle;
    }

    @Override // com.facebook.FacebookButtonBase, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            super.onAttachedToWindow();
            if (getContext() instanceof m4) {
                Object context = getContext();
                context.getClass();
                this.androidXLoginCaller = ((m4) context).getActivityResultRegistry().c("facebook-login", ((LoginManager) this.loginManagerLazy.getValue()).createLogInActivityResultContract(this.callbackManager, this.loggerID), new b71());
            }
            AccessTokenTracker accessTokenTracker = this.accessTokenTracker;
            if (accessTokenTracker == null || !accessTokenTracker.isTracking()) {
                return;
            }
            accessTokenTracker.startTracking();
            setButtonText();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            super.onDetachedFromWindow();
            b4 b4Var = this.androidXLoginCaller;
            if (b4Var != null) {
                b4Var.c();
            }
            AccessTokenTracker accessTokenTracker = this.accessTokenTracker;
            if (accessTokenTracker != null) {
                accessTokenTracker.stopTracking();
            }
            dismissToolTip();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // com.facebook.FacebookButtonBase, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            canvas.getClass();
            super.onDraw(canvas);
            if (this.toolTipChecked || isInEditMode()) {
                return;
            }
            this.toolTipChecked = true;
            checkToolTipSettings();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            super.onLayout(z, i, i2, i3, i4);
            setButtonText();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
            int compoundPaddingTop = getCompoundPaddingTop() + ((int) Math.ceil(Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom))) + getCompoundPaddingBottom();
            Resources resources = getResources();
            int loginButtonWidth = getLoginButtonWidth(i);
            String str = this.logoutText;
            if (str == null) {
                str = resources.getString(R.string.com_facebook_loginview_log_out_button);
                str.getClass();
            }
            setMeasuredDimension(View.resolveSize(Math.max(loginButtonWidth, measureButtonWidth(str)), i), compoundPaddingTop);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onVisibilityChanged(View view, int i) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            view.getClass();
            super.onVisibilityChanged(view, i);
            if (i != 0) {
                dismissToolTip();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void parseLoginButtonAttributes(Context context, AttributeSet attributeSet, int i, int i2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            context.getClass();
            ToolTipMode.Companion companion = ToolTipMode.Companion;
            this.toolTipMode = companion.getDEFAULT();
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.com_facebook_login_view, i, i2);
            obtainStyledAttributes.getClass();
            try {
                this.confirmLogout = obtainStyledAttributes.getBoolean(R.styleable.com_facebook_login_view_com_facebook_confirm_logout, true);
                setLoginText(obtainStyledAttributes.getString(R.styleable.com_facebook_login_view_com_facebook_login_text));
                setLogoutText(obtainStyledAttributes.getString(R.styleable.com_facebook_login_view_com_facebook_logout_text));
                ToolTipMode fromInt = companion.fromInt(obtainStyledAttributes.getInt(R.styleable.com_facebook_login_view_com_facebook_tooltip_mode, companion.getDEFAULT().getIntValue()));
                if (fromInt == null) {
                    fromInt = companion.getDEFAULT();
                }
                this.toolTipMode = fromInt;
                if (obtainStyledAttributes.hasValue(R.styleable.com_facebook_login_view_com_facebook_login_button_radius)) {
                    this.customButtonRadius = Float.valueOf(obtainStyledAttributes.getDimension(R.styleable.com_facebook_login_view_com_facebook_login_button_radius, 0.0f));
                }
                int integer = obtainStyledAttributes.getInteger(R.styleable.com_facebook_login_view_com_facebook_login_button_transparency, MAX_BUTTON_TRANSPARENCY);
                this.customButtonTransparency = integer;
                int max = Math.max(0, integer);
                this.customButtonTransparency = max;
                this.customButtonTransparency = Math.min(MAX_BUTTON_TRANSPARENCY, max);
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } catch (Throwable th2) {
            CrashShieldHandler.handleThrowable(th2, this);
        }
    }

    public final void registerCallback(CallbackManager callbackManager, FacebookCallback<LoginResult> facebookCallback) {
        callbackManager.getClass();
        facebookCallback.getClass();
        ((LoginManager) this.loginManagerLazy.getValue()).registerCallback(callbackManager, facebookCallback);
        CallbackManager callbackManager2 = this.callbackManager;
        if (callbackManager2 == null) {
            this.callbackManager = callbackManager;
        } else if (callbackManager2 != callbackManager) {
            Log.w(TAG, "You're registering a callback on the one Facebook login button with two different callback managers. It's almost wrong and may cause unexpected results. Only the first callback manager will be used for handling activity result with androidx.");
        }
    }

    public final void setAuthType(String str) {
        str.getClass();
        this.properties.setAuthType(str);
    }

    public final void setButtonIcon() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            setCompoundDrawablesWithIntrinsicBounds(j8.F(getContext(), com.facebook.common.R.drawable.com_facebook_button_icon), (Drawable) null, (Drawable) null, (Drawable) null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void setButtonRadius() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Float f = this.customButtonRadius;
            if (f != null) {
                float floatValue = f.floatValue();
                Drawable background = getBackground();
                if (Build.VERSION.SDK_INT >= 29 && (background instanceof StateListDrawable)) {
                    int stateCount = ((StateListDrawable) background).getStateCount();
                    for (int i = 0; i < stateCount; i++) {
                        Drawable stateDrawable = ((StateListDrawable) background).getStateDrawable(i);
                        GradientDrawable gradientDrawable = stateDrawable instanceof GradientDrawable ? (GradientDrawable) stateDrawable : null;
                        if (gradientDrawable != null) {
                            gradientDrawable.setCornerRadius(floatValue);
                        }
                    }
                }
                if (background instanceof GradientDrawable) {
                    ((GradientDrawable) background).setCornerRadius(floatValue);
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void setButtonText() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Resources resources = getResources();
            if (!isInEditMode() && AccessToken.Companion.isCurrentAccessTokenActive()) {
                String str = this.logoutText;
                if (str == null) {
                    str = resources.getString(R.string.com_facebook_loginview_log_out_button);
                }
                setText(str);
                return;
            }
            String str2 = this.loginText;
            if (str2 != null) {
                setText(str2);
                return;
            }
            String string = resources.getString(getLoginButtonContinueLabel());
            string.getClass();
            int width = getWidth();
            if (width != 0 && measureButtonWidth(string) > width) {
                string = resources.getString(R.string.com_facebook_loginview_log_in_button);
                string.getClass();
            }
            setText(string);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void setButtonTransparency() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            getBackground().setAlpha(this.customButtonTransparency);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void setDefaultAudience(DefaultAudience defaultAudience) {
        defaultAudience.getClass();
        this.properties.setDefaultAudience(defaultAudience);
    }

    public final void setLoginBehavior(LoginBehavior loginBehavior) {
        loginBehavior.getClass();
        this.properties.setLoginBehavior(loginBehavior);
    }

    public final void setLoginManagerLazy(y91 y91Var) {
        y91Var.getClass();
        this.loginManagerLazy = y91Var;
    }

    public final void setLoginTargetApp(LoginTargetApp loginTargetApp) {
        loginTargetApp.getClass();
        this.properties.setLoginTargetApp(loginTargetApp);
    }

    public final void setLoginText(String str) {
        this.loginText = str;
        setButtonText();
    }

    public final void setLogoutText(String str) {
        this.logoutText = str;
        setButtonText();
    }

    public final void setMessengerPageId(String str) {
        this.properties.setMessengerPageId(str);
    }

    public final void setPermissions(String... strArr) {
        strArr.getClass();
        this.properties.setPermissions(oi.p(Arrays.copyOf(strArr, strArr.length)));
    }

    @fa0
    public final void setPublishPermissions(String... strArr) {
        strArr.getClass();
        this.properties.setPermissions(oi.p(Arrays.copyOf(strArr, strArr.length)));
    }

    @fa0
    public final void setReadPermissions(String... strArr) {
        strArr.getClass();
        this.properties.setPermissions(oi.p(Arrays.copyOf(strArr, strArr.length)));
    }

    public final void setResetMessengerState(boolean z) {
        this.properties.setResetMessengerState(z);
    }

    public final void setToolTipDisplayTime(long j) {
        this.toolTipDisplayTime = j;
    }

    public final void setToolTipMode(ToolTipMode toolTipMode) {
        toolTipMode.getClass();
        this.toolTipMode = toolTipMode;
    }

    public final void setToolTipStyle(ToolTipPopup.Style style) {
        style.getClass();
        this.toolTipStyle = style;
    }

    public final void unregisterCallback(CallbackManager callbackManager) {
        callbackManager.getClass();
        ((LoginManager) this.loginManagerLazy.getValue()).unregisterCallback(callbackManager);
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.facebook.login.widget.LoginButton$ToolTipMode, still in use, count: 1, list:
      (r0v0 com.facebook.login.widget.LoginButton$ToolTipMode) from 0x0032: SPUT (r0v0 com.facebook.login.widget.LoginButton$ToolTipMode) (LINE:51) com.facebook.login.widget.LoginButton.ToolTipMode.DEFAULT com.facebook.login.widget.LoginButton$ToolTipMode
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class ToolTipMode {
        AUTOMATIC(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_AUTOMATIC, 0),
        DISPLAY_ALWAYS("display_always", 1),
        NEVER_DISPLAY("never_display", 2);

        private static final ToolTipMode DEFAULT = new ToolTipMode(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_AUTOMATIC, 0);
        private final int intValue;
        private final String stringValue;
        public static final Companion Companion = new Companion(null);

        static {
        }

        private ToolTipMode(String str, int i) {
            this.stringValue = str;
            this.intValue = i;
        }

        public static ToolTipMode valueOf(String str) {
            return (ToolTipMode) Enum.valueOf(ToolTipMode.class, str);
        }

        public static ToolTipMode[] values() {
            return (ToolTipMode[]) $VALUES.clone();
        }

        public final int getIntValue() {
            return this.intValue;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.stringValue;
        }

        /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ToolTipMode fromInt(int i) {
                for (ToolTipMode toolTipMode : ToolTipMode.values()) {
                    if (toolTipMode.getIntValue() == i) {
                        return toolTipMode;
                    }
                }
                return null;
            }

            public final ToolTipMode getDEFAULT() {
                return ToolTipMode.DEFAULT;
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final void setPermissions(List<String> list) {
        list.getClass();
        this.properties.setPermissions(list);
    }

    @fa0
    public final void setPublishPermissions(List<String> list) {
        list.getClass();
        this.properties.setPermissions(list);
    }

    @fa0
    public final void setReadPermissions(List<String> list) {
        list.getClass();
        this.properties.setPermissions(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(CallbackManager.ActivityResultParameters activityResultParameters) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginButton(Context context) {
        this(context, null, 0, 0, AnalyticsEvents.EVENT_LOGIN_BUTTON_CREATE, AnalyticsEvents.EVENT_LOGIN_BUTTON_DID_TAP);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, AnalyticsEvents.EVENT_LOGIN_BUTTON_CREATE, AnalyticsEvents.EVENT_LOGIN_BUTTON_DID_TAP);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, AnalyticsEvents.EVENT_LOGIN_BUTTON_CREATE, AnalyticsEvents.EVENT_LOGIN_BUTTON_DID_TAP);
        context.getClass();
    }
}
