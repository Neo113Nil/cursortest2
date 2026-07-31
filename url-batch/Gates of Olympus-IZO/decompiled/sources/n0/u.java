package n0;

import L1.z;
import k2.InterfaceC0550w;

/* loaded from: classes.dex */
public final class u extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6259e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v f6260f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, P1.d dVar) {
        super(2, dVar);
        this.f6260f = vVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new u(this.f6260f, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((u) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(z.f2729a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [R1.i, Y1.e] */
    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6259e;
        if (i3 == 0) {
            I2.l.Q(obj);
            v vVar = this.f6260f;
            ?? r12 = vVar.f6264t;
            this.f6259e = 1;
            if (r12.g(vVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        return z.f2729a;
    }
}
