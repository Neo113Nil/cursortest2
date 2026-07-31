package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class wi {

    /* renamed from: a, reason: collision with root package name */
    public final int f13828a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f13829b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f13830c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13831d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f13832e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f13833f;

    public wi(long[] jArr, int[] iArr, int i7, long[] jArr2, int[] iArr2) {
        int length = jArr2.length;
        jm.c(iArr.length == length);
        int length2 = jArr.length;
        jm.c(length2 == length);
        jm.c(iArr2.length == length);
        this.f13829b = jArr;
        this.f13830c = iArr;
        this.f13831d = i7;
        this.f13832e = jArr2;
        this.f13833f = iArr2;
        this.f13828a = length2;
    }

    public final int a(long j7) {
        for (int c7 = zm.c(this.f13832e, j7, true, false); c7 >= 0; c7--) {
            if ((this.f13833f[c7] & 1) != 0) {
                return c7;
            }
        }
        return -1;
    }

    public final int b(long j7) {
        for (int b7 = zm.b(this.f13832e, j7, true, false); b7 < this.f13832e.length; b7++) {
            if ((this.f13833f[b7] & 1) != 0) {
                return b7;
            }
        }
        return -1;
    }
}
