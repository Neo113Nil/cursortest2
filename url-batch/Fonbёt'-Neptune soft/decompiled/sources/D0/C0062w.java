package D0;

import android.webkit.JavascriptInterface;

/* renamed from: D0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0062w {

    /* renamed from: a, reason: collision with root package name */
    public final String f414a;

    /* renamed from: b, reason: collision with root package name */
    public final C0050j f415b;

    public C0062w(String str, C0050j c0050j) {
        this.f414a = str;
        this.f415b = c0050j;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        C0050j c0050j = this.f415b;
        c0050j.f366a.c(new RunnableC0061v(0, this, str));
    }
}
