package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gwj implements gwg {
    @Override // defpackage.gwg
    public final gwh a(gwk gwkVar) {
        gwh gwhVar;
        synchronized (gwkVar) {
            gwhVar = gwkVar.currentMetadata;
        }
        return gwhVar;
    }

    @Override // defpackage.gwg
    public final boolean b(gwk gwkVar, gwh gwhVar, gwh gwhVar2) {
        synchronized (gwkVar) {
            if (gwkVar.currentMetadata != gwhVar) {
                return false;
            }
            gwkVar.currentMetadata = gwhVar2;
            return true;
        }
    }
}
