package com.crrepa.u;

import android.text.TextUtils;
import com.crrepa.ble.util.BleLog;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class a {
    private a() {
    }

    public static List<byte[]> a(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int c8 = com.crrepa.l.a.b().c() - 15;
        com.crrepa.r.c.e(true);
        if (bArr.length <= c8) {
            arrayList.add(com.crrepa.r.c.b(bArr));
        } else {
            arrayList.addAll(com.crrepa.r.c.a(bArr, c8));
        }
        return arrayList;
    }

    private static byte[] a(byte b8, byte[] bArr) {
        return com.crrepa.r.b.a(true, (byte) 13, (byte) 4, b8, bArr);
    }

    public static byte[] a(String str) {
        String str2;
        BleLog.d("ipAddress: " + str);
        if (TextUtils.isEmpty(str)) {
            str2 = "ipAddress is empty";
        } else {
            byte[] bArr = new byte[4];
            String[] split = str.split("\\.");
            if (4 == split.length) {
                for (int i8 = 0; i8 < 4; i8++) {
                    bArr[i8] = (byte) Integer.parseInt(split[i8], 10);
                }
                BleLog.d("address bytes: " + com.crrepa.g1.c.c(bArr));
                return a((byte) 2, bArr);
            }
            str2 = "ipAddress error";
        }
        BleLog.e(str2);
        return null;
    }

    public static byte[] a(k4.a aVar) {
        byte[] bArr = new byte[8];
        int b8 = aVar.b();
        byte[] b9 = com.crrepa.g1.c.b(!aVar.c() ? aVar.a() : 0);
        System.arraycopy(b9, 0, bArr, 0, b9.length);
        byte[] b10 = com.crrepa.g1.c.b(b8);
        System.arraycopy(b10, 0, bArr, b9.length, b10.length);
        return a((byte) 3, bArr);
    }

    public static byte[] a(boolean z7) {
        return a((byte) 1, new byte[]{z7 ? (byte) 1 : (byte) 0});
    }
}
