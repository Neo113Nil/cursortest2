package androidx.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import l0.g;
import l0.j;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends j {
    @Override // l0.j
    public final g a(ArrayList arrayList) {
        E3.j jVar = new E3.j(2);
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            hashMap.putAll(Collections.unmodifiableMap(((g) obj).f5271a));
        }
        jVar.a(hashMap);
        g gVar = new g(jVar.f659a);
        g.c(gVar);
        return gVar;
    }
}
