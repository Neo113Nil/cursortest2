package ge;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n1 extends kotlin.coroutines.a implements c1 {

    /* renamed from: e, reason: collision with root package name */
    public static final n1 f4381e = new n1(u.f4403e);

    @Override // ge.c1
    public final k H(k1 k1Var) {
        return o1.f4383d;
    }

    @Override // ge.c1
    public final boolean d() {
        return true;
    }

    @Override // ge.c1
    public final m0 o(Function1 function1) {
        return o1.f4383d;
    }

    @Override // ge.c1
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // ge.c1
    public final m0 u(boolean z10, boolean z11, f1 f1Var) {
        return o1.f4383d;
    }

    @Override // ge.c1
    public final Object w(ld.a aVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // ge.c1
    public final CancellationException x() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // ge.c1
    public final void a(CancellationException cancellationException) {
    }
}
