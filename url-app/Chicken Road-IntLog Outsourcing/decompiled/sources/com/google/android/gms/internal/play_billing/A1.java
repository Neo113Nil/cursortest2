package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class A1 {

    /* renamed from: c, reason: collision with root package name */
    public static final A1 f5019c = new A1();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f5021b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final C0366r1 f5020a = new C0366r1();

    public final D1 a(Class cls) {
        Charset charset = AbstractC0349l1.f5205a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f5021b;
        D1 d12 = (D1) concurrentHashMap.get(cls);
        if (d12 == null) {
            C0366r1 c0366r1 = this.f5020a;
            c0366r1.getClass();
            C0328e1 c0328e1 = E1.f5043a;
            AbstractC0334g1.class.isAssignableFrom(cls);
            C1 a6 = ((C0366r1) c0366r1.f5242a).a(cls);
            if ((a6.f5036d & 2) == 2) {
                C0328e1 c0328e12 = E1.f5043a;
                C0328e1 c0328e13 = AbstractC0319b1.f5156a;
                d12 = new C0384x1(c0328e12, a6.f5033a);
            } else {
                int i2 = AbstractC0387y1.f5292a;
                int i3 = AbstractC0364q1.f5234a;
                C0328e1 c0328e14 = E1.f5043a;
                C0328e1 c0328e15 = a6.b() + (-1) != 1 ? AbstractC0319b1.f5156a : null;
                int i6 = AbstractC0372t1.f5262a;
                d12 = C0381w1.u(a6, c0328e14, c0328e15);
            }
            D1 d13 = (D1) concurrentHashMap.putIfAbsent(cls, d12);
            if (d13 != null) {
                return d13;
            }
        }
        return d12;
    }
}
