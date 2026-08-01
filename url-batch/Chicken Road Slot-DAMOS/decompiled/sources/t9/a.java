package t9;

import a2.h;
import b0.i;
import b0.r0;
import b0.t;
import b0.t0;
import b0.w;
import b0.w0;
import b0.x;
import b0.z;
import com.appsflyer.R;
import d1.l;
import kotlin.Unit;
import n0.i0;
import vd.n;
import z4.v;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements n {
    @Override // vd.n
    public final Object a(Object obj, Object obj2, Object obj3) {
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
            x.g.b(k7.e.B(R.drawable.rec, i0Var, 0), w0.a(1.0f), null, h.f98d, 0.0f, i0Var, 25016);
            l i3 = i.i(t.f900b.e(w0.b(1.0f), d1.a.f3286s), b10 * 0.04f, 0);
            z a10 = x.a(b0.g.f843b, d1.a.A, i0Var, 48);
            int hashCode = Long.hashCode(i0Var.T);
            x0.h l10 = i0Var.l();
            l C = z4.w.C(i3, i0Var);
            c2.g.f1541a.getClass();
            c2.z zVar = c2.f.f1533b;
            i0Var.Z();
            if (i0Var.S) {
                i0Var.k(zVar);
            } else {
                i0Var.j0();
            }
            c2.e eVar = c2.f.f1536e;
            n0.h.y(a10, eVar, i0Var);
            c2.e eVar2 = c2.f.f1535d;
            n0.h.y(l10, eVar2, i0Var);
            Integer valueOf = Integer.valueOf(hashCode);
            c2.e eVar3 = c2.f.f1537f;
            n0.h.y(valueOf, eVar3, i0Var);
            c2.d dVar = c2.f.g;
            n0.h.t(i0Var, dVar);
            c2.e eVar4 = c2.f.f1534c;
            n0.h.y(C, eVar4, i0Var);
            t0 a11 = r0.a(b0.g.f844c, i0Var, 54);
            int hashCode2 = Long.hashCode(i0Var.T);
            x0.h l11 = i0Var.l();
            d1.i iVar = d1.i.f3304a;
            l C2 = z4.w.C(iVar, i0Var);
            i0Var.Z();
            if (i0Var.S) {
                i0Var.k(zVar);
            } else {
                i0Var.j0();
            }
            n0.h.y(a11, eVar, i0Var);
            n0.h.y(l11, eVar2, i0Var);
            n0.h.y(Integer.valueOf(hashCode2), eVar3, i0Var);
            n0.h.t(i0Var, dVar);
            n0.h.y(C2, eVar4, i0Var);
            String P = z4.w.P(R.string.important_notice_title, i0Var);
            long c10 = v.c(15);
            long j = u9.a.f9706h;
            long j3 = u9.a.j;
            a.a.b(P, c10, null, j, j3, 4.0f, null, null, null, i0Var, 196656, 452);
            String P2 = z4.w.P(R.string.important_notice_text_1, i0Var);
            long c11 = v.c(15);
            long j10 = u9.a.f9707i;
            a.a.b(P2, c11, null, j10, j3, 4.0f, null, null, null, i0Var, 196656, 452);
            i0Var.p(true);
            i.b(w0.c(iVar, 0.12f * a9), i0Var);
            a.a.b(z4.w.P(R.string.important_notice_text_2, i0Var), v.c(15), null, j10, j3, 4.0f, null, null, null, i0Var, 196656, 452);
            i0Var.p(true);
        } else {
            i0Var.R();
        }
        return Unit.f5554a;
    }
}
