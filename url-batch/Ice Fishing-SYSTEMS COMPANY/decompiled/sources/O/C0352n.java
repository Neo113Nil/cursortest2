package O;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: O.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0352n {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f2297a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f2298b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2299c = new HashMap();

    public C0352n(Runnable runnable) {
        this.f2297a = runnable;
    }

    public final boolean a() {
        Iterator it = this.f2298b.iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.F) ((InterfaceC0354p) it.next())).f4936a.o()) {
                return true;
            }
        }
        return false;
    }

    public final void b(InterfaceC0354p interfaceC0354p) {
        this.f2298b.remove(interfaceC0354p);
        C0351m c0351m = (C0351m) this.f2299c.remove(interfaceC0354p);
        if (c0351m != null) {
            c0351m.f2291a.b(c0351m.f2292b);
            c0351m.f2292b = null;
        }
        this.f2297a.run();
    }
}
