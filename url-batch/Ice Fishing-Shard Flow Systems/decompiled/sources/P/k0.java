package P;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class k0 extends X5.j implements Function2 {
    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        return new k0(2, bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k0) create((q6.e) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        W5.a aVar = W5.a.f2787d;
        V6.b.P(obj);
        return Unit.f6114a;
    }
}
