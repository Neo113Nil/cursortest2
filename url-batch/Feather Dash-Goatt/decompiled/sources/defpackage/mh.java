package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class mh implements AutoCloseable, sn {
    public final CoroutineContext d;

    public mh(CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        this.d = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        t80.j(this.d, null);
    }

    @Override // defpackage.sn
    public final CoroutineContext f() {
        return this.d;
    }
}
