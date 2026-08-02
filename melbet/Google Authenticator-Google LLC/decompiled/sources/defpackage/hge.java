package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hge extends ham {
    final /* synthetic */ Iterator a;
    final /* synthetic */ gzr b;

    public hge(Iterator it, gzr gzrVar) {
        this.a = it;
        this.b = gzrVar;
    }

    @Override // defpackage.ham
    protected final Object a() {
        gzr gzrVar;
        Object next;
        do {
            Iterator it = this.a;
            if (!it.hasNext()) {
                b();
                return null;
            }
            gzrVar = this.b;
            next = it.next();
        } while (!gzrVar.a(next));
        return next;
    }
}
