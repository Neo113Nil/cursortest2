package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nj3 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ je3 n;
    public final /* synthetic */ AppMeasurementDynamiteService o;

    public /* synthetic */ nj3(AppMeasurementDynamiteService appMeasurementDynamiteService, je3 je3Var, int i) {
        this.m = i;
        this.n = je3Var;
        this.o = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        switch (this.m) {
            case 0:
                jo3 p = this.o.g.p();
                je3 je3Var = this.n;
                p.v();
                p.x();
                p.K(new f92((Object) p, (i1) p.M(false), (Object) je3Var, 8));
                break;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.o;
                zq3 zq3Var = appMeasurementDynamiteService.g.u;
                pj3.k(zq3Var);
                pj3 pj3Var = appMeasurementDynamiteService.g;
                if (pj3Var.K != null && pj3Var.K.booleanValue()) {
                    z = true;
                }
                zq3Var.j0(this.n, z);
                break;
        }
    }
}
