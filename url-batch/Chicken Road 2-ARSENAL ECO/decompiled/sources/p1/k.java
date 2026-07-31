package p1;

/* loaded from: classes.dex */
public final class k implements A1.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f5686c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f5687a = f5686c;

    /* renamed from: b, reason: collision with root package name */
    public volatile A1.a f5688b;

    public k(A1.a aVar) {
        this.f5688b = aVar;
    }

    @Override // A1.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f5687a;
        Object obj3 = f5686c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f5687a;
                if (obj == obj3) {
                    obj = this.f5688b.get();
                    this.f5687a = obj;
                    this.f5688b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
