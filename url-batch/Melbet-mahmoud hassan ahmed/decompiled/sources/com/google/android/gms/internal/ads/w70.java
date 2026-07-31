package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class w70 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f13735a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f13736b = false;

    /* renamed from: c, reason: collision with root package name */
    private float f13737c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f13738d = new AtomicBoolean(false);

    public final synchronized float a() {
        return this.f13737c;
    }

    public final synchronized void b(boolean z6, float f7) {
        this.f13736b = z6;
        this.f13737c = f7;
    }

    public final synchronized void c(boolean z6) {
        this.f13735a = z6;
        this.f13738d.set(true);
    }

    public final synchronized boolean d() {
        return this.f13736b;
    }

    public final synchronized boolean e(boolean z6) {
        if (!this.f13738d.get()) {
            return z6;
        }
        return this.f13735a;
    }
}
