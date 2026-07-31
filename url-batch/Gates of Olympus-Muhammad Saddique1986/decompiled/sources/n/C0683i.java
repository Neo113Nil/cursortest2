package n;

import e2.InterfaceC0426e;
import n0.C0702C;
import p.E0;
import p.U0;
import q2.AbstractC0837y;

/* renamed from: n.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0683i extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f7144h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7145i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0698y f7146j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0683i(C0698y c0698y, V1.d dVar) {
        super(2, dVar);
        this.f7146j = c0698y;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0683i) o((V1.d) obj2, (C0702C) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0683i c0683i = new C0683i(this.f7146j, dVar);
        c0683i.f7145i = obj;
        return c0683i;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7144h;
        R1.y yVar = R1.y.f4171a;
        if (i3 == 0) {
            R1.a.e(obj);
            C0702C c0702c = (C0702C) this.f7145i;
            this.f7144h = 1;
            C0698y c0698y = this.f7146j;
            c0698y.getClass();
            C0697x c0697x = new C0697x(c0698y, null);
            A0.l lVar = new A0.l(23, c0698y);
            p.L l3 = U0.f7613a;
            Object e3 = AbstractC0837y.e(new E0(c0702c, c0697x, lVar, new p.T(c0702c), null), this);
            if (e3 != aVar) {
                e3 = yVar;
            }
            if (e3 != aVar) {
                e3 = yVar;
            }
            if (e3 == aVar) {
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
