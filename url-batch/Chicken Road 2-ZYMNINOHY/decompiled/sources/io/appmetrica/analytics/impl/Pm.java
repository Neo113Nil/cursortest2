package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class Pm {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f10830a;

    public Pm() {
        HashMap hashMap = new HashMap();
        this.f10830a = hashMap;
        Jm jm = new Jm();
        Km km = new Km();
        Lm lm = new Lm();
        Mm mm = new Mm();
        hashMap.put(C0725jm.class, jm);
        hashMap.put(T1.class, km);
        hashMap.put(C0564df.class, lm);
        hashMap.put(C0939s3.class, mm);
    }

    public static Qm a(Class cls) {
        return (Qm) Om.f10778a.f10830a.get(cls);
    }
}
