package com.google.android.gms.internal.measurement;

import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r2 implements Map.Entry, Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final Comparable f2725d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2726e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q2 f2727i;

    public r2(q2 q2Var, Comparable comparable, Object obj) {
        this.f2727i = q2Var;
        this.f2725d = comparable;
        this.f2726e = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f2725d.compareTo(((r2) obj).f2725d);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f2725d;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f2726e;
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
        return this.f2725d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2726e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f2725d;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f2726e;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f2727i.f();
        Object obj2 = this.f2726e;
        this.f2726e = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f2725d);
        String valueOf2 = String.valueOf(this.f2726e);
        return v4.a.p(new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf, "=", valueOf2);
    }
}
