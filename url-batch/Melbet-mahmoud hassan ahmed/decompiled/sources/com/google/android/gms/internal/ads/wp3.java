package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class wp3 implements ir3 {

    /* renamed from: a, reason: collision with root package name */
    private static final wp3 f13912a = new wp3();

    private wp3() {
    }

    public static wp3 c() {
        return f13912a;
    }

    @Override // com.google.android.gms.internal.ads.ir3
    public final hr3 a(Class<?> cls) {
        if (!aq3.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (hr3) aq3.z(cls.asSubclass(aq3.class)).E(3, null, null);
        } catch (Exception e7) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.ir3
    public final boolean b(Class<?> cls) {
        return aq3.class.isAssignableFrom(cls);
    }
}
