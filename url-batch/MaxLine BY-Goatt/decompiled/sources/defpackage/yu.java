package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yu implements AutoCloseable, a50 {
    public final CoroutineContext m;

    public yu(CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        this.m = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        l41.t(this.m, null);
    }

    @Override // defpackage.a50
    public final CoroutineContext n() {
        return this.m;
    }
}
