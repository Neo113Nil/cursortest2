package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.eM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3073eM {
    public ViewOnClickListenerC2416Kr A00;
    public final NN A01;
    public final NY A02;
    public final C2479Nd A03;
    public final C2488Nm A04;
    public final C3218gi A05;
    public final VI A06;
    public static final int A09 = (int) (XX.A02 * 4.0f);
    public static final int A07 = (int) (XX.A02 * 72.0f);
    public static final int A08 = (int) (XX.A02 * 8.0f);

    public C3073eM(C3218gi c3218gi, VA va, AbstractC3383jd abstractC3383jd) {
        this.A05 = c3218gi;
        this.A06 = new VI(abstractC3383jd.A2E(), va);
        this.A01 = abstractC3383jd.A28();
        this.A02 = abstractC3383jd.A29().A0I();
        this.A04 = abstractC3383jd.A2C();
        this.A03 = abstractC3383jd.A29().A0K();
    }

    private View A00(ViewOnClickListenerC2416Kr viewOnClickListenerC2416Kr) {
        C2918bq c2918bq = new C2918bq(this.A05, this.A01.A01(), true, false, false);
        c2918bq.A04(this.A02.A0G(), this.A02.A04(), null, false, true);
        c2918bq.setAlignment(17);
        C2912bk c2912bk = new C2912bk(this.A05);
        YB.A0N(c2912bk, 0);
        c2912bk.setRadius(50);
        new LM(c2912bk, this.A05).A04().A07(this.A04.A01());
        LinearLayout linearLayout = new LinearLayout(this.A05);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(c2912bk, new LinearLayout.LayoutParams(A07, A07));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A08, 0, A08);
        linearLayout.addView(c2918bq, layoutParams);
        if (viewOnClickListenerC2416Kr != null) {
            YB.A0J(viewOnClickListenerC2416Kr);
            linearLayout.addView(viewOnClickListenerC2416Kr, layoutParams);
            viewOnClickListenerC2416Kr.setPadding(XV.A0Z, 0, XV.A0Z, 0);
            if (TextUtils.isEmpty(viewOnClickListenerC2416Kr.getText())) {
                YB.A0H(viewOnClickListenerC2416Kr);
            }
        }
        return linearLayout;
    }

    private C7M A01() {
        C7M c7m = new C7M(this.A05);
        c7m.setLayoutManager(new C3288hr(this.A05, 0, false));
        c7m.setAdapter(new FH(this.A05, this.A03.A02(), A09, this.A00));
        return c7m;
    }

    private final EnumC3072eL A02() {
        if (!this.A03.A02().isEmpty()) {
            return EnumC3072eL.A03;
        }
        return EnumC3072eL.A02;
    }

    public final Pair<EnumC3072eL, View> A03(ViewOnClickListenerC2416Kr viewOnClickListenerC2416Kr) {
        View A01;
        this.A00 = viewOnClickListenerC2416Kr;
        EnumC3072eL A02 = A02();
        switch (A02) {
            case A03:
                A01 = A01();
                break;
            default:
                A01 = A00(this.A00);
                break;
        }
        VK.A04(A01, this.A06, VH.A0S);
        return new Pair<>(A02, A01);
    }
}
