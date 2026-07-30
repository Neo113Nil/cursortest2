package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.ads.CL;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class L2 implements Map.Entry, Comparable {

    /* renamed from: n, reason: collision with root package name */
    public final Comparable f35728n;

    /* renamed from: u, reason: collision with root package name */
    public Object f35729u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ K2 f35730v;

    public L2(K2 k22, Comparable comparable, Object obj) {
        Objects.requireNonNull(k22);
        this.f35730v = k22;
        this.f35728n = comparable;
        this.f35729u = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f35728n.compareTo(((L2) obj).f35728n);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f35728n;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f35729u;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f35728n;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f35729u;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f35728n;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f35729u;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f35730v.g();
        Object obj2 = this.f35729u;
        this.f35729u = obj;
        return obj2;
    }

    public final String toString() {
        return CL.k(String.valueOf(this.f35728n), "=", String.valueOf(this.f35729u));
    }
}
