package o;

import F.C0060q;
import F.D0;
import java.util.concurrent.CancellationException;
import k2.AbstractC0552y;
import k2.InterfaceC0550w;

/* renamed from: o.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0747x extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6653e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f6654f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g0 f6655g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.v f6656h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ J0.b f6657i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ D0 f6658j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0748y f6659k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0748y f6660l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0060q f6661m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0747x(g0 g0Var, n0.v vVar, J0.b bVar, D0 d02, C0748y c0748y, C0748y c0748y2, C0060q c0060q, P1.d dVar) {
        super(2, dVar);
        this.f6655g = g0Var;
        this.f6656h = vVar;
        this.f6657i = bVar;
        this.f6658j = d02;
        this.f6659k = c0748y;
        this.f6660l = c0748y2;
        this.f6661m = c0060q;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0748y c0748y = this.f6660l;
        C0060q c0060q = this.f6661m;
        C0747x c0747x = new C0747x(this.f6655g, this.f6656h, this.f6657i, this.f6658j, this.f6659k, c0748y, c0060q, dVar);
        c0747x.f6654f = obj;
        return c0747x;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0747x) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [k2.w] */
    /* JADX WARN: Type inference failed for: r2v11, types: [k2.w] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        ?? r22 = this.f6653e;
        L1.z zVar = L1.z.f2729a;
        g0 g0Var = this.f6655g;
        try {
            if (r22 == 0) {
                I2.l.Q(obj);
                InterfaceC0550w interfaceC0550w = (InterfaceC0550w) this.f6654f;
                J j3 = g0Var.f6522s;
                n0.v vVar = this.f6656h;
                J0.b bVar = this.f6657i;
                D0 d02 = this.f6658j;
                C0748y c0748y = this.f6659k;
                C0748y c0748y2 = this.f6660l;
                C0060q c0060q = this.f6661m;
                this.f6654f = interfaceC0550w;
                this.f6653e = 1;
                float f3 = AbstractC0746w.f6648a;
                Object J3 = g2.i.J(vVar, new C0745v(c0748y2, new Z1.s(), j3, bVar, c0060q, c0748y, d02, null), this);
                r22 = J3;
                if (J3 != aVar) {
                    r22 = zVar;
                }
                if (r22 == aVar) {
                    return aVar;
                }
            } else {
                if (r22 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r22 = (InterfaceC0550w) this.f6654f;
                I2.l.Q(obj);
            }
        } catch (CancellationException e3) {
            m2.e eVar = g0Var.f6526w;
            if (eVar != null) {
                eVar.g(C0741q.f6608a);
            }
            if (!AbstractC0552y.o(r22)) {
                throw e3;
            }
        }
        return zVar;
    }
}
