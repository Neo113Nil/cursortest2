package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.lang.Exception;

/* loaded from: classes.dex */
final class b24<T extends Exception> {

    /* renamed from: a, reason: collision with root package name */
    private T f3166a;

    /* renamed from: b, reason: collision with root package name */
    private long f3167b;

    public b24(long j7) {
    }

    public final void a() {
        this.f3166a = null;
    }

    public final void b(T t6) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f3166a == null) {
            this.f3166a = t6;
            this.f3167b = 100 + elapsedRealtime;
        }
        if (elapsedRealtime < this.f3167b) {
            return;
        }
        T t7 = this.f3166a;
        this.f3166a = null;
        throw t7;
    }
}
