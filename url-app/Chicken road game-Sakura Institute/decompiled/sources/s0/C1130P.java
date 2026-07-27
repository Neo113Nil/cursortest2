package s0;

import W2.C0286h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1343r;
import y2.C1333h;

/* renamed from: s0.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1130P extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f10105k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f10106l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Q f10107m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1130P(Q q2, C2.a aVar) {
        super(2, aVar);
        this.f10107m = q2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        ((C1130P) j((C2.a) obj2, (C1167s0) obj)).l(Unit.f7487a);
        return D2.a.f2163d;
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C1130P c1130p = new C1130P(this.f10107m, aVar);
        c1130p.f10106l = obj;
        return c1130p;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f10105k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C1167s0 c1167s0 = (C1167s0) this.f10106l;
            this.f10106l = c1167s0;
            Q q2 = this.f10107m;
            this.f10105k = 1;
            C0286h c0286h = new C0286h(1, D2.f.b(this));
            c0286h.s();
            G0.z zVar = q2.f10109e;
            G0.t tVar = zVar.f3096a;
            tVar.g();
            zVar.f3097b.set(new G0.E(zVar, tVar));
            c0286h.v(new q.n0(c1167s0, 5, q2));
            Object r2 = c0286h.r();
            if (r2 == aVar) {
                Intrinsics.checkNotNullParameter(this, "frame");
            }
            if (r2 == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        throw new C1333h();
    }
}
