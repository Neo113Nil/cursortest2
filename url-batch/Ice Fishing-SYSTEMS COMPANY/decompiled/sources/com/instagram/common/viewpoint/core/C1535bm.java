package com.instagram.common.viewpoint.core;

import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.bm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1535bm extends LinearLayout {
    public static final int A06 = (int) (XX.A02 * 4.0f);
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C1839gi A04;
    public final C1536bn[] A05;

    public C1535bm(C1839gi c1839gi, int i, int i4, int i9, int i10) {
        super(c1839gi);
        this.A00 = A06;
        this.A04 = c1839gi;
        setOrientation(0);
        this.A03 = i;
        this.A01 = i9;
        this.A02 = i10;
        this.A05 = new C1536bn[i4];
        for (int i11 = 0; i11 < i4; i11++) {
            this.A05[i11] = A00();
            addView(this.A05[i11]);
        }
        A01();
    }

    private C1536bn A00() {
        C1536bn c1536bn = new C1536bn(this.A04, this.A01, this.A02);
        LinearLayout.LayoutParams starRatingViewParams = new LinearLayout.LayoutParams(this.A03, this.A03);
        starRatingViewParams.gravity = 16;
        c1536bn.setLayoutParams(starRatingViewParams);
        return c1536bn;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A01() {
        int i = 0;
        while (i < i) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.A05[i].getLayoutParams();
            int i4 = i == 0 ? 0 : this.A00;
            layoutParams.leftMargin = i4;
            i++;
        }
        requestLayout();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A02(float f6) {
        for (int i = 0; i < i; i++) {
            float fillRatio = Math.min(1.0f, f6 - i);
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

    public void setRating(float f6) {
        A02(f6);
    }
}
