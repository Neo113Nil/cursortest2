package com.yandex.mobile.ads.impl;

import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class bq {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f23890a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f23891b = {"", "A", "B", "C"};

    public static String a(int i4, boolean z4, int i5, int i6, int[] iArr, int i7) {
        Object[] objArr = {f23891b[i4], Integer.valueOf(i5), Integer.valueOf(i6), Character.valueOf(z4 ? 'H' : 'L'), Integer.valueOf(i7)};
        int i8 = u82.f32873a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i9 = 0; i9 < length; i9++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i9])));
        }
        return sb.toString();
    }

    public static byte[] a(byte[] bArr, int i4, int i5) {
        byte[] bArr2 = new byte[i5 + 4];
        System.arraycopy(f23890a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i4, bArr2, 4, i5);
        return bArr2;
    }

    public static boolean a(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }
}
