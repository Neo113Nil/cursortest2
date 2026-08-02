package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.d4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1137d4 {
    public KE A00;
    public final C0604Ml A01;
    public final C0614Mw A02;
    public final N0 A03;
    public final N9 A04;
    public final C1153dL A05;
    public final C0796Ua A06;
    public static final int A09 = (int) (AbstractC0856Wl.A02 * 4.0f);
    public static final int A07 = (int) (AbstractC0856Wl.A02 * 72.0f);
    public static final int A08 = (int) (AbstractC0856Wl.A02 * 8.0f);

    public C1137d4(C1153dL c1153dL, US us, AbstractC1428hy abstractC1428hy) {
        this.A05 = c1153dL;
        this.A06 = new C0796Ua(abstractC1428hy.A25(), us);
        this.A01 = abstractC1428hy.A1z();
        this.A02 = abstractC1428hy.A20().A0I();
        this.A04 = abstractC1428hy.A23();
        this.A03 = abstractC1428hy.A20().A0K();
    }

    private View A00(KE ke) {
        C0973aQ c0973aQ = new C0973aQ(this.A05, this.A01.A01(), true, false, false);
        c0973aQ.A04(this.A02.A0F(), this.A02.A04(), null, false, true);
        c0973aQ.setAlignment(17);
        C0967aK c0967aK = new C0967aK(this.A05);
        XP.A0K(c0967aK, 0);
        c0967aK.setRadius(50);
        new KZ(c0967aK, this.A05).A04().A07(this.A04.A01());
        LinearLayout linearLayout = new LinearLayout(this.A05);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(c0967aK, new LinearLayout.LayoutParams(A07, A07));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A08, 0, A08);
        linearLayout.addView(c0973aQ, layoutParams);
        if (ke != null) {
            XP.A0H(ke);
            linearLayout.addView(ke, layoutParams);
            if (TextUtils.isEmpty(ke.getText())) {
                XP.A0F(ke);
            }
        }
        return linearLayout;
    }

    private C02006g A01() {
        C02006g c02006g = new C02006g(this.A05);
        c02006g.setLayoutManager(new C1333gI(this.A05, 0, false));
        c02006g.setAdapter(new C0387Eb(this.A05, this.A03.A02(), A09, this.A00));
        return c02006g;
    }

    private final EnumC1136d3 A02() {
        if (!this.A03.A02().isEmpty()) {
            return EnumC1136d3.A03;
        }
        return EnumC1136d3.A02;
    }

    public final Pair<EnumC1136d3, View> A03(KE ke) {
        View A01;
        this.A00 = ke;
        EnumC1136d3 A02 = A02();
        switch (C1135d2.A00[A02.ordinal()]) {
            case 1:
                A01 = A01();
                break;
            default:
                A01 = A00(this.A00);
                break;
        }
        AbstractC0798Uc.A04(A01, this.A06, UZ.A0S);
        return new Pair<>(A02, A01);
    }
}
