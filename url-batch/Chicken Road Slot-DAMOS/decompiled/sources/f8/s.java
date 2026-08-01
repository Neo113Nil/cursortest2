package f8;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s extends u {
    @Override // f8.u
    public final Object q(Object obj, Object obj2) {
        z zVar = (z) obj;
        ListenableFuture apply = zVar.apply(obj2);
        i7.a.x(apply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zVar);
        return apply;
    }

    @Override // f8.u
    public final void r(Object obj) {
        n((ListenableFuture) obj);
    }
}
