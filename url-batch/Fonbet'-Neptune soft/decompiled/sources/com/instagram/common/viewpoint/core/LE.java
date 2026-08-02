package com.instagram.common.viewpoint.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class LE extends QC<FD> {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC0884Xn A03;
    public C1226eX A04;
    public String A05;
    public List<C1120cn> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AbstractC1428hy A08;
    public final SF A09;
    public final C1153dL A0A;
    public final US A0B;
    public final C0696Qc A0C;
    public final XH A0D;
    public final C01865s A0E;
    public final C0356Cw A0F;

    public LE(C1153dL c1153dL, List<C1120cn> list, AbstractC1428hy abstractC1428hy, US us, C0696Qc c0696Qc, InterfaceC0884Xn interfaceC0884Xn, String str, C01865s c01865s, C0356Cw c0356Cw) {
        this.A0A = c1153dL;
        this.A0B = us;
        this.A0C = c0696Qc;
        this.A09 = c0696Qc.A11();
        this.A04 = c0696Qc.A1B();
        this.A0D = c0696Qc.A1A();
        this.A03 = interfaceC0884Xn;
        this.A08 = abstractC1428hy;
        this.A06 = list;
        this.A05 = str;
        this.A0E = c01865s;
        this.A0F = c0356Cw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.QC
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final FD A0F(ViewGroup viewGroup, int i) {
        return new FD(AbstractC0954a6.A00(new C0990ah(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0T(this.A0F).A0O(this.A0C).A0W(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A, this.A08.A21());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.QC
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(FD fd, int i) {
        C1120cn c1120cn = this.A06.get(i);
        fd.A0q(this.A04);
        fd.A0p(c1120cn, this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.instagram.common.viewpoint.core.QC
    public final int A0B() {
        return this.A06.size();
    }

    public final void A0O(int i, int i2, int i3) {
        boolean needsUpdate = i != this.A00;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        if (needsUpdate) {
            A0G();
        }
    }

    public final void A0P(C1226eX c1226eX) {
        this.A04 = c1226eX;
    }
}
