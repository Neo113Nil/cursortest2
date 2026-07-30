package com.facebook.internal;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.AccessToken;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestAsyncTask;
import com.facebook.GraphResponse;
import com.facebook.common.R;
import com.facebook.internal.WebDialog;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.LoginTargetApp;
import com.facebook.share.internal.ShareConstants;
import com.facebook.share.internal.ShareInternalUtility;
import defpackage.ey;
import defpackage.ja0;
import defpackage.lh;
import defpackage.m63;
import defpackage.tp2;
import defpackage.up2;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class WebDialog extends Dialog {
    private static final int API_EC_DIALOG_CANCEL = 4201;
    private static final int BACKGROUND_GRAY = -872415232;
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_THEME = R.style.com_facebook_activity_theme;
    private static final String DISPLAY_TOUCH = "touch";
    private static final String LOG_TAG = "FacebookSDK.WebDialog";
    private static final int MAX_PADDING_SCREEN_HEIGHT = 1280;
    private static final int MAX_PADDING_SCREEN_WIDTH = 800;
    private static final double MIN_SCALE_FACTOR = 0.5d;
    private static final int NO_PADDING_SCREEN_HEIGHT = 800;
    private static final int NO_PADDING_SCREEN_WIDTH = 480;
    private static final String PLATFORM_DIALOG_PATH_REGEX = "^/(v\\d+\\.\\d+/)??dialog/.*";
    private static InitCallback initCallback;
    private static volatile int webDialogTheme;
    private FrameLayout contentFrameLayout;
    private ImageView crossImageView;
    private String expectedRedirectUrl;
    private boolean isDetached;
    private boolean isListenerCalled;
    private boolean isPageFinished;
    private OnCompleteListener onCompleteListener;
    private ProgressDialog spinner;
    private UploadStagingResourcesTask uploadTask;
    private String url;
    private WebView webView;
    private WindowManager.LayoutParams windowParams;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public final class DialogWebViewClient extends WebViewClient {
        public DialogWebViewClient() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            ProgressDialog progressDialog;
            webView.getClass();
            str.getClass();
            super.onPageFinished(webView, str);
            if (!WebDialog.this.isDetached && (progressDialog = WebDialog.this.spinner) != null) {
                progressDialog.dismiss();
            }
            FrameLayout frameLayout = WebDialog.this.contentFrameLayout;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(0);
            }
            WebView webView2 = WebDialog.this.getWebView();
            if (webView2 != null) {
                webView2.setVisibility(0);
            }
            ImageView imageView = WebDialog.this.crossImageView;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            WebDialog.this.isPageFinished = true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            ProgressDialog progressDialog;
            webView.getClass();
            str.getClass();
            Utility.logd(WebDialog.LOG_TAG, "Webview loading URL: " + str);
            super.onPageStarted(webView, str, bitmap);
            if (WebDialog.this.isDetached || (progressDialog = WebDialog.this.spinner) == null) {
                return;
            }
            progressDialog.show();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            webView.getClass();
            str.getClass();
            str2.getClass();
            super.onReceivedError(webView, i, str, str2);
            WebDialog.this.sendErrorToListener(new FacebookDialogException(str, i, str2));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            webView.getClass();
            sslErrorHandler.getClass();
            sslError.getClass();
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            WebDialog.this.sendErrorToListener(new FacebookDialogException(null, -11, null));
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
        @Override // android.webkit.WebViewClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            int i;
            webView.getClass();
            str.getClass();
            Utility.logd(WebDialog.LOG_TAG, "Redirect URL: ".concat(str));
            Uri parse = Uri.parse(str);
            boolean z = parse.getPath() != null && Pattern.matches(WebDialog.PLATFORM_DIALOG_PATH_REGEX, parse.getPath());
            if (!tp2.o(str, WebDialog.this.expectedRedirectUrl, false)) {
                if (tp2.o(str, ServerProtocol.DIALOG_CANCEL_URI, false)) {
                    WebDialog.this.cancel();
                    return true;
                }
                if (!z && !up2.q(str, "touch")) {
                    try {
                        WebDialog.this.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        return true;
                    } catch (ActivityNotFoundException unused) {
                    }
                }
                return false;
            }
            Bundle parseResponseUri = WebDialog.this.parseResponseUri(str);
            String string = parseResponseUri.getString("error");
            if (string == null) {
                string = parseResponseUri.getString("error_type");
            }
            String string2 = parseResponseUri.getString("error_msg");
            if (string2 == null) {
                string2 = parseResponseUri.getString("error_message");
            }
            if (string2 == null) {
                string2 = parseResponseUri.getString(NativeProtocol.BRIDGE_ARG_ERROR_DESCRIPTION);
            }
            String string3 = parseResponseUri.getString("error_code");
            if (string3 != null && !Utility.isNullOrEmpty(string3)) {
                try {
                    i = Integer.parseInt(string3);
                } catch (NumberFormatException unused2) {
                }
                if (!Utility.isNullOrEmpty(string) && Utility.isNullOrEmpty(string2) && i == -1) {
                    WebDialog.this.sendSuccessToListener(parseResponseUri);
                } else if (string == null && (string.equals("access_denied") || string.equals("OAuthAccessDeniedException"))) {
                    WebDialog.this.cancel();
                } else if (i != WebDialog.API_EC_DIALOG_CANCEL) {
                    WebDialog.this.cancel();
                } else {
                    WebDialog.this.sendErrorToListener(new FacebookServiceException(new FacebookRequestError(i, string, string2), string2));
                }
                return true;
            }
            i = -1;
            if (!Utility.isNullOrEmpty(string)) {
            }
            if (string == null) {
            }
            if (i != WebDialog.API_EC_DIALOG_CANCEL) {
            }
            return true;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface InitCallback {
        void onInit(WebView webView);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface OnCompleteListener {
        void onComplete(Bundle bundle, FacebookException facebookException);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoginTargetApp.values().length];
            try {
                iArr[LoginTargetApp.INSTAGRAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private WebDialog(Context context, String str, Bundle bundle, int i, LoginTargetApp loginTargetApp, OnCompleteListener onCompleteListener) {
        super(context, i == 0 ? Companion.getWebDialogTheme() : i);
        Uri buildUri;
        String str2 = ServerProtocol.DIALOG_REDIRECT_URI;
        this.expectedRedirectUrl = ServerProtocol.DIALOG_REDIRECT_URI;
        bundle = bundle == null ? new Bundle() : bundle;
        str2 = Utility.isChromeOS(context) ? ServerProtocol.DIALOG_REDIRECT_CHROME_OS_URI : str2;
        this.expectedRedirectUrl = str2;
        bundle.putString(ServerProtocol.DIALOG_PARAM_REDIRECT_URI, str2);
        bundle.putString("display", "touch");
        bundle.putString("client_id", FacebookSdk.getApplicationId());
        bundle.putString(ServerProtocol.DIALOG_PARAM_SDK_VERSION, String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{FacebookSdk.getSdkVersion()}, 1)));
        this.onCompleteListener = onCompleteListener;
        if (Intrinsics.b(str, "share") && bundle.containsKey(ShareConstants.WEB_DIALOG_PARAM_MEDIA)) {
            this.uploadTask = new UploadStagingResourcesTask(this, str, bundle);
            return;
        }
        if (WhenMappings.$EnumSwitchMapping$0[loginTargetApp.ordinal()] == 1) {
            buildUri = Utility.buildUri(ServerProtocol.getInstagramDialogAuthority(), ServerProtocol.INSTAGRAM_OAUTH_PATH, bundle);
        } else {
            buildUri = Utility.buildUri(ServerProtocol.getDialogAuthority(), FacebookSdk.getGraphApiVersion() + "/dialog/" + str, bundle);
        }
        this.url = buildUri.toString();
    }

    private final void createCrossImage() {
        ImageView imageView = new ImageView(getContext());
        this.crossImageView = imageView;
        imageView.setOnClickListener(new ja0(4, this));
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.com_facebook_close);
        ImageView imageView2 = this.crossImageView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.crossImageView;
        if (imageView3 == null) {
            return;
        }
        imageView3.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createCrossImage$lambda$5(WebDialog webDialog, View view) {
        webDialog.getClass();
        webDialog.cancel();
    }

    private final int getScaledSize(int i, float f, int i2, int i3) {
        int i4 = (int) (i / f);
        return (int) (i * (i4 <= i2 ? 1.0d : i4 >= i3 ? 0.5d : (((i3 - i4) / (i3 - i2)) * MIN_SCALE_FACTOR) + MIN_SCALE_FACTOR));
    }

    public static final int getWebDialogTheme() {
        return Companion.getWebDialogTheme();
    }

    public static final void initDefaultTheme(Context context) {
        Companion.initDefaultTheme(context);
    }

    public static final WebDialog newInstance(Context context, String str, Bundle bundle, int i, LoginTargetApp loginTargetApp, OnCompleteListener onCompleteListener) {
        return Companion.newInstance(context, str, bundle, i, loginTargetApp, onCompleteListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$4(WebDialog webDialog, DialogInterface dialogInterface) {
        webDialog.getClass();
        webDialog.cancel();
    }

    public static final void setInitCallback(InitCallback initCallback2) {
        Companion.setInitCallback(initCallback2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUpWebView(int i) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        final Context context = getContext();
        WebView webView = new WebView(context) { // from class: com.facebook.internal.WebDialog$setUpWebView$1
            @Override // android.webkit.WebView, android.view.View
            public void onWindowFocusChanged(boolean z) {
                try {
                    super.onWindowFocusChanged(z);
                } catch (NullPointerException unused) {
                }
            }
        };
        this.webView = webView;
        InitCallback initCallback2 = initCallback;
        if (initCallback2 != null) {
            initCallback2.onInit(webView);
        }
        WebView webView2 = this.webView;
        if (webView2 != null) {
            webView2.setVerticalScrollBarEnabled(false);
        }
        WebView webView3 = this.webView;
        if (webView3 != null) {
            webView3.setHorizontalScrollBarEnabled(false);
        }
        WebView webView4 = this.webView;
        if (webView4 != null) {
            webView4.setWebViewClient(new DialogWebViewClient());
        }
        WebView webView5 = this.webView;
        WebSettings settings = webView5 != null ? webView5.getSettings() : null;
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        WebView webView6 = this.webView;
        if (webView6 != null) {
            String str = this.url;
            if (str == null) {
                lh.g("Required value was null.");
                return;
            }
            webView6.loadUrl(str);
        }
        WebView webView7 = this.webView;
        if (webView7 != null) {
            webView7.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        WebView webView8 = this.webView;
        if (webView8 != null) {
            webView8.setVisibility(4);
        }
        WebView webView9 = this.webView;
        WebSettings settings2 = webView9 != null ? webView9.getSettings() : null;
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        WebView webView10 = this.webView;
        WebSettings settings3 = webView10 != null ? webView10.getSettings() : null;
        if (settings3 != null) {
            settings3.setSaveFormData(false);
        }
        WebView webView11 = this.webView;
        if (webView11 != null) {
            webView11.setFocusable(true);
        }
        WebView webView12 = this.webView;
        if (webView12 != null) {
            webView12.setFocusableInTouchMode(true);
        }
        WebView webView13 = this.webView;
        if (webView13 != null) {
            webView13.setOnTouchListener(new m63());
        }
        linearLayout.setPadding(i, i, i, i);
        linearLayout.addView(this.webView);
        linearLayout.setBackgroundColor(BACKGROUND_GRAY);
        FrameLayout frameLayout = this.contentFrameLayout;
        if (frameLayout != null) {
            frameLayout.addView(linearLayout);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setUpWebView$lambda$7(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    public static final void setWebDialogTheme(int i) {
        Companion.setWebDialogTheme(i);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.onCompleteListener == null || this.isListenerCalled) {
            return;
        }
        sendErrorToListener(new FacebookOperationCanceledException());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ProgressDialog progressDialog;
        WebView webView = this.webView;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.isDetached && (progressDialog = this.spinner) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    public final OnCompleteListener getOnCompleteListener() {
        return this.onCompleteListener;
    }

    public final WebView getWebView() {
        return this.webView;
    }

    public final boolean isListenerCalled() {
        return this.isListenerCalled;
    }

    public final boolean isPageFinished() {
        return this.isPageFinished;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        Window window;
        WindowManager.LayoutParams attributes;
        this.isDetached = false;
        Context context = getContext();
        context.getClass();
        if (Utility.mustFixWindowParamsForAutofill(context) && (layoutParams = this.windowParams) != null) {
            if ((layoutParams != null ? layoutParams.token : null) == null) {
                if (layoutParams != null) {
                    Activity ownerActivity = getOwnerActivity();
                    layoutParams.token = (ownerActivity == null || (window = ownerActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                }
                StringBuilder sb = new StringBuilder("Set token on onAttachedToWindow(): ");
                WindowManager.LayoutParams layoutParams2 = this.windowParams;
                sb.append(layoutParams2 != null ? layoutParams2.token : null);
                Utility.logd(LOG_TAG, sb.toString());
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.spinner = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.spinner;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(R.string.com_facebook_loading));
        }
        ProgressDialog progressDialog3 = this.spinner;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.spinner;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: n63
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    WebDialog.onCreate$lambda$4(WebDialog.this, dialogInterface);
                }
            });
        }
        requestWindowFeature(1);
        this.contentFrameLayout = new FrameLayout(getContext());
        resize();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        createCrossImage();
        if (this.url != null) {
            ImageView imageView = this.crossImageView;
            if (imageView == null) {
                lh.g("Required value was null.");
                return;
            }
            setUpWebView((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        FrameLayout frameLayout = this.contentFrameLayout;
        if (frameLayout != null) {
            frameLayout.addView(this.crossImageView, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.contentFrameLayout;
        if (frameLayout2 != null) {
            setContentView(frameLayout2);
        } else {
            lh.g("Required value was null.");
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.isDetached = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (i == 4) {
            WebView webView = this.webView;
            if (webView != null && webView != null && webView.canGoBack()) {
                WebView webView2 = this.webView;
                if (webView2 != null) {
                    webView2.goBack();
                }
                return true;
            }
            cancel();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        UploadStagingResourcesTask uploadStagingResourcesTask = this.uploadTask;
        if (uploadStagingResourcesTask != null) {
            if ((uploadStagingResourcesTask != null ? uploadStagingResourcesTask.getStatus() : null) == AsyncTask.Status.PENDING) {
                UploadStagingResourcesTask uploadStagingResourcesTask2 = this.uploadTask;
                if (uploadStagingResourcesTask2 != null) {
                    uploadStagingResourcesTask2.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.spinner;
                if (progressDialog != null) {
                    progressDialog.show();
                    return;
                }
                return;
            }
        }
        resize();
    }

    @Override // android.app.Dialog
    public void onStop() {
        UploadStagingResourcesTask uploadStagingResourcesTask = this.uploadTask;
        if (uploadStagingResourcesTask != null) {
            uploadStagingResourcesTask.cancel(true);
            ProgressDialog progressDialog = this.spinner;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        layoutParams.getClass();
        if (layoutParams.token == null) {
            this.windowParams = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    public Bundle parseResponseUri(String str) {
        Uri parse = Uri.parse(str);
        Bundle parseUrlQueryString = Utility.parseUrlQueryString(parse.getQuery());
        parseUrlQueryString.putAll(Utility.parseUrlQueryString(parse.getFragment()));
        return parseUrlQueryString;
    }

    public final void resize() {
        Object systemService = getContext().getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        int i3 = i < i2 ? i : i2;
        if (i < i2) {
            i = i2;
        }
        int min = Math.min(getScaledSize(i3, displayMetrics.density, NO_PADDING_SCREEN_WIDTH, 800), displayMetrics.widthPixels);
        int min2 = Math.min(getScaledSize(i, displayMetrics.density, 800, MAX_PADDING_SCREEN_HEIGHT), displayMetrics.heightPixels);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(min, min2);
        }
    }

    public final void sendErrorToListener(Throwable th) {
        if (this.onCompleteListener == null || this.isListenerCalled) {
            return;
        }
        this.isListenerCalled = true;
        FacebookException facebookException = th instanceof FacebookException ? (FacebookException) th : new FacebookException(th);
        OnCompleteListener onCompleteListener = this.onCompleteListener;
        if (onCompleteListener != null) {
            onCompleteListener.onComplete(null, facebookException);
        }
        dismiss();
    }

    public final void sendSuccessToListener(Bundle bundle) {
        OnCompleteListener onCompleteListener = this.onCompleteListener;
        if (onCompleteListener == null || this.isListenerCalled) {
            return;
        }
        this.isListenerCalled = true;
        onCompleteListener.onComplete(bundle, null);
        dismiss();
    }

    public final void setExpectedRedirectUrl(String str) {
        str.getClass();
        this.expectedRedirectUrl = str;
    }

    public final void setOnCompleteListener(OnCompleteListener onCompleteListener) {
        this.onCompleteListener = onCompleteListener;
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getWebDialogTheme() {
            Validate.sdkInitialized();
            return WebDialog.webDialogTheme;
        }

        public final void initDefaultTheme(Context context) {
            if (context == null) {
                return;
            }
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if ((applicationInfo != null ? applicationInfo.metaData : null) != null && WebDialog.webDialogTheme == 0) {
                    setWebDialogTheme(applicationInfo.metaData.getInt(FacebookSdk.WEB_DIALOG_THEME));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }

        public final WebDialog newInstance(Context context, String str, Bundle bundle, int i, LoginTargetApp loginTargetApp, OnCompleteListener onCompleteListener) {
            context.getClass();
            loginTargetApp.getClass();
            WebDialog.initDefaultTheme(context);
            return new WebDialog(context, str, bundle, i, loginTargetApp, onCompleteListener, null);
        }

        public final void setInitCallback(InitCallback initCallback) {
            WebDialog.initCallback = initCallback;
        }

        public final void setWebDialogTheme(int i) {
            if (i == 0) {
                i = WebDialog.DEFAULT_THEME;
            }
            WebDialog.webDialogTheme = i;
        }

        private Companion() {
        }

        public final WebDialog newInstance(Context context, String str, Bundle bundle, int i, OnCompleteListener onCompleteListener) {
            context.getClass();
            WebDialog.initDefaultTheme(context);
            return new WebDialog(context, str, bundle, i, LoginTargetApp.FACEBOOK, onCompleteListener, null);
        }
    }

    public static final WebDialog newInstance(Context context, String str, Bundle bundle, int i, OnCompleteListener onCompleteListener) {
        return Companion.newInstance(context, str, bundle, i, onCompleteListener);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static class Builder {
        private AccessToken accessToken;
        private String action;
        private String applicationId;
        private Context context;
        private OnCompleteListener listener;
        private Bundle parameters;
        private int theme;

        public Builder(Context context, String str, Bundle bundle) {
            context.getClass();
            str.getClass();
            AccessToken.Companion companion = AccessToken.Companion;
            this.accessToken = companion.getCurrentAccessToken();
            if (!companion.isCurrentAccessTokenActive()) {
                String metadataApplicationId = Utility.getMetadataApplicationId(context);
                if (metadataApplicationId == null) {
                    ey.i("Attempted to create a builder without a valid access token or a valid default Application ID.");
                    throw null;
                }
                this.applicationId = metadataApplicationId;
            }
            finishInit(context, str, bundle);
        }

        private final void finishInit(Context context, String str, Bundle bundle) {
            this.context = context;
            this.action = str;
            if (bundle != null) {
                this.parameters = bundle;
            } else {
                this.parameters = new Bundle();
            }
        }

        public WebDialog build() {
            AccessToken accessToken = this.accessToken;
            Bundle bundle = this.parameters;
            if (accessToken != null) {
                if (bundle != null) {
                    bundle.putString("app_id", accessToken != null ? accessToken.getApplicationId() : null);
                }
                Bundle bundle2 = this.parameters;
                if (bundle2 != null) {
                    AccessToken accessToken2 = this.accessToken;
                    bundle2.putString("access_token", accessToken2 != null ? accessToken2.getToken() : null);
                }
            } else if (bundle != null) {
                bundle.putString("app_id", this.applicationId);
            }
            Companion companion = WebDialog.Companion;
            Context context = this.context;
            if (context != null) {
                return companion.newInstance(context, this.action, this.parameters, this.theme, this.listener);
            }
            lh.g("Required value was null.");
            return null;
        }

        public final String getApplicationId() {
            return this.applicationId;
        }

        public final Context getContext() {
            return this.context;
        }

        public final OnCompleteListener getListener() {
            return this.listener;
        }

        public final Bundle getParameters() {
            return this.parameters;
        }

        public final int getTheme() {
            return this.theme;
        }

        public final Builder setOnCompleteListener(OnCompleteListener onCompleteListener) {
            this.listener = onCompleteListener;
            return this;
        }

        public final Builder setTheme(int i) {
            this.theme = i;
            return this;
        }

        public Builder(Context context, String str, String str2, Bundle bundle) {
            context.getClass();
            str2.getClass();
            this.applicationId = Validate.notNullOrEmpty(str == null ? Utility.getMetadataApplicationId(context) : str, "applicationId");
            finishInit(context, str2, bundle);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebDialog(Context context, String str) {
        this(context, str, Companion.getWebDialogTheme());
        context.getClass();
        str.getClass();
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public final class UploadStagingResourcesTask extends AsyncTask<Void, Void, String[]> {
        private final String action;
        private Exception[] exceptions;
        private final Bundle parameters;
        final /* synthetic */ WebDialog this$0;

        public UploadStagingResourcesTask(WebDialog webDialog, String str, Bundle bundle) {
            str.getClass();
            bundle.getClass();
            this.this$0 = webDialog;
            this.action = str;
            this.parameters = bundle;
            this.exceptions = new Exception[0];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void doInBackground$lambda$0(String[] strArr, int i, UploadStagingResourcesTask uploadStagingResourcesTask, CountDownLatch countDownLatch, GraphResponse graphResponse) {
            FacebookRequestError error;
            String str;
            strArr.getClass();
            uploadStagingResourcesTask.getClass();
            countDownLatch.getClass();
            graphResponse.getClass();
            try {
                error = graphResponse.getError();
                str = "Error staging photo.";
            } catch (Exception e) {
                uploadStagingResourcesTask.exceptions[i] = e;
            }
            if (error != null) {
                String errorMessage = error.getErrorMessage();
                if (errorMessage != null) {
                    str = errorMessage;
                }
                throw new FacebookGraphResponseException(graphResponse, str);
            }
            JSONObject jSONObject = graphResponse.getJSONObject();
            if (jSONObject == null) {
                throw new FacebookException("Error staging photo.");
            }
            String optString = jSONObject.optString(ShareConstants.MEDIA_URI);
            if (optString == null) {
                throw new FacebookException("Error staging photo.");
            }
            strArr[i] = optString;
            countDownLatch.countDown();
        }

        /* renamed from: doInBackground, reason: avoid collision after fix types in other method */
        public String[] doInBackground2(Void... voidArr) {
            if (!CrashShieldHandler.isObjectCrashing(this)) {
                try {
                    if (!CrashShieldHandler.isObjectCrashing(this)) {
                        try {
                            voidArr.getClass();
                            String[] stringArray = this.parameters.getStringArray(ShareConstants.WEB_DIALOG_PARAM_MEDIA);
                            if (stringArray != null) {
                                final String[] strArr = new String[stringArray.length];
                                this.exceptions = new Exception[stringArray.length];
                                final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                                AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
                                try {
                                    int length = stringArray.length;
                                    for (final int i = 0; i < length; i++) {
                                        if (isCancelled()) {
                                            Iterator it = concurrentLinkedQueue.iterator();
                                            while (it.hasNext()) {
                                                ((GraphRequestAsyncTask) it.next()).cancel(true);
                                            }
                                        } else {
                                            Uri parse = Uri.parse(stringArray[i]);
                                            if (Utility.isWebUri(parse)) {
                                                strArr[i] = parse.toString();
                                                countDownLatch.countDown();
                                            } else {
                                                GraphRequest.Callback callback = new GraphRequest.Callback() { // from class: com.facebook.internal.b
                                                    @Override // com.facebook.GraphRequest.Callback
                                                    public final void onCompleted(GraphResponse graphResponse) {
                                                        WebDialog.UploadStagingResourcesTask.doInBackground$lambda$0(strArr, i, this, countDownLatch, graphResponse);
                                                    }
                                                };
                                                parse.getClass();
                                                concurrentLinkedQueue.add(ShareInternalUtility.newUploadStagingResourceWithImageRequest(currentAccessToken, parse, callback).executeAsync());
                                            }
                                        }
                                    }
                                    countDownLatch.await();
                                    return strArr;
                                } catch (Exception unused) {
                                    Iterator it2 = concurrentLinkedQueue.iterator();
                                    while (it2.hasNext()) {
                                        ((GraphRequestAsyncTask) it2.next()).cancel(true);
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            CrashShieldHandler.handleThrowable(th, this);
                        }
                    }
                } catch (Throwable th2) {
                    CrashShieldHandler.handleThrowable(th2, this);
                    return null;
                }
            }
            return null;
        }

        /* renamed from: onPostExecute, reason: avoid collision after fix types in other method */
        public void onPostExecute2(String[] strArr) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                if (CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    ProgressDialog progressDialog = this.this$0.spinner;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                    }
                    for (Exception exc : this.exceptions) {
                        if (exc != null) {
                            this.this$0.sendErrorToListener(exc);
                            return;
                        }
                    }
                    if (strArr == null) {
                        this.this$0.sendErrorToListener(new FacebookException("Failed to stage photos for web dialog"));
                        return;
                    }
                    List asList = Arrays.asList(strArr);
                    asList.getClass();
                    if (asList.contains(null)) {
                        this.this$0.sendErrorToListener(new FacebookException("Failed to stage photos for web dialog"));
                        return;
                    }
                    Utility.putJSONValueInBundle(this.parameters, ShareConstants.WEB_DIALOG_PARAM_MEDIA, new JSONArray((Collection) asList));
                    this.this$0.url = Utility.buildUri(ServerProtocol.getDialogAuthority(), FacebookSdk.getGraphApiVersion() + "/dialog/" + this.action, this.parameters).toString();
                    ImageView imageView = this.this$0.crossImageView;
                    if (imageView == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    this.this$0.setUpWebView((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            } catch (Throwable th2) {
                CrashShieldHandler.handleThrowable(th2, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.String[]] */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ String[] doInBackground(Void[] voidArr) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                if (CrashShieldHandler.isObjectCrashing(this)) {
                    return null;
                }
                try {
                    this = doInBackground2(voidArr);
                    return this;
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                    return null;
                }
            } catch (Throwable th2) {
                CrashShieldHandler.handleThrowable(th2, this);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(String[] strArr) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                if (CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    onPostExecute2(strArr);
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            } catch (Throwable th2) {
                CrashShieldHandler.handleThrowable(th2, this);
            }
        }
    }

    private WebDialog(Context context, String str, int i) {
        super(context, i == 0 ? Companion.getWebDialogTheme() : i);
        this.expectedRedirectUrl = ServerProtocol.DIALOG_REDIRECT_URI;
        this.url = str;
    }

    public /* synthetic */ WebDialog(Context context, String str, Bundle bundle, int i, LoginTargetApp loginTargetApp, OnCompleteListener onCompleteListener, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, bundle, i, loginTargetApp, onCompleteListener);
    }
}
