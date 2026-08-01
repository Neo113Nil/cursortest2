package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class TH extends C4Q<C0806Rr> {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC0652Lt A03;
    public C0764Qb A04;
    public String A05;
    public List<PC> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AbstractC1045aS A08;
    public final C6Q A09;
    public final YA A0A;
    public final InterfaceC0565If A0B;
    public final UJ A0C;
    public final LN A0D;
    public final C03579j A0E;
    public final C0587Jb A0F;

    public TH(YA ya, List<PC> list, AbstractC1045aS abstractC1045aS, InterfaceC0565If interfaceC0565If, UJ uj, InterfaceC0652Lt interfaceC0652Lt, String str, C03579j c03579j, C0587Jb c0587Jb) {
        this.A0A = ya;
        this.A0B = interfaceC0565If;
        this.A0C = uj;
        this.A09 = uj.A10();
        this.A04 = uj.A1A();
        this.A0D = uj.A19();
        this.A03 = interfaceC0652Lt;
        this.A08 = abstractC1045aS;
        this.A06 = list;
        this.A05 = str;
        this.A0E = c03579j;
        this.A0F = c0587Jb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4Q
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C0806Rr A0C(ViewGroup viewGroup, int i) {
        return new C0806Rr(NX.A00(new C0709Ny(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0I(this.A0F).A0G(this.A0C).A0K(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A, this.A08.A0x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4Q
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0E(C0806Rr c0806Rr, int i) {
        PC pc = this.A06.get(i);
        c0806Rr.A0m(this.A04);
        c0806Rr.A0l(pc, this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.X.C4Q
    public final int A0D() {
        return this.A06.size();
    }

    public final void A0F(int i, int i2, int i3) {
        boolean needsUpdate = i != this.A00;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        if (needsUpdate) {
            A06();
        }
    }

    public final void A0G(C0764Qb c0764Qb) {
        this.A04 = c0764Qb;
    }
}
