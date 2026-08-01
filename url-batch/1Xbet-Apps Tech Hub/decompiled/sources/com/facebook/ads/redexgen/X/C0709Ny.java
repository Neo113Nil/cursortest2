package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ny, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0709Ny {
    public boolean A00;
    public View A03;
    public UJ A04;
    public AbstractC0651Ls A05;
    public C0587Jb A06;
    public final View A07;
    public final AbstractC1045aS A08;
    public final YA A09;
    public final InterfaceC0565If A0A;
    public final LN A0B;
    public final InterfaceC0652Lt A0C;
    public final C0764Qb A0D;
    public int A02 = 0;
    public int A01 = 1;

    public C0709Ny(YA ya, InterfaceC0565If interfaceC0565If, InterfaceC0652Lt interfaceC0652Lt, AbstractC1045aS abstractC1045aS, View view, C0764Qb c0764Qb, LN ln) {
        this.A09 = ya;
        this.A0A = interfaceC0565If;
        this.A0C = interfaceC0652Lt;
        this.A08 = abstractC1045aS;
        this.A07 = view;
        this.A0D = c0764Qb;
        this.A0B = ln;
    }

    public final C0709Ny A0D(int i) {
        this.A01 = i;
        return this;
    }

    public final C0709Ny A0E(int i) {
        this.A02 = i;
        return this;
    }

    public final C0709Ny A0F(View view) {
        this.A03 = view;
        return this;
    }

    public final C0709Ny A0G(UJ uj) {
        this.A04 = uj;
        return this;
    }

    public final C0709Ny A0H(AbstractC0651Ls abstractC0651Ls) {
        this.A05 = abstractC0651Ls;
        return this;
    }

    public final C0709Ny A0I(C0587Jb c0587Jb) {
        this.A06 = c0587Jb;
        return this;
    }

    public final C0709Ny A0J(boolean z) {
        this.A00 = z;
        return this;
    }

    public final C0710Nz A0K() {
        return new C0710Nz(this);
    }
}
