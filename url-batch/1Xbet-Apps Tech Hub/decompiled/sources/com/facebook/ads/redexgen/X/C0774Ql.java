package com.facebook.ads.redexgen.X;

import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.Ql, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0774Ql {
    public C0778Qp A00;
    public Set<String> A01;
    public Set<String> A02;
    public boolean A03;
    public boolean A04 = true;

    public final C0774Ql A00(C0778Qp c0778Qp) {
        this.A00 = c0778Qp;
        return this;
    }

    public final C0774Ql A01(Set<String> pinnedCertificates) {
        this.A01 = pinnedCertificates;
        return this;
    }

    public final C0774Ql A02(Set<String> pinnedPublicKeys) {
        this.A02 = pinnedPublicKeys;
        return this;
    }

    public final C0774Ql A03(boolean z) {
        this.A04 = z;
        return this;
    }

    public final C0774Ql A04(boolean z) {
        this.A03 = z;
        return this;
    }

    public final C0775Qm A05() {
        return new C0775Qm(this.A00, this.A04, this.A02, this.A01, this.A03);
    }
}
