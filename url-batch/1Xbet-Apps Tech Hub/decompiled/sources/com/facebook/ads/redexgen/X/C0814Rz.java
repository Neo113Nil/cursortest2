package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Rz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0814Rz extends C4Q<C0806Rr> {
    public int A00;
    public int A01;
    public int A02;
    public AbstractC0651Ls A03;
    public InterfaceC0652Lt A04;
    public String A05;
    public List<PC> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AbstractC1045aS A08;
    public final C6Q A09;
    public final YA A0A;
    public final InterfaceC0565If A0B;
    public final LN A0C;
    public final S0 A0D;
    public final C0587Jb A0E;
    public final C0764Qb A0F;

    public C0814Rz(YA ya, List<PC> list, AbstractC1045aS abstractC1045aS, InterfaceC0565If interfaceC0565If, C6Q c6q, C0764Qb c0764Qb, LN ln, InterfaceC0652Lt interfaceC0652Lt, String str, S0 s0, C0587Jb c0587Jb, AbstractC0651Ls abstractC0651Ls) {
        this.A0A = ya;
        this.A0B = interfaceC0565If;
        this.A09 = c6q;
        this.A0F = c0764Qb;
        this.A0C = ln;
        this.A04 = interfaceC0652Lt;
        this.A08 = abstractC1045aS;
        this.A06 = list;
        this.A05 = str;
        this.A0D = s0;
        this.A0E = c0587Jb;
        this.A03 = abstractC0651Ls;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4Q
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C0806Rr A0C(ViewGroup viewGroup, int i) {
        InterfaceC0652Lt interfaceC0652Lt = this.A04;
        if (interfaceC0652Lt == null || this.A00 == 0) {
            return null;
        }
        return new C0806Rr(NX.A01(new C0709Ny(this.A0A, this.A0B, interfaceC0652Lt, this.A08, null, this.A0F, this.A0C).A0I(this.A0E).A0H(this.A03).A0K(), this.A05, this.A0D), this.A07, this.A0F, this.A06.size(), this.A0A, this.A08.A0x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4Q
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0E(C0806Rr c0806Rr, int i) {
        c0806Rr.A0l(this.A06.get(i), this.A0B, this.A09, this.A0C, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.X.C4Q
    public final int A0D() {
        return this.A06.size();
    }

    public final void A0F(int i, int i2, int i3) {
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
    }
}
