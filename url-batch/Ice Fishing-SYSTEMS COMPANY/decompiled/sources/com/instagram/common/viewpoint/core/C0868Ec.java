package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ec, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0868Ec implements Comparable<C0868Ec> {
    public final boolean A00;
    public final boolean A01;

    public C0868Ec(C2399qI c2399qI, int i) {
        this.A00 = (c2399qI.A0H & 1) != 0;
        this.A01 = C07569h.A0S(i, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0868Ec c0868Ec) {
        return AbstractC2251ns.A01().A09(this.A01, c0868Ec.A01).A09(this.A00, c0868Ec.A00).A05();
    }
}
