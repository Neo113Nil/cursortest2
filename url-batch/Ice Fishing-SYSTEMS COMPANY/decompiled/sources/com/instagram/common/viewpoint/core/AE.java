package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class AE implements InterfaceC2308oo, InterfaceC07187p {
    public int A00;
    public int A01;
    public long A02;
    public long A04;
    public C07217s A05;
    public C8O A06;
    public DT A07;
    public boolean A08;
    public boolean A09;
    public C2399qI[] A0A;
    public final int A0C;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D18870411: Adding start stall debug reason")
    public EnumC1965ir A0B = EnumC1965ir.A09;
    public final C07026z A0D = new C07026z();
    public long A03 = Long.MIN_VALUE;

    public abstract void A1Z();

    public abstract void A1a(long j9, boolean z8) throws AD;

    public abstract void A1c(C2399qI[] c2399qIArr, long j9, long j10) throws AD;

    public AE(int i) {
        this.A0C = i;
    }

    private final int A1O() {
        return this.A00;
    }

    private void A1P(long j9, boolean z8) throws AD {
        this.A08 = false;
        this.A02 = j9;
        this.A03 = j9;
        A1a(j9, z8);
    }

    public final int A1Q(long j9) {
        return ((DT) AbstractC06233y.A01(this.A07)).AK2(j9 - this.A04);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Keep track of the non-adjusted timestamp")
    public final int A1R(C07026z c07026z, C2320p0 c2320p0, int i) {
        int AHP = ((DT) AbstractC06233y.A01(this.A07)).AHP(c07026z, c2320p0, i);
        if (AHP == -4) {
            if (c2320p0.A05()) {
                this.A03 = Long.MIN_VALUE;
                return this.A08 ? -4 : -3;
            }
            c2320p0.A00 = c2320p0.A01;
            c2320p0.A01 += this.A04;
            this.A03 = Math.max(this.A03, c2320p0.A01);
        } else if (AHP == -5) {
            C2399qI c2399qI = (C2399qI) AbstractC06233y.A01(c07026z.A00);
            if (c2399qI.A0M != Long.MAX_VALUE) {
                c07026z.A00 = c2399qI.A07().A0s(c2399qI.A0M + this.A04).A14();
            }
        }
        return AHP;
    }

    public final AD A1S(Throwable th, C2399qI c2399qI, int i) {
        return A1T(th, c2399qI, false, i);
    }

    public final AD A1T(Throwable th, C2399qI c2399qI, boolean z8, int i) {
        int i4 = 4;
        if (c2399qI != null && !this.A09) {
            this.A09 = true;
            try {
                int formatSupport = AKM(c2399qI);
                i4 = AbstractC07117i.A03(formatSupport);
            } catch (AD unused) {
            } catch (Throwable th2) {
                this.A09 = false;
                throw th2;
            }
            this.A09 = false;
        }
        return AD.A04(th, getName(), A1O(), c2399qI, i4, z8, i);
    }

    public final C07026z A1U() {
        this.A0D.A00();
        return this.A0D;
    }

    public final C07217s A1V() {
        return (C07217s) AbstractC06233y.A01(this.A05);
    }

    public final C8O A1W() {
        return (C8O) AbstractC06233y.A01(this.A06);
    }

    public void A1X() throws AD {
    }

    public void A1Y() {
    }

    public void A1b(boolean z8, boolean z9) throws AD {
    }

    public final boolean A1d() {
        return A9p() ? this.A08 : ((DT) AbstractC06233y.A01(this.A07)).AAe();
    }

    public final C2399qI[] A1e() {
        return (C2399qI[]) AbstractC06233y.A01(this.A0A);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2308oo
    public final void A5x() {
        AbstractC06233y.A08(this.A01 == 1);
        this.A0D.A00();
        this.A01 = 0;
        this.A07 = null;
        this.A0A = null;
        this.A08 = false;
        A1Z();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2308oo
    public final void A6L(C07217s c07217s, C2399qI[] c2399qIArr, DT dt, long j9, boolean z8, boolean z9, long j10, long j11) throws AD {
        AbstractC06233y.A08(this.A01 == 0);
        this.A05 = c07217s;
        this.A01 = 1;
        A1b(z8, z9);
        AIa(c2399qIArr, dt, j10, j11);
        A1P(j9, z8);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2308oo
    public final InterfaceC07187p A7D() {
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2308oo
    public AnonymousClass78 A8T() {
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2308oo
    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "D18870411: Adding start stall debug reason")
    public final EnumC1965ir A99() {
        return this.A0B;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2308oo
    public final int A9A() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2308oo
    public final DT A9D() {
        return this.A07;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2308oo, com.instagram.common.viewpoint.core.InterfaceC07187p
    public final int A9N() {
        return this.A0C;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07057c
    public void A9i(int i, Object obj) throws AD {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2308oo
    public final boolean A9p() {
        return this.A03 == Long.MIN_VALUE;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2308oo
    public final void AA9(int i, C8O c8o) {
        this.A00 = i;
        this.A06 = c8o;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2308oo
    public final boolean AAN() {
        return this.A08;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2308oo
    public final void ACU() throws IOException {
        ((DT) AbstractC06233y.A01(this.A07)).ACR();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2308oo
    public final void AIa(C2399qI[] c2399qIArr, DT dt, long j9, long j10) throws AD {
        AbstractC06233y.A08(!this.A08);
        this.A07 = dt;
        if (this.A03 == Long.MIN_VALUE) {
            this.A03 = j9;
        }
        this.A0A = c2399qIArr;
        this.A04 = j10;
        A1c(c2399qIArr, j9, j10);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2308oo
    public final void AIm(long j9) throws AD {
        A1P(j9, false);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2308oo
    public final void AJN() {
        this.A08 = true;
    }

    public int AKO() throws AD {
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2308oo
    public final void start() throws AD {
        AbstractC06233y.A08(this.A01 == 1);
        this.A01 = 2;
        A1X();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2308oo
    public final void stop() {
        AbstractC06233y.A08(this.A01 == 2);
        this.A01 = 1;
        A1Y();
    }
}
