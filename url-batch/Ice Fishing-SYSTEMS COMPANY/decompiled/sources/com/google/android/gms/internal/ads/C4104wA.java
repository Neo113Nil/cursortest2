package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.wA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4104wA {

    /* renamed from: a, reason: collision with root package name */
    public final Dy f34953a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f34954b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public long f34955c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f34956d = -1;

    /* renamed from: e, reason: collision with root package name */
    public Throwable f34957e = null;

    /* renamed from: f, reason: collision with root package name */
    public final int f34958f;

    public C4104wA(int i, Dy dy) {
        this.f34958f = i;
        this.f34953a = dy;
    }

    public final void a() {
        if (this.f34954b.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f34955c = SystemClock.uptimeMillis();
    }

    public final void b(Throwable th) {
        if (this.f34954b.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f34957e = th;
    }

    public final void c() {
        AtomicBoolean atomicBoolean = this.f34954b;
        if (atomicBoolean.getAndSet(true)) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f34956d = SystemClock.uptimeMillis();
        ((Hy) this.f34953a).b(this.f34958f - 1, atomicBoolean.get() ? this.f34956d - this.f34955c : -1L, this.f34957e, null);
    }
}
