package androidx.lifecycle;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements p {

    /* renamed from: a, reason: collision with root package name */
    public final d f685a;

    /* renamed from: b, reason: collision with root package name */
    public final p f686b;

    public DefaultLifecycleObserverAdapter(d dVar, p pVar) {
        this.f685a = dVar;
        this.f686b = pVar;
    }

    @Override // androidx.lifecycle.p
    public final void a(r rVar, l lVar) {
        int i = e.f707a[lVar.ordinal()];
        if (i == 3) {
            this.f685a.b();
        } else if (i == 7) {
            throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        p pVar = this.f686b;
        if (pVar != null) {
            pVar.a(rVar, lVar);
        }
    }
}
