package com.baidu.ar;

import android.R;
import android.content.Context;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.baidu.ar.arplay.core.engine.ARPDataInteraction;
import com.baidu.ar.arplay.core.engine.ARPEngine;
import com.baidu.ar.arplay.core.message.ARPMessage;
import com.baidu.ar.arplay.util.LogUtil;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.ar.s4;
import com.baidu.mapapi.SDKInitializer;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class t4 {

    /* renamed from: l, reason: collision with root package name */
    public static volatile t4 f3273l;

    /* renamed from: a, reason: collision with root package name */
    public Context f3274a;

    /* renamed from: b, reason: collision with root package name */
    public ViewGroup f3275b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnTouchListener f3276c;

    /* renamed from: d, reason: collision with root package name */
    public View.OnTouchListener f3277d;

    /* renamed from: f, reason: collision with root package name */
    public ViewGroup f3279f;

    /* renamed from: g, reason: collision with root package name */
    public WebView f3280g;

    /* renamed from: e, reason: collision with root package name */
    public List<s4> f3278e = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f3281h = true;

    /* renamed from: i, reason: collision with root package name */
    public Handler f3282i = new a(Looper.getMainLooper());

    /* renamed from: j, reason: collision with root package name */
    public WebViewClient f3283j = new f();

    /* renamed from: k, reason: collision with root package name */
    public WebChromeClient f3284k = new g();

    public class a extends Handler {

        /* renamed from: com.baidu.ar.t4$a$a, reason: collision with other inner class name */
        public class C0042a implements ValueCallback<String> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ s4 f3286a;

            public C0042a(s4 s4Var) {
                this.f3286a = s4Var;
            }

            @Override // android.webkit.ValueCallback
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onReceiveValue(String str) {
                this.f3286a.invalidate();
                this.f3286a.setIsNeedRender(true);
                t4.this.b(((Integer) this.f3286a.getTag()).intValue());
            }
        }

        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            s4 c8;
            String str;
            super.handleMessage(message);
            Object obj = message.obj;
            s4.b bVar = obj instanceof s4.b ? (s4.b) obj : null;
            switch (message.what) {
                case 103:
                    t4.this.b(bVar);
                    break;
                case 104:
                    if (bVar != null && (c8 = t4.this.c(bVar.f3197a)) != null && (str = bVar.f3199c) != null) {
                        c8.evaluateJavascript(str, new C0042a(c8));
                        break;
                    }
                    break;
                case 105:
                    s4 c9 = t4.this.c(message.arg1);
                    if (c9 != null) {
                        c9.setIsNeedRender(true);
                        c9.invalidate();
                        break;
                    }
                    break;
                case 106:
                    t4.this.d(bVar);
                    break;
            }
        }
    }

    public class b implements ARPDataInteraction.a {
        public b() {
        }

        @Override // com.baidu.ar.arplay.core.engine.ARPDataInteraction.a
        public boolean a(int i8, int i9) {
            t4.this.d(i8);
            return true;
        }
    }

    public class c implements View.OnTouchListener {
        public c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (t4.this.f3277d != null) {
                return t4.this.f3277d.onTouch(view, motionEvent);
            }
            return false;
        }
    }

    public class d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s4 f3290a;

        public d(s4 s4Var) {
            this.f3290a = s4Var;
        }

        @JavascriptInterface
        public void updateFinish(String str) {
            s4 s4Var = this.f3290a;
            if (s4Var == null) {
                return;
            }
            t4.this.d(((Integer) s4Var.getTag()).intValue());
        }
    }

    public class e implements View.OnTouchListener {
        public e() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (t4.this.f3276c != null) {
                return t4.this.f3276c.onTouch(view, motionEvent);
            }
            return false;
        }
    }

    public class f extends WebViewClient {
        public f() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageCommitVisible(WebView webView, String str) {
            super.onPageCommitVisible(webView, str);
            int intValue = ((Integer) webView.getTag()).intValue();
            t4.this.a(intValue);
            t4.this.d(intValue);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            int errorCode;
            CharSequence description;
            CharSequence description2;
            if (webResourceError != null) {
                i iVar = new i(t4.this);
                errorCode = webResourceError.getErrorCode();
                iVar.f3297b = errorCode;
                description = webResourceError.getDescription();
                if (description != null) {
                    description2 = webResourceError.getDescription();
                    iVar.f3298c = description2.toString();
                }
                t4.this.a(((Integer) webView.getTag()).intValue(), iVar);
            }
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            if (webResourceResponse != null) {
                i iVar = new i(t4.this);
                iVar.f3297b = webResourceResponse.getStatusCode();
                iVar.f3298c = webResourceResponse.getReasonPhrase();
                t4.this.a(((Integer) webView.getTag()).intValue(), iVar);
            }
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (sslError != null) {
                i iVar = new i(t4.this);
                iVar.f3297b = sslError.getPrimaryError();
                iVar.f3298c = "ssl error!";
                t4.this.a(((Integer) webView.getTag()).intValue(), iVar);
            }
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    public class g extends WebChromeClient {
        public g() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i8) {
            super.onProgressChanged(webView, i8);
            if (i8 == 100) {
                t4.this.d(((s4) webView).getWebViewData().f3197a);
            }
        }
    }

    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LogUtil.b(t4.class.getName(), "remove webviewList in ui thread");
            if (t4.this.f3278e != null) {
                for (s4 s4Var : t4.this.f3278e) {
                    if (s4Var != null) {
                        if (s4Var.getParent() == t4.this.f3275b) {
                            t4.this.f3275b.removeView(s4Var);
                        }
                        s4Var.destroy();
                    }
                }
                t4.this.f3278e.clear();
                t4.this.f3278e = null;
            }
        }
    }

    public class i {

        /* renamed from: a, reason: collision with root package name */
        public String f3296a = HttpConstants.OS_TYPE_VALUE;

        /* renamed from: b, reason: collision with root package name */
        public int f3297b = 0;

        /* renamed from: c, reason: collision with root package name */
        public String f3298c;

        public i(t4 t4Var) {
        }
    }

    public void e(s4.b bVar) {
        if (this.f3281h) {
            Message obtainMessage = this.f3282i.obtainMessage();
            obtainMessage.what = 104;
            obtainMessage.obj = bVar;
            s4 c8 = c(bVar.f3197a);
            if (c8 != null) {
                c8.setWebViewData(bVar);
                this.f3282i.sendMessage(obtainMessage);
            }
        }
    }

    public final s4 a(int i8, int i9) {
        s4 s4Var = new s4(this.f3274a);
        ViewGroup viewGroup = this.f3275b;
        ViewGroup.LayoutParams layoutParams = viewGroup instanceof FrameLayout ? new FrameLayout.LayoutParams(i8, i9) : viewGroup instanceof LinearLayout ? new LinearLayout.LayoutParams(i8, i9) : viewGroup instanceof RelativeLayout ? new RelativeLayout.LayoutParams(i8, i9) : null;
        s4Var.setBackgroundColor(R.color.transparent);
        s4Var.setWebViewClient(this.f3283j);
        s4Var.setWebChromeClient(this.f3284k);
        s4Var.setHorizontalScrollBarEnabled(false);
        s4Var.setVerticalScrollBarEnabled(false);
        WebSettings settings = s4Var.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        settings.setJavaScriptEnabled(true);
        s4Var.addJavascriptInterface(new d(s4Var), "NativeCallback");
        s4Var.setOnTouchListener(new e());
        this.f3275b.addView(s4Var, layoutParams);
        this.f3278e.add(s4Var);
        return s4Var;
    }

    public final void b(int i8) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("event_name", "webView_operation_update_finish");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("texture_id", Integer.valueOf(i8));
        hashMap.put("event_data", hashMap2);
        ARPMessage.getInstance().sendMessage(1902, hashMap);
    }

    public final s4 c(int i8) {
        for (s4 s4Var : this.f3278e) {
            if (s4Var != null && s4Var.getWebViewData() != null && s4Var.getWebViewData().f3197a == i8) {
                return s4Var;
            }
        }
        return null;
    }

    public void d() {
        this.f3274a = null;
        mc.a().b();
        ARPEngine.getInstance().setHtmlUpdateCallback(null);
        Handler handler = this.f3282i;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            a(new h());
            this.f3282i = null;
        }
        this.f3281h = false;
        f3273l = null;
        this.f3280g = null;
        this.f3277d = null;
    }

    public void b(Context context, ViewGroup viewGroup, View.OnTouchListener onTouchListener) {
        this.f3274a = context;
        this.f3279f = viewGroup;
        this.f3277d = onTouchListener;
    }

    public void c(s4.b bVar) {
        if (this.f3281h) {
            Message obtainMessage = this.f3282i.obtainMessage();
            obtainMessage.what = 106;
            obtainMessage.obj = bVar;
            this.f3282i.sendMessage(obtainMessage);
        }
    }

    public final void d(int i8) {
        if (this.f3281h) {
            Message obtainMessage = this.f3282i.obtainMessage();
            obtainMessage.what = 105;
            obtainMessage.arg1 = i8;
            this.f3282i.sendMessage(obtainMessage);
        }
    }

    public static t4 a() {
        if (f3273l == null) {
            synchronized (t4.class) {
                try {
                    if (f3273l == null) {
                        f3273l = new t4();
                    }
                } finally {
                }
            }
        }
        return f3273l;
    }

    public final void b(s4.b bVar) {
        if (bVar == null || !c()) {
            return;
        }
        s4 a8 = a(bVar.f3201e, bVar.f3202f);
        a8.setWebViewData(bVar);
        mc.a().a(bVar.f3197a, bVar.f3201e, bVar.f3202f);
        a8.setTag(Integer.valueOf(bVar.f3197a));
        String str = bVar.f3200d;
        if (!bVar.f3198b) {
            str = "file://" + this.f3274a.getFilesDir().getAbsolutePath().concat(File.separator) + "ar/" + str;
        }
        a8.loadUrl(str);
        a8.invalidate();
        a8.setIsNeedRender(true);
        e(bVar);
    }

    public final void d(s4.b bVar) {
        if (bVar == null || !b()) {
            return;
        }
        if (this.f3280g == null) {
            WebView webView = new WebView(this.f3274a);
            this.f3280g = webView;
            webView.setBackgroundColor(R.color.transparent);
            WebSettings settings = this.f3280g.getSettings();
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
            settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
            settings.setJavaScriptEnabled(true);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            this.f3280g.setOnTouchListener(new c());
            this.f3279f.addView(this.f3280g, layoutParams);
        }
        String str = bVar.f3200d;
        if (!bVar.f3198b) {
            str = "file://" + this.f3274a.getFilesDir().getAbsolutePath().concat(File.separator) + "ar/" + str;
        }
        this.f3280g.loadUrl(str);
        this.f3280g.invalidate();
    }

    public final boolean c() {
        if (this.f3274a != null && this.f3275b != null) {
            return true;
        }
        Log.e("GLWebView", "GLWebView context or root is null!");
        return false;
    }

    public final void a(int i8) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("event_name", "webView_operation_load_finish");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("texture_id", Integer.valueOf(i8));
        hashMap.put("event_data", hashMap2);
        ARPMessage.getInstance().sendMessage(1902, hashMap);
    }

    public final void a(int i8, i iVar) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("event_name", "webView_operation_load_failed");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("texture_id", Integer.valueOf(i8));
        HashMap hashMap3 = new HashMap();
        hashMap3.put("platform", iVar.f3296a);
        hashMap3.put(SDKInitializer.SDK_BROADTCAST_INTENT_EXTRA_INFO_KEY_ERROR_CODE, Integer.valueOf(iVar.f3297b));
        hashMap3.put("error_msg", iVar.f3298c);
        hashMap2.put("data", hashMap3);
        hashMap.put("event_data", hashMap2);
        ARPMessage.getInstance().sendMessage(1902, hashMap);
        d(i8);
    }

    public final boolean b() {
        if (this.f3274a != null && this.f3279f != null) {
            return true;
        }
        Log.e("GLWebView", "Native WebView context or root is null!");
        return false;
    }

    public void a(Context context, ViewGroup viewGroup, View.OnTouchListener onTouchListener) {
        this.f3274a = context;
        this.f3275b = viewGroup;
        this.f3276c = onTouchListener;
        ARPEngine.getInstance().setHtmlUpdateCallback(new b());
    }

    public void a(s4.b bVar) {
        if (this.f3281h) {
            Message obtainMessage = this.f3282i.obtainMessage();
            obtainMessage.what = 103;
            obtainMessage.obj = bVar;
            this.f3282i.sendMessage(obtainMessage);
        }
    }

    public void a(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            this.f3282i.post(runnable);
        }
    }

    public void a(String str) {
    }
}
