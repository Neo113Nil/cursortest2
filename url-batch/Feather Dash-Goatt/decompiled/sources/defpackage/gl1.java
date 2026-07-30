package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class gl1 extends ln {
    public static final gl1 g = new gl1();

    @Override // defpackage.ln
    public final void f(CoroutineContext coroutineContext, Runnable runnable) {
        nq.h.g.b(runnable, true, false);
    }

    @Override // defpackage.ln
    public final void g(CoroutineContext coroutineContext, Runnable runnable) {
        nq.h.g.b(runnable, true, true);
    }

    @Override // defpackage.ln
    public final ln m(int i) {
        t80.k(i);
        return i >= qg1.d ? this : super.m(i);
    }

    @Override // defpackage.ln
    public final String toString() {
        return "Dispatchers.IO";
    }
}
