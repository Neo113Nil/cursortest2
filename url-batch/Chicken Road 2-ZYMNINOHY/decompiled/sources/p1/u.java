package p1;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final C1344a f14795a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f14796b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f14797c;

    static {
        C1344a c1344a = new C1344a();
        c1344a.f14798w = false;
        c1344a.H(new h(2));
        c1344a.H(new f());
        c1344a.H(new h(1));
        f14795a = c1344a;
        f14796b = new ThreadLocal();
        f14797c = new ArrayList();
    }

    public static p.e a() {
        p.e eVar;
        ThreadLocal threadLocal = f14796b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (eVar = (p.e) weakReference.get()) != null) {
            return eVar;
        }
        p.e eVar2 = new p.e(0);
        threadLocal.set(new WeakReference(eVar2));
        return eVar2;
    }
}
