package n;

import e2.InterfaceC0422a;

/* loaded from: classes.dex */
public final class W extends f2.k implements InterfaceC0422a {

    /* renamed from: f, reason: collision with root package name */
    public static final W f7075f = new W(0, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final W f7076g = new W(0, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7077e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(int i3, int i4) {
        super(i3);
        this.f7077e = i4;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        switch (this.f7077e) {
            case 0:
                return C0662E.f7030a;
            default:
                return new j0();
        }
    }
}
