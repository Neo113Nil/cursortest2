package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fto {
    public final Set a;
    public final fwm b;
    private final Map c;
    private final Map d;
    private final boolean e;
    private final ftf f;

    public fto(fwm fwmVar, Map map, Map map2, Set set, ftf ftfVar, gzp gzpVar) {
        this.b = fwmVar;
        this.c = map;
        this.d = map2;
        this.a = set;
        this.f = ftfVar;
        this.e = ((Boolean) gzpVar.d(false)).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final hvi a(ftk ftkVar, List list, frx frxVar) {
        Object obj;
        ArrayList arrayList = new ArrayList(((his) list).c);
        hjs listIterator = ((hel) list).listIterator(0);
        while (true) {
            byte[] bArr = null;
            if (!listIterator.hasNext()) {
                bwt bwtVar = new bwt(9);
                huf hufVar = huf.a;
                return hti.g(fhr.u(arrayList, bwtVar, hufVar), gvx.c(new egl(this, frxVar, 12, null)), hufVar);
            }
            Class cls = (Class) listIterator.next();
            if (fti.class.isAssignableFrom(cls)) {
                hoq.K(!ftj.class.isAssignableFrom(cls), "An account selector should only implement either AutoSelectorKey or InteractiveSelectorKey, but not both. Found %s that implements both keys", cls);
                if (!this.e) {
                    hoq.K(this.c.containsKey(cls), "Selector with key: [%s] not found, did you forget to include the module providing the selector for this key?", cls);
                }
                obj = this.c.get(cls);
            } else {
                if (!ftj.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("No selector registered for key: ".concat(String.valueOf(String.valueOf(cls))));
                }
                hoq.K(!fti.class.isAssignableFrom(cls), "An account selector should only implement either AutoSelectorKey or InteractiveSelectorKey, but not both. Found %s that implements both keys", cls);
                if (!this.e) {
                    hoq.K(this.d.containsKey(cls), "Selector with key: [%s] not found, did you forget to include the module providing the selector for this key?", cls);
                }
                obj = this.d.get(cls);
            }
            arrayList.add(new bwr((koe) obj, ftkVar, 10, bArr));
        }
    }

    final hel b() {
        return (hel) this.f.c.b();
    }

    public final hvi c(frv frvVar, Intent intent, frx frxVar) {
        ftf ftfVar = this.f;
        hel b = b();
        gty aC = hoq.aC(82, "Validate Requirements");
        try {
            hvi g = hti.g(ftfVar.b.c(frvVar), gvx.c(new egl(b, frvVar, 11, null)), huf.a);
            aC.b(g);
            aC.close();
            return hti.g(g, gvx.c(new bpp(this, frvVar, frxVar, 10)), huf.a);
        } catch (Throwable th) {
            try {
                aC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
