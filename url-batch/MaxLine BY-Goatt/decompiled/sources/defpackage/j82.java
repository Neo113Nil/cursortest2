package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class j82 extends k11 {
    public final /* synthetic */ k82 o;

    public j82(k82 k82Var) {
        this.o = k82Var;
    }

    @Override // java.util.List
    public final Object get(int i) {
        k82 k82Var = this.o;
        zm3.l(i, k82Var.r);
        Object[] objArr = k82Var.q;
        int i2 = i * 2;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.o.r;
    }
}
