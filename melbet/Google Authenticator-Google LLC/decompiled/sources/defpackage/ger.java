package defpackage;

import j$.time.Instant;
import j$.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ger extends agd {
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public final gbh c = new gbh("SubscriptionMixinVM");
    public final Set d = new HashSet();
    public final gbf e;
    public final Executor f;
    public final dih g;
    public final iwq h;

    public ger(dih dihVar, iwq iwqVar, Executor executor) {
        this.g = dihVar;
        this.h = iwqVar;
        this.f = executor;
        gbf gbfVar = new gbf(executor, true);
        this.e = gbfVar;
        gbfVar.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(gdn gdnVar, gev gevVar, gel gelVar) {
        int i;
        fao.c();
        gdnVar.getClass();
        geu geuVar = (geu) Map.EL.computeIfAbsent(this.a, gelVar.getClass(), new geq(this, gdnVar, (int) (0 == true ? 1 : 0)));
        fao.c();
        gbh gbhVar = this.c;
        qi qiVar = gbhVar.c;
        Class<?> cls = gelVar.getClass();
        if (qiVar.containsKey(cls)) {
            i = ((Integer) qiVar.get(cls)).intValue();
        } else {
            int andIncrement = gbh.a.getAndIncrement();
            qiVar.put(cls, Integer.valueOf(andIncrement));
            i = andIncrement;
        }
        Object put = gbhVar.b.put(Integer.valueOf(i), gelVar);
        hoq.x(((gelVar instanceof gek) && (gelVar instanceof gdl)) ? false : true);
        gei geiVar = geuVar.f;
        Object obj = geiVar.b;
        dih dihVar = geuVar.j;
        long j = geiVar.d;
        boolean z = j != Long.MAX_VALUE;
        Instant now = Instant.now();
        hoq.I(z, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
        gelVar.getClass();
        geuVar.f = new gei(gdnVar, gevVar, j + 1, 3, geiVar.e.a(gdnVar, now));
        gen genVar = geuVar.g;
        geuVar.g = new gen(genVar.b + 1, gelVar, genVar.d, genVar.e, gyf.a);
        gef gefVar = geuVar.c;
        if (gefVar == null) {
            geuVar.c = new get(geuVar);
            geuVar.k.l(geuVar.f.b, geuVar.c);
        } else if (!geuVar.f.b.equals(obj)) {
            iwq iwqVar = geuVar.k;
            iwqVar.m(obj, gefVar);
            iwqVar.l(geuVar.f.b, geuVar.c);
        }
        if (put == null) {
            if (geuVar.g.e.f()) {
                hoq.I(!r0.f.f(), "Cannot be the case that subscription has data.");
                gen genVar2 = geuVar.g;
                geuVar.g = geu.j(genVar2, (gdy) genVar2.e.b());
                hoq.I(geuVar.g.f.f(), "Callbacks did not accept pinned data after rotation.");
                if (!(geuVar.g.c instanceof gdl) || geuVar.h.b()) {
                    return;
                }
                geuVar.g = geuVar.g.b(true);
                geu.f((gdl) geuVar.g.c);
                return;
            }
        }
        geuVar.e(geuVar.f.e);
    }

    @Override // defpackage.agd
    protected final void c() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((geu) it.next()).a();
        }
        Iterator it2 = this.b.values().iterator();
        while (it2.hasNext()) {
            ((geu) it2.next()).a();
        }
        this.e.a().clear();
    }
}
