package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class f23 extends t40 {
    public static final f23 o = new f23();

    @Override // defpackage.t40
    public final void N(CoroutineContext coroutineContext, Runnable runnable) {
        t80.p.o.f(runnable, true, false);
    }

    @Override // defpackage.t40
    public final void O(CoroutineContext coroutineContext, Runnable runnable) {
        t80.p.o.f(runnable, true, true);
    }

    @Override // defpackage.t40
    public final t40 Q(int i) {
        l41.u(i);
        return i >= rt2.d ? this : super.Q(i);
    }

    @Override // defpackage.t40
    public final String toString() {
        return "Dispatchers.IO";
    }
}
