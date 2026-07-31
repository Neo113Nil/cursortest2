package I1;

import H1.q;
import I.C0105l;
import I.C0113p;
import L1.z;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends Z1.j implements Y1.g {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f2468e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m f2469f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(List list, m mVar) {
        super(4);
        this.f2468e = list;
        this.f2469f = mVar;
    }

    @Override // Y1.g
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i3;
        t.i iVar = (t.i) obj;
        int intValue = ((Number) obj2).intValue();
        C0113p c0113p = (C0113p) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i3 = (c0113p.f(iVar) ? 4 : 2) | intValue2;
        } else {
            i3 = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i3 |= c0113p.d(intValue) ? 32 : 16;
        }
        if ((i3 & 147) == 146 && c0113p.x()) {
            c0113p.L();
        } else {
            c cVar = (c) this.f2468e.get(intValue);
            c0113p.Q(494665996);
            c0113p.Q(-538229961);
            m mVar = this.f2469f;
            boolean h3 = c0113p.h(mVar) | c0113p.f(cVar);
            Object G3 = c0113p.G();
            if (h3 || G3 == C0105l.f2272a) {
                G3 = new q(mVar, cVar, 3);
                c0113p.a0(G3);
            }
            c0113p.p(false);
            I2.d.d(cVar, (Y1.a) G3, c0113p, 0);
            c0113p.p(false);
        }
        return z.f2729a;
    }
}
