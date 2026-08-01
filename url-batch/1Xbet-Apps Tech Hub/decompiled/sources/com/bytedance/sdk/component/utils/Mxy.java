package com.bytedance.sdk.component.utils;

import com.google.common.base.Ascii;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: ImageFormatChecker.java */
/* loaded from: classes.dex */
public class Mxy {
    private static final byte[] Jd;
    private static final byte[] NB;
    private static final byte[] icD;
    private static final byte[] pvs;
    private static final byte[] sUS;
    private static final byte[] vG;
    private static final int yiw;

    static {
        byte[] bArr = {-1, -40, -1};
        pvs = bArr;
        byte[] bArr2 = {-119, 80, 78, 71, Ascii.CR, 10, Ascii.SUB, 10};
        icD = bArr2;
        byte[] bArr3 = {0, 0, 1, 0};
        vG = bArr3;
        byte[] pvs2 = pvs("BM");
        Jd = pvs2;
        NB = pvs("GIF87a");
        sUS = pvs("GIF89a");
        yiw = ((Integer) Collections.max(Arrays.asList(Integer.valueOf(bArr.length), Integer.valueOf(bArr2.length), Integer.valueOf(bArr3.length), Integer.valueOf(pvs2.length), 6))).intValue();
    }

    public static int pvs() {
        return yiw;
    }

    public static final String pvs(byte[] bArr) {
        return icD(bArr) ? "jpeg" : vG(bArr) ? "png" : Jd(bArr) ? "gif" : NB(bArr) ? "bmp" : sUS(bArr) ? "ico" : "other";
    }

    private static boolean icD(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = pvs;
        return length >= bArr2.length && pvs(bArr, bArr2);
    }

    private static boolean vG(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = icD;
        return length >= bArr2.length && pvs(bArr, bArr2);
    }

    private static boolean Jd(byte[] bArr) {
        return (bArr.length >= 6 && pvs(bArr, NB)) || pvs(bArr, sUS);
    }

    private static boolean NB(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = Jd;
        return length >= bArr2.length && pvs(bArr, bArr2);
    }

    private static boolean sUS(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = vG;
        return length >= bArr2.length && pvs(bArr, bArr2);
    }

    private static boolean pvs(byte[] bArr, byte[] bArr2) {
        return pvs(bArr, bArr2, 0);
    }

    private static boolean pvs(byte[] bArr, byte[] bArr2, int i) {
        if (bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private static byte[] pvs(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }
}
