package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
final class ob3<V> implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final Future<V> f9598f;

    /* renamed from: g, reason: collision with root package name */
    final nb3<? super V> f9599g;

    ob3(Future<V> future, nb3<? super V> nb3Var) {
        this.f9598f = future;
        this.f9599g = nb3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable a7;
        Future<V> future = this.f9598f;
        if ((future instanceof uc3) && (a7 = vc3.a((uc3) future)) != null) {
            this.f9599g.b(a7);
            return;
        }
        try {
            this.f9599g.a(rb3.p(this.f9598f));
        } catch (Error e7) {
            e = e7;
            this.f9599g.b(e);
        } catch (RuntimeException e8) {
            e = e8;
            this.f9599g.b(e);
        } catch (ExecutionException e9) {
            this.f9599g.b(e9.getCause());
        }
    }

    public final String toString() {
        k43 a7 = l43.a(this);
        a7.a(this.f9599g);
        return a7.toString();
    }
}
