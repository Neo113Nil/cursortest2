package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hfd extends hjr {
    int a;
    Object b;
    final /* synthetic */ Iterator c;

    public hfd(Iterator it) {
        this.c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a > 0 || this.c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        if (i <= 0) {
            hid hidVar = (hid) this.c.next();
            this.b = hidVar.a;
            i = hidVar.a();
        }
        this.a = i - 1;
        Object obj = this.b;
        obj.getClass();
        return obj;
    }
}
