package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.kk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3484kk implements s2.l {

    /* renamed from: u, reason: collision with root package name */
    public final C2953au f32451u;

    /* renamed from: v, reason: collision with root package name */
    public final Ut f32452v;

    /* renamed from: w, reason: collision with root package name */
    public final S2.a f32453w;

    /* renamed from: x, reason: collision with root package name */
    public final C3165eo f32454x;

    /* renamed from: y, reason: collision with root package name */
    public final ScheduledExecutorService f32455y;

    /* renamed from: n, reason: collision with root package name */
    public final Object f32450n = new Object();

    /* renamed from: z, reason: collision with root package name */
    public final C3657nv f32456z = C3711ov.A();

    /* renamed from: A, reason: collision with root package name */
    public boolean f32448A = false;

    /* renamed from: B, reason: collision with root package name */
    public boolean f32449B = false;

    public C3484kk(C2953au c2953au, Ut ut, S2.a aVar, C3165eo c3165eo, ScheduledExecutorService scheduledExecutorService) {
        this.f32451u = c2953au;
        this.f32452v = ut;
        this.f32453w = aVar;
        this.f32454x = c3165eo;
        this.f32455y = scheduledExecutorService;
    }

    @Override // s2.l
    public final void D0() {
        b(9);
    }

    @Override // s2.l
    public final void G2() {
    }

    @Override // s2.l
    public final void K1() {
        b(5);
    }

    @Override // s2.l
    public final void K2() {
        b(7);
    }

    @Override // s2.l
    public final void R0(int i) {
    }

    @Override // s2.l
    public final void Y1() {
        b(6);
    }

    public final void a() {
        synchronized (this.f32450n) {
            try {
                C3165eo c3165eo = this.f32454x;
                String str = ((Wt) this.f32451u.f29349b.f24454v).f28491b;
                String encodeToString = Base64.encodeToString(((C3711ov) this.f32456z.j()).b(), 1);
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.pe)).booleanValue()) {
                    C2593Hm a9 = c3165eo.a();
                    a9.r(NativeAdvancedJsUtils.f18064p, "pclma");
                    a9.r("pclmd", encodeToString);
                    a9.r("gqi", str);
                    a9.v();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(int i) {
        synchronized (this.f32450n) {
            try {
                if (!this.f32449B && this.f32448A) {
                    C3657nv c3657nv = this.f32456z;
                    Su A8 = Tu.A();
                    A8.h();
                    ((Tu) A8.f30000u).C(i);
                    this.f32453w.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    A8.h();
                    ((Tu) A8.f30000u).B(currentTimeMillis);
                    Tu tu = (Tu) A8.j();
                    c3657nv.h();
                    ((C3711ov) c3657nv.f30000u).B(tu);
                    if (i == 10) {
                        a();
                        this.f32449B = true;
                    }
                }
            } finally {
            }
        }
    }

    @Override // s2.l
    public final void f1() {
        b(10);
    }

    @Override // s2.l
    public final void g() {
    }

    @Override // s2.l
    public final void o1() {
        b(3);
    }

    @Override // s2.l
    public final void u0() {
        b(4);
    }

    @Override // s2.l
    public final void y1() {
        b(8);
    }
}
