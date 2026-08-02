package x0;

import a2.InterfaceC0133a;

/* renamed from: x0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1238a implements InterfaceC0133a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f10715c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile InterfaceC1239b f10716a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f10717b;

    public static InterfaceC0133a a(InterfaceC1239b interfaceC1239b) {
        if (interfaceC1239b instanceof C1238a) {
            return interfaceC1239b;
        }
        C1238a c1238a = new C1238a();
        c1238a.f10717b = f10715c;
        c1238a.f10716a = interfaceC1239b;
        return c1238a;
    }

    @Override // a2.InterfaceC0133a
    public final Object get() {
        Object obj;
        Object obj2 = this.f10717b;
        Object obj3 = f10715c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f10717b;
                if (obj == obj3) {
                    obj = this.f10716a.get();
                    Object obj4 = this.f10717b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f10717b = obj;
                    this.f10716a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
