package K;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: K.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0019o {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f480a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f481b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f482c = new HashMap();

    public C0019o(Runnable runnable) {
        this.f480a = runnable;
    }

    public final boolean a() {
        Iterator it = this.f481b.iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.D) ((InterfaceC0021q) it.next())).f1199a.o()) {
                return true;
            }
        }
        return false;
    }

    public final void b(InterfaceC0021q interfaceC0021q) {
        this.f481b.remove(interfaceC0021q);
        C0018n c0018n = (C0018n) this.f482c.remove(interfaceC0021q);
        if (c0018n != null) {
            c0018n.f474a.b(c0018n.f475b);
            c0018n.f475b = null;
        }
        this.f480a.run();
    }
}
