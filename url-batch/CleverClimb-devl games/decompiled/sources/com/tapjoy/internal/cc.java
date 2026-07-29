package com.tapjoy.internal;

import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class cc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final ca f7882a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final cf f7883b;

    protected cc(ca caVar, @Nullable cf cfVar) {
        this.f7882a = caVar;
        this.f7883b = cfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Object f = this.f7882a.f();
            if (this.f7883b == null || (this.f7883b instanceof cg)) {
                return;
            }
            this.f7883b.a(this.f7882a, f);
        } catch (Throwable unused) {
            if (this.f7883b == null || (this.f7883b instanceof cg)) {
                return;
            }
            this.f7883b.a(this.f7882a);
        }
    }
}
