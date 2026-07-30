package com.crrepa.b1;

import android.graphics.Bitmap;
import com.crrepa.ble.util.BleLog;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class a extends com.crrepa.l0.b {
    @Override // com.crrepa.l0.b
    protected byte[] a(boolean z7, Bitmap[] bitmapArr) {
        ArrayList<byte[]> arrayList = new ArrayList();
        int i8 = 0;
        for (Bitmap bitmap : bitmapArr) {
            if (bitmap != null) {
                byte[] c8 = b4.b.b(bitmap).c();
                if (!com.crrepa.g1.c.h(c8)) {
                    BleLog.d("bitmapBytes len: " + c8.length);
                    int length = c8.length + 72;
                    byte[] bArr = new byte[length];
                    bArr[0] = 66;
                    bArr[1] = 77;
                    byte[] b8 = com.crrepa.g1.c.b(r8 + 70);
                    System.arraycopy(b8, 0, bArr, 2, b8.length);
                    int length2 = b8.length;
                    bArr[length2 + 6] = 70;
                    bArr[length2 + 10] = 56;
                    int i9 = length2 + 14;
                    byte[] b9 = com.crrepa.g1.c.b(bitmap.getWidth());
                    System.arraycopy(b9, 0, bArr, i9, b9.length);
                    int length3 = i9 + b9.length;
                    byte[] b10 = com.crrepa.g1.c.b(bitmap.getHeight());
                    System.arraycopy(b10, 0, bArr, length3, b10.length);
                    int length4 = length3 + b10.length;
                    bArr[length4] = 1;
                    bArr[length4 + 2] = 16;
                    bArr[length4 + 4] = 3;
                    int i10 = length4 + 8;
                    byte[] b11 = com.crrepa.g1.c.b(bitmap.getHeight() * bitmap.getWidth() * 2);
                    System.arraycopy(b11, 0, bArr, i10, b11.length);
                    int length5 = i10 + b11.length;
                    bArr[length5 + 17] = -8;
                    bArr[length5 + 20] = -32;
                    bArr[length5 + 21] = 7;
                    bArr[length5 + 24] = 31;
                    byte[] bArr2 = new byte[70];
                    System.arraycopy(bArr, 0, bArr2, 0, 70);
                    BleLog.d("headBytes: " + com.crrepa.g1.c.c(bArr2));
                    System.arraycopy(c8, 0, bArr, 70, c8.length);
                    arrayList.add(bArr);
                    BleLog.d("bmpBytes len: " + length);
                    i8 += length;
                }
            }
        }
        byte[] bArr3 = new byte[i8];
        int i11 = 0;
        for (byte[] bArr4 : arrayList) {
            int length6 = bArr4.length;
            System.arraycopy(bArr4, 0, bArr3, i11, length6);
            i11 = length6;
        }
        return bArr3;
    }

    @Override // com.crrepa.l0.b
    public byte[] b(boolean z7, Bitmap[] bitmapArr) {
        if (bitmapArr == null || bitmapArr.length < 1) {
            return null;
        }
        return a(z7, bitmapArr);
    }
}
