package W2;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1341p;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class l0 extends r0 {

    /* renamed from: j, reason: collision with root package name */
    public final C2.a f4282j;

    public l0(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, false);
        this.f4282j = D2.f.a(this, this, function2);
    }

    @Override // W2.k0
    public final void a0() {
        try {
            C2.a b4 = D2.f.b(this.f4282j);
            AbstractC1341p.a aVar = AbstractC1341p.f11673d;
            b3.a.i(b4, Unit.f7487a);
        } catch (Throwable th) {
            AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
            u(AbstractC1343r.a(th));
            throw th;
        }
    }
}
