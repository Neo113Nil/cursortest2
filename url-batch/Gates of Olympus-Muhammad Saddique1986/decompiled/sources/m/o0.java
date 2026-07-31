package m;

import e2.InterfaceC0426e;
import q2.C0821h;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class o0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public y2.a f6861h;

    /* renamed from: i, reason: collision with root package name */
    public s0 f6862i;

    /* renamed from: j, reason: collision with root package name */
    public int f6863j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ s0 f6864k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(s0 s0Var, V1.d dVar) {
        super(2, dVar);
        this.f6864k = s0Var;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((o0) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new o0(this.f6864k, dVar);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [R1.f, java.lang.Object] */
    @Override // X1.a
    public final Object q(Object obj) {
        s0 s0Var;
        Object obj2;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f6863j;
        if (i3 == 0) {
            R1.a.e(obj);
            s0 s0Var2 = this.f6864k;
            U u3 = (U) s0Var2;
            u3.getClass();
            ((S.w) r0.f6876a.getValue()).c(u3, c0.f6737h, u3.f6677g);
            y2.c cVar = u3.f6680j;
            this.f6861h = cVar;
            this.f6862i = s0Var2;
            this.f6863j = 1;
            if (cVar.c(null, this) == aVar) {
                return aVar;
            }
            s0Var = s0Var2;
            obj2 = cVar;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s0Var = this.f6862i;
            Object obj3 = this.f6861h;
            R1.a.e(obj);
            obj2 = obj3;
        }
        try {
            ((U) s0Var).f6674d = s0Var.b();
            C0821h c0821h = ((U) s0Var).f6679i;
            if (c0821h != null) {
                c0821h.u(s0Var.b());
            }
            ((U) s0Var).f6679i = null;
            ((y2.c) obj2).e(null);
            return R1.y.f4171a;
        } catch (Throwable th) {
            ((y2.c) obj2).e(null);
            throw th;
        }
    }
}
