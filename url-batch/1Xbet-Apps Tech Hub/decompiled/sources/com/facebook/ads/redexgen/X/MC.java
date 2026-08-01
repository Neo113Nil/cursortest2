package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.ImageView;

/* loaded from: assets/audience_network.dex */
public final class MC extends ImageView {
    public static String[] A01 = {"", "xAgTXbjVi62PdicRvipr2yH2TBkp", "gkbD2s1xpJQg4uStKBrjHXnqoYLvnFUr", "soe6jIArtiQ", "3Vk7uiWTp4D98Qq5DBFXHdZ3JTbv3qUy", "5FE99nP0vOH07stjGxCxhCer", "JVbWipYt4YB", ""};
    public ImageView.ScaleType A00;

    public MC(YA ya) {
        super(ya);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        ImageView.ScaleType scaleType;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int heightSpecSize = View.MeasureSpec.getMode(i);
        if (heightSpecSize == 1073741824) {
            int mode = View.MeasureSpec.getMode(i2);
            String[] strArr = A01;
            String str = strArr[1];
            String str2 = strArr[5];
            int widthSpecSize = str.length();
            int heightSpecSize2 = str2.length();
            if (widthSpecSize == heightSpecSize2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[6] = "LPpzUfvPRnl";
            strArr2[3] = "8xYze5Yy4ig";
            if (mode == 1073741824) {
                int heightSpecSize3 = Math.min(size2, size);
                setMeasuredDimension(heightSpecSize3, heightSpecSize3);
                scaleType = this.A00;
                if (scaleType == null) {
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
        scaleType = this.A00;
        if (scaleType == null) {
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        this.A00 = scaleType;
    }
}
