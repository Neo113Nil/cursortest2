package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: io.appmetrica.analytics.impl.x9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1075x9 {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f13020a;

    /* renamed from: b, reason: collision with root package name */
    public final Y9 f13021b;

    public C1075x9(Context context, String str) {
        this(new ReentrantLock(), new Y9(context, str));
    }

    public final void a() {
        this.f13020a.lock();
        this.f13021b.a();
    }

    public final void b() {
        this.f13021b.b();
        this.f13020a.unlock();
    }

    public final void c() {
        Y9 y9 = this.f13021b;
        synchronized (y9) {
            y9.b();
            y9.f11296a.delete();
        }
        this.f13020a.unlock();
    }

    public C1075x9(ReentrantLock reentrantLock, Y9 y9) {
        this.f13020a = reentrantLock;
        this.f13021b = y9;
    }
}
