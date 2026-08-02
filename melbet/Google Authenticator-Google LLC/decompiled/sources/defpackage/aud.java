package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aud implements auc {
    private final Map a = new LinkedHashMap();

    @Override // defpackage.auc
    public final List a(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map map = this.a;
        for (Map.Entry entry : map.entrySet()) {
            if (ksp.b(((axl) entry.getKey()).a, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            map.remove((axl) it.next());
        }
        return ixc.p(linkedHashMap.values());
    }

    @Override // defpackage.auc
    public final boolean b(axl axlVar) {
        return this.a.containsKey(axlVar);
    }

    @Override // defpackage.auc
    public final brn c(axl axlVar) {
        return (brn) this.a.remove(axlVar);
    }

    @Override // defpackage.auc
    public final brn d(axl axlVar) {
        Map map = this.a;
        Object obj = map.get(axlVar);
        if (obj == null) {
            obj = new brn(axlVar);
            map.put(axlVar, obj);
        }
        return (brn) obj;
    }

    @Override // defpackage.auc
    public final /* synthetic */ brn e(axt axtVar) {
        return zx.g(this, axtVar);
    }
}
