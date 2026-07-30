package com.crrepa.k;

import com.crrepa.ble.util.BleLog;

/* loaded from: classes3.dex */
public class d extends a {

    /* renamed from: e, reason: collision with root package name */
    private static final int f13126e = 4;

    @Override // com.crrepa.k.a
    public int[] a(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr) || bArr.length % 4 != 0) {
            return null;
        }
        int length = bArr.length / 4;
        int[] iArr = new int[length];
        byte[] bArr2 = new byte[4];
        int i8 = 0;
        for (int i9 = 0; i9 < bArr.length && length > i8; i9 += 4) {
            System.arraycopy(bArr, i9, bArr2, 0, 4);
            int f8 = (int) com.crrepa.g1.c.f(bArr2);
            BleLog.i("ecg: " + f8);
            iArr[i8] = f8;
            i8++;
        }
        return iArr;
    }
}
