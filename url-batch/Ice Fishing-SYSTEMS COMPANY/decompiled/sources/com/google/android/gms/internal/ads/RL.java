package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class RL implements Map.Entry, Comparable {

    /* renamed from: n, reason: collision with root package name */
    public final Comparable f27345n;

    /* renamed from: u, reason: collision with root package name */
    public Object f27346u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ QL f27347v;

    public RL(QL ql, Comparable comparable, Object obj) {
        Objects.requireNonNull(ql);
        this.f27347v = ql;
        this.f27345n = comparable;
        this.f27346u = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f27345n.compareTo(((RL) obj).f27345n);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f27345n;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f27346u;
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
        return this.f27345n;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f27346u;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f27345n;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f27346u;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f27347v.f();
        Object obj2 = this.f27346u;
        this.f27346u = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f27345n);
        String valueOf2 = String.valueOf(this.f27346u);
        return D.y.o(new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf, "=", valueOf2);
    }
}
