package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class pk0 extends i3.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f10250a;

    /* renamed from: b, reason: collision with root package name */
    private final fk0 f10251b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f10252c;

    /* renamed from: d, reason: collision with root package name */
    private final xk0 f10253d = new xk0();

    /* renamed from: e, reason: collision with root package name */
    private i3.a f10254e;

    /* renamed from: f, reason: collision with root package name */
    private r2.r f10255f;

    /* renamed from: g, reason: collision with root package name */
    private r2.m f10256g;

    public pk0(Context context, String str) {
        this.f10252c = context.getApplicationContext();
        this.f10250a = str;
        this.f10251b = qw.a().k(context, str, new ad0());
    }

    @Override // i3.c
    public final r2.v a() {
        zy zyVar = null;
        try {
            fk0 fk0Var = this.f10251b;
            if (fk0Var != null) {
                zyVar = fk0Var.c();
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
        return r2.v.e(zyVar);
    }

    @Override // i3.c
    public final void d(r2.m mVar) {
        this.f10256g = mVar;
        this.f10253d.s6(mVar);
    }

    @Override // i3.c
    public final void e(boolean z6) {
        try {
            fk0 fk0Var = this.f10251b;
            if (fk0Var != null) {
                fk0Var.k0(z6);
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // i3.c
    public final void f(i3.a aVar) {
        try {
            this.f10254e = aVar;
            fk0 fk0Var = this.f10251b;
            if (fk0Var != null) {
                fk0Var.X3(new l00(aVar));
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // i3.c
    public final void g(r2.r rVar) {
        try {
            this.f10255f = rVar;
            fk0 fk0Var = this.f10251b;
            if (fk0Var != null) {
                fk0Var.O5(new m00(rVar));
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // i3.c
    public final void h(i3.e eVar) {
        if (eVar != null) {
            try {
                fk0 fk0Var = this.f10251b;
                if (fk0Var != null) {
                    fk0Var.X1(new uk0(eVar));
                }
            } catch (RemoteException e7) {
                io0.i("#007 Could not call remote method.", e7);
            }
        }
    }

    @Override // i3.c
    public final void i(Activity activity, r2.s sVar) {
        this.f10253d.t6(sVar);
        if (activity == null) {
            io0.g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            fk0 fk0Var = this.f10251b;
            if (fk0Var != null) {
                fk0Var.n5(this.f10253d);
                this.f10251b.m6(x3.b.B3(activity));
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    public final void j(kz kzVar, i3.d dVar) {
        try {
            fk0 fk0Var = this.f10251b;
            if (fk0Var != null) {
                fk0Var.a3(ov.f9836a.a(this.f10252c, kzVar), new tk0(dVar, this));
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }
}
