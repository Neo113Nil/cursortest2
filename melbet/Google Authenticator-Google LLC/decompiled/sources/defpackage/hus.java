package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class hus extends huo implements AutoCloseable, hvl {
    protected hus() {
    }

    @Override // defpackage.huo, java.util.concurrent.ExecutorService
    /* renamed from: bw */
    public final hvi submit(Runnable runnable) {
        return e().submit(runnable);
    }

    @Override // defpackage.huo, java.util.concurrent.ExecutorService
    /* renamed from: bx */
    public final hvi submit(Callable callable) {
        return e().submit(callable);
    }

    @Override // defpackage.huo, java.util.concurrent.ExecutorService
    /* renamed from: by */
    public final hvi submit(Runnable runnable, Object obj) {
        return e().submit(runnable, obj);
    }

    @Override // defpackage.huo, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        a.d(this);
    }

    protected abstract hvl e();

    @Override // defpackage.huo
    protected /* bridge */ /* synthetic */ ExecutorService g() {
        throw null;
    }
}
