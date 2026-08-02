package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hfz extends hdb {
    final /* synthetic */ Iterable a;
    final /* synthetic */ gzf b;

    public hfz(Iterable iterable, gzf gzfVar) {
        this.a = iterable;
        this.b = gzfVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return hnu.L(this.a.iterator(), this.b);
    }
}
