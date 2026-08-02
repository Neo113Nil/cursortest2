package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class P0 {

    /* renamed from: c, reason: collision with root package name */
    public static final P0 f5897c = new P0();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f5899b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final H0 f5898a = new H0();

    public final S0 a(Class cls) {
        S0 u4;
        Charset charset = B0.f5803a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f5899b;
        S0 s02 = (S0) concurrentHashMap.get(cls);
        if (s02 != null) {
            return s02;
        }
        H0 h02 = this.f5898a;
        h02.getClass();
        C0349u0 c0349u0 = T0.f5912a;
        AbstractC0353w0.class.isAssignableFrom(cls);
        R0 a3 = ((H0) h02.f5850a).a(cls);
        if ((a3.f5907d & 2) == 2) {
            C0349u0 c0349u02 = T0.f5912a;
            C0349u0 c0349u03 = AbstractC0342q0.f5996a;
            u4 = new N0(c0349u02, a3.f5904a);
        } else {
            int i4 = O0.f5896a;
            int i5 = F0.f5830a;
            C0349u0 c0349u04 = T0.f5912a;
            C0349u0 c0349u05 = a3.a() + (-1) != 1 ? AbstractC0342q0.f5996a : null;
            int i6 = J0.f5863a;
            u4 = M0.u(a3, c0349u04, c0349u05);
        }
        S0 s03 = (S0) concurrentHashMap.putIfAbsent(cls, u4);
        return s03 != null ? s03 : u4;
    }
}
