package u;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n0.m2;
import v.u0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m extends wd.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f9531e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f9532i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, long j, int i3) {
        super(1);
        this.f9530d = i3;
        this.f9531e = nVar;
        this.f9532i = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        v.p pVar;
        long j3;
        switch (this.f9530d) {
            case 0:
                u0 u0Var = (u0) obj;
                Object a9 = u0Var.a();
                n nVar = this.f9531e;
                if (Intrinsics.a(a9, nVar.E.a())) {
                    j = x2.k.a(nVar.F, f.f9507a) ? this.f9532i : nVar.F;
                } else {
                    m2 m2Var = (m2) nVar.E.f9539d.g(u0Var.a());
                    j = m2Var != null ? ((x2.k) m2Var.getValue()).f10329a : 0L;
                }
                m2 m2Var2 = (m2) nVar.E.f9539d.g(u0Var.c());
                long j10 = m2Var2 != null ? ((x2.k) m2Var2.getValue()).f10329a : 0L;
                l0 l0Var = (l0) nVar.D.getValue();
                return (l0Var == null || (pVar = (v.p) l0Var.f9529a.invoke(new x2.k(j), new x2.k(j10))) == null) ? v.c.g(5, null) : pVar;
            default:
                n nVar2 = this.f9531e;
                if (Intrinsics.a(obj, nVar2.E.a())) {
                    j3 = x2.k.a(nVar2.F, f.f9507a) ? this.f9532i : nVar2.F;
                } else {
                    m2 m2Var3 = (m2) nVar2.E.f9539d.g(obj);
                    j3 = m2Var3 != null ? ((x2.k) m2Var3.getValue()).f10329a : 0L;
                }
                return new x2.k(j3);
        }
    }
}
