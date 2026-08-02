package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bcr {
    final Map a;
    public final ReferenceQueue b;
    public volatile boolean c;
    public volatile bcp d;

    public bcr() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new bco());
        this.a = new HashMap();
        this.b = new ReferenceQueue();
        newSingleThreadExecutor.execute(new ath(this, 4, null));
    }

    public final synchronized bdp a(bbh bbhVar) {
        bcq bcqVar = (bcq) this.a.get(bbhVar);
        if (bcqVar == null) {
            return null;
        }
        bdp bdpVar = (bdp) bcqVar.get();
        if (bdpVar == null) {
            c(bcqVar);
        }
        return bdpVar;
    }

    public final synchronized void b(bbh bbhVar, bdp bdpVar) {
        bcq bcqVar = (bcq) this.a.put(bbhVar, new bcq(bbhVar, bdpVar, this.b));
        if (bcqVar != null) {
            bcqVar.a();
        }
    }

    public final void c(bcq bcqVar) {
        synchronized (this) {
            this.a.remove(bcqVar.a);
            if (bcqVar.b) {
                bdv bdvVar = bcqVar.c;
            }
        }
    }

    final synchronized void d(bbh bbhVar) {
        bcq bcqVar = (bcq) this.a.remove(bbhVar);
        if (bcqVar != null) {
            bcqVar.a();
        }
    }
}
