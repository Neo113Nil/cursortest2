package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.Iterator;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.wj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4130wj implements InterfaceC2608Ik, InterfaceC2506Ck {

    /* renamed from: n, reason: collision with root package name */
    public final Context f35053n;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC3858rh f35054u;

    /* renamed from: v, reason: collision with root package name */
    public final Ut f35055v;

    /* renamed from: w, reason: collision with root package name */
    public final C5107a f35056w;

    /* renamed from: x, reason: collision with root package name */
    public C3330hq f35057x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f35058y;

    /* renamed from: z, reason: collision with root package name */
    public final C3276gq f35059z;

    public C4130wj(Context context, InterfaceC3858rh interfaceC3858rh, Ut ut, C5107a c5107a, C3276gq c3276gq) {
        this.f35053n = context;
        this.f35054u = interfaceC3858rh;
        this.f35055v = ut;
        this.f35056w = c5107a;
        this.f35059z = c3276gq;
    }

    public final synchronized void a() {
        InterfaceC3858rh interfaceC3858rh;
        int i;
        int i4;
        try {
            Ut ut = this.f35055v;
            if (ut.f28133T && (interfaceC3858rh = this.f35054u) != null) {
                Context context = this.f35053n;
                p2.j jVar = p2.j.f39798C;
                jVar.f39823x.getClass();
                if (C3431jl.f(context)) {
                    C5107a c5107a = this.f35056w;
                    int i9 = c5107a.f41218u;
                    int i10 = c5107a.f41219v;
                    StringBuilder sb = new StringBuilder(String.valueOf(i9).length() + 1 + String.valueOf(i10).length());
                    sb.append(i9);
                    sb.append(com.anythink.core.common.d.j.f12535z);
                    sb.append(i10);
                    String sb2 = sb.toString();
                    C3761pr c3761pr = ut.f28135V;
                    String str = c3761pr.H() + (-1) != 1 ? "javascript" : null;
                    if (c3761pr.H() == 1) {
                        i = 2;
                        i4 = 3;
                    } else if (ut.f28147e == 1) {
                        i = 3;
                        i4 = 1;
                    } else {
                        i = 1;
                        i4 = 1;
                    }
                    String str2 = ut.f28161l0;
                    C3431jl c3431jl = jVar.f39823x;
                    WebView s3 = interfaceC3858rh.s();
                    c3431jl.getClass();
                    C3330hq h9 = C3431jl.h(i, i4, s3, sb2, str, str2);
                    this.f35057x = h9;
                    if (h9 != null) {
                        Wv wv = h9.f31272a;
                        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31703j6)).booleanValue()) {
                            C3431jl c3431jl2 = jVar.f39823x;
                            WebView s6 = interfaceC3858rh.s();
                            c3431jl2.getClass();
                            C3431jl.j(wv, s6);
                            Iterator it = interfaceC3858rh.B().iterator();
                            while (it.hasNext()) {
                                View view = (View) it.next();
                                p2.j.f39798C.f39823x.getClass();
                                C3431jl.r(new RunnableC3167eq(wv, view, 0));
                            }
                        } else {
                            View b02 = interfaceC3858rh.b0();
                            jVar.f39823x.getClass();
                            C3431jl.j(wv, b02);
                        }
                        interfaceC3858rh.o0(this.f35057x);
                        p2.j.f39798C.f39823x.getClass();
                        C3431jl.i(wv);
                        this.f35058y = true;
                        interfaceC3858rh.a("onSdkLoaded", new s.b());
                    }
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025 A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0013, B:6:0x0015, B:10:0x001a, B:13:0x0025, B:17:0x002e, B:21:0x0034, B:24:0x001d, B:28:0x0021, B:8:0x0016), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e A[Catch: all -> 0x002c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0013, B:6:0x0015, B:10:0x001a, B:13:0x0025, B:17:0x002e, B:21:0x0034, B:24:0x001d, B:28:0x0021, B:8:0x0016), top: B:2:0x0001, inners: #1 }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC2608Ik
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void e() {
        boolean z8;
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.k6)).booleanValue()) {
            C3276gq c3276gq = this.f35059z;
            synchronized (c3276gq) {
                if (c3276gq.f31109f != null) {
                    z8 = true;
                }
            }
            if (!z8) {
                this.f35059z.b();
                return;
            } else {
                if (this.f35058y) {
                    return;
                }
                a();
                return;
            }
        }
        z8 = false;
        if (!z8) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025 A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0013, B:6:0x0015, B:10:0x001a, B:13:0x0025, B:17:0x002e, B:19:0x0032, B:20:0x0035, B:22:0x003b, B:24:0x003f, B:26:0x0043, B:31:0x001d, B:35:0x0021, B:8:0x0016), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e A[Catch: all -> 0x002c, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0013, B:6:0x0015, B:10:0x001a, B:13:0x0025, B:17:0x002e, B:19:0x0032, B:20:0x0035, B:22:0x003b, B:24:0x003f, B:26:0x0043, B:31:0x001d, B:35:0x0021, B:8:0x0016), top: B:2:0x0001, inners: #1 }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC2506Ck
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void y() {
        boolean z8;
        InterfaceC3858rh interfaceC3858rh;
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.k6)).booleanValue()) {
            C3276gq c3276gq = this.f35059z;
            synchronized (c3276gq) {
                if (c3276gq.f31109f != null) {
                    z8 = true;
                }
            }
            if (!z8) {
                this.f35059z.c();
                return;
            }
            if (!this.f35058y) {
                a();
            }
            if (!this.f35055v.f28133T || this.f35057x == null || (interfaceC3858rh = this.f35054u) == null) {
                return;
            }
            interfaceC3858rh.a("onSdkImpression", new s.b());
            return;
        }
        z8 = false;
        if (!z8) {
        }
    }
}
