package s0;

import G.C0192d;
import r0.AbstractC1065f;
import y.C1315e;
import y2.AbstractC1343r;
import y2.C1333h;

/* loaded from: classes.dex */
public abstract class A0 {

    /* renamed from: a, reason: collision with root package name */
    public static final G.Y0 f9983a = new G.Y0(C1126L.f10077J);

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(y.v vVar, C1315e c1315e, E2.c cVar) {
        C1179y0 c1179y0;
        int i2;
        if (cVar instanceof C1179y0) {
            c1179y0 = (C1179y0) cVar;
            int i4 = c1179y0.f10423k;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c1179y0.f10423k = i4 - Integer.MIN_VALUE;
                Object obj = c1179y0.f10422j;
                D2.a aVar = D2.a.f2163d;
                i2 = c1179y0.f10423k;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1343r.b(obj);
                    throw new C1333h();
                }
                AbstractC1343r.b(obj);
                if (!vVar.f3978d.f3990s) {
                    throw new IllegalArgumentException("establishTextInputSession called from an unattached node");
                }
                r0.g0 w4 = AbstractC1065f.w(vVar);
                O.d dVar = (O.d) AbstractC1065f.v(vVar).f9613z;
                dVar.getClass();
                if (C0192d.L(dVar, f9983a) != null) {
                    throw new ClassCastException();
                }
                c1179y0.f10423k = 1;
                b(w4, c1315e, c1179y0);
                return;
            }
        }
        c1179y0 = new C1179y0(cVar);
        Object obj2 = c1179y0.f10422j;
        D2.a aVar2 = D2.a.f2163d;
        i2 = c1179y0.f10423k;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(r0.g0 g0Var, C1315e c1315e, E2.c cVar) {
        C1181z0 c1181z0;
        int i2;
        if (cVar instanceof C1181z0) {
            c1181z0 = (C1181z0) cVar;
            int i4 = c1181z0.f10431k;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c1181z0.f10431k = i4 - Integer.MIN_VALUE;
                Object obj = c1181z0.f10430j;
                D2.a aVar = D2.a.f2163d;
                i2 = c1181z0.f10431k;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    c1181z0.f10431k = 1;
                    ((C1166s) g0Var).G(c1315e, c1181z0);
                    return;
                } else {
                    if (i2 == 1) {
                        AbstractC1343r.b(obj);
                        throw new C1333h();
                    }
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1343r.b(obj);
                    throw new C1333h();
                }
            }
        }
        c1181z0 = new C1181z0(cVar);
        Object obj2 = c1181z0.f10430j;
        D2.a aVar2 = D2.a.f2163d;
        i2 = c1181z0.f10431k;
        if (i2 != 0) {
        }
    }
}
