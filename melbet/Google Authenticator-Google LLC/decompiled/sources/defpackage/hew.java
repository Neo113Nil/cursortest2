package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hew extends hjr {
    final hjr a;
    final /* synthetic */ hez b;

    public hew(hez hezVar) {
        this.b = hezVar;
        this.a = hezVar.a.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.a.next()).getValue();
    }
}
