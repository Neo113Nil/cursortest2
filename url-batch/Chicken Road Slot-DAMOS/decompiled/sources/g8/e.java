package g8;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e implements b7.b {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f4296a = new AtomicReference();

    @Override // b7.b
    public final void a(boolean z10) {
        synchronized (g.j) {
            try {
                ArrayList arrayList = new ArrayList(g.f4299k.values());
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    g gVar = (g) obj;
                    if (gVar.f4304e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = gVar.f4307i.iterator();
                        while (it.hasNext()) {
                            g gVar2 = ((d) it.next()).f4295a;
                            if (!z10) {
                                ((u8.c) gVar2.f4306h.get()).b();
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
