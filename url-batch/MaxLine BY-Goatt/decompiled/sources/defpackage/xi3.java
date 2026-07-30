package defpackage;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class xi3 implements Callable {
    public final /* synthetic */ int m;
    public final /* synthetic */ dj3 n;
    public final /* synthetic */ String o;

    public /* synthetic */ xi3(dj3 dj3Var, String str, int i) {
        this.m = i;
        this.n = dj3Var;
        this.o = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.m;
        String str = this.o;
        dj3 dj3Var = this.n;
        switch (i) {
            case 0:
                return new ol3(new xi3(dj3Var, str, 1));
            case 1:
                tc3 tc3Var = dj3Var.n.o;
                oq3.U(tc3Var);
                di3 y0 = tc3Var.y0(str);
                HashMap hashMap = new HashMap();
                hashMap.put("platform", "android");
                hashMap.put("package_name", str);
                ((pj3) dj3Var.m).p.B();
                hashMap.put("gmp_version", 133005L);
                if (y0 != null) {
                    String N = y0.N();
                    if (N != null) {
                        hashMap.put("app_version", N);
                    }
                    hashMap.put("app_version_int", Long.valueOf(y0.P()));
                    hashMap.put("dynamite_version", Long.valueOf(y0.b()));
                }
                return hashMap;
            default:
                tt1 tt1Var = new tt1(23, dj3Var, str, false);
                bo3 bo3Var = new bo3("internal.remoteConfig", 0);
                bo3Var.n.put("getValue", new ol3(bo3Var, tt1Var));
                return bo3Var;
        }
    }
}
