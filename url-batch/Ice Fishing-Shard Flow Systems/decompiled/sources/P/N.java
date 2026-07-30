package P;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class N extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f2003d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f2004e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Q f2005i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(Q q4, V5.b bVar) {
        super(2, bVar);
        this.f2005i = q4;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        N n7 = new N(this.f2005i, bVar);
        n7.f2004e = obj;
        return n7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((N) create((d0) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f2003d;
        if (i2 == 0) {
            V6.b.P(obj);
            d0 d0Var = (d0) this.f2004e;
            this.f2003d = 1;
            if (Q.c(this.f2005i, d0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
        }
        return Unit.f6114a;
    }
}
