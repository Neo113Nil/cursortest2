package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hbf extends hbc implements Set {
    final /* synthetic */ hbg f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbf(hbg hbgVar, Object obj, Set set) {
        super(hbgVar, obj, set, null);
        this.f = hbgVar;
    }

    @Override // defpackage.hbc, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean n = hnu.n((Set) this.b, collection);
        if (n) {
            int size2 = this.b.size();
            this.f.b += size2 - size;
            c();
        }
        return n;
    }
}
