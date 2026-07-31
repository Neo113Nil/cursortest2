package p;

import B.C0022x;
import F.C0087c;
import e2.InterfaceC0426e;
import java.util.concurrent.CancellationException;
import n0.C0702C;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class D extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f7488h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7489i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0776m0 f7490j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0702C f7491k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ B.I f7492l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0022x f7493m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ E f7494n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ E f7495o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0087c f7496p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(C0776m0 c0776m0, C0702C c0702c, B.I i3, C0022x c0022x, E e3, E e4, C0087c c0087c, V1.d dVar) {
        super(2, dVar);
        this.f7490j = c0776m0;
        this.f7491k = c0702c;
        this.f7492l = i3;
        this.f7493m = c0022x;
        this.f7494n = e3;
        this.f7495o = e4;
        this.f7496p = c0087c;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((D) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        E e3 = this.f7495o;
        C0087c c0087c = this.f7496p;
        D d3 = new D(this.f7490j, this.f7491k, this.f7492l, this.f7493m, this.f7494n, e3, c0087c, dVar);
        d3.f7489i = obj;
        return d3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [q2.w] */
    /* JADX WARN: Type inference failed for: r2v11, types: [q2.w] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        ?? r22 = this.f7488h;
        R1.y yVar = R1.y.f4171a;
        C0776m0 c0776m0 = this.f7490j;
        try {
            if (r22 == 0) {
                R1.a.e(obj);
                InterfaceC0835w interfaceC0835w = (InterfaceC0835w) this.f7489i;
                P p3 = c0776m0.f7726s;
                C0702C c0702c = this.f7491k;
                B.I i3 = this.f7492l;
                C0022x c0022x = this.f7493m;
                E e3 = this.f7494n;
                E e4 = this.f7495o;
                C0087c c0087c = this.f7496p;
                this.f7489i = interfaceC0835w;
                this.f7488h = 1;
                float f3 = C.f7486a;
                Object g3 = n.r.g(c0702c, new C0749A(e4, new f2.t(), p3, i3, c0087c, e3, c0022x, null), this);
                r22 = g3;
                if (g3 != aVar) {
                    r22 = yVar;
                }
                if (r22 == aVar) {
                    return aVar;
                }
            } else {
                if (r22 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r22 = (InterfaceC0835w) this.f7489i;
                R1.a.e(obj);
            }
        } catch (CancellationException e5) {
            s2.g gVar = c0776m0.f7730w;
            if (gVar != null) {
                gVar.p(r.f7757a);
            }
            if (!AbstractC0837y.p(r22)) {
                throw e5;
            }
        }
        return yVar;
    }
}
