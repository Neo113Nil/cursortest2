package com.instagram.common.viewpoint.core;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.5f, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01795f extends AbstractC0543Jw {
    public static byte[] A09;
    public static String[] A0A = {"nMDGU2nxSEuwqviL2VMZS1cV20s8AaeR", "qyrjSMh", "FYVwSD308Vq2J6Pd1wLxSNaB8Ewk", "LGl0Dyzmn7PlBKL5rOaUh0PbBfsCX6f3", "ZVJSN", "nXNa5aghoVBzvvHD5xAqaEYm1u0bLWjI", "m4Dqbt0aWRjh5FvtlMaj2POC", "Ux3XUTAXbpH3d88rNaPFFKJHhvK1Uu5c"};
    public float A00;
    public C1149dA A01;
    public boolean A02;
    public final Handler A03;
    public final View A04;
    public final RelativeLayout A05;
    public final RelativeLayout A06;
    public final AbstractC0889Xm A07;
    public final InterfaceC0890Xn A08;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 106);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A09 = new byte[]{112, 116, 120, 126, 124};
    }

    static {
        A06();
    }

    public C01795f(C0997ai c0997ai) {
        super(c0997ai, true);
        this.A03 = new Handler(Looper.getMainLooper());
        this.A02 = false;
        this.A08 = c0997ai.A0D();
        this.A07 = c0997ai.A0C();
        this.A06 = new RelativeLayout(c0997ai.A06());
        this.A05 = new RelativeLayout(c0997ai.A06());
        XP.A0I(this.A05);
        XP.A0I(this.A06);
        this.A04 = c0997ai.A02();
        A04();
        this.A06.addView(this.A05, new RelativeLayout.LayoutParams(-2, -2));
        addView(this.A06, new RelativeLayout.LayoutParams(-1, -1));
        AbstractC0980aR.A00(c0997ai.A06(), this.A06, getAdInfo().A0H().A08());
        A03();
        ((AbstractC0993ae) this).A06.A06().A0F().AJw(AbstractC0853Wa.A00(this.A00), getResources().getConfiguration().orientation, false, false, MH.A0C(((AbstractC0993ae) this).A06.A04()));
    }

    private void A02() {
        XP.A0Z(this.A07, getAdDetailsView(), getCtaButton());
        this.A01 = new C1149dA(((AbstractC0993ae) this).A06.A06(), getAdDataBundle(), this.A08, getCtaButton(), this.A03, ((AbstractC0993ae) this).A06.A08());
        addView(this.A01.A0T(), new RelativeLayout.LayoutParams(-1, -1));
    }

    private void A03() {
        XP.A0H(getAdDetailsView());
        addView(getAdDetailsView(), new RelativeLayout.LayoutParams(-1, -1));
        getAdDetailsView().setVisibility(0);
        A07(getResources().getConfiguration().orientation);
        if (getAdDetailsView() instanceof KL) {
            ((KL) getAdDetailsView()).A0q(getResources().getConfiguration().orientation);
        }
    }

    private void A04() {
        if (this.A04 == null) {
            return;
        }
        this.A05.addView(this.A04, new RelativeLayout.LayoutParams(-2, -2));
        XP.A0I(this.A04);
        C0857Wg A02 = this.A09.A02(getAdDataBundle());
        ((AbstractC0993ae) this).A06.A06().A0H().A00(A02.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(this.A09);
        if (A02.A00) {
            this.A04.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.ac
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C01795f.this.A1W(view);
                }
            });
        } else {
            if (!U7.A1I(getAdContextWrapper())) {
                return;
            }
            AbstractC0947Zs.A00(this.A04, U7.A1J(getAdContextWrapper()), new ViewOnClickListenerC0992ad(this));
        }
    }

    private void A05() {
        this.A0A.set(true);
        XP.A0R(this);
        int i = 2;
        XP.A0Z(this.A05, getAdDetailsView());
        XP.A0J(this.A07);
        A02();
        if (getAdInfo().A0K().A00() >= 0) {
            this.A02 = true;
            if (this.A07 != null) {
                AbstractC0889Xm abstractC0889Xm = this.A07;
                if (getAdDataBundle().A2G()) {
                    i = 8;
                }
                abstractC0889Xm.setToolbarActionMode(i);
                this.A07.setProgressImmediate(0.0f);
            }
            new C0856Wd((int) getAdInfo().A0K().A00(), 20.0f, 20L, new Handler(Looper.getMainLooper()), new C0540Jt(this)).A07();
        }
    }

    private void A07(int i) {
        A08(i);
        A1U(i, this.A06, this.A05);
    }

    private void A08(int i) {
        if (this.A04 == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A04.getLayoutParams();
        layoutParams.removeRule(13);
        layoutParams.removeRule(10);
        layoutParams.removeRule(9);
        if (i == 1) {
            layoutParams.width = -1;
            layoutParams.height = -2;
            layoutParams.addRule(10);
        } else {
            layoutParams.width = -2;
            layoutParams.height = -1;
            if (A0A(this.A00)) {
                layoutParams.addRule(13);
                RelativeLayout.LayoutParams containerLayoutParam = (RelativeLayout.LayoutParams) this.A05.getLayoutParams();
                containerLayoutParam.addRule(14);
                this.A05.setLayoutParams(containerLayoutParam);
            } else {
                layoutParams.addRule(9);
            }
        }
        this.A04.setLayoutParams(layoutParams);
    }

    public static boolean A09(float f) {
        return f <= 0.7f;
    }

    public static boolean A0A(float f) {
        return f >= 1.2f;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0993ae
    public final boolean A0C() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0993ae
    public final boolean A0D() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0543Jw, com.instagram.common.viewpoint.core.AbstractC0993ae
    public final void A1B() {
        super.A1B();
        this.A03.removeCallbacksAndMessages(null);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0543Jw, com.instagram.common.viewpoint.core.AbstractC0993ae
    public final void A1G(C0613Mp c0613Mp, String str, double d, Bundle bundle) {
        super.A1G(c0613Mp, str, d, bundle);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0993ae
    public final boolean A1K() {
        return getAdInfo().A0V();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0993ae
    public final boolean A1M() {
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0993ae
    public final boolean A1N(boolean z) {
        if (getAdInfo().A0V() && !this.A0A.get()) {
            A05();
            return true;
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0543Jw
    public final AbstractC0950Zv A1P(C0997ai c0997ai, C0613Mp c0613Mp, String str) {
        this.A00 = new SF(c0997ai.A06()).A0M(c0613Mp.A0H().A08());
        if (A09(this.A00)) {
            return new C01905q(c0997ai.A06(), getCtaButton(), AbstractC0543Jw.A0I, false, getColors(), str, c0997ai.A07(), c0997ai.A0D(), c0997ai.A0G(), c0997ai.A0A(), c0997ai.A05(), c0997ai.A0F(), c0997ai.A08(), false);
        }
        float f = this.A00;
        if (A0A[7].charAt(11) == 'b') {
            throw new RuntimeException();
        }
        String[] strArr = A0A;
        strArr[4] = "qnLfq";
        strArr[1] = "ISSv4uo";
        if (A0A(f)) {
            return new C01895p(c0997ai.A06(), getCtaButton(), AbstractC0543Jw.A0I, false, getColors(), str, c0997ai.A07(), c0997ai.A0D(), c0997ai.A0G(), c0997ai.A0A(), c0997ai.A05(), c0997ai.A0F(), c0997ai.A08(), false);
        }
        return new C01915r(c0997ai.A06(), getCtaButton(), AbstractC0543Jw.A0I, false, getColors(), str, c0997ai.A07(), c0997ai.A0D(), c0997ai.A0G(), c0997ai.A0A(), c0997ai.A05(), c0997ai.A0F(), c0997ai.A08(), false);
    }

    public final /* synthetic */ void A1W(View view) {
        getCtaButton().A0E(A01(0, 5, Opcodes.DREM));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0993ae
    public int getCloseButtonStyle() {
        if (this.A02) {
            if (getAdDataBundle().A2G()) {
                return 8;
            }
            return 2;
        }
        if (A1K() && !this.A0A.get()) {
            return 1;
        }
        return super.getCloseButtonStyle();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0543Jw, com.instagram.common.viewpoint.core.AbstractC0993ae, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A01 != null && this.A0A.get()) {
            this.A01.A0W(configuration.orientation);
        } else {
            A07(configuration.orientation);
        }
    }
}
