package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hez extends heb {
    public final her a;

    public hez(her herVar) {
        this.a = herVar;
    }

    @Override // defpackage.heb, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return obj != null && hnu.O(new hew(this), obj);
    }

    @Override // defpackage.heb
    public final hel g() {
        return new hex(this.a.entrySet().g());
    }

    @Override // defpackage.heb, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new hew(this);
    }

    @Override // defpackage.heb
    /* renamed from: k */
    public final hjr iterator() {
        return new hew(this);
    }

    @Override // defpackage.heb
    public final boolean l() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.heb
    public Object writeReplace() {
        return new hey(this.a);
    }
}
