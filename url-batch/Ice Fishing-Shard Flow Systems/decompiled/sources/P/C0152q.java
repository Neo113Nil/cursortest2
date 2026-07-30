package P;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: P.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0152q extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f2147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0 f2148e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0152q(m0 m0Var, V5.b bVar) {
        super(2, bVar);
        this.f2148e = m0Var;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        C0152q c0152q = new C0152q(this.f2148e, bVar);
        c0152q.f2147d = obj;
        return c0152q;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0152q) create((m0) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        W5.a aVar = W5.a.f2787d;
        V6.b.P(obj);
        m0 m0Var = (m0) this.f2147d;
        return Boolean.valueOf((m0Var instanceof C0139d) && m0Var.f2137a <= this.f2148e.f2137a);
    }
}
