package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements p {

    /* renamed from: f, reason: collision with root package name */
    public final q f584f;

    /* renamed from: g, reason: collision with root package name */
    public final a f585g;

    public ReflectiveGenericLifecycleObserver(q qVar) {
        this.f584f = qVar;
        c cVar = c.f600c;
        Class<?> cls = qVar.getClass();
        a aVar = (a) cVar.f601a.get(cls);
        this.f585g = aVar == null ? cVar.a(cls, null) : aVar;
    }

    @Override // androidx.lifecycle.p
    public final void b(r rVar, l lVar) {
        HashMap hashMap = this.f585g.f588a;
        List list = (List) hashMap.get(lVar);
        q qVar = this.f584f;
        a.a(list, rVar, lVar, qVar);
        a.a((List) hashMap.get(l.ON_ANY), rVar, lVar, qVar);
    }
}
