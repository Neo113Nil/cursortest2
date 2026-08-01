package g;

import b.InterfaceC0090b;

/* renamed from: g.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0157j implements InterfaceC0090b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0158k f2578a;

    public C0157j(AbstractActivityC0158k abstractActivityC0158k) {
        this.f2578a = abstractActivityC0158k;
    }

    @Override // b.InterfaceC0090b
    public final void a(a.p pVar) {
        AbstractActivityC0158k abstractActivityC0158k = this.f2578a;
        q delegate = abstractActivityC0158k.getDelegate();
        delegate.a();
        abstractActivityC0158k.getSavedStateRegistry().a("androidx:appcompat");
        delegate.d();
    }
}
