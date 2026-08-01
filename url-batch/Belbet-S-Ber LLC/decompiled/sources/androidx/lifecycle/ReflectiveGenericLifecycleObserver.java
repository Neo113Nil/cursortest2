package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements p {

    /* renamed from: a, reason: collision with root package name */
    public final q f689a;

    /* renamed from: b, reason: collision with root package name */
    public final a f690b;

    public ReflectiveGenericLifecycleObserver(q qVar) {
        this.f689a = qVar;
        c cVar = c.f704c;
        Class<?> cls = qVar.getClass();
        a aVar = (a) cVar.f705a.get(cls);
        this.f690b = aVar == null ? cVar.a(cls, null) : aVar;
    }

    @Override // androidx.lifecycle.p
    public final void a(r rVar, l lVar) {
        HashMap hashMap = this.f690b.f693a;
        List list = (List) hashMap.get(lVar);
        q qVar = this.f689a;
        a.a(list, rVar, lVar, qVar);
        a.a((List) hashMap.get(l.ON_ANY), rVar, lVar, qVar);
    }
}
