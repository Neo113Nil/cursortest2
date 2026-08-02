package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dpz implements dps {
    public final dov a;
    final /* synthetic */ iyi b;
    private final Map c = new LinkedHashMap();

    public dpz(iyi iyiVar, dov dovVar) {
        this.b = iyiVar;
        this.a = dovVar;
    }

    @Override // defpackage.dps
    public final void a() {
        Map map = this.c;
        for (Map.Entry entry : map.entrySet()) {
            ((dtd) this.b.b).c((jit) entry.getKey(), (dpy) entry.getValue());
        }
        map.clear();
    }

    @Override // defpackage.dps
    public final dze b(Object obj) {
        jkj k = jit.a.k();
        k.getClass();
        String c = this.a.c(obj);
        c.getClass();
        ilo.b(c, k);
        Map map = this.c;
        jit a = ilo.a(k);
        dpy dpyVar = (dpy) map.get(a);
        dze dzeVar = dpyVar != null ? dpyVar.b : new dze((byte[]) null);
        if (dpyVar != null) {
            ((dtd) this.b.b).c(a, dpyVar);
        }
        dpy dpyVar2 = new dpy(this, obj, dzeVar);
        ((dtd) this.b.b).b(a, dpyVar2);
        map.put(a, dpyVar2);
        return dzeVar;
    }
}
