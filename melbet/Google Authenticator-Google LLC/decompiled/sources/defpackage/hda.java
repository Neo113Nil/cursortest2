package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hda extends hdb {
    final /* synthetic */ Iterable[] a;

    public hda(Iterable[] iterableArr) {
        this.a = iterableArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new hgi(new hcz(this.a));
    }
}
