package androidx.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import jf.a;
import t5.e;
import t5.h;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class OverwritingInputMerger extends h {
    @Override // t5.h
    public final e a(ArrayList arrayList) {
        a aVar = new a(1);
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            hashMap.putAll(Collections.unmodifiableMap(((e) obj).f9302a));
        }
        aVar.a(hashMap);
        e eVar = new e(aVar.f5253a);
        e.c(eVar);
        return eVar;
    }
}
