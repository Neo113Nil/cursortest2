package androidx.work;

import defpackage.asa;
import defpackage.asi;
import defpackage.brn;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class OverwritingInputMerger extends asi {
    @Override // defpackage.asi
    public final asa a(List list) {
        brn brnVar = new brn((char[]) null, (char[]) null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashMap.putAll(((asa) it.next()).a());
        }
        brnVar.z(linkedHashMap);
        return brnVar.x();
    }
}
