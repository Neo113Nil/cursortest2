package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ol3 extends zb3 {
    public final /* synthetic */ int o = 4;
    public final Object p;

    public ol3(ot2 ot2Var) {
        super("internal.logger");
        this.p = ot2Var;
        this.n.put("log", new ss3(this, false, true));
        this.n.put("silent", new bo3("silent", 1));
        ((zb3) this.n.get("silent")).b("log", new ss3(this, true, true));
        this.n.put("unmonitored", new bo3("unmonitored", 2));
        ((zb3) this.n.get("unmonitored")).b("log", new ss3(this, false, false));
    }

    @Override // defpackage.zb3
    public final kc3 h(js0 js0Var, List list) {
        TreeMap treeMap;
        int i = this.o;
        String str = this.m;
        qc3 qc3Var = kc3.e;
        Object obj = this.p;
        String str2 = null;
        switch (i) {
            case 0:
                ak2.m(str, 3, list);
                String zzc = ((tt1) js0Var.p).x(js0Var, (kc3) list.get(0)).zzc();
                kc3 kc3Var = (kc3) list.get(1);
                tt1 tt1Var = (tt1) js0Var.p;
                long t = (long) ak2.t(tt1Var.x(js0Var, kc3Var).f().doubleValue());
                kc3 x = tt1Var.x(js0Var, (kc3) list.get(2));
                HashMap v = x instanceof fc3 ? ak2.v((fc3) x) : new HashMap();
                t13 t13Var = (t13) obj;
                t13Var.getClass();
                HashMap hashMap = new HashMap();
                for (String str3 : v.keySet()) {
                    HashMap hashMap2 = ((jb3) t13Var.o).c;
                    hashMap.put(str3, jb3.b(hashMap2.containsKey(str3) ? hashMap2.get(str3) : null, v.get(str3), str3));
                }
                ((ArrayList) t13Var.n).add(new jb3(zzc, t, hashMap));
                return qc3Var;
            case 1:
                ak2.m("getValue", 2, list);
                kc3 x2 = ((tt1) js0Var.p).x(js0Var, (kc3) list.get(0));
                kc3 x3 = ((tt1) js0Var.p).x(js0Var, (kc3) list.get(1));
                String zzc2 = x2.zzc();
                tt1 tt1Var2 = (tt1) obj;
                Map map = (Map) ((dj3) tt1Var2.o).p.get((String) tt1Var2.n);
                if (map != null && map.containsKey(zzc2)) {
                    str2 = (String) map.get(zzc2);
                }
                return str2 != null ? new pc3(str2) : x3;
            case 2:
                return qc3Var;
            case 3:
                try {
                    return nk2.r(((xi3) obj).call());
                } catch (Exception unused) {
                    return qc3Var;
                }
            default:
                ak2.m(str, 3, list);
                ((tt1) js0Var.p).x(js0Var, (kc3) list.get(0)).zzc();
                kc3 kc3Var2 = (kc3) list.get(1);
                tt1 tt1Var3 = (tt1) js0Var.p;
                kc3 x4 = tt1Var3.x(js0Var, kc3Var2);
                if (x4 instanceof ic3) {
                    kc3 x5 = tt1Var3.x(js0Var, (kc3) list.get(2));
                    if (x5 instanceof fc3) {
                        fc3 fc3Var = (fc3) x5;
                        HashMap hashMap3 = fc3Var.m;
                        if (hashMap3.containsKey("type")) {
                            String zzc3 = fc3Var.c("type").zzc();
                            int s = hashMap3.containsKey("priority") ? ak2.s(fc3Var.c("priority").f().doubleValue()) : 1000;
                            at3 at3Var = (at3) obj;
                            ic3 ic3Var = (ic3) x4;
                            at3Var.getClass();
                            if ("create".equals(zzc3)) {
                                treeMap = (TreeMap) at3Var.n;
                            } else if ("edit".equals(zzc3)) {
                                treeMap = (TreeMap) at3Var.m;
                            } else {
                                lh.g("Unknown callback type: ".concat(String.valueOf(zzc3)));
                            }
                            if (treeMap.containsKey(Integer.valueOf(s))) {
                                s = ((Integer) treeMap.lastKey()).intValue() + 1;
                            }
                            treeMap.put(Integer.valueOf(s), ic3Var);
                            return qc3Var;
                        }
                        lh.e("Undefined rule type");
                    } else {
                        lh.e("Invalid callback params");
                    }
                } else {
                    lh.e("Invalid callback type");
                }
                return null;
        }
    }

    public ol3(t13 t13Var) {
        super("internal.eventLogger");
        this.p = t13Var;
    }

    public ol3(xi3 xi3Var) {
        super("internal.appMetadata");
        this.p = xi3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol3(bo3 bo3Var, tt1 tt1Var) {
        super("getValue");
        this.p = tt1Var;
    }

    public ol3(at3 at3Var) {
        super("internal.registerCallback");
        this.p = at3Var;
    }
}
