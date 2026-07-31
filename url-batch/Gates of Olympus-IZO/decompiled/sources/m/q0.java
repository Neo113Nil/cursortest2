package m;

import I.C0089d;
import k2.AbstractC0552y;
import k2.InterfaceC0550w;

/* loaded from: classes.dex */
public final class q0 extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public float f5836e;

    /* renamed from: f, reason: collision with root package name */
    public int f5837f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f5838g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s0 f5839h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(s0 s0Var, P1.d dVar) {
        super(2, dVar);
        this.f5839h = s0Var;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        q0 q0Var = new q0(this.f5839h, dVar);
        q0Var.f5838g = obj;
        return q0Var;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((q0) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        float g3;
        InterfaceC0550w interfaceC0550w;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f5837f;
        if (i3 == 0) {
            I2.l.Q(obj);
            InterfaceC0550w interfaceC0550w2 = (InterfaceC0550w) this.f5838g;
            g3 = AbstractC0595e.g(interfaceC0550w2.u());
            interfaceC0550w = interfaceC0550w2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g3 = this.f5836e;
            interfaceC0550w = (InterfaceC0550w) this.f5838g;
            I2.l.Q(obj);
        }
        while (AbstractC0552y.o(interfaceC0550w)) {
            p0 p0Var = new p0(this.f5839h, g3);
            this.f5838g = interfaceC0550w;
            this.f5836e = g3;
            this.f5837f = 1;
            if (C0089d.F(getContext()).j(p0Var, this) == aVar) {
                return aVar;
            }
        }
        return L1.z.f2729a;
    }
}
