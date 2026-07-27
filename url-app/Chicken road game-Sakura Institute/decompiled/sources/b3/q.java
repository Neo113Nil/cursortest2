package b3;

import W2.AbstractC0275a;
import W2.AbstractC0295q;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public class q extends AbstractC0275a implements E2.d {

    /* renamed from: j, reason: collision with root package name */
    public final C2.a f5684j;

    public q(C2.a aVar, CoroutineContext coroutineContext) {
        super(coroutineContext, true);
        this.f5684j = aVar;
    }

    @Override // W2.k0
    public void A(Object obj) {
        a.i(D2.f.b(this.f5684j), AbstractC0295q.a(obj));
    }

    @Override // W2.k0
    public void B(Object obj) {
        this.f5684j.u(AbstractC0295q.a(obj));
    }

    @Override // W2.k0
    public final boolean T() {
        return true;
    }

    @Override // E2.d
    public final E2.d e() {
        C2.a aVar = this.f5684j;
        if (aVar instanceof E2.d) {
            return (E2.d) aVar;
        }
        return null;
    }
}
