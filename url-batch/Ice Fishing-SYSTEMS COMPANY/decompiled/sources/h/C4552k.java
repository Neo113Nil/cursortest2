package h;

import d.InterfaceC4445b;

/* renamed from: h.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4552k implements InterfaceC4445b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4553l f38115a;

    public C4552k(AbstractActivityC4553l abstractActivityC4553l) {
        this.f38115a = abstractActivityC4553l;
    }

    @Override // d.InterfaceC4445b
    public final void a(androidx.activity.p pVar) {
        AbstractActivityC4553l abstractActivityC4553l = this.f38115a;
        q delegate = abstractActivityC4553l.getDelegate();
        delegate.a();
        abstractActivityC4553l.getSavedStateRegistry().a("androidx:appcompat");
        delegate.d();
    }
}
