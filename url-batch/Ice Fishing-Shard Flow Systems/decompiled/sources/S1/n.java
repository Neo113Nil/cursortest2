package S1;

import e2.InterfaceC0372a;

/* loaded from: classes.dex */
public final class n implements InterfaceC0372a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f2494c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f2495a = f2494c;

    /* renamed from: b, reason: collision with root package name */
    public volatile InterfaceC0372a f2496b;

    public n(InterfaceC0372a interfaceC0372a) {
        this.f2496b = interfaceC0372a;
    }

    @Override // e2.InterfaceC0372a
    public final Object get() {
        Object obj;
        Object obj2 = this.f2495a;
        Object obj3 = f2494c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f2495a;
                if (obj == obj3) {
                    obj = this.f2496b.get();
                    this.f2495a = obj;
                    this.f2496b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
