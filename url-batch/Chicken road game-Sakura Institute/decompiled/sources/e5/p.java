package e5;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p implements z5.b {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f2789c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f2790a = f2789c;

    /* renamed from: b, reason: collision with root package name */
    public volatile z5.b f2791b;

    public p(z5.b bVar) {
        this.f2791b = bVar;
    }

    @Override // z5.b
    public final Object get() {
        Object obj;
        Object obj2 = this.f2790a;
        Object obj3 = f2789c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f2790a;
                if (obj == obj3) {
                    obj = this.f2791b.get();
                    this.f2790a = obj;
                    this.f2791b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
