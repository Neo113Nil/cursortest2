package com.horcrux.svg;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.facebook.react.uimanager.ViewProps;

/* loaded from: classes2.dex */
class ViewBox {
    private static final int MOS_MEET = 0;
    private static final int MOS_NONE = 2;
    private static final int MOS_SLICE = 1;

    ViewBox() {
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Matrix getTransform(RectF rectF, RectF rectF2, String str, int i) {
        double d;
        double d2;
        double d3;
        double d4 = rectF.left;
        double d5 = rectF.top;
        double width = rectF.width();
        double height = rectF.height();
        double d6 = rectF2.left;
        double d7 = rectF2.top;
        double width2 = rectF2.width();
        double height2 = rectF2.height();
        double d8 = width2 / width;
        double d9 = height2 / height;
        double d10 = d6 - (d4 * d8);
        double d11 = d7 - (d5 * d9);
        if (i == 2) {
            d8 = Math.min(d8, d9);
            if (d8 > 1.0d) {
                d = d10 - (((width2 / d8) - width) / 2.0d);
                d3 = (height2 / d8) - height;
            } else {
                d = d10 - ((width2 - (width * d8)) / 2.0d);
                d3 = height2 - (height * d8);
            }
            d2 = d11 - (d3 / 2.0d);
            d9 = d8;
        } else {
            if (!str.equals(ViewProps.NONE) && i == 0) {
                d8 = Math.min(d8, d9);
            } else {
                if (!str.equals(ViewProps.NONE) && i == 1) {
                    d8 = Math.max(d8, d9);
                }
                double d12 = d6 - (d4 * d8);
                double d13 = d7 - (d5 * d9);
                if (str.contains("xMid")) {
                    d12 += (width2 - (width * d8)) / 2.0d;
                }
                if (str.contains("xMax")) {
                    d12 += width2 - (width * d8);
                }
                d = d12;
                if (str.contains("YMid")) {
                    d13 += (height2 - (height * d9)) / 2.0d;
                }
                d2 = d13;
                if (str.contains("YMax")) {
                    d2 += height2 - (height * d9);
                }
            }
            d9 = d8;
            double d122 = d6 - (d4 * d8);
            double d132 = d7 - (d5 * d9);
            if (str.contains("xMid")) {
            }
            if (str.contains("xMax")) {
            }
            d = d122;
            if (str.contains("YMid")) {
            }
            d2 = d132;
            if (str.contains("YMax")) {
            }
        }
        double d14 = d;
        double d15 = d2;
        Matrix matrix = new Matrix();
        matrix.postTranslate((float) d14, (float) d15);
        matrix.preScale((float) d8, (float) d9);
        return matrix;
    }
}
