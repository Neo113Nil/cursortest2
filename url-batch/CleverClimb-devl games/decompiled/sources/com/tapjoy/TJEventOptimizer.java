package com.tapjoy;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.tapjoy.TapjoyErrorMessage;
import java.util.concurrent.CountDownLatch;

@SuppressLint({"SetJavaScriptEnabled"})
/* loaded from: classes2.dex */
public class TJEventOptimizer extends WebView {

    /* renamed from: a, reason: collision with root package name */
    private static String f7705a = "TJEventOptimizer";

    /* renamed from: b, reason: collision with root package name */
    private static TJEventOptimizer f7706b;

    /* renamed from: c, reason: collision with root package name */
    private static CountDownLatch f7707c;

    /* renamed from: d, reason: collision with root package name */
    private Context f7708d;
    private TJAdUnitJSBridge e;

    /* synthetic */ TJEventOptimizer(Context context, byte b2) {
        this(context);
    }

    private TJEventOptimizer(Context context) {
        super(context);
        this.f7708d = context;
        this.e = new TJAdUnitJSBridge(this.f7708d, this);
        getSettings().setJavaScriptEnabled(true);
        byte b2 = 0;
        setWebViewClient(new b(this, b2));
        setWebChromeClient(new a(this, b2));
        loadUrl(TapjoyConnectCore.getHostURL() + TJAdUnitConstants.EVENTS_PROXY_PATH + TapjoyUtil.convertURLParams(TapjoyConnectCore.getGenericURLParams(), true));
    }

    public static void init(final Context context) {
        TapjoyLog.d(f7705a, "Initializing event optimizer");
        f7707c = new CountDownLatch(1);
        TapjoyUtil.runOnMainThread(new Runnable() { // from class: com.tapjoy.TJEventOptimizer.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    TJEventOptimizer unused = TJEventOptimizer.f7706b = new TJEventOptimizer(context, (byte) 0);
                } catch (Exception e) {
                    TapjoyLog.w(TJEventOptimizer.f7705a, e.getMessage());
                }
                TJEventOptimizer.f7707c.countDown();
            }
        });
        f7707c.await();
        if (f7706b == null) {
            throw new RuntimeException("Failed to init TJEventOptimizer");
        }
    }

    public static TJEventOptimizer getInstance() {
        return f7706b;
    }

    class b extends WebViewClient {
        private b() {
        }

        /* synthetic */ b(TJEventOptimizer tJEventOptimizer, byte b2) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            TapjoyLog.e(TJEventOptimizer.f7705a, new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Error encountered when instantiating a WebViewClient"));
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            TapjoyLog.d(TJEventOptimizer.f7705a, "boostrap html loaded successfully");
        }
    }

    class a extends WebChromeClient {
        private a() {
        }

        /* synthetic */ a(TJEventOptimizer tJEventOptimizer, byte b2) {
            this();
        }

        @Override // android.webkit.WebChromeClient
        @TargetApi(8)
        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            TapjoyLog.d(TJEventOptimizer.f7705a, "JS CONSOLE: " + consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            return true;
        }
    }
}
