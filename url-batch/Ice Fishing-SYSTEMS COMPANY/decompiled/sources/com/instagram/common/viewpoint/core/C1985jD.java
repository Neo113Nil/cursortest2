package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.jD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1985jD implements InterfaceC1237Sp {
    public final /* synthetic */ AbstractC2004jd A00;
    public final /* synthetic */ InterfaceC1116Nt A01;
    public final /* synthetic */ C1117Nu A02;
    public final /* synthetic */ C1839gi A03;
    public final /* synthetic */ boolean A04;

    public C1985jD(C1117Nu c1117Nu, C1839gi c1839gi, boolean z8, AbstractC2004jd abstractC2004jd, InterfaceC1116Nt interfaceC1116Nt) {
        this.A02 = c1117Nu;
        this.A03 = c1839gi;
        this.A04 = z8;
        this.A00 = abstractC2004jd;
        this.A01 = interfaceC1116Nt;
    }

    private void A00(boolean z8) {
        ArrayList arrayList;
        if (z8) {
            if (C1289Up.A1q(this.A03) && this.A04) {
                arrayList = this.A02.A02;
                arrayList.add(AbstractC1624dD.A01(this.A03, this.A00, 1, new C1986jE(this)));
                return;
            } else {
                this.A01.ACp();
                return;
            }
        }
        this.A01.ACo(AdError.CACHE_ERROR);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1237Sp
    public final void ADL() {
        A00(false);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1237Sp
    public final void ADT() {
        A00(true);
    }
}
