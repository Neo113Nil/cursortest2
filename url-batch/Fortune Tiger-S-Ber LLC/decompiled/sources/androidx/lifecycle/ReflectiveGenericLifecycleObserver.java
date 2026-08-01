package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements p {

    /* renamed from: a, reason: collision with root package name */
    public final q f562a;

    /* renamed from: b, reason: collision with root package name */
    public final a f563b;

    public ReflectiveGenericLifecycleObserver(q qVar) {
        this.f562a = qVar;
        c cVar = c.c;
        Class<?> cls = qVar.getClass();
        a aVar = (a) cVar.f577a.get(cls);
        this.f563b = aVar == null ? cVar.a(cls, null) : aVar;
    }

    @Override // androidx.lifecycle.p
    public final void a(r rVar, l lVar) {
        HashMap hashMap = this.f563b.f566a;
        List list = (List) hashMap.get(lVar);
        q qVar = this.f562a;
        a.a(list, rVar, lVar, qVar);
        a.a((List) hashMap.get(l.ON_ANY), rVar, lVar, qVar);
    }
}
