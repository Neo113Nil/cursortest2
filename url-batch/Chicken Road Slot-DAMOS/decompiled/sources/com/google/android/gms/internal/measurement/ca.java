package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class ca extends e4 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2192i = 0;

    /* renamed from: r, reason: collision with root package name */
    public final Object f2193r;

    public ca(l.d dVar) {
        super("internal.logger");
        this.f2193r = dVar;
        this.f2254e.put("log", new ce(this, false, true));
        this.f2254e.put("silent", new qb("silent", 1));
        ((e4) this.f2254e.get("silent")).k("log", new ce(this, true, true));
        this.f2254e.put("unmonitored", new qb("unmonitored", 2));
        ((e4) this.f2254e.get("unmonitored")).k("log", new ce(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.e4
    public final f5 a(e7 e7Var, List list) {
        TreeMap treeMap;
        switch (this.f2192i) {
            case 0:
                ia.c(this.f2253d, list, 3);
                String f3 = ((l5) e7Var.f2260i).e(e7Var, (f5) list.get(0)).f();
                f5 f5Var = (f5) list.get(1);
                l5 l5Var = (l5) e7Var.f2260i;
                long r9 = (long) ia.r(l5Var.e(e7Var, f5Var).g().doubleValue());
                f5 e2 = l5Var.e(e7Var, (f5) list.get(2));
                HashMap w6 = e2 instanceof c5 ? ia.w((c5) e2) : new HashMap();
                a1.n nVar = (a1.n) this.f2193r;
                nVar.getClass();
                HashMap hashMap = new HashMap();
                for (String str : w6.keySet()) {
                    HashMap hashMap2 = ((b) nVar.f41i).f2156c;
                    hashMap.put(str, b.b(hashMap2.containsKey(str) ? hashMap2.get(str) : null, w6.get(str), str));
                }
                ((ArrayList) nVar.f42r).add(new b(f3, r9, hashMap));
                break;
            case 1:
                ia.c("getValue", list, 2);
                f5 e9 = ((l5) e7Var.f2260i).e(e7Var, (f5) list.get(0));
                f5 e10 = ((l5) e7Var.f2260i).e(e7Var, (f5) list.get(1));
                String f10 = e9.f();
                c6.c cVar = (c6.c) this.f2193r;
                Map map = (Map) ((s7.k1) cVar.f1810i).f8776r.get((String) cVar.f1809e);
                String str2 = (map == null || !map.containsKey(f10)) ? null : (String) map.get(f10);
                if (str2 != null) {
                    break;
                }
                break;
            case 2:
                break;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                try {
                    break;
                } catch (Exception unused) {
                    return f5.f2280b;
                }
            default:
                ia.c(this.f2253d, list, 3);
                ((l5) e7Var.f2260i).e(e7Var, (f5) list.get(0)).f();
                f5 f5Var2 = (f5) list.get(1);
                l5 l5Var2 = (l5) e7Var.f2260i;
                f5 e11 = l5Var2.e(e7Var, f5Var2);
                if (e11 instanceof e5) {
                    f5 e12 = l5Var2.e(e7Var, (f5) list.get(2));
                    if (e12 instanceof c5) {
                        c5 c5Var = (c5) e12;
                        HashMap hashMap3 = c5Var.f2190d;
                        if (hashMap3.containsKey(com.onesignal.inAppMessages.internal.display.impl.n.EVENT_TYPE_KEY)) {
                            String f11 = c5Var.c(com.onesignal.inAppMessages.internal.display.impl.n.EVENT_TYPE_KEY).f();
                            int p4 = hashMap3.containsKey("priority") ? ia.p(c5Var.c("priority").g().doubleValue()) : 1000;
                            l5 l5Var3 = (l5) this.f2193r;
                            e5 e5Var = (e5) e11;
                            l5Var3.getClass();
                            if ("create".equals(f11)) {
                                treeMap = (TreeMap) l5Var3.f2500i;
                            } else if (!"edit".equals(f11)) {
                                kotlin.collections.i0.l("Unknown callback type: ".concat(String.valueOf(f11)));
                                break;
                            } else {
                                treeMap = (TreeMap) l5Var3.f2499e;
                            }
                            if (treeMap.containsKey(Integer.valueOf(p4))) {
                                p4 = ((Integer) treeMap.lastKey()).intValue() + 1;
                            }
                            treeMap.put(Integer.valueOf(p4), e5Var);
                            break;
                        } else {
                            te.a1.e("Undefined rule type");
                            break;
                        }
                    } else {
                        te.a1.e("Invalid callback params");
                        break;
                    }
                } else {
                    te.a1.e("Invalid callback type");
                    break;
                }
        }
        return f5.f2280b;
    }

    public ca(l5 l5Var) {
        super("internal.registerCallback");
        this.f2193r = l5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(qb qbVar, c6.c cVar) {
        super("getValue");
        this.f2193r = cVar;
    }

    public ca(a1.n nVar) {
        super("internal.eventLogger");
        this.f2193r = nVar;
    }

    public ca(s7.i1 i1Var) {
        super("internal.appMetadata");
        this.f2193r = i1Var;
    }
}
