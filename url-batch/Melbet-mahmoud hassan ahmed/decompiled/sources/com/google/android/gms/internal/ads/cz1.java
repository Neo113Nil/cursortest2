package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* loaded from: classes.dex */
public final class cz1 implements z2.q, rv0 {

    /* renamed from: f, reason: collision with root package name */
    private final Context f4006f;

    /* renamed from: g, reason: collision with root package name */
    private final po0 f4007g;

    /* renamed from: h, reason: collision with root package name */
    private uy1 f4008h;

    /* renamed from: i, reason: collision with root package name */
    private eu0 f4009i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f4010j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f4011k;

    /* renamed from: l, reason: collision with root package name */
    private long f4012l;

    /* renamed from: m, reason: collision with root package name */
    private qy f4013m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f4014n;

    cz1(Context context, po0 po0Var) {
        this.f4006f = context;
        this.f4007g = po0Var;
    }

    private final synchronized void g() {
        if (this.f4010j && this.f4011k) {
            wo0.f13898e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.az1
                @Override // java.lang.Runnable
                public final void run() {
                    cz1.this.e();
                }
            });
        }
    }

    private final synchronized boolean h(qy qyVar) {
        if (!((Boolean) sw.c().b(m10.A6)).booleanValue()) {
            io0.g("Ad inspector had an internal error.");
            try {
                qyVar.V2(dt2.d(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.f4008h == null) {
            io0.g("Ad inspector had an internal error.");
            try {
                qyVar.V2(dt2.d(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.f4010j && !this.f4011k) {
            if (y2.t.a().b() >= this.f4012l + ((Integer) sw.c().b(m10.D6)).intValue()) {
                return true;
            }
        }
        io0.g("Ad inspector cannot be opened because it is already open.");
        try {
            qyVar.V2(dt2.d(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // z2.q
    public final void B3() {
    }

    @Override // z2.q
    public final synchronized void E(int i7) {
        this.f4009i.destroy();
        if (!this.f4014n) {
            a3.r1.k("Inspector closed.");
            qy qyVar = this.f4013m;
            if (qyVar != null) {
                try {
                    qyVar.V2(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f4011k = false;
        this.f4010j = false;
        this.f4012l = 0L;
        this.f4014n = false;
        this.f4013m = null;
    }

    @Override // z2.q
    public final synchronized void a() {
        this.f4011k = true;
        g();
    }

    @Override // z2.q
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.rv0
    public final synchronized void c(boolean z6) {
        if (z6) {
            a3.r1.k("Ad inspector loaded.");
            this.f4010j = true;
            g();
        } else {
            io0.g("Ad inspector failed to load.");
            try {
                qy qyVar = this.f4013m;
                if (qyVar != null) {
                    qyVar.V2(dt2.d(17, null, null));
                }
            } catch (RemoteException unused) {
            }
            this.f4014n = true;
            this.f4009i.destroy();
        }
    }

    public final void d(uy1 uy1Var) {
        this.f4008h = uy1Var;
    }

    final /* synthetic */ void e() {
        this.f4009i.a("window.inspectorInfo", this.f4008h.d().toString());
    }

    public final synchronized void f(qy qyVar, u70 u70Var) {
        if (h(qyVar)) {
            try {
                y2.t.A();
                eu0 a7 = ru0.a(this.f4006f, vv0.a(), "", false, false, null, null, this.f4007g, null, null, null, ar.a(), null, null);
                this.f4009i = a7;
                tv0 E0 = a7.E0();
                if (E0 == null) {
                    io0.g("Failed to obtain a web view for the ad inspector");
                    try {
                        qyVar.V2(dt2.d(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException unused) {
                        return;
                    }
                }
                this.f4013m = qyVar;
                E0.V(null, null, null, null, null, false, null, null, null, null, null, null, null, null, u70Var, null);
                E0.f1(this);
                this.f4009i.loadUrl((String) sw.c().b(m10.B6));
                y2.t.k();
                z2.p.a(this.f4006f, new AdOverlayInfoParcel(this, this.f4009i, 1, this.f4007g), true);
                this.f4012l = y2.t.a().b();
            } catch (qu0 e7) {
                io0.h("Failed to obtain a web view for the ad inspector", e7);
                try {
                    qyVar.V2(dt2.d(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException unused2) {
                }
            }
        }
    }

    @Override // z2.q
    public final void k6() {
    }

    @Override // z2.q
    public final void o4() {
    }
}
