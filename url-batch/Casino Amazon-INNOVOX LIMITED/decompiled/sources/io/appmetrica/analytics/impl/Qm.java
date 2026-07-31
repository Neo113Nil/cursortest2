package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class Qm {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1021a;

    public Qm() {
        HashMap hashMap = new HashMap();
        this.f1021a = hashMap;
        Km km = new Km();
        Lm lm = new Lm();
        Mm mm = new Mm();
        Nm nm = new Nm();
        hashMap.put(C0312km.class, km);
        hashMap.put(U1.class, lm);
        hashMap.put(C0150ef.class, mm);
        hashMap.put(C0518t3.class, nm);
    }

    public static Rm a(Class cls) {
        return (Rm) Pm.f1007a.f1021a.get(cls);
    }
}
