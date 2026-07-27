package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5037a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5038b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5039c;

    public D(Object obj, Object obj2, Object obj3) {
        this.f5037a = obj;
        this.f5038b = obj2;
        this.f5039c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f5037a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj) + "=" + String.valueOf(this.f5038b) + " and " + String.valueOf(obj) + "=" + String.valueOf(this.f5039c));
    }
}
