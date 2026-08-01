package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.view.PointerIconCompat;
import com.google.android.material.card.MaterialCardViewHelper;
import com.google.common.base.Ascii;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class SM extends AbstractC0733Ow {
    public static byte[] A0W;
    public static String[] A0X = {"zF", "YuhgBsbCJ4GENG72FYuTSQ3UxVCmrs0t", "RSfzcHToFNO8jc1tX2m0S0AZ0vbf9kKl", "p", "lGjhRdALEILVIUsiuWCm6MXJK2R8L6Co", "wXQvDYR5huLQKlTsBS5mG0rN7ygrQvR2", "AYgBJnzxyMi9rrwHO3oB8yOhTSWVLxNu", "3k2Jytm7iEKA6X2jmmGhgFSNDYaf4AHR"};
    public static final int A0Y;
    public static final int A0Z;
    public static final int A0a;
    public static final int A0b;
    public static final int A0c;
    public static final int A0d;
    public static final int A0e;
    public static final int A0f;
    public static final int A0g;
    public static final int A0h;
    public C1M A00;
    public C0622Kn A01;
    public EnumC0746Pj A02;
    public JX A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final YA A0C;
    public final NR A0D;
    public final T3 A0E;
    public final P0 A0F;
    public final PS A0G;
    public final C0737Pa A0H;
    public final RX A0I;
    public final AnonymousClass76 A0J;
    public final AbstractC0712Ob A0K;
    public final AbstractC0698Nn A0L;
    public final MU A0M;
    public final MI A0N;
    public final MA A0O;
    public final M9 A0P;
    public final K2 A0Q;
    public final C0601Jr A0R;
    public final C0587Jb A0S;
    public final JT A0T;
    public final boolean A0U;
    public final boolean A0V;

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0W, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 44);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0W = new byte[]{-55, -43, -45, -108, -52, -57, -55, -53, -56, -43, -43, -47, -108, -57, -54, -39, -108, -49, -44, -38, -53, -40, -39, -38, -49, -38, -49, -57, -46, -108, -55, -46, -49, -55, -47, -53, -54, Ascii.ESC, Ascii.SO, 32, 10, Ascii.ESC, Ascii.CR, Ascii.SO, Ascii.CR, 8, Ascii.US, Ascii.DC2, Ascii.CR, Ascii.SO, Ascii.CAN};
    }

    static {
        A0D();
        A0b = (int) (C0627Ku.A02 * 48.0f);
        int A01 = C01842d.A01(-1, 77);
        A0Z = A01;
        A0g = (int) (C0627Ku.A02 * 26.0f);
        A0h = (int) (C0627Ku.A02 * 12.0f);
        A0d = (int) (C0627Ku.A02 * 12.0f);
        A0e = (int) (C0627Ku.A02 * 44.0f);
        A0c = (int) (C0627Ku.A02 * 8.0f);
        A0f = (int) (C0627Ku.A02 * 16.0f);
        A0a = C01842d.A01(A01, 90);
        A0Y = (int) (C0627Ku.A02 * 4.0f);
    }

    public SM(YA ya, InterfaceC0565If interfaceC0565If, AbstractC1045aS abstractC1045aS, C6Q c6q, MM mm, int i, InterfaceC0652Lt interfaceC0652Lt, C0573In c0573In, int i2, int i3, int i4, boolean z, int i5, boolean z2, boolean z3, boolean z4, P0 p0) {
        super(ya, mm, interfaceC0565If, abstractC1045aS, i, z3, z4, interfaceC0652Lt);
        C1M A00;
        this.A04 = false;
        this.A05 = false;
        this.A07 = false;
        MA ma = new MA() { // from class: com.facebook.ads.redexgen.X.8x
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC03238a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(MD md) {
                SM.this.A07 = true;
            }
        };
        this.A0O = ma;
        MI mi = new MI() { // from class: com.facebook.ads.redexgen.X.8q
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC03238a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(MJ mj) {
                if (!((AbstractC0733Ow) SM.this).A08.A07()) {
                    SM.this.A03();
                }
            }
        };
        this.A0N = mi;
        MU mu = new MU() { // from class: com.facebook.ads.redexgen.X.8l
            @Override // com.facebook.ads.redexgen.X.AbstractC03238a
            public final /* bridge */ /* synthetic */ void A03(AnonymousClass72 anonymousClass72) {
            }
        };
        this.A0M = mu;
        M9 m9 = new M9() { // from class: com.facebook.ads.redexgen.X.8X
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC03238a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass71 anonymousClass71) {
                P0 p02;
                SM.this.A0G(anonymousClass71);
                float A002 = anonymousClass71.A00();
                p02 = SM.this.A0F;
                p02.ABO(A002);
            }
        };
        this.A0P = m9;
        AbstractC0712Ob abstractC0712Ob = new AbstractC0712Ob() { // from class: com.facebook.ads.redexgen.X.8E
            public static String[] A01 = {"WHlfg22LQewOceL2LP0nfjs", "MLczN6H9d0ts9YHCrKUbmxW9Pv4xX40Z", "bfgAoKxvo7gEuP52Z2EO408IJ8JPPLb2", "8W4TrLCVwT5pN341HhH6D3mP2byMMwpU", "ScQcjv0hvXE5sqpvLhFnJdo", "ew857MaMURY893GG0hi3zO6RFtTWvxkk", "kzrdBoT0QozH1fOZ2V6a3FXV0JrhAD1i", "6tn8KSSYbJPeTKsUVc3lRKjtLiYgy0EC"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC03238a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass75 anonymousClass75) {
                P0 p02;
                RX rx;
                P0 p03;
                p02 = SM.this.A0F;
                rx = SM.this.A0I;
                p02.AB2(rx.getDuration());
                if (SM.this.A0P()) {
                    SM.this.A0L();
                    return;
                }
                SM sm = SM.this;
                String[] strArr = A01;
                if (strArr[6].charAt(31) == strArr[1].charAt(31)) {
                    throw new RuntimeException();
                }
                A01[2] = "b2r5SY6tJEDKh19k0rBQmCTxaUfC6Ghy";
                p03 = sm.A0F;
                p03.AAf();
            }
        };
        this.A0K = abstractC0712Ob;
        C8C c8c = new C8C(this);
        this.A0L = c8c;
        this.A0C = ya;
        this.A0R = new C0601Jr(ya, c0573In);
        this.A0S = new C0587Jb(ya);
        this.A0A = i5;
        this.A0V = z2;
        this.A09 = i2;
        this.A0B = i3;
        this.A0F = p0;
        this.A08 = i4;
        this.A0U = z;
        this.A0G = new PS(ya, interfaceC0565If, super.A05);
        if (i3 == 1) {
            A00 = super.A05.A0u().A01();
        } else {
            A00 = super.A05.A0u().A00();
        }
        this.A00 = A00;
        RX rx = new RX(ya);
        this.A0I = rx;
        rx.getEventBus().A03(ma, mi, mu, m9, abstractC0712Ob, c8c);
        this.A0J = new AnonymousClass76(ya, interfaceC0565If, rx, abstractC1045aS.A11());
        A0C();
        rx.setVideoURI(c6q.A0S(super.A05.A0v().A0D().A08()));
        A0B();
        C0840Sz A05 = A05();
        this.A0D = A05;
        JT jt = new JT(A05, 400, 100, 0);
        this.A0T = jt;
        jt.A3U(true, false);
        this.A0Q = new K2(true);
        A0E();
        T3 cTAButton = A05.getCTAButton();
        this.A0E = cTAButton;
        LV.A0G(1001, cTAButton);
        A0A();
        A09();
        A05.bringToFront();
        if (IP.A1X(ya)) {
            ya.A0A().AGA(rx, super.A05.A11(), true);
        }
        if (IP.A1Y(ya)) {
            this.A0H = new C0737Pa(ya, interfaceC0565If, rx, super.A05.A11(), null);
        } else {
            this.A0H = null;
        }
    }

    private C0840Sz A05() {
        String A08;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        if (super.A05.A0O().equals(A08(37, 14, 125))) {
            A08 = EnumC0749Pm.A04.A02();
        } else {
            A08 = A08(0, 37, 58);
        }
        C0840Sz c0840Sz = new C0840Sz(this.A0C, A0b, super.A05.A0v().A0E().A00() == C1I.A05, getColors(), super.A05.A0v().A0F().A06(), A08, super.A07, super.A09, super.A0B, super.A08, super.A05.A0x());
        LV.A0G(PointerIconCompat.TYPE_TEXT, c0840Sz);
        c0840Sz.A0C(this.A0B);
        addView(c0840Sz, layoutParams);
        c0840Sz.setInfo(super.A05.A0v().A0E(), super.A05.A0v().A0F(), super.A05.A11(), super.A05.A0z().A01(), null);
        return c0840Sz;
    }

    private void A09() {
        this.A0S.A06(-1, A0Z);
        C0587Jb c0587Jb = this.A0S;
        int i = A0h;
        c0587Jb.setPadding(i, i, i, i);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0g);
        layoutParams.addRule(12);
        addView(this.A0S, layoutParams);
    }

    private void A0A() {
        C0601Jr c0601Jr = this.A0R;
        int i = A0d;
        c0601Jr.setPadding(i, i, i, i);
        int i2 = A0e;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i2, i2);
        layoutParams.setMargins(0, AbstractC0651Ls.A00, A0c, 0);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        ViewGroup.LayoutParams videoViewParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.A0I, videoViewParams);
        addView(this.A0R, layoutParams);
    }

    private void A0B() {
        postDelayed(new SP(this), IP.A0L(this.A0C));
    }

    private void A0C() {
        this.A0I.A0c(this.A0S);
        this.A0I.A0c(this.A0R);
        if (!TextUtils.isEmpty(super.A05.A0v().A0D().A07())) {
            C02876j c02876j = new C02876j(this.A0C);
            this.A0I.A0c(c02876j);
            c02876j.setImage(super.A05.A0v().A0D().A07());
        }
        this.A0I.A0c(new C6Z(this.A0C));
    }

    private final void A0E() {
        View expandableLayout = this.A0D.getExpandableLayout();
        if (expandableLayout != null) {
            JX jx = this.A03;
            if (jx != null) {
                this.A0Q.A0I(jx);
            }
            C1M A01 = super.A05.A0u().A01();
            this.A0Q.A0I(new JV(this.A0D.getCTAButton(), MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION, -1, A01.A09(true)));
            int i = A0Z;
            int i2 = A0a;
            int i3 = A0Y;
            Drawable A08 = LV.A08(i, i2, i3);
            Drawable endDrawable = LV.A05(A01.A08(true), i3);
            this.A0Q.A0I(new JY(this.A0D.getCTAButton(), MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION, A08, endDrawable));
            this.A0Q.A0I(new JW(expandableLayout, Opcodes.FCMPG, false));
            this.A0Q.A9D(this.A0I);
            this.A0Q.A0H(2300);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(AnonymousClass71 anonymousClass71) {
        if (this.A0I.getState() == QY.A02 && IP.A1E(this.A0C)) {
            postDelayed(new SO(this, anonymousClass71), 5000L);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0733Ow
    public final void A0K() {
        C0622Kn c0622Kn = this.A01;
        if (c0622Kn != null) {
            c0622Kn.A07();
        }
        if (IP.A1X(this.A0C)) {
            this.A0C.A0A().AFz(this.A0I);
        }
        C0737Pa c0737Pa = this.A0H;
        if (c0737Pa != null) {
            c0737Pa.A0A();
        }
        RX rx = this.A0I;
        if (rx != null) {
            rx.getEventBus().A04(this.A0O, this.A0N, this.A0M, this.A0P, this.A0K, this.A0L);
            LV.A0H(this.A0I);
            this.A0I.A0V();
        }
        this.A0J.A0g();
        View[] viewArr = new View[3];
        viewArr[0] = this.A0I;
        C0587Jb c0587Jb = this.A0S;
        String[] strArr = A0X;
        if (strArr[0].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        A0X[2] = "4e1dr9g4n9kT22ZIdoKy0n8REVoGbgbF";
        viewArr[1] = c0587Jb;
        viewArr[2] = this.A0R;
        LV.A0Z(viewArr);
        super.A0B.A0V();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0733Ow
    public final void A0L() {
        this.A0C.A0E().A4C();
        this.A04 = true;
        LV.A0T(this);
        LV.A0H(this.A0I);
        LV.A0Z(this.A0I, this.A0S, this.A0R);
        Pair<PR, View> A03 = this.A0G.A03(this.A0E);
        View view = (View) A03.second;
        LV.A0G(1101, view);
        switch (C0734Ox.A00[((PR) A03.first).ordinal()]) {
            case 1:
                this.A0D.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(0, AbstractC0651Ls.A00, 0, 0);
                layoutParams.addRule(2, this.A0D.getId());
                addView(view, layoutParams);
                break;
            case 2:
                LV.A0Z(this.A0D);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                int i = A0f;
                layoutParams2.setMargins(i, i, i, i);
                addView(view, layoutParams2);
                break;
        }
        if (this.A08 == 0 && this.A0U) {
            if (this.A0V) {
                this.A0F.AG5();
            }
            C0622Kn c0622Kn = new C0622Kn(this.A0A, 100.0f, 100L, new Handler(Looper.getMainLooper()), new SN(this));
            this.A01 = c0622Kn;
            c0622Kn.A08();
            return;
        }
        this.A05 = true;
        this.A0F.ACw(true);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0733Ow
    public final void A0M() {
        this.A0I.A0b(EnumC0746Pj.A02, 20);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0733Ow
    public final void A0N(boolean z) {
        C0622Kn c0622Kn = this.A01;
        if (c0622Kn != null) {
            c0622Kn.A07();
        }
        if (this.A0I.A0i()) {
            return;
        }
        this.A02 = this.A0I.getVideoStartReason();
        this.A06 = z;
        this.A0I.A0e(false, 13);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0733Ow
    public final void A0O(boolean z) {
        EnumC0746Pj enumC0746Pj;
        C0622Kn c0622Kn = this.A01;
        if (c0622Kn != null && !c0622Kn.A06()) {
            C0622Kn c0622Kn2 = this.A01;
            if (A0X[5].charAt(17) != 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A0X;
            strArr[7] = "pObqmm4LdTsqTcUgL7kozPbufRCkwYZC";
            strArr[6] = "5szeP9lNqMFVM0rzjOQcuK8NUDwg7u3G";
            c0622Kn2.A08();
        }
        if (this.A04 || this.A0I.getState() == QY.A06 || (enumC0746Pj = this.A02) == null) {
            return;
        }
        if (!this.A06 || z) {
            this.A0I.A0b(enumC0746Pj, 19);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0733Ow
    public final boolean A0P() {
        if (this.A08 != 2 && super.A05.A0v().A0O() && !this.A04) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0733Ow
    public final boolean A0Q() {
        return this.A04;
    }

    public C1M getColors() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0733Ow
    public C0736Oz getFullScreenAdStyle() {
        return new C0736Oz(true, C0736Oz.A06, super.A05.A0u().A01(), T3.A08(super.A05), super.A05.A0u().A01().A07(true), super.A05.A0v().A0D().A07());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0733Ow
    public LN getTouchDataRecorder() {
        return super.A08;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0733Ow, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        C1M A00;
        super.onConfigurationChanged(configuration);
        if (!this.A04) {
            if (configuration.orientation == 1) {
                A00 = super.A05.A0u().A01();
            } else {
                AnonymousClass19 A0u = super.A05.A0u();
                if (A0X[4].charAt(4) != 'R') {
                    throw new RuntimeException();
                }
                A0X[1] = "uYIsd2DhsQ91Wp0xmXJ9348eeMLtSRMf";
                A00 = A0u.A00();
            }
            this.A00 = A00;
            this.A0E.setViewShowsOverMedia(true);
            this.A0E.setUpButtonColors(this.A00);
            this.A0D.A0C(configuration.orientation);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View expandableLayout = this.A0D.getExpandableLayout();
        if (expandableLayout != null && z && this.A03 == null) {
            JX jx = new JX(expandableLayout, MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION, expandableLayout.getHeight(), 0);
            this.A03 = jx;
            this.A0Q.A0I(jx);
            this.A0Q.A0G();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            A0O(false);
        } else {
            A0N(false);
        }
    }
}
