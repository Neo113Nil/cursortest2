package com.instagram.common.viewpoint.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class F4 extends QC<C0413Ev> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AbstractC0889Xm A04;
    public InterfaceC0890Xn A05;
    public String A06;
    public List<C1126cn> A07;
    public boolean A08;
    public final SparseBooleanArray A09 = new SparseBooleanArray();
    public final AbstractC1434hy A0A;
    public final SF A0B;
    public final C1159dL A0C;
    public final US A0D;
    public final XH A0E;
    public final FH A0F;
    public final C1232eX A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public F4(C1159dL c1159dL, List<C1126cn> list, AbstractC1434hy abstractC1434hy, US us, SF sf, C1232eX c1232eX, XH xh, InterfaceC0890Xn interfaceC0890Xn, String str, int i, int i2, int i3, int i4, FH fh, AbstractC0889Xm abstractC0889Xm) {
        this.A0C = c1159dL;
        this.A0D = us;
        this.A0B = sf;
        this.A0G = c1232eX;
        this.A0E = xh;
        this.A05 = interfaceC0890Xn;
        this.A0A = abstractC1434hy;
        this.A07 = list;
        this.A00 = i;
        this.A03 = i4;
        this.A06 = str;
        this.A01 = i3;
        this.A02 = i2;
        this.A0F = fh;
        this.A04 = abstractC0889Xm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.QC
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0413Ev A0F(ViewGroup viewGroup, int i) {
        return new C0413Ev(AbstractC1056bf.A00(new C0996ah(this.A0C, this.A0D, this.A05, this.A0A, null, this.A0G, this.A0E).A0R(this.A04).A0W(), this.A03, this.A06, this.A0F), this.A09, this.A0G, this.A00, this.A01, this.A02, this.A07.size(), this.A0C, this.A0A.A21());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.QC
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(C0413Ev c0413Ev, int i) {
        c0413Ev.A0q(this.A07.get(i), this.A0D, this.A0B, this.A0E, this.A06);
        if (!this.A08 && i == 0) {
            c0413Ev.AIV();
            this.A08 = true;
        }
    }

    @Override // com.instagram.common.viewpoint.core.QC
    public final int A0B() {
        return this.A07.size();
    }
}
