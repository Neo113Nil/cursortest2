package d1;

import b1.j;
import b1.k;

/* renamed from: d1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0099g extends AbstractC0093a {
    public AbstractC0099g(b1.d dVar) {
        super(dVar);
        if (dVar != null && dVar.h() != k.f2050a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // b1.d
    public final j h() {
        return k.f2050a;
    }
}
