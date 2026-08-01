package nd;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements ld.a {

    /* renamed from: d, reason: collision with root package name */
    public static final b f7244d = new b();

    @Override // ld.a
    public final CoroutineContext getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // ld.a
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
