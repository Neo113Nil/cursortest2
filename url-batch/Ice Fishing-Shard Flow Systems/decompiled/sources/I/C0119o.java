package I;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: I.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0119o {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f1225a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f1226b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1227c = new HashMap();

    public C0119o(Runnable runnable) {
        this.f1225a = runnable;
    }

    public final boolean a() {
        Iterator it = this.f1226b.iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.I) ((InterfaceC0120p) it.next())).f3588a.p()) {
                return true;
            }
        }
        return false;
    }

    public final void b(InterfaceC0120p interfaceC0120p) {
        this.f1226b.remove(interfaceC0120p);
        C0118n c0118n = (C0118n) this.f1227c.remove(interfaceC0120p);
        if (c0118n != null) {
            c0118n.f1223a.b(c0118n.f1224b);
            c0118n.f1224b = null;
        }
        this.f1225a.run();
    }
}
