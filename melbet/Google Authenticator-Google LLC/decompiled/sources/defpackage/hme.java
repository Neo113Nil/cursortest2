package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hme extends hmh {
    private final Map a;
    private final Map b;
    private final hmg c;
    private final hmf d;

    public hme(hmd hmdVar) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        hashMap.putAll(hmdVar.c);
        hashMap2.putAll(hmdVar.d);
        this.c = hmdVar.e;
        this.d = hmdVar.f;
    }

    @Override // defpackage.hmh
    protected final void a(hky hkyVar, Object obj, Object obj2) {
        hmg hmgVar = (hmg) this.a.get(hkyVar);
        if (hmgVar != null) {
            hmgVar.a(hkyVar, obj, obj2);
        } else {
            this.c.a(hkyVar, obj, obj2);
        }
    }

    @Override // defpackage.hmh
    protected final void b(hky hkyVar, Iterator it, Object obj) {
        hmf hmfVar = (hmf) this.b.get(hkyVar);
        if (hmfVar != null) {
            hmfVar.a(hkyVar, it, obj);
            return;
        }
        hmf hmfVar2 = this.d;
        if (hmfVar2 != null && !this.a.containsKey(hkyVar)) {
            hmfVar2.a(hkyVar, it, obj);
        } else {
            while (it.hasNext()) {
                a(hkyVar, it.next(), obj);
            }
        }
    }
}
