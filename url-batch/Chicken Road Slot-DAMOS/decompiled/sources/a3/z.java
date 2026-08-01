package a3;

import c2.i1;
import ge.f1;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class z extends wd.n implements Function2 {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f273v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(int i3, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i3, obj, cls, str, str2, i10);
        this.f273v = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean a9;
        boolean a10;
        switch (this.f273v) {
            case 0:
                i1.r rVar = (i1.r) obj;
                i1.r rVar2 = (i1.r) obj2;
                b0 b0Var = (b0) this.f10145e;
                if (b0Var.B && (a9 = rVar2.a()) != rVar.a() && a9) {
                    wd.b0 b0Var2 = new wd.b0();
                    c2.k.r(b0Var, new a0(0, b0Var2, b0Var));
                    if (b0Var2.f10141d != null) {
                        i0.j();
                        return null;
                    }
                }
                return Unit.f5554a;
            case 1:
                i1.r rVar3 = (i1.r) obj;
                i1.r rVar4 = (i1.r) obj2;
                x.p pVar = (x.p) this.f10145e;
                if (pVar.B && (a10 = rVar4.a()) != rVar3.a()) {
                    f1 f1Var = pVar.F;
                    if (f1Var != null) {
                        f1Var.invoke(Boolean.valueOf(a10));
                    }
                    x.o oVar = x.q.C;
                    ld.a aVar = null;
                    if (a10) {
                        ge.a0.s(pVar.w(), null, new b5.d0(pVar, aVar, 12), 3);
                        wd.b0 b0Var3 = new wd.b0();
                        c2.k.r(pVar, new a4.a(14, b0Var3, pVar));
                        if (b0Var3.f10141d != null) {
                            i0.j();
                            return null;
                        }
                        i1 i1Var = pVar.H;
                        if (i1Var != null && i1Var.D0().B && pVar.B) {
                            c2.k.j(pVar, oVar);
                        }
                    } else if (pVar.B) {
                        c2.k.j(pVar, oVar);
                    }
                    c2.k.n(pVar);
                    z.f fVar = pVar.E;
                    if (fVar != null) {
                        z.a aVar2 = pVar.G;
                        if (a10) {
                            if (aVar2 != null) {
                                pVar.L(fVar, new z.b(aVar2));
                                pVar.G = null;
                            }
                            z.a aVar3 = new z.a();
                            pVar.L(fVar, aVar3);
                            pVar.G = aVar3;
                        } else if (aVar2 != null) {
                            pVar.L(fVar, new z.b(aVar2));
                            pVar.G = null;
                        }
                    }
                }
                return Unit.f5554a;
            case 2:
                return z4.v.a((z4.u) this.f10145e, (Function1) obj, (ld.a) obj2);
            default:
                return z4.v.a((z4.u) this.f10145e, (Function1) obj, (ld.a) obj2);
        }
    }
}
