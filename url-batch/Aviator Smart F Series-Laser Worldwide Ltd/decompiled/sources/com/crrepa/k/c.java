package com.crrepa.k;

import com.crrepa.ble.util.BleLog;

/* loaded from: classes3.dex */
public class c extends a {

    /* renamed from: e, reason: collision with root package name */
    private static final int f13125e = 2;

    @Override // com.crrepa.k.a
    public int[] a(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr) || bArr.length % 2 != 0) {
            return null;
        }
        int length = bArr.length / 2;
        int[] iArr = new int[length];
        byte[] bArr2 = new byte[2];
        int i8 = 0;
        for (int i9 = 0; i9 < bArr.length && length > i8; i9 += 2) {
            System.arraycopy(bArr, i9, bArr2, 0, 2);
            int a8 = com.crrepa.g1.c.a(bArr2[1], bArr2[0]);
            BleLog.i("ecg: " + a8);
            iArr[i8] = a8;
            i8++;
        }
        return iArr;
    }
}
