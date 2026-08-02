package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hiw extends hel {
    private final transient Object[] a;
    private final transient int b;
    private final transient int c;

    public hiw(Object[] objArr, int i, int i2) {
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        hoq.O(i, this.c);
        Object obj = this.a[i + i + this.b];
        obj.getClass();
        return obj;
    }

    @Override // defpackage.heb
    public final boolean l() {
        return true;
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
