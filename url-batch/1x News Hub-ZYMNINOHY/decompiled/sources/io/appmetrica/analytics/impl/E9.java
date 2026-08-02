package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class E9 {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f5956a;

    /* renamed from: b, reason: collision with root package name */
    public final C0488fa f5957b;

    public E9(Context context, String str) {
        this(new ReentrantLock(), new C0488fa(context, str));
    }

    public final void a() {
        this.f5956a.lock();
        this.f5957b.a();
    }

    public final void b() {
        this.f5957b.b();
        this.f5956a.unlock();
    }

    public final void c() {
        C0488fa c0488fa = this.f5957b;
        synchronized (c0488fa) {
            c0488fa.b();
            c0488fa.f7310a.delete();
        }
        this.f5956a.unlock();
    }

    public E9(ReentrantLock reentrantLock, C0488fa c0488fa) {
        this.f5956a = reentrantLock;
        this.f5957b = c0488fa;
    }
}
