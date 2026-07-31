package E;

import k2.InterfaceC0550w;
import m.C0593d;
import m.x0;

/* loaded from: classes.dex */
public final class E extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f614e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ G f615f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f616g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0 f617h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(G g3, float f3, x0 x0Var, P1.d dVar) {
        super(2, dVar);
        this.f615f = g3;
        this.f616g = f3;
        this.f617h = x0Var;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new E(this.f615f, this.f616g, this.f617h, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((E) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f614e;
        if (i3 == 0) {
            I2.l.Q(obj);
            C0593d c0593d = (C0593d) this.f615f.f623c;
            Float f3 = new Float(this.f616g);
            this.f614e = 1;
            if (C0593d.c(c0593d, f3, this.f617h, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        return L1.z.f2729a;
    }
}
