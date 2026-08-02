package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hfb extends heb {
    private static final long serialVersionUID = 0;
    final hfc a;

    public hfb(hfc hfcVar) {
        this.a = hfcVar;
    }

    @Override // defpackage.heb, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.a.r(entry.getKey(), entry.getValue());
    }

    @Override // defpackage.heb, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final hjr iterator() {
        return new hfa(this.a);
    }

    @Override // defpackage.heb
    public final boolean l() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size;
    }

    @Override // defpackage.heb
    public Object writeReplace() {
        return super.writeReplace();
    }
}
