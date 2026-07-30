package com.realsil.sdk.dfu.model;

import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.core.utility.ByteArrayConverter;
import com.realsil.sdk.core.utility.DataConverter;
import com.realsil.sdk.dfu.i.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import y5.u;

/* loaded from: classes4.dex */
public final class ImageVersionInfoParser {
    public static List a(int i8, int i9, int i10, byte[] bArr, byte[] bArr2) {
        int i11;
        int i12;
        int i13;
        ZLogger.v(String.format("wrapperImageVersionWithBitNumber:indicator = 0x%08x, \nvalues = %s", Integer.valueOf(i10), DataConverter.bytes2Hex(bArr)));
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < 16; i16++) {
            int i17 = (i10 >> (i16 * 2)) & 3;
            if (i17 == 0) {
                ImageVersionInfo imageVersionInfo = new ImageVersionInfo(i16, i17, a.INVALID_VERSION_32, 0);
                ZLogger.v(imageVersionInfo.toString());
                arrayList.add(imageVersionInfo);
            } else {
                if (bArr == null || i14 + 3 >= bArr.length) {
                    ZLogger.v("imageVersion loss, offset=" + i14);
                    i11 = 0;
                } else {
                    if (i8 == 17 && i9 >= 5 && i16 == 2) {
                        i11 = ByteArrayConverter.toInt(bArr, i14, 1);
                        i14 += 4;
                    }
                    i11 = ByteArrayConverter.toInt(bArr, i14);
                    i14 += 4;
                }
                if (bArr2 == null || i15 + 3 >= bArr2.length) {
                    ZLogger.v("section size loss, offset=" + i15);
                    i12 = i15;
                    i13 = 0;
                } else {
                    i12 = i15 + 4;
                    i13 = ByteArrayConverter.toInt(bArr2, i15);
                }
                ImageVersionInfo imageVersionInfo2 = new ImageVersionInfo(i16, i17, i11, i13);
                ZLogger.v(imageVersionInfo2.toString());
                arrayList.add(imageVersionInfo2);
                i15 = i12;
            }
        }
        return arrayList;
    }

    public static List<ImageVersionInfo> wrapperImageVersionInfos(int i8, int i9, int i10, int i11, byte[] bArr, byte[] bArr2, boolean z7) {
        return (i8 == 20 || i8 == 21 || i8 == 22) ? a(i10, bArr, bArr2, z7) : (i8 != 17 || i9 < 6) ? (i8 != 16 || i9 < 3) ? a(i8, i9, i11, bArr, bArr2) : a(i10, bArr, bArr2, z7) : a(i10, bArr, bArr2, z7);
    }

    public static List a(int i8, byte[] bArr, byte[] bArr2, boolean z7) {
        ArrayList arrayList;
        long int64;
        if (bArr == null || bArr.length == 0) {
            ZLogger.v("imageVersionValues is empty");
            return new ArrayList();
        }
        int i9 = bArr[0] & 255;
        ZLogger.v(String.format("wrapperImageVersionWithImageId, updateBankIndicator=0x%08x, imageNum=%d,\nvalues=%s", Integer.valueOf(i8), Integer.valueOf(i9), DataConverter.bytes2Hex(bArr)));
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        int i10 = z7 ? 10 : 6;
        int i11 = 0;
        int i12 = 1;
        while (i11 < i9) {
            int i13 = i12 + i10;
            if (i13 <= bArr.length) {
                int i14 = ByteArrayConverter.toShort(bArr, i12, 0) & u.MAX_VALUE;
                if (z7) {
                    arrayList = arrayList2;
                    int64 = ByteArrayConverter.toInt64(bArr, i12 + 2, 0);
                } else if (i14 == 10128) {
                    arrayList = arrayList2;
                    int64 = ByteArrayConverter.toInt(bArr, i12 + 2, 1);
                } else {
                    arrayList = arrayList2;
                    int64 = ByteArrayConverter.toInt(bArr, i12 + 2);
                }
                hashMap.put(Integer.valueOf(i14), Long.valueOf(int64));
            } else {
                arrayList = arrayList2;
            }
            if (bArr2 != null && i12 + 6 <= bArr2.length) {
                hashMap2.put(Integer.valueOf(ByteArrayConverter.toShort(bArr2, i12, 0) & u.MAX_VALUE), Integer.valueOf(ByteArrayConverter.toInt(bArr2, i12 + 2)));
            }
            i11++;
            i12 = i13;
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = arrayList2;
        for (Integer num : hashMap.keySet()) {
            ImageVersionInfo imageVersionInfo = new ImageVersionInfo(255, i8 == 1 ? 2 : i8 == 2 ? 1 : 3, (!hashMap.containsKey(num) || hashMap.get(num) == null) ? 0L : ((Long) hashMap.get(num)).longValue(), (!hashMap2.containsKey(num) || hashMap2.get(num) == null) ? 0 : ((Integer) hashMap2.get(num)).intValue(), num.intValue());
            ZLogger.v(imageVersionInfo.toString());
            arrayList3.add(imageVersionInfo);
        }
        return arrayList3;
    }
}
