package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class Tm {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6723a;

    public Tm() {
        HashMap hashMap = new HashMap();
        this.f6723a = hashMap;
        Nm nm = new Nm();
        Om om = new Om();
        Pm pm = new Pm();
        Qm qm = new Qm();
        hashMap.put(C0707nm.class, nm);
        hashMap.put(C0403c2.class, om);
        hashMap.put(Cif.class, pm);
        hashMap.put(A3.class, qm);
    }

    public static Um a(Class cls) {
        return (Um) Sm.f6663a.f6723a.get(cls);
    }
}
