package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kty implements Iterator {
    final /* synthetic */ ktz a;
    private final Iterator b;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ktu] */
    public kty(ktz ktzVar) {
        this.a = ktzVar;
        this.b = ktzVar.a.a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, krt] */
    @Override // java.util.Iterator
    public final Object next() {
        return this.a.b.a(this.b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.c();
    }
}
