package com.onevcat.uniwebview;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintManager;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.DownloadListener;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.onevcat.uniwebview.internal.obfuscated.A;
import com.onevcat.uniwebview.internal.obfuscated.AbstractC0045e;
import com.onevcat.uniwebview.internal.obfuscated.B;
import com.onevcat.uniwebview.internal.obfuscated.C0;
import com.onevcat.uniwebview.internal.obfuscated.C0031b0;
import com.onevcat.uniwebview.internal.obfuscated.C0046e0;
import com.onevcat.uniwebview.internal.obfuscated.C0055g;
import com.onevcat.uniwebview.internal.obfuscated.F3;
import com.onevcat.uniwebview.internal.obfuscated.G3;
import com.onevcat.uniwebview.internal.obfuscated.H3;
import com.onevcat.uniwebview.internal.obfuscated.I;
import com.onevcat.uniwebview.internal.obfuscated.L;
import com.onevcat.uniwebview.internal.obfuscated.M;
import com.onevcat.uniwebview.internal.obfuscated.O;
import com.onevcat.uniwebview.internal.obfuscated.U;
import com.onevcat.uniwebview.internal.obfuscated.V;
import com.onevcat.uniwebview.internal.obfuscated.q3;
import com.onevcat.uniwebview.internal.obfuscated.r3;
import com.onevcat.uniwebview.internal.obfuscated.v3;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class a extends WebView {
    public static final /* synthetic */ int o = 0;
    public final Activity a;
    public final String b;
    public final G3 c;
    public final b d;
    public final c e;
    public final g f;
    public String g;
    public G3 h;
    public boolean i;
    public final r3 j;
    public final LinkedHashMap k;
    public final ArrayDeque l;
    public boolean m;
    public boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Activity activity, C0 containerView, FrameLayout videoView, String name, G3 messageSender, q3 loadingObserver) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(messageSender, "messageSender");
        Intrinsics.checkNotNullParameter(loadingObserver, "loadingObserver");
        this.a = activity;
        this.b = name;
        this.c = messageSender;
        this.g = name;
        this.h = messageSender;
        this.j = new r3(this);
        this.k = new LinkedHashMap();
        this.l = new ArrayDeque();
        this.n = true;
        getSettings().setDatabaseEnabled(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setAllowContentAccess(true);
        getSettings().setGeolocationEnabled(true);
        getSettings().setDisplayZoomControls(false);
        getSettings().setAllowFileAccess(true);
        getSettings().setAllowFileAccessFromFileURLs(false);
        getSettings().setAllowUniversalAccessFromFileURLs(O.d);
        getSettings().setMixedContentMode(2);
        getSettings().setJavaScriptEnabled(O.c);
        getSettings().setMediaPlaybackRequiresUserGesture(!O.a);
        getSettings().setJavaScriptCanOpenWindowsAutomatically(O.b);
        String path = getContext().getCacheDir().getPath();
        WebSettings settings = getSettings();
        if (settings != null && path != null && path.length() != 0 && Build.VERSION.SDK_INT < 33) {
            try {
                Class<?> cls = Class.forName("android.webkit.WebSettings");
                Method declaredMethod = cls.getDeclaredMethod("setAppCachePath", String.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(settings, path);
                Method declaredMethod2 = cls.getDeclaredMethod("setAppCacheEnabled", Boolean.TYPE);
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(settings, Boolean.TRUE);
            } catch (Throwable unused) {
            }
        }
        b bVar = new b(this.a, this, containerView, videoView, O.f);
        this.d = bVar;
        setWebChromeClient(bVar);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        c cVar = new c(context, this, loadingObserver);
        this.e = cVar;
        setWebViewClient(cVar);
        g gVar = new g(this.j, this.a, new M(this));
        this.f = gVar;
        gVar.a();
        a();
        Intrinsics.checkNotNullParameter(this, "webView");
        B b = B.b;
        V messageProvider = new V(this);
        b.getClass();
        Intrinsics.checkNotNullParameter(messageProvider, "messageProvider");
        b.a(A.DEBUG, messageProvider);
        Object c0031b0 = new C0031b0(this);
        Object c0046e0 = new C0046e0(this);
        addJavascriptInterface(c0031b0, "_UniWebViewChannelMessageHandler");
        addJavascriptInterface(c0046e0, "_UniWebViewSyncCall");
    }

    public static final boolean a(View view) {
        return true;
    }

    public final void a(String popupName) {
        Intrinsics.checkNotNullParameter(popupName, "popupName");
        Intrinsics.checkNotNullParameter(popupName, "popupName");
        a aVar = (a) this.k.get(popupName);
        if (aVar != null) {
            aVar.evaluateJavascript("window.close()", null);
        }
    }

    public final void b(String popupName) {
        Intrinsics.checkNotNullParameter(popupName, "popupName");
        Intrinsics.checkNotNullParameter(popupName, "popupName");
        a aVar = (a) this.k.get(popupName);
        if (aVar == null) {
            return;
        }
        if (aVar.canGoBack()) {
            aVar.goBack();
        } else {
            aVar.evaluateJavascript("window.close()", null);
        }
    }

    public final void c(String jsString, final String identifier) {
        Intrinsics.checkNotNullParameter(jsString, "jsString");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        B b = B.b;
        b.a(A.DEBUG, AbstractC0045e.a("Evaluating JavaScript string within web view. Requesting string: ", jsString, b, "message"));
        evaluateJavascript(jsString, new ValueCallback() { // from class: com.onevcat.uniwebview.a$$ExternalSyntheticLambda5
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                a.b(identifier, this, (String) obj);
            }
        });
    }

    public final void d() {
        Object systemService = this.a.getSystemService("print");
        PrintManager printManager = systemService instanceof PrintManager ? (PrintManager) systemService : null;
        if (printManager == null) {
            B b = B.b;
            b.getClass();
            Intrinsics.checkNotNullParameter("Didn't find a valid print service in current activity. Abort printing...", "message");
            b.a(A.CRITICAL, "Didn't find a valid print service in current activity. Abort printing...");
            return;
        }
        String url = getUrl();
        if (url != null) {
            PrintDocumentAdapter createPrintDocumentAdapter = createPrintDocumentAdapter(url);
            Intrinsics.checkNotNullExpressionValue(createPrintDocumentAdapter, "createPrintDocumentAdapter(targetUrl)");
            printManager.print("UniWebView Printing", createPrintDocumentAdapter, new PrintAttributes.Builder().build());
        } else {
            B b2 = B.b;
            b2.getClass();
            Intrinsics.checkNotNullParameter("The URL of page is null. Abort printing...", "message");
            b2.a(A.CRITICAL, "The URL of page is null. Abort printing...");
        }
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        b();
        stopLoading();
        loadUrl("about:blank");
        removeJavascriptInterface("UniWebViewBlobHandler");
        removeJavascriptInterface("_UniWebViewChannelMessageHandler");
        removeJavascriptInterface("_UniWebViewSyncCall");
        removeJavascriptInterface("UniWebViewTransparencyBridge");
        setWebChromeClient(null);
        setWebViewClient(new WebViewClient());
        setDownloadListener(null);
        removeAllViews();
        g gVar = this.f;
        gVar.b.unregisterReceiver(gVar.h);
        Toast toast = gVar.f;
        if (toast != null) {
            toast.cancel();
        }
        gVar.f = null;
        super.destroy();
    }

    public final a e() {
        if (Intrinsics.areEqual(this.g, this.b)) {
            return this;
        }
        C0055g c0055g = C0055g.b;
        String name = this.g;
        c0055g.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        d dVar = (d) c0055g.a.get(name);
        if (dVar != null) {
            return dVar.v;
        }
        return null;
    }

    public final a f() {
        while (!this.l.isEmpty()) {
            a aVar = (a) this.k.get((String) this.l.peekLast());
            if (aVar != null) {
                return aVar;
            }
            this.l.removeLast();
        }
        return null;
    }

    public final boolean getCalloutEnabled() {
        return this.n;
    }

    public final g getDownloader() {
        return this.f;
    }

    public final G3 getMessageSender() {
        return this.c;
    }

    public final String getMessageTargetName$uniwebview_release() {
        return this.g;
    }

    public final String getName() {
        return this.b;
    }

    public final boolean getPopupPageEventEnabled$uniwebview_release() {
        return this.i;
    }

    public final G3 getRootMessageSender$uniwebview_release() {
        return this.h;
    }

    public final boolean getSendDownloadEventForContextMenu() {
        return this.m;
    }

    public final F3 getUnityMessageDispatcher$uniwebview_release() {
        return this.j;
    }

    public final String getUserAgent() {
        String userAgentString = getSettings().getUserAgentString();
        Intrinsics.checkNotNullExpressionValue(userAgentString, "settings.userAgentString");
        return userAgentString;
    }

    public final b get_webChromeClient$uniwebview_release() {
        return this.d;
    }

    public final c get_webClient$uniwebview_release() {
        return this.e;
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        B b = B.b;
        String message = "UniWebView will load url: '" + url + "' with headers: " + this.e.g;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        c cVar = this.e;
        cVar.f = 200;
        cVar.d = true;
        cVar.c = false;
        cVar.e = false;
        if (cVar.h.a(url, true, true, this.b)) {
            return;
        }
        loadUrl(url, this.e.g);
    }

    @Override // android.view.View
    public final void onCreateContextMenu(ContextMenu contextMenu) {
        final String extra;
        if (this.n && contextMenu != null) {
            super.onCreateContextMenu(contextMenu);
            int type = getHitTestResult().getType();
            if ((type == 5 || type == 8) && (extra = getHitTestResult().getExtra()) != null) {
                String lowerCase = extra.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (StringsKt.startsWith$default(lowerCase, "http://", false, 2, (Object) null) || StringsKt.startsWith$default(lowerCase, "https://", false, 2, (Object) null)) {
                    contextMenu.setHeaderTitle(extra).add(0, 1, 0, getContext().getResources().getString(R.string.SAVE_IMAGE)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.onevcat.uniwebview.a$$ExternalSyntheticLambda6
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            return a.a(a.this, extra, menuItem);
                        }
                    });
                }
            }
        }
    }

    public final void setAllowHTTPAuthPopUpWindow(boolean z) {
        this.e.l = z;
    }

    public final void setCalloutEnabled(boolean z) {
        this.n = z;
    }

    public final void setDefaultFontSize(int i) {
        getSettings().setDefaultFontSize(MathKt.roundToInt(i / this.a.getResources().getConfiguration().fontScale));
    }

    public final void setDragInteractionEnabled(boolean z) {
        if (z) {
            setLongClickable(false);
            setOnLongClickListener(null);
        } else {
            setLongClickable(true);
            setOnLongClickListener(new View.OnLongClickListener() { // from class: com.onevcat.uniwebview.a$$ExternalSyntheticLambda1
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return a.a(view);
                }
            });
        }
    }

    public final void setMessageTargetName$uniwebview_release(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.g = str;
    }

    public final void setOpenLinksInExternalBrowser(boolean z) {
        this.e.h.e = z;
    }

    public final void setPopupPageEventEnabled(boolean z) {
        this.i = z;
    }

    public final void setPopupPageEventEnabled$uniwebview_release(boolean z) {
        this.i = z;
    }

    public final void setRootMessageSender$uniwebview_release(G3 g3) {
        Intrinsics.checkNotNullParameter(g3, "<set-?>");
        this.h = g3;
    }

    public final void setSendDownloadEventForContextMenu(boolean z) {
        this.m = z;
    }

    public final void setUserAgent(String userAgent) {
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        getSettings().setUserAgentString(userAgent);
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        this.e.c = true;
        super.stopLoading();
    }

    public final void c() {
        B b = B.b;
        b.getClass();
        Intrinsics.checkNotNullParameter("Checking pop up web view in generalGoBack.", "message");
        A a = A.VERBOSE;
        b.a(a, "Checking pop up web view in generalGoBack.");
        a f = f();
        if (f != null) {
            if (f.canGoBack()) {
                Intrinsics.checkNotNullParameter("popupWebView can go back. Performing going back.", "message");
                b.a(a, "popupWebView can go back. Performing going back.");
                f.goBack();
                return;
            } else {
                Intrinsics.checkNotNullParameter("popupWebView cannot go back. Performing close.", "message");
                b.a(a, "popupWebView cannot go back. Performing close.");
                f.evaluateJavascript("window.close()", null);
                return;
            }
        }
        Intrinsics.checkNotNullParameter("Checking main web view can go back...", "message");
        b.a(a, "Checking main web view can go back...");
        if (canGoBack()) {
            goBack();
        }
    }

    public final void c(String popupName) {
        Intrinsics.checkNotNullParameter(popupName, "popupName");
        this.k.remove(popupName);
        this.l.remove(popupName);
    }

    public final void a(String popupName, String jsString, final String identifier, final String callbackName) {
        Intrinsics.checkNotNullParameter(popupName, "popupName");
        Intrinsics.checkNotNullParameter(jsString, "jsString");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(callbackName, "callbackName");
        Intrinsics.checkNotNullParameter(popupName, "popupName");
        a aVar = (a) this.k.get(popupName);
        if (aVar == null) {
            this.h.a(callbackName, new v3(identifier, "-1", "Popup window is unavailable.", null));
        } else {
            aVar.evaluateJavascript(jsString, new ValueCallback() { // from class: com.onevcat.uniwebview.a$$ExternalSyntheticLambda0
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    a.a(identifier, this, callbackName, (String) obj);
                }
            });
        }
    }

    public static final void b(String str, String str2) {
        B b = B.b;
        String message = L.a("Finished fetching content: ", str, ". Result: ", str2, b);
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
    }

    public static final void b(String identifier, a this$0, String it) {
        Intrinsics.checkNotNullParameter(identifier, "$identifier");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        B b = B.b;
        b.a(A.INFO, AbstractC0045e.a("Receive callback of evaluating JavaScript: ", it, b, "message"));
        if (StringsKt.equals(it, "null", true)) {
            this$0.a(H3.EvalJavaScriptFinished, new v3(identifier, "0", "", null));
        } else {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            this$0.a(H3.EvalJavaScriptFinished, new v3(identifier, "0", I.a(new Regex("^\"|\"$").replace(it, "")), null));
        }
    }

    public final void b() {
        Collection values = this.k.values();
        Intrinsics.checkNotNullExpressionValue(values, "popupWebViews.values");
        List<a> list = CollectionsKt.toList(values);
        this.k.clear();
        this.l.clear();
        for (a aVar : list) {
            ViewParent parent = aVar.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(aVar);
            }
            aVar.destroy();
        }
    }

    public final void a(String jsString, final String identifier) {
        Intrinsics.checkNotNullParameter(jsString, "jsString");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        B b = B.b;
        b.a(A.DEBUG, AbstractC0045e.a("Adding JavaScript string to web view. Requesting string: ", jsString, b, "message"));
        evaluateJavascript(jsString, new ValueCallback() { // from class: com.onevcat.uniwebview.a$$ExternalSyntheticLambda2
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                a.a(identifier, this, (String) obj);
            }
        });
    }

    public static final void a(String identifier, a this$0, String it) {
        Intrinsics.checkNotNullParameter(identifier, "$identifier");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        B b = B.b;
        b.a(A.INFO, AbstractC0045e.a("Receive callback of adding JavaScript: ", it, b, "message"));
        if (StringsKt.equals(it, "null", true)) {
            this$0.a(H3.AddJavaScriptFinished, new v3(identifier, "0", "", null));
        } else {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            this$0.a(H3.AddJavaScriptFinished, new v3(identifier, "-1", it, null));
        }
    }

    public final void a() {
        addJavascriptInterface(new U(this.f), "UniWebViewBlobHandler");
        setDownloadListener(new DownloadListener() { // from class: com.onevcat.uniwebview.a$$ExternalSyntheticLambda3
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                a.a(a.this, str, str2, str3, str4, j);
            }
        });
    }

    public static final void a(a this$0, final String url, String str, String str2, String str3, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.f.d) {
            B b = B.b;
            b.a(A.INFO, AbstractC0045e.a("Auto download disabled. Ignore download request: ", url, b, "message"));
            return;
        }
        Intrinsics.checkNotNullExpressionValue(url, "url");
        if (StringsKt.startsWith$default(url, "blob:", false, 2, (Object) null)) {
            B b2 = B.b;
            b2.a(A.INFO, AbstractC0045e.a("Detected a blob url. Start fetching content: ", url, b2, "message"));
            this$0.evaluateJavascript("\n                    function uv_downloadBlob(blobUrl, callback) {\n                      fetch(blobUrl)\n                        .then(response => response.blob())\n                        .then(blob => {\n                          const reader = new FileReader();\n                          reader.onloadend = () => {\n                            callback(reader.result);\n                          };\n                          reader.readAsDataURL(blob);\n                        }\n                      )\n                      .catch(error => console.error('Error fetching blob:', error));\n                    }\n                    \n                uv_downloadBlob('" + url + "', function(uri) { UniWebViewBlobHandler.handleDataURI(uri); });", new ValueCallback() { // from class: com.onevcat.uniwebview.a$$ExternalSyntheticLambda4
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    a.b(url, (String) obj);
                }
            });
            return;
        }
        this$0.f.a(url, str2, str3, true);
    }

    public static final boolean a(a this$0, String originalUrl, MenuItem it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(originalUrl, "$originalUrl");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.f.a(originalUrl, null, MimeTypeMap.getFileExtensionFromUrl(originalUrl), this$0.m);
        return true;
    }

    public final void a(String parameters, boolean z) {
        Intrinsics.checkNotNullParameter(parameters, "identifier");
        clearCache(true);
        clearHistory();
        clearFormData();
        if (z) {
            WebStorage.getInstance().deleteAllData();
        }
        H3 method = H3.GeneralCallback;
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.j.a(method, parameters);
    }

    public final void a(a popup) {
        Intrinsics.checkNotNullParameter(popup, "popup");
        String str = popup.b;
        this.k.put(str, popup);
        this.l.remove(str);
        this.l.addLast(str);
    }

    public static final void a(String identifier, a this$0, String callbackName, String it) {
        Intrinsics.checkNotNullParameter(identifier, "$identifier");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callbackName, "$callbackName");
        if (StringsKt.equals(it, "null", true)) {
            this$0.h.a(callbackName, new v3(identifier, "0", "", null));
        } else {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            this$0.h.a(callbackName, new v3(identifier, "0", I.a(new Regex("^\"|\"$").replace(it, "")), null));
        }
    }

    public final void a(H3 method, v3 payload) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(payload, "payload");
        r3 r3Var = this.j;
        r3Var.getClass();
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(payload, "payload");
        r3Var.a(method, payload.a());
    }

    public final void a(int i, int i2, boolean z) {
        if (z) {
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "scrollX", getScrollX(), i);
            ObjectAnimator ofInt2 = ObjectAnimator.ofInt(this, "scrollY", getScrollY(), i2);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofInt, ofInt2);
            animatorSet.setDuration(400L).start();
            return;
        }
        scrollTo(i, i2);
    }
}
