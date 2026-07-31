package m1;

import T0.InterfaceC0167b;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import y1.C0759c;

/* loaded from: classes.dex */
public final class e implements InterfaceC0167b {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f5420a = new AtomicReference();

    @Override // T0.InterfaceC0167b
    public final void a(boolean z5) {
        synchronized (g.f5423j) {
            try {
                ArrayList arrayList = new ArrayList(g.f5424k.values());
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    g gVar = (g) obj;
                    if (gVar.f5429e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = gVar.f5433i.iterator();
                        while (it.hasNext()) {
                            g gVar2 = ((d) it.next()).f5419a;
                            if (!z5) {
                                ((C0759c) gVar2.f5432h.get()).b();
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
