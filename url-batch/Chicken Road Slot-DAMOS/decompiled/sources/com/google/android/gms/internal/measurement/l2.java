package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l2 {

    /* renamed from: c, reason: collision with root package name */
    public static final l2 f2493c = new l2();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f2495b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final v5 f2494a = new v5(1);

    public final o2 a(Class cls) {
        o2 z10;
        ConcurrentHashMap concurrentHashMap = this.f2495b;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return (o2) obj;
        }
        v5 v5Var = this.f2494a;
        v5Var.getClass();
        h1 h1Var = p2.f2660a;
        if (!k1.class.isAssignableFrom(cls)) {
            int i3 = q0.f2690a;
        }
        n2 b10 = ((v5) v5Var.f2870e).b(cls);
        if ((b10.f2562d & 2) == 2) {
            int i10 = q0.f2690a;
            h1 h1Var2 = p2.f2660a;
            h1 h1Var3 = d1.f2211a;
            z10 = new h2(h1Var2, b10.f2559a);
        } else {
            int i11 = q0.f2690a;
            int i12 = i2.f2390a;
            int i13 = y1.f3002a;
            h1 h1Var4 = p2.f2660a;
            h1 h1Var5 = b10.a() + (-1) != 1 ? d1.f2211a : null;
            int i14 = c2.f2182a;
            z10 = g2.z(b10, h1Var4, h1Var5);
        }
        o2 o2Var = (o2) concurrentHashMap.putIfAbsent(cls, z10);
        return o2Var != null ? o2Var : z10;
    }
}
