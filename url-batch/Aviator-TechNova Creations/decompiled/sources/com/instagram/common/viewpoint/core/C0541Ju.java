package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.view.PointerIconCompat;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ju, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0541Ju extends AbstractC0993ae implements Wf {
    public static byte[] A03;
    public static String[] A04 = {"jViytUMb8W4ggVUJxJM4ipopCTL5", "9aLNfhHGIgyW1yw0lAvb2knTk6C61HAs", "tSRmVjXXTSnTtzrce7INiQjRTYiInlbV", "4hcdJiGUQmFME9vgh87fiTmYWHBJid0b", "Sl93MFe7LYTqHCUKgRBPFfcYUFdC2Wx2", "6CReOOSeiw7R4vGYWPFAi839J8MszZAI", "rkSedGSxOJTtoP7gEY2R8PFp4jzzUrYJ", "HZKY5YyrBfN27m9O42YnVDeAUeo6GkfS"};
    public final AbstractC1434hy A00;
    public final C0858Wh A01;
    public final InterfaceC0890Xn A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A04[0].length() != 28) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[1] = "P3g3yiO3ICi92ZTGqQIjITPfAPWFUEMm";
            strArr[2] = "pyBqNmisWoZkDTGCi8bHuToayw1uFlPn";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 78);
            i4++;
        }
    }

    public static void A01() {
        A03 = new byte[]{64, 68, 72, 78, 76};
    }

    static {
        A01();
    }

    public C0541Ju(C0997ai c0997ai, boolean z) {
        super(c0997ai, true);
        FrameLayout.LayoutParams layoutParams;
        this.A02 = c0997ai.A0D();
        this.A00 = c0997ai.A05();
        RelativeLayout relativeLayout = new RelativeLayout(c0997ai.A06());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        XP.A0P(relativeLayout, getAdContextWrapper());
        LinearLayout linearLayout = new LinearLayout(c0997ai.A06());
        linearLayout.setOrientation(!z ? 1 : 0);
        linearLayout.setGravity(80);
        XP.A0I(linearLayout);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(AbstractC0993ae.A07, 0, AbstractC0993ae.A07, AbstractC0993ae.A07);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(z ? -2 : -1, -2);
        layoutParams4.setMargins(z ? AbstractC0993ae.A07 : 0, z ? 0 : AbstractC0993ae.A07, 0, 0);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(z ? 0 : -1, -2);
        layoutParams5.setMargins(0, 0, 0, 0);
        layoutParams5.weight = 1.0f;
        linearLayout.addView(getTitleDescContainer(), layoutParams5);
        this.A01 = C0858Wh.A00(c0997ai.A06(), this.A00, this);
        C0857Wg A02 = this.A01.A02(this.A00);
        c0997ai.A06().A0H().A00(A02.A01);
        if (c0997ai.A0I() && !z) {
            C1125cm c1125cm = new C1125cm(c0997ai.A06());
            c1125cm.setPageDetails(c0997ai.A05().A23());
            int A05 = this.A06.A05().A1z().A00().A05(true);
            c1125cm.A02(A05, A05);
            XP.A0E(PointerIconCompat.TYPE_CROSSHAIR, c1125cm);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams6.setMargins(0, AbstractC0993ae.A07, 0, 0);
            linearLayout.addView(c1125cm, layoutParams6);
            if (U7.A18(c0997ai.A06())) {
                c1125cm.setOnClickListener(getCtaButton());
            }
        }
        linearLayout.addView(getCtaButton(), layoutParams4);
        relativeLayout.addView(linearLayout, layoutParams3);
        getCtaButton().A0F(c0997ai.A05(), c0997ai.A0C());
        View A022 = c0997ai.A02();
        if (A022 != null && (A02.A00 || U7.A1I(getAdContextWrapper()))) {
            if (z) {
                layoutParams = new FrameLayout.LayoutParams(-2, -1);
            } else {
                layoutParams = new FrameLayout.LayoutParams(-1, -2);
            }
            layoutParams.gravity = 17;
            FrameLayout frameLayout = new FrameLayout(c0997ai.A06());
            frameLayout.addView(A022, layoutParams);
            addView(frameLayout, new RelativeLayout.LayoutParams(-1, -1));
            getCtaButton().setCreativeAsCtaLoggingHelper(this.A01);
            if (A02.A00) {
                A022.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.aa
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C0541Ju.this.A1O(view);
                    }
                });
            } else {
                AbstractC0947Zs.A00(A022, U7.A1J(getAdContextWrapper()), new ViewOnClickListenerC0990ab(this));
            }
        } else if (A022 != null) {
            addView(A022, new RelativeLayout.LayoutParams(-1, -1));
        }
        addView(relativeLayout, layoutParams2);
        if (U7.A17(c0997ai.A06())) {
            getTitleDescContainer().setCTAClickListener(getCtaButton());
            if (c0997ai.A0C() != null) {
                c0997ai.A0C().setCTAClickListener(getCtaButton());
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0993ae
    public final void A1B() {
        super.A1B();
        this.A01.A03();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0993ae
    public final void A1G(C0613Mp c0613Mp, String str, double d, Bundle bundle) {
        super.A1G(c0613Mp, str, d, bundle);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0993ae
    public final boolean A1M() {
        return true;
    }

    public final /* synthetic */ void A1O(View view) {
        getCtaButton().A0E(A00(0, 5, 103));
    }
}
