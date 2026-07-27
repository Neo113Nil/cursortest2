package V1;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class d implements G1.b {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f4160a = new AtomicReference();

    @Override // G1.b
    public final void a(boolean z4) {
        synchronized (f.f4163i) {
            try {
                Iterator it = new ArrayList(f.f4164j.values()).iterator();
                while (it.hasNext()) {
                    f fVar = (f) it.next();
                    if (fVar.f4169e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it2 = fVar.f4172h.iterator();
                        while (it2.hasNext()) {
                            ((c) it2.next()).a(z4);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
