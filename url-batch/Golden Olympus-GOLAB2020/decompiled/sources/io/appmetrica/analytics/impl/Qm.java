package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class Qm {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f38178a;

    public Qm() {
        HashMap hashMap = new HashMap();
        this.f38178a = hashMap;
        Km km = new Km();
        Lm lm = new Lm();
        Mm mm = new Mm();
        Nm nm = new Nm();
        Om om = new Om();
        hashMap.put(C2737jm.class, km);
        hashMap.put(Z1.class, lm);
        hashMap.put(C2937rf.class, mm);
        hashMap.put(C3054w2.class, nm);
        hashMap.put(O3.class, om);
    }

    public static Rm a(Class cls) {
        return (Rm) Pm.f38143a.f38178a.get(cls);
    }
}
