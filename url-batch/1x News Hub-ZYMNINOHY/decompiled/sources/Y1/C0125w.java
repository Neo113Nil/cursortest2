package Y1;

import android.webkit.JavascriptInterface;

/* renamed from: Y1.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0125w {

    /* renamed from: a, reason: collision with root package name */
    public final String f1894a;

    /* renamed from: b, reason: collision with root package name */
    public final C0117n f1895b;

    public C0125w(String str, C0117n c0117n) {
        this.f1894a = str;
        this.f1895b = c0117n;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        C0117n c0117n = this.f1895b;
        c0117n.f1873a.c(new A1.a(this, 4, str));
    }
}
