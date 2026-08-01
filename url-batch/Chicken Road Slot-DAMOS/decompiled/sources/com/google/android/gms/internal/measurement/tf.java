package com.google.android.gms.internal.measurement;

import java.io.Closeable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class tf implements Runnable, Closeable {

    /* renamed from: d, reason: collision with root package name */
    public bg f2828d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2829e = oa.f(Thread.currentThread());

    /* renamed from: i, reason: collision with root package name */
    public boolean f2830i;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2831r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f2832s;

    public tf(bg bgVar, boolean z10) {
        this.f2832s = false;
        this.f2828d = bgVar;
        this.f2832s = z10;
    }

    public final void a(f8.r rVar) {
        if (this.f2830i) {
            kotlin.collections.i0.l("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        } else if (this.f2831r) {
            kotlin.collections.i0.l("Signal is already attached to future");
        } else {
            this.f2831r = true;
            rVar.a(this, f8.d0.f4128d);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        bg bgVar = this.f2828d;
        try {
            this.f2828d = null;
            boolean z10 = this.f2831r;
            if (!z10) {
                if (this.f2830i) {
                    throw new IllegalStateException("Span was already closed!");
                }
                this.f2830i = true;
                if (this.f2829e && !z10) {
                    oa.f(Thread.currentThread());
                }
            }
            if (bgVar != null) {
                ((ff) bgVar).close();
            }
            if (this.f2832s) {
                mf.b(mf.c(), sf.f2803u);
            }
        } catch (Throwable th) {
            if (bgVar != null) {
                try {
                    ((ff) bgVar).close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        if (this.f2830i || !(z10 = this.f2831r)) {
            oa.g().post(cd.f2196i);
            return;
        }
        this.f2830i = true;
        if (!this.f2829e || z10) {
            return;
        }
        oa.f(Thread.currentThread());
    }
}
