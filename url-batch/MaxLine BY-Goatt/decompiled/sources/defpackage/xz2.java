package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xz2 extends vz2 {
    public final n0 p;

    public xz2(n0 n0Var) {
        this.p = n0Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.o;
        this.o = i + 2;
        Object[] objArr = this.m;
        return new gn1(this.p, objArr[i], objArr[i + 1]);
    }
}
