package com.crrepa.f;

import com.crrepa.ble.conn.bean.CRPWatchFaceLayoutInfo;
import com.crrepa.ble.util.BleLog;

/* loaded from: classes3.dex */
public class l2 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f12652a = 37;

    private l2() {
    }

    public static byte[] a() {
        return g.a(57, null);
    }

    public static byte[] a(CRPWatchFaceLayoutInfo cRPWatchFaceLayoutInfo) {
        byte[] bArr = new byte[37];
        bArr[0] = (byte) cRPWatchFaceLayoutInfo.getTimePosition();
        bArr[1] = (byte) cRPWatchFaceLayoutInfo.getTimeTopContent();
        bArr[2] = (byte) cRPWatchFaceLayoutInfo.getTimeBottomContent();
        int a8 = com.crrepa.g1.n.a(cRPWatchFaceLayoutInfo.getTextColor());
        BleLog.i("colorInt: " + a8);
        byte[] b8 = com.crrepa.g1.c.b(a8);
        System.arraycopy(b8, 0, bArr, 3, b8.length);
        byte[] bArr2 = new byte[32];
        String backgroundPictureMd5 = cRPWatchFaceLayoutInfo.getBackgroundPictureMd5();
        int length = backgroundPictureMd5.length();
        for (int i8 = 0; i8 < length; i8++) {
            bArr2[i8] = com.crrepa.g1.c.a(backgroundPictureMd5.charAt(i8));
        }
        System.arraycopy(bArr2, 0, bArr, 5, length);
        return g.a(56, bArr);
    }
}
