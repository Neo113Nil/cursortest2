package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class DK implements Map.Entry {

    /* renamed from: A, reason: collision with root package name */
    public int f24417A;

    /* renamed from: n, reason: collision with root package name */
    public DK f24418n;

    /* renamed from: u, reason: collision with root package name */
    public DK f24419u;

    /* renamed from: v, reason: collision with root package name */
    public DK f24420v;

    /* renamed from: w, reason: collision with root package name */
    public DK f24421w;

    /* renamed from: x, reason: collision with root package name */
    public DK f24422x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f24423y;

    /* renamed from: z, reason: collision with root package name */
    public Object f24424z;

    public DK() {
        this.f24423y = null;
        this.f24422x = this;
        this.f24421w = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f24423y;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f24424z;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f24423y;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f24424z;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f24423y;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f24424z;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f24424z;
        this.f24424z = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f24423y);
        String valueOf2 = String.valueOf(this.f24424z);
        return D.y.o(new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf, "=", valueOf2);
    }

    public DK(DK dk, Object obj, DK dk2, DK dk3) {
        this.f24418n = dk;
        this.f24423y = obj;
        this.f24417A = 1;
        this.f24421w = dk2;
        this.f24422x = dk3;
        dk3.f24421w = this;
        dk2.f24422x = this;
    }
}
