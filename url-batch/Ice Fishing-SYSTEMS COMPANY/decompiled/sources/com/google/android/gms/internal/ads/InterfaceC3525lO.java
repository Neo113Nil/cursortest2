package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC3525lO {
    void a(VO vo);

    void b(VO vo);

    void c(C3417jO c3417jO, InterfaceC3716p[] interfaceC3716pArr);

    InterfaceC3985u d(VO vo);

    boolean e(C3417jO c3417jO);

    long f();

    boolean g(C3417jO c3417jO);

    default boolean h() {
        AbstractC3217fl.I("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    void i(VO vo);
}
