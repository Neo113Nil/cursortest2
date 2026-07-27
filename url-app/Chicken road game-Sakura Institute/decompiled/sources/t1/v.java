package t1;

import G.C0197f0;
import W2.InterfaceC0302y;
import f1.C0604E;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0779e;
import l.C0764I;
import l.U;
import l.m0;
import l.u0;
import s1.C1193i;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class v extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f10706k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f10707l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ U f10708m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1193i f10709n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m0 f10710o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(U u4, C1193i c1193i, m0 m0Var, C2.a aVar) {
        super(2, aVar);
        this.f10708m = u4;
        this.f10709n = c1193i;
        this.f10710o = m0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((v) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        v vVar = new v(this.f10708m, this.f10709n, this.f10710o, aVar);
        vVar.f10707l = obj;
        return vVar;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        Object a4;
        Object obj2 = D2.a.f2163d;
        int i2 = this.f10706k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            InterfaceC0302y interfaceC0302y = (InterfaceC0302y) this.f10707l;
            U u4 = this.f10708m;
            Object value = u4.f7635c.getValue();
            C1193i c1193i = this.f10709n;
            if (Intrinsics.a(value, c1193i)) {
                long longValue = ((Number) this.f10710o.f7811l.getValue()).longValue() / 1000000;
                C0197f0 c0197f0 = u4.f7640h;
                float d4 = c0197f0.d();
                u0 j4 = AbstractC0779e.j((int) (c0197f0.d() * longValue), 0, null, 6);
                E.k kVar = new E.k(interfaceC0302y, u4, c1193i, 4);
                this.f10706k = 2;
                if (AbstractC0779e.c(d4, 0.0f, j4, kVar, this, 4) == obj2) {
                    return obj2;
                }
            } else {
                this.f10706k = 1;
                m0 m0Var = u4.f7637e;
                if (m0Var == null) {
                    a4 = Unit.f7487a;
                } else {
                    a4 = C0764I.a(u4.f7643k, new C0604E(null, c1193i, null, u4, m0Var), this);
                    if (a4 != obj2) {
                        a4 = Unit.f7487a;
                    }
                }
                if (a4 == obj2) {
                    return obj2;
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        return Unit.f7487a;
    }
}
