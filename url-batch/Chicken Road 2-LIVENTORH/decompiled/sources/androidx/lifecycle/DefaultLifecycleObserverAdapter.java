package androidx.lifecycle;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements p {

    /* renamed from: f, reason: collision with root package name */
    public final d f580f;

    /* renamed from: g, reason: collision with root package name */
    public final p f581g;

    public DefaultLifecycleObserverAdapter(d dVar, p pVar) {
        this.f580f = dVar;
        this.f581g = pVar;
    }

    @Override // androidx.lifecycle.p
    public final void b(r rVar, l lVar) {
        int i = e.f603a[lVar.ordinal()];
        if (i == 3) {
            this.f580f.a();
        } else if (i == 7) {
            throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        p pVar = this.f581g;
        if (pVar != null) {
            pVar.b(rVar, lVar);
        }
    }
}
