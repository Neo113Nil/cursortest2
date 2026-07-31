package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class lv3<T> implements kv3, ev3 {

    /* renamed from: b, reason: collision with root package name */
    private static final lv3<Object> f8110b = new lv3<>(null);

    /* renamed from: a, reason: collision with root package name */
    private final T f8111a;

    private lv3(T t6) {
        this.f8111a = t6;
    }

    public static <T> kv3<T> b(T t6) {
        sv3.a(t6, "instance cannot be null");
        return new lv3(t6);
    }

    public static <T> kv3<T> c(T t6) {
        return t6 == null ? f8110b : new lv3(t6);
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final T a() {
        return this.f8111a;
    }
}
