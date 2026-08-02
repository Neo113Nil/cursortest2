package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class his extends hel {
    public static final hel a = new his(new Object[0], 0);
    final transient Object[] b;
    public final transient int c;

    public his(Object[] objArr, int i) {
        this.b = objArr;
        this.c = i;
    }

    @Override // defpackage.hel, defpackage.heb
    public final int c(Object[] objArr, int i) {
        Object[] objArr2 = this.b;
        int i2 = this.c;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.heb
    public final int e() {
        return this.c;
    }

    @Override // defpackage.heb
    public final int f() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        hoq.O(i, this.c);
        Object obj = this.b[i];
        obj.getClass();
        return obj;
    }

    @Override // defpackage.heb
    public final boolean l() {
        return false;
    }

    @Override // defpackage.heb
    public final Object[] m() {
        return this.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // defpackage.hel, defpackage.heb
    public Object writeReplace() {
        return super.writeReplace();
    }
}
