package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bcq extends WeakReference {
    final bbh a;
    final boolean b;
    bdv c;

    public bcq(bbh bbhVar, bdp bdpVar, ReferenceQueue referenceQueue) {
        super(bdpVar, referenceQueue);
        a.v(bbhVar, "Argument must not be null");
        this.a = bbhVar;
        this.c = null;
        this.b = bdpVar.a;
    }

    final void a() {
        this.c = null;
        clear();
    }
}
