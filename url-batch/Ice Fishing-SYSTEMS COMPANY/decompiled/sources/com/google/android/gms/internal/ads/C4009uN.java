package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4009uN implements InterfaceC4279zN, InterfaceC3901sN {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f34583c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile InterfaceC4279zN f34584a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f34585b = f34583c;

    public C4009uN(InterfaceC4279zN interfaceC4279zN) {
        this.f34584a = interfaceC4279zN;
    }

    public static C4009uN a(InterfaceC4279zN interfaceC4279zN) {
        return interfaceC4279zN instanceof C4009uN ? (C4009uN) interfaceC4279zN : new C4009uN(interfaceC4279zN);
    }

    public static InterfaceC3901sN b(InterfaceC4279zN interfaceC4279zN) {
        if (interfaceC4279zN instanceof InterfaceC3901sN) {
            return (InterfaceC3901sN) interfaceC4279zN;
        }
        interfaceC4279zN.getClass();
        return new C4009uN(interfaceC4279zN);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        Object obj = this.f34585b;
        Object obj2 = f34583c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.f34585b;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object d2 = this.f34584a.d();
                Object obj4 = this.f34585b;
                if (obj4 != obj2 && obj4 != d2) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + d2 + ". This is likely due to a circular dependency.");
                }
                this.f34585b = d2;
                this.f34584a = null;
                return d2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
