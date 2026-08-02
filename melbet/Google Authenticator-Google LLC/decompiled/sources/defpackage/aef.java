package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aef implements Map.Entry {
    public final Object a;
    public aef b;
    public aef c;
    public boolean d;
    private final Object e;

    public aef(Object obj, Object obj2) {
        this.e = obj;
        this.a = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aef)) {
            return false;
        }
        aef aefVar = (aef) obj;
        return ksp.b(this.e, aefVar.e) && ksp.b(this.a, aefVar.a);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.e;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return (this.e.hashCode() * 31) + this.a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "Entry(key=" + this.e + ", value=" + this.a + ")";
    }
}
