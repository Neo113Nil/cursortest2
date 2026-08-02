package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class A1 {

    /* renamed from: c, reason: collision with root package name */
    public static final A1 f2703c = new A1();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f2705b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final C0257r1 f2704a = new C0257r1();

    public final D1 a(Class cls) {
        D1 u3;
        Charset charset = AbstractC0240l1.f2880a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f2705b;
        D1 d12 = (D1) concurrentHashMap.get(cls);
        if (d12 != null) {
            return d12;
        }
        C0257r1 c0257r1 = this.f2704a;
        c0257r1.getClass();
        C0219e1 c0219e1 = E1.f2727a;
        AbstractC0225g1.class.isAssignableFrom(cls);
        C1 a3 = ((C0257r1) c0257r1.f2915a).a(cls);
        if ((a3.f2720d & 2) == 2) {
            C0219e1 c0219e12 = E1.f2727a;
            C0219e1 c0219e13 = AbstractC0210b1.f2833a;
            u3 = new C0275x1(c0219e12, a3.f2717a);
        } else {
            int i3 = AbstractC0278y1.f2963a;
            int i4 = AbstractC0255q1.f2907a;
            C0219e1 c0219e14 = E1.f2727a;
            C0219e1 c0219e15 = a3.a() + (-1) != 1 ? AbstractC0210b1.f2833a : null;
            int i5 = AbstractC0263t1.f2934a;
            u3 = C0272w1.u(a3, c0219e14, c0219e15);
        }
        D1 d13 = (D1) concurrentHashMap.putIfAbsent(cls, u3);
        return d13 == null ? u3 : d13;
    }
}
