package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public interface jb0 extends CoroutineContext.Element {
    void a(CancellationException cancellationException);

    boolean b();

    rs h(Function1 function1);

    tg k(qb0 qb0Var);

    CancellationException o();

    boolean start();

    Object x(fn fnVar);

    rs z(boolean z, boolean z2, e eVar);
}
