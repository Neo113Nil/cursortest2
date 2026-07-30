package s6;

import kotlin.coroutines.CoroutineContext;
import n6.AbstractC0768a;
import n6.AbstractC0792z;

/* loaded from: classes.dex */
public class q extends AbstractC0768a implements X5.d {

    /* renamed from: l, reason: collision with root package name */
    public final V5.b f7852l;

    public q(V5.b bVar, CoroutineContext coroutineContext) {
        super(coroutineContext, true);
        this.f7852l = bVar;
    }

    @Override // n6.f0
    public final boolean H() {
        return true;
    }

    @Override // X5.d
    public final X5.d getCallerFrame() {
        V5.b bVar = this.f7852l;
        if (bVar instanceof X5.d) {
            return (X5.d) bVar;
        }
        return null;
    }

    @Override // n6.f0
    public void l(Object obj) {
        AbstractC0898a.g(W5.d.b(this.f7852l), AbstractC0792z.m(obj));
    }

    @Override // n6.f0
    public void m(Object obj) {
        this.f7852l.resumeWith(AbstractC0792z.m(obj));
    }
}
