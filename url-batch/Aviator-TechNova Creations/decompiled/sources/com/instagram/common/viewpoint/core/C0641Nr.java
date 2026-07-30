package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.LinearLayout;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Nr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0641Nr extends AbstractC0889Xm {
    public static byte[] A03;
    public C1159dL A00;
    public InterfaceC0888Xl A01;
    public final YQ A02;

    static {
        A05();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 75);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{-75, -34, -31, -27, -41, -110, -77, -42};
    }

    public C0641Nr(C1159dL c1159dL, InterfaceC0890Xn interfaceC0890Xn, C0802Ua c0802Ua, int i) {
        super(c1159dL);
        this.A00 = c1159dL;
        setGravity(16);
        A04();
        this.A02 = new YQ(this.A00, i);
        A03();
    }

    private void A03() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        this.A02.setContentDescription(A02(0, 8, 39));
        this.A02.setActionClickListener(new ViewOnClickListenerC0900Xx(this));
        addView(this.A02, layoutParams);
    }

    private void A04() {
        View view = new View(this.A00);
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        addView(view);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public final void A06() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public final void A07() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public final void A08() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public final void A09(float f, int i) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public final void A0A(C0622My c0622My, boolean z) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public final boolean A0B() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public int getToolbarActionMode() {
        return this.A02.getToolbarActionMode();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public int getToolbarHeight() {
        return AbstractC0889Xm.A01;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public InterfaceC0888Xl getToolbarListener() {
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public void setAdReportingVisible(boolean z) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public void setCTAClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public void setCTAClickListener(KE ke) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public void setFullscreen(boolean z) {
    }

    public void setInitialUnskippableSeconds(int i) {
        this.A02.setInitialUnskippableSeconds(i);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public void setPageDetails(N9 n9, String str, int i, NF nf) {
        this.A02.setInitialUnskippableSeconds(i);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public void setPageDetailsVisible(boolean z) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public void setProgress(float f) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public void setProgressClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public void setProgressImage(XX xx) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public void setProgressImmediate(float f) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public void setProgressSpinnerInvisible(boolean z) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public void setToolbarActionMessage(String str) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public void setToolbarActionMode(int i) {
        this.A02.setToolbarActionMode(i);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Xm
    public void setToolbarListener(InterfaceC0888Xl interfaceC0888Xl) {
        this.A01 = interfaceC0888Xl;
    }
}
