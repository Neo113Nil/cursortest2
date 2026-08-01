package androidx.lifecycle;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements p {

    /* renamed from: a, reason: collision with root package name */
    public final d f558a;

    /* renamed from: b, reason: collision with root package name */
    public final p f559b;

    public DefaultLifecycleObserverAdapter(d dVar, p pVar) {
        this.f558a = dVar;
        this.f559b = pVar;
    }

    @Override // androidx.lifecycle.p
    public final void a(r rVar, l lVar) {
        int i4 = e.f579a[lVar.ordinal()];
        if (i4 == 3) {
            this.f558a.b();
        } else if (i4 == 7) {
            throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        p pVar = this.f559b;
        if (pVar != null) {
            pVar.a(rVar, lVar);
        }
    }
}
