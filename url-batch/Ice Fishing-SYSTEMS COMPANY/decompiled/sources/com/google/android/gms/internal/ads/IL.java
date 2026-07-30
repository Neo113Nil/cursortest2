package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class IL {

    /* renamed from: c, reason: collision with root package name */
    public static final IL f25547c = new IL();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f25549b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Rx f25548a = new Rx(1);

    public final OL a(Class cls) {
        OL z8;
        ConcurrentHashMap concurrentHashMap = this.f25549b;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return (OL) obj;
        }
        Rx rx = this.f25548a;
        rx.getClass();
        T2 t22 = PL.f26905a;
        if (!AbstractC3199fL.class.isAssignableFrom(cls)) {
            int i = KK.f25952a;
        }
        KL e6 = ((C4086vt) rx.f27448u).e(cls);
        if ((e6.f25956d & 2) == 2) {
            int i4 = KK.f25952a;
            T2 t23 = PL.f26905a;
            C3307hK c3307hK = ZK.f28981a;
            z8 = new EL(t23, e6.f25953a);
        } else {
            int i9 = KK.f25952a;
            int i10 = FL.f24950a;
            int i11 = AbstractC4007uL.f34582a;
            T2 t24 = PL.f26905a;
            C3307hK c3307hK2 = e6.a() + (-1) != 1 ? ZK.f28981a : null;
            int i12 = AbstractC4223yL.f35342a;
            z8 = DL.z(e6, t24, c3307hK2);
        }
        OL ol = (OL) concurrentHashMap.putIfAbsent(cls, z8);
        return ol != null ? ol : z8;
    }
}
