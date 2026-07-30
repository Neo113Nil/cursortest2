package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.d4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1143d4 {
    public KE A00;
    public final C0610Ml A01;
    public final C0620Mw A02;
    public final N0 A03;
    public final N9 A04;
    public final C1159dL A05;
    public final C0802Ua A06;
    public static final int A09 = (int) (AbstractC0862Wl.A02 * 4.0f);
    public static final int A07 = (int) (AbstractC0862Wl.A02 * 72.0f);
    public static final int A08 = (int) (AbstractC0862Wl.A02 * 8.0f);

    public C1143d4(C1159dL c1159dL, US us, AbstractC1434hy abstractC1434hy) {
        this.A05 = c1159dL;
        this.A06 = new C0802Ua(abstractC1434hy.A25(), us);
        this.A01 = abstractC1434hy.A1z();
        this.A02 = abstractC1434hy.A20().A0I();
        this.A04 = abstractC1434hy.A23();
        this.A03 = abstractC1434hy.A20().A0K();
    }

    private View A00(KE ke) {
        C0979aQ c0979aQ = new C0979aQ(this.A05, this.A01.A01(), true, false, false);
        c0979aQ.A04(this.A02.A0F(), this.A02.A04(), null, false, true);
        c0979aQ.setAlignment(17);
        C0973aK c0973aK = new C0973aK(this.A05);
        XP.A0K(c0973aK, 0);
        c0973aK.setRadius(50);
        new KZ(c0973aK, this.A05).A04().A07(this.A04.A01());
        LinearLayout linearLayout = new LinearLayout(this.A05);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(c0973aK, new LinearLayout.LayoutParams(A07, A07));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A08, 0, A08);
        linearLayout.addView(c0979aQ, layoutParams);
        if (ke != null) {
            XP.A0H(ke);
            linearLayout.addView(ke, layoutParams);
            if (TextUtils.isEmpty(ke.getText())) {
                XP.A0F(ke);
            }
        }
        return linearLayout;
    }

    private C02066g A01() {
        C02066g c02066g = new C02066g(this.A05);
        c02066g.setLayoutManager(new C1339gI(this.A05, 0, false));
        c02066g.setAdapter(new C0393Eb(this.A05, this.A03.A02(), A09, this.A00));
        return c02066g;
    }

    private final EnumC1142d3 A02() {
        if (!this.A03.A02().isEmpty()) {
            return EnumC1142d3.A03;
        }
        return EnumC1142d3.A02;
    }

    public final Pair<EnumC1142d3, View> A03(KE ke) {
        View A01;
        this.A00 = ke;
        EnumC1142d3 A02 = A02();
        switch (C1141d2.A00[A02.ordinal()]) {
            case 1:
                A01 = A01();
                break;
            default:
                A01 = A00(this.A00);
                break;
        }
        AbstractC0804Uc.A04(A01, this.A06, UZ.A0S);
        return new Pair<>(A02, A01);
    }
}
