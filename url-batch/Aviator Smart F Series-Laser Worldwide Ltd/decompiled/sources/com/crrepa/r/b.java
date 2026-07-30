package com.crrepa.r;

import com.crrepa.ble.util.BleLog;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f13719a = 35;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f13720b = 36;

    public static List<byte[]> a(boolean z7, byte b8, byte b9, byte b10, byte[] bArr, int i8) {
        byte[] a8 = a(z7 ? (byte) 35 : (byte) 36, b8, b9, b10, bArr);
        int length = a8.length - 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(a8, 1, bArr2, 0, length);
        c.e(z7);
        return c.d(bArr2, i8);
    }

    public static byte[] b(String str) {
        byte[] a8 = a((byte) 2, str.getBytes(StandardCharsets.UTF_8));
        BleLog.d("HisiliconCmdCreator=" + e.b(a8, a8.length));
        return a8;
    }

    public static byte[] a(byte b8, byte b9, byte b10, byte b11, byte[] bArr) {
        if (bArr.length <= 127) {
            byte length = (byte) bArr.length;
            byte[] bArr2 = new byte[bArr.length + 5];
            bArr2[0] = b8;
            bArr2[1] = b9;
            bArr2[2] = b10;
            bArr2[3] = e.a("1" + e.b(b11).substring(1));
            bArr2[4] = e.a("1" + e.b(length).substring(1));
            System.arraycopy(bArr, 0, bArr2, 5, bArr.length);
            return bArr2;
        }
        String hexString = Integer.toHexString(bArr.length);
        if (hexString.length() % 2 != 0) {
            hexString = "0" + hexString;
        }
        byte[] b12 = e.b(hexString);
        e.e(b12);
        int length2 = hexString.length() / 2;
        byte[] bArr3 = new byte[bArr.length + 5 + b12.length];
        bArr3[0] = b8;
        bArr3[1] = b9;
        bArr3[2] = b10;
        bArr3[3] = e.a("1" + e.b(b11).substring(1));
        String binaryString = Integer.toBinaryString(length2);
        int length3 = 8 - binaryString.length();
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < length3; i8++) {
            sb.append("0");
        }
        bArr3[4] = e.a(((Object) sb) + binaryString);
        System.arraycopy(b12, 0, bArr3, 5, b12.length);
        System.arraycopy(bArr, 0, bArr3, b12.length + 5, bArr.length);
        return bArr3;
    }

    public static byte[] a(byte b8, byte b9, byte[] bArr, byte[] bArr2) {
        int length = bArr2.length;
        byte[] bArr3 = new byte[length + 6];
        byte[] a8 = e.a((short) (bArr2.length + bArr.length));
        bArr3[0] = b8;
        bArr3[1] = b9;
        System.arraycopy(a8, 0, bArr3, 2, 2);
        System.arraycopy(bArr2, 0, bArr3, 4, bArr2.length);
        System.arraycopy(bArr, 0, bArr3, length + 4, bArr.length);
        return bArr3;
    }

    public static byte[] a(byte b8, byte[] bArr) {
        return a(true, (byte) 13, (byte) 1, b8, bArr);
    }

    public static byte[] a(String str) {
        return a((byte) 3, str.getBytes(StandardCharsets.UTF_8));
    }

    public static byte[] a(boolean z7, byte b8, byte b9, byte b10, byte[] bArr) {
        byte[] a8 = a(z7 ? (byte) 35 : (byte) 36, b8, b9, b10, bArr);
        return a((byte) -81, (byte) 3, e.d(a8), a8);
    }
}
