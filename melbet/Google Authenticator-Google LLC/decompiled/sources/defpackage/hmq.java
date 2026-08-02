package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hmq extends hmr {
    private final Map a;

    public hmq(hma hmaVar, hma hmaVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e(linkedHashMap, hmaVar);
        e(linkedHashMap, hmaVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((hky) entry.getKey()).b) {
                entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.a = DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    private static void e(Map map, hma hmaVar) {
        for (int i = 0; i < hmaVar.b(); i++) {
            hky c = hmaVar.c(i);
            Object obj = map.get(c);
            if (c.b) {
                List list = (List) obj;
                if (list == null) {
                    list = new ArrayList();
                    map.put(c, list);
                }
                list.add(c.c(hmaVar.e(i)));
            } else {
                map.put(c, c.c(hmaVar.e(i)));
            }
        }
    }

    @Override // defpackage.hmr
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.hmr
    public final Object b(hky hkyVar) {
        hoq.g(!hkyVar.b, "key must be single valued");
        Object obj = this.a.get(hkyVar);
        if (obj != null) {
            return obj;
        }
        return null;
    }

    @Override // defpackage.hmr
    public final Set c() {
        return this.a.keySet();
    }

    @Override // defpackage.hmr
    public final void d(hmh hmhVar, Object obj) {
        for (Map.Entry entry : this.a.entrySet()) {
            hky hkyVar = (hky) entry.getKey();
            Object value = entry.getValue();
            if (hkyVar.b) {
                hmhVar.b(hkyVar, ((List) value).iterator(), obj);
            } else {
                hmhVar.a(hkyVar, value, obj);
            }
        }
    }
}
