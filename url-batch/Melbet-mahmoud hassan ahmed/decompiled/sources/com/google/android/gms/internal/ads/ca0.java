package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class ca0<AdT> extends s2.c {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3768a;

    /* renamed from: b, reason: collision with root package name */
    private final ov f3769b;

    /* renamed from: c, reason: collision with root package name */
    private final nx f3770c;

    /* renamed from: d, reason: collision with root package name */
    private final String f3771d;

    /* renamed from: e, reason: collision with root package name */
    private final ad0 f3772e;

    /* renamed from: f, reason: collision with root package name */
    private s2.e f3773f;

    /* renamed from: g, reason: collision with root package name */
    private r2.m f3774g;

    /* renamed from: h, reason: collision with root package name */
    private r2.r f3775h;

    public ca0(Context context, String str) {
        ad0 ad0Var = new ad0();
        this.f3772e = ad0Var;
        this.f3768a = context;
        this.f3771d = str;
        this.f3769b = ov.f9836a;
        this.f3770c = qw.a().e(context, new pv(), str, ad0Var);
    }

    @Override // b3.a
    public final r2.v a() {
        zy zyVar = null;
        try {
            nx nxVar = this.f3770c;
            if (nxVar != null) {
                zyVar = nxVar.j();
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
        return r2.v.e(zyVar);
    }

    @Override // b3.a
    public final void c(r2.m mVar) {
        try {
            this.f3774g = mVar;
            nx nxVar = this.f3770c;
            if (nxVar != null) {
                nxVar.D2(new tw(mVar));
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // b3.a
    public final void d(boolean z6) {
        try {
            nx nxVar = this.f3770c;
            if (nxVar != null) {
                nxVar.K3(z6);
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // b3.a
    public final void e(r2.r rVar) {
        try {
            this.f3775h = rVar;
            nx nxVar = this.f3770c;
            if (nxVar != null) {
                nxVar.r5(new m00(rVar));
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // b3.a
    public final void f(Activity activity) {
        if (activity == null) {
            io0.g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            nx nxVar = this.f3770c;
            if (nxVar != null) {
                nxVar.c5(x3.b.B3(activity));
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // s2.c
    public final void h(s2.e eVar) {
        try {
            this.f3773f = eVar;
            nx nxVar = this.f3770c;
            if (nxVar != null) {
                nxVar.M3(eVar != null ? new no(eVar) : null);
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    public final void i(kz kzVar, r2.e<AdT> eVar) {
        try {
            if (this.f3770c != null) {
                this.f3772e.t6(kzVar.p());
                this.f3770c.r2(this.f3769b.a(this.f3768a, kzVar), new fv(eVar, this));
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
            eVar.c(new r2.n(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }
}
