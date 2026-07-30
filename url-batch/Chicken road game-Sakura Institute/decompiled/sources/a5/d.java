package a5;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d implements l4.b {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f494a = new AtomicReference();

    @Override // l4.b
    public final void a(boolean z8) {
        synchronized (f.f497i) {
            try {
                ArrayList arrayList = new ArrayList(f.f498j.values());
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    f fVar = (f) obj;
                    if (fVar.f503e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = fVar.f506h.iterator();
                        while (it.hasNext()) {
                            ((c) it.next()).a(z8);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
