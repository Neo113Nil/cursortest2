package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class o82 extends p11 {
    public static final Object[] u;
    public static final o82 v;
    public final transient Object[] p;
    public final transient int q;
    public final transient Object[] r;
    public final transient int s;
    public final transient int t;

    static {
        Object[] objArr = new Object[0];
        u = objArr;
        v = new o82(0, 0, 0, objArr, objArr);
    }

    public o82(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.p = objArr;
        this.q = i;
        this.r = objArr2;
        this.s = i2;
        this.t = i3;
    }

    @Override // defpackage.e11
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.p;
        int i = this.t;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.e11
    public final Object[] b() {
        return this.p;
    }

    @Override // defpackage.e11
    public final int c() {
        return this.t;
    }

    @Override // defpackage.e11, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.r;
            if (objArr.length != 0) {
                int c0 = l41.c0(obj.hashCode());
                while (true) {
                    int i = c0 & this.s;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    c0 = i + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.e11
    public final int d() {
        return 0;
    }

    @Override // defpackage.e11
    /* renamed from: e */
    public final g23 iterator() {
        return f().listIterator(0);
    }

    @Override // defpackage.p11, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.q;
    }

    @Override // defpackage.p11
    public final k11 k() {
        return k11.f(this.t, this.p);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.t;
    }
}
