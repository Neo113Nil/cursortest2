package com.baidu.bbalbscesium.o;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private long f4183a;

    public b() {
        this(0L);
    }

    public long a() {
        return this.f4183a;
    }

    public void b(long j8) {
        this.f4183a = j8;
    }

    public b(long j8) {
        this.f4183a = j8;
    }

    public long a(long j8) {
        return j8 & this.f4183a;
    }

    public boolean a(long j8, long j9) {
        long j10 = this.f4183a;
        long j11 = (j8 & j9) | ((~j9) & j10);
        this.f4183a = j11;
        return (j11 ^ j10) != 0;
    }
}
