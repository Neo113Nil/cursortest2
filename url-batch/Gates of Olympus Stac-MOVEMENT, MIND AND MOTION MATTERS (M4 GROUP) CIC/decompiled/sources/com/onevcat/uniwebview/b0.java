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
import android.webkit.DownloadListener;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.imaginationoverflow.unity.referrer.BuildConfig;
import java.lang.reflect.Method;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* loaded from: classes.dex */
public final class b0 extends WebView implements w {
    public static final /* synthetic */ int i = 0;
    public final Activity a;
    public final String b;
    public final g5 c;
    public final n0 d;
    public final o0 e;
    public final a1 f;
    public boolean g;
    public boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Activity activity, ViewGroup containerView, ViewGroup videoView, String name, g5 messageSender, z4 loadingObserver) {
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
        this.h = true;
        b();
        n0 n0Var = new n0(activity, this, containerView, videoView, z.a());
        this.d = n0Var;
        setWebChromeClient(n0Var);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        o0 o0Var = new o0(context, this, loadingObserver);
        this.e = o0Var;
        setWebViewClient(o0Var);
        a1 a1Var = new a1(activity, name, messageSender, new x(this));
        this.f = a1Var;
        a1Var.a();
        a();
    }

    public static final boolean a(View view) {
        return true;
    }

    public final void a(String jsString, final String identifier) {
        Intrinsics.checkNotNullParameter(jsString, "jsString");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        o oVar = o.b;
        oVar.a(n.DEBUG, d.a("Adding JavaScript string to web view. Requesting string: ", jsString, oVar, "message"));
        evaluateJavascript(jsString, new ValueCallback() { // from class: com.onevcat.uniwebview.b0$$ExternalSyntheticLambda2
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                b0.a(identifier, this, (String) obj);
            }
        });
    }

    public final void b() {
        getSettings().setDatabaseEnabled(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setAllowContentAccess(true);
        getSettings().setGeolocationEnabled(true);
        getSettings().setDisplayZoomControls(false);
        getSettings().setAllowFileAccess(true);
        getSettings().setAllowFileAccessFromFileURLs(false);
        getSettings().setAllowUniversalAccessFromFileURLs(a0.d);
        getSettings().setMixedContentMode(2);
        getSettings().setJavaScriptEnabled(a0.c);
        getSettings().setMediaPlaybackRequiresUserGesture(!a0.a);
        getSettings().setJavaScriptCanOpenWindowsAutomatically(a0.b);
        String path = getContext().getCacheDir().getPath();
        WebSettings settings = getSettings();
        if (settings == null || path == null || path.length() == 0 || Build.VERSION.SDK_INT >= 33) {
            return;
        }
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

    public final void c() {
        o oVar = o.b;
        o oVar2 = o.b;
        oVar2.getClass();
        Intrinsics.checkNotNullParameter("Checking pop up web view in generalGoBack.", "message");
        n nVar = n.VERBOSE;
        oVar2.a(nVar, "Checking pop up web view in generalGoBack.");
        b0 b0Var = this.d.i;
        if (b0Var == null) {
            oVar2.getClass();
            Intrinsics.checkNotNullParameter("Checking main web view can go back...", "message");
            oVar2.a(nVar, "Checking main web view can go back...");
            if (canGoBack()) {
                goBack();
                return;
            }
            return;
        }
        if (b0Var.canGoBack()) {
            oVar2.getClass();
            Intrinsics.checkNotNullParameter("popupWebView can go back. Performing going back.", "message");
            oVar2.a(nVar, "popupWebView can go back. Performing going back.");
            b0Var.goBack();
            return;
        }
        oVar2.getClass();
        Intrinsics.checkNotNullParameter("popupWebView cannot go back. Performing close.", "message");
        oVar2.a(nVar, "popupWebView cannot go back. Performing close.");
        b0Var.evaluateJavascript("window.close()", null);
    }

    public final void d() {
        Object systemService = this.a.getSystemService("print");
        PrintManager printManager = systemService instanceof PrintManager ? (PrintManager) systemService : null;
        if (printManager == null) {
            o oVar = o.b;
            o oVar2 = o.b;
            oVar2.getClass();
            Intrinsics.checkNotNullParameter("Didn't find a valid print service in current activity. Abort printing...", "message");
            oVar2.a(n.CRITICAL, "Didn't find a valid print service in current activity. Abort printing...");
            return;
        }
        String url = getUrl();
        if (url != null) {
            PrintDocumentAdapter createPrintDocumentAdapter = createPrintDocumentAdapter(url);
            Intrinsics.checkNotNullExpressionValue(createPrintDocumentAdapter, "createPrintDocumentAdapter(targetUrl)");
            printManager.print("UniWebView Printing", createPrintDocumentAdapter, new PrintAttributes.Builder().build());
        } else {
            o oVar3 = o.b;
            o oVar4 = o.b;
            oVar4.getClass();
            Intrinsics.checkNotNullParameter("The URL of page is null. Abort printing...", "message");
            oVar4.a(n.CRITICAL, "The URL of page is null. Abort printing...");
        }
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        a1 a1Var = this.f;
        a1Var.a.unregisterReceiver(a1Var.g);
        super.destroy();
    }

    public final boolean getCalloutEnabled() {
        return this.h;
    }

    public final a1 getDownloader$uniwebview_release() {
        return this.f;
    }

    public final g5 getMessageSender() {
        return this.c;
    }

    public final String getName() {
        return this.b;
    }

    public final boolean getSendDownloadEventForContextMenu() {
        return this.g;
    }

    public final String getUserAgent() {
        String userAgentString = getSettings().getUserAgentString();
        Intrinsics.checkNotNullExpressionValue(userAgentString, "settings.userAgentString");
        return userAgentString;
    }

    public final n0 get_webChromeClient$uniwebview_release() {
        return this.d;
    }

    public final o0 get_webClient$uniwebview_release() {
        return this.e;
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        o oVar = o.b;
        String message = "UniWebView will load url: '" + url + "' with headers: " + this.e.g;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        o0 o0Var = this.e;
        o0Var.f = 200;
        o0Var.d = true;
        o0Var.c = false;
        o0Var.e = false;
        if (o0Var.h.a(url, true, this.b)) {
            return;
        }
        loadUrl(url, this.e.g);
    }

    @Override // android.view.View
    public final void onCreateContextMenu(ContextMenu contextMenu) {
        final String extra;
        if (this.h && contextMenu != null) {
            super.onCreateContextMenu(contextMenu);
            int type = getHitTestResult().getType();
            if ((type == 5 || type == 8) && (extra = getHitTestResult().getExtra()) != null) {
                String lowerCase = extra.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (StringsKt.startsWith$default(lowerCase, "http://", false, 2, (Object) null) || StringsKt.startsWith$default(lowerCase, "https://", false, 2, (Object) null)) {
                    contextMenu.setHeaderTitle(extra).add(0, 1, 0, getContext().getResources().getString(R.string.SAVE_IMAGE)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.onevcat.uniwebview.b0$$ExternalSyntheticLambda3
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            return b0.a(b0.this, extra, menuItem);
                        }
                    });
                }
            }
        }
    }

    public final void setAllowHTTPAuthPopUpWindow(boolean z) {
        this.e.j = z;
    }

    public final void setCalloutEnabled(boolean z) {
        this.h = z;
    }

    public final void setDefaultFontSize(int i2) {
        getSettings().setDefaultFontSize(MathKt.roundToInt(i2 / this.a.getResources().getConfiguration().fontScale));
    }

    public final void setDragInteractionEnabled(boolean z) {
        View.OnLongClickListener onLongClickListener;
        if (z) {
            setLongClickable(false);
            onLongClickListener = null;
        } else {
            setLongClickable(true);
            onLongClickListener = new View.OnLongClickListener() { // from class: com.onevcat.uniwebview.b0$$ExternalSyntheticLambda0
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return b0.a(view);
                }
            };
        }
        setOnLongClickListener(onLongClickListener);
    }

    public final void setOpenLinksInExternalBrowser(boolean z) {
        this.e.h.e = z;
    }

    public final void setSendDownloadEventForContextMenu(boolean z) {
        this.g = z;
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

    public final void b(String jsString, final String identifier) {
        Intrinsics.checkNotNullParameter(jsString, "jsString");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        o oVar = o.b;
        oVar.a(n.DEBUG, d.a("Evaluating JavaScript string within web view. Requesting string: ", jsString, oVar, "message"));
        evaluateJavascript(jsString, new ValueCallback() { // from class: com.onevcat.uniwebview.b0$$ExternalSyntheticLambda1
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                b0.b(identifier, this, (String) obj);
            }
        });
    }

    public static final void a(String identifier, b0 this$0, String it) {
        Intrinsics.checkNotNullParameter(identifier, "$identifier");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o oVar = o.b;
        o oVar2 = o.b;
        oVar2.a(n.INFO, d.a("Receive callback of adding JavaScript: ", it, oVar2, "message"));
        if (StringsKt.equals(it, "null", true)) {
            this$0.c.a(this$0.b, h5.AddJavaScriptFinished, new c5(identifier, "0", BuildConfig.FLAVOR, null));
        } else {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            this$0.c.a(this$0.b, h5.AddJavaScriptFinished, new c5(identifier, "-1", it, null));
        }
    }

    public static final void b(String identifier, b0 this$0, String it) {
        Intrinsics.checkNotNullParameter(identifier, "$identifier");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o oVar = o.b;
        o oVar2 = o.b;
        oVar2.a(n.INFO, d.a("Receive callback of evaluating JavaScript: ", it, oVar2, "message"));
        if (StringsKt.equals(it, "null", true)) {
            this$0.c.a(this$0.b, h5.EvalJavaScriptFinished, new c5(identifier, "0", BuildConfig.FLAVOR, null));
            return;
        }
        Intrinsics.checkNotNullExpressionValue(it, "it");
        String replace = new Regex("^\"|\"$").replace(it, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(replace, "<this>");
        StringBuilder sb = new StringBuilder(replace.length());
        int i2 = 0;
        while (i2 < replace.length()) {
            char charAt = replace.charAt(i2);
            char c = '\\';
            if (charAt == '\\') {
                char charAt2 = i2 == replace.length() - 1 ? '\\' : replace.charAt(i2 + 1);
                if ('0' > charAt2 || charAt2 >= '8') {
                    if (charAt2 != '\\') {
                        if (charAt2 == 'b') {
                            charAt = '\b';
                        } else if (charAt2 == 'n') {
                            charAt = '\n';
                        } else if (charAt2 == 'r') {
                            charAt = '\r';
                        } else if (charAt2 == 't') {
                            charAt = '\t';
                        } else {
                            c = Typography.quote;
                            if (charAt2 != '\"') {
                                c = '\'';
                                if (charAt2 != '\'') {
                                    c = 'u';
                                    if (charAt2 == 'u') {
                                        if (i2 < replace.length() - 5) {
                                            sb.append(Character.toChars(Integer.parseInt(BuildConfig.FLAVOR + replace.charAt(i2 + 2) + replace.charAt(i2 + 3) + replace.charAt(i2 + 4) + replace.charAt(i2 + 5), CharsKt.checkRadix(16))));
                                            i2 += 6;
                                        }
                                    }
                                }
                            }
                        }
                        i2++;
                    }
                    charAt = c;
                    i2++;
                } else {
                    String str = BuildConfig.FLAVOR + charAt2;
                    int i3 = i2 + 1;
                    if (i3 < replace.length() - 1) {
                        int i4 = i2 + 2;
                        if (Intrinsics.compare((int) replace.charAt(i4), 48) >= 0 && Intrinsics.compare((int) replace.charAt(i4), 55) <= 0) {
                            str = str + replace.charAt(i4);
                            if (i4 < replace.length() - 1) {
                                i3 = i2 + 3;
                                if (Intrinsics.compare((int) replace.charAt(i3), 48) >= 0 && Intrinsics.compare((int) replace.charAt(i3), 55) <= 0) {
                                    str = str + replace.charAt(i3);
                                }
                            }
                            i3 = i4;
                        }
                    }
                    sb.append((char) Integer.parseInt(str, CharsKt.checkRadix(8)));
                    i2 = i3 + 1;
                }
            }
            sb.append(charAt);
            i2++;
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        this$0.c.a(this$0.b, h5.EvalJavaScriptFinished, new c5(identifier, "0", sb2, null));
    }

    public final void a() {
        setDownloadListener(new DownloadListener() { // from class: com.onevcat.uniwebview.b0$$ExternalSyntheticLambda4
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                b0.a(b0.this, str, str2, str3, str4, j);
            }
        });
    }

    public static final void a(b0 this$0, String url, String str, String str2, String str3, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a1 a1Var = this$0.f;
        Intrinsics.checkNotNullExpressionValue(url, "url");
        a1Var.a(url, str2, str3, true);
    }

    public static final boolean a(b0 this$0, String originalUrl, MenuItem it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(originalUrl, "$originalUrl");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.f.a(originalUrl, null, MimeTypeMap.getFileExtensionFromUrl(originalUrl), this$0.g);
        return true;
    }

    public final void a(int i2, int i3, boolean z) {
        if (!z) {
            scrollTo(i2, i3);
            return;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "scrollX", getScrollX(), i2);
        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(this, "scrollY", getScrollY(), i3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofInt, ofInt2);
        animatorSet.setDuration(400L).start();
    }
}
