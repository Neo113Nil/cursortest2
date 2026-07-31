package o2;

/* loaded from: classes3.dex */
public final class T0 {

    /* renamed from: a, reason: collision with root package name */
    public static final T0 f42024a = new T0();

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f42025b = t2.L.a(new t2.G("ThreadLocalEventLoop"));

    private T0() {
    }

    public final AbstractC3328f0 a() {
        return (AbstractC3328f0) f42025b.get();
    }

    public final AbstractC3328f0 b() {
        ThreadLocal threadLocal = f42025b;
        AbstractC3328f0 abstractC3328f0 = (AbstractC3328f0) threadLocal.get();
        if (abstractC3328f0 != null) {
            return abstractC3328f0;
        }
        AbstractC3328f0 a4 = AbstractC3334i0.a();
        threadLocal.set(a4);
        return a4;
    }

    public final void c() {
        f42025b.set(null);
    }

    public final void d(AbstractC3328f0 abstractC3328f0) {
        f42025b.set(abstractC3328f0);
    }
}
