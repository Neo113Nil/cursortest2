package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kpv implements Map.Entry {
    private final kpy a;
    private final int b;
    private final int c;

    public kpv(kpy kpyVar, int i) {
        this.a = kpyVar;
        this.b = i;
        this.c = kpyVar.f;
    }

    private final void a() {
        if (this.a.f != this.c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return ksp.b(entry.getKey(), getKey()) && ksp.b(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.a.b[this.b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.a.c;
        objArr.getClass();
        return objArr[this.b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        kpy kpyVar = this.a;
        kpyVar.f();
        Object[] k = kpyVar.k();
        int i = this.b;
        Object obj2 = k[i];
        k[i] = obj;
        return obj2;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
