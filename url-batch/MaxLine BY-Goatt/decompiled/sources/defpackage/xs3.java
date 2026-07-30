package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xs3 extends zb3 {
    public final ot2 o;
    public final HashMap p;

    public xs3(ot2 ot2Var) {
        super("require");
        this.p = new HashMap();
        this.o = ot2Var;
    }

    @Override // defpackage.zb3
    public final kc3 h(js0 js0Var, List list) {
        kc3 kc3Var;
        ak2.m("require", 1, list);
        String zzc = ((tt1) js0Var.p).x(js0Var, (kc3) list.get(0)).zzc();
        HashMap hashMap = this.p;
        if (hashMap.containsKey(zzc)) {
            return (kc3) hashMap.get(zzc);
        }
        HashMap hashMap2 = (HashMap) this.o.n;
        if (hashMap2.containsKey(zzc)) {
            try {
                kc3Var = (kc3) ((Callable) hashMap2.get(zzc)).call();
            } catch (Exception unused) {
                lh.g("Failed to create API implementation: ".concat(String.valueOf(zzc)));
                return null;
            }
        } else {
            kc3Var = kc3.e;
        }
        if (kc3Var instanceof zb3) {
            hashMap.put(zzc, (zb3) kc3Var);
        }
        return kc3Var;
    }
}
