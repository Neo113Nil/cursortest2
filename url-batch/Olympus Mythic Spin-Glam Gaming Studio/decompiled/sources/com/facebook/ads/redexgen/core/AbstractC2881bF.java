package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.bF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2881bF extends LinearLayout {
    public static byte[] A0A;
    public static final LinearLayout.LayoutParams A0B;
    public LinearLayout A00;
    public TextView A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final View.OnClickListener A05;
    public final RelativeLayout A06;
    public final C3218gi A07;
    public final ViewOnClickListenerC2416Kr A08;
    public final C2912bk A09;

    public static String A0h(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 11);
        }
        return new String(copyOfRange);
    }

    public static void A0i() {
        A0A = new byte[]{-96, -93, -93, -92, -77, -96, -88, -85, -78};
    }

    public abstract void A0l(int i);

    static {
        A0i();
        A0B = new LinearLayout.LayoutParams(-2, -2);
    }

    public AbstractC2881bF(C3218gi c3218gi, ViewOnClickListenerC2416Kr viewOnClickListenerC2416Kr, int i, C2476Na c2476Na, boolean z, String str, VA va, InterfaceC2759Yh interfaceC2759Yh, C3163fp c3163fp, Y2 y2, C2482Ng c2482Ng, boolean z2, String str2) {
        super(c3218gi);
        this.A02 = A0h(0, 0, 37);
        YB.A0K(this);
        this.A07 = c3218gi;
        this.A04 = i;
        this.A03 = z2;
        this.A02 = str2;
        this.A09 = new C2912bk(c3218gi);
        YB.A0N(this.A09, 0);
        YB.A0K(this.A09);
        if (z2) {
            this.A00 = new LinearLayout(c3218gi);
            this.A01 = new TextView(c3218gi);
            YB.A0K(this.A01);
        }
        if (viewOnClickListenerC2416Kr == null) {
            this.A08 = new ViewOnClickListenerC2416Kr(c3218gi, str, c2476Na, z, va, interfaceC2759Yh, c3163fp, y2, c2482Ng);
        } else {
            this.A08 = viewOnClickListenerC2416Kr;
        }
        YB.A0G(1001, this.A08);
        this.A05 = AbstractC2922bu.A03(this.A08, A0h(0, 9, 52));
        this.A06 = new RelativeLayout(c3218gi);
        this.A06.setLayoutParams(A0B);
        YB.A0K(this.A06);
    }

    public void A0j() {
    }

    public void A0k() {
        this.A09.setOnClickListener(this.A05);
    }

    public void A0m(boolean z) {
    }

    public final ViewOnClickListenerC2416Kr getCTAButton() {
        return this.A08;
    }

    public View getExpandableLayout() {
        return null;
    }

    public final ImageView getIconView() {
        return this.A09;
    }

    public void setInfo(NY ny, C2478Nc c2478Nc, String str, String str2, InterfaceC2733Xh interfaceC2733Xh, InterfaceC2896bU interfaceC2896bU) {
        this.A08.setCta(c2478Nc, str, new HashMap(), interfaceC2733Xh, interfaceC2896bU);
        new LM(this.A09, this.A07).A05(this.A04, this.A04).A07(str2);
    }

    public void setTitleMaxLines(int i) {
    }
}
