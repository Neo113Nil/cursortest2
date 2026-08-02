package com.instagram.common.viewpoint.core;

import android.os.Bundle;

/* renamed from: com.facebook.ads.redexgen.X.om, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1825om implements C1S {
    public final long A00;
    public final long A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public static final C1825om A06 = new C2J().A0A();
    public static final C1R<C02769r> A05 = new C1R() { // from class: com.facebook.ads.redexgen.X.on
        @Override // com.instagram.common.viewpoint.core.C1R
        public final C1S A6X(Bundle bundle) {
            C02769r A0B;
            A0B = new C2J().A06(bundle.getLong(C1825om.A01(0), 0L)).A05(bundle.getLong(C1825om.A01(1), Long.MIN_VALUE)).A08(bundle.getBoolean(C1825om.A01(2), false)).A07(bundle.getBoolean(C1825om.A01(3), false)).A09(bundle.getBoolean(C1825om.A01(4), false)).A0B();
            return A0B;
        }
    };

    public C1825om(C2J c2j) {
        long j;
        long j2;
        boolean z;
        boolean z2;
        boolean z3;
        j = c2j.A01;
        this.A01 = j;
        j2 = c2j.A00;
        this.A00 = j2;
        z = c2j.A03;
        this.A03 = z;
        z2 = c2j.A02;
        this.A02 = z2;
        z3 = c2j.A04;
        this.A04 = z3;
    }

    public static String A01(int i) {
        return Integer.toString(i, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1825om)) {
            return false;
        }
        C1825om c1825om = (C1825om) obj;
        return this.A01 == c1825om.A01 && this.A00 == c1825om.A00 && this.A03 == c1825om.A03 && this.A02 == c1825om.A02 && this.A04 == c1825om.A04;
    }

    public final int hashCode() {
        return (((((((((int) (this.A01 ^ (this.A01 >>> 32))) * 31) + ((int) (this.A00 ^ (this.A00 >>> 32)))) * 31) + (this.A03 ? 1 : 0)) * 31) + (this.A02 ? 1 : 0)) * 31) + (this.A04 ? 1 : 0);
    }
}
