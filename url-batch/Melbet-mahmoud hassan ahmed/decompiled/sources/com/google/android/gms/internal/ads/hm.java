package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class hm {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f6330a = zm.l("Loader:ExtractorMediaPeriod");

    /* renamed from: b, reason: collision with root package name */
    private em<? extends fm> f6331b;

    /* renamed from: c, reason: collision with root package name */
    private IOException f6332c;

    public hm(String str) {
    }

    public final <T extends fm> long a(T t6, dm<T> dmVar, int i7) {
        Looper myLooper = Looper.myLooper();
        jm.e(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new em(this, myLooper, t6, dmVar, i7, elapsedRealtime).c(0L);
        return elapsedRealtime;
    }

    public final void f() {
        this.f6331b.a(false);
    }

    public final void g(int i7) {
        IOException iOException = this.f6332c;
        if (iOException != null) {
            throw iOException;
        }
        em<? extends fm> emVar = this.f6331b;
        if (emVar != null) {
            emVar.b(emVar.f4660h);
        }
    }

    public final void h(Runnable runnable) {
        em<? extends fm> emVar = this.f6331b;
        if (emVar != null) {
            emVar.a(true);
        }
        this.f6330a.execute(runnable);
        this.f6330a.shutdown();
    }

    public final boolean i() {
        return this.f6331b != null;
    }
}
