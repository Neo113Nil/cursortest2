package androidx.lifecycle;

import defpackage.aq;
import defpackage.na;
import defpackage.pa;
import defpackage.up;
import defpackage.yp;
import defpackage.zp;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements yp {
    public final zp a;
    public final na b;

    public ReflectiveGenericLifecycleObserver(zp zpVar) {
        this.a = zpVar;
        pa paVar = pa.c;
        Class<?> cls = zpVar.getClass();
        na naVar = (na) paVar.a.get(cls);
        this.b = naVar == null ? paVar.a(cls, null) : naVar;
    }

    @Override // defpackage.yp
    public final void b(aq aqVar, up upVar) {
        HashMap hashMap = this.b.a;
        List list = (List) hashMap.get(upVar);
        zp zpVar = this.a;
        na.a(list, aqVar, upVar, zpVar);
        na.a((List) hashMap.get(up.ON_ANY), aqVar, upVar, zpVar);
    }
}
