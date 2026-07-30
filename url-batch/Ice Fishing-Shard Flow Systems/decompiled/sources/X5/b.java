package X5;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class b implements V5.b {

    /* renamed from: d, reason: collision with root package name */
    public static final b f2885d = new b();

    @Override // V5.b
    public final CoroutineContext getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // V5.b
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
