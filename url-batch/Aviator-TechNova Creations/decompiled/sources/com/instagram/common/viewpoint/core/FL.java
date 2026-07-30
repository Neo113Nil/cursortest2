package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: assets/audience_network.dex */
public final class FL extends FrameLayout implements InterfaceC0891Xo {
    public static byte[] A0B;
    public static final RelativeLayout.LayoutParams A0C;
    public R0 A00;
    public Intent A01;
    public Bundle A02;
    public InterfaceC0891Xo A03;
    public final AbstractC1434hy A04;
    public final AbstractC1434hy A05;
    public final R0 A06;
    public final C1159dL A07;
    public final US A08;
    public final XC A09;
    public final InterfaceC0890Xn A0A;

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A0B = new byte[]{117, 105, 100, 102, 96, 104, 96, 107, 113};
    }

    static {
        A0A();
        A0C = new RelativeLayout.LayoutParams(-1, -1);
    }

    public FL(C1159dL c1159dL, US us, AbstractC1434hy abstractC1434hy, AbstractC1434hy abstractC1434hy2, InterfaceC0890Xn interfaceC0890Xn, R0 r0) {
        super(c1159dL);
        this.A07 = c1159dL;
        this.A08 = us;
        this.A05 = abstractC1434hy;
        this.A04 = abstractC1434hy2;
        this.A0A = interfaceC0890Xn;
        this.A06 = r0;
        this.A09 = new XC(this);
        this.A09.A05(XB.A02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C0575Lc A05(C1138cz c1138cz, YY yy) {
        return new C0575Lc(this.A07, this.A08, this.A0A, this.A04, this.A04.A1A(), yy, true, c1138cz);
    }

    private C01393r A06() {
        if (this.A04.A20().A0H().A07() != null) {
            this.A05.A1M(this.A04.A20().A0H().A07().A0N());
            this.A05.A1N(this.A04.A20().A0H().A07().A0P());
        }
        LX lx = new LX();
        C1138cz A07 = A07(lx, this.A04);
        C01393r c01393r = new C01393r(this.A07, lx, this.A08, this.A05, new SF(this.A07), this.A0A);
        c01393r.setVideoLeadingPlayableAdListener(new FM(this, A07, lx));
        return c01393r;
    }

    private C1138cz A07(YY yy, AbstractC1434hy abstractC1434hy) {
        NB A07 = abstractC1434hy.A20().A0H().A07();
        if (A07 == null || !A07.A0M()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(A08(0, 9, 37), yy.A8d());
        return new C1138cz(this.A07, abstractC1434hy, A07, this.A08, null, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        if (this.A03 != null) {
            this.A03.onDestroy();
            if (this.A03 instanceof View) {
                ((View) this.A03).setVisibility(8);
                removeView((View) this.A03);
            }
        }
    }

    private final void A0B(Intent intent, Bundle bundle, R0 r0) {
        this.A03 = A06();
        this.A03.AAl(intent, bundle, r0);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0891Xo
    public final void AAl(Intent intent, Bundle bundle, R0 r0) {
        this.A01 = intent;
        this.A02 = bundle;
        this.A00 = r0;
        this.A0A.A3x(this, A0C);
        A0B(intent, bundle, r0);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0891Xo
    public final void AEV(boolean z) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0891Xo
    public final void AF0(boolean z) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0891Xo
    public final void AIB(Bundle bundle) {
    }

    public InterfaceC0891Xo getContentView() {
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0891Xo
    public String getCurrentClientToken() {
        return this.A05.A25();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0891Xo
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0891Xo
    public final void onDestroy() {
    }

    public void setListener(InterfaceC0890Xn interfaceC0890Xn) {
    }
}
