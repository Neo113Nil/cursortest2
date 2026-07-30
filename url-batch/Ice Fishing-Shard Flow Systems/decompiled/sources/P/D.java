package P;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class D extends X5.j implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public Throwable f1961d;

    /* renamed from: e, reason: collision with root package name */
    public int f1962e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Q f1963i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(Q q4, V5.b bVar) {
        super(1, bVar);
        this.f1963i = q4;
    }

    @Override // X5.a
    public final V5.b create(V5.b bVar) {
        return new D(this.f1963i, bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((D) create((V5.b) obj)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        m0 m0Var;
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f1962e;
        Q q4 = this.f1963i;
        try {
        } catch (Throwable th2) {
            l0 g7 = q4.g();
            this.f1961d = th2;
            this.f1962e = 2;
            Integer a7 = g7.a();
            if (a7 != aVar) {
                th = th2;
                obj = a7;
            }
        }
        if (i2 == 0) {
            V6.b.P(obj);
            this.f1962e = 1;
            obj = Q.f(q4, true, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = this.f1961d;
                V6.b.P(obj);
                m0Var = new e0(th, ((Number) obj).intValue());
                return new Pair(m0Var, Boolean.TRUE);
            }
            V6.b.P(obj);
        }
        m0Var = (m0) obj;
        return new Pair(m0Var, Boolean.TRUE);
    }
}
