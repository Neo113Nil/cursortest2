package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface cc3 {
    static kc3 g(cc3 cc3Var, pc3 pc3Var, js0 js0Var, ArrayList arrayList) {
        String str = pc3Var.m;
        if (!cc3Var.d(str)) {
            if ("hasOwnProperty".equals(str)) {
                ak2.m("hasOwnProperty", 1, arrayList);
                return cc3Var.d(((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0)).zzc()) ? kc3.j : kc3.k;
            }
            lh.e(q40.l("Object has no function ", str));
            return null;
        }
        kc3 c = cc3Var.c(str);
        if (c instanceof zb3) {
            return ((zb3) c).h(js0Var, arrayList);
        }
        throw new IllegalArgumentException(str + " is not a function");
    }

    void b(String str, kc3 kc3Var);

    kc3 c(String str);

    boolean d(String str);
}
