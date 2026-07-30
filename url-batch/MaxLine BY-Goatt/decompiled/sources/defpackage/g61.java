package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface g61 extends CoroutineContext.Element {
    Object J(r30 r30Var);

    boolean b();

    void f(CancellationException cancellationException);

    ec0 o(Function1 function1);

    ec0 q(boolean z, boolean z2, rk rkVar);

    bu s(n61 n61Var);

    boolean start();

    CancellationException v();
}
