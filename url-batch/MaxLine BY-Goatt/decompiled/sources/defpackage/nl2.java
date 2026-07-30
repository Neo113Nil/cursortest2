package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nl2 extends p11 {
    public final transient Object p;

    public nl2(Object obj) {
        obj.getClass();
        this.p = obj;
    }

    @Override // defpackage.e11
    public final int a(Object[] objArr) {
        objArr[0] = this.p;
        return 1;
    }

    @Override // defpackage.e11, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.p.equals(obj);
    }

    @Override // defpackage.e11
    /* renamed from: e */
    public final g23 iterator() {
        return new i51(this.p);
    }

    @Override // defpackage.p11, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.p.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.p.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
