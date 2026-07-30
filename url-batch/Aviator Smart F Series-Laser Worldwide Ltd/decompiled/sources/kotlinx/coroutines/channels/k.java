package kotlinx.coroutines.channels;

import kotlinx.coroutines.internal.d0;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.o;

/* loaded from: classes5.dex */
final class k implements l2 {
    public final o cont;

    public k(o oVar) {
        this.cont = oVar;
    }

    @Override // kotlinx.coroutines.l2
    public void invokeOnCancellation(d0 d0Var, int i8) {
        this.cont.invokeOnCancellation(d0Var, i8);
    }
}
