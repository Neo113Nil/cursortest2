package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class mt1 extends t32 {

    /* renamed from: b, reason: collision with root package name */
    private long f29230b;

    /* renamed from: c, reason: collision with root package name */
    private long[] f29231c;

    /* renamed from: d, reason: collision with root package name */
    private long[] f29232d;

    public mt1() {
        super(new g40());
        this.f29230b = -9223372036854775807L;
        this.f29231c = new long[0];
        this.f29232d = new long[0];
    }

    public final long a() {
        return this.f29230b;
    }

    public final long[] b() {
        return this.f29232d;
    }

    public final long[] c() {
        return this.f29231c;
    }

    protected final boolean a(long j4, sf1 sf1Var) {
        if (sf1Var.t() != 2) {
            return false;
        }
        int z4 = sf1Var.z();
        int d4 = sf1Var.d();
        sf1Var.f(z4);
        if (!"onMetaData".equals(new String(sf1Var.c(), d4, z4)) || sf1Var.a() == 0 || sf1Var.t() != 8) {
            return false;
        }
        HashMap<String, Object> a4 = a(sf1Var);
        Object obj = a4.get(IronSourceConstants.EVENTS_DURATION);
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f29230b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = a4.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f29231c = new long[size];
                this.f29232d = new long[size];
                for (int i4 = 0; i4 < size; i4++) {
                    Object obj5 = list.get(i4);
                    Object obj6 = list2.get(i4);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f29231c = new long[0];
                        this.f29232d = new long[0];
                        break;
                    }
                    this.f29231c[i4] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f29232d[i4] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    private static Serializable a(int i4, sf1 sf1Var) {
        if (i4 == 8) {
            return a(sf1Var);
        }
        if (i4 == 10) {
            int x4 = sf1Var.x();
            ArrayList arrayList = new ArrayList(x4);
            for (int i5 = 0; i5 < x4; i5++) {
                Serializable a4 = a(sf1Var.t(), sf1Var);
                if (a4 != null) {
                    arrayList.add(a4);
                }
            }
            return arrayList;
        }
        if (i4 == 11) {
            Date date = new Date((long) Double.longBitsToDouble(sf1Var.p()));
            sf1Var.f(2);
            return date;
        }
        if (i4 == 0) {
            return Double.valueOf(Double.longBitsToDouble(sf1Var.p()));
        }
        if (i4 == 1) {
            return Boolean.valueOf(sf1Var.t() == 1);
        }
        if (i4 == 2) {
            int z4 = sf1Var.z();
            int d4 = sf1Var.d();
            sf1Var.f(z4);
            return new String(sf1Var.c(), d4, z4);
        }
        if (i4 != 3) {
            return null;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            int z5 = sf1Var.z();
            int d5 = sf1Var.d();
            sf1Var.f(z5);
            String str = new String(sf1Var.c(), d5, z5);
            int t4 = sf1Var.t();
            if (t4 == 9) {
                return hashMap;
            }
            Serializable a5 = a(t4, sf1Var);
            if (a5 != null) {
                hashMap.put(str, a5);
            }
        }
    }

    private static HashMap<String, Object> a(sf1 sf1Var) {
        int x4 = sf1Var.x();
        HashMap<String, Object> hashMap = new HashMap<>(x4);
        for (int i4 = 0; i4 < x4; i4++) {
            int z4 = sf1Var.z();
            int d4 = sf1Var.d();
            sf1Var.f(z4);
            String str = new String(sf1Var.c(), d4, z4);
            Serializable a4 = a(sf1Var.t(), sf1Var);
            if (a4 != null) {
                hashMap.put(str, a4);
            }
        }
        return hashMap;
    }
}
