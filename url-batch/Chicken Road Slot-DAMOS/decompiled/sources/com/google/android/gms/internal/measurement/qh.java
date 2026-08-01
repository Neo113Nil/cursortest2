package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class qh extends c {

    /* renamed from: b, reason: collision with root package name */
    public final Map f2719b;

    public qh(oa oaVar, oa oaVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d(linkedHashMap, oaVar);
        d(linkedHashMap, oaVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((vg) entry.getKey()).f2900c) {
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.f2719b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void d(LinkedHashMap linkedHashMap, oa oaVar) {
        for (int i3 = 0; i3 < oaVar.a(); i3++) {
            vg i10 = oaVar.i(i3);
            Object obj = linkedHashMap.get(i10);
            boolean z10 = i10.f2900c;
            Class cls = i10.f2899b;
            if (z10) {
                List list = (List) obj;
                if (list == null) {
                    list = new ArrayList();
                    linkedHashMap.put(i10, list);
                }
                list.add(cls.cast(oaVar.j(i3)));
            } else {
                linkedHashMap.put(i10, cls.cast(oaVar.j(i3)));
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.c
    public final void a(mh mhVar, hh hhVar) {
        for (Map.Entry entry : this.f2719b.entrySet()) {
            vg vgVar = (vg) entry.getKey();
            Object value = entry.getValue();
            if (vgVar.f2900c) {
                mhVar.b(vgVar, ((List) value).iterator(), hhVar);
            } else {
                mhVar.a(vgVar, value, hhVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.c
    public final int b() {
        return this.f2719b.size();
    }

    @Override // com.google.android.gms.internal.measurement.c
    public final Set c() {
        return this.f2719b.keySet();
    }
}
