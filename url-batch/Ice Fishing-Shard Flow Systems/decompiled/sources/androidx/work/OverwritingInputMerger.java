package androidx.work;

import G0.h;
import G0.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import l2.c;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends k {
    @Override // G0.k
    public final h a(ArrayList arrayList) {
        c cVar = new c(4);
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            hashMap.putAll(Collections.unmodifiableMap(((h) obj).f810a));
        }
        cVar.D(hashMap);
        h hVar = new h((HashMap) cVar.f6269d);
        h.c(hVar);
        return hVar;
    }
}
