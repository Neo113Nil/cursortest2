package Z2;

import a3.AbstractC0429g;
import a3.C0428f;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* renamed from: Z2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0327c extends AbstractC0429g {

    /* renamed from: j, reason: collision with root package name */
    public final f1.r f4670j;

    public C0327c(f1.r rVar, CoroutineContext coroutineContext, int i2, Y2.a aVar) {
        super(coroutineContext, i2, aVar);
        this.f4670j = rVar;
    }

    @Override // a3.AbstractC0429g
    public final Object f(Y2.q qVar, C0428f c0428f) {
        Object h4 = this.f4670j.h(qVar, c0428f);
        return h4 == D2.a.f2163d ? h4 : Unit.f7487a;
    }

    @Override // a3.AbstractC0429g
    public final AbstractC0429g g(CoroutineContext coroutineContext, int i2, Y2.a aVar) {
        return new C0327c(this.f4670j, coroutineContext, i2, aVar);
    }

    @Override // a3.AbstractC0429g
    public final String toString() {
        return "block[" + this.f4670j + "] -> " + super.toString();
    }
}
