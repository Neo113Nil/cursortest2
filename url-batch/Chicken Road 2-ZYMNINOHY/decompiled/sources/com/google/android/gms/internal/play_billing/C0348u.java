package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0348u {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6017a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6018b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6019c;

    public C0348u(Object obj, Object obj2, Object obj3) {
        this.f6017a = obj;
        this.f6018b = obj2;
        this.f6019c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f6017a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj) + "=" + String.valueOf(this.f6018b) + " and " + String.valueOf(obj) + "=" + String.valueOf(this.f6019c));
    }
}
