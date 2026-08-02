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
public final class AnonymousClass50 extends AbstractC0480Hr {
    public static String[] A09 = {"48gXxVXafINQx", "X9eHMFtmNxkudREV2ga0mL63IUwpVFyn", "fDHVKSg", "BJ3S", "6p1nQLD", "GwvdfXoW7Tkcgx6xI32", "XjSW5yJHqMwpzXQP1hTrWYHuzeodWOV3", "mLwcnNPCnn6Mi"};
    public static final RelativeLayout.LayoutParams A0A = new RelativeLayout.LayoutParams(-1, -1);
    public C0850Wd A00;
    public AbstractC0987ae A01;
    public C0356Cw A02;
    public final int A03;
    public final ImageView A04;
    public final C0796Ua A05;
    public final AbstractC0883Xm A06;
    public final InterfaceC1100cT A07;
    public final AtomicBoolean A08;

    public AnonymousClass50(C1153dL c1153dL, YY yy, int i, US us, AbstractC1428hy abstractC1428hy, InterfaceC0884Xn interfaceC0884Xn, AbstractC0883Xm abstractC0883Xm, C0796Ua c0796Ua, boolean z, boolean z2, InterfaceC1100cT interfaceC1100cT, int i2, int i3) {
        super(c1153dL, yy, us, abstractC1428hy, i, z, z2, interfaceC0884Xn, i3);
        this.A08 = new AtomicBoolean(false);
        this.A03 = i2;
        this.A07 = interfaceC1100cT;
        this.A04 = new ImageView(getContext());
        this.A06 = abstractC0883Xm;
        this.A05 = c0796Ua;
        if (abstractC1428hy.A1U()) {
            this.A02 = new C0356Cw(c1153dL, this.A03);
        }
        this.A04.setScaleType(ImageView.ScaleType.CENTER);
        this.A04.setAdjustViewBounds(true);
        new KZ(this.A04, c1153dL).A05(abstractC1428hy.A20().A0H().A00(), abstractC1428hy.A20().A0H().A01()).A06(new C0473Hj(this)).A07(abstractC1428hy.A20().A0H().A08());
        A08(c1153dL.getResources().getConfiguration().orientation);
    }

    private AbstractC0987ae A02(int i) {
        if (this.A04.getParent() != null) {
            XP.A0H(this.A04);
        }
        boolean z = i != 2;
        C0990ah c0990ah = new C0990ah(super.A07, super.A08, this.A0B, super.A06, this.A04, this.A0D, this.A0A);
        C0990ah interstitialLayoutParamsBuilder = c0990ah.A0K(this.A06.getToolbarHeight());
        interstitialLayoutParamsBuilder.A0R(this.A06).A0J(i).A0V(z).A0U(super.A00).A0N(this.A05);
        if (this.A02 != null) {
            c0990ah.A0T(this.A02);
        }
        c0990ah.A0M(MI.A00(super.A07, super.A08, "", WQ.A00(super.A06.A20().A0J().A05()), new HashMap(), super.A06.A21()));
        c0990ah.A0S(this.A07);
        return AbstractC0988af.A00(c0990ah.A0W(), null, true);
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
        } else if (this.A01 instanceof C0507Is) {
            AbstractC0987ae abstractC0987ae = this.A01;
            String[] strArr = A09;
            if (strArr[1].charAt(0) != strArr[6].charAt(0)) {
                throw new RuntimeException();
            }
            A09[5] = "Sp2NSSouatJBlog5Q54";
            ((C0507Is) abstractC0987ae).setChildChainedAd(true);
        }
        addView(this.A01, 0, A0A);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0480Hr
    public final ME A1A(String str) {
        return this.A01.A1A(str);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0480Hr
    public final void A1B() {
        if (U7.A1u(super.A07)) {
            super.A07.A0B().AJj(this.A04);
        }
        if (this.A01 != null) {
            this.A01.A1B();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0480Hr
    public final void A1D() {
        if (this.A01 instanceof C0538Jx) {
            AbstractC0987ae abstractC0987ae = this.A01;
            String[] strArr = A09;
            if (strArr[7].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            A09[3] = "fHRV";
            ((C0538Jx) abstractC0987ae).A1O();
            return;
        }
        if (this.A01 instanceof C0507Is) {
            ((C0507Is) this.A01).A1R(false);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0480Hr
    public final void A1E() {
        int A02 = super.A06.A20().A0H().A02();
        int secondsForNextCta = this.A03;
        if (secondsForNextCta > 0) {
            this.A00 = new C0850Wd(this.A03, 100.0f, 100L, new Handler(Looper.getMainLooper()), new HV(this));
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
                    new C0850Wd(A02, new HS(this)).A07();
                    return;
                }
            }
            this.A06.setToolbarActionMode(8);
            return;
        }
        this.A07.AFE(false);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0480Hr
    public final void A1F(boolean z) {
        this.A01.setChainedWatchAndBrowseSkippableStatus(z);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0480Hr
    public final void A1G(boolean z) {
        if (this.A00 != null && this.A00.A05()) {
            this.A00.A06();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0480Hr
    public final void A1H(boolean z) {
        if (this.A00 != null && !this.A00.A04()) {
            this.A00.A07();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0480Hr
    public final boolean A1I() {
        if (this.A01.A1K()) {
            if (!(this.A01 instanceof C0538Jx) || ((C0538Jx) this.A01).A1P()) {
                return (this.A01 instanceof C0507Is) && !((C0507Is) this.A01).A1T();
            }
            return true;
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0480Hr
    public final boolean A1J() {
        if (this.A01 instanceof C0538Jx) {
            return ((C0538Jx) this.A01).A1P();
        }
        boolean z = this.A01 instanceof C0507Is;
        String[] strArr = A09;
        if (strArr[1].charAt(0) != strArr[6].charAt(0)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[2] = "VUX6Wbk";
        strArr2[4] = "Kq1l7t9";
        if (z) {
            return ((C0507Is) this.A01).A1T();
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0480Hr
    public final boolean A1K() {
        if (this.A01 instanceof C0538Jx) {
            return ((C0538Jx) this.A01).A1Q();
        }
        if (this.A01 instanceof C0507Is) {
            return ((C0507Is) this.A01).A1U();
        }
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0480Hr
    public C1098cR getFullScreenAdStyle() {
        C0616My colors = this.A01.getColors();
        return new C1098cR(this.A01.A1M(), C1098cR.A07, colors, KE.A05(super.A06), colors.A08(this.A01.A1M() || (this.A01 instanceof AbstractC0537Jw)), null);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0480Hr, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A01 instanceof C0538Jx) {
            this.A01.onConfigurationChanged(configuration);
        } else if (!super.A06.A20().A0T()) {
            A08(configuration.orientation);
        }
    }
}
