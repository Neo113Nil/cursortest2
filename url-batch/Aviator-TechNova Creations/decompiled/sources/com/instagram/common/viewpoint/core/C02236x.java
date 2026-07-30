package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.6x, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02236x {
    public static final C1683mL A0E = new C1683mL(new Object());
    public final int A00;
    public final long A01;
    public final long A02;
    public final Timeline A03;
    public final C1683mL A04;
    public final C1683mL A05;
    public final C1673mA A06;
    public final EL A07;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "Start Stall Logging")
    public final EnumC1412hX A08;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "Determine if stall is from Audio for logging")
    public final boolean A09;
    public final boolean A0A;
    public volatile long A0B;
    public volatile long A0C;
    public volatile long A0D;

    public C02236x(Timeline timeline, long j, C1673mA c1673mA, EL el) {
        this(timeline, A0E, j, -9223372036854775807L, 1, false, c1673mA, el, A0E, j, j, j, EnumC1412hX.A09, false);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Customized to call base constructor")
    public C02236x(Timeline timeline, C1683mL c1683mL, long j, long j2, int i, boolean z, C1673mA c1673mA, EL el, C1683mL c1683mL2, long j3, long j4, long j5) {
        this(timeline, c1683mL, j, j2, i, z, c1673mA, el, c1683mL2, j3, j4, j5, EnumC1412hX.A09, false);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Customized to add new parameters")
    public C02236x(@MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) Timeline timeline, @MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) C1683mL c1683mL, long j, long j2, int i, boolean z, C1673mA c1673mA, EL el, C1683mL c1683mL2, long j3, long j4, long j5, EnumC1412hX enumC1412hX, boolean z2) {
        this.A03 = timeline;
        this.A05 = c1683mL;
        this.A02 = j;
        this.A01 = j2;
        this.A0C = j;
        this.A00 = i;
        this.A0A = z;
        this.A06 = c1673mA;
        this.A07 = el;
        this.A04 = c1683mL2;
        this.A0B = j3;
        this.A0D = j4;
        this.A0C = j5;
        this.A08 = enumC1412hX;
        this.A09 = z2;
    }

    public static void A00(C02236x c02236x, C02236x c02236x2) {
        c02236x2.A0C = c02236x.A0C;
        c02236x2.A0B = c02236x.A0B;
        c02236x2.A0D = c02236x.A0D;
    }

    public final C02236x A01(int i) {
        C02236x c02236x = new C02236x(this.A03, this.A05, this.A02, this.A01, i, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c02236x);
        return c02236x;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Stall Reason Logging in Hero")
    public final C02236x A02(int i, EnumC1412hX enumC1412hX, boolean z) {
        C02236x c02236x = new C02236x(this.A03, this.A05, this.A02, this.A01, i, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, enumC1412hX, z);
        A00(this, c02236x);
        return c02236x;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "To track Audio Stalls for Logging")
    public final C02236x A03(int i, boolean z) {
        C02236x c02236x = new C02236x(this.A03, this.A05, this.A02, this.A01, i, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, z);
        A00(this, c02236x);
        return c02236x;
    }

    public final C02236x A04(Timeline timeline) {
        C02236x c02236x = new C02236x(timeline, this.A05, this.A02, this.A01, this.A00, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c02236x);
        return c02236x;
    }

    public final C02236x A05(C1683mL c1683mL) {
        return new C02236x(this.A03, this.A05, this.A02, this.A01, this.A00, this.A0A, this.A06, this.A07, c1683mL, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
    }

    public final C02236x A06(C1683mL c1683mL, long j, long j2, long j3) {
        long j4 = j2;
        Timeline timeline = this.A03;
        if (!c1683mL.A00()) {
            j4 = -9223372036854775807L;
        }
        return new C02236x(timeline, c1683mL, j, j4, this.A00, this.A0A, this.A06, this.A07, this.A04, this.A0B, j3, j);
    }

    public final C02236x A07(C1673mA c1673mA, EL el) {
        C02236x c02236x = new C02236x(this.A03, this.A05, this.A02, this.A01, this.A00, this.A0A, c1673mA, el, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c02236x);
        return c02236x;
    }

    public final C02236x A08(boolean z) {
        C02236x c02236x = new C02236x(this.A03, this.A05, this.A02, this.A01, this.A00, z, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c02236x);
        return c02236x;
    }
}
