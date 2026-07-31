package F;

import e2.InterfaceC0426e;
import java.util.ArrayList;
import q2.InterfaceC0835w;
import t2.C1034E;

/* renamed from: F.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0092e0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f1520h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f1521i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q.k f1522j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0100i0 f1523k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0092e0(q.k kVar, C0100i0 c0100i0, V1.d dVar) {
        super(2, dVar);
        this.f1522j = kVar;
        this.f1523k = c0100i0;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0092e0) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0092e0 c0092e0 = new C0092e0(this.f1522j, this.f1523k, dVar);
        c0092e0.f1521i = obj;
        return c0092e0;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f1520h;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
            return R1.y.f4171a;
        }
        R1.a.e(obj);
        InterfaceC0835w interfaceC0835w = (InterfaceC0835w) this.f1521i;
        ArrayList arrayList = new ArrayList();
        C1034E c1034e = this.f1522j.f7843a;
        C0090d0 c0090d0 = new C0090d0(arrayList, interfaceC0835w, this.f1523k, 0);
        this.f1520h = 1;
        c1034e.getClass();
        C1034E.m(c1034e, c0090d0, this);
        return aVar;
    }
}
