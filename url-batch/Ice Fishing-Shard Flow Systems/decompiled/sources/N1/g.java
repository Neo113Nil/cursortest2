package N1;

/* loaded from: classes.dex */
public final class g implements j {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f1816i = new Object();

    /* renamed from: d, reason: collision with root package name */
    public volatile h f1817d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f1818e;

    /* JADX WARN: Multi-variable type inference failed */
    public static g a(h hVar) {
        if (hVar instanceof g) {
            return (g) hVar;
        }
        g gVar = new g();
        gVar.f1818e = f1816i;
        gVar.f1817d = hVar;
        return gVar;
    }

    @Override // N1.j
    public final Object b() {
        Object obj;
        Object obj2 = this.f1818e;
        Object obj3 = f1816i;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f1818e;
                if (obj == obj3) {
                    obj = this.f1817d.b();
                    Object obj4 = this.f1818e;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f1818e = obj;
                    this.f1817d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
