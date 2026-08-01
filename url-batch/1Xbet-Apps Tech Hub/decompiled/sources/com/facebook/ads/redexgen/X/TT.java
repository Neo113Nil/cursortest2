package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.ImageView;

/* loaded from: assets/audience_network.dex */
public final class TT extends C0693Ni {
    public static String[] A01 = {"ApYQLHiJfFoQxPLev3v1RnZtjL3Htxrs", "bo2sqrskjgNWasJuJCrp16cZ2XBNeh8X", "emwWE4rUfgFwy6LExYmEfzkDvXYAedhg", "bPVrpfjvf63ND9vhKC9W9DFqAg6wIvw3", "k6ukfOYu7hE0QQIPVs49Kdk3IYXWEofH", "fvCBaRVGvF6m5ZfwhdbeNg6rR0MmpiyE", "HEJk8ccdn4XKVem16EvPwrOEFwPjrKpO", "Ip6ocVLC"};
    public ImageView.ScaleType A00;

    public TT(YA ya) {
        super(ya);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    @Override // android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int widthSpecSize;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int heightSpecSize = View.MeasureSpec.getMode(i);
        if (heightSpecSize == 1073741824) {
            int heightSpecSize2 = View.MeasureSpec.getMode(i2);
            if (heightSpecSize2 == 1073741824) {
                int heightSpecSize3 = Math.min(size2, size);
                setMeasuredDimension(heightSpecSize3, heightSpecSize3);
                ImageView.ScaleType scaleType = this.A00;
                widthSpecSize = A01[5].charAt(24);
                if (widthSpecSize != 121) {
                    throw new RuntimeException();
                }
                A01[1] = "60jXKIpbxaQwCHoxf9ChBAtjlKdb11wg";
                if (scaleType != null) {
                    super.setScaleType(scaleType);
                    return;
                }
                return;
            }
        }
        int heightSpecSize4 = View.MeasureSpec.getMode(i);
        if (heightSpecSize4 == 1073741824) {
            if (size > 0) {
                size2 = Math.min(size2, size);
            }
            setMeasuredDimension(size2, size2);
        } else {
            int heightSpecSize5 = View.MeasureSpec.getMode(i2);
            if (heightSpecSize5 == 1073741824) {
                if (size2 > 0) {
                    size = Math.min(size2, size);
                }
                setMeasuredDimension(size, size);
            } else {
                super.onMeasure(i, i2);
            }
        }
        ImageView.ScaleType scaleType2 = this.A00;
        widthSpecSize = A01[5].charAt(24);
        if (widthSpecSize != 121) {
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        this.A00 = scaleType;
    }
}
