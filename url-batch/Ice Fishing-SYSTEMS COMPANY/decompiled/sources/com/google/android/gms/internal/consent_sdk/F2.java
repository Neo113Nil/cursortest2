package com.google.android.gms.internal.consent_sdk;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class F2 {

    /* renamed from: c, reason: collision with root package name */
    public static final F2 f35677c = new F2();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f35679b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final C4399w2 f35678a = new C4399w2(0);

    public final I2 a(Class cls) {
        I2 k6;
        Charset charset = AbstractC4383s2.f35907a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f35679b;
        I2 i22 = (I2) concurrentHashMap.get(cls);
        if (i22 != null) {
            return i22;
        }
        C4399w2 c4399w2 = this.f35678a;
        c4399w2.getClass();
        O2 o22 = J2.f35717a;
        if (!AbstractC4368o2.class.isAssignableFrom(cls)) {
            int i = AbstractC4328e2.f35830a;
        }
        H2 c4 = ((C4399w2) c4399w2.f35944u).c(cls);
        if ((c4.f35691d & 2) == 2) {
            int i4 = AbstractC4328e2.f35830a;
            O2 o23 = J2.f35717a;
            J1 j12 = AbstractC4352k2.f35871a;
            k6 = new D2(o23, c4.f35688a);
        } else {
            int i9 = AbstractC4328e2.f35830a;
            int i10 = E2.f35671a;
            int i11 = AbstractC4395v2.f35936a;
            O2 o24 = J2.f35717a;
            J1 j13 = c4.a() + (-1) != 1 ? AbstractC4352k2.f35871a : null;
            int i12 = AbstractC4411z2.f35965a;
            k6 = C2.k(c4, o24, j13);
        }
        I2 i23 = (I2) concurrentHashMap.putIfAbsent(cls, k6);
        return i23 != null ? i23 : k6;
    }
}
