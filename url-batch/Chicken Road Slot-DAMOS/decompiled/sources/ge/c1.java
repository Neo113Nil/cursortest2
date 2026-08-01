package ge;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface c1 extends CoroutineContext.Element {
    k H(k1 k1Var);

    void a(CancellationException cancellationException);

    boolean d();

    m0 o(Function1 function1);

    boolean start();

    m0 u(boolean z10, boolean z11, f1 f1Var);

    Object w(ld.a aVar);

    CancellationException x();
}
