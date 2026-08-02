package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hjb extends hfm {
    public static final hjb a;
    private static final Object[] f;
    final transient Object[] b;
    public final transient int c;
    final transient Object[] d;
    public final transient int e;
    private final transient int g;

    static {
        Object[] objArr = new Object[0];
        f = objArr;
        a = new hjb(objArr, 0, objArr, 0, 0);
    }

    public hjb(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.b = objArr;
        this.c = i;
        this.d = objArr2;
        this.g = i2;
        this.e = i3;
    }

    @Override // defpackage.hfm
    public final boolean b() {
        return true;
    }

    @Override // defpackage.heb
    public final int c(Object[] objArr, int i) {
        Object[] objArr2 = this.b;
        int i2 = this.e;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.heb, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.d;
            if (objArr.length != 0) {
                int ag = hnu.ag(obj);
                while (true) {
                    int i = ag & this.g;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    ag = i + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.heb
    public final int e() {
        return this.e;
    }

    @Override // defpackage.heb
    public final int f() {
        return 0;
    }

    @Override // defpackage.hfm
    public final hel h() {
        return hel.i(this.b, this.e);
    }

    @Override // defpackage.hfm, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.c;
    }

    @Override // defpackage.hfm, defpackage.heb, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final hjr iterator() {
        return g().listIterator(0);
    }

    @Override // defpackage.heb
    public final boolean l() {
        return false;
    }

    @Override // defpackage.heb
    public final Object[] m() {
        return this.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }

    @Override // defpackage.hfm, defpackage.heb
    public Object writeReplace() {
        return super.writeReplace();
    }
}
