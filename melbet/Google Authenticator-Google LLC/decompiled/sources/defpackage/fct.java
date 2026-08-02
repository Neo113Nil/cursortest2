package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fct implements htq {
    public List a;
    public final /* synthetic */ fcu b;

    public fct(fcu fcuVar) {
        this.b = fcuVar;
    }

    @Override // defpackage.htq
    public final hvi a() {
        fcu fcuVar = this.b;
        gty b = fcuVar.e.b("Initialize ".concat(String.valueOf(fcuVar.a)));
        try {
            synchronized (fcuVar.d) {
                if (this.a == null) {
                    this.a = fcuVar.f;
                    fcuVar.f = Collections.EMPTY_LIST;
                }
            }
            ArrayList arrayList = new ArrayList(this.a.size());
            kee keeVar = new kee(this.b);
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(((htr) it.next()).a(keeVar));
                } catch (Exception e) {
                    arrayList.add(hnu.aI(e));
                }
            }
            hvi a = hnu.aX(arrayList).a(new avc(this, 12), huf.a);
            b.b(a);
            b.close();
            return a;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
