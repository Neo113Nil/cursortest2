package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Rr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0806Rr extends AbstractC02504u implements InterfaceC0655Lw {
    public C1R A00;
    public AbstractC0763Qa A01;
    public C0764Qb A02;
    public C0764Qb A03;
    public final int A04;
    public final SparseBooleanArray A05;
    public final YA A06;
    public final C9G A07;

    public C0806Rr(C9G c9g, SparseBooleanArray sparseBooleanArray, C0764Qb c0764Qb, int i, YA ya, C1R c1r) {
        super(c9g);
        this.A06 = ya;
        this.A07 = c9g;
        this.A05 = sparseBooleanArray;
        this.A02 = c0764Qb;
        this.A04 = i;
        this.A00 = c1r;
    }

    private void A0A(InterfaceC0565If interfaceC0565If, LN ln, String str, PC pc) {
        if (this.A05.get(pc.A02())) {
            return;
        }
        C0764Qb c0764Qb = this.A03;
        if (c0764Qb != null) {
            c0764Qb.A0V();
            this.A03 = null;
        }
        this.A01 = new C0808Rt(this, str, pc, interfaceC0565If, pc.A04(), ln);
        C0764Qb c0764Qb2 = new C0764Qb(this.A07, 10, new WeakReference(this.A01), this.A06);
        this.A03 = c0764Qb2;
        c0764Qb2.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A07.setOnAssetsLoadedListener(new C0807Rs(this, pc));
    }

    public final void A0l(PC pc, InterfaceC0565If interfaceC0565If, C6Q c6q, LN ln, String str, int i, int i2, int i3) {
        int leftMargin = pc.A02();
        this.A07.setTag(-1593835536, Integer.valueOf(leftMargin));
        this.A07.setupNativeCtaExtension(pc);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i, -2);
        int i4 = leftMargin == 0 ? i3 : i2;
        if (leftMargin < this.A04 - 1) {
            i3 = i2;
        }
        marginLayoutParams.setMargins(i4, 0, i3, 0);
        String A07 = pc.A03().A0D().A07();
        String A08 = pc.A03().A0D().A08();
        this.A07.setIsVideo(!TextUtils.isEmpty(A08));
        if (this.A07.A17()) {
            this.A07.setVideoPlaceholderUrl(A07);
            this.A07.setVideoUrl(c6q.A0S(A08));
        } else {
            this.A07.setImageUrl(A07);
        }
        this.A07.setLayoutParams(marginLayoutParams);
        this.A07.setCTAInfo(pc.A03().A0F(), pc.A04());
        this.A07.A18(pc.A04());
        A0A(interfaceC0565If, ln, str, pc);
    }

    public final void A0m(C0764Qb c0764Qb) {
        this.A02 = c0764Qb;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0655Lw
    public final void AF5(NR nr) {
        this.A07.setAdDetailsClickListener(nr);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0655Lw
    public final void AF7() {
        this.A07.A12();
    }
}
