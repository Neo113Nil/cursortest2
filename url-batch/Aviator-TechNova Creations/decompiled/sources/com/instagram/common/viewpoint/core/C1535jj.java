package com.instagram.common.viewpoint.core;

import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.jacoco.core.runtime.AgentOptions;

/* renamed from: com.facebook.ads.redexgen.X.jj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1535jj implements KW {
    public C1836or A00;
    public C4R A01;
    public H1 A02;

    public C1535jj(String str) {
        this.A00 = new C2D().A11(str).A14();
    }

    @EnsuresNonNull({"timestampAdjuster", AgentOptions.OUTPUT})
    private void A00() {
        C3M.A02(this.A01);
    }

    @Override // com.instagram.common.viewpoint.core.KW
    public final void A52(C4J c4j) {
        A00();
        long A03 = this.A01.A03();
        long A04 = this.A01.A04();
        if (A03 == -9223372036854775807L || A04 == -9223372036854775807L) {
            return;
        }
        if (A04 != this.A00.A0M) {
            this.A00 = this.A00.A07().A0s(A04).A14();
            this.A02.A6W(this.A00);
        }
        int A07 = c4j.A07();
        this.A02.AI7(c4j, A07);
        this.A02.AIA(A03, 1, A07, 0, null);
    }

    @Override // com.instagram.common.viewpoint.core.KW
    public final void AA2(C4R c4r, GY gy, C0551Ke c0551Ke) {
        this.A01 = c4r;
        c0551Ke.A05();
        this.A02 = gy.AJh(c0551Ke.A03(), 5);
        this.A02.A6W(this.A00);
    }
}
