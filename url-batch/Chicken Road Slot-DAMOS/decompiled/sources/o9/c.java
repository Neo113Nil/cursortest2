package o9;

import a2.g0;
import a2.r;
import android.graphics.Typeface;
import android.text.Spannable;
import b0.p;
import b0.r0;
import b0.t;
import b0.t0;
import b0.w;
import b0.w0;
import c2.d;
import c2.e;
import c2.f;
import c2.g;
import c2.z;
import com.appsflyer.R;
import com.google.firebase.messaging.v;
import d1.i;
import d1.l;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import m2.a0;
import n0.i0;
import n4.f0;
import p2.c0;
import p2.d0;
import p2.j;
import p2.o;
import p2.s;
import vd.n;
import x0.h;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7561e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f7562i;

    public /* synthetic */ c(int i3, Object obj, Object obj2) {
        this.f7560d = i3;
        this.f7561e = obj;
        this.f7562i = obj2;
    }

    @Override // vd.n
    public final Object a(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        int i3 = this.f7560d;
        i iVar = i.f3304a;
        t tVar = t.f900b;
        Object obj4 = this.f7562i;
        Object obj5 = this.f7561e;
        switch (i3) {
            case 0:
                Function0 function0 = (Function0) obj5;
                Function0 function02 = (Function0) obj4;
                w wVar = (w) obj;
                i0 i0Var = (i0) obj2;
                int intValue = ((Integer) obj3).intValue();
                wVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= i0Var.f(wVar) ? 4 : 2;
                }
                if (i0Var.O(intValue & 1, (intValue & 19) != 18)) {
                    float b10 = wVar.b();
                    float a9 = wVar.a();
                    l c10 = b0.i.c(w0.f(iVar, 0.4f * b10), 2.2641509f);
                    g0 d10 = p.d(d1.a.f3286s);
                    int hashCode = Long.hashCode(i0Var.T);
                    h l10 = i0Var.l();
                    l C = z4.w.C(c10, i0Var);
                    g.f1541a.getClass();
                    z zVar = f.f1533b;
                    i0Var.Z();
                    if (i0Var.S) {
                        i0Var.k(zVar);
                    } else {
                        i0Var.j0();
                    }
                    e eVar = f.f1536e;
                    n0.h.y(d10, eVar, i0Var);
                    e eVar2 = f.f1535d;
                    n0.h.y(l10, eVar2, i0Var);
                    Integer valueOf = Integer.valueOf(hashCode);
                    e eVar3 = f.f1537f;
                    n0.h.y(valueOf, eVar3, i0Var);
                    d dVar = f.g;
                    n0.h.t(i0Var, dVar);
                    e eVar4 = f.f1534c;
                    n0.h.y(C, eVar4, i0Var);
                    x.g.b(k7.e.B(R.drawable.score, i0Var, 0), w0.a(1.0f), null, a2.h.f98d, 0.0f, i0Var, 25016);
                    x.g.b(k7.e.B(R.drawable.title_pause, i0Var, 0), b0.i.h(0.0f, -(a9 * 0.05f), 1, tVar.e(b0.i.c(w0.f(iVar, b10 * 0.3f), 1.9f), d1.a.f3283e)), null, a2.h.f96b, 0.0f, i0Var, 24632);
                    l h10 = b0.i.h(0.0f, a9 * 0.03f, 1, tVar.e(iVar, d1.a.f3289v));
                    t0 a10 = r0.a(b0.g.g(0.025f * b10), i0Var, 48);
                    int hashCode2 = Long.hashCode(i0Var.T);
                    h l11 = i0Var.l();
                    l C2 = z4.w.C(h10, i0Var);
                    i0Var.Z();
                    if (i0Var.S) {
                        i0Var.k(zVar);
                    } else {
                        i0Var.j0();
                    }
                    n0.h.y(a10, eVar, i0Var);
                    n0.h.y(l11, eVar2, i0Var);
                    n0.h.y(Integer.valueOf(hashCode2), eVar3, i0Var);
                    n0.h.t(i0Var, dVar);
                    n0.h.y(C2, eVar4, i0Var);
                    float f3 = b10 * 0.17f;
                    g8.b.b(z4.w.P(R.string.back_to_menu, i0Var), R.drawable.button_red, b0.i.c(w0.f(iVar, f3), 2.5f), function0, i0Var, 0);
                    g8.b.b(z4.w.P(R.string.resume, i0Var), R.drawable.button_yel, b0.i.c(w0.f(iVar, f3), 2.5f), function02, i0Var, 0);
                    i0Var.p(true);
                    i0Var.p(true);
                } else {
                    i0Var.R();
                }
                return Unit.f5554a;
            case 1:
                v vVar = (v) obj4;
                int intValue2 = ((Integer) obj).intValue();
                String str = (String) obj2;
                f0 f0Var = (f0) obj3;
                str.getClass();
                f0Var.getClass();
                Object obj6 = ((Map) obj5).get(str);
                obj6.getClass();
                List list = (List) obj6;
                int ordinal = (((f0Var instanceof n4.e) || ((pe.a) vVar.f3176e).d().i(intValue2)) ? r4.f.f8171e : r4.f.f8170d).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        r.p();
                        return null;
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        vVar.b(str, (String) it.next());
                    }
                } else {
                    if (list.size() != 1) {
                        StringBuilder q3 = v4.a.q("Expected one value for argument ", str, ", found ");
                        q3.append(list.size());
                        q3.append("values instead.");
                        throw new IllegalArgumentException(q3.toString().toString());
                    }
                    vVar.f3177i = ((String) vVar.f3177i) + '/' + ((String) CollectionsKt.x(list));
                }
                return Unit.f5554a;
            case 2:
                Function0 function03 = (Function0) obj5;
                j9.c cVar = (j9.c) obj4;
                w wVar2 = (w) obj;
                i0 i0Var2 = (i0) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                d1.d dVar2 = d1.a.f3286s;
                wVar2.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= i0Var2.f(wVar2) ? 4 : 2;
                }
                if (i0Var2.O(intValue3 & 1, (intValue3 & 19) != 18)) {
                    float b11 = wVar2.b();
                    float a11 = wVar2.a();
                    x.g.b(k7.e.B(R.drawable.bg, i0Var2, 0), w0.a(1.0f), null, a2.h.f95a, 0.0f, i0Var2, 25016);
                    float f10 = 0.065f * b11;
                    g8.b.e(b0.i.g(tVar.e(w0.d(f10), d1.a.f3282d), f10, 0.055f * a11), function03, i0Var2, 0);
                    x.g.b(k7.e.B(R.drawable.records, i0Var2, 0), b0.i.h(0.0f, a11 * 0.03f, 1, tVar.e(b0.i.c(w0.f(iVar, 0.3f * b11), 2.4f), d1.a.f3283e)), null, a2.h.f96b, 0.0f, i0Var2, 24632);
                    if (cVar.f5120a.isEmpty()) {
                        i0Var2.W(-1423548865);
                        g8.b.a(b0.i.h(0.0f, -(a11 * 0.06f), 1, tVar.e(b0.i.c(w0.f(iVar, b11 * 0.25f), 3.2f), dVar2)), i0Var2, 0);
                        i0Var2.p(false);
                    } else {
                        i0Var2.W(-1423269059);
                        g8.b.j(cVar.f5120a, b0.i.g(tVar.e(w0.f(iVar, 0.5f * b11), dVar2), b11 * 0.0f, a11 * 0.05f), i0Var2, 0);
                        i0Var2.p(false);
                    }
                } else {
                    i0Var2.R();
                }
                return Unit.f5554a;
            default:
                Spannable spannable = (Spannable) obj5;
                k5.a aVar = (k5.a) obj4;
                a0 a0Var = (a0) obj;
                int intValue4 = ((Integer) obj2).intValue();
                int intValue5 = ((Integer) obj3).intValue();
                p2.i iVar2 = a0Var.f6427f;
                s sVar = a0Var.f6424c;
                if (sVar == null) {
                    sVar = s.f7645s;
                }
                o oVar = a0Var.f6425d;
                int i10 = oVar != null ? oVar.f7639a : 0;
                p2.p pVar = a0Var.f6426e;
                int i11 = pVar != null ? pVar.f7640a : 65535;
                t2.c cVar2 = (t2.c) aVar.f5392e;
                d0 b12 = ((j) cVar2.f9230s).b(iVar2, sVar, i10, i11);
                if (b12 instanceof c0) {
                    Object obj7 = ((c0) b12).f7621d;
                    obj7.getClass();
                    typeface = (Typeface) obj7;
                } else {
                    p.e eVar5 = new p.e(b12, cVar2.f9235x);
                    cVar2.f9235x = eVar5;
                    Object obj8 = eVar5.f7590r;
                    obj8.getClass();
                    typeface = (Typeface) obj8;
                }
                spannable.setSpan(new o2.b(1, typeface), intValue4, intValue5, 33);
                return Unit.f5554a;
        }
    }
}
