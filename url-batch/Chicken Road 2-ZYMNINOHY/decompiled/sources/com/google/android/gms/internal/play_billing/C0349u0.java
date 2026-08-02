package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0349u0 implements K0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C0349u0 f6020b = new C0349u0(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6021a;

    public /* synthetic */ C0349u0(int i4) {
        this.f6021a = i4;
    }

    public static final I0 c(Object obj, Object obj2) {
        I0 i02 = (I0) obj;
        I0 i03 = (I0) obj2;
        if (!i03.isEmpty()) {
            if (!i02.f5856a) {
                if (i02.isEmpty()) {
                    i02 = new I0();
                } else {
                    I0 i04 = new I0(i02);
                    i04.f5856a = true;
                    i02 = i04;
                }
            }
            i02.b();
            if (!i03.isEmpty()) {
                i02.putAll(i03);
            }
        }
        return i02;
    }

    @Override // com.google.android.gms.internal.play_billing.K0
    public R0 a(Class cls) {
        switch (this.f6021a) {
            case 0:
                if (!AbstractC0353w0.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (R0) AbstractC0353w0.h(cls.asSubclass(AbstractC0353w0.class)).d(3);
                } catch (Exception e4) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e4);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.play_billing.K0
    public boolean b(Class cls) {
        switch (this.f6021a) {
            case 0:
                return AbstractC0353w0.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
