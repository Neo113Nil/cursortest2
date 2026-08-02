package com.startapp.sdk.internal;

import U1.C0080a;
import a.AbstractC0129a;
import android.content.Context;
import android.webkit.WebView;
import f0.C0322a;
import i1.AbstractC0341a;
import j1.AbstractC1053b;
import j1.C1052a;
import j1.EnumC1054c;
import j1.EnumC1055d;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import k1.C1078b;
import q1.AbstractC1180a;

/* loaded from: classes.dex */
public final class sd {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1053b f4427a;

    /* renamed from: b, reason: collision with root package name */
    public final C1052a f4428b;

    /* renamed from: c, reason: collision with root package name */
    public final C1078b f4429c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f4430d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f4431e = new AtomicBoolean();

    /* JADX WARN: Removed duplicated region for block: B:18:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sd(WebView webView) {
        WebView webView2;
        j1.i iVar;
        C1052a a3;
        try {
            try {
                Context context = webView.getContext();
                try {
                    try {
                        if (!AbstractC0341a.f5086a.f5087a) {
                            try {
                                AbstractC0341a.a(context);
                            } catch (Throwable th) {
                                th = th;
                                webView2 = webView;
                                d9.a(th);
                                iVar = null;
                                this.f4427a = iVar;
                                webView2.getContext();
                                if (iVar != null) {
                                }
                                a3 = null;
                                this.f4428b = a3;
                                this.f4429c = null;
                            }
                        }
                        AbstractC0129a.c("Startio", "Name is null or empty");
                        AbstractC0129a.c("5.3.0", "Version is null or empty");
                        webView2 = webView;
                        iVar = AbstractC1053b.b(C0322a.s(EnumC1055d.HTML_DISPLAY, j1.g.NONE), new l.t0(new C0080a(24), webView2, null, null, EnumC1054c.HTML));
                    } catch (Throwable th2) {
                        webView2 = webView;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    webView2 = webView;
                }
            } catch (Throwable th4) {
                th = th4;
                d9.a(th);
                iVar = null;
                this.f4427a = iVar;
                webView2.getContext();
                if (iVar != null) {
                }
                a3 = null;
                this.f4428b = a3;
                this.f4429c = null;
            }
        } catch (Throwable th5) {
            th = th5;
            webView2 = webView;
            d9.a(th);
            iVar = null;
            this.f4427a = iVar;
            webView2.getContext();
            if (iVar != null) {
            }
            a3 = null;
            this.f4428b = a3;
            this.f4429c = null;
        }
        this.f4427a = iVar;
        webView2.getContext();
        if (iVar != null) {
            try {
                a3 = C1052a.a(iVar);
            } catch (Throwable th6) {
                d9.a(th6);
            }
            this.f4428b = a3;
            this.f4429c = null;
        }
        a3 = null;
        this.f4428b = a3;
        this.f4429c = null;
    }

    public final void a() {
        if (this.f4428b == null || !this.f4430d.compareAndSet(false, true)) {
            return;
        }
        j1.i iVar = this.f4428b.f9515a;
        AbstractC0129a.f(iVar);
        iVar.f9541b.getClass();
        if (!iVar.f || iVar.f9545g) {
            try {
                iVar.e();
            } catch (Exception unused) {
            }
        }
        if (!iVar.f || iVar.f9545g) {
            return;
        }
        if (iVar.f9547i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
        AbstractC1180a abstractC1180a = iVar.f9544e;
        n1.i.f10160a.a(abstractC1180a.g(), "publishImpressionEvent", abstractC1180a.f10229a);
        iVar.f9547i = true;
    }

    public sd(Context context, List list, boolean z) {
        AbstractC1053b abstractC1053b;
        C1052a a3;
        C1078b c1078b = null;
        try {
            abstractC1053b = d0.a(context, list, z);
        } catch (Throwable th) {
            d9.a(th);
            abstractC1053b = null;
        }
        this.f4427a = abstractC1053b;
        if (abstractC1053b != null) {
            try {
                a3 = C1052a.a(abstractC1053b);
            } catch (Throwable th2) {
                d9.a(th2);
            }
            this.f4428b = a3;
            if (z && abstractC1053b != null) {
                try {
                    c1078b = C1078b.a(abstractC1053b);
                } catch (Throwable th3) {
                    d9.a(th3);
                }
            }
            this.f4429c = c1078b;
        }
        a3 = null;
        this.f4428b = a3;
        if (z) {
            c1078b = C1078b.a(abstractC1053b);
        }
        this.f4429c = c1078b;
    }
}
