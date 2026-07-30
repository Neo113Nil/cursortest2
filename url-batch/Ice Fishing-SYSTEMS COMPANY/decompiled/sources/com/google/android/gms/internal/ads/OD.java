package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class OD implements J3.a {

    /* renamed from: u, reason: collision with root package name */
    public static final OD f26665u = new OD(null);

    /* renamed from: v, reason: collision with root package name */
    public static final RD f26666v = new RD(OD.class);

    /* renamed from: n, reason: collision with root package name */
    public final Object f26667n;

    public OD(Object obj) {
        this.f26667n = obj;
    }

    @Override // J3.a
    public final void c(Runnable runnable, Executor executor) {
        PA.X(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e6) {
            Logger a9 = f26666v.a();
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            a9.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", com.anythink.basead.b.c.i.q(new StringBuilder(valueOf.length() + 57 + valueOf2.length()), "RuntimeException while executing runnable ", valueOf, " with executor ", valueOf2), (Throwable) e6);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z8) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f26667n;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f26667n);
        return com.anythink.basead.b.c.i.q(new StringBuilder(String.valueOf(obj).length() + 25 + valueOf.length() + 2), obj, "[status=SUCCESS, result=[", valueOf, "]]");
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j9, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f26667n;
    }
}
