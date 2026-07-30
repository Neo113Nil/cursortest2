package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.jF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1987jF implements SM {
    public final /* synthetic */ AbstractC2004jd A00;
    public final /* synthetic */ InterfaceC1116Nt A01;
    public final /* synthetic */ C1117Nu A02;
    public final /* synthetic */ C1839gi A03;
    public final /* synthetic */ boolean A04;

    public C1987jF(C1117Nu c1117Nu, C1839gi c1839gi, boolean z8, AbstractC2004jd abstractC2004jd, InterfaceC1116Nt interfaceC1116Nt) {
        this.A02 = c1117Nu;
        this.A03 = c1839gi;
        this.A04 = z8;
        this.A00 = abstractC2004jd;
        this.A01 = interfaceC1116Nt;
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACx() {
        ArrayList arrayList;
        if (C1289Up.A1q(this.A03) && this.A04) {
            arrayList = this.A02.A02;
            arrayList.add(AbstractC1624dD.A01(this.A03, this.A00, 1, new C1988jG(this)));
        } else {
            this.A01.ACp();
        }
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACy() {
        this.A01.ACo(AdError.CACHE_ERROR);
    }
}
