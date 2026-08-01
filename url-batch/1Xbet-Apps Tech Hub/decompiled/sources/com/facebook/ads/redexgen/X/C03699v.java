package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.9v, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03699v {
    public static final C03699v A02;
    public static final C03699v A03;
    public static final C03699v A04;
    public static final C03699v A05;
    public static final C03699v A06;
    public final long A00;
    public final long A01;

    static {
        C03699v c03699v = new C03699v(0L, 0L);
        A04 = c03699v;
        A02 = new C03699v(Long.MAX_VALUE, Long.MAX_VALUE);
        A06 = new C03699v(Long.MAX_VALUE, 0L);
        A05 = new C03699v(0L, Long.MAX_VALUE);
        A03 = c03699v;
    }

    public C03699v(long j, long j2) {
        HI.A03(j >= 0);
        HI.A03(j2 >= 0);
        this.A01 = j;
        this.A00 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C03699v c03699v = (C03699v) obj;
        return this.A01 == c03699v.A01 && this.A00 == c03699v.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
