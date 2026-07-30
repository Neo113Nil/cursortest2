package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class m82 extends k11 {
    public final transient Object[] o;
    public final transient int p;
    public final transient int q;

    public m82(Object[] objArr, int i, int i2) {
        this.o = objArr;
        this.p = i;
        this.q = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zm3.l(i, this.q);
        Object obj = this.o[(i * 2) + this.p];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.q;
    }
}
