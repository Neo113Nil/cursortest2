package N0;

import c1.C0201a;

/* loaded from: classes.dex */
public final class g implements InterfaceC0063b {

    /* renamed from: b, reason: collision with root package name */
    public static g f1024b;

    /* renamed from: c, reason: collision with root package name */
    public static final h f1025c = new h(0, false, false, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public Object f1026a;

    public /* synthetic */ g(Object obj) {
        this.f1026a = obj;
    }

    public static synchronized g b() {
        g gVar;
        synchronized (g.class) {
            try {
                if (f1024b == null) {
                    f1024b = new g();
                }
                gVar = f1024b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    @Override // N0.InterfaceC0063b
    public void a(K0.b bVar) {
        boolean z = bVar.f836b == 0;
        C0201a c0201a = (C0201a) this.f1026a;
        if (z) {
            c0201a.e(null, c0201a.f2701w);
            return;
        }
        g gVar = c0201a.o;
        if (gVar != null) {
            ((L0.h) gVar.f1026a).c(bVar);
        }
    }
}
