package l8;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n implements w8.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f5926c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f5927a = f5926c;

    /* renamed from: b, reason: collision with root package name */
    public volatile w8.a f5928b;

    public n(w8.a aVar) {
        this.f5928b = aVar;
    }

    @Override // w8.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f5927a;
        Object obj3 = f5926c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f5927a;
                if (obj == obj3) {
                    obj = this.f5928b.get();
                    this.f5927a = obj;
                    this.f5928b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
