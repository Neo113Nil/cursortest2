package com.baidu.ar;

/* loaded from: classes.dex */
public class y3 {

    /* renamed from: a, reason: collision with root package name */
    public int f3746a;

    /* renamed from: b, reason: collision with root package name */
    public int f3747b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f3748c = 0;

    public y3(int i8) {
        this.f3746a = 33;
        if (i8 > 0) {
            this.f3746a = 1000 / i8;
        }
    }

    public boolean a() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f3748c == 0) {
            this.f3748c = currentTimeMillis;
        }
        long j8 = currentTimeMillis % 1000;
        if (currentTimeMillis / 1000 != this.f3748c / 1000) {
            this.f3748c = currentTimeMillis;
            this.f3747b = 0;
        }
        int i8 = this.f3747b;
        if (this.f3746a * i8 >= j8) {
            return false;
        }
        this.f3747b = i8 + 1;
        return true;
    }
}
