package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class qz implements Map.Entry, pw {
    public final sz f;
    public final int g;
    public final int h;

    public qz(sz szVar, int i) {
        szVar.getClass();
        this.f = szVar;
        this.g = i;
        this.h = szVar.m;
    }

    public final void a() {
        if (this.f.m != this.h) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return mv.c(entry.getKey(), getKey()) && mv.c(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f.f[this.g];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f.g;
        objArr.getClass();
        return objArr[this.g];
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
        sz szVar = this.f;
        szVar.c();
        Object[] objArr = szVar.g;
        if (objArr == null) {
            int length = szVar.f.length;
            if (length < 0) {
                s9.k("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            szVar.g = objArr;
        }
        int i = this.g;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
