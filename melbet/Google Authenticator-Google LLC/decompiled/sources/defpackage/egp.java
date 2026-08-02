package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class egp implements egc {
    public final egc a;
    final /* synthetic */ egq b;
    private final egc c;
    private hln d;

    public egp(egq egqVar, egc egcVar, egc egcVar2) {
        this.b = egqVar;
        this.c = egcVar;
        this.a = egcVar2;
    }

    private final hvi h(gzf gzfVar) {
        return hoq.ap((hvi) gzfVar.a(this.c), egi.class, new egl(this, gzfVar, 2), huf.a);
    }

    private final hvi i(egm egmVar, String str, int i) {
        return hoq.ap(egmVar.a(this.c, str, i), egi.class, new ego(this, egmVar, str, i, 0), huf.a);
    }

    @Override // defpackage.egc
    public final hvi a() {
        return h(new drv(11));
    }

    @Override // defpackage.egc
    public final hvi b() {
        return h(new drv(12));
    }

    @Override // defpackage.egc
    public final hvi c(String str, int i) {
        return i(new egn(1), str, i);
    }

    @Override // defpackage.egc
    public final hvi d(String str, int i) {
        return i(new egn(0), str, i);
    }

    @Override // defpackage.egc
    public final void e(ehn ehnVar) {
        List list = this.b.b;
        synchronized (list) {
            list.add(ehnVar);
            this.c.e(ehnVar);
        }
    }

    @Override // defpackage.egc
    public final void f(ehn ehnVar) {
        List list = this.b.b;
        synchronized (list) {
            list.remove(ehnVar);
            this.c.f(ehnVar);
        }
    }

    public final void g(Exception exc) {
        egq egqVar = this.b;
        List list = egqVar.b;
        synchronized (list) {
            if (this.d == null) {
                this.d = hln.l("OneGoogle");
            }
            ((hlk) ((hlk) this.d.g()).i("com/google/android/libraries/onegoogle/owners/mdi/SafeMdiOwnersProvider$SafeDelegate", "enableSafeDelegate", 190, "SafeMdiOwnersProvider.java")).u("MDI Profile Sync not available on device. Reverting to backup implementation. Exception: %s", dih.aj(exc));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.a.e((ehn) it.next());
            }
            egqVar.a = this.a;
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                this.c.f((ehn) it2.next());
            }
            list.clear();
        }
    }
}
