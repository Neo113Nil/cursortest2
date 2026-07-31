package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bm1;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* loaded from: classes3.dex */
final class cm1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01c1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ArrayList<bm1.a> a(sf1 sf1Var) {
        char c4;
        ArrayList<bm1.a> arrayList;
        boolean z4;
        int i4;
        ArrayList<bm1.a> arrayList2;
        Object aVar;
        sf1 sf1Var2 = sf1Var;
        ArrayList<bm1.a> arrayList3 = null;
        if (sf1Var2.t() != 0) {
            return null;
        }
        char c5 = 7;
        sf1Var2.f(7);
        int h4 = sf1Var2.h();
        boolean z5 = true;
        if (h4 == 1684433976) {
            sf1 sf1Var3 = new sf1();
            Inflater inflater = new Inflater(true);
            try {
                if (!u82.a(sf1Var2, sf1Var3, inflater)) {
                    return null;
                }
                inflater.end();
                sf1Var2 = sf1Var3;
            } finally {
                inflater.end();
            }
        } else if (h4 != 1918990112) {
            return null;
        }
        ArrayList<bm1.a> arrayList4 = new ArrayList<>();
        int d4 = sf1Var2.d();
        int e4 = sf1Var2.e();
        while (d4 < e4) {
            int h5 = sf1Var2.h() + d4;
            if (h5 <= d4 || h5 > e4) {
                return arrayList3;
            }
            if (sf1Var2.h() == 1835365224) {
                int h6 = sf1Var2.h();
                if (h6 <= 10000) {
                    float[] fArr = new float[h6];
                    for (int i5 = 0; i5 < h6; i5++) {
                        fArr[i5] = Float.intBitsToFloat(sf1Var2.h());
                    }
                    int h7 = sf1Var2.h();
                    if (h7 <= 32000) {
                        double log = Math.log(2.0d);
                        c4 = c5;
                        ArrayList<bm1.a> arrayList5 = arrayList3;
                        int ceil = (int) Math.ceil(Math.log(h6 * 2.0d) / log);
                        z4 = z5;
                        byte[] c6 = sf1Var2.c();
                        rf1 rf1Var = new rf1(c6.length, c6);
                        rf1Var.c(sf1Var2.d() * 8);
                        float[] fArr2 = new float[h7 * 5];
                        int i6 = 5;
                        int[] iArr = new int[5];
                        arrayList2 = arrayList5;
                        int i7 = 0;
                        int i8 = 0;
                        while (true) {
                            if (i7 < h7) {
                                int i9 = 0;
                                while (i9 < i6) {
                                    int i10 = iArr[i9];
                                    int b4 = rf1Var.b(ceil);
                                    int i11 = i10 + ((b4 >> 1) ^ (-(b4 & 1)));
                                    if (i11 >= h6 || i11 < 0) {
                                        break;
                                    }
                                    fArr2[i8] = fArr[i11];
                                    iArr[i9] = i11;
                                    i9++;
                                    i8++;
                                    i6 = 5;
                                }
                                i7++;
                                i6 = 5;
                            } else {
                                rf1Var.c((rf1Var.e() + 7) & (-8));
                                int i12 = 32;
                                int b5 = rf1Var.b(32);
                                bm1.b[] bVarArr = new bm1.b[b5];
                                int i13 = 0;
                                while (i13 < b5) {
                                    int b6 = rf1Var.b(8);
                                    int b7 = rf1Var.b(8);
                                    int b8 = rf1Var.b(i12);
                                    if (b8 <= 128000) {
                                        int i14 = b5;
                                        float[] fArr3 = fArr2;
                                        int ceil2 = (int) Math.ceil(Math.log(h7 * 2.0d) / log);
                                        float[] fArr4 = new float[b8 * 3];
                                        float[] fArr5 = new float[b8 * 2];
                                        i4 = e4;
                                        int i15 = 0;
                                        int i16 = 0;
                                        while (i15 < b8) {
                                            int b9 = rf1Var.b(ceil2);
                                            rf1 rf1Var2 = rf1Var;
                                            int i17 = i16 + ((b9 >> 1) ^ (-(b9 & 1)));
                                            if (i17 >= 0 && i17 < h7) {
                                                int i18 = i15 * 3;
                                                int i19 = i17 * 5;
                                                fArr4[i18] = fArr3[i19];
                                                fArr4[i18 + 1] = fArr3[i19 + 1];
                                                fArr4[i18 + 2] = fArr3[i19 + 2];
                                                int i20 = i15 * 2;
                                                fArr5[i20] = fArr3[i19 + 3];
                                                fArr5[i20 + 1] = fArr3[i19 + 4];
                                                i15++;
                                                i16 = i17;
                                                rf1Var = rf1Var2;
                                            }
                                        }
                                        bVarArr[i13] = new bm1.b(b6, fArr4, fArr5, b7);
                                        i13++;
                                        b5 = i14;
                                        fArr2 = fArr3;
                                        e4 = i4;
                                        rf1Var = rf1Var;
                                        i12 = 32;
                                    }
                                }
                                i4 = e4;
                                aVar = new bm1.a(bVarArr);
                                arrayList = arrayList2;
                            }
                        }
                        i4 = e4;
                        aVar = arrayList2;
                        arrayList = arrayList2;
                        if (aVar != null) {
                            return arrayList;
                        }
                        arrayList4.add(aVar);
                    }
                }
                c4 = c5;
                arrayList2 = arrayList3;
                z4 = z5;
                i4 = e4;
                aVar = arrayList2;
                arrayList = arrayList2;
                if (aVar != null) {
                }
            } else {
                c4 = c5;
                arrayList = arrayList3;
                z4 = z5;
                i4 = e4;
            }
            sf1Var2.e(h5);
            d4 = h5;
            c5 = c4;
            z5 = z4;
            arrayList3 = arrayList;
            e4 = i4;
        }
        return arrayList4;
    }

    public static bm1 a(int i4, byte[] bArr) {
        ArrayList<bm1.a> arrayList;
        int h4;
        sf1 sf1Var = new sf1(bArr);
        try {
            sf1Var.f(4);
            h4 = sf1Var.h();
            sf1Var.e(0);
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        if (h4 == 1886547818) {
            sf1Var.f(8);
            int d4 = sf1Var.d();
            int e4 = sf1Var.e();
            while (d4 < e4) {
                int h5 = sf1Var.h() + d4;
                if (h5 <= d4 || h5 > e4) {
                    break;
                }
                int h6 = sf1Var.h();
                if (h6 != 2037673328 && h6 != 1836279920) {
                    sf1Var.e(h5);
                    d4 = h5;
                }
                sf1Var.d(h5);
                arrayList = a(sf1Var);
                break;
            }
            arrayList = null;
        } else {
            arrayList = a(sf1Var);
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size == 1) {
            bm1.a aVar = arrayList.get(0);
            return new bm1(aVar, aVar, i4);
        }
        if (size != 2) {
            return null;
        }
        return new bm1(arrayList.get(0), arrayList.get(1), i4);
    }
}
