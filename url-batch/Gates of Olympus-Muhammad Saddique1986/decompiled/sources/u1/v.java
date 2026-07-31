package u1;

import F.C0131y0;
import I.C0148f0;
import e2.InterfaceC0426e;
import h1.C0480D;
import m.AbstractC0620e;
import m.C0613I;
import m.U;
import m.l0;
import m.t0;
import q2.InterfaceC0835w;
import t1.C1028h;

/* loaded from: classes.dex */
public final class v extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f9645h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f9646i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ U f9647j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1028h f9648k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0 f9649l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(U u3, C1028h c1028h, l0 l0Var, V1.d dVar) {
        super(2, dVar);
        this.f9647j = u3;
        this.f9648k = c1028h;
        this.f9649l = l0Var;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((v) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        v vVar = new v(this.f9647j, this.f9648k, this.f9649l, dVar);
        vVar.f9646i = obj;
        return vVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (r15 == r0) goto L17;
     */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        Object a3;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f9645h;
        R1.y yVar = R1.y.f4171a;
        if (i3 == 0) {
            R1.a.e(obj);
            InterfaceC0835w interfaceC0835w = (InterfaceC0835w) this.f9646i;
            U u3 = this.f9647j;
            Object value = u3.f6673c.getValue();
            C1028h c1028h = this.f9648k;
            if (f2.j.a(value, c1028h)) {
                long longValue = ((Number) this.f9649l.f6847l.getValue()).longValue() / 1000000;
                C0148f0 c0148f0 = u3.f6678h;
                float g3 = c0148f0.g();
                t0 j3 = AbstractC0620e.j((int) (c0148f0.g() * longValue), 0, null, 6);
                C0131y0 c0131y0 = new C0131y0(interfaceC0835w, u3, c1028h, 6);
                this.f9645h = 2;
                if (AbstractC0620e.c(g3, 0.0f, j3, c0131y0, this, 4) == aVar) {
                    return aVar;
                }
            } else {
                this.f9645h = 1;
                l0 l0Var = u3.f6675e;
                if (l0Var != null) {
                    a3 = C0613I.a(u3.f6681k, new C0480D(null, c1028h, null, u3, l0Var), this);
                }
                a3 = yVar;
                if (a3 == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i3 != 1 && i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        return yVar;
    }
}
