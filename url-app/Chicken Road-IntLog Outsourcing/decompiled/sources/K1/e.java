package K1;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import n1.InterfaceC1315b;

/* loaded from: classes.dex */
public final class e implements InterfaceC1315b {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f1382a = new AtomicReference();

    @Override // n1.InterfaceC1315b
    public final void a(boolean z) {
        synchronized (g.f1385j) {
            try {
                Iterator it = new ArrayList(g.f1386k.values()).iterator();
                while (it.hasNext()) {
                    g gVar = (g) it.next();
                    if (gVar.f1391e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it2 = gVar.f1395i.iterator();
                        while (it2.hasNext()) {
                            g gVar2 = ((d) it2.next()).f1381a;
                            if (z) {
                                gVar2.getClass();
                            } else {
                                ((W1.d) gVar2.f1394h.get()).b();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
