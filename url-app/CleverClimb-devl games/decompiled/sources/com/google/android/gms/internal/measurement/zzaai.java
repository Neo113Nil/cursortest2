package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX WARN: Incorrect field signature: TK; */
/* loaded from: classes2.dex */
final class zzaai<K, V> implements Comparable<zzaai>, Map.Entry<K, V> {
    private V value;
    private final Comparable zzbwp;
    private final /* synthetic */ zzaad zzbwq;

    /* JADX WARN: Multi-variable type inference failed */
    zzaai(zzaad zzaadVar, K k, V v) {
        this.zzbwq = zzaadVar;
        this.zzbwp = k;
        this.value = v;
    }

    zzaai(zzaad zzaadVar, Map.Entry<K, V> entry) {
        this(zzaadVar, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean equals(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzaai zzaaiVar) {
        return ((Comparable) getKey()).compareTo((Comparable) zzaaiVar.getKey());
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
        return equals(this.zzbwp, entry.getKey()) && equals(this.value, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.zzbwp;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return (this.zzbwp == null ? 0 : this.zzbwp.hashCode()) ^ (this.value != null ? this.value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        this.zzbwq.zzvd();
        V v2 = this.value;
        this.value = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzbwp);
        String valueOf2 = String.valueOf(this.value);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
