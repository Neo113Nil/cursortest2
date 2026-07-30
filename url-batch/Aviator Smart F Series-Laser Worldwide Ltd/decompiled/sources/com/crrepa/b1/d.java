package com.crrepa.b1;

import android.graphics.Bitmap;
import com.crrepa.ble.util.BleLog;
import com.crrepa.g1.n;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class d extends com.crrepa.l0.b {

    /* renamed from: n, reason: collision with root package name */
    private static final int f10863n = 30;

    /* renamed from: o, reason: collision with root package name */
    private static final int f10864o = 65535;

    /* renamed from: p, reason: collision with root package name */
    private static final int f10865p = 255;

    /* JADX WARN: Removed duplicated region for block: B:16:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private byte[] a(Bitmap bitmap) {
        byte[] bArr;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        boolean z7 = width >= 30;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (int i8 = 0; i8 < height; i8++) {
            int a8 = n.a(bitmap.getPixel(0, i8));
            arrayList.add(Integer.valueOf(a8));
            int i9 = 0;
            int i10 = 1;
            for (int i11 = 1; i11 < width; i11++) {
                int a9 = n.a(bitmap.getPixel(i11, i8));
                arrayList.add(Integer.valueOf(a9));
                if (a9 == a8) {
                    i10++;
                    if (255 < i10) {
                        arrayList2.add(Integer.valueOf(a8));
                        arrayList3.add(255);
                        i9 += 3;
                    }
                    if (i11 != width - 1) {
                        arrayList2.add(Integer.valueOf(a8));
                        arrayList3.add(Integer.valueOf(i10));
                        i9 += 3;
                    }
                } else {
                    arrayList2.add(Integer.valueOf(a8));
                    arrayList3.add(Integer.valueOf(i10));
                    i9 += 3;
                    a8 = a9;
                }
                i10 = 1;
                if (i11 != width - 1) {
                }
            }
            arrayList4.add(Integer.valueOf(i9));
        }
        int i12 = (height * 2) + 2;
        int i13 = i12;
        int i14 = 0;
        while (true) {
            if (i14 >= height) {
                break;
            }
            i13 += ((Integer) arrayList4.get(i14)).intValue();
            if (65535 < i13) {
                z7 = false;
                break;
            }
            i14++;
        }
        BleLog.d("totalLength: " + i13);
        if (!z7 || i13 >= width * height * 2) {
            bArr = new byte[arrayList.size() * 2];
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                byte[] b8 = com.crrepa.g1.c.b(((Integer) arrayList.get(i15)).intValue());
                int i16 = i15 * 2;
                bArr[i16] = b8[0];
                bArr[i16 + 1] = b8[1];
            }
        } else {
            bArr = new byte[i13];
            bArr[0] = 8;
            bArr[1] = 33;
            for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                byte[] b9 = com.crrepa.g1.c.b(((Integer) arrayList4.get(i17)).intValue());
                int i18 = i17 * 2;
                bArr[i18 + 2] = b9[0];
                bArr[i18 + 3] = b9[1];
            }
            for (int i19 = 0; i19 < arrayList2.size(); i19++) {
                byte[] b10 = com.crrepa.g1.c.b(((Integer) arrayList2.get(i19)).intValue());
                int i20 = (i19 * 3) + i12;
                bArr[i20] = b10[0];
                bArr[i20 + 1] = b10[1];
                bArr[i20 + 2] = (byte) ((Integer) arrayList3.get(i19)).intValue();
            }
        }
        return bArr;
    }

    @Override // com.crrepa.l0.b
    public byte[] b(boolean z7, Bitmap[] bitmapArr) {
        byte[] bArr = null;
        if (bitmapArr != null && bitmapArr.length >= 1) {
            ArrayList<byte[]> arrayList = new ArrayList();
            int i8 = 0;
            for (Bitmap bitmap : bitmapArr) {
                if (bitmap != null) {
                    byte[] a8 = a(bitmap);
                    i8 += a8.length;
                    arrayList.add(a8);
                }
            }
            if (i8 == 0) {
                return null;
            }
            bArr = new byte[i8];
            int i9 = 0;
            for (byte[] bArr2 : arrayList) {
                int length = bArr2.length;
                System.arraycopy(bArr2, 0, bArr, i9, length);
                i9 = length;
            }
        }
        return bArr;
    }
}
