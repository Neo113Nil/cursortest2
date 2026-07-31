package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class qp3 {

    /* renamed from: a, reason: collision with root package name */
    private static final np3<?> f10781a = new op3();

    /* renamed from: b, reason: collision with root package name */
    private static final np3<?> f10782b;

    static {
        np3<?> np3Var;
        try {
            np3Var = (np3) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            np3Var = null;
        }
        f10782b = np3Var;
    }

    static np3<?> a() {
        np3<?> np3Var = f10782b;
        if (np3Var != null) {
            return np3Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static np3<?> b() {
        return f10781a;
    }
}
