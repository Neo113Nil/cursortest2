package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes.dex */
public final class km {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f7537a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f7538b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f7539c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static Pair<Integer, Integer> a(byte[] bArr) {
        qm qmVar = new qm(bArr, bArr.length);
        int c7 = c(qmVar);
        int d7 = d(qmVar);
        int a7 = qmVar.a(4);
        if (c7 == 5 || c7 == 29) {
            d7 = d(qmVar);
            if (c(qmVar) == 22) {
                a7 = qmVar.a(4);
            }
        }
        int i7 = f7539c[a7];
        jm.c(i7 != -1);
        return Pair.create(Integer.valueOf(d7), Integer.valueOf(i7));
    }

    public static byte[] b(byte[] bArr, int i7, int i8) {
        byte[] bArr2 = new byte[i8 + 4];
        System.arraycopy(f7537a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i7, bArr2, 4, i8);
        return bArr2;
    }

    private static int c(qm qmVar) {
        int a7 = qmVar.a(5);
        return a7 == 31 ? qmVar.a(6) + 32 : a7;
    }

    private static int d(qm qmVar) {
        int a7 = qmVar.a(4);
        if (a7 == 15) {
            return qmVar.a(24);
        }
        jm.c(a7 < 13);
        return f7538b[a7];
    }
}
