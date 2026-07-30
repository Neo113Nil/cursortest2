package com.crrepa.b1;

import android.graphics.Bitmap;
import com.crrepa.ble.util.BleLog;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class f extends com.crrepa.l0.b {
    @Override // com.crrepa.l0.b
    protected byte[] a(boolean z7, Bitmap[] bitmapArr) {
        ArrayList<byte[]> arrayList = new ArrayList();
        int i8 = 0;
        for (Bitmap bitmap : bitmapArr) {
            if (bitmap != null) {
                byte[] c8 = b4.b.a(bitmap).c();
                if (!com.crrepa.g1.c.h(c8)) {
                    BleLog.d("bitmapBytes len: " + c8.length);
                    int length = c8.length + 8;
                    byte[] bArr = new byte[length];
                    byte[] a8 = com.crrepa.g1.c.a(bitmap.getWidth());
                    System.arraycopy(a8, 0, bArr, 2, a8.length);
                    byte[] a9 = com.crrepa.g1.c.a(bitmap.getHeight());
                    System.arraycopy(a9, 0, bArr, 4, a9.length);
                    System.arraycopy(c8, 0, bArr, 8, c8.length);
                    arrayList.add(bArr);
                    BleLog.d("bitmapBytes len: " + length);
                    i8 += length;
                }
            }
        }
        byte[] bArr2 = new byte[i8];
        int i9 = 0;
        for (byte[] bArr3 : arrayList) {
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i9, length2);
            i9 = length2;
        }
        return bArr2;
    }

    @Override // com.crrepa.l0.b
    public byte[] b(boolean z7, Bitmap[] bitmapArr) {
        if (bitmapArr == null || bitmapArr.length < 1) {
            return null;
        }
        return a(z7, bitmapArr);
    }
}
