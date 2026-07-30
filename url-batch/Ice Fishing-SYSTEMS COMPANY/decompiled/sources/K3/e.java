package K3;

import N2.InterfaceC0316b;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class e implements InterfaceC0316b {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f1618a = new AtomicReference();

    @Override // N2.InterfaceC0316b
    public final void a(boolean z8) {
        synchronized (g.f1621j) {
            try {
                Iterator it = new ArrayList(g.f1622k.values()).iterator();
                while (it.hasNext()) {
                    g gVar = (g) it.next();
                    if (gVar.f1627e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it2 = gVar.i.iterator();
                        while (it2.hasNext()) {
                            g gVar2 = ((d) it2.next()).f1617a;
                            if (z8) {
                                gVar2.getClass();
                            } else {
                                ((W3.d) gVar2.f1630h.get()).b();
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
