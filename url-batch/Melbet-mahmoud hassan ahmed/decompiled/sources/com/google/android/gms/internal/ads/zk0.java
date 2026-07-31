package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zk0 extends j3.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f15169a;

    /* renamed from: b, reason: collision with root package name */
    private final fk0 f15170b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f15171c;

    /* renamed from: d, reason: collision with root package name */
    private final xk0 f15172d = new xk0();

    /* renamed from: e, reason: collision with root package name */
    private r2.m f15173e;

    /* renamed from: f, reason: collision with root package name */
    private i3.a f15174f;

    /* renamed from: g, reason: collision with root package name */
    private r2.r f15175g;

    public zk0(Context context, String str) {
        this.f15169a = str;
        this.f15171c = context.getApplicationContext();
        this.f15170b = qw.a().k(context, str, new ad0());
    }

    @Override // j3.a
    public final r2.v a() {
        zy zyVar = null;
        try {
            fk0 fk0Var = this.f15170b;
            if (fk0Var != null) {
                zyVar = fk0Var.c();
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
        return r2.v.e(zyVar);
    }

    @Override // j3.a
    public final void d(r2.m mVar) {
        this.f15173e = mVar;
        this.f15172d.s6(mVar);
    }

    @Override // j3.a
    public final void e(boolean z6) {
        try {
            fk0 fk0Var = this.f15170b;
            if (fk0Var != null) {
                fk0Var.k0(z6);
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // j3.a
    public final void f(i3.a aVar) {
        this.f15174f = aVar;
        try {
            fk0 fk0Var = this.f15170b;
            if (fk0Var != null) {
                fk0Var.X3(new l00(aVar));
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // j3.a
    public final void g(r2.r rVar) {
        this.f15175g = rVar;
        try {
            fk0 fk0Var = this.f15170b;
            if (fk0Var != null) {
                fk0Var.O5(new m00(rVar));
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // j3.a
    public final void h(i3.e eVar) {
        try {
            fk0 fk0Var = this.f15170b;
            if (fk0Var != null) {
                fk0Var.X1(new uk0(eVar));
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // j3.a
    public final void i(Activity activity, r2.s sVar) {
        this.f15172d.t6(sVar);
        try {
            fk0 fk0Var = this.f15170b;
            if (fk0Var != null) {
                fk0Var.n5(this.f15172d);
                this.f15170b.m6(x3.b.B3(activity));
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    public final void j(kz kzVar, j3.b bVar) {
        try {
            fk0 fk0Var = this.f15170b;
            if (fk0Var != null) {
                fk0Var.G4(ov.f9836a.a(this.f15171c, kzVar), new yk0(bVar, this));
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }
}
