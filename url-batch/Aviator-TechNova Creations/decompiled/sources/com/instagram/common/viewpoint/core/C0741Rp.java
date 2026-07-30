package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Rp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0741Rp {
    public final long A00;
    public final EnumC0740Ro A01;
    public final String A02;
    public final boolean A03;

    public C0741Rp(String str, boolean z, EnumC0740Ro enumC0740Ro) {
        this(str, z, enumC0740Ro, System.currentTimeMillis());
    }

    public C0741Rp(String str, boolean z, EnumC0740Ro enumC0740Ro, long j) {
        this.A02 = str;
        this.A03 = z;
        this.A01 = enumC0740Ro;
        this.A00 = j;
    }

    public static C0741Rp A00() {
        return new C0741Rp("", true, EnumC0740Ro.A05, -1L);
    }

    public final long A01() {
        return this.A00;
    }

    public final EnumC0740Ro A02() {
        return this.A01;
    }

    public final String A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A03;
    }
}
