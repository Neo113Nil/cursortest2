package com.instagram.common.viewpoint.core;

import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class LV extends AbstractC0900Yd {
    public static String[] A03 = {"ps9u6Kn8p", "fRCCllxRFm9XYnsS5Nz0CDYYbd8rz98F", "veZY5LUK4HkumILqtvhVtf9OT9QK1Jmh", "8c6Edyt19YE2bwpDp37rWBgdyfN4I4si", "Dgwj6SSLqT", "biYcUlACC5CMDg3zbjwwDR7mq5XP76DA", "rp5V5gFYHfFnaijOqqdMDMWavMrEx7HP", "ycj43TNZcka4uMSCxDz6fuqQ2r9gi3g6"};
    public static final int A04 = (int) (AbstractC0856Wl.A02 * 8.0f);
    public final RelativeLayout A00;
    public final O2 A01;
    public final C1153dL A02;

    public LV(C1153dL c1153dL, US us, String str, N9 n9, InterfaceC0885Xo interfaceC0885Xo, InterfaceC0884Xn interfaceC0884Xn) {
        super(c1153dL, us, str, n9, interfaceC0885Xo, interfaceC0884Xn);
        this.A02 = c1153dL;
        this.A01 = O3.A00(c1153dL.A02());
        this.A00 = new RelativeLayout(getContext());
        addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
        XP.A0K(this.A00, -1728053248);
        this.A00.setOnClickListener(new ViewOnClickListenerC0905Yi(this));
    }

    public static RelativeLayout.LayoutParams A00(boolean z) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, z ? -1 : -2);
        layoutParams.addRule(12);
        return layoutParams;
    }

    private void A01() {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new ChangeBounds()).addTransition(new Explode());
        XP.A0T(this, transitionSet);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0900Yd
    public final void A0N() {
        O6 A0A = this.A01.A0A();
        C0915Ys c0915Ys = new C0915Ys(this.A02);
        c0915Ys.setInfo(XX.HIDE_AD, this.A01.A0H(), this.A01.A0G());
        c0915Ys.setOnClickListener(new ViewOnClickListenerC0906Yj(this));
        O6 A0B = this.A01.A0B();
        C0915Ys c0915Ys2 = new C0915Ys(this.A02);
        c0915Ys2.setInfo(XX.REPORT_AD, this.A01.A0L(), this.A01.A0K());
        c0915Ys2.setOnClickListener(new ViewOnClickListenerC0907Yk(this));
        C0915Ys c0915Ys3 = new C0915Ys(this.A02);
        c0915Ys3.setInfo(XX.AD_CHOICES_ICON, this.A01.A0M(), "");
        c0915Ys3.setOnClickListener(new ViewOnClickListenerC0908Yl(this));
        LinearLayout.LayoutParams itemParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(A04 * 2, A04, A04 * 2, A04);
        XP.A0K(linearLayout, -1);
        if (!A0A.A05().isEmpty()) {
            linearLayout.addView(c0915Ys, itemParams);
        }
        if (!A0B.A05().isEmpty()) {
            linearLayout.addView(c0915Ys2, itemParams);
        }
        linearLayout.addView(c0915Ys3, itemParams);
        A01();
        this.A00.removeAllViews();
        this.A00.addView(linearLayout, A00(false));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0900Yd
    public final void A0O() {
        XP.A0G(this);
        this.A00.removeAllViews();
        XP.A0H(this);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0900Yd
    public final void A0P(O6 o6, O4 o4) {
        String A0E;
        int i;
        String str;
        if (o4 == O4.A05) {
            return;
        }
        boolean z = o4 == O4.A06;
        C0898Yb c0898Yb = new C0898Yb(this.A02, this.A0B);
        if (z) {
            O2 o2 = this.A01;
            if (A03[4].length() != 10) {
                throw new RuntimeException();
            }
            A03[6] = "KfE81dulHFmzGO7NxqDM7oaE1pV2dKkX";
            A0E = o2.A0F();
        } else {
            A0E = this.A01.A0E();
        }
        C0898Yb A0E2 = c0898Yb.A0I(A0E).A0H(this.A01.A0D()).A0F(o6.A04()).A0E(z ? XX.REPORT_AD : XX.HIDE_AD);
        if (z) {
            i = -552389;
        } else {
            i = -13272859;
        }
        C0898Yb A0D = A0E2.A0D(i);
        if (this.A0A != null) {
            N9 n9 = this.A0A;
            if (A03[1].charAt(11) != 'X') {
                str = n9.A01();
            } else {
                A03[0] = "vLdx3pZGf";
                str = n9.A01();
            }
        } else {
            str = "";
        }
        C0899Yc adHiddenView = A0D.A0G(str).A0M();
        XP.A0K(adHiddenView, -1);
        XP.A0R(this);
        this.A00.removeAllViews();
        this.A00.addView(adHiddenView, A00(true));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0900Yd
    public final void A0Q(O6 o6, O4 o4) {
        String A0H;
        boolean z = o4 == O4.A06;
        C1153dL c1153dL = this.A02;
        InterfaceC0902Yf interfaceC0902Yf = this.A0B;
        if (z) {
            A0H = this.A01.A0L();
        } else {
            A0H = this.A01.A0H();
        }
        C0918Yv c0918Yv = new C0918Yv(c1153dL, o6, interfaceC0902Yf, A0H, z ? XX.REPORT_AD : XX.HIDE_AD);
        c0918Yv.setClickable(true);
        XP.A0K(c0918Yv, -1);
        c0918Yv.setPadding(A04 * 2, A04, A04 * 2, A04);
        A01();
        this.A00.removeAllViews();
        RelativeLayout relativeLayout = this.A00;
        String[] strArr = A03;
        if (strArr[3].charAt(9) == strArr[5].charAt(9)) {
            throw new RuntimeException();
        }
        A03[1] = "OoQvJ70CiRWXlhIiWSDPNsGTFrOY4nX1";
        relativeLayout.addView(c0918Yv, A00(false));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0900Yd
    public final boolean A0R() {
        return false;
    }
}
