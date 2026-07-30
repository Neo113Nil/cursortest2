package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* renamed from: com.facebook.ads.redexgen.X.b5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1492b5 extends FrameLayout {
    public int A00;
    public int A01;
    public final ImageView A02;
    public final ImageView A03;

    public C1492b5(C1839gi c1839gi) {
        super(c1839gi);
        this.A03 = new ImageView(c1839gi);
        this.A02 = new ImageView(c1839gi);
        A00();
    }

    public C1492b5(C1839gi c1839gi, AttributeSet attributeSet) {
        super(c1839gi, attributeSet);
        this.A03 = new ImageView(c1839gi, attributeSet);
        this.A02 = new ImageView(c1839gi, attributeSet);
        A00();
    }

    public C1492b5(C1839gi c1839gi, AttributeSet attributeSet, int i) {
        super(c1839gi, attributeSet, i);
        this.A03 = new ImageView(c1839gi, attributeSet, i);
        this.A02 = new ImageView(c1839gi, attributeSet, i);
        A00();
    }

    public C1492b5(C1839gi c1839gi, AttributeSet attributeSet, int i, int i4) {
        super(c1839gi, attributeSet, i, i4);
        this.A03 = new ImageView(c1839gi, attributeSet, i, i4);
        this.A02 = new ImageView(c1839gi, attributeSet, i, i4);
        A00();
    }

    private void A00() {
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
        addView(this.A03, new FrameLayout.LayoutParams(-2, -2));
        EnumC1349Xc.A04(this.A03, EnumC1349Xc.A0B);
        setId(YB.A00());
    }

    public ImageView getBodyImageView() {
        return this.A03;
    }

    public int getImageHeight() {
        return this.A00;
    }

    public int getImageWidth() {
        return this.A01;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i4, int i9, int i10) {
        if (this.A01 <= 0 || this.A00 <= 0) {
            super.onLayout(z8, i, i4, i9, i10);
            return;
        }
        int i11 = i9 - i;
        int i12 = i10 - i4;
        float min = Math.min(i11 / this.A01, i12 / this.A00);
        int i13 = (int) (this.A01 * min);
        int i14 = (int) (this.A00 * min);
        this.A02.layout(i, i4, i9, i10);
        int blurBorderViewHeight = (i11 / 2) + i;
        int blurBorderViewWidth = (i12 / 2) + i4;
        this.A03.layout(blurBorderViewHeight - (i13 / 2), blurBorderViewWidth - (i14 / 2), (i13 / 2) + blurBorderViewHeight, blurBorderViewWidth + (i14 / 2));
        this.A02.setVisibility(0);
    }

    public void setImage(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap2 != null) {
            YB.A0V(this.A02, new BitmapDrawable(getContext().getResources(), bitmap2));
        } else {
            YB.A0N(this.A02, 0);
        }
        if (bitmap != null) {
            this.A01 = bitmap.getWidth();
            this.A00 = bitmap.getHeight();
            this.A03.setImageBitmap(Bitmap.createBitmap(bitmap));
            return;
        }
        this.A03.setImageDrawable(null);
    }
}
