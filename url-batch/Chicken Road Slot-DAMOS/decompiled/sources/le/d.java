package le;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d implements ge.x {

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineContext f5969d;

    public d(CoroutineContext coroutineContext) {
        this.f5969d = coroutineContext;
    }

    @Override // ge.x
    public final CoroutineContext h() {
        return this.f5969d;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f5969d + ')';
    }
}
