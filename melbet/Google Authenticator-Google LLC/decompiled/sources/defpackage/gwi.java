package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gwi implements gwg {
    final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(gwk.class, gwh.class, "currentMetadata");

    @Override // defpackage.gwg
    public final gwh a(gwk gwkVar) {
        return (gwh) this.a.get(gwkVar);
    }

    @Override // defpackage.gwg
    public final boolean b(gwk gwkVar, gwh gwhVar, gwh gwhVar2) {
        return a.b(this.a, gwkVar, gwhVar, gwhVar2);
    }
}
