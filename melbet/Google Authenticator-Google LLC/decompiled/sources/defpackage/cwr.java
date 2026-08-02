package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cwr implements cvm {
    public static final cwr a = new cwr();

    @Override // defpackage.cvm
    public final void a(her herVar) {
        cww.l.c(herVar);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [cwj, java.lang.Object] */
    @Override // defpackage.cvm
    public final void b(Exception exc) {
        cwk cwkVar = cww.l;
        Iterator it = cwkVar.a.iterator();
        while (it.hasNext()) {
            cwkVar.c.b(it.next(), exc);
        }
    }
}
