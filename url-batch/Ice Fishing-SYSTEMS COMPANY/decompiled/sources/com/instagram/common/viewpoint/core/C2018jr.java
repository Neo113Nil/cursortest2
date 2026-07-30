package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.jr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2018jr implements SM {
    public final /* synthetic */ C07257w A00;
    public final /* synthetic */ boolean A01;

    public C2018jr(C07257w c07257w, boolean z8) {
        this.A00 = c07257w;
        this.A01 = z8;
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACx() {
        C1839gi c1839gi;
        AtomicBoolean atomicBoolean;
        NJ nj;
        C1839gi c1839gi2;
        NQ nq;
        c1839gi = this.A00.A04;
        if (!C1289Up.A1t(c1839gi) || !this.A01) {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            nj = this.A00.A01;
            nj.AFm(this.A00);
            return;
        }
        C07257w c07257w = this.A00;
        c1839gi2 = this.A00.A04;
        nq = this.A00.A03;
        c07257w.A06 = AbstractC1624dD.A01(c1839gi2, (C07147l) nq, 0, new C2019js(this));
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACy() {
        NJ nj;
        nj = this.A00.A01;
        nj.AFp(this.A00, AdError.CACHE_ERROR);
    }
}
