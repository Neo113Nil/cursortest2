package n1;

import o1.InterfaceC1364b;

/* renamed from: n1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1327n extends z {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11402b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11403c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1327n(C1328o c1328o, C1328o c1328o2) {
        super(c1328o2);
        this.f11403c = c1328o;
    }

    @Override // n1.z
    public final void a() {
        switch (this.f11402b) {
            case 0:
                ((C1328o) this.f11403c).g(1);
                break;
            default:
                ((InterfaceC1364b) this.f11403c).a(new l1.b(16, null));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1327n(InterfaceC1338y interfaceC1338y, InterfaceC1364b interfaceC1364b) {
        super(interfaceC1338y);
        this.f11403c = interfaceC1364b;
    }
}
