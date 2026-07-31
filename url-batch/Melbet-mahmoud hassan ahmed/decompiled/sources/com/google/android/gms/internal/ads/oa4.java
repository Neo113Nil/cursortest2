package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
final class oa4 {

    /* renamed from: a, reason: collision with root package name */
    private long f9583a;

    /* renamed from: b, reason: collision with root package name */
    private long f9584b;

    /* renamed from: c, reason: collision with root package name */
    private long f9585c;

    /* renamed from: d, reason: collision with root package name */
    private long f9586d;

    /* renamed from: e, reason: collision with root package name */
    private long f9587e;

    /* renamed from: f, reason: collision with root package name */
    private long f9588f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean[] f9589g = new boolean[15];

    /* renamed from: h, reason: collision with root package name */
    private int f9590h;

    public final long a() {
        long j7 = this.f9587e;
        if (j7 == 0) {
            return 0L;
        }
        return this.f9588f / j7;
    }

    public final long b() {
        return this.f9588f;
    }

    public final void c(long j7) {
        int i7;
        long j8 = this.f9586d;
        if (j8 == 0) {
            this.f9583a = j7;
        } else if (j8 == 1) {
            long j9 = j7 - this.f9583a;
            this.f9584b = j9;
            this.f9588f = j9;
            this.f9587e = 1L;
        } else {
            long j10 = j7 - this.f9585c;
            int i8 = (int) (j8 % 15);
            if (Math.abs(j10 - this.f9584b) <= 1000000) {
                this.f9587e++;
                this.f9588f += j10;
                boolean[] zArr = this.f9589g;
                if (zArr[i8]) {
                    zArr[i8] = false;
                    i7 = this.f9590h - 1;
                    this.f9590h = i7;
                }
            } else {
                boolean[] zArr2 = this.f9589g;
                if (!zArr2[i8]) {
                    zArr2[i8] = true;
                    i7 = this.f9590h + 1;
                    this.f9590h = i7;
                }
            }
        }
        this.f9586d++;
        this.f9585c = j7;
    }

    public final void d() {
        this.f9586d = 0L;
        this.f9587e = 0L;
        this.f9588f = 0L;
        this.f9590h = 0;
        Arrays.fill(this.f9589g, false);
    }

    public final boolean e() {
        long j7 = this.f9586d;
        if (j7 == 0) {
            return false;
        }
        return this.f9589g[(int) ((j7 - 1) % 15)];
    }

    public final boolean f() {
        return this.f9586d > 15 && this.f9590h == 0;
    }
}
