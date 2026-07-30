package com.chicken.road.cerman.fixs.roost;

import android.app.DownloadManager;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Base64;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.PermissionRequest;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.chicken.road.cerman.fixs.R;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: RoostPageActivity.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 I2\u00020\u0001:\u0002IJB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0015J\b\u0010'\u001a\u00020\u0015H\u0002J\b\u0010(\u001a\u00020\u0015H\u0002J\b\u0010)\u001a\u00020$H\u0002J\b\u0010*\u001a\u00020$H\u0003J\b\u0010+\u001a\u00020$H\u0002J\u0010\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u001eH\u0002J\u0010\u0010.\u001a\u00020$2\u0006\u0010-\u001a\u00020\u001eH\u0002J\u0010\u0010/\u001a\u00020$2\u0006\u00100\u001a\u00020\u000fH\u0002J.\u00101\u001a\u00020$2\u0006\u00102\u001a\u00020\u000f2\b\u00103\u001a\u0004\u0018\u00010\u000f2\b\u00104\u001a\u0004\u0018\u00010\u000f2\b\u00105\u001a\u0004\u0018\u00010\u000fH\u0002J \u00106\u001a\u00020$2\u0006\u00107\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u000f2\u0006\u00109\u001a\u00020\u000fH\u0002J\u0010\u0010:\u001a\u00020$2\u0006\u0010;\u001a\u00020\u0011H\u0002J\b\u0010<\u001a\u00020$H\u0002J\b\u0010=\u001a\u00020\u0015H\u0002J\b\u0010>\u001a\u00020\u0011H\u0002J\b\u0010?\u001a\u00020\u0011H\u0002J\u0010\u0010@\u001a\u00020$2\u0006\u0010A\u001a\u00020\u000fH\u0002J\u0010\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020CH\u0002J\f\u0010E\u001a\u00020\u000f*\u00020\u000fH\u0002J\f\u0010F\u001a\u00020\u000f*\u00020\u000fH\u0002J\b\u0010G\u001a\u00020$H\u0002J\b\u0010H\u001a\u00020$H\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0 X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006K"}, d2 = {"Lcom/chicken/road/cerman/fixs/roost/RoostPageActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "store", "Lcom/chicken/road/cerman/fixs/roost/RoostStore;", "getStore", "()Lcom/chicken/road/cerman/fixs/roost/RoostStore;", "store$delegate", "Lkotlin/Lazy;", "root", "Landroid/widget/FrameLayout;", "web", "Landroid/webkit/WebView;", "initialUrl", "", "consentMode", "", "lastFailedUrl", "hadErrorForCurrentLoad", "errorView", "Landroid/view/View;", "errorTitle", "Landroid/widget/TextView;", "errorBody", "pendingPermissionRequest", "Landroid/webkit/PermissionRequest;", "filePathCallback", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "cameraPermLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "fileChooserLauncher", "Landroid/content/Intent;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "buildLayout", "buildConsentToolbar", "acceptConsent", "configureWebView", "installCallbacks", "handleUrl", "uri", "handleBridge", "openExternal", "rawUrl", "enqueueHttpDownload", ImagesContract.URL, "userAgent", "contentDisposition", "mimeType", "saveBase64ToDownloads", "mimeHeader", "base64", "filenameRaw", "showError", "offline", "hideError", "buildErrorView", "hasCameraPermission", "isOnline", "toast", "message", "dp", "", "value", "cleanUserAgent", "toExtension", "injectShim", "onDestroy", "Companion", "DownloaderBridge", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RoostPageActivity extends ComponentActivity {
    private static final String BRIDGE_SCHEME = "uniwebview";
    private static final String EXTRA_CONSENT = "extra_consent";
    private static final String EXTRA_URL = "extra_url";
    private static final String JS_DOWNLOADER = "AndroidDownloader";
    private static final long ORIENTATION_UNLOCK_DELAY_MS = 1000;
    private static final String PATH_CLOSE = "windowclose";
    private boolean consentMode;
    private TextView errorBody;
    private TextView errorTitle;
    private View errorView;
    private ValueCallback<Uri[]> filePathCallback;
    private boolean hadErrorForCurrentLoad;
    private String lastFailedUrl;
    private PermissionRequest pendingPermissionRequest;
    private FrameLayout root;
    private WebView web;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: store$delegate, reason: from kotlin metadata */
    private final Lazy store = LazyKt.lazy(new Function0() { // from class: com.chicken.road.cerman.fixs.roost.RoostPageActivity$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            RoostStore store_delegate$lambda$0;
            store_delegate$lambda$0 = RoostPageActivity.store_delegate$lambda$0(RoostPageActivity.this);
            return store_delegate$lambda$0;
        }
    });
    private String initialUrl = "";
    private final ActivityResultLauncher<String> cameraPermLauncher = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: com.chicken.road.cerman.fixs.roost.RoostPageActivity$$ExternalSyntheticLambda3
        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            RoostPageActivity.cameraPermLauncher$lambda$1(RoostPageActivity.this, ((Boolean) obj).booleanValue());
        }
    });
    private final ActivityResultLauncher<Intent> fileChooserLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.chicken.road.cerman.fixs.roost.RoostPageActivity$$ExternalSyntheticLambda4
        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            RoostPageActivity.fileChooserLauncher$lambda$2(RoostPageActivity.this, (ActivityResult) obj);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public final RoostStore getStore() {
        return (RoostStore) this.store.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RoostStore store_delegate$lambda$0(RoostPageActivity roostPageActivity) {
        Context applicationContext = roostPageActivity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return new RoostStore(applicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cameraPermLauncher$lambda$1(RoostPageActivity roostPageActivity, boolean z) {
        PermissionRequest permissionRequest = roostPageActivity.pendingPermissionRequest;
        roostPageActivity.pendingPermissionRequest = null;
        if (permissionRequest != null) {
            if (z) {
                permissionRequest.grant(permissionRequest.getResources());
            } else {
                permissionRequest.deny();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fileChooserLauncher$lambda$2(RoostPageActivity roostPageActivity, ActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        ValueCallback<Uri[]> valueCallback = roostPageActivity.filePathCallback;
        roostPageActivity.filePathCallback = null;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(result.getResultCode(), result.getData()));
        }
    }

    /* compiled from: RoostPageActivity.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/chicken/road/cerman/fixs/roost/RoostPageActivity$Companion;", "", "<init>", "()V", "EXTRA_URL", "", "EXTRA_CONSENT", "BRIDGE_SCHEME", "PATH_CLOSE", "JS_DOWNLOADER", "ORIENTATION_UNLOCK_DELAY_MS", "", "intent", "Landroid/content/Intent;", "ctx", "Landroid/content/Context;", ImagesContract.URL, "consent", "", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ Intent intent$default(Companion companion, Context context, String str, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            return companion.intent(context, str, z);
        }

        public final Intent intent(Context ctx, String url, boolean consent) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            Intrinsics.checkNotNullParameter(url, "url");
            Intent putExtra = new Intent(ctx, (Class<?>) RoostPageActivity.class).putExtra(RoostPageActivity.EXTRA_URL, url).putExtra(RoostPageActivity.EXTRA_CONSENT, consent);
            Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String stringExtra = getIntent().getStringExtra(EXTRA_URL);
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.initialUrl = stringExtra;
        this.consentMode = getIntent().getBooleanExtra(EXTRA_CONSENT, false);
        if (StringsKt.isBlank(this.initialUrl)) {
            finish();
            return;
        }
        setRequestedOrientation(1);
        setContentView(buildLayout());
        configureWebView();
        installCallbacks();
        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback() { // from class: com.chicken.road.cerman.fixs.roost.RoostPageActivity$onCreate$1
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                boolean z;
                WebView webView;
                WebView webView2;
                z = RoostPageActivity.this.consentMode;
                if (z) {
                    RoostPageActivity.this.acceptConsent();
                    return;
                }
                webView = RoostPageActivity.this.web;
                WebView webView3 = null;
                if (webView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("web");
                    webView = null;
                }
                if (webView.canGoBack()) {
                    webView2 = RoostPageActivity.this.web;
                    if (webView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("web");
                    } else {
                        webView3 = webView2;
                    }
                    webView3.goBack();
                    return;
                }
                setEnabled(false);
                RoostPageActivity.this.finish();
            }
        });
        WebView webView = this.web;
        WebView webView2 = null;
        if (webView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("web");
            webView = null;
        }
        webView.loadUrl(this.initialUrl);
        WebView webView3 = this.web;
        if (webView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("web");
        } else {
            webView2 = webView3;
        }
        webView2.postDelayed(new Runnable() { // from class: com.chicken.road.cerman.fixs.roost.RoostPageActivity$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                RoostPageActivity.this.setRequestedOrientation(13);
            }
        }, 1000L);
    }

    private final View buildLayout() {
        RoostPageActivity roostPageActivity = this;
        LinearLayout linearLayout = new LinearLayout(roostPageActivity);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setFitsSystemWindows(true);
        if (this.consentMode) {
            linearLayout.addView(buildConsentToolbar());
        }
        FrameLayout frameLayout = new FrameLayout(roostPageActivity);
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        this.root = frameLayout;
        this.web = new WebView(roostPageActivity);
        FrameLayout frameLayout2 = this.root;
        FrameLayout frameLayout3 = null;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("root");
            frameLayout2 = null;
        }
        WebView webView = this.web;
        if (webView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("web");
            webView = null;
        }
        frameLayout2.addView(webView);
        FrameLayout frameLayout4 = this.root;
        if (frameLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("root");
        } else {
            frameLayout3 = frameLayout4;
        }
        linearLayout.addView(frameLayout3);
        return linearLayout;
    }

    private final View buildConsentToolbar() {
        RoostPageActivity roostPageActivity = this;
        LinearLayout linearLayout = new LinearLayout(roostPageActivity);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setBackgroundColor(Color.parseColor("#222222"));
        int dp = dp(8);
        linearLayout.setPadding(dp(16), dp, dp(8), dp);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextView textView = new TextView(roostPageActivity);
        textView.setText(getString(R.string.consent_title));
        textView.setTextColor(-1);
        textView.setTextSize(18.0f);
        textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        Button button = new Button(roostPageActivity);
        button.setText(getString(R.string.consent_accept));
        button.setOnClickListener(new View.OnClickListener() { // from class: com.chicken.road.cerman.fixs.roost.RoostPageActivity$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RoostPageActivity.this.acceptConsent();
            }
        });
        linearLayout.addView(textView);
        linearLayout.addView(button);
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void acceptConsent() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new RoostPageActivity$acceptConsent$1(this, null), 3, null);
    }

    private final void configureWebView() {
        WebView webView = this.web;
        WebView webView2 = null;
        if (webView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("web");
            webView = null;
        }
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setMixedContentMode(2);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setSupportMultipleWindows(false);
        settings.setCacheMode(-1);
        settings.setAllowFileAccess(true);
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        String userAgentString = settings.getUserAgentString();
        Intrinsics.checkNotNullExpressionValue(userAgentString, "getUserAgentString(...)");
        settings.setUserAgentString(cleanUserAgent(userAgentString));
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        WebView webView3 = this.web;
        if (webView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("web");
            webView3 = null;
        }
        cookieManager.setAcceptThirdPartyCookies(webView3, true);
        WebView webView4 = this.web;
        if (webView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("web");
        } else {
            webView2 = webView4;
        }
        webView2.addJavascriptInterface(new DownloaderBridge(), JS_DOWNLOADER);
    }

    private final void installCallbacks() {
        WebView webView = this.web;
        WebView webView2 = null;
        if (webView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("web");
            webView = null;
        }
        webView.setWebViewClient(new WebViewClient() { // from class: com.chicken.road.cerman.fixs.roost.RoostPageActivity$installCallbacks$1
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                boolean handleUrl;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(request, "request");
                RoostPageActivity roostPageActivity = RoostPageActivity.this;
                Uri url = request.getUrl();
                Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
                handleUrl = roostPageActivity.handleUrl(url);
                return handleUrl;
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                RoostPageActivity.this.hadErrorForCurrentLoad = false;
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView view, String url) {
                boolean z;
                RoostPageActivity.this.injectShim();
                z = RoostPageActivity.this.hadErrorForCurrentLoad;
                if (z) {
                    return;
                }
                RoostPageActivity.this.hideError();
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                boolean isOnline;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(error, "error");
                if (request.isForMainFrame()) {
                    String uri = request.getUrl().toString();
                    Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                    if (!StringsKt.startsWith$default(uri, "http", false, 2, (Object) null)) {
                        RoostPageActivity.this.openExternal(uri);
                        return;
                    }
                    RoostPageActivity.this.hadErrorForCurrentLoad = true;
                    RoostPageActivity.this.lastFailedUrl = uri;
                    RoostPageActivity roostPageActivity = RoostPageActivity.this;
                    isOnline = roostPageActivity.isOnline();
                    roostPageActivity.showError(!isOnline);
                }
            }
        });
        WebView webView3 = this.web;
        if (webView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("web");
            webView3 = null;
        }
        webView3.setWebChromeClient(new WebChromeClient() { // from class: com.chicken.road.cerman.fixs.roost.RoostPageActivity$installCallbacks$2
            @Override // android.webkit.WebChromeClient
            public void onCloseWindow(WebView window) {
                RoostPageActivity.this.finish();
            }

            @Override // android.webkit.WebChromeClient
            public void onPermissionRequest(PermissionRequest request) {
                boolean hasCameraPermission;
                ActivityResultLauncher activityResultLauncher;
                Intrinsics.checkNotNullParameter(request, "request");
                String[] resources = request.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                if (ArraysKt.contains(resources, "android.webkit.resource.VIDEO_CAPTURE")) {
                    hasCameraPermission = RoostPageActivity.this.hasCameraPermission();
                    if (!hasCameraPermission) {
                        RoostPageActivity.this.pendingPermissionRequest = request;
                        activityResultLauncher = RoostPageActivity.this.cameraPermLauncher;
                        activityResultLauncher.launch("android.permission.CAMERA");
                        return;
                    }
                    request.grant(request.getResources());
                    return;
                }
                request.deny();
            }

            @Override // android.webkit.WebChromeClient
            public boolean onShowFileChooser(WebView webView4, ValueCallback<Uri[]> callback, WebChromeClient.FileChooserParams params) {
                Intent createIntent;
                ValueCallback valueCallback;
                ActivityResultLauncher activityResultLauncher;
                if (params == null || (createIntent = params.createIntent()) == null) {
                    return false;
                }
                valueCallback = RoostPageActivity.this.filePathCallback;
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(null);
                }
                RoostPageActivity.this.filePathCallback = callback;
                try {
                    activityResultLauncher = RoostPageActivity.this.fileChooserLauncher;
                    activityResultLauncher.launch(createIntent);
                    return true;
                } catch (ActivityNotFoundException unused) {
                    RoostPageActivity.this.filePathCallback = null;
                    return false;
                }
            }
        });
        WebView webView4 = this.web;
        if (webView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("web");
        } else {
            webView2 = webView4;
        }
        webView2.setDownloadListener(new DownloadListener() { // from class: com.chicken.road.cerman.fixs.roost.RoostPageActivity$$ExternalSyntheticLambda7
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                RoostPageActivity.installCallbacks$lambda$12(RoostPageActivity.this, str, str2, str3, str4, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void installCallbacks$lambda$12(RoostPageActivity roostPageActivity, String str, String str2, String str3, String str4, long j) {
        Intrinsics.checkNotNull(str);
        roostPageActivity.enqueueHttpDownload(str, str2, str3, str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean handleUrl(Uri uri) {
        if (StringsKt.equals(uri.getScheme(), BRIDGE_SCHEME, true)) {
            handleBridge(uri);
            return true;
        }
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        if (StringsKt.startsWith$default(uri2, "http://", false, 2, (Object) null) || StringsKt.startsWith$default(uri2, "https://", false, 2, (Object) null) || StringsKt.startsWith$default(uri2, "data:", false, 2, (Object) null) || StringsKt.startsWith$default(uri2, "blob:", false, 2, (Object) null) || StringsKt.startsWith$default(uri2, "about:", false, 2, (Object) null)) {
            return false;
        }
        openExternal(uri2);
        return true;
    }

    private final void handleBridge(Uri uri) {
        if (Intrinsics.areEqual(uri.getHost(), PATH_CLOSE)) {
            WebView webView = this.web;
            WebView webView2 = null;
            if (webView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("web");
                webView = null;
            }
            if (webView.canGoBack()) {
                WebView webView3 = this.web;
                if (webView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("web");
                } else {
                    webView2 = webView3;
                }
                webView2.goBack();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openExternal(String rawUrl) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(rawUrl)).addFlags(268435456));
        } catch (ActivityNotFoundException unused) {
            String string = getString(R.string.web_no_app);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            toast(string);
        }
    }

    private final void enqueueHttpDownload(String url, String userAgent, String contentDisposition, String mimeType) {
        WebView webView = null;
        if (StringsKt.startsWith$default(url, "data:", false, 2, (Object) null) || StringsKt.startsWith$default(url, "blob:", false, 2, (Object) null)) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            RoostPageActivity roostPageActivity = this;
            String guessFileName = URLUtil.guessFileName(url, contentDisposition, mimeType);
            DownloadManager.Request mimeType2 = new DownloadManager.Request(Uri.parse(url)).setMimeType(mimeType);
            if (userAgent == null) {
                WebView webView2 = this.web;
                if (webView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("web");
                } else {
                    webView = webView2;
                }
                userAgent = webView.getSettings().getUserAgentString();
            }
            DownloadManager.Request addRequestHeader = mimeType2.addRequestHeader("User-Agent", userAgent);
            String cookie = CookieManager.getInstance().getCookie(url);
            if (cookie == null) {
                cookie = "";
            }
            DownloadManager.Request destinationInExternalPublicDir = addRequestHeader.addRequestHeader("Cookie", cookie).setNotificationVisibility(1).setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
            Object systemService = getSystemService("download");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
            ((DownloadManager) systemService).enqueue(destinationInExternalPublicDir);
            String string = getString(R.string.web_download_progress, new Object[]{guessFileName});
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            toast(string);
            Result.m6819constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m6819constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v9, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void saveBase64ToDownloads(String mimeHeader, String base64, String filenameRaw) {
        Object m6819constructorimpl;
        String str;
        byte[] decode;
        final Ref.ObjectRef objectRef;
        FileOutputStream fileOutputStream;
        try {
            Result.Companion companion = Result.INSTANCE;
            RoostPageActivity roostPageActivity = this;
            String substringBefore$default = StringsKt.substringBefore$default(StringsKt.removePrefix(mimeHeader, (CharSequence) "data:"), ";", (String) null, 2, (Object) null);
            if (StringsKt.isBlank(substringBefore$default)) {
                substringBefore$default = "application/octet-stream";
            }
            str = substringBefore$default;
            decode = Base64.decode(base64, 0);
            objectRef = new Ref.ObjectRef();
            objectRef.element = filenameRaw;
            if (StringsKt.isBlank((CharSequence) objectRef.element) || Intrinsics.areEqual(objectRef.element, "download")) {
                objectRef.element = "download_" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date()) + "." + toExtension(str);
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m6819constructorimpl = Result.m6819constructorimpl(ResultKt.createFailure(th));
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", (String) objectRef.element);
            contentValues.put("mime_type", str);
            contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
            ContentResolver contentResolver = getContentResolver();
            Uri insert = contentResolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
            if (insert == null) {
                m6819constructorimpl = Result.m6819constructorimpl(Unit.INSTANCE);
                if (Result.m6822exceptionOrNullimpl(m6819constructorimpl) == null) {
                    runOnUiThread(new Runnable() { // from class: com.chicken.road.cerman.fixs.roost.RoostPageActivity$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            RoostPageActivity.saveBase64ToDownloads$lambda$21$lambda$20(RoostPageActivity.this);
                        }
                    });
                    return;
                }
                return;
            }
            OutputStream openOutputStream = contentResolver.openOutputStream(insert);
            if (openOutputStream != null) {
                fileOutputStream = openOutputStream;
                try {
                    fileOutputStream.write(decode);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileOutputStream, null);
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
        } else {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
            if (!externalStoragePublicDirectory.exists()) {
                externalStoragePublicDirectory.mkdirs();
            }
            fileOutputStream = new FileOutputStream(new File(externalStoragePublicDirectory, (String) objectRef.element));
            try {
                fileOutputStream.write(decode);
                Unit unit2 = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStream, null);
            } finally {
            }
        }
        runOnUiThread(new Runnable() { // from class: com.chicken.road.cerman.fixs.roost.RoostPageActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                RoostPageActivity.saveBase64ToDownloads$lambda$19$lambda$18(RoostPageActivity.this, objectRef);
            }
        });
        m6819constructorimpl = Result.m6819constructorimpl(Unit.INSTANCE);
        if (Result.m6822exceptionOrNullimpl(m6819constructorimpl) == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void saveBase64ToDownloads$lambda$19$lambda$18(RoostPageActivity roostPageActivity, Ref.ObjectRef objectRef) {
        String string = roostPageActivity.getString(R.string.web_download_saved, new Object[]{objectRef.element});
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        roostPageActivity.toast(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void saveBase64ToDownloads$lambda$21$lambda$20(RoostPageActivity roostPageActivity) {
        String string = roostPageActivity.getString(R.string.web_download_failed);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        roostPageActivity.toast(string);
    }

    /* compiled from: RoostPageActivity.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0007¨\u0006\n"}, d2 = {"Lcom/chicken/road/cerman/fixs/roost/RoostPageActivity$DownloaderBridge;", "", "<init>", "(Lcom/chicken/road/cerman/fixs/roost/RoostPageActivity;)V", "save", "", "mimeHeader", "", "base64", "filename", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class DownloaderBridge {
        public DownloaderBridge() {
        }

        @JavascriptInterface
        public final void save(String mimeHeader, String base64, String filename) {
            Intrinsics.checkNotNullParameter(mimeHeader, "mimeHeader");
            Intrinsics.checkNotNullParameter(base64, "base64");
            Intrinsics.checkNotNullParameter(filename, "filename");
            RoostPageActivity.this.saveBase64ToDownloads(mimeHeader, base64, filename);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError(boolean offline) {
        View view = this.errorView;
        if (view == null) {
            view = buildErrorView();
            this.errorView = view;
            FrameLayout frameLayout = this.root;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("root");
                frameLayout = null;
            }
            frameLayout.addView(view);
        }
        TextView textView = this.errorTitle;
        if (textView != null) {
            textView.setText(getString(offline ? R.string.web_error_offline_title : R.string.web_error_generic_title));
        }
        TextView textView2 = this.errorBody;
        if (textView2 != null) {
            textView2.setText(getString(offline ? R.string.web_error_offline_body : R.string.web_error_generic_body));
        }
        view.setVisibility(0);
        view.bringToFront();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideError() {
        View view = this.errorView;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private final View buildErrorView() {
        RoostPageActivity roostPageActivity = this;
        LinearLayout linearLayout = new LinearLayout(roostPageActivity);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        int dp = dp(24);
        linearLayout.setPadding(dp, dp, dp, dp);
        TextView textView = new TextView(roostPageActivity);
        textView.setTextColor(-1);
        textView.setTextSize(20.0f);
        textView.setGravity(17);
        TextView textView2 = new TextView(roostPageActivity);
        textView2.setTextColor(-3355444);
        textView2.setTextSize(15.0f);
        textView2.setGravity(17);
        textView2.setPadding(0, dp(8), 0, dp(24));
        Button button = new Button(roostPageActivity);
        button.setText(getString(R.string.web_error_retry));
        button.setOnClickListener(new View.OnClickListener() { // from class: com.chicken.road.cerman.fixs.roost.RoostPageActivity$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RoostPageActivity.buildErrorView$lambda$27$lambda$26(RoostPageActivity.this, view);
            }
        });
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        linearLayout.addView(button);
        this.errorTitle = textView;
        this.errorBody = textView2;
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildErrorView$lambda$27$lambda$26(RoostPageActivity roostPageActivity, View view) {
        roostPageActivity.hideError();
        roostPageActivity.hadErrorForCurrentLoad = false;
        WebView webView = roostPageActivity.web;
        if (webView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("web");
            webView = null;
        }
        String str = roostPageActivity.lastFailedUrl;
        if (str == null) {
            str = roostPageActivity.initialUrl;
        }
        webView.loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasCameraPermission() {
        return ContextCompat.checkSelfPermission(this, "android.permission.CAMERA") == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isOnline() {
        NetworkCapabilities networkCapabilities;
        Object systemService = getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            return true;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasCapability(12);
    }

    private final void toast(String message) {
        Toast.makeText(this, message, 0).show();
    }

    private final int dp(int value) {
        return (int) TypedValue.applyDimension(1, value, getResources().getDisplayMetrics());
    }

    private final String cleanUserAgent(String str) {
        return StringsKt.replace$default(StringsKt.replace$default(str, "; wv)", ")", false, 4, (Object) null), "Version/4.0 ", "", false, 4, (Object) null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String toExtension(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        switch (lowerCase.hashCode()) {
            case -1487394660:
                return !lowerCase.equals("image/jpeg") ? "bin" : "jpg";
            case -1487018032:
                if (lowerCase.equals("image/webp")) {
                    return "webp";
                }
                break;
            case -1248334925:
                if (lowerCase.equals("application/pdf")) {
                    return "pdf";
                }
                break;
            case -879267568:
                if (lowerCase.equals("image/gif")) {
                    return "gif";
                }
                break;
            case -879264467:
                if (!lowerCase.equals("image/jpg")) {
                }
                break;
            case -879258763:
                if (lowerCase.equals("image/png")) {
                    return "png";
                }
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void injectShim() {
        WebView webView = this.web;
        if (webView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("web");
            webView = null;
        }
        webView.evaluateJavascript("\n(function() {\n    if (window.__roostShimInstalled) return;\n    window.__roostShimInstalled = true;\n\n    document.addEventListener('click', function(e) {\n        var target = e.target;\n        while (target && target.tagName !== 'A') target = target.parentElement;\n        if (!target || !target.tagName || target.tagName !== 'A') return;\n\n        var href = target.href || '';\n        var download = target.download || target.getAttribute('download') || 'download';\n\n        if (href.startsWith('data:')) {\n            e.preventDefault();\n            e.stopPropagation();\n            var parts = href.split(',');\n            if (parts.length === 2) {\n                AndroidDownloader.save(parts[0], parts[1], download);\n            }\n            return false;\n        }\n\n        if (href.startsWith('blob:')) {\n            e.preventDefault();\n            e.stopPropagation();\n            fetch(href)\n                .then(function(response) { return response.blob(); })\n                .then(function(blob) {\n                    var reader = new FileReader();\n                    reader.onloadend = function() {\n                        var parts = ('' + reader.result).split(',');\n                        if (parts.length === 2) {\n                            AndroidDownloader.save(parts[0], parts[1], download);\n                        }\n                    };\n                    reader.readAsDataURL(blob);\n                })\n                .catch(function(err) { console.error('Blob fetch error:', err); });\n            return false;\n        }\n    }, true);\n\n    window.close = function() {\n        window.location = 'uniwebview://windowclose';\n    };\n})();\n", null);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        WebView webView = this.web;
        if (webView != null) {
            WebView webView2 = null;
            if (webView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("web");
                webView = null;
            }
            ViewParent parent = webView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                WebView webView3 = this.web;
                if (webView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("web");
                    webView3 = null;
                }
                viewGroup.removeView(webView3);
            }
            WebView webView4 = this.web;
            if (webView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("web");
                webView4 = null;
            }
            webView4.removeJavascriptInterface(JS_DOWNLOADER);
            WebView webView5 = this.web;
            if (webView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("web");
                webView5 = null;
            }
            webView5.stopLoading();
            WebView webView6 = this.web;
            if (webView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("web");
            } else {
                webView2 = webView6;
            }
            webView2.destroy();
        }
        super.onDestroy();
    }
}
