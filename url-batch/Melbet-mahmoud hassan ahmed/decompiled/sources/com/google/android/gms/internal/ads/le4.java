package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class le4 extends ne4 {

    /* renamed from: b, reason: collision with root package name */
    private long f7948b;

    /* renamed from: c, reason: collision with root package name */
    private long[] f7949c;

    /* renamed from: d, reason: collision with root package name */
    private long[] f7950d;

    public le4() {
        super(new nc4());
        this.f7948b = -9223372036854775807L;
        this.f7949c = new long[0];
        this.f7950d = new long[0];
    }

    private static Double g(dr2 dr2Var) {
        return Double.valueOf(Double.longBitsToDouble(dr2Var.z()));
    }

    private static Object h(dr2 dr2Var, int i7) {
        if (i7 == 0) {
            return g(dr2Var);
        }
        if (i7 == 1) {
            return Boolean.valueOf(dr2Var.s() == 1);
        }
        if (i7 == 2) {
            return i(dr2Var);
        }
        if (i7 != 3) {
            if (i7 == 8) {
                return j(dr2Var);
            }
            if (i7 != 10) {
                if (i7 != 11) {
                    return null;
                }
                Date date = new Date((long) g(dr2Var).doubleValue());
                dr2Var.g(2);
                return date;
            }
            int v6 = dr2Var.v();
            ArrayList arrayList = new ArrayList(v6);
            for (int i8 = 0; i8 < v6; i8++) {
                Object h7 = h(dr2Var, dr2Var.s());
                if (h7 != null) {
                    arrayList.add(h7);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String i9 = i(dr2Var);
            int s7 = dr2Var.s();
            if (s7 == 9) {
                return hashMap;
            }
            Object h8 = h(dr2Var, s7);
            if (h8 != null) {
                hashMap.put(i9, h8);
            }
        }
    }

    private static String i(dr2 dr2Var) {
        int w6 = dr2Var.w();
        int k7 = dr2Var.k();
        dr2Var.g(w6);
        return new String(dr2Var.h(), k7, w6);
    }

    private static HashMap<String, Object> j(dr2 dr2Var) {
        int v6 = dr2Var.v();
        HashMap<String, Object> hashMap = new HashMap<>(v6);
        for (int i7 = 0; i7 < v6; i7++) {
            String i8 = i(dr2Var);
            Object h7 = h(dr2Var, dr2Var.s());
            if (h7 != null) {
                hashMap.put(i8, h7);
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.ne4
    protected final boolean a(dr2 dr2Var) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ne4
    protected final boolean b(dr2 dr2Var, long j7) {
        if (dr2Var.s() != 2 || !"onMetaData".equals(i(dr2Var)) || dr2Var.s() != 8) {
            return false;
        }
        HashMap<String, Object> j8 = j(dr2Var);
        Object obj = j8.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f7948b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = j8.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f7949c = new long[size];
                this.f7950d = new long[size];
                for (int i7 = 0; i7 < size; i7++) {
                    Object obj5 = list.get(i7);
                    Object obj6 = list2.get(i7);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f7949c = new long[0];
                        this.f7950d = new long[0];
                        break;
                    }
                    this.f7949c[i7] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f7950d[i7] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public final long d() {
        return this.f7948b;
    }

    public final long[] e() {
        return this.f7950d;
    }

    public final long[] f() {
        return this.f7949c;
    }
}
