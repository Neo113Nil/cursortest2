package P1;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import s1.InterfaceC0871b;

/* loaded from: classes.dex */
public final class e implements InterfaceC0871b {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f2265a = new AtomicReference();

    @Override // s1.InterfaceC0871b
    public final void a(boolean z7) {
        synchronized (g.f2268k) {
            try {
                ArrayList arrayList = new ArrayList(g.f2269l.values());
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    g gVar = (g) obj;
                    if (gVar.f2274e.get()) {
                        gVar.k(z7);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
