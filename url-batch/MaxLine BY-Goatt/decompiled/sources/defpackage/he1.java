package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class he1 implements Map.Entry {
    public he1 m;
    public he1 n;
    public he1 o;
    public he1 p;
    public he1 q;
    public final Object r;
    public Object s;
    public int t;

    public he1(he1 he1Var, Object obj, he1 he1Var2, he1 he1Var3) {
        this.m = he1Var;
        this.r = obj;
        this.t = 1;
        this.p = he1Var2;
        this.q = he1Var3;
        he1Var3.p = this;
        he1Var2.q = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.r;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.s;
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
        return this.r;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.s;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.r;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.s;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.s;
        this.s = obj;
        return obj2;
    }

    public final String toString() {
        return this.r + "=" + this.s;
    }

    public he1() {
        this.r = null;
        this.q = this;
        this.p = this;
    }
}
