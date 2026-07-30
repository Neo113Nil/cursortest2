package com.crrepa.f;

import android.text.TextUtils;
import com.crrepa.ble.conn.bean.CRPContactInfo;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public class v {
    private v() {
    }

    public static byte[] a() {
        return g.a(-14, new byte[]{-17});
    }

    public static byte[] b() {
        return g.a(-14, new byte[]{h4.p.f16767c});
    }

    public static byte[] c() {
        return g.a(-14, new byte[]{0});
    }

    public static byte[] d() {
        return g.a(-14, new byte[]{5});
    }

    public static byte[] a(byte b8) {
        return g.a(-14, new byte[]{4, b8});
    }

    public static byte[] b(byte b8) {
        return g.a(-14, new byte[]{1, b8});
    }

    public static byte[] a(CRPContactInfo cRPContactInfo) {
        byte[] a8 = a(com.crrepa.g1.g.a().a(cRPContactInfo.getName()), Math.max(cRPContactInfo.getMaxNameLength(), 20));
        byte[] bArr = new byte[a8.length + 29];
        bArr[0] = 2;
        bArr[1] = (byte) cRPContactInfo.getId();
        bArr[2] = 1;
        bArr[3] = (byte) cRPContactInfo.getWidth();
        bArr[4] = (byte) cRPContactInfo.getHeight();
        byte[] c8 = com.crrepa.g1.c.c(cRPContactInfo.getAddress());
        System.arraycopy(c8, 0, bArr, 5, c8.length);
        System.arraycopy(a8, 0, bArr, 9, a8.length);
        byte[] a9 = a(cRPContactInfo.getNumber(), 20);
        System.arraycopy(a9, 0, bArr, a8.length + 9, a9.length);
        return g.a(-14, bArr);
    }

    private static byte[] a(String str, int i8) {
        byte[] bytes;
        byte[] bArr = new byte[i8];
        if (!TextUtils.isEmpty(str)) {
            int length = str.length();
            if (i8 < length) {
                length = i8;
            }
            do {
                bytes = str.substring(0, length).getBytes(StandardCharsets.UTF_8);
                length--;
            } while (i8 <= bytes.length);
            System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        }
        return bArr;
    }
}
