package androidx.lifecycle;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class SavedStateHandleController implements p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f692a;

    @Override // androidx.lifecycle.p
    public final void a(r rVar, l lVar) {
        if (lVar == l.ON_DESTROY) {
            this.f692a = false;
            rVar.f().f(this);
        }
    }
}
