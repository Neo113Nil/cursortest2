package B;

import e2.InterfaceC0422a;

/* loaded from: classes.dex */
public final class O extends f2.k implements InterfaceC0422a {

    /* renamed from: f, reason: collision with root package name */
    public static final O f306f = new O(0, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final O f307g = new O(0, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f308e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O(int i3, int i4) {
        super(i3);
        this.f308e = i4;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        switch (this.f308e) {
            case 0:
                return null;
            default:
                return k0.f419b;
        }
    }
}
