package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hiu extends hfm {
    public final transient Object[] a;
    public final transient int b;
    public final transient int c;
    private final transient her d;

    public hiu(her herVar, Object[] objArr, int i, int i2) {
        this.d = herVar;
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.heb
    public final int c(Object[] objArr, int i) {
        return g().c(objArr, i);
    }

    @Override // defpackage.heb, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hfm
    public final hel h() {
        return new hit(this);
    }

    @Override // defpackage.hfm, defpackage.heb, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final hjr iterator() {
        return g().listIterator(0);
    }

    @Override // defpackage.heb
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }

    @Override // defpackage.hfm, defpackage.heb
    public Object writeReplace() {
        return super.writeReplace();
    }
}
