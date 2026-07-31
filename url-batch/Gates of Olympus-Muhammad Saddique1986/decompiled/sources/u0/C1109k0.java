package u0;

import e2.InterfaceC0422a;

/* renamed from: u0.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1109k0 extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9384e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f9385f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f9386g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f9387h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1109k0(x.Q q3, Z.p pVar, boolean z3) {
        super(0);
        this.f9386g = q3;
        this.f9387h = pVar;
        this.f9385f = z3;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        K0 k02;
        switch (this.f9384e) {
            case 0:
                if (this.f9385f) {
                    y1.e eVar = (y1.e) this.f9386g;
                    eVar.getClass();
                    String str = (String) this.f9387h;
                    f2.j.f(str, "key");
                    eVar.f10387a.c(str);
                }
                return R1.y.f4171a;
            default:
                x.Q q3 = (x.Q) this.f9386g;
                if (!q3.b()) {
                    ((Z.p) this.f9387h).a(Z.i.f4681i);
                } else if (!this.f9385f && (k02 = q3.f9977c) != null) {
                    ((C1103h0) k02).b();
                }
                return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1109k0(boolean z3, y1.e eVar, String str) {
        super(0);
        this.f9385f = z3;
        this.f9386g = eVar;
        this.f9387h = str;
    }
}
