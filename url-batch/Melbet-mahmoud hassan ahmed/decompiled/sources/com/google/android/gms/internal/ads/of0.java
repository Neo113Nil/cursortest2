package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class of0 {

    /* renamed from: h, reason: collision with root package name */
    public static final my3<of0> f9635h = new my3() { // from class: com.google.android.gms.internal.ads.aq
    };

    /* renamed from: a, reason: collision with root package name */
    public final long f9636a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9637b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri[] f9638c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f9639d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f9640e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9641f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f9642g;

    public of0(long j7) {
        this(0L, -1, new int[0], new Uri[0], new long[0], 0L, false);
    }

    private of0(long j7, int i7, int[] iArr, Uri[] uriArr, long[] jArr, long j8, boolean z6) {
        wu1.d(iArr.length == uriArr.length);
        this.f9636a = 0L;
        this.f9637b = i7;
        this.f9639d = iArr;
        this.f9638c = uriArr;
        this.f9640e = jArr;
        this.f9641f = 0L;
        this.f9642g = false;
    }

    public final int a(int i7) {
        int i8;
        int i9 = i7 + 1;
        while (true) {
            int[] iArr = this.f9639d;
            if (i9 >= iArr.length || (i8 = iArr[i9]) == 0 || i8 == 1) {
                break;
            }
            i9++;
        }
        return i9;
    }

    public final of0 b(int i7) {
        int[] iArr = this.f9639d;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = this.f9640e;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        return new of0(0L, 0, copyOf, (Uri[]) Arrays.copyOf(this.f9638c, 0), copyOf2, 0L, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && of0.class == obj.getClass()) {
            of0 of0Var = (of0) obj;
            if (this.f9637b == of0Var.f9637b && Arrays.equals(this.f9638c, of0Var.f9638c) && Arrays.equals(this.f9639d, of0Var.f9639d) && Arrays.equals(this.f9640e, of0Var.f9640e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f9637b * 961) + Arrays.hashCode(this.f9638c)) * 31) + Arrays.hashCode(this.f9639d)) * 31) + Arrays.hashCode(this.f9640e)) * 961;
    }
}
