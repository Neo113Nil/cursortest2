package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dm3 extends fc3 {
    public final t13 n;

    public dm3(t13 t13Var) {
        this.n = t13Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.fc3, defpackage.kc3
    public final kc3 j(String str, js0 js0Var, ArrayList arrayList) {
        int hashCode = str.hashCode();
        t13 t13Var = this.n;
        switch (hashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    ak2.m("getEventName", 0, arrayList);
                    return new pc3(((jb3) t13Var.p).a);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    ak2.m("getTimestamp", 0, arrayList);
                    return new xb3(Double.valueOf(((jb3) t13Var.p).b));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    ak2.m("getParamValue", 1, arrayList);
                    String zzc = ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0)).zzc();
                    HashMap hashMap = ((jb3) t13Var.p).c;
                    return nk2.r(hashMap.containsKey(zzc) ? hashMap.get(zzc) : null);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    ak2.m("getParams", 0, arrayList);
                    HashMap hashMap2 = ((jb3) t13Var.p).c;
                    fc3 fc3Var = new fc3();
                    for (String str2 : hashMap2.keySet()) {
                        fc3Var.b(str2, nk2.r(hashMap2.get(str2)));
                    }
                    return fc3Var;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    ak2.m("setParamValue", 2, arrayList);
                    String zzc2 = ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0)).zzc();
                    kc3 x = ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(1));
                    jb3 jb3Var = (jb3) t13Var.p;
                    Object u = ak2.u(x);
                    HashMap hashMap3 = jb3Var.c;
                    if (u == null) {
                        hashMap3.remove(zzc2);
                        return x;
                    }
                    hashMap3.put(zzc2, jb3.b(hashMap3.get(zzc2), u, zzc2));
                    return x;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    ak2.m("setEventName", 1, arrayList);
                    kc3 x2 = ((tt1) js0Var.p).x(js0Var, (kc3) arrayList.get(0));
                    if (kc3.e.equals(x2) || kc3.f.equals(x2)) {
                        lh.e("Illegal event name");
                        return null;
                    }
                    ((jb3) t13Var.p).a = x2.zzc();
                    return new pc3(x2.zzc());
                }
                break;
        }
        return super.j(str, js0Var, arrayList);
    }
}
