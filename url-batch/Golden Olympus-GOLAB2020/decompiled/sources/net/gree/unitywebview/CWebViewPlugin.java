package net.gree.unitywebview;

import android.R;
import android.app.Activity;
import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.core.content.FileProvider;
import com.huawei.hms.framework.common.BundleUtil;
import com.unity3d.player.UnityPlayer;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class CWebViewPlugin extends Fragment {
    private static final int ALLOWED_INTENT_FLAGS = 1007171600;
    private static final int INPUT_FILE_REQUEST_CODE = 1;
    private static boolean forceBringToFront;
    private static long instanceCount;
    private static FrameLayout layout;
    private boolean canGoBack;
    private boolean canGoForward;
    private boolean mAlertDialogEnabled;
    private boolean mAllowAudioCapture;
    private Pattern mAllowRegex;
    private boolean mAllowVideoCapture;
    private String mBasicAuthPassword;
    private String mBasicAuthUserName;
    private Uri mCameraPhotoUri;
    private Hashtable<String, String> mCustomHeaders;
    private Pattern mDenyRegex;
    private ValueCallback<Uri[]> mFilePathCallback;
    private ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener;
    private Pattern mHookRegex;
    private long mInstanceId;
    private boolean mPaused;
    private List<Pair<String, CWebViewPlugin>> mTransactions;
    private ValueCallback<Uri> mUploadMessage;
    private View mVideoView;
    private WebView mWebView;
    private CWebViewPluginInterface mWebViewPlugin;
    private String mWebViewUA;
    private int progress;
    private Queue<String> mMessages = new ArrayDeque();
    private boolean mInteractionEnabled = true;

    /* renamed from: net.gree.unitywebview.CWebViewPlugin$4, reason: invalid class name */
    class AnonymousClass4 implements Runnable {
        final /* synthetic */ Activity val$a;
        final /* synthetic */ int val$androidForceDarkMode;
        final /* synthetic */ String val$gameObject;
        final /* synthetic */ int val$radius;
        final /* synthetic */ CWebViewPlugin val$self;
        final /* synthetic */ boolean val$transparent;
        final /* synthetic */ String val$ua;
        final /* synthetic */ boolean val$zoom;

        AnonymousClass4(CWebViewPlugin cWebViewPlugin, Activity activity, int i4, String str, String str2, boolean z4, int i5, boolean z5) {
            this.val$self = cWebViewPlugin;
            this.val$a = activity;
            this.val$radius = i4;
            this.val$gameObject = str;
            this.val$ua = str2;
            this.val$zoom = z4;
            this.val$androidForceDarkMode = i5;
            this.val$transparent = z5;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CWebViewPlugin.this.mWebView != null) {
                return;
            }
            CWebViewPlugin.this.setRetainInstance(true);
            if (CWebViewPlugin.this.mPaused) {
                if (CWebViewPlugin.this.mTransactions == null) {
                    CWebViewPlugin.this.mTransactions = new ArrayList();
                }
                CWebViewPlugin.this.mTransactions.add(Pair.create("add", this.val$self));
            } else {
                this.val$a.getFragmentManager().beginTransaction().add(0, this.val$self, "CWebViewPlugin" + CWebViewPlugin.this.mInstanceId).commitAllowingStateLoss();
            }
            CWebViewPlugin.this.mAlertDialogEnabled = true;
            CWebViewPlugin.this.mAllowVideoCapture = false;
            CWebViewPlugin.this.mAllowAudioCapture = false;
            CWebViewPlugin.this.mCustomHeaders = new Hashtable();
            final WebView roundedWebView = this.val$radius > 0 ? new RoundedWebView(this.val$a, this.val$radius) : new WebView(this.val$a);
            try {
                if ((this.val$a.getPackageManager().getApplicationInfo(this.val$a.getPackageName(), 0).flags & 2) != 0) {
                    WebView.setWebContentsDebuggingEnabled(true);
                }
            } catch (Exception unused) {
            }
            roundedWebView.setVisibility(8);
            roundedWebView.setFocusable(true);
            roundedWebView.setFocusableInTouchMode(true);
            roundedWebView.setWebChromeClient(new WebChromeClient() { // from class: net.gree.unitywebview.CWebViewPlugin.4.1
                @Override // android.webkit.WebChromeClient
                public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
                    callback.invoke(str, true, false);
                }

                @Override // android.webkit.WebChromeClient
                public void onHideCustomView() {
                    super.onHideCustomView();
                    if (CWebViewPlugin.layout != null) {
                        CWebViewPlugin.layout.removeView(CWebViewPlugin.this.mVideoView);
                        CWebViewPlugin.layout.setBackgroundColor(0);
                        CWebViewPlugin.this.mVideoView = null;
                    }
                }

                @Override // android.webkit.WebChromeClient
                public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
                    if (CWebViewPlugin.this.mAlertDialogEnabled) {
                        return super.onJsAlert(webView, str, str2, jsResult);
                    }
                    jsResult.cancel();
                    return true;
                }

                @Override // android.webkit.WebChromeClient
                public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
                    if (CWebViewPlugin.this.mAlertDialogEnabled) {
                        return super.onJsConfirm(webView, str, str2, jsResult);
                    }
                    jsResult.cancel();
                    return true;
                }

                @Override // android.webkit.WebChromeClient
                public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
                    if (CWebViewPlugin.this.mAlertDialogEnabled) {
                        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
                    }
                    jsPromptResult.cancel();
                    return true;
                }

                @Override // android.webkit.WebChromeClient
                public void onPermissionRequest(PermissionRequest permissionRequest) {
                    String[] resources = permissionRequest.getResources();
                    for (String str : resources) {
                        if ((str.equals("android.webkit.resource.VIDEO_CAPTURE") && CWebViewPlugin.this.mAllowVideoCapture) || ((str.equals("android.webkit.resource.AUDIO_CAPTURE") && CWebViewPlugin.this.mAllowAudioCapture) || str.equals("android.webkit.resource.PROTECTED_MEDIA_ID"))) {
                            permissionRequest.grant(resources);
                            return;
                        }
                    }
                }

                @Override // android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i4) {
                    CWebViewPlugin.this.progress = i4;
                }

                @Override // android.webkit.WebChromeClient
                public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
                    super.onShowCustomView(view, customViewCallback);
                    if (CWebViewPlugin.layout != null) {
                        CWebViewPlugin.this.mVideoView = view;
                        CWebViewPlugin.layout.setBackgroundColor(-16777216);
                        CWebViewPlugin.layout.addView(CWebViewPlugin.this.mVideoView);
                    }
                }

                @Override // android.webkit.WebChromeClient
                public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                    CWebViewPlugin.this.mFilePathCallback = valueCallback;
                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                    CWebViewPlugin.this.MyUnitySendMessage(anonymousClass4.val$gameObject, "RequestFileChooserPermissions", "");
                    return true;
                }

                public void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
                    openFileChooser(valueCallback, str, "");
                }

                public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
                    if (CWebViewPlugin.this.mUploadMessage != null) {
                        CWebViewPlugin.this.mUploadMessage.onReceiveValue(null);
                    }
                    CWebViewPlugin.this.mUploadMessage = valueCallback;
                    Intent intent = new Intent("android.intent.action.GET_CONTENT");
                    intent.addCategory("android.intent.category.OPENABLE");
                    intent.setType("*/*");
                    CWebViewPlugin.this.startActivityForResult(intent, 1);
                }
            });
            CWebViewPlugin.this.mWebViewPlugin = new CWebViewPluginInterface(this.val$self, this.val$gameObject);
            roundedWebView.setWebViewClient(new WebViewClient() { // from class: net.gree.unitywebview.CWebViewPlugin.4.2

                /* renamed from: net.gree.unitywebview.CWebViewPlugin$4$2$1, reason: invalid class name */
                class AnonymousClass1 implements Runnable {
                    final /* synthetic */ List val$setCookieHeaders;
                    final /* synthetic */ String val$url;

                    AnonymousClass1(String str, List list) {
                        this.val$url = str;
                        this.val$setCookieHeaders = list;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        CWebViewPlugin.this.SetCookies(this.val$url, this.val$setCookieHeaders);
                    }
                }

                private void launchMarket(Context context, Intent intent) {
                    String str;
                    if (intent == null || (str = intent.getPackage()) == null) {
                        return;
                    }
                    try {
                        try {
                            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)));
                        } catch (ActivityNotFoundException unused2) {
                        }
                    } catch (ActivityNotFoundException unused3) {
                        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + str)));
                    }
                }

                @Override // android.webkit.WebViewClient
                public void onLoadResource(WebView webView, String str) {
                    CWebViewPlugin.this.canGoBack = roundedWebView.canGoBack();
                    CWebViewPlugin.this.canGoForward = roundedWebView.canGoForward();
                }

                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    CWebViewPlugin.this.canGoBack = roundedWebView.canGoBack();
                    CWebViewPlugin.this.canGoForward = roundedWebView.canGoForward();
                    CWebViewPlugin.this.mWebViewPlugin.call("CallOnLoaded", str);
                }

                @Override // android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    CWebViewPlugin.this.canGoBack = roundedWebView.canGoBack();
                    CWebViewPlugin.this.canGoForward = roundedWebView.canGoForward();
                    CWebViewPlugin.this.mWebViewPlugin.call("CallOnStarted", str);
                }

                @Override // android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i4, String str, String str2) {
                    roundedWebView.loadUrl("about:blank");
                    CWebViewPlugin.this.canGoBack = roundedWebView.canGoBack();
                    CWebViewPlugin.this.canGoForward = roundedWebView.canGoForward();
                    CWebViewPlugin.this.mWebViewPlugin.call("CallOnError", i4 + "\t" + str + "\t" + str2);
                }

                @Override // android.webkit.WebViewClient
                public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
                    if (CWebViewPlugin.this.mBasicAuthUserName == null || CWebViewPlugin.this.mBasicAuthPassword == null) {
                        httpAuthHandler.cancel();
                    } else {
                        httpAuthHandler.proceed(CWebViewPlugin.this.mBasicAuthUserName, CWebViewPlugin.this.mBasicAuthPassword);
                    }
                }

                @Override // android.webkit.WebViewClient
                public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    CWebViewPlugin.this.canGoBack = roundedWebView.canGoBack();
                    CWebViewPlugin.this.canGoForward = roundedWebView.canGoForward();
                    CWebViewPlugin.this.mWebViewPlugin.call("CallOnHttpError", Integer.toString(webResourceResponse.getStatusCode()));
                }

                @Override // android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    return (CWebViewPlugin.this.mCustomHeaders == null || CWebViewPlugin.this.mCustomHeaders.isEmpty()) ? super.shouldInterceptRequest(webView, str) : shouldInterceptRequest(webView, str, null);
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    Intent intent;
                    CWebViewPlugin.this.canGoBack = roundedWebView.canGoBack();
                    CWebViewPlugin.this.canGoForward = roundedWebView.canGoForward();
                    if ((CWebViewPlugin.this.mAllowRegex == null || !CWebViewPlugin.this.mAllowRegex.matcher(str).find()) && CWebViewPlugin.this.mDenyRegex != null && CWebViewPlugin.this.mDenyRegex.matcher(str).find()) {
                        return true;
                    }
                    if (str.startsWith("unity:")) {
                        CWebViewPlugin.this.mWebViewPlugin.call("CallFromJS", str.substring(6));
                        return true;
                    }
                    if (CWebViewPlugin.this.mHookRegex != null && CWebViewPlugin.this.mHookRegex.matcher(str).find()) {
                        CWebViewPlugin.this.mWebViewPlugin.call("CallOnHooked", str);
                        return true;
                    }
                    if (!str.toLowerCase().endsWith(".pdf") && !str.startsWith("https://maps.app.goo.gl") && (str.startsWith("http://") || str.startsWith("https://") || str.startsWith("file://") || str.startsWith("javascript:"))) {
                        CWebViewPlugin.this.mWebViewPlugin.call("CallOnStarted", str);
                        return false;
                    }
                    if (!str.startsWith("intent://") && !str.startsWith("android-app://")) {
                        try {
                            webView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        } catch (ActivityNotFoundException unused2) {
                        }
                        return true;
                    }
                    try {
                        try {
                            intent = Intent.parseUri(str, 1);
                        } catch (URISyntaxException unused3) {
                        }
                    } catch (ActivityNotFoundException unused4) {
                        intent = null;
                    }
                    try {
                        CWebViewPlugin.sanitizeQueryIntentActivitiesIntent(intent);
                        webView.getContext().startActivity(intent);
                    } catch (ActivityNotFoundException unused5) {
                        launchMarket(webView.getContext(), intent);
                        return true;
                    }
                    return true;
                }

                @Override // android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                    if (CWebViewPlugin.this.mCustomHeaders != null && !CWebViewPlugin.this.mCustomHeaders.isEmpty()) {
                        return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
                    }
                    return super.shouldInterceptRequest(webView, webResourceRequest);
                }

                public WebResourceResponse shouldInterceptRequest(WebView webView, String str, Map<String, String> map) {
                    try {
                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                        httpURLConnection.setInstanceFollowRedirects(false);
                        httpURLConnection.setRequestProperty("User-Agent", CWebViewPlugin.this.mWebViewUA);
                        if (CWebViewPlugin.this.mBasicAuthUserName != null && CWebViewPlugin.this.mBasicAuthPassword != null) {
                            httpURLConnection.setRequestProperty("Authorization", "Basic " + Base64.encodeToString((CWebViewPlugin.this.mBasicAuthUserName + StringUtils.PROCESS_POSTFIX_DELIMITER + CWebViewPlugin.this.mBasicAuthPassword).getBytes(), 2));
                        }
                        String cookie = CookieManager.getInstance().getCookie(str);
                        if (cookie != null && !cookie.isEmpty()) {
                            httpURLConnection.addRequestProperty("Cookie", cookie);
                        }
                        if (map != null) {
                            for (Map.Entry<String, String> entry : map.entrySet()) {
                                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                            }
                        }
                        for (Map.Entry entry2 : CWebViewPlugin.this.mCustomHeaders.entrySet()) {
                            httpURLConnection.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                        }
                        httpURLConnection.connect();
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode >= 300 && responseCode < 400) {
                            return null;
                        }
                        List<String> list = httpURLConnection.getHeaderFields().get("Set-Cookie");
                        if (list != null) {
                            CWebViewPlugin.this.SetCookies(str, list);
                        }
                        return new WebResourceResponse(httpURLConnection.getContentType().split(";", 2)[0], httpURLConnection.getContentEncoding(), httpURLConnection.getInputStream());
                    } catch (Exception unused2) {
                        return super.shouldInterceptRequest(webView, str);
                    }
                }
            });
            roundedWebView.addJavascriptInterface(CWebViewPlugin.this.mWebViewPlugin, "Unity");
            WebSettings settings = roundedWebView.getSettings();
            String str = this.val$ua;
            if (str != null && str.length() > 0) {
                settings.setUserAgentString(this.val$ua);
            }
            CWebViewPlugin.this.mWebViewUA = settings.getUserAgentString();
            if (this.val$zoom) {
                settings.setSupportZoom(true);
                settings.setBuiltInZoomControls(true);
            } else {
                settings.setSupportZoom(false);
                settings.setBuiltInZoomControls(false);
            }
            settings.setDisplayZoomControls(false);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
            settings.setJavaScriptEnabled(true);
            settings.setGeolocationEnabled(true);
            int i4 = Build.VERSION.SDK_INT;
            settings.setAllowUniversalAccessFromFileURLs(true);
            settings.setMediaPlaybackRequiresUserGesture(false);
            settings.setDatabaseEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setDatabasePath(roundedWebView.getContext().getDir("databases", 0).getPath());
            settings.setAllowFileAccess(true);
            if (i4 >= 29) {
                int i5 = this.val$androidForceDarkMode;
                if (i5 == 0) {
                    int i6 = UnityPlayer.currentActivity.getResources().getConfiguration().uiMode & 48;
                    if (i6 == 16) {
                        settings.setForceDark(0);
                    } else if (i6 == 32) {
                        settings.setForceDark(2);
                    }
                } else if (i5 == 1) {
                    settings.setForceDark(0);
                } else if (i5 == 2) {
                    settings.setForceDark(2);
                }
            }
            if (this.val$transparent) {
                roundedWebView.setBackgroundColor(0);
            }
            roundedWebView.setOnTouchListener(new View.OnTouchListener() { // from class: net.gree.unitywebview.CWebViewPlugin.4.3
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return !CWebViewPlugin.this.mInteractionEnabled;
                }
            });
            if (CWebViewPlugin.layout == null || CWebViewPlugin.layout.getParent() != this.val$a.findViewById(R.id.content)) {
                CWebViewPlugin.layout = new FrameLayout(this.val$a);
                this.val$a.addContentView(CWebViewPlugin.layout, new ViewGroup.LayoutParams(-1, -1));
                CWebViewPlugin.layout.setFocusable(true);
                CWebViewPlugin.layout.setFocusableInTouchMode(true);
            }
            CWebViewPlugin.layout.addView(roundedWebView, new FrameLayout.LayoutParams(-1, -1, 0));
            CWebViewPlugin.this.mWebView = roundedWebView;
        }
    }

    public static boolean IsWebViewAvailable() {
        final Activity activity = UnityPlayer.currentActivity;
        FutureTask futureTask = new FutureTask(new Callable<Boolean>() { // from class: net.gree.unitywebview.CWebViewPlugin.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Boolean call() {
                boolean z4;
                try {
                    new WebView(activity);
                    z4 = true;
                } catch (Exception unused) {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            }
        });
        if (isDestroyed(activity)) {
            return false;
        }
        activity.runOnUiThread(futureTask);
        try {
            return ((Boolean) futureTask.get()).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ProcessChooser() {
        File file;
        Intent intent = null;
        this.mCameraPhotoUri = null;
        Intent intent2 = new Intent("android.media.action.IMAGE_CAPTURE");
        if (intent2.resolveActivity(getActivity().getPackageManager()) != null) {
            try {
                file = createImageFile();
            } catch (IOException e4) {
                Log.e("CWebViewPlugin", "Unable to create Image File", e4);
                file = null;
            }
            if (file != null) {
                intent2.putExtra("PhotoPath", file);
                Uri uriForFile = FileProvider.getUriForFile(getActivity(), getActivity().getPackageName() + ".unitywebview.fileprovider", file);
                this.mCameraPhotoUri = uriForFile;
                intent2.putExtra("output", uriForFile);
            }
            Intent intent3 = new Intent("android.intent.action.GET_CONTENT");
            intent3.addCategory("android.intent.category.OPENABLE");
            intent3.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent3.setType("*/*");
            intent3.addFlags(1);
            Intent[] intentArr = intent == null ? new Intent[]{intent} : new Intent[0];
            Intent createChooser = Intent.createChooser(intent3, "Select images");
            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
            createChooser.addFlags(1);
            startActivityForResult(createChooser, 1);
        }
        intent = intent2;
        Intent intent32 = new Intent("android.intent.action.GET_CONTENT");
        intent32.addCategory("android.intent.category.OPENABLE");
        intent32.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        intent32.setType("*/*");
        intent32.addFlags(1);
        if (intent == null) {
        }
        Intent createChooser2 = Intent.createChooser(intent32, "Select images");
        createChooser2.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
        createChooser2.addFlags(1);
        startActivityForResult(createChooser2, 1);
    }

    private File createImageFile() {
        String str = "JPEG_" + new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) + BundleUtil.UNDERLINE_TAG;
        File externalFilesDir = getActivity().getExternalFilesDir(Environment.DIRECTORY_DCIM);
        if (!externalFilesDir.exists()) {
            externalFilesDir.mkdirs();
        }
        return File.createTempFile(str, ".jpg", externalFilesDir);
    }

    public static boolean isDestroyed(Activity activity) {
        if (activity == null) {
            return true;
        }
        return activity.isDestroyed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sanitizeQueryIntentActivitiesIntent(Intent intent) {
        intent.setFlags(intent.getFlags() & ALLOWED_INTENT_FLAGS);
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setComponent(null);
        intent.setSelector(null);
    }

    public void AddCustomHeader(final String str, final String str2) {
        Activity activity = UnityPlayer.currentActivity;
        if (isDestroyed(activity)) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: net.gree.unitywebview.CWebViewPlugin.25
            @Override // java.lang.Runnable
            public void run() {
                if (CWebViewPlugin.this.mCustomHeaders == null) {
                    return;
                }
                CWebViewPlugin.this.mCustomHeaders.put(str, str2);
            }
        });
    }

    public void ClearCache(final boolean z4) {
        Activity activity = UnityPlayer.currentActivity;
        if (isDestroyed(activity)) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: net.gree.unitywebview.CWebViewPlugin.28
            @Override // java.lang.Runnable
            public void run() {
                if (CWebViewPlugin.this.mWebView == null) {
                    return;
                }
                CWebViewPlugin.this.mWebView.clearCache(z4);
            }
        });
    }

    public void ClearCookies() {
        CookieManager.getInstance().removeAllCookies(null);
        CookieManager.getInstance().flush();
    }

    public void ClearCustomHeader() {
        Activity activity = UnityPlayer.currentActivity;
        if (isDestroyed(activity)) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: net.gree.unitywebview.CWebViewPlugin.27
            @Override // java.lang.Runnable
            public void run() {
                if (CWebViewPlugin.this.mCustomHeaders == null) {
                    return;
                }
                CWebViewPlugin.this.mCustomHeaders.clear();
            }
        });
    }

    public void Destroy() {
        final Activity activity = UnityPlayer.currentActivity;
        this.mMessages.clear();
        if (isDestroyed(activity)) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: net.gree.unitywebview.CWebViewPlugin.6
            @Override // java.lang.Runnable
            public void run() {
                WebView webView = CWebViewPlugin.this.mWebView;
                CWebViewPlugin.this.mWebView = null;
                if (webView == null) {
                    return;
                }
                if (CWebViewPlugin.this.mGlobalLayoutListener != null) {
                    activity.getWindow().getDecorView().getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(CWebViewPlugin.this.mGlobalLayoutListener);
                    CWebViewPlugin.this.mGlobalLayoutListener = null;
                }
                webView.stopLoading();
                if (CWebViewPlugin.this.mVideoView != null) {
                    CWebViewPlugin.layout.removeView(CWebViewPlugin.this.mVideoView);
                    CWebViewPlugin.layout.setBackgroundColor(0);
                    CWebViewPlugin.this.mVideoView = null;
                }
                CWebViewPlugin.layout.removeView(webView);
                webView.destroy();
                if (!CWebViewPlugin.this.mPaused) {
                    activity.getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
                    return;
                }
                if (CWebViewPlugin.this.mTransactions == null) {
                    CWebViewPlugin.this.mTransactions = new ArrayList();
                }
                CWebViewPlugin.this.mTransactions.add(Pair.create("remove", this));
            }
        });
    }

    public void EvaluateJS(final String str) {
        Activity activity = UnityPlayer.currentActivity;
        if (isDestroyed(activity)) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: net.gree.unitywebview.CWebViewPlugin.10
            @Override // java.lang.Runnable
            public void run() {
                if (CWebViewPlugin.this.mWebView == null) {
                    return;
                }
                CWebViewPlugin.this.mWebView.evaluateJavascript(str, null);
            }
        });
    }

    public void GetCookies(String str) {
        this.mWebViewPlugin.call("CallOnCookies", CookieManager.getInstance().getCookie(str));
    }

    public String GetCustomHeaderValue(String str) {
        Hashtable<String, String> hashtable = this.mCustomHeaders;
        if (hashtable != null && hashtable.containsKey(str)) {
            return this.mCustomHeaders.get(str);
        }
        return null;
    }

    public String GetMessage() {
        String poll;
        synchronized (this.mMessages) {
            try {
                poll = this.mMessages.size() > 0 ? this.mMessages.poll() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return poll;
    }

    public void GoBack() {
        Activity activity = UnityPlayer.currentActivity;
        if (isDestroyed(activity)) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: net.gree.unitywebview.CWebViewPlugin.11
            @Override // java.lang.Runnable
            public void run() {
                if (CWebViewPlugin.this.mWebView == null) {
                    return;
                }
                CWebViewPlugin.this.mWebView.goBack();
            }
        });
    }

    public void GoForward() {
        Activity activity = UnityPlayer.currentActivity;
        if (isDestroyed(activity)) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: net.gree.unitywebview.CWebViewPlugin.12
            @Override // java.lang.Runnable
            public void run() {
                if (CWebViewPlugin.this.mWebView == null) {
                    return;
                }
                CWebViewPlugin.this.mWebView.goForward();
            }
        });
    }

    public void Init(final String str, boolean z4, boolean z5, int i4, String str2, int i5) {
        final Activity activity = UnityPlayer.currentActivity;
        long j4 = instanceCount + 1;
        instanceCount = j4;
        this.mInstanceId = j4;
        if (isDestroyed(activity)) {
            return;
        }
        activity.runOnUiThread(new AnonymousClass4(this, activity, i5, str, str2, z5, i4, z4));
        final View rootView = activity.getWindow().getDecorView().getRootView();
        this.mGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: net.gree.unitywebview.CWebViewPlugin.5
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                Rect rect = new Rect();
                rootView.getWindowVisibleDisplayFrame(rect);
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                try {
                    defaultDisplay.getSize(new Point());
                } catch (NoSuchMethodError unused) {
                    defaultDisplay.getHeight();
                }
                int height = rootView.getRootView().getHeight() - (rect.bottom - rect.top);
                if (CWebViewPlugin.this.IsInitialized()) {
                    CWebViewPlugin.this.MyUnitySendMessage(str, "SetKeyboardVisible", Integer.toString(height));
                }
            }
        };
        rootView.getViewTreeObserver().addOnGlobalLayoutListener(this.mGlobalLayoutListener);
    }

    public boolean IsInitialized() {
        return this.mWebView != null;
    }

    public void LoadHTML(final String str, final String str2) {
        Activity activity = UnityPlayer.currentActivity;
        if (isDestroyed(activity)) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: net.gree.unitywebview.CWebViewPlugin.9
            @Override // java.lang.Runnable
            public void run() {
                if (CWebViewPlugin.this.mWebView == null) {
                    return;
                }
                CWebViewPlugin.this.mWebView.loadDataWithBaseURL(str2, str, "text/html", "UTF8", null);
            }
        });
    }

    public void LoadURL(final String str) {
        Activity activity = UnityPlayer.currentActivity;
        if (isDestroyed(activity)) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: net.gree.unitywebview.CWebViewPlugin.8
            @Override // java.lang.Runnable
            public void run() {
                if (CWebViewPlugin.this.mWebView == null) {
                    return;
                }
                if (CWebViewPlugin.this.mCustomHeaders == null || CWebViewPlugin.this.mCustomHeaders.isEmpty()) {
                    CWebViewPlugin.this.mWebView.loadUrl(str);
                } else {
                    CWebViewPlugin.this.mWebView.loadUrl(str, CWebViewPlugin.this.mCustomHeaders);
                }
            }
        });
    }

    public void MyUnitySendMessage(String str, String str2, String str3) {
        synchronized (this.mMessages) {
            this.mMessages.add(str2 + StringUtils.PROCESS_POSTFIX_DELIMITER + str3);
        }
    }

    public void OnApplicationPause(boolean z4) {
        this.mPaused = z4;
        final Activity activity = UnityPlayer.currentActivity;
        if (isDestroyed(activity)) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: net.gree.unitywebview.CWebViewPlugin.24
            @Override // java.lang.Runnable
            public void run() {
                if (!CWebViewPlugin.this.mPaused && CWebViewPlugin.this.mTransactions != null) {
                    for (Pair pair : CWebViewPlugin.this.mTransactions) {
                        CWebViewPlugin cWebViewPlugin = (CWebViewPlugin) pair.second;
                        String str = (String) pair.first;
                        str.getClass();
                        if (str.equals("remove")) {
                            activity.getFragmentManager().beginTransaction().remove(cWebViewPlugin).commitAllowingStateLoss();
                        } else if (str.equals("add")) {
                            activity.getFragmentManager().beginTransaction().add(0, cWebViewPlugin, "CWebViewPlugin" + CWebViewPlugin.this.mInstanceId).commitAllowingStateLoss();
                        }
                    }
                    CWebViewPlugin.this.mTransactions.clear();
                }
                if (CWebViewPlugin.this.mWebView == null) {
                    return;
                }
                if (CWebViewPlugin.this.mPaused) {
                    CWebViewPlugin.this.mWebView.onPause();
                    if (CWebViewPlugin.this.mWebView.getVisibility() == 0) {
                        CWebViewPlugin.this.mWebView.pauseTimers();
                        return;
                    }
                    return;
                }
                CWebViewPlugin.this.mWebView.onResume();
                CWebViewPlugin.this.mWebView.resumeTimers();
                if (!CWebViewPlugin.forceBringToFront || CWebViewPlugin.layout == null) {
                    return;
                }
                CWebViewPlugin.layout.bringToFront();
            }
        });
    }

    public void OnRequestFileChooserPermissionsResult(boolean z4) {
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() { // from class: net.gree.unitywebview.CWebViewPlugin.2
            @Override // java.lang.Runnable
            public void run() {
                if (CWebViewPlugin.this.mWebView == null) {
                    return;
                }
                CWebViewPlugin.this.ProcessChooser();
            }
        });
    }

    public void Pause() {
        Activity activity = UnityPlayer.currentActivity;
        if (isDestroyed(activity)) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: net.gree.unitywebview.CWebViewPlugin.22
            @Override // java.lang.Runnable
            public void run() {
                if (CWebViewPlugin.this.mWebView == null) {
                    return;
                }
                CWebViewPlugin.this.mWebView.onPause();
                CWebViewPlugin.this.mWebView.pauseTimers();
            }
        });
    }

    public void Reload() {
        Activity activity = UnityPlayer.currentActivity;
        if (isDestroyed(activity)) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: net.gree.unitywebview.CWebViewPlugin.13
            @Override // java.lang.Runnable
            public void run() {
                if (CWebViewPlugin.this.mWebView == null) {
                    return;
                }
                CWebViewPlugin.this.mWebView.reload();
            }
        });
    }

    public void RemoveCustomHeader(final String str) {
        Activity activity = UnityPlayer.currentActivity;
        if (isDestroyed(activity)) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: net.gree.unitywebview.CWebViewPlugin.26
            @Override // java.lang.Runnable
            public void run() {
                if (CWebViewPlugin.this.mCustomHeaders != null && CWebViewPlugin.this.mCustomHeaders.containsKey(str)) {
                    CWebViewPlugin.this.mCustomHeaders.remove(str);
                }
            }
        });
    }

    public void Resume() {
        Activity activity = UnityPlayer.currentActivity;
        if (isDestroyed(activity)) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: net.gree.unitywebview.CWebViewPlugin.23
            @Override // java.lang.Runnable
            public void run() {
                if (CWebViewPlugin.this.mWebView == null) {
                    return;
                }
                CWebViewPlugin.this.mWebView.onResume();
                CWebViewPlugin.this.mWebView.resumeTimers();
            }
        });
    }

    public void SaveCookies() {
        CookieManager.getInstance().flush();
    }

    public void SaveDataURL(final String str, String str2) {
        String substring;
        int indexOf;
        if (str2.startsWith("data:") && (indexOf = (substring = str2.substring(5)).indexOf(";")) >= 0) {
            final String substring2 = substring.substring(indexOf + 8);
            final String substring3 = substring.substring(0, indexOf);
            final Activity activity = UnityPlayer.currentActivity;
            activity.runOnUiThread(new Runnable() { // from class: net.gree.unitywebview.CWebViewPlugin.1
                @Override // java.lang.Runnable
                public void run() {
                    String str3;
                    Uri uri;
                    if (Build.VERSION.SDK_INT >= 29) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("_display_name", str);
                        contentValues.put("mime_type", substring3);
                        contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
                        contentValues.put("is_pending", (Integer) 1);
                        ContentResolver contentResolver = activity.getContentResolver();
                        uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
                        Uri insert = contentResolver.insert(uri, contentValues);
                        if (insert != null) {
                            byte[] decode = Base64.decode(substring2, 0);
                            try {
                                OutputStream openOutputStream = contentResolver.openOutputStream(insert);
                                if (openOutputStream != null) {
                                    try {
                                        openOutputStream.write(decode);
                                    } finally {
                                    }
                                }
                                if (openOutputStream != null) {
                                    openOutputStream.close();
                                }
                            } catch (Exception e4) {
                                e4.printStackTrace();
                            }
                        }
                        contentValues.clear();
                        contentValues.put("is_pending", (Integer) 0);
                        contentResolver.update(insert, contentValues, null, null);
                        return;
                    }
                    File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), str);
                    file.getParent();
                    String name = file.getName();
                    int lastIndexOf = name.lastIndexOf(".");
                    if (lastIndexOf >= 0) {
                        str3 = name.substring(lastIndexOf);
                        name = name.substring(0, lastIndexOf);
                    } else {
                        str3 = "";
                    }
                    int i4 = 1;
                    while (file.exists()) {
                        i4++;
                        file = new File(file.getParent(), name + " (" + i4 + ")" + str3);
                    }
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            fileOutputStream.write(Base64.decode(substring2, 0));
                            fileOutputStream.close();
                        } finally {
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            });
        }
    }

    public void SetAlertDialogEnabled(final boolean z4) {
        Activity activity = UnityPlayer.currentActivity;
        if (isDestroyed(activity)) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: net.gree.unitywebview.CWebViewPlugin.18
            @Override // java.lang.Runnable
            public void run() {
                CWebViewPlugin.this.mAlertDialogEnabled = z4;
            }
        });
    }

    public void SetBasicAuthInfo(String str, String str2) {
        this.mBasicAuthUserName = str;
        this.mBasicAuthPassword = str2;
    }

    public void SetCameraAccess(final boolean z4) {
        Activity activity = UnityPlayer.currentActivity;
        if (isDestroyed(activity)) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: net.gree.unitywebview.CWebViewPlugin.19
            @Override // java.lang.Runnable
            public void run() {
                CWebViewPlugin.this.mAllowVideoCapture = z4;
            }
        });
    }

    public void SetCookies(String str, List<String> list) {
        CookieManager cookieManager = CookieManager.getInstance();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            cookieManager.setCookie(str, it.next());
        }
        cookieManager.flush();
    }

    public void SetInteractionEnabled(final boolean z4) {
        Activity activity = UnityPlayer.currentActivity;
        if (isDestroyed(activity)) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: net.gree.unitywebview.CWebViewPlugin.16
            @Override // java.lang.Runnable
            public void run() {
                CWebViewPlugin.this.mInteractionEnabled = z4;
            }
        });
    }

    public void SetMargins(int i4, int i5, int i6, int i7) {
        final FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 0);
        layoutParams.setMargins(i4, i5, i6, i7);
        Activity activity = UnityPlayer.currentActivity;
        if (isDestroyed(activity)) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: net.gree.unitywebview.CWebViewPlugin.14
            @Override // java.lang.Runnable
            public void run() {
                if (CWebViewPlugin.this.mWebView == null) {
                    return;
                }
                CWebViewPlugin.this.mWebView.setLayoutParams(layoutParams);
            }
        });
    }

    public void SetMicrophoneAccess(final boolean z4) {
        Activity activity = UnityPlayer.currentActivity;
        if (isDestroyed(activity)) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: net.gree.unitywebview.CWebViewPlugin.20
            @Override // java.lang.Runnable
            public void run() {
                CWebViewPlugin.this.mAllowAudioCapture = z4;
            }
        });
    }

    public void SetMixedContentMode(final int i4) {
        Activity activity = UnityPlayer.currentActivity;
        if (isDestroyed(activity)) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: net.gree.unitywebview.CWebViewPlugin.30
            @Override // java.lang.Runnable
            public void run() {
                if (CWebViewPlugin.this.mWebView == null) {
                    return;
                }
                CWebViewPlugin.this.mWebView.getSettings().setMixedContentMode(i4);
            }
        });
    }

    public void SetNetworkAvailable(final boolean z4) {
        Activity activity = UnityPlayer.currentActivity;
        if (isDestroyed(activity)) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: net.gree.unitywebview.CWebViewPlugin.21
            @Override // java.lang.Runnable
            public void run() {
                if (CWebViewPlugin.this.mWebView == null) {
                    return;
                }
                CWebViewPlugin.this.mWebView.setNetworkAvailable(z4);
            }
        });
    }

    public void SetScrollbarsVisibility(final boolean z4) {
        Activity activity = UnityPlayer.currentActivity;
        if (isDestroyed(activity)) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: net.gree.unitywebview.CWebViewPlugin.17
            @Override // java.lang.Runnable
            public void run() {
                if (CWebViewPlugin.this.mWebView == null) {
                    return;
                }
                CWebViewPlugin.this.mWebView.setHorizontalScrollBarEnabled(z4);
                CWebViewPlugin.this.mWebView.setVerticalScrollBarEnabled(z4);
            }
        });
    }

    public void SetTextZoom(final int i4) {
        Activity activity = UnityPlayer.currentActivity;
        if (isDestroyed(activity)) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: net.gree.unitywebview.CWebViewPlugin.29
            @Override // java.lang.Runnable
            public void run() {
                if (CWebViewPlugin.this.mWebView == null) {
                    return;
                }
                CWebViewPlugin.this.mWebView.getSettings().setTextZoom(i4);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022 A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:24:0x0004, B:27:0x000b, B:5:0x0013, B:8:0x001a, B:10:0x0022, B:13:0x0029, B:14:0x002d, B:18:0x0036), top: B:23:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036 A[Catch: Exception -> 0x0040, TRY_LEAVE, TryCatch #0 {Exception -> 0x0040, blocks: (B:24:0x0004, B:27:0x000b, B:5:0x0013, B:8:0x001a, B:10:0x0022, B:13:0x0029, B:14:0x002d, B:18:0x0036), top: B:23:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean SetURLPattern(String str, String str2, String str3) {
        final Pattern compile;
        final Pattern pattern;
        Activity activity;
        final Pattern pattern2 = null;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    compile = Pattern.compile(str);
                    if (str2 != null && str2.length() != 0) {
                        pattern = Pattern.compile(str2);
                        if (str3 != null && str3.length() != 0) {
                            pattern2 = Pattern.compile(str3);
                        }
                        activity = UnityPlayer.currentActivity;
                        if (!isDestroyed(activity)) {
                            return false;
                        }
                        activity.runOnUiThread(new Runnable() { // from class: net.gree.unitywebview.CWebViewPlugin.7
                            @Override // java.lang.Runnable
                            public void run() {
                                CWebViewPlugin.this.mAllowRegex = compile;
                                CWebViewPlugin.this.mDenyRegex = pattern;
                                CWebViewPlugin.this.mHookRegex = pattern2;
                            }
                        });
                        return true;
                    }
                    pattern = null;
                    if (str3 != null) {
                        pattern2 = Pattern.compile(str3);
                    }
                    activity = UnityPlayer.currentActivity;
                    if (!isDestroyed(activity)) {
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        compile = null;
        if (str2 != null) {
            pattern = Pattern.compile(str2);
            if (str3 != null) {
            }
            activity = UnityPlayer.currentActivity;
            if (!isDestroyed(activity)) {
            }
        }
        pattern = null;
        if (str3 != null) {
        }
        activity = UnityPlayer.currentActivity;
        if (!isDestroyed(activity)) {
        }
    }

    public void SetVisibility(final boolean z4) {
        Activity activity = UnityPlayer.currentActivity;
        if (isDestroyed(activity)) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: net.gree.unitywebview.CWebViewPlugin.15
            @Override // java.lang.Runnable
            public void run() {
                if (CWebViewPlugin.this.mWebView == null) {
                    return;
                }
                if (!z4) {
                    CWebViewPlugin.this.mWebView.setVisibility(8);
                    return;
                }
                CWebViewPlugin.this.mWebView.setVisibility(0);
                CWebViewPlugin.layout.requestFocus();
                CWebViewPlugin.this.mWebView.requestFocus();
                if (CWebViewPlugin.layout != null && CWebViewPlugin.layout.getParent() != null && CWebViewPlugin.layout.getParent().getParent() != null) {
                    ((ViewGroup) CWebViewPlugin.layout.getParent().getParent()).requestLayout();
                }
                if (!CWebViewPlugin.forceBringToFront || CWebViewPlugin.layout == null) {
                    return;
                }
                CWebViewPlugin.layout.bringToFront();
            }
        });
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i4, int i5, Intent intent) {
        Uri[] uriArr;
        if (i4 != 1) {
            super.onActivityResult(i4, i5, intent);
            return;
        }
        if (this.mFilePathCallback == null) {
            super.onActivityResult(i4, i5, intent);
            return;
        }
        if (i5 == -1) {
            if (intent == null) {
                Uri uri = this.mCameraPhotoUri;
                if (uri != null) {
                    uriArr = new Uri[]{uri};
                }
            } else if (intent.getClipData() != null) {
                int itemCount = intent.getClipData().getItemCount();
                Uri[] uriArr2 = new Uri[itemCount];
                for (int i6 = 0; i6 < itemCount; i6++) {
                    uriArr2[i6] = intent.getClipData().getItemAt(i6).getUri();
                }
                uriArr = uriArr2;
            } else {
                String dataString = intent.getDataString();
                if (dataString != null) {
                    uriArr = new Uri[]{Uri.parse(dataString)};
                } else {
                    Uri uri2 = this.mCameraPhotoUri;
                    if (uri2 != null) {
                        uriArr = new Uri[]{uri2};
                    }
                }
            }
            this.mFilePathCallback.onReceiveValue(uriArr);
            this.mFilePathCallback = null;
        }
        uriArr = null;
        this.mFilePathCallback.onReceiveValue(uriArr);
        this.mFilePathCallback = null;
    }
}
