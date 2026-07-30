package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class Ez {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3457kA f24871a;

    /* renamed from: b, reason: collision with root package name */
    public final Uz f24872b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2970bA f24873c;

    /* renamed from: d, reason: collision with root package name */
    public final C4158xA f24874d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC3929sy f24875e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f24876f;

    /* renamed from: g, reason: collision with root package name */
    public final long f24877g;

    /* renamed from: h, reason: collision with root package name */
    public final long f24878h;

    public Ez(InterfaceC3457kA interfaceC3457kA, Uz uz, InterfaceC2970bA interfaceC2970bA, C4158xA c4158xA, InterfaceC3929sy interfaceC3929sy, boolean z8, long j9, long j10) {
        this.f24871a = interfaceC3457kA;
        this.f24872b = uz;
        this.f24873c = interfaceC2970bA;
        this.f24874d = c4158xA;
        this.f24875e = interfaceC3929sy;
        this.f24876f = z8;
        this.f24877g = j9;
        this.f24878h = j10;
    }

    public final JD a() {
        JD s3 = JD.s(this.f24873c.d());
        J2 j22 = J2.f25712x;
        HD hd = HD.f25326n;
        ZC u7 = C3686oN.u(s3, Throwable.class, j22, hd);
        InterfaceC3457kA interfaceC3457kA = this.f24871a;
        Objects.requireNonNull(interfaceC3457kA);
        return C3686oN.y(C3686oN.A(u7, new C2670Me(10, interfaceC3457kA), hd), new Bz(this, 0), hd);
    }

    public final JD b(final int i) {
        JD s3 = JD.s(this.f24872b.a());
        C2670Me c2670Me = new C2670Me(11, this);
        HD hd = HD.f25326n;
        ZC u7 = C3686oN.u(C3686oN.u(C3686oN.u(C3686oN.A(C3686oN.y(C3686oN.A(s3, c2670Me, hd), new Bz(this, 1), hd), J2.f25713y, hd), C4308zz.class, J2.f25714z, hd), Az.class, J2.f25688A, hd), C4254yz.class, new XA() { // from class: com.google.android.gms.internal.ads.Cz
            @Override // com.google.android.gms.internal.ads.XA
            public final /* synthetic */ Object apply(Object obj) {
                Ez ez = Ez.this;
                if (ez.f24876f) {
                    int i4 = i;
                    if (i4 < ez.f24877g) {
                        ez.f24875e.a(new L.a(ez, i4, 9), ez.f24878h * ((long) Math.pow(2.0d, i4)));
                    }
                }
                return Dz.f24617y;
            }
        }, hd);
        this.f24874d.e(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, u7);
        return u7;
    }
}
