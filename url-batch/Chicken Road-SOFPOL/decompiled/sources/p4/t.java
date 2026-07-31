package p4;

import java.util.List;
import java.util.ListIterator;
import m0.t2;
import m0.z0;
import r.s0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class t implements p6.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s0 f5785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o4.d f5786e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v0.c f5787f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z0 f5788g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t2 f5789h;

    public t(s0 s0Var, o4.d dVar, v0.d dVar2, z0 z0Var, t2 t2Var) {
        this.f5785d = s0Var;
        this.f5786e = dVar;
        this.f5787f = dVar2;
        this.f5788g = z0Var;
        this.f5789h = t2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    @Override // p6.g
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        o4.d dVar;
        q.k kVar = (q.k) obj;
        o4.d dVar2 = (o4.d) obj2;
        m0.s sVar = (m0.s) obj3;
        ((Number) obj4).intValue();
        boolean a8 = q6.i.a(this.f5785d.f6419c.getValue(), this.f5786e);
        if (!((Boolean) this.f5788g.getValue()).booleanValue() && !a8) {
            List list = (List) this.f5789h.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    dVar = 0;
                    break;
                }
                dVar = listIterator.previous();
                if (q6.i.a(dVar2, (o4.d) dVar)) {
                    break;
                }
            }
            dVar2 = dVar;
        }
        if (dVar2 == null) {
            sVar.V(105930796);
        } else {
            sVar.V(-1520603531);
            h0.a.d(dVar2, this.f5787f, u0.h.d(-1263531443, new a0.v(8, dVar2, kVar), sVar), sVar, 384);
        }
        sVar.p(false);
        return c6.m.f1757a;
    }
}
