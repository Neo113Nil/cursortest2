package androidx.lifecycle;

import java.io.Closeable;
import kotlin.coroutines.CoroutineContext;
import o2.B0;
import o2.InterfaceC3316J;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1337c implements Closeable, InterfaceC3316J, AutoCloseable {

    /* renamed from: b, reason: collision with root package name */
    private final CoroutineContext f12636b;

    public C1337c(CoroutineContext coroutineContext) {
        this.f12636b = coroutineContext;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        B0.d(n(), null, 1, null);
    }

    @Override // o2.InterfaceC3316J
    public CoroutineContext n() {
        return this.f12636b;
    }
}
