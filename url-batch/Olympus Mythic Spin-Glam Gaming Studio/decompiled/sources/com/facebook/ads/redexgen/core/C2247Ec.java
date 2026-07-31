package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ec, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2247Ec implements Comparable<C2247Ec> {
    public final boolean A00;
    public final boolean A01;

    public C2247Ec(C3778qI c3778qI, int i) {
        this.A00 = (c3778qI.A0H & 1) != 0;
        this.A01 = C21359h.A0S(i, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2247Ec c2247Ec) {
        return AbstractC3630ns.A01().A09(this.A01, c2247Ec.A01).A09(this.A00, c2247Ec.A00).A05();
    }
}
