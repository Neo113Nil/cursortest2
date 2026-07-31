package x;

import C0.C0025a;
import e2.InterfaceC0426e;
import n0.C0702C;
import p.C0749A;
import p.C0799z;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class T extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f10003h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0702C f10004i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Z f10005j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(C0702C c0702c, Z z3, V1.d dVar) {
        super(2, dVar);
        this.f10004i = c0702c;
        this.f10005j = z3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((T) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new T(this.f10004i, this.f10005j, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f10003h;
        R1.y yVar = R1.y.f4171a;
        if (i3 == 0) {
            R1.a.e(obj);
            this.f10003h = 1;
            Z z3 = this.f10005j;
            B.B b3 = new B.B(z3, 1);
            V v3 = new V(z3, 0);
            V v4 = new V(z3, 1);
            C0025a c0025a = new C0025a(13, z3);
            float f3 = p.C.f7486a;
            Object g3 = n.r.g(this.f10004i, new C0749A(C0799z.f7814e, new f2.t(), null, new B.h0(4, b3), c0025a, v4, new A0.l(27, v3), null), this);
            if (g3 != aVar) {
                g3 = yVar;
            }
            if (g3 != aVar) {
                g3 = yVar;
            }
            if (g3 != aVar) {
                g3 = yVar;
            }
            if (g3 == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        return yVar;
    }
}
