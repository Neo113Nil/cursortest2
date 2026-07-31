package m;

import I.C0156j0;
import e2.InterfaceC0424c;

/* loaded from: classes.dex */
public final class Q extends X1.i implements InterfaceC0424c {

    /* renamed from: h, reason: collision with root package name */
    public int f6656h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ U f6657i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f6658j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l0 f6659k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(U u3, Object obj, l0 l0Var, V1.d dVar) {
        super(1, dVar);
        this.f6657i = u3;
        this.f6658j = obj;
        this.f6659k = l0Var;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        return new Q(this.f6657i, this.f6658j, this.f6659k, (V1.d) obj).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f6656h;
        l0 l0Var = this.f6659k;
        if (i3 == 0) {
            R1.a.e(obj);
            U u3 = this.f6657i;
            u3.l();
            u3.f6682l = Long.MIN_VALUE;
            u3.o(0.0f);
            Object value = u3.f6673c.getValue();
            Object obj2 = this.f6658j;
            boolean equals = obj2.equals(value);
            C0156j0 c0156j0 = u3.f6672b;
            float f3 = equals ? -4.0f : obj2.equals(c0156j0.getValue()) ? -5.0f : -3.0f;
            l0Var.q(obj2);
            l0Var.o(0L);
            c0156j0.setValue(obj2);
            u3.o(0.0f);
            u3.c(obj2);
            l0Var.j(f3);
            if (f3 == -3.0f) {
                this.f6656h = 1;
                if (U.j(u3, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        l0Var.i();
        return R1.y.f4171a;
    }
}
