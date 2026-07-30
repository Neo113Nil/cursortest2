package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public long f27090a;

    /* renamed from: b, reason: collision with root package name */
    public long f27091b;

    /* renamed from: c, reason: collision with root package name */
    public long f27092c;

    /* renamed from: d, reason: collision with root package name */
    public long f27093d;

    /* renamed from: e, reason: collision with root package name */
    public long f27094e;

    /* renamed from: f, reason: collision with root package name */
    public long f27095f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f27096g = new boolean[15];

    /* renamed from: h, reason: collision with root package name */
    public int f27097h;

    public final void a() {
        this.f27093d = 0L;
        this.f27094e = 0L;
        this.f27095f = 0L;
        this.f27097h = 0;
        Arrays.fill(this.f27096g, false);
    }

    public final boolean b() {
        return this.f27093d > 15 && this.f27097h == 0;
    }

    public final void c(long j9) {
        long j10 = this.f27093d;
        if (j10 == 0) {
            this.f27090a = j9;
        } else if (j10 == 1) {
            long j11 = j9 - this.f27090a;
            this.f27091b = j11;
            this.f27095f = j11;
            this.f27094e = 1L;
        } else {
            long j12 = j9 - this.f27092c;
            long abs = Math.abs(j12 - this.f27091b);
            int i = (int) (j10 % 15);
            boolean[] zArr = this.f27096g;
            if (abs <= 1000000) {
                this.f27094e++;
                this.f27095f += j12;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.f27097h--;
                }
            } else if (!zArr[i]) {
                zArr[i] = true;
                this.f27097h++;
            }
        }
        this.f27093d++;
        this.f27092c = j9;
    }
}
