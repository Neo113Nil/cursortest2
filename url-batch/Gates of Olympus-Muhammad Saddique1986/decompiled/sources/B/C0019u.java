package B;

import e2.InterfaceC0422a;

/* renamed from: B.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0019u extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0014o f451e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f452f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0019u(C0014o c0014o, int i3) {
        super(0);
        this.f451e = c0014o;
        this.f452f = i3;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        return Integer.valueOf(((C0.H) this.f451e.f431e).e(this.f452f));
    }
}
