package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class cz implements sc {
    public static final AtomicReference a = new AtomicReference();

    @Override // defpackage.sc
    public final void a(boolean z) {
        synchronized (ez.j) {
            try {
                ArrayList arrayList = new ArrayList(ez.k.values());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ez ezVar = (ez) obj;
                    if (ezVar.e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = ezVar.i.iterator();
                        while (it.hasNext()) {
                            ez ezVar2 = ((bz) it.next()).a;
                            if (!z) {
                                ((dq) ezVar2.h.get()).b();
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
