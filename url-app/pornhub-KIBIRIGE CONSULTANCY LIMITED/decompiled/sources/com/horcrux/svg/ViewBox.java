package com.horcrux.svg;

import android.graphics.Matrix;
import android.graphics.RectF;

/* loaded from: classes2.dex */
class ViewBox {
    private static final int MOS_MEET = 0;
    private static final int MOS_NONE = 2;
    private static final int MOS_SLICE = 1;

    ViewBox() {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Matrix getTransform(RectF rectF, RectF rectF2, String str, int i) {
        double d;
        double d2 = rectF.left;
        double d3 = rectF.top;
        double width = rectF.width();
        double height = rectF.height();
        double d4 = rectF2.left;
        double d5 = rectF2.top;
        double width2 = rectF2.width();
        double height2 = rectF2.height();
        double d6 = width2 / width;
        double d7 = height2 / height;
        double d8 = d4 - (d2 * d6);
        double d9 = d5 - (d3 * d7);
        if (i == 2) {
            d6 = Math.min(d6, d7);
            if (d6 > 1.0d) {
                d8 -= ((width2 / d6) - width) / 2.0d;
                d = (height2 / d6) - height;
            } else {
                d8 -= (width2 - (width * d6)) / 2.0d;
                d = height2 - (height * d6);
            }
            d9 -= d / 2.0d;
            d7 = d6;
        } else {
            if (!str.equals("none") && i == 0) {
                d6 = Math.min(d6, d7);
            } else {
                if (!str.equals("none") && i == 1) {
                    d6 = Math.max(d6, d7);
                }
                if (str.contains("xMid")) {
                    d8 += (width2 - (width * d6)) / 2.0d;
                }
                if (str.contains("xMax")) {
                    d8 += width2 - (width * d6);
                }
                if (str.contains("YMid")) {
                    d9 += (height2 - (height * d7)) / 2.0d;
                }
                if (str.contains("YMax")) {
                    d9 += height2 - (height * d7);
                }
            }
            d7 = d6;
            if (str.contains("xMid")) {
            }
            if (str.contains("xMax")) {
            }
            if (str.contains("YMid")) {
            }
            if (str.contains("YMax")) {
            }
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate((float) d8, (float) d9);
        matrix.preScale((float) d6, (float) d7);
        return matrix;
    }
}
