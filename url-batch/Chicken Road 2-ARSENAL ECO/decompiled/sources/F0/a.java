package F0;

import j5.InterfaceC0438a;

/* loaded from: classes.dex */
public final class a implements InterfaceC0438a {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f705h = new Object();

    /* renamed from: f, reason: collision with root package name */
    public volatile b f706f;

    /* renamed from: g, reason: collision with root package name */
    public volatile Object f707g;

    public static InterfaceC0438a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f707g = f705h;
        aVar.f706f = bVar;
        return aVar;
    }

    @Override // j5.InterfaceC0438a
    public final Object get() {
        Object obj;
        Object obj2 = this.f707g;
        Object obj3 = f705h;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f707g;
                if (obj == obj3) {
                    obj = this.f706f.get();
                    Object obj4 = this.f707g;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f707g = obj;
                    this.f706f = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
