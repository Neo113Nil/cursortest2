package m6;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements gd.a {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f6564i = new Object();

    /* renamed from: d, reason: collision with root package name */
    public volatile b f6565d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f6566e;

    public static gd.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f6566e = f6564i;
        aVar.f6565d = bVar;
        return aVar;
    }

    @Override // gd.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f6566e;
        Object obj3 = f6564i;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f6566e;
                if (obj == obj3) {
                    obj = this.f6565d.get();
                    Object obj4 = this.f6566e;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f6566e = obj;
                    this.f6565d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
