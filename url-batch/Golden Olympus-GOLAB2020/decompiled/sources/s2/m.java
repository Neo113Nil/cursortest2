package s2;

import kotlin.coroutines.CoroutineContext;
import t2.C3428C;

/* loaded from: classes3.dex */
final class m extends C3428C {
    public m(CoroutineContext coroutineContext, kotlin.coroutines.d dVar) {
        super(coroutineContext, dVar);
    }

    @Override // o2.D0
    public boolean M(Throwable th) {
        if (th instanceof j) {
            return true;
        }
        return G(th);
    }
}
