package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public abstract class G2 extends FrameLayout implements InterfaceC0885Xo {
    public boolean A00;
    public boolean A01;
    public final AbstractC1428hy A02;
    public final SF A03;
    public final C1153dL A04;
    public final US A05;
    public final C0796Ua A06;
    public final XH A07;
    public final AbstractC0883Xm A08;
    public final InterfaceC0884Xn A09;
    public final YY A0A;
    public final C1226eX A0B;
    public final XC A0C;
    public final AbstractC1225eW A0D;
    public static final int A0F = (int) (AbstractC0856Wl.A02 * 48.0f);
    public static final int A0G = (int) (AbstractC0856Wl.A02 * 64.0f);
    public static final RelativeLayout.LayoutParams A0E = new RelativeLayout.LayoutParams(-1, -1);

    public abstract AbstractC0883Xm A0b();

    public abstract void A0e();

    public abstract void A0f();

    public abstract void A0h(R0 r0);

    public abstract boolean A0i();

    public abstract boolean A0j();

    public G2(C1153dL c1153dL, YY yy, US us, AbstractC1428hy abstractC1428hy, SF sf, InterfaceC0884Xn interfaceC0884Xn) {
        super(c1153dL);
        this.A01 = false;
        this.A0D = new G7(this);
        this.A07 = new XH();
        this.A00 = false;
        this.A04 = c1153dL;
        this.A0A = yy;
        this.A05 = us;
        this.A02 = abstractC1428hy;
        this.A03 = sf;
        this.A09 = interfaceC0884Xn;
        this.A06 = new C0796Ua(this.A02.A25(), this.A05);
        this.A0B = new C1226eX(this, 1, new WeakReference(this.A0D), this.A04);
        this.A0B.A0W(this.A02.A0i());
        this.A0B.A0X(this.A02.A0j());
        this.A08 = A0Z();
        this.A0C = new XC(this);
        this.A0C.A05(XB.A02);
        if (!A0j() && Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
    }

    private AbstractC0883Xm A0Z() {
        AbstractC0883Xm A0b = A0b();
        A0b.setFullscreen(true);
        int A04 = this.A02.A20().A0H().A04();
        A0b.setPageDetails(this.A02.A23(), this.A02.A25(), A04, this.A02.A24());
        A0b.A0A(this.A02.A1z().A01(), KE.A05(this.A02));
        if (this.A02.A20().A0H().A02() == 0) {
            this.A01 = true;
            A0b.setToolbarActionMode(8);
        } else if (A04 < 0 && this.A02.A20().A0S()) {
            A0b.setToolbarActionMode(4);
        }
        if (this.A02.A20().A0H().A02() >= 0) {
            A0b.setProgressSpinnerInvisible(true);
        }
        A0b.setToolbarListener(new G3(this));
        return A0b;
    }

    private void A0a() {
        if (this.A02.A20().A0W()) {
            C1104cX A0F2 = new C1102cV(this.A04, this.A02.A20().A0I(), this.A02.A23()).A0A(this.A02.A1z().A01()).A0F();
            AbstractC0798Uc.A04(A0F2, this.A06, UZ.A0U);
            addView(A0F2, A0E);
            A0F2.A04(new G5(this));
            return;
        }
        A0f();
    }

    public final void A0c() {
        if (!this.A00) {
            this.A0B.A0U();
            this.A00 = true;
        }
    }

    public final void A0d() {
        if (this.A08.getToolbarActionMode() == 8) {
            this.A08.setToolbarActionMode(2);
        }
        this.A02.A2B(false);
        this.A02.A20().A0M(-1);
    }

    public final void A0g(int i, AbstractRunnableC0840Vt abstractRunnableC0840Vt, C0356Cw c0356Cw) {
        new C0850Wd(i, new G6(this, i, c0356Cw, abstractRunnableC0840Vt)).A07();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0885Xo
    public final void AAl(Intent intent, Bundle bundle, R0 r0) {
        this.A09.A3x(this, A0E);
        A0h(r0);
        A0a();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0885Xo
    public final void AIB(Bundle bundle) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0885Xo
    public String getCurrentClientToken() {
        return this.A02.A25();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0885Xo
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!A0j() && Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
    }

    public void onDestroy() {
        this.A0C.A03();
        if (!TextUtils.isEmpty(this.A02.A25())) {
            this.A05.AAt(this.A02.A25(), new C0938Zp().A03(this.A0B).A02(this.A07).A05());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A07.A06(this.A04, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC0884Xn interfaceC0884Xn) {
    }

    public void setUpFullscreenMode(boolean z) {
        XB xb;
        if (z) {
            xb = XB.A03;
        } else {
            xb = XB.A02;
        }
        this.A0C.A05(xb);
    }
}
