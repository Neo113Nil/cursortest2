package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jmb implements Map.Entry, Comparable {
    public Object a;
    final /* synthetic */ jme b;
    public final jko c;

    public jmb(jme jmeVar, jko jkoVar, Object obj) {
        this.b = jmeVar;
        this.c = jkoVar;
        this.a = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.c.compareTo(((jmb) obj).c);
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
        return iwo.b(this.c, entry.getKey()) && iwo.b(this.a, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode = this.c.hashCode();
        Object obj = this.a;
        return (obj == null ? 0 : obj.hashCode()) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.b.b();
        Object obj2 = this.a;
        this.a = obj;
        return obj2;
    }

    public final String toString() {
        return this.c.toString() + "=" + String.valueOf(this.a);
    }
}
