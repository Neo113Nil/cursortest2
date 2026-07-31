package u1;

import e2.InterfaceC0426e;
import m.C0613I;
import m.Q;
import m.U;
import m.l0;
import q2.InterfaceC0835w;
import t1.C1028h;

/* loaded from: classes.dex */
public final class u extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f9641h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f9642i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ U f9643j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1028h f9644k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(float f3, U u3, C1028h c1028h, V1.d dVar) {
        super(2, dVar);
        this.f9642i = f3;
        this.f9643j = u3;
        this.f9644k = c1028h;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((u) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new u(this.f9642i, this.f9643j, this.f9644k, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r9 == r0) goto L27;
     */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        Object a3;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f9641h;
        R1.y yVar = R1.y.f4171a;
        U u3 = this.f9643j;
        float f3 = this.f9642i;
        if (i3 == 0) {
            R1.a.e(obj);
            if (f3 > 0.0f) {
                this.f9641h = 1;
                if (u3.m(f3, u3.f6672b.getValue(), this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                R1.a.e(obj);
                return yVar;
            }
            R1.a.e(obj);
        }
        if (f3 == 0.0f) {
            this.f9641h = 2;
            l0 l0Var = u3.f6675e;
            if (l0Var != null) {
                Object value = u3.f6673c.getValue();
                C1028h c1028h = this.f9644k;
                if (!f2.j.a(value, c1028h) || !f2.j.a(u3.f6672b.getValue(), c1028h)) {
                    a3 = C0613I.a(u3.f6681k, new Q(u3, c1028h, l0Var, null), this);
                }
            }
            a3 = yVar;
            if (a3 == aVar) {
                return aVar;
            }
        }
        return yVar;
    }
}
