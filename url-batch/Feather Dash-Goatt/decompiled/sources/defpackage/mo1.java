package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.CookieManager;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class mo1 extends WebViewClient {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ao0 b;
    public final /* synthetic */ ao0 c;
    public final /* synthetic */ ao0 d;
    public final /* synthetic */ ao0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ ao0 g;

    public mo1(Context context, ao0 ao0Var, ao0 ao0Var2, ao0 ao0Var3, ao0 ao0Var4, Function0 function0, ao0 ao0Var5) {
        this.a = context;
        this.b = ao0Var;
        this.c = ao0Var2;
        this.d = ao0Var3;
        this.e = ao0Var4;
        this.f = function0;
        this.g = ao0Var5;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(final WebView webView, String str) {
        CookieManager.getInstance().flush();
        final int intValue = ((Number) this.b.getValue()).intValue();
        if (webView == null) {
            this.d.setValue(Boolean.TRUE);
            m90.f(this.e, false);
        } else {
            final ao0 ao0Var = this.b;
            final ao0 ao0Var2 = this.d;
            final ao0 ao0Var3 = this.e;
            webView.postDelayed(new Runnable() { // from class: ko1
                @Override // java.lang.Runnable
                public final void run() {
                    ao0 ao0Var4 = ao0Var;
                    int intValue2 = ((Number) ao0Var4.getValue()).intValue();
                    int i = intValue;
                    if (i != intValue2) {
                        return;
                    }
                    ao0 ao0Var5 = ao0Var2;
                    boolean booleanValue = ((Boolean) ao0Var5.getValue()).booleanValue();
                    ao0 ao0Var6 = ao0Var3;
                    if (booleanValue) {
                        m90.f(ao0Var6, false);
                        return;
                    }
                    lo1 lo1Var = new lo1(i, ao0Var4, ao0Var5, ao0Var6);
                    WebView webView2 = webView;
                    webView2.postDelayed(new x4(webView2, 8, lo1Var), 250L);
                }
            }, 900L);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        ao0 ao0Var = this.b;
        ao0Var.setValue(Integer.valueOf(((Number) ao0Var.getValue()).intValue() + 1));
        if (str != null && !StringsKt.n(str)) {
            this.c.setValue(str);
        }
        if (((Boolean) this.d.getValue()).booleanValue()) {
            return;
        }
        m90.f(this.e, true);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        webView.getClass();
        webResourceRequest.getClass();
        webResourceError.getClass();
        if (webResourceRequest.isForMainFrame()) {
            int errorCode = webResourceError.getErrorCode();
            ao0 ao0Var = this.e;
            if (errorCode == -9) {
                ao0 ao0Var2 = this.c;
                if (!StringsKt.n((String) ao0Var2.getValue())) {
                    ao0 ao0Var3 = this.g;
                    if (!Intrinsics.a((String) ao0Var3.getValue(), (String) ao0Var2.getValue())) {
                        ao0Var3.setValue((String) ao0Var2.getValue());
                        m90.f(ao0Var, false);
                        webView.postDelayed(new x4(webView, 9, ao0Var2), 150L);
                        return;
                    }
                }
            }
            int errorCode2 = webResourceError.getErrorCode();
            if (errorCode2 == -6 || errorCode2 == -2 || errorCode2 == -7 || errorCode2 == -8) {
                this.f.invoke();
            } else {
                m90.f(ao0Var, false);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Object j31Var;
        webView.getClass();
        webResourceRequest.getClass();
        Uri url = webResourceRequest.getUrl();
        if (Intrinsics.a(url.getScheme(), "http") || Intrinsics.a(url.getScheme(), "https")) {
            return false;
        }
        Context context = this.a;
        try {
            i31 i31Var = k31.d;
            context.startActivity(new Intent("android.intent.action.VIEW", url).addFlags(268435456));
            j31Var = Boolean.TRUE;
        } catch (Throwable th) {
            i31 i31Var2 = k31.d;
            j31Var = new j31(th);
        }
        Object obj = Boolean.TRUE;
        if (j31Var instanceof j31) {
            j31Var = obj;
        }
        return ((Boolean) j31Var).booleanValue();
    }
}
