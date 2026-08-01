package androidx.lifecycle;

import defpackage.gq;
import defpackage.lq;
import defpackage.mq;
import defpackage.nq;
import defpackage.ra;
import defpackage.ta;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements lq {
    public final mq a;
    public final ra b;

    public ReflectiveGenericLifecycleObserver(mq mqVar) {
        this.a = mqVar;
        ta taVar = ta.c;
        Class<?> cls = mqVar.getClass();
        ra raVar = (ra) taVar.a.get(cls);
        this.b = raVar == null ? taVar.a(cls, null) : raVar;
    }

    @Override // defpackage.lq
    public final void b(nq nqVar, gq gqVar) {
        HashMap hashMap = this.b.a;
        List list = (List) hashMap.get(gqVar);
        mq mqVar = this.a;
        ra.a(list, nqVar, gqVar, mqVar);
        ra.a((List) hashMap.get(gq.ON_ANY), nqVar, gqVar, mqVar);
    }
}
