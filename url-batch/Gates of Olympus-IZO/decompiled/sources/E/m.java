package E;

import k2.InterfaceC0550w;
import m.AbstractC0595e;
import m.AbstractC0614y;
import m.C0593d;
import m.x0;

/* loaded from: classes.dex */
public final class m extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f672e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f673f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q qVar, P1.d dVar) {
        super(2, dVar);
        this.f673f = qVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new m(this.f673f, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((m) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f672e;
        if (i3 == 0) {
            I2.l.Q(obj);
            C0593d c0593d = this.f673f.f687h;
            Float f3 = new Float(1.0f);
            x0 i4 = AbstractC0595e.i(225, 0, AbstractC0614y.f5882c, 2);
            this.f672e = 1;
            if (C0593d.c(c0593d, f3, i4, this) == aVar) {
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
