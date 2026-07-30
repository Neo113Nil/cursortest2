package com.instagram.common.viewpoint.core;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.cX, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1110cX extends LinearLayout {
    public LinearLayout A00;
    public String A01;
    public boolean A02;
    public final int A03;
    public final C1159dL A04;
    public final C0973aK A05;
    public final C0979aQ A06;
    public static String[] A07 = {"mO6OCzz183u1Bigulq5KeRnnu3UhUErY", "M8wuVwCqg47swjluxOTBwYkXCALJOS1f", "isO3a6yeUrEqJHaKmCFaV", "J8y0fQZRtVpgz1Itec1cmA3ue79eN13N", "z6IigVxY2j2waSprQRCf4749VcxJv5uz", "GG3OTiE6t7MwpY", "UBA0QA1YjTXejDlGkh9vREu7YbW4o1hK", "iNB15eFG13fee2"};
    public static final int A0A = (int) (AbstractC0862Wl.A02 * 16.0f);
    public static final int A0B = (int) (AbstractC0862Wl.A02 * 32.0f);
    public static final int A0C = (int) (AbstractC0862Wl.A02 * 16.0f);
    public static final int A09 = (int) (AbstractC0862Wl.A02 * 4.0f);
    public static final int A08 = (int) (AbstractC0862Wl.A02 * 72.0f);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1110cX(C1108cV c1108cV) {
        super(r0);
        C1159dL c1159dL;
        C1159dL c1159dL2;
        C0622My c0622My;
        int i;
        boolean z;
        String str;
        c1159dL = c1108cV.A08;
        this.A02 = false;
        this.A01 = "";
        c1159dL2 = c1108cV.A08;
        this.A04 = c1159dL2;
        this.A05 = new C0973aK(this.A04);
        C1159dL c1159dL3 = this.A04;
        c0622My = c1108cV.A01;
        this.A06 = new C0979aQ(c1159dL3, c0622My, true, false, true);
        i = c1108cV.A00;
        this.A03 = i;
        z = c1108cV.A05;
        this.A02 = z;
        str = c1108cV.A04;
        this.A01 = str;
        A03(c1108cV);
    }

    public /* synthetic */ C1110cX(C1108cV c1108cV, C0435Fr c0435Fr) {
        this(c1108cV);
    }

    private void A00() {
        A01(this.A05, Opcodes.FCMPG);
        A01(this.A06, Opcodes.TABLESWITCH);
        if (this.A00 != null) {
            A01(this.A00, 190);
        }
    }

    private void A01(View view, int i) {
        view.setTranslationY(i);
        view.setScaleY(0.75f);
        view.setScaleX(0.75f);
        view.animate().translationYBy(-i).scaleX(1.0f).scaleY(1.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator(2.0f));
    }

    private void A02(C1108cV c1108cV) {
        String str;
        String str2;
        String str3;
        str = c1108cV.A03;
        if (!TextUtils.isEmpty(str)) {
            this.A00 = new LinearLayout(getContext());
            this.A00.setGravity(17);
            int i = A0C / 2;
            if (this.A02) {
                i = 0;
            }
            LinearLayout linearLayout = this.A00;
            int i2 = A0C;
            int i3 = A0C;
            int marginTop = A0C;
            linearLayout.setPadding(i2, i, i3, marginTop / 2);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, i, 0, 0);
            TextView textView = new TextView(getContext());
            textView.setTextColor(-1);
            XP.A0W(textView, false, 16);
            str2 = c1108cV.A03;
            textView.setText(str2);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            ImageView imageView = new ImageView(getContext());
            KZ A04 = new KZ(imageView, this.A04).A04();
            str3 = c1108cV.A02;
            A04.A07(str3);
            int i4 = A0A;
            int marginTop2 = A0A;
            LinearLayout.LayoutParams informativeContainerParams = new LinearLayout.LayoutParams(i4, marginTop2);
            int marginTop3 = A0C;
            informativeContainerParams.setMargins(0, 0, marginTop3 / 2, 0);
            if (this.A02) {
                C0967aE c0967aE = new C0967aE(getContext(), 0, -1, XX.PLAYABLE_ICON);
                c0967aE.setLayoutParams(new LinearLayout.LayoutParams(A0B, A0B));
                this.A00.addView(c0967aE);
            } else {
                this.A00.addView(imageView, informativeContainerParams);
                this.A00.addView(textView, layoutParams2);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(100.0f);
                gradientDrawable.setColor(469762047);
                XP.A0Q(this.A00, gradientDrawable);
            }
            View view = this.A00;
            String[] strArr = A07;
            String str4 = strArr[5];
            String str5 = strArr[7];
            int length = str4.length();
            int marginTop4 = str5.length();
            if (length != marginTop4) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[0] = "6JdK2pyeEPUWkfGuYxPy07w26kgdYt9J";
            strArr2[1] = "5VEwQONd4c8VI19uC0Ib5tVL9YvIxUH6";
            addView(view, layoutParams);
        }
    }

    private void A03(C1108cV c1108cV) {
        C0620Mw c0620Mw;
        N9 n9;
        C0620Mw c0620Mw2;
        N9 n92;
        XP.A0K(this.A05, 0);
        this.A05.setRadius(50);
        if (!this.A02) {
            c0620Mw = c1108cV.A06;
            if (c0620Mw.A00() == EnumC0618Mu.A05) {
                this.A05.setFullCircleCorners(true);
            } else {
                C0973aK c0973aK = this.A05;
                int i = A09;
                String[] strArr = A07;
                if (strArr[5].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                A07[2] = "avcxrBXnTsgV2I5Ie1k2l";
                c0973aK.setRadius(i);
            }
        } else {
            this.A05.setRadius(A09);
        }
        KZ A04 = new KZ(this.A05, this.A04).A04();
        n9 = c1108cV.A07;
        A04.A07(n9.A01());
        C0979aQ c0979aQ = this.A06;
        c0620Mw2 = c1108cV.A06;
        String A0F = c0620Mw2.A0F();
        n92 = c1108cV.A07;
        c0979aQ.A04(A0F, n92.A03(), null, false, true);
        if (!this.A02) {
            this.A06.getDescriptionTextView().setAlpha(0.8f);
        } else {
            this.A06.getDescriptionTextView().setText(this.A01);
        }
        this.A06.setAlignment(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A0C, 0, A0C / 2);
        View view = this.A05;
        ViewGroup.LayoutParams titleAndDescriptionParams = new LinearLayout.LayoutParams(A08, A08);
        addView(view, titleAndDescriptionParams);
        addView(this.A06, layoutParams);
        A02(c1108cV);
        XP.A0K(this, -14473425);
        setGravity(17);
        setOrientation(1);
    }

    public final void A04(InterfaceC1109cW interfaceC1109cW) {
        A00();
        postDelayed(new C0435Fr(this, interfaceC1109cW), this.A03);
    }
}
