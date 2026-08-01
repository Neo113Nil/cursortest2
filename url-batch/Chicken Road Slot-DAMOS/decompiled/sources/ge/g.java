package ge;

import com.appsflyer.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements vd.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4350e;

    public /* synthetic */ g(oe.c cVar, oe.b bVar) {
        this.f4349d = 1;
        this.f4350e = cVar;
    }

    @Override // vd.n
    public final Object a(Object obj, Object obj2, Object obj3) {
        int i3 = this.f4349d;
        b0.t tVar = b0.t.f900b;
        d1.i iVar = d1.i.f3304a;
        Object obj4 = this.f4350e;
        switch (i3) {
            case 0:
                ((a1.d) obj4).invoke((Throwable) obj);
                break;
            case 1:
                oe.c cVar = (oe.c) obj4;
                oe.c.f7566v.set(cVar, null);
                cVar.d(null);
                break;
            case 2:
                ((oe.g) obj4).c();
                break;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                com.google.firebase.messaging.v vVar = (com.google.firebase.messaging.v) obj4;
                int intValue = ((Integer) obj).intValue();
                String str = (String) obj2;
                n4.f0 f0Var = (n4.f0) obj3;
                str.getClass();
                f0Var.getClass();
                int ordinal = (((f0Var instanceof n4.e) || ((pe.a) vVar.f3176e).d().i(intValue)) ? r4.f.f8171e : r4.f.f8170d).ordinal();
                if (ordinal == 0) {
                    vVar.f3177i = ((String) vVar.f3177i) + '/' + ("{" + str + '}');
                } else if (ordinal != 1) {
                    a2.r.p();
                    break;
                } else {
                    vVar.b(str, "{" + str + '}');
                }
                break;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                Function0 function0 = (Function0) obj4;
                b0.w wVar = (b0.w) obj;
                n0.i0 i0Var = (n0.i0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                wVar.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= i0Var.f(wVar) ? 4 : 2;
                }
                if (i0Var.O(intValue2 & 1, (intValue2 & 19) != 18)) {
                    float b10 = wVar.b();
                    float a9 = wVar.a();
                    x.g.b(k7.e.B(R.drawable.bg, i0Var, 0), b0.w0.a(1.0f), null, a2.h.f95a, 0.0f, i0Var, 25016);
                    d1.l d10 = b0.w0.d(b10 * 0.08f);
                    d1.d dVar = d1.a.f3282d;
                    float f3 = 0.05f * a9;
                    c6.f.a(b0.i.g(tVar.e(d10, dVar), 0.065f * b10, f3), function0, i0Var, 0);
                    x.g.b(k7.e.B(R.drawable.privacy_policy, i0Var, 0), b0.i.h(0.0f, f3, 1, tVar.e(a.a.e0(b0.i.c(b0.w0.f(iVar, 0.35f * b10), 2.2f), 10.0f), d1.a.f3283e)), null, a2.h.f96b, 0.0f, i0Var, 24632);
                    d1.l h10 = b0.i.h(0.0f, -(0.055f * a9), 1, tVar.e(b0.w0.c(b0.w0.f(iVar, 0.86f * b10), 0.72f * a9), d1.a.f3289v));
                    a2.g0 d11 = b0.p.d(dVar);
                    int hashCode = Long.hashCode(i0Var.T);
                    x0.h l10 = i0Var.l();
                    d1.l C = z4.w.C(h10, i0Var);
                    c2.g.f1541a.getClass();
                    c2.z zVar = c2.f.f1533b;
                    i0Var.Z();
                    if (i0Var.S) {
                        i0Var.k(zVar);
                    } else {
                        i0Var.j0();
                    }
                    c2.e eVar = c2.f.f1536e;
                    n0.h.y(d11, eVar, i0Var);
                    c2.e eVar2 = c2.f.f1535d;
                    n0.h.y(l10, eVar2, i0Var);
                    Integer valueOf = Integer.valueOf(hashCode);
                    c2.e eVar3 = c2.f.f1537f;
                    n0.h.y(valueOf, eVar3, i0Var);
                    c2.d dVar2 = c2.f.g;
                    n0.h.t(i0Var, dVar2);
                    c2.e eVar4 = c2.f.f1534c;
                    n0.h.y(C, eVar4, i0Var);
                    x.g.b(k7.e.B(R.drawable.popup, i0Var, 0), b0.w0.a(1.0f), null, a2.h.f98d, 0.0f, i0Var, 25016);
                    d1.l i10 = b0.i.i(b0.w0.a(1.0f), b10 * 0.06f, a9 * 0.12f);
                    b0.z a10 = b0.x.a(b0.g.f843b, d1.a.f3293z, i0Var, 0);
                    int hashCode2 = Long.hashCode(i0Var.T);
                    x0.h l11 = i0Var.l();
                    d1.l C2 = z4.w.C(i10, i0Var);
                    i0Var.Z();
                    if (i0Var.S) {
                        i0Var.k(zVar);
                    } else {
                        i0Var.j0();
                    }
                    n0.h.y(a10, eVar, i0Var);
                    n0.h.y(l11, eVar2, i0Var);
                    n0.h.y(Integer.valueOf(hashCode2), eVar3, i0Var);
                    n0.h.t(i0Var, dVar2);
                    n0.h.y(C2, eVar4, i0Var);
                    i9.a.a(6, i0Var);
                    i0Var.p(true);
                    i0Var.p(true);
                } else {
                    i0Var.R();
                }
                break;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                List list = (List) obj4;
                b0.w wVar2 = (b0.w) obj;
                n0.i0 i0Var2 = (n0.i0) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                d1.b bVar = d1.a.f3293z;
                wVar2.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= i0Var2.f(wVar2) ? 4 : 2;
                }
                if (i0Var2.O(intValue3 & 1, (intValue3 & 19) != 18)) {
                    float b11 = wVar2.b() * 0.43f;
                    d1.l b12 = b0.w0.b(1.0f);
                    b0.t tVar2 = b0.g.f842a;
                    b0.t0 a11 = b0.r0.a(b0.g.g(wVar2.b() * 0.08f), i0Var2, 48);
                    int hashCode3 = Long.hashCode(i0Var2.T);
                    x0.h l12 = i0Var2.l();
                    d1.l C3 = z4.w.C(b12, i0Var2);
                    c2.g.f1541a.getClass();
                    c2.z zVar2 = c2.f.f1533b;
                    i0Var2.Z();
                    if (i0Var2.S) {
                        i0Var2.k(zVar2);
                    } else {
                        i0Var2.j0();
                    }
                    c2.e eVar5 = c2.f.f1536e;
                    n0.h.y(a11, eVar5, i0Var2);
                    c2.e eVar6 = c2.f.f1535d;
                    n0.h.y(l12, eVar6, i0Var2);
                    Integer valueOf2 = Integer.valueOf(hashCode3);
                    c2.e eVar7 = c2.f.f1537f;
                    n0.h.y(valueOf2, eVar7, i0Var2);
                    c2.d dVar3 = c2.f.g;
                    n0.h.t(i0Var2, dVar3);
                    c2.e eVar8 = c2.f.f1534c;
                    n0.h.y(C3, eVar8, i0Var2);
                    float f10 = 22;
                    b0.d g = b0.g.g(f10);
                    d1.l a12 = b0.u0.a();
                    b0.z a13 = b0.x.a(g, bVar, i0Var2, 6);
                    int hashCode4 = Long.hashCode(i0Var2.T);
                    x0.h l13 = i0Var2.l();
                    d1.l C4 = z4.w.C(a12, i0Var2);
                    i0Var2.Z();
                    if (i0Var2.S) {
                        i0Var2.k(zVar2);
                    } else {
                        i0Var2.j0();
                    }
                    n0.h.y(a13, eVar5, i0Var2);
                    n0.h.y(l13, eVar6, i0Var2);
                    n0.h.y(Integer.valueOf(hashCode4), eVar7, i0Var2);
                    n0.h.t(i0Var2, dVar3);
                    n0.h.y(C4, eVar8, i0Var2);
                    i0Var2.W(-1655494123);
                    Iterator it = CollectionsKt.M(list, 3).iterator();
                    while (it.hasNext()) {
                        g8.b.k((j9.b) it.next(), b0.w0.f(iVar, b11), i0Var2, 0);
                    }
                    i0Var2.p(false);
                    i0Var2.p(true);
                    b0.d g2 = b0.g.g(f10);
                    d1.l a14 = b0.u0.a();
                    b0.z a15 = b0.x.a(g2, bVar, i0Var2, 6);
                    int hashCode5 = Long.hashCode(i0Var2.T);
                    x0.h l14 = i0Var2.l();
                    d1.l C5 = z4.w.C(a14, i0Var2);
                    c2.g.f1541a.getClass();
                    c2.z zVar3 = c2.f.f1533b;
                    i0Var2.Z();
                    if (i0Var2.S) {
                        i0Var2.k(zVar3);
                    } else {
                        i0Var2.j0();
                    }
                    n0.h.y(a15, c2.f.f1536e, i0Var2);
                    n0.h.y(l14, c2.f.f1535d, i0Var2);
                    n0.h.y(Integer.valueOf(hashCode5), c2.f.f1537f, i0Var2);
                    n0.h.t(i0Var2, c2.f.g);
                    n0.h.y(C5, c2.f.f1534c, i0Var2);
                    i0Var2.W(-532489474);
                    Iterator it2 = CollectionsKt.M(CollectionsKt.v(list, 3), 3).iterator();
                    while (it2.hasNext()) {
                        g8.b.k((j9.b) it2.next(), b0.w0.f(iVar, b11), i0Var2, 0);
                    }
                    i0Var2.p(false);
                    i0Var2.p(true);
                    i0Var2.p(true);
                } else {
                    i0Var2.R();
                }
                break;
            default:
                v.b bVar2 = (v.b) obj4;
                b0.w wVar3 = (b0.w) obj;
                n0.i0 i0Var3 = (n0.i0) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                wVar3.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= i0Var3.f(wVar3) ? 4 : 2;
                }
                if (i0Var3.O(intValue4 & 1, (intValue4 & 19) != 18)) {
                    float b13 = wVar3.b();
                    float a16 = wVar3.a();
                    int floatValue = (int) (((Number) bVar2.f9734a.f9798e.getValue()).floatValue() * 100);
                    x.g.b(k7.e.B(R.drawable.lbg, i0Var3, 0), b0.w0.a(1.0f), null, a2.h.f95a, 0.0f, i0Var3, 25016);
                    d1.l c10 = b0.i.c(b0.w0.b(0.85f), 8.418919f);
                    d1.d dVar4 = d1.a.f3289v;
                    b0.i.a(b0.i.h(0.0f, -(0.055f * a16), 1, tVar.e(c10, dVar4)), null, t9.b.f9325a, i0Var3, 3072, 6);
                    t9.b.b(((Number) bVar2.f9734a.f9798e.getValue()).floatValue(), b0.i.h(0.0f, -(0.3f * a16), 1, tVar.e(b0.w0.d(0.065f * b13), dVar4)), i0Var3, 0);
                    a.a.b(String.valueOf(floatValue), z4.v.d(4294967296L, b13 * 0.023f), b0.i.h(0.0f, -(a16 * 0.33f), 1, tVar.e(iVar, dVar4)), u9.a.f9706h, u9.a.j, 6.0f, null, null, null, i0Var3, 196608, 448);
                } else {
                    i0Var3.R();
                }
                break;
        }
        return Unit.f5554a;
    }

    public /* synthetic */ g(int i3, Object obj) {
        this.f4349d = i3;
        this.f4350e = obj;
    }
}
