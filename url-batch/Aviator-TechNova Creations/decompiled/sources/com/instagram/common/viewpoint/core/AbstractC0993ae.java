package com.instagram.common.viewpoint.core;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.ae, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0993ae extends RelativeLayout {
    public C0622My A00;
    public boolean A01;
    public final C1159dL A02;
    public final US A03;
    public final KE A04;
    public final C0979aQ A05;
    public final C0997ai A06;
    public static final int A07 = (int) (AbstractC0862Wl.A02 * 16.0f);
    public static final int A08 = (int) (AbstractC0862Wl.A02 * 28.0f);
    public static final int A0B = (int) (AbstractC0862Wl.A02 * 2.0f);
    public static final int A0E = (int) (AbstractC0862Wl.A02 * 4.0f);
    public static final int A0I = (int) (AbstractC0862Wl.A02 * 8.0f);
    public static final int A09 = (int) (AbstractC0862Wl.A02 * 12.0f);
    public static final int A0A = (int) (AbstractC0862Wl.A02 * 16.0f);
    public static final int A0C = (int) (AbstractC0862Wl.A02 * 20.0f);
    public static final int A0D = (int) (AbstractC0862Wl.A02 * 24.0f);
    public static final int A0F = (int) (AbstractC0862Wl.A02 * 44.0f);
    public static final int A0G = (int) (AbstractC0862Wl.A02 * 48.0f);
    public static final int A0H = (int) (AbstractC0862Wl.A02 * 64.0f);
    public static final int A0J = (int) (AbstractC0862Wl.A02 * 32.0f);

    public abstract boolean A1M();

    public AbstractC0993ae(C0997ai c0997ai, boolean z) {
        super(c0997ai.A06());
        C0622My A00;
        this.A06 = c0997ai;
        this.A02 = c0997ai.A06();
        this.A03 = c0997ai.A07();
        if (c0997ai.A00() == 1) {
            A00 = c0997ai.A05().A1z().A01();
        } else {
            A00 = c0997ai.A05().A1z().A00();
        }
        this.A00 = A00;
        this.A01 = z;
        this.A04 = new KE(c0997ai.A06(), c0997ai.A05(), this.A00, c0997ai.A07(), c0997ai.A0D(), c0997ai.A0G(), c0997ai.A0A(), c0997ai.A09());
        this.A04.setRoundedCornersEnabled(A01());
        this.A04.setViewShowsOverMedia(A0C());
        XP.A0E(1001, this.A04);
        this.A05 = new C0979aQ(this.A02, this.A00, this.A01, A02(), A0D());
        XP.A0I(this.A05);
    }

    public final ImageView A00(C1159dL c1159dL, AbstractC1434hy abstractC1434hy, C0802Ua c0802Ua, Z5 z5, InterfaceC0890Xn interfaceC0890Xn, Handler handler) {
        ImageView A01 = Z9.A01(c1159dL, c0802Ua, abstractC1434hy, z5, interfaceC0890Xn, handler);
        XP.A0I(A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(A0A, 0, 0, A0A);
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        A01.setLayoutParams(layoutParams);
        return A01;
    }

    public boolean A01() {
        return true;
    }

    public boolean A02() {
        return true;
    }

    public final boolean A03() {
        return this.A06.A05().A1m() || this.A06.A05().A1o();
    }

    public boolean A0C() {
        return true;
    }

    public boolean A0D() {
        return true;
    }

    public ME A1A(String str) {
        return getCtaButton().A0E(str);
    }

    public void A1B() {
    }

    public void A1C() {
    }

    public void A1D() {
    }

    public void A1E() {
    }

    public void A1F() {
    }

    public void A1G(C0613Mp c0613Mp, String str, double d, Bundle bundle) {
        this.A05.A04(c0613Mp.A0I().A0E(), c0613Mp.A0I().A04(), null, false, !A1M() && d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && d < 1.0d);
        this.A04.setCta(c0613Mp.A0J(), str, new HashMap());
    }

    public void A1H(C01253d c01253d) {
    }

    public void A1I(DO r1) {
    }

    public void A1J(C3Q c3q, int i) {
    }

    public boolean A1K() {
        return false;
    }

    public boolean A1L() {
        return true;
    }

    public boolean A1N(boolean z) {
        return false;
    }

    public C1159dL getAdContextWrapper() {
        return this.A02;
    }

    public US getAdEventManager() {
        return this.A03;
    }

    public int getCloseButtonStyle() {
        return 0;
    }

    public C0622My getColors() {
        return this.A00;
    }

    public KE getCtaButton() {
        return this.A04;
    }

    public C0979aQ getTitleDescContainer() {
        return this.A05;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        C0622My A00;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 1) {
            A00 = this.A06.A05().A1z().A01();
        } else {
            A00 = this.A06.A05().A1z().A00();
        }
        this.A00 = A00;
        this.A04.setViewShowsOverMedia(A0C());
        this.A04.setUpButtonColors(this.A00);
        this.A05.A03(this.A00, this.A01);
    }

    public void setAccidentalClickCappingListener(MF mf) {
        getCtaButton().getCtaActionHelper().A07(mf);
    }

    public void setChainedWatchAndBrowseSkippableStatus(boolean z) {
    }
}
