package P;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class E extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public Throwable f1964d;

    /* renamed from: e, reason: collision with root package name */
    public int f1965e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ boolean f1966i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Q f1967l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1968m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(Q q4, int i2, V5.b bVar) {
        super(2, bVar);
        this.f1967l = q4;
        this.f1968m = i2;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        E e7 = new E(this.f1967l, this.f1968m, bVar);
        e7.f1966i = ((Boolean) obj).booleanValue();
        return e7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((E) create(bool, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        int i2;
        boolean z7;
        m0 m0Var;
        boolean z8;
        W5.a aVar = W5.a.f2787d;
        boolean z9 = this.f1965e;
        Q q4 = this.f1967l;
        try {
        } catch (Throwable th2) {
            if (z9 != 0) {
                l0 g7 = q4.g();
                this.f1964d = th2;
                this.f1966i = z9;
                this.f1965e = 2;
                Integer a7 = g7.a();
                if (a7 != aVar) {
                    z7 = z9;
                    th = th2;
                    obj = a7;
                }
            } else {
                boolean z10 = z9;
                th = th2;
                i2 = this.f1968m;
                z7 = z10;
            }
        }
        if (z9 == 0) {
            V6.b.P(obj);
            boolean z11 = this.f1966i;
            this.f1966i = z11;
            this.f1965e = 1;
            obj = Q.f(q4, z11, this);
            z9 = z11;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (z9 != 1) {
                if (z9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z7 = this.f1966i;
                th = this.f1964d;
                V6.b.P(obj);
                i2 = ((Number) obj).intValue();
                e0 e0Var = new e0(th, i2);
                z8 = z7;
                m0Var = e0Var;
                return new Pair(m0Var, Boolean.valueOf(z8));
            }
            boolean z12 = this.f1966i;
            V6.b.P(obj);
            z9 = z12;
        }
        m0Var = (m0) obj;
        z8 = z9;
        return new Pair(m0Var, Boolean.valueOf(z8));
    }
}
