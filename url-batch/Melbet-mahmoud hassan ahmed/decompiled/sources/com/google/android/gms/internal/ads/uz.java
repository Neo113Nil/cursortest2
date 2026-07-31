package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import r2.u;
import x2.a;

/* loaded from: classes.dex */
public final class uz {

    /* renamed from: i, reason: collision with root package name */
    private static uz f13042i;

    /* renamed from: c, reason: collision with root package name */
    private fy f13045c;

    /* renamed from: h, reason: collision with root package name */
    private x2.b f13050h;

    /* renamed from: b, reason: collision with root package name */
    private final Object f13044b = new Object();

    /* renamed from: d, reason: collision with root package name */
    private boolean f13046d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f13047e = false;

    /* renamed from: f, reason: collision with root package name */
    private r2.q f13048f = null;

    /* renamed from: g, reason: collision with root package name */
    private r2.u f13049g = new u.a().a();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<x2.c> f13043a = new ArrayList<>();

    private uz() {
    }

    public static uz e() {
        uz uzVar;
        synchronized (uz.class) {
            if (f13042i == null) {
                f13042i = new uz();
            }
            uzVar = f13042i;
        }
        return uzVar;
    }

    private final void r(Context context) {
        if (this.f13045c == null) {
            this.f13045c = new mw(qw.a(), context).d(context, false);
        }
    }

    private final void s(r2.u uVar) {
        try {
            this.f13045c.j1(new n00(uVar));
        } catch (RemoteException e7) {
            io0.e("Unable to set request configuration parcel.", e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x2.b t(List<f90> list) {
        HashMap hashMap = new HashMap();
        for (f90 f90Var : list) {
            hashMap.put(f90Var.f5045f, new n90(f90Var.f5046g ? a.EnumC0152a.READY : a.EnumC0152a.NOT_READY, f90Var.f5048i, f90Var.f5047h));
        }
        return new o90(hashMap);
    }

    public final r2.u b() {
        return this.f13049g;
    }

    public final x2.b d() {
        synchronized (this.f13044b) {
            r3.o.l(this.f13045c != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                x2.b bVar = this.f13050h;
                if (bVar != null) {
                    return bVar;
                }
                return t(this.f13045c.e());
            } catch (RemoteException unused) {
                io0.d("Unable to get Initialization status.");
                return new nz(this);
            }
        }
    }

    public final String f() {
        String c7;
        synchronized (this.f13044b) {
            r3.o.l(this.f13045c != null, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                c7 = b53.c(this.f13045c.d());
            } catch (RemoteException e7) {
                io0.e("Unable to get version string.", e7);
                return "";
            }
        }
        return c7;
    }

    public final void j(Context context) {
        synchronized (this.f13044b) {
            r(context);
            try {
                this.f13045c.h();
            } catch (RemoteException unused) {
                io0.d("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public final void k(Context context, String str, final x2.c cVar) {
        synchronized (this.f13044b) {
            if (this.f13046d) {
                if (cVar != null) {
                    e().f13043a.add(cVar);
                }
                return;
            }
            if (this.f13047e) {
                if (cVar != null) {
                    cVar.a(d());
                }
                return;
            }
            this.f13046d = true;
            if (cVar != null) {
                e().f13043a.add(cVar);
            }
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null.");
            }
            try {
                sz szVar = null;
                wc0.a().b(context, null);
                r(context);
                if (cVar != null) {
                    this.f13045c.D3(new tz(this, szVar));
                }
                this.f13045c.l4(new ad0());
                this.f13045c.i();
                this.f13045c.O3(null, x3.b.B3(null));
                if (this.f13049g.b() != -1 || this.f13049g.c() != -1) {
                    s(this.f13049g);
                }
                m10.c(context);
                if (!((Boolean) sw.c().b(m10.P3)).booleanValue() && !f().endsWith("0")) {
                    io0.d("Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time.");
                    this.f13050h = new nz(this);
                    if (cVar != null) {
                        bo0.f3473b.post(new Runnable() { // from class: com.google.android.gms.internal.ads.oz
                            @Override // java.lang.Runnable
                            public final void run() {
                                uz.this.l(cVar);
                            }
                        });
                    }
                }
            } catch (RemoteException e7) {
                io0.h("MobileAdsSettingManager initialization failed", e7);
            }
        }
    }

    final /* synthetic */ void l(x2.c cVar) {
        cVar.a(this.f13050h);
    }

    public final void m(Context context, r2.q qVar) {
        synchronized (this.f13044b) {
            r(context);
            e().f13048f = qVar;
            try {
                this.f13045c.Y3(new rz(null));
            } catch (RemoteException unused) {
                io0.d("Unable to open the ad inspector.");
                if (qVar != null) {
                    qVar.a(new r2.c(0, "Ad inspector had an internal error.", "com.google.android.gms.ads"));
                }
            }
        }
    }

    public final void n(Context context, String str) {
        synchronized (this.f13044b) {
            r3.o.l(this.f13045c != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.f13045c.I5(x3.b.B3(context), str);
            } catch (RemoteException e7) {
                io0.e("Unable to open debug menu.", e7);
            }
        }
    }

    public final void o(boolean z6) {
        synchronized (this.f13044b) {
            r3.o.l(this.f13045c != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.f13045c.F0(z6);
            } catch (RemoteException e7) {
                io0.e("Unable to set app mute state.", e7);
            }
        }
    }

    public final void p(float f7) {
        boolean z6 = true;
        r3.o.b(f7 >= 0.0f && f7 <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.f13044b) {
            if (this.f13045c == null) {
                z6 = false;
            }
            r3.o.l(z6, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.f13045c.U4(f7);
            } catch (RemoteException e7) {
                io0.e("Unable to set app volume.", e7);
            }
        }
    }

    public final void q(r2.u uVar) {
        r3.o.b(uVar != null, "Null passed to setRequestConfiguration.");
        synchronized (this.f13044b) {
            r2.u uVar2 = this.f13049g;
            this.f13049g = uVar;
            if (this.f13045c == null) {
                return;
            }
            if (uVar2.b() != uVar.b() || uVar2.c() != uVar.c()) {
                s(uVar);
            }
        }
    }
}
