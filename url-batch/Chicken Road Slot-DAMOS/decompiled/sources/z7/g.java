package z7;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g implements i {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f10937i = new Object();

    /* renamed from: d, reason: collision with root package name */
    public volatile h f10938d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f10939e;

    /* JADX WARN: Multi-variable type inference failed */
    public static g b(h hVar) {
        if (hVar instanceof g) {
            return (g) hVar;
        }
        g gVar = new g();
        gVar.f10939e = f10937i;
        gVar.f10938d = hVar;
        return gVar;
    }

    @Override // z7.i
    public final Object a() {
        Object obj;
        Object obj2 = this.f10939e;
        Object obj3 = f10937i;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f10939e;
                if (obj == obj3) {
                    obj = this.f10938d.a();
                    Object obj4 = this.f10939e;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f10939e = obj;
                    this.f10938d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
