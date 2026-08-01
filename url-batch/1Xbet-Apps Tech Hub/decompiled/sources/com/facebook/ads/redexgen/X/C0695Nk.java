package com.facebook.ads.redexgen.X;

import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.Nk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0695Nk extends LinearLayout {
    public static final int A06 = (int) (C0627Ku.A02 * 4.0f);
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final YA A04;
    public final C0696Nl[] A05;

    public C0695Nk(YA ya, int i, int i2, int i3, int i4) {
        super(ya);
        this.A00 = A06;
        this.A04 = ya;
        setOrientation(0);
        this.A03 = i;
        this.A01 = i3;
        this.A02 = i4;
        this.A05 = new C0696Nl[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            this.A05[i5] = A00();
            addView(this.A05[i5]);
        }
        A01();
    }

    private C0696Nl A00() {
        C0696Nl c0696Nl = new C0696Nl(this.A04, this.A01, this.A02);
        int i = this.A03;
        LinearLayout.LayoutParams starRatingViewParams = new LinearLayout.LayoutParams(i, i);
        starRatingViewParams.gravity = 16;
        c0696Nl.setLayoutParams(starRatingViewParams);
        return c0696Nl;
    }

    private void A01() {
        int i = 0;
        while (true) {
            C0696Nl[] c0696NlArr = this.A05;
            int i2 = c0696NlArr.length;
            if (i < i2) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) c0696NlArr[i].getLayoutParams();
                int i3 = i == 0 ? 0 : this.A00;
                layoutParams.leftMargin = i3;
                i++;
            } else {
                requestLayout();
                return;
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A02(float f) {
        for (int i = 0; i < i; i++) {
            float fillRatio = Math.min(1.0f, f - i);
            if (fillRatio < 0.0f) {
                fillRatio = 0.0f;
            }
            this.A05[i].setFillRatio(fillRatio);
        }
    }

    public void setItemSpacing(int i) {
        this.A00 = i;
        A01();
    }

    public void setRating(float f) {
        A02(f);
    }
}
