package androidx.lifecycle;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class SavedStateHandleController implements p {

    /* renamed from: f, reason: collision with root package name */
    public boolean f587f;

    @Override // androidx.lifecycle.p
    public final void b(r rVar, l lVar) {
        if (lVar == l.ON_DESTROY) {
            this.f587f = false;
            rVar.e().f(this);
        }
    }
}
