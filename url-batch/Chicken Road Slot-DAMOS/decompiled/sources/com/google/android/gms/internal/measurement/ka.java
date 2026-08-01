package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class ka extends c5 {

    /* renamed from: e, reason: collision with root package name */
    public final a1.n f2447e;

    public ka(a1.n nVar) {
        this.f2447e = nVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.measurement.c5, com.google.android.gms.internal.measurement.f5
    public final f5 i(String str, e7 e7Var, ArrayList arrayList) {
        int hashCode = str.hashCode();
        a1.n nVar = this.f2447e;
        switch (hashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    ia.c("getEventName", arrayList, 0);
                    return new i5(((b) nVar.f40e).f2154a);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    ia.c("getTimestamp", arrayList, 0);
                    return new l3(Double.valueOf(((b) nVar.f40e).f2155b));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    ia.c("getParamValue", arrayList, 1);
                    String f3 = ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0)).f();
                    HashMap hashMap = ((b) nVar.f40e).f2156c;
                    return oa.c(hashMap.containsKey(f3) ? hashMap.get(f3) : null);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    ia.c("getParams", arrayList, 0);
                    HashMap hashMap2 = ((b) nVar.f40e).f2156c;
                    c5 c5Var = new c5();
                    for (String str2 : hashMap2.keySet()) {
                        c5Var.k(str2, oa.c(hashMap2.get(str2)));
                    }
                    return c5Var;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    ia.c("setParamValue", arrayList, 2);
                    String f10 = ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0)).f();
                    f5 e2 = ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(1));
                    b bVar = (b) nVar.f40e;
                    Object u2 = ia.u(e2);
                    HashMap hashMap3 = bVar.f2156c;
                    if (u2 == null) {
                        hashMap3.remove(f10);
                        return e2;
                    }
                    hashMap3.put(f10, b.b(hashMap3.get(f10), u2, f10));
                    return e2;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    ia.c("setEventName", arrayList, 1);
                    f5 e9 = ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0));
                    if (f5.f2280b.equals(e9) || f5.f2281c.equals(e9)) {
                        te.a1.e("Illegal event name");
                        return null;
                    }
                    ((b) nVar.f40e).f2154a = e9.f();
                    return new i5(e9.f());
                }
                break;
        }
        return super.i(str, e7Var, arrayList);
    }
}
