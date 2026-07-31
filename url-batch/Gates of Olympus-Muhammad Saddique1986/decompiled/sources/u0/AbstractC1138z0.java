package u0;

import I.C0143d;
import t0.AbstractC0993f;
import z.C1241e;
import z.C1258v;

/* renamed from: u0.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1138z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final I.X0 f9563a = new I.X0(M.f9212H);

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(C1258v c1258v, C1241e c1241e, X1.c cVar) {
        C1134x0 c1134x0;
        int i3;
        if (cVar instanceof C1134x0) {
            c1134x0 = (C1134x0) cVar;
            int i4 = c1134x0.f9550h;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c1134x0.f9550h = i4 - Integer.MIN_VALUE;
                Object obj = c1134x0.f9549g;
                i3 = c1134x0.f9550h;
                if (i3 == 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    R1.a.e(obj);
                    throw new C1.c();
                }
                R1.a.e(obj);
                if (!c1258v.f4489d.f4501p) {
                    throw new IllegalArgumentException("establishTextInputSession called from an unattached node");
                }
                t0.h0 u3 = AbstractC0993f.u(c1258v);
                Q.d dVar = (Q.d) AbstractC0993f.t(c1258v).f8559w;
                dVar.getClass();
                if (C0143d.L(dVar, f9563a) != null) {
                    throw new ClassCastException();
                }
                c1134x0.f9550h = 1;
                b(u3, c1241e, c1134x0);
                return;
            }
        }
        c1134x0 = new C1134x0(cVar);
        Object obj2 = c1134x0.f9549g;
        i3 = c1134x0.f9550h;
        if (i3 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(t0.h0 h0Var, C1241e c1241e, X1.c cVar) {
        C1136y0 c1136y0;
        int i3;
        if (cVar instanceof C1136y0) {
            c1136y0 = (C1136y0) cVar;
            int i4 = c1136y0.f9556h;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c1136y0.f9556h = i4 - Integer.MIN_VALUE;
                Object obj = c1136y0.f9555g;
                i3 = c1136y0.f9556h;
                if (i3 != 0) {
                    R1.a.e(obj);
                    c1136y0.f9556h = 1;
                    ((C1123s) h0Var).H(c1241e, c1136y0);
                    return;
                } else {
                    if (i3 == 1) {
                        R1.a.e(obj);
                        throw new C1.c();
                    }
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    R1.a.e(obj);
                    throw new C1.c();
                }
            }
        }
        c1136y0 = new C1136y0(cVar);
        Object obj2 = c1136y0.f9555g;
        i3 = c1136y0.f9556h;
        if (i3 != 0) {
        }
    }
}
