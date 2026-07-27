package l;

import G.C0205j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class Q extends E2.j implements Function1 {

    /* renamed from: k, reason: collision with root package name */
    public int f7618k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ U f7619l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f7620m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m0 f7621n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(U u4, Object obj, m0 m0Var, C2.a aVar) {
        super(1, aVar);
        this.f7619l = u4;
        this.f7620m = obj;
        this.f7621n = m0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Q(this.f7619l, this.f7620m, this.f7621n, (C2.a) obj).l(Unit.f7487a);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f7618k;
        m0 m0Var = this.f7621n;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            U u4 = this.f7619l;
            u4.w();
            u4.f7644l = Long.MIN_VALUE;
            u4.z(0.0f);
            Object value = u4.f7635c.getValue();
            Object obj2 = this.f7620m;
            boolean equals = obj2.equals(value);
            C0205j0 c0205j0 = u4.f7634b;
            float f4 = equals ? -4.0f : obj2.equals(c0205j0.getValue()) ? -5.0f : -3.0f;
            m0Var.q(obj2);
            m0Var.o(0L);
            c0205j0.setValue(obj2);
            u4.z(0.0f);
            u4.n(obj2);
            m0Var.j(f4);
            if (f4 == -3.0f) {
                this.f7618k = 1;
                if (U.u(u4, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        m0Var.i();
        return Unit.f7487a;
    }
}
