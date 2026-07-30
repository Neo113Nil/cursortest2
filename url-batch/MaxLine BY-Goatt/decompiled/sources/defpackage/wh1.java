package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wh1 implements Map.Entry, k71 {
    public final uh1 m;
    public final int n;
    public final int o;

    public wh1(uh1 uh1Var, int i) {
        uh1Var.getClass();
        this.m = uh1Var;
        this.n = i;
        this.o = uh1Var.t;
    }

    public final void a() {
        if (this.m.t != this.o) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return Intrinsics.b(entry.getKey(), getKey()) && Intrinsics.b(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.m.m[this.n];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.m.n;
        objArr.getClass();
        return objArr[this.n];
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
        uh1 uh1Var = this.m;
        uh1Var.c();
        Object[] objArr = uh1Var.n;
        if (objArr == null) {
            int length = uh1Var.m.length;
            if (length < 0) {
                lh.e("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            uh1Var.n = objArr;
        }
        int i = this.n;
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
