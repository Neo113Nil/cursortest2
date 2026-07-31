package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zw1 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f15276a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f15277b = {"", "A", "B", "C"};

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f15278c = 0;

    public static String a(int i7, int i8, int i9) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9));
    }

    public static String b(int i7, boolean z6, int i8, int i9, int[] iArr, int i10) {
        Object[] objArr = new Object[5];
        objArr[0] = f15277b[i7];
        objArr[1] = Integer.valueOf(i8);
        objArr[2] = Integer.valueOf(i9);
        objArr[3] = Character.valueOf(true != z6 ? 'L' : 'H');
        objArr[4] = Integer.valueOf(i10);
        StringBuilder sb = new StringBuilder(n13.d("hvc1.%s%d.%X.%c%d", objArr));
        int i11 = 6;
        while (i11 > 0) {
            int i12 = i11 - 1;
            if (iArr[i12] != 0) {
                break;
            }
            i11 = i12;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i13])));
        }
        return sb.toString();
    }

    public static byte[] c(byte[] bArr, int i7, int i8) {
        byte[] bArr2 = new byte[i8 + 4];
        System.arraycopy(f15276a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i7, bArr2, 4, i8);
        return bArr2;
    }
}
