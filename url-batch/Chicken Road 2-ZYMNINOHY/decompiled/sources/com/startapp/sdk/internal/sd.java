package com.startapp.sdk.internal;

import android.content.Context;
import android.webkit.WebView;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class sd {

    /* renamed from: a, reason: collision with root package name */
    public final F2.b f7564a;

    /* renamed from: b, reason: collision with root package name */
    public final F2.a f7565b;

    /* renamed from: c, reason: collision with root package name */
    public final G2.b f7566c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f7567d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f7568e = new AtomicBoolean();

    /* JADX WARN: Removed duplicated region for block: B:16:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sd(WebView webView) {
        WebView webView2;
        F2.i iVar;
        F2.a a3;
        try {
            try {
                Context context = webView.getContext();
                try {
                    if (!E2.a.f674a.f675a) {
                        try {
                            E2.a.a(context);
                        } catch (Throwable th) {
                            th = th;
                            webView2 = webView;
                            d9.a(th);
                            iVar = null;
                            this.f7564a = iVar;
                            webView2.getContext();
                            if (iVar != null) {
                            }
                            a3 = null;
                            this.f7565b = a3;
                            this.f7566c = null;
                        }
                    }
                    V3.b.c("Startio", "Name is null or empty");
                    V3.b.c("5.3.0", "Version is null or empty");
                    webView2 = webView;
                    iVar = F2.b.b(l2.e.l(F2.d.HTML_DISPLAY, F2.g.NONE), new k.q0(new a2.i(4), webView2, null, null, F2.c.HTML));
                } catch (Throwable th2) {
                    th = th2;
                    webView2 = webView;
                }
            } catch (Throwable th3) {
                th = th3;
                webView2 = webView;
                d9.a(th);
                iVar = null;
                this.f7564a = iVar;
                webView2.getContext();
                if (iVar != null) {
                }
                a3 = null;
                this.f7565b = a3;
                this.f7566c = null;
            }
        } catch (Throwable th4) {
            th = th4;
            d9.a(th);
            iVar = null;
            this.f7564a = iVar;
            webView2.getContext();
            if (iVar != null) {
            }
            a3 = null;
            this.f7565b = a3;
            this.f7566c = null;
        }
        this.f7564a = iVar;
        webView2.getContext();
        if (iVar != null) {
            try {
                a3 = F2.a.a(iVar);
            } catch (Throwable th5) {
                d9.a(th5);
            }
            this.f7565b = a3;
            this.f7566c = null;
        }
        a3 = null;
        this.f7565b = a3;
        this.f7566c = null;
    }

    public final void a() {
        if (this.f7565b == null || !this.f7567d.compareAndSet(false, true)) {
            return;
        }
        F2.i iVar = this.f7565b.f755a;
        V3.b.e(iVar);
        iVar.f782b.getClass();
        if (!iVar.f786f || iVar.f787g) {
            try {
                iVar.e();
            } catch (Exception unused) {
            }
        }
        if (!iVar.f786f || iVar.f787g) {
            return;
        }
        if (iVar.f789i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
        M2.a aVar = iVar.f785e;
        J2.i.f1185a.a(aVar.g(), "publishImpressionEvent", aVar.f1749a);
        iVar.f789i = true;
    }

    public sd(Context context, List list, boolean z) {
        F2.b bVar;
        F2.a a3;
        G2.b bVar2 = null;
        try {
            bVar = d0.a(context, list, z);
        } catch (Throwable th) {
            d9.a(th);
            bVar = null;
        }
        this.f7564a = bVar;
        if (bVar != null) {
            try {
                a3 = F2.a.a(bVar);
            } catch (Throwable th2) {
                d9.a(th2);
            }
            this.f7565b = a3;
            if (z && bVar != null) {
                try {
                    bVar2 = G2.b.a(bVar);
                } catch (Throwable th3) {
                    d9.a(th3);
                }
            }
            this.f7566c = bVar2;
        }
        a3 = null;
        this.f7565b = a3;
        if (z) {
            bVar2 = G2.b.a(bVar);
        }
        this.f7566c = bVar2;
    }
}
