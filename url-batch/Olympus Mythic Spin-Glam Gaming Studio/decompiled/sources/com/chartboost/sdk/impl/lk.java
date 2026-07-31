package com.chartboost.sdk.impl;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class lk {
    public long a;
    public int b;
    public int c;
    public long d;
    public long e;
    public long f;
    public int g;
    public final j3 h;
    public volatile long i;
    public volatile int j;

    public lk(long j, int i, int i2, long j2, long j3, long j4, int i3, j3 j3Var) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = i3;
        this.h = j3Var;
    }

    public final long b() {
        return this.a;
    }

    public final void e(long j) {
        this.e = j;
    }

    public final long e() {
        return oh.a() - this.i;
    }

    public final long d() {
        return f() - e();
    }

    public final void a() {
        xb.a("addDownloadToTimeWindow() - timeWindowStartTimeStamp " + this.i + ", timeWindowCachedVideosCount " + this.j, (Throwable) null, 2, (Object) null);
        if (this.i == 0) {
            this.i = oh.a();
        }
        this.j++;
    }

    public final boolean a(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return a(file.lastModified());
    }

    public final void d(long j) {
        this.d = j;
    }

    public final boolean g() {
        h();
        boolean z = this.j >= c();
        if (z) {
            pg.a("Video loading limit reached, will resume in timeToResetWindow: " + d());
        }
        xb.a("isMaxCountForTimeWindowReached() - " + z, (Throwable) null, 2, (Object) null);
        return z;
    }

    public final long i() {
        return f() - (oh.a() - this.i);
    }

    public final boolean b(long j) {
        return j >= this.a;
    }

    public final void h() {
        xb.a("resetWindowWhenTimeReached()", (Throwable) null, 2, (Object) null);
        if (e() > f()) {
            xb.a("resetWindowWhenTimeReached() - timer and count reset", (Throwable) null, 2, (Object) null);
            pg.a("Video loading limit reset");
            this.j = 0;
            this.i = 0L;
        }
    }

    public final void b(int i) {
        this.b = i;
    }

    public final long f() {
        j3 j3Var = this.h;
        return ((j3Var == null || !j3Var.d()) ? this.d : this.e) * 1000;
    }

    public final int c() {
        j3 j3Var = this.h;
        if (j3Var != null && j3Var.d()) {
            return this.c;
        }
        return this.b;
    }

    public final void f(long j) {
        this.f = j;
    }

    public final void c(long j) {
        this.a = j;
    }

    public final void a(int i) {
        this.g = i;
    }

    public final boolean a(long j) {
        return oh.a() - j > this.f * ((long) 1000);
    }

    public final void c(int i) {
        this.c = i;
    }
}
