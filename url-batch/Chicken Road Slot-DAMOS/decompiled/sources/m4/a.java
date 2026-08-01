package m4;

import ge.a0;
import ge.x;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements AutoCloseable, x {

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineContext f6553d;

    public a(CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        this.f6553d = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        a0.g(this.f6553d, null);
    }

    @Override // ge.x
    public final CoroutineContext h() {
        return this.f6553d;
    }
}
