package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2721a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2722b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2723c;

    public D(Object obj, Object obj2, Object obj3) {
        this.f2721a = obj;
        this.f2722b = obj2;
        this.f2723c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f2721a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj) + "=" + String.valueOf(this.f2722b) + " and " + String.valueOf(obj) + "=" + String.valueOf(this.f2723c));
    }
}
