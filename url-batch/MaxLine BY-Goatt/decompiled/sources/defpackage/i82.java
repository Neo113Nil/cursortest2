package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class i82 extends k11 {
    public static final i82 q = new i82(0, new Object[0]);
    public final transient Object[] o;
    public final transient int p;

    public i82(int i, Object[] objArr) {
        this.o = objArr;
        this.p = i;
    }

    @Override // defpackage.k11, defpackage.e11
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.o;
        int i = this.p;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.e11
    public final Object[] b() {
        return this.o;
    }

    @Override // defpackage.e11
    public final int c() {
        return this.p;
    }

    @Override // defpackage.e11
    public final int d() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zm3.l(i, this.p);
        Object obj = this.o[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.p;
    }
}
