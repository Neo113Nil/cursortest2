package com.facebook.bolts;

import defpackage.lh;
import java.io.Closeable;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class CancellationTokenRegistration implements Closeable {
    private Runnable action;
    private boolean closed;
    private CancellationTokenSource tokenSource;

    public CancellationTokenRegistration(CancellationTokenSource cancellationTokenSource, Runnable runnable) {
        cancellationTokenSource.getClass();
        this.action = runnable;
        this.tokenSource = cancellationTokenSource;
    }

    private final void throwIfClosed() {
        if (this.closed) {
            lh.g("Object already closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (this.closed) {
                    return;
                }
                this.closed = true;
                CancellationTokenSource cancellationTokenSource = this.tokenSource;
                if (cancellationTokenSource != null) {
                    cancellationTokenSource.unregister$facebook_bolts_release(this);
                }
                this.tokenSource = null;
                this.action = null;
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void runAction$facebook_bolts_release() {
        synchronized (this) {
            try {
                throwIfClosed();
                Runnable runnable = this.action;
                if (runnable != null) {
                    runnable.run();
                }
                close();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
