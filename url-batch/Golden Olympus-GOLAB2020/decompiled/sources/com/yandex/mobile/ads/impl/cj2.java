package com.yandex.mobile.ads.impl;

import android.util.Pair;

/* loaded from: classes3.dex */
final class cj2 {

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f24229a;

        /* renamed from: b, reason: collision with root package name */
        public final long f24230b;

        private a(int i4, long j4) {
            this.f24229a = i4;
            this.f24230b = j4;
        }

        public static a a(lz lzVar, sf1 sf1Var) {
            lzVar.b(sf1Var.c(), 0, 8, false);
            sf1Var.e(0);
            return new a(sf1Var.h(), sf1Var.n());
        }
    }

    public static boolean a(lz lzVar) {
        sf1 sf1Var = new sf1(8);
        int i4 = a.a(lzVar, sf1Var).f24229a;
        if (i4 != 1380533830 && i4 != 1380333108) {
            return false;
        }
        lzVar.b(sf1Var.c(), 0, 4, false);
        sf1Var.e(0);
        int h4 = sf1Var.h();
        if (h4 == 1463899717) {
            return true;
        }
        ms0.b("WavHeaderReader", "Unsupported form type: " + h4);
        return false;
    }

    public static bj2 b(lz lzVar) {
        byte[] bArr;
        sf1 sf1Var = new sf1(16);
        a a4 = a(1718449184, lzVar, sf1Var);
        if (a4.f24230b < 16) {
            throw new IllegalStateException();
        }
        lzVar.b(sf1Var.c(), 0, 16, false);
        sf1Var.e(0);
        int o4 = sf1Var.o();
        int o5 = sf1Var.o();
        int k4 = sf1Var.k();
        if (k4 < 0) {
            throw new IllegalStateException(C1877de.a("Top bit not zero: ", k4));
        }
        int k5 = sf1Var.k();
        if (k5 < 0) {
            throw new IllegalStateException(C1877de.a("Top bit not zero: ", k5));
        }
        int o6 = sf1Var.o();
        int o7 = sf1Var.o();
        int i4 = ((int) a4.f24230b) - 16;
        if (i4 > 0) {
            bArr = new byte[i4];
            lzVar.b(bArr, 0, i4, false);
        } else {
            bArr = u82.f32878f;
        }
        byte[] bArr2 = bArr;
        lzVar.a((int) (lzVar.d() - lzVar.a()));
        return new bj2(o4, o5, k4, o6, o7, bArr2);
    }

    public static Pair c(lz lzVar) {
        lzVar.c();
        a a4 = a(1684108385, lzVar, new sf1(8));
        lzVar.a(8);
        return Pair.create(Long.valueOf(lzVar.a()), Long.valueOf(a4.f24230b));
    }

    private static a a(int i4, lz lzVar, sf1 sf1Var) {
        a a4 = a.a(lzVar, sf1Var);
        while (a4.f24229a != i4) {
            ms0.d("WavHeaderReader", "Ignoring unknown WAV chunk: " + a4.f24229a);
            long j4 = a4.f24230b + 8;
            if (j4 <= 2147483647L) {
                lzVar.a((int) j4);
                a4 = a.a(lzVar, sf1Var);
            } else {
                throw wf1.a("Chunk is too large (~2GB+) to skip; id: " + a4.f24229a);
            }
        }
        return a4;
    }
}
