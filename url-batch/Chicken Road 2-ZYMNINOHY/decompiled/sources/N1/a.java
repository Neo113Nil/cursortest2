package N1;

import b3.InterfaceC0264a;

/* loaded from: classes.dex */
public final class a implements InterfaceC0264a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f1802c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile b f1803a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f1804b;

    public static InterfaceC0264a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f1804b = f1802c;
        aVar.f1803a = bVar;
        return aVar;
    }

    @Override // b3.InterfaceC0264a
    public final Object get() {
        Object obj;
        Object obj2 = this.f1804b;
        Object obj3 = f1802c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f1804b;
                if (obj == obj3) {
                    obj = this.f1803a.get();
                    Object obj4 = this.f1804b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f1804b = obj;
                    this.f1803a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
