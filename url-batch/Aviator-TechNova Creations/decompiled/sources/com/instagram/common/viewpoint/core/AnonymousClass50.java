package com.instagram.common.viewpoint.core;

import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.50, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass50 extends AbstractC0486Hr {
    public static String[] A09 = {"48gXxVXafINQx", "X9eHMFtmNxkudREV2ga0mL63IUwpVFyn", "fDHVKSg", "BJ3S", "6p1nQLD", "GwvdfXoW7Tkcgx6xI32", "XjSW5yJHqMwpzXQP1hTrWYHuzeodWOV3", "mLwcnNPCnn6Mi"};
    public static final RelativeLayout.LayoutParams A0A = new RelativeLayout.LayoutParams(-1, -1);
    public C0856Wd A00;
    public AbstractC0993ae A01;
    public C0362Cw A02;
    public final int A03;
    public final ImageView A04;
    public final C0802Ua A05;
    public final AbstractC0889Xm A06;
    public final InterfaceC1106cT A07;
    public final AtomicBoolean A08;

    public AnonymousClass50(C1159dL c1159dL, YY yy, int i, US us, AbstractC1434hy abstractC1434hy, InterfaceC0890Xn interfaceC0890Xn, AbstractC0889Xm abstractC0889Xm, C0802Ua c0802Ua, boolean z, boolean z2, InterfaceC1106cT interfaceC1106cT, int i2, int i3) {
        super(c1159dL, yy, us, abstractC1434hy, i, z, z2, interfaceC0890Xn, i3);
        this.A08 = new AtomicBoolean(false);
        this.A03 = i2;
        this.A07 = interfaceC1106cT;
        this.A04 = new ImageView(getContext());
        this.A06 = abstractC0889Xm;
        this.A05 = c0802Ua;
        if (abstractC1434hy.A1U()) {
            this.A02 = new C0362Cw(c1159dL, this.A03);
        }
        this.A04.setScaleType(ImageView.ScaleType.CENTER);
        this.A04.setAdjustViewBounds(true);
        new KZ(this.A04, c1159dL).A05(abstractC1434hy.A20().A0H().A00(), abstractC1434hy.A20().A0H().A01()).A06(new C0479Hj(this)).A07(abstractC1434hy.A20().A0H().A08());
        A08(c1159dL.getResources().getConfiguration().orientation);
    }

    private AbstractC0993ae A02(int i) {
        if (this.A04.getParent() != null) {
            XP.A0H(this.A04);
        }
        boolean z = i != 2;
        C0996ah c0996ah = new C0996ah(super.A07, super.A08, this.A0B, super.A06, this.A04, this.A0D, this.A0A);
        C0996ah interstitialLayoutParamsBuilder = c0996ah.A0K(this.A06.getToolbarHeight());
        interstitialLayoutParamsBuilder.A0R(this.A06).A0J(i).A0V(z).A0U(super.A00).A0N(this.A05);
        if (this.A02 != null) {
            c0996ah.A0T(this.A02);
        }
        c0996ah.A0M(MI.A00(super.A07, super.A08, "", WQ.A00(super.A06.A20().A0J().A05()), new HashMap(), super.A06.A21()));
        c0996ah.A0S(this.A07);
        return AbstractC0994af.A00(c0996ah.A0W(), null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        if (this.A08.get()) {
            A1C();
        }
    }

    private void A08(int i) {
        XP.A0H(this.A01);
        this.A01 = A02(i);
        if (this.A01 instanceof JU) {
            ((JU) this.A01).setChildChainedAd(true);
        } else if (this.A01 instanceof C0513Is) {
            AbstractC0993ae abstractC0993ae = this.A01;
            String[] strArr = A09;
            if (strArr[1].charAt(0) != strArr[6].charAt(0)) {
                throw new RuntimeException();
            }
            A09[5] = "Sp2NSSouatJBlog5Q54";
            ((C0513Is) abstractC0993ae).setChildChainedAd(true);
        }
        addView(this.A01, 0, A0A);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0486Hr
    public final ME A1A(String str) {
        return this.A01.A1A(str);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0486Hr
    public final void A1B() {
        if (U7.A1u(super.A07)) {
            super.A07.A0B().AJj(this.A04);
        }
        if (this.A01 != null) {
            this.A01.A1B();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0486Hr
    public final void A1D() {
        if (this.A01 instanceof C0544Jx) {
            AbstractC0993ae abstractC0993ae = this.A01;
            String[] strArr = A09;
            if (strArr[7].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            A09[3] = "fHRV";
            ((C0544Jx) abstractC0993ae).A1O();
            return;
        }
        if (this.A01 instanceof C0513Is) {
            ((C0513Is) this.A01).A1R(false);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0486Hr
    public final void A1E() {
        int A02 = super.A06.A20().A0H().A02();
        int secondsForNextCta = this.A03;
        if (secondsForNextCta > 0) {
            this.A00 = new C0856Wd(this.A03, 100.0f, 100L, new Handler(Looper.getMainLooper()), new HV(this));
            this.A00.A07();
            if (A02 >= 0) {
                this.A06.setProgressSpinnerInvisible(true);
            }
            if (A02 != 0) {
                int secondsForNextCta2 = this.A03;
                if (A02 < secondsForNextCta2) {
                    if (A02 <= 0) {
                        return;
                    }
                    new C0856Wd(A02, new HS(this)).A07();
                    return;
                }
            }
            this.A06.setToolbarActionMode(8);
            return;
        }
        this.A07.AFE(false);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0486Hr
    public final void A1F(boolean z) {
        this.A01.setChainedWatchAndBrowseSkippableStatus(z);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0486Hr
    public final void A1G(boolean z) {
        if (this.A00 != null && this.A00.A05()) {
            this.A00.A06();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0486Hr
    public final void A1H(boolean z) {
        if (this.A00 != null && !this.A00.A04()) {
            this.A00.A07();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0486Hr
    public final boolean A1I() {
        if (this.A01.A1K()) {
            if (!(this.A01 instanceof C0544Jx) || ((C0544Jx) this.A01).A1P()) {
                return (this.A01 instanceof C0513Is) && !((C0513Is) this.A01).A1T();
            }
            return true;
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0486Hr
    public final boolean A1J() {
        if (this.A01 instanceof C0544Jx) {
            return ((C0544Jx) this.A01).A1P();
        }
        boolean z = this.A01 instanceof C0513Is;
        String[] strArr = A09;
        if (strArr[1].charAt(0) != strArr[6].charAt(0)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[2] = "VUX6Wbk";
        strArr2[4] = "Kq1l7t9";
        if (z) {
            return ((C0513Is) this.A01).A1T();
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0486Hr
    public final boolean A1K() {
        if (this.A01 instanceof C0544Jx) {
            return ((C0544Jx) this.A01).A1Q();
        }
        if (this.A01 instanceof C0513Is) {
            return ((C0513Is) this.A01).A1U();
        }
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0486Hr
    public C1104cR getFullScreenAdStyle() {
        C0622My colors = this.A01.getColors();
        return new C1104cR(this.A01.A1M(), C1104cR.A07, colors, KE.A05(super.A06), colors.A08(this.A01.A1M() || (this.A01 instanceof AbstractC0543Jw)), null);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0486Hr, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A01 instanceof C0544Jx) {
            this.A01.onConfigurationChanged(configuration);
        } else if (!super.A06.A20().A0T()) {
            A08(configuration.orientation);
        }
    }
}
