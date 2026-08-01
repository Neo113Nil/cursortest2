package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.material.card.MaterialCardViewHelper;
import com.google.common.base.Ascii;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Sy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0839Sy extends AbstractC0706Nv {
    public static byte[] A06;
    public static String[] A07 = {"1qM0UqBuKeNFs4931PZdKXfB5ZchECK5", "3ZSmcCEAG5Dz0dWrJNlp2MNszP7YT25A", "Vrvau7r1HMpQKQXhvyVkTfJZAsfHOW4A", "oVRoE2FdK0le1s2SfNIozg00Kc9sH4MP", "npYoVlwUwM4clRwIxvjz9nauDkw8jySV", "7Yuh663Y", "kkRlGGIMUj7iwn7pYEfT9Vq54HRzcbQk", "UynwTjbvMY6JmtelA"};
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public K2 A00;
    public JX A01;
    public JT A02;
    public final AbstractC1045aS A03;
    public final C1D A04;
    public final NR A05;

    public static String A0C(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 22);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A06 = new byte[]{9, 5, 7, 68, Ascii.FF, Ascii.VT, 9, Ascii.SI, 8, 5, 5, 1, 68, Ascii.VT, Ascii.SO, Ascii.EM, 68, 3, 4, Ascii.RS, Ascii.SI, Ascii.CAN, Ascii.EM, Ascii.RS, 3, Ascii.RS, 3, Ascii.VT, 6, 68, 9, 6, 3, 9, 1, Ascii.SI, Ascii.SO, 92, 75, 89, 79, 92, 74, 75, 74, 113, 88, 71, 74, 75, 65};
    }

    static {
        A0D();
        A0B = (int) (C0627Ku.A02 * 48.0f);
        A0F = (int) (C0627Ku.A02 * 16.0f);
        A08 = (int) (C0627Ku.A02 * 4.0f);
        A0E = (int) (C0627Ku.A02 * 44.0f);
        A0C = (int) (C0627Ku.A02 * 8.0f);
        A0D = (int) (C0627Ku.A02 * 12.0f);
        A0H = (int) (C0627Ku.A02 * 12.0f);
        A0G = (int) (C0627Ku.A02 * 26.0f);
        int A01 = C01842d.A01(-1, 77);
        A09 = A01;
        A0A = C01842d.A01(A01, 90);
    }

    public AbstractC0839Sy(C0710Nz c0710Nz, boolean z) {
        super(c0710Nz, z);
        AbstractC1045aS A04 = c0710Nz.A04();
        this.A03 = A04;
        this.A04 = A04.A0v();
        this.A05 = A0B(c0710Nz);
        AbstractC0651Ls A082 = c0710Nz.A08();
        if (A082 != null) {
            A082.setLayoutParams(new RelativeLayout.LayoutParams(-1, A082.getToolbarHeight()));
            A082.setPageDetailsVisible(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C0840Sz A0B(C0710Nz c0710Nz) {
        String A0C2;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        if (!c0710Nz.A04().A0O().equals(A0C(37, 14, 56))) {
            if (A07[5].length() != 7) {
                A07[7] = "aLegEIjbGKC4WYI41vdDU1g9u";
                A0C2 = A0C(0, 37, 124);
                C0840Sz c0840Sz = new C0840Sz(c0710Nz.A05(), A0B, this.A04.A0E().A00() != C1I.A05, getColors(), this.A04.A0F().A06(), A0C2, c0710Nz.A06(), c0710Nz.A09(), c0710Nz.A0B(), c0710Nz.A07(), c0710Nz.A04().A0x());
                this.A02 = new JT(c0840Sz, 400, 100, 0);
                LV.A0K(c0840Sz);
                c0840Sz.A0C(c0710Nz.A00());
                if (IP.A0z(c0710Nz.A05())) {
                }
                addView(c0840Sz, layoutParams);
                c0840Sz.getCTAButton().A0A(this.A03, c0710Nz.A08());
                return c0840Sz;
            }
            throw new RuntimeException();
        }
        EnumC0749Pm enumC0749Pm = EnumC0749Pm.A04;
        if (A07[7].length() != 22) {
            String[] strArr = A07;
            strArr[6] = "Ca3psE1IPVUhCMreDaAATfbsplsRsoNT";
            strArr[1] = "q1VyT2b1NhDnFBLs9y9UP0y4iho0jP8D";
            A0C2 = enumC0749Pm.A02();
            C0840Sz c0840Sz2 = new C0840Sz(c0710Nz.A05(), A0B, this.A04.A0E().A00() != C1I.A05, getColors(), this.A04.A0F().A06(), A0C2, c0710Nz.A06(), c0710Nz.A09(), c0710Nz.A0B(), c0710Nz.A07(), c0710Nz.A04().A0x());
            this.A02 = new JT(c0840Sz2, 400, 100, 0);
            LV.A0K(c0840Sz2);
            c0840Sz2.A0C(c0710Nz.A00());
            if (IP.A0z(c0710Nz.A05())) {
                c0840Sz2.A0B();
                if (c0710Nz.A08() != null) {
                    c0710Nz.A08().setCTAClickListener(getCtaButton());
                }
            }
            addView(c0840Sz2, layoutParams);
            c0840Sz2.getCTAButton().A0A(this.A03, c0710Nz.A08());
            return c0840Sz2;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0706Nv
    public void A0z(C1D c1d, String str, double d, Bundle bundle) {
        super.A0z(c1d, str, d, bundle);
        this.A05.setInfo(c1d.A0E(), c1d.A0F(), str, this.A03.A0z().A01(), null);
    }

    public final int A12(AbstractC0651Ls abstractC0651Ls) {
        return abstractC0651Ls == null ? AbstractC0651Ls.A00 : abstractC0651Ls.getToolbarHeight();
    }

    public void A13() {
        View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout != null) {
            K2 k2 = new K2(true);
            this.A00 = k2;
            JX jx = this.A01;
            if (jx != null) {
                k2.A0I(jx);
            }
            C1M A01 = this.A03.A0u().A01();
            this.A00.A0I(new JV(getAdDetailsView().getCTAButton(), MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION, -1, A01.A09(true)));
            int i = A09;
            int i2 = A0A;
            int i3 = A08;
            Drawable A082 = LV.A08(i, i2, i3);
            Drawable startDrawable = LV.A05(A01.A08(true), i3);
            this.A00.A0I(new JY(getAdDetailsView().getCTAButton(), MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION, A082, startDrawable));
            this.A00.A0I(new JW(expandableLayout, Opcodes.FCMPG, false));
            this.A00.A0H(2300);
        }
    }

    public AbstractC1045aS getAdDataBundle() {
        return this.A03;
    }

    public JT getAdDetailsAnimation() {
        return this.A02;
    }

    public NR getAdDetailsView() {
        return this.A05;
    }

    public C1D getAdInfo() {
        return this.A04;
    }

    public K2 getAnimationPlugin() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0706Nv, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getAdDetailsView().A0C(configuration.orientation);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout == null || !z) {
            return;
        }
        JX jx = this.A01;
        if (A07[2].charAt(30) != '4') {
            throw new RuntimeException();
        }
        A07[0] = "AO2Vor543jhYYkt1oYijcT7buZTkR3eI";
        if (jx == null) {
            JX jx2 = new JX(expandableLayout, MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION, expandableLayout.getHeight(), 0);
            this.A01 = jx2;
            this.A00.A0I(jx2);
            this.A00.A0G();
        }
    }
}
