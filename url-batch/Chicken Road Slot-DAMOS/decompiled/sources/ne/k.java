package ne;

import ge.t;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k extends t {

    /* renamed from: i, reason: collision with root package name */
    public static final k f7289i = new k();

    @Override // ge.t
    public final void L(CoroutineContext coroutineContext, Runnable runnable) {
        e.f7277r.f7278i.d(runnable, true, false);
    }

    @Override // ge.t
    public final void M(CoroutineContext coroutineContext, Runnable runnable) {
        e.f7277r.f7278i.d(runnable, true, true);
    }

    @Override // ge.t
    public final t O(int i3) {
        le.b.a(i3);
        return i3 >= j.f7286d ? this : super.O(i3);
    }

    @Override // ge.t
    public final String toString() {
        return "Dispatchers.IO";
    }
}
