package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.LinearLayout;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class PU extends AbstractC1374Yb {
    public static byte[] A03;
    public C1839gi A00;
    public InterfaceC1373Ya A01;
    public final ZM A02;

    static {
        A05();
    }

    public static String A02(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 75);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{-75, -34, -31, -27, -41, -110, -77, -42};
    }

    public PU(C1839gi c1839gi, AbstractC2004jd abstractC2004jd, int i) {
        super(c1839gi);
        this.A00 = c1839gi;
        setGravity(16);
        A04();
        this.A02 = new ZM(this.A00, abstractC2004jd, i);
        A03();
    }

    private void A03() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        this.A02.setContentDescription(A02(0, 8, 39));
        this.A02.setActionClickListener(new ViewOnClickListenerC1390Yr(this));
        addView(this.A02, layoutParams);
    }

    private void A04() {
        View view = new View(this.A00);
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        addView(view);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1374Yb
    public final void A09() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1374Yb
    public final void A0A() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1374Yb
    public final void A0B() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1374Yb
    public final void A0C(float f6, int i) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1374Yb
    public final void A0D(C1097Na c1097Na, boolean z8) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1374Yb
    public final boolean A0E() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1374Yb
    public int getToolbarActionMode() {
        return this.A02.getToolbarActionMode();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1374Yb
    public int getToolbarHeight() {
        return AbstractC1374Yb.A01;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1374Yb
    public InterfaceC1373Ya getToolbarListener() {
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1374Yb
    public void setAdReportingVisible(boolean z8) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1374Yb
    public void setCTAClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1374Yb
    public void setCTAClickListener(ViewOnClickListenerC1037Kr viewOnClickListenerC1037Kr) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1374Yb
    public void setFullscreen(boolean z8) {
    }

    public void setInitialUnskippableSeconds(int i) {
        this.A02.setInitialUnskippableSeconds(i);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1374Yb
    public void setPageDetails(C1109Nm c1109Nm, String str, int i, C1115Ns c1115Ns) {
        this.A02.setInitialUnskippableSeconds(i);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1374Yb
    public void setPageDetailsVisible(boolean z8) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1374Yb
    public void setProgress(float f6) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1374Yb
    public void setProgressClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1374Yb
    public void setProgressImage(YM ym) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1374Yb
    public void setProgressImmediate(float f6) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1374Yb
    public void setProgressSpinnerInvisible(boolean z8) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1374Yb
    public void setToolbarActionMessage(String str) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1374Yb
    public void setToolbarActionMode(int i) {
        this.A02.setToolbarActionMode(i);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1374Yb
    public void setToolbarListener(InterfaceC1373Ya interfaceC1373Ya) {
        this.A01 = interfaceC1373Ya;
    }
}
