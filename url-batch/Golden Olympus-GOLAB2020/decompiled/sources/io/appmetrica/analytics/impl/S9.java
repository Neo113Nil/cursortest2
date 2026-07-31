package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public final class S9 {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f38250a;

    /* renamed from: b, reason: collision with root package name */
    public final C2984ta f38251b;

    public S9(Context context, String str) {
        this(new ReentrantLock(), new C2984ta(context, str));
    }

    public final void a() {
        this.f38250a.lock();
        this.f38251b.a();
    }

    public final void b() {
        this.f38251b.b();
        this.f38250a.unlock();
    }

    public final void c() {
        C2984ta c2984ta = this.f38251b;
        synchronized (c2984ta) {
            c2984ta.b();
            c2984ta.f39849a.delete();
        }
        this.f38250a.unlock();
    }

    public S9(ReentrantLock reentrantLock, C2984ta c2984ta) {
        this.f38250a = reentrantLock;
        this.f38251b = c2984ta;
    }
}
