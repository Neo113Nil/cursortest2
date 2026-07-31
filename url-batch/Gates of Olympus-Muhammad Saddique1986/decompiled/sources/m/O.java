package m;

import e2.InterfaceC0426e;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class O extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f6643h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6644i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f6645j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f6646k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ U f6647l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l0 f6648m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f6649n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(Object obj, Object obj2, U u3, l0 l0Var, float f3, V1.d dVar) {
        super(2, dVar);
        this.f6645j = obj;
        this.f6646k = obj2;
        this.f6647l = u3;
        this.f6648m = l0Var;
        this.f6649n = f3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((O) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        O o3 = new O(this.f6645j, this.f6646k, this.f6647l, this.f6648m, this.f6649n, dVar);
        o3.f6644i = obj;
        return o3;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f6643h;
        R1.y yVar = R1.y.f4171a;
        U u3 = this.f6647l;
        if (i3 == 0) {
            R1.a.e(obj);
            InterfaceC0835w interfaceC0835w = (InterfaceC0835w) this.f6644i;
            Object obj2 = this.f6645j;
            Object obj3 = this.f6646k;
            if (f2.j.a(obj2, obj3)) {
                u3.f6684n = null;
                if (f2.j.a(u3.f6673c.getValue(), obj2)) {
                    return yVar;
                }
            } else {
                U.f(u3);
            }
            boolean a3 = f2.j.a(obj2, obj3);
            float f3 = this.f6649n;
            if (!a3) {
                l0 l0Var = this.f6648m;
                l0Var.q(obj2);
                l0Var.o(0L);
                u3.f6672b.setValue(obj2);
                l0Var.j(f3);
            }
            u3.o(f3);
            if (u3.f6683m.f6337b != 0) {
                AbstractC0837y.r(interfaceC0835w, null, null, new N(u3, null), 3);
            } else {
                u3.f6682l = Long.MIN_VALUE;
            }
            this.f6643h = 1;
            if (U.j(u3, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        u3.n();
        return yVar;
    }
}
