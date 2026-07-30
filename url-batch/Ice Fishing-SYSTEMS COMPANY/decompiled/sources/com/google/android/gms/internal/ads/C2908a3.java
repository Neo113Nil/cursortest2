package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.a3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2908a3 {

    /* renamed from: a, reason: collision with root package name */
    public final X2 f29163a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29164b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f29165c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f29166d;

    /* renamed from: e, reason: collision with root package name */
    public final int f29167e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f29168f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f29169g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f29170h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f29171j;

    public C2908a3(X2 x22, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, int[] iArr3, boolean z8, long j9, int i4) {
        int length = iArr.length;
        int length2 = jArr2.length;
        PA.n(length == length2);
        PA.n(jArr.length == length2);
        int length3 = iArr2.length;
        PA.n(length3 == length2);
        this.f29163a = x22;
        this.f29165c = jArr;
        this.f29166d = iArr;
        this.f29167e = i;
        this.f29168f = jArr2;
        this.f29169g = iArr2;
        this.f29170h = iArr3;
        this.f29171j = z8;
        this.i = j9;
        this.f29164b = i4;
        if (length3 > 0) {
            int i9 = length3 - 1;
            iArr2[i9] = iArr2[i9] | 536870912;
        }
    }

    public final int a(long j9) {
        boolean z8 = this.f29171j;
        int i = 0;
        long[] jArr = this.f29168f;
        if (z8) {
            return AbstractC3548lu.s(jArr, j9, false);
        }
        int[] iArr = this.f29170h;
        int length = iArr.length - 1;
        int i4 = -1;
        while (i <= length) {
            int i9 = ((length - i) / 2) + i;
            if (jArr[iArr[i9]] <= j9) {
                i = i9 + 1;
                i4 = i9;
            } else {
                length = i9 - 1;
            }
        }
        if (i4 == -1) {
            return -1;
        }
        long j10 = jArr[iArr[i4]];
        if (j10 == j9) {
            while (i4 > 0) {
                int i10 = i4 - 1;
                if (jArr[iArr[i10]] != j10) {
                    break;
                }
                i4 = i10;
            }
        }
        return iArr[i4];
    }

    public final int b(long j9) {
        boolean z8 = this.f29171j;
        long[] jArr = this.f29168f;
        if (z8) {
            String str = AbstractC3548lu.f32613a;
            int binarySearch = Arrays.binarySearch(jArr, j9);
            if (binarySearch < 0) {
                return ~binarySearch;
            }
            while (true) {
                int i = binarySearch + 1;
                if (i >= jArr.length || jArr[i] != j9) {
                    break;
                }
                binarySearch = i;
            }
            return binarySearch;
        }
        int[] iArr = this.f29170h;
        int length = iArr.length - 1;
        int i4 = 0;
        int i9 = -1;
        while (i4 <= length) {
            int i10 = ((length - i4) / 2) + i4;
            if (jArr[iArr[i10]] >= j9) {
                length = i10 - 1;
                i9 = i10;
            } else {
                i4 = i10 + 1;
            }
        }
        if (i9 == -1) {
            return -1;
        }
        long j10 = jArr[iArr[i9]];
        if (j10 == j9) {
            while (i9 < iArr.length - 1) {
                int i11 = i9 + 1;
                if (jArr[iArr[i11]] != j10) {
                    break;
                }
                i9 = i11;
            }
        }
        return iArr[i9];
    }
}
