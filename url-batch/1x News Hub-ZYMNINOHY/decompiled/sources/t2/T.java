package t2;

/* loaded from: classes.dex */
public final class T extends Z {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10392e;
    public final Object f;

    public /* synthetic */ T(int i3, Object obj) {
        this.f10392e = i3;
        this.f = obj;
    }

    @Override // t2.Q
    public final void c(Throwable th) {
        switch (this.f10392e) {
            case 0:
                ((Q) this.f).c(th);
                break;
            default:
                Object D3 = j().D();
                boolean z = D3 instanceof C1204n;
                a0 a0Var = (a0) this.f;
                if (!z) {
                    a0Var.f(AbstractC1212w.m(D3));
                    break;
                } else {
                    a0Var.f(android.support.v4.media.session.a.k(((C1204n) D3).f10431a));
                    break;
                }
        }
    }
}
