package com.facebook.ads.internal.view;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import com.instagram.common.viewpoint.core.AbstractC0862Wl;
import com.instagram.common.viewpoint.core.AbstractC0889Xm;
import com.instagram.common.viewpoint.core.AbstractC0984aV;
import com.instagram.common.viewpoint.core.C0622My;
import com.instagram.common.viewpoint.core.C0802Ua;
import com.instagram.common.viewpoint.core.C0887Xk;
import com.instagram.common.viewpoint.core.C1125cm;
import com.instagram.common.viewpoint.core.C1159dL;
import com.instagram.common.viewpoint.core.InterfaceC0888Xl;
import com.instagram.common.viewpoint.core.InterfaceC0890Xn;
import com.instagram.common.viewpoint.core.KE;
import com.instagram.common.viewpoint.core.N9;
import com.instagram.common.viewpoint.core.NF;
import com.instagram.common.viewpoint.core.ViewOnClickListenerC0899Xw;
import com.instagram.common.viewpoint.core.XP;
import com.instagram.common.viewpoint.core.XX;
import com.instagram.common.viewpoint.core.YG;
import com.instagram.common.viewpoint.core.YO;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class FullScreenAdToolbar extends AbstractC0889Xm {
    public static byte[] A0B;
    public static String[] A0C = {"bFTGQZCDUsZohbmTeIVqSIHEteTzH9ln", "yXw5A2C", "1AgOSkHO0Pb00RrFT9UOiqy", "TxDFqDHdXRoHKl2DTNxbpTLqI26RISWJ", "CWbWmw8OaNX6ff1fhEYiHQW6wjCjGro9", "znIzyGoGhCcdAsXYdQkLlPNG9alZ5sNL", "lf2qO9K", "XEgUxEHpppw1PxIgjlcxmDWHelwWu1Ow"};
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public C0887Xk A00;
    public InterfaceC0888Xl A01;
    public InterfaceC0888Xl A02;
    public YG A03;
    public boolean A04;
    public boolean A05;
    public final RelativeLayout A06;
    public final C0802Ua A07;
    public final InterfaceC0890Xn A08;
    public final YO A09;
    public final C1125cm A0A;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 22);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {113, -102, -99, -95, -109, 78, 111, -110, -100, -81, -70, -71, -68, -66, 106, -117, -82, -71, -76, -76, -79, -89, -90, -73};
        if (A0C[5].charAt(20) != 'l') {
            throw new RuntimeException();
        }
        A0C[2] = "ATFpsL3dKIxr1CEZIKZeGPZ";
        A0B = bArr;
    }

    static {
        A03();
        A0D = (int) (AbstractC0862Wl.A02 * 10.0f);
        A0H = (int) (AbstractC0862Wl.A02 * 16.0f);
        A0F = A0H - A0D;
        A0G = (A0H * 2) - A0D;
        A0E = (int) (AbstractC0862Wl.A02 * 4.0f);
    }

    public FullScreenAdToolbar(C1159dL c1159dL, InterfaceC0890Xn interfaceC0890Xn, C0802Ua c0802Ua, int i, int i2, boolean z) {
        super(c1159dL);
        this.A01 = null;
        this.A04 = true;
        this.A05 = z;
        this.A08 = interfaceC0890Xn;
        this.A07 = c0802Ua;
        setGravity(16);
        this.A09 = new YO(c1159dL, i, z);
        this.A09.setContentDescription(A02(0, 8, 24));
        this.A09.setActionClickListener(new ViewOnClickListenerC0899Xw(this));
        if (!this.A05) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(A0F, A0F, A0G, A0F);
            addView(this.A09, layoutParams);
            this.A06 = new RelativeLayout(c1159dL);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
            layoutParams2.weight = 1.0f;
            this.A0A = new C1125cm(c1159dL);
            XP.A0E(PointerIconCompat.TYPE_CELL, this.A0A);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 17;
            this.A0A.setLayoutParams(layoutParams3);
            this.A06.addView(this.A0A);
            addView(this.A06, layoutParams2);
            if (i2 != -1) {
                A0D(c1159dL, i2);
                return;
            }
            return;
        }
        if (i2 != -1) {
            A0D(c1159dL, i2);
        }
        this.A06 = new RelativeLayout(c1159dL);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        this.A0A = new C1125cm(c1159dL);
        XP.A0E(PointerIconCompat.TYPE_CELL, this.A0A);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 17;
        this.A0A.setLayoutParams(layoutParams5);
        this.A06.addView(this.A0A);
        addView(this.A06, layoutParams4);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.setMargins(0, A0H / 2, A0H / 2, A0H / 2);
        addView(this.A09, layoutParams6);
    }

    private void A04(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setVisibility(z ? 0 : 8);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public final void A06() {
        this.A09.A02();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public final void A07() {
        if (this.A01 != null) {
            this.A02 = this.A01;
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public final void A08() {
        this.A01 = getToolbarListener();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public final void A09(float f, int i) {
        this.A09.A03(f, i);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public final void A0A(C0622My c0622My, boolean z) {
        boolean z2 = this.A04;
        int A05 = c0622My.A05(z2);
        this.A0A.A02(c0622My.A0B(z2), A05);
        boolean z3 = this.A05;
        String A02 = A02(8, 9, 52);
        if (!z3) {
            if (this.A00 != null) {
                this.A00.setIconColors(A05);
                this.A00.setContentDescription(A02);
            }
        } else if (this.A03 != null) {
            this.A03.setIconColors(A05);
            this.A03.setContentDescription(A02);
        }
        this.A09.A04(c0622My, z2, z);
        if (z2) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1778384896, 0});
            gradientDrawable.setCornerRadius(0.0f);
            XP.A0Q(this, gradientDrawable);
            boolean fullScreenEnabled = this.A05;
            setReportingViewColor(!fullScreenEnabled ? this.A00 : this.A03);
            return;
        }
        XP.A0K(this, 0);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public final boolean A0B() {
        return this.A09.A05();
    }

    public final void A0C(N9 n9, String str, int i) {
        this.A09.setInitialUnskippableSeconds(i);
        if (this.A05) {
            if (this.A03 != null) {
                this.A03.setAdDetails(n9, str, this.A07, this.A08);
            }
        } else {
            if (this.A00 == null) {
                return;
            }
            this.A00.setAdDetails(n9, str, this.A07, this.A08);
        }
    }

    public final void A0D(C1159dL c1159dL, int i) {
        if (this.A00 != null) {
            XP.A0H(this.A00);
            this.A00.removeAllViews();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (!this.A05) {
            this.A00 = new C0887Xk(c1159dL, i);
            layoutParams.setMargins(0, A0H / 2, A0H / 2, A0H / 2);
            addView(this.A00, layoutParams);
        } else {
            this.A03 = new YG(c1159dL);
            layoutParams.setMargins(A0F, A0F, A0G, A0F);
            addView(this.A03, layoutParams);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public int getToolbarActionMode() {
        return this.A09.getToolbarActionMode();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public int getToolbarHeight() {
        return AbstractC0889Xm.A00;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public InterfaceC0888Xl getToolbarListener() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public void setAdReportingVisible(boolean z) {
        A04(!this.A05 ? this.A00 : this.A03, z);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public void setCTAClickListener(View.OnClickListener onClickListener) {
        this.A0A.setOnClickListener(onClickListener);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public void setCTAClickListener(KE ke) {
        this.A0A.setOnClickListener(AbstractC0984aV.A03(ke, A02(17, 7, 47)));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public void setFullscreen(boolean z) {
        this.A04 = z;
    }

    public void setOnlyPageDetails(N9 n9) {
        if (n9 != null) {
            this.A0A.setPageDetails(n9);
        } else {
            this.A0A.A01();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public void setPageDetails(N9 n9, String str, int i, NF nf) {
        this.A09.setInitialUnskippableSeconds(i);
        this.A0A.setPageDetails(n9);
        if (this.A05) {
            if (this.A03 != null) {
                this.A03.setAdDetails(n9, str, this.A07, this.A08);
            }
        } else {
            if (this.A00 == null) {
                return;
            }
            this.A00.setAdDetails(n9, str, this.A07, this.A08);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public void setPageDetailsVisible(boolean z) {
        this.A06.removeAllViews();
        if (z) {
            this.A06.addView(this.A0A);
        }
        this.A09.setToolbarMessageEnabled(!z);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public void setProgress(float f) {
        this.A09.setProgress(f);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public void setProgressClickListener(View.OnClickListener onClickListener) {
        this.A09.setProgressClickListener(onClickListener);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public void setProgressImage(XX xx) {
        this.A09.setProgressImage(xx);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public void setProgressImmediate(float f) {
        this.A09.setProgressImmediate(f);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public void setProgressSpinnerInvisible(boolean z) {
        this.A09.setProgressSpinnerInvisible(z);
    }

    private void setReportingViewColor(View view) {
        if (view != null) {
            XP.A0O(view, 0, ViewCompat.MEASURED_STATE_MASK, A0E);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public void setToolbarActionMessage(String str) {
        this.A09.setToolbarMessage(str);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public void setToolbarActionMode(int i) {
        this.A09.setToolbarActionMode(i);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public void setToolbarListener(InterfaceC0888Xl interfaceC0888Xl) {
        this.A02 = interfaceC0888Xl;
    }
}
