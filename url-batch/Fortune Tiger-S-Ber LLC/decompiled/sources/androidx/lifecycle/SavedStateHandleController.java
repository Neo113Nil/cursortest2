package androidx.lifecycle;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class SavedStateHandleController implements p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f565a;

    @Override // androidx.lifecycle.p
    public final void a(r rVar, l lVar) {
        if (lVar == l.ON_DESTROY) {
            this.f565a = false;
            rVar.f().f(this);
        }
    }
}
