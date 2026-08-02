package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0219e1 implements InterfaceC0266u1 {

    /* renamed from: b, reason: collision with root package name */
    public static final C0219e1 f2853b = new C0219e1(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2854a;

    public /* synthetic */ C0219e1(int i3) {
        this.f2854a = i3;
    }

    public static final C0260s1 c(Object obj, Object obj2) {
        C0260s1 c0260s1 = (C0260s1) obj;
        C0260s1 c0260s12 = (C0260s1) obj2;
        if (!c0260s12.isEmpty()) {
            if (!c0260s1.f2924a) {
                if (c0260s1.isEmpty()) {
                    c0260s1 = new C0260s1();
                } else {
                    C0260s1 c0260s13 = new C0260s1(c0260s1);
                    c0260s13.f2924a = true;
                    c0260s1 = c0260s13;
                }
            }
            c0260s1.b();
            if (!c0260s12.isEmpty()) {
                c0260s1.putAll(c0260s12);
            }
        }
        return c0260s1;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0266u1
    public C1 a(Class cls) {
        switch (this.f2854a) {
            case 0:
                if (!AbstractC0225g1.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C1) AbstractC0225g1.h(cls.asSubclass(AbstractC0225g1.class)).d(3);
                } catch (Exception e3) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e3);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0266u1
    public boolean b(Class cls) {
        switch (this.f2854a) {
            case 0:
                return AbstractC0225g1.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
