package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class g6<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f5461a;

    /* renamed from: b, reason: collision with root package name */
    public final j5 f5462b;

    /* renamed from: c, reason: collision with root package name */
    public final k6 f5463c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5464d;

    private g6(k6 k6Var) {
        this.f5464d = false;
        this.f5461a = null;
        this.f5462b = null;
        this.f5463c = k6Var;
    }

    private g6(T t6, j5 j5Var) {
        this.f5464d = false;
        this.f5461a = t6;
        this.f5462b = j5Var;
        this.f5463c = null;
    }

    public static <T> g6<T> a(k6 k6Var) {
        return new g6<>(k6Var);
    }

    public static <T> g6<T> b(T t6, j5 j5Var) {
        return new g6<>(t6, j5Var);
    }

    public final boolean c() {
        return this.f5463c == null;
    }
}
