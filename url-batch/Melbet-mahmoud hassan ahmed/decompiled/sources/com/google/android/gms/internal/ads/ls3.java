package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class ls3 implements Map.Entry, Comparable<ls3> {

    /* renamed from: f, reason: collision with root package name */
    private final Comparable f8065f;

    /* renamed from: g, reason: collision with root package name */
    private Object f8066g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ ss3 f8067h;

    ls3(ss3 ss3Var, Comparable comparable, Object obj) {
        this.f8067h = ss3Var;
        this.f8065f = comparable;
        this.f8066g = obj;
    }

    private static final boolean d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final Comparable b() {
        return this.f8065f;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(ls3 ls3Var) {
        return this.f8065f.compareTo(ls3Var.f8065f);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return d(this.f8065f, entry.getKey()) && d(this.f8066g, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f8065f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f8066g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f8065f;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f8066g;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f8067h.n();
        Object obj2 = this.f8066g;
        this.f8066g = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8065f);
        String valueOf2 = String.valueOf(this.f8066g);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
