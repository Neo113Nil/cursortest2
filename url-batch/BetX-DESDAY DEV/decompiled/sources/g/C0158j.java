package g;

import b.InterfaceC0090b;

/* renamed from: g.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0158j implements InterfaceC0090b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0159k f2582a;

    public C0158j(AbstractActivityC0159k abstractActivityC0159k) {
        this.f2582a = abstractActivityC0159k;
    }

    @Override // b.InterfaceC0090b
    public final void a(a.p pVar) {
        AbstractActivityC0159k abstractActivityC0159k = this.f2582a;
        q delegate = abstractActivityC0159k.getDelegate();
        delegate.a();
        abstractActivityC0159k.getSavedStateRegistry().a("androidx:appcompat");
        delegate.d();
    }
}
