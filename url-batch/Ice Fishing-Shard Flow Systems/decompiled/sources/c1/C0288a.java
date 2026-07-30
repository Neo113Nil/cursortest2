package c1;

/* renamed from: c1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0288a implements Q5.a {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f4170i = new Object();

    /* renamed from: d, reason: collision with root package name */
    public volatile InterfaceC0289b f4171d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f4172e;

    public static Q5.a a(InterfaceC0289b interfaceC0289b) {
        if (interfaceC0289b instanceof C0288a) {
            return interfaceC0289b;
        }
        C0288a c0288a = new C0288a();
        c0288a.f4172e = f4170i;
        c0288a.f4171d = interfaceC0289b;
        return c0288a;
    }

    @Override // Q5.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f4172e;
        Object obj3 = f4170i;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f4172e;
                if (obj == obj3) {
                    obj = this.f4171d.get();
                    Object obj4 = this.f4172e;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f4172e = obj;
                    this.f4171d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
