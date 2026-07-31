package s;

import e2.InterfaceC0422a;

/* renamed from: s.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0953v extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8339e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f8340f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0953v(int i3, int i4) {
        super(0);
        this.f8339e = i3;
        this.f8340f = i4;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        return new C0951t(this.f8339e, this.f8340f);
    }
}
