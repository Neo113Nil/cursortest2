package h1;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import d1.C4455a;
import d1.C4456b;
import d1.C4457c;
import i1.C4575b;
import java.util.List;
import k1.C4628a;
import k1.C4629b;
import m5.C4782a;

/* renamed from: h1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4562c {

    /* renamed from: a, reason: collision with root package name */
    public static final S0.s f38154a = S0.s.i("a", "p", com.anythink.core.common.s.f16407a, "rz", com.anythink.expressad.foundation.d.d.bv, C4782a.PUSH_MINIFIED_BUTTONS_LIST, "so", "eo", "sk", "sa", "rx", "ry");

    /* renamed from: b, reason: collision with root package name */
    public static final S0.s f38155b = S0.s.i("k");

    public static void a(C4456b c4456b, X0.i iVar) {
        List list = (List) c4456b.f37200u;
        if (list.isEmpty()) {
            list.add(new C4628a(iVar, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(iVar.f3680m)));
        } else if (((C4628a) list.get(0)).f38672b == null) {
            list.set(0, new C4628a(iVar, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(iVar.f3680m)));
        }
    }

    public static boolean b(C4456b c4456b) {
        if (c4456b != null) {
            return c4456b.c() && ((Float) ((C4628a) ((List) c4456b.f37200u).get(0)).f38672b).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x011b, code lost:
    
        if (r1.f38687b == 1.0f) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d1.d c(C4575b c4575b, X0.i iVar) {
        C4455a c4455a;
        boolean z8 = c4575b.I() == 3;
        if (z8) {
            c4575b.j();
        }
        I1.b bVar = null;
        d1.e eVar = null;
        C4456b c4456b = null;
        C4455a c4455a2 = null;
        C4456b c4456b2 = null;
        C4456b c4456b3 = null;
        C4456b c4456b4 = null;
        C4456b c4456b5 = null;
        C4456b c4456b6 = null;
        C4455a c4455a3 = null;
        C4456b c4456b7 = null;
        C4456b c4456b8 = null;
        while (c4575b.D()) {
            switch (c4575b.K(f38154a)) {
                case 0:
                    c4575b.j();
                    while (c4575b.D()) {
                        if (c4575b.K(f38155b) != 0) {
                            c4575b.V();
                            c4575b.W();
                        } else {
                            bVar = AbstractC4560a.a(c4575b, iVar);
                        }
                    }
                    c4575b.B();
                    break;
                case 1:
                    eVar = AbstractC4560a.b(c4575b, iVar);
                    break;
                case 2:
                    c4455a2 = new C4455a(p.a(c4575b, iVar, 1.0f, f.f38164z, false), 4);
                    break;
                case 3:
                    c4456b6 = Z5.c.h(c4575b, iVar, false);
                    a(c4456b6, iVar);
                    break;
                case 4:
                    c4456b = Z5.c.h(c4575b, iVar, false);
                    a(c4456b, iVar);
                    break;
                case 5:
                    c4455a3 = Z5.c.j(c4575b, iVar);
                    break;
                case 6:
                    c4456b7 = Z5.c.h(c4575b, iVar, false);
                    break;
                case 7:
                    c4456b8 = Z5.c.h(c4575b, iVar, false);
                    break;
                case 8:
                    c4456b2 = Z5.c.h(c4575b, iVar, false);
                    break;
                case 9:
                    c4456b3 = Z5.c.h(c4575b, iVar, false);
                    break;
                case 10:
                    c4456b4 = Z5.c.h(c4575b, iVar, false);
                    a(c4456b4, iVar);
                    break;
                case 11:
                    c4456b5 = Z5.c.h(c4575b, iVar, false);
                    a(c4456b5, iVar);
                    break;
                default:
                    c4575b.V();
                    c4575b.W();
                    break;
            }
        }
        if (z8) {
            c4575b.B();
        }
        if (bVar == null || (bVar.c() && ((PointF) ((C4628a) bVar.f1246n.get(0)).f38672b).equals(0.0f, 0.0f))) {
            bVar = null;
        }
        d1.e eVar2 = (eVar == null || (!(eVar instanceof C4457c) && eVar.c() && ((PointF) ((C4628a) eVar.b().get(0)).f38672b).equals(0.0f, 0.0f))) ? null : eVar;
        C4456b c4456b9 = b(c4456b) ? null : c4456b;
        if (c4455a2 != null) {
            if (c4455a2.c()) {
                C4629b c4629b = (C4629b) ((C4628a) ((List) c4455a2.f37200u).get(0)).f38672b;
                if (c4629b.f38686a == 1.0f) {
                }
            }
            c4455a = c4455a2;
            return new d1.d(bVar, eVar2, c4455a, c4456b9, c4455a3, c4456b7, c4456b8, (c4456b2 != null || (c4456b2.c() && ((Float) ((C4628a) ((List) c4456b2.f37200u).get(0)).f38672b).floatValue() == 0.0f)) ? null : c4456b2, (c4456b3 != null || (c4456b3.c() && ((Float) ((C4628a) ((List) c4456b3.f37200u).get(0)).f38672b).floatValue() == 0.0f)) ? null : c4456b3, !b(c4456b4) ? null : c4456b4, !b(c4456b5) ? null : c4456b5, !b(c4456b6) ? null : c4456b6);
        }
        c4455a = null;
        return new d1.d(bVar, eVar2, c4455a, c4456b9, c4455a3, c4456b7, c4456b8, (c4456b2 != null || (c4456b2.c() && ((Float) ((C4628a) ((List) c4456b2.f37200u).get(0)).f38672b).floatValue() == 0.0f)) ? null : c4456b2, (c4456b3 != null || (c4456b3.c() && ((Float) ((C4628a) ((List) c4456b3.f37200u).get(0)).f38672b).floatValue() == 0.0f)) ? null : c4456b3, !b(c4456b4) ? null : c4456b4, !b(c4456b5) ? null : c4456b5, !b(c4456b6) ? null : c4456b6);
    }
}
