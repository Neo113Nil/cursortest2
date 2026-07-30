package n6;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import s6.AbstractC0898a;

/* loaded from: classes.dex */
public final class g0 extends l0 {

    /* renamed from: l, reason: collision with root package name */
    public final V5.b f7058l;

    public g0(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, false);
        this.f7058l = W5.d.a(function2, this, this);
    }

    @Override // n6.f0
    public final void P() {
        try {
            V5.b b7 = W5.d.b(this.f7058l);
            R5.l lVar = R5.n.f2421d;
            AbstractC0898a.g(b7, Unit.f6114a);
        } catch (Throwable th) {
            R5.l lVar2 = R5.n.f2421d;
            resumeWith(V6.b.n(th));
            throw th;
        }
    }
}
