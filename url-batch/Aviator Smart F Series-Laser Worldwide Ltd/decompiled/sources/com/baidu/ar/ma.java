package com.baidu.ar;

/* loaded from: classes.dex */
public class ma {

    /* renamed from: b, reason: collision with root package name */
    public long f2800b;

    /* renamed from: a, reason: collision with root package name */
    public int f2799a = 100;

    /* renamed from: c, reason: collision with root package name */
    public long f2801c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2802d = false;

    public ma(long j8) {
        this.f2800b = j8;
    }

    public int a(long j8) {
        long j9 = this.f2800b;
        if (j9 == 0) {
            return 0;
        }
        if (this.f2801c == 0) {
            return 0;
        }
        return (int) (((j8 - r4) * this.f2799a) / j9);
    }

    public void b(long j8) {
        this.f2801c = j8;
        this.f2802d = true;
    }

    public boolean a() {
        return this.f2802d;
    }
}
