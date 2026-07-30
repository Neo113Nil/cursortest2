package com.baidu.platform.comapi.util;

import android.graphics.Color;

/* loaded from: classes2.dex */
public class d {
    public static int[] a(int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            return null;
        }
        int[] iArr2 = new int[iArr.length];
        for (int i8 = 0; i8 < iArr.length; i8++) {
            iArr2[i8] = Color.argb(Color.alpha(iArr[i8]), Color.blue(iArr[i8]), Color.green(iArr[i8]), Color.red(iArr[i8]));
        }
        return iArr2;
    }
}
