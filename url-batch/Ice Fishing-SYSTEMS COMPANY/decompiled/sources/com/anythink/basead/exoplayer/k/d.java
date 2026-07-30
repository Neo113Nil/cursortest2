package com.anythink.basead.exoplayer.k;

import android.util.Pair;
import java.util.ArrayList;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    private static final int f8528b = 15;

    /* renamed from: d, reason: collision with root package name */
    private static final int f8530d = -1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f8532f = 2;

    /* renamed from: g, reason: collision with root package name */
    private static final int f8533g = 5;

    /* renamed from: h, reason: collision with root package name */
    private static final int f8534h = 22;
    private static final int i = 29;

    /* renamed from: j, reason: collision with root package name */
    private static final int f8535j = 31;

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f8527a = {0, 0, 0, 1};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f8529c = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f8531e = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    private d() {
    }

    public static Pair<Integer, Integer> a(byte[] bArr) {
        r rVar = new r(bArr);
        int b9 = b(rVar);
        int c4 = c(rVar);
        int c9 = rVar.c(4);
        if (b9 == 5 || b9 == 29) {
            c4 = c(rVar);
            if (b(rVar) == 22) {
                c9 = rVar.c(4);
            }
        }
        int i4 = f8531e[c9];
        C0544a.a(i4 != -1);
        return Pair.create(Integer.valueOf(c4), Integer.valueOf(i4));
    }

    private static byte[] b(int i4, int i9) {
        return new byte[]{(byte) (((i4 >> 1) & 7) | 16), (byte) (((i4 << 7) & 128) | ((i9 << 3) & 120))};
    }

    private static int c(r rVar) {
        int c4 = rVar.c(4);
        if (c4 == 15) {
            return rVar.c(24);
        }
        C0544a.a(c4 < 13);
        return f8529c[c4];
    }

    private static byte[][] b(byte[] bArr) {
        if (!b(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        do {
            arrayList.add(Integer.valueOf(i4));
            i4 = a(bArr, i4 + f8527a.length);
        } while (i4 != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i9 = 0;
        while (i9 < arrayList.size()) {
            int intValue = ((Integer) arrayList.get(i9)).intValue();
            int intValue2 = (i9 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i9 + 1)).intValue() : bArr.length) - intValue;
            byte[] bArr3 = new byte[intValue2];
            System.arraycopy(bArr, intValue, bArr3, 0, intValue2);
            bArr2[i9] = bArr3;
            i9++;
        }
        return bArr2;
    }

    private static Pair<Integer, Integer> a(r rVar) {
        int b9 = b(rVar);
        int c4 = c(rVar);
        int c9 = rVar.c(4);
        if (b9 == 5 || b9 == 29) {
            c4 = c(rVar);
            if (b(rVar) == 22) {
                c9 = rVar.c(4);
            }
        }
        int i4 = f8531e[c9];
        C0544a.a(i4 != -1);
        return Pair.create(Integer.valueOf(c4), Integer.valueOf(i4));
    }

    private static boolean b(byte[] bArr, int i4) {
        if (bArr.length - i4 <= f8527a.length) {
            return false;
        }
        int i9 = 0;
        while (true) {
            byte[] bArr2 = f8527a;
            if (i9 >= bArr2.length) {
                return true;
            }
            if (bArr[i4 + i9] != bArr2[i9]) {
                return false;
            }
            i9++;
        }
    }

    private static int b(r rVar) {
        int c4 = rVar.c(5);
        return c4 == 31 ? rVar.c(6) + 32 : c4;
    }

    private static byte[] a(int i4, int i9) {
        int i10 = -1;
        int i11 = 0;
        while (true) {
            int[] iArr = f8529c;
            if (i11 >= iArr.length) {
                break;
            }
            if (i4 == iArr[i11]) {
                i10 = i11;
            }
            i11++;
        }
        int i12 = -1;
        int i13 = 0;
        while (true) {
            int[] iArr2 = f8531e;
            if (i13 >= iArr2.length) {
                break;
            }
            if (i9 == iArr2[i13]) {
                i12 = i13;
            }
            i13++;
        }
        if (i4 != -1 && i12 != -1) {
            return new byte[]{(byte) (((i10 >> 1) & 7) | 16), (byte) (((i10 << 7) & 128) | ((i12 << 3) & 120))};
        }
        throw new IllegalArgumentException(AbstractC5051n.c(i4, i9, "Invalid sample rate or number of channels: ", ", "));
    }

    public static byte[] a(byte[] bArr, int i4, int i9) {
        byte[] bArr2 = f8527a;
        byte[] bArr3 = new byte[bArr2.length + i9];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i4, bArr3, bArr2.length, i9);
        return bArr3;
    }

    private static int a(byte[] bArr, int i4) {
        int length = bArr.length - f8527a.length;
        while (i4 <= length) {
            if (b(bArr, i4)) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    private static void a(r rVar, int i4, int i9) {
        rVar.b(1);
        if (rVar.d()) {
            rVar.b(14);
        }
        boolean d2 = rVar.d();
        if (i9 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i4 == 6 || i4 == 20) {
            rVar.b(3);
        }
        if (d2) {
            if (i4 == 22) {
                rVar.b(16);
            }
            if (i4 == 17 || i4 == 19 || i4 == 20 || i4 == 23) {
                rVar.b(3);
            }
            rVar.b(1);
        }
    }
}
