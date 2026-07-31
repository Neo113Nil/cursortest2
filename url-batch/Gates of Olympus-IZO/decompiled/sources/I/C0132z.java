package I;

/* renamed from: I.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0132z extends AbstractC0114p0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2412b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2413c;

    public C0132z(N0 n02, Y1.a aVar) {
        super(aVar);
        this.f2413c = n02;
    }

    @Override // I.AbstractC0114p0
    public final C0116q0 a(Object obj) {
        switch (this.f2412b) {
            case 0:
                return new C0116q0(this, obj, obj == null, null, true);
            default:
                return new C0116q0(this, obj, obj == null, (N0) this.f2413c, true);
        }
    }

    @Override // I.AbstractC0114p0
    public a1 b() {
        switch (this.f2412b) {
            case 0:
                return (A) this.f2413c;
            default:
                return super.b();
        }
    }

    public C0132z() {
        super(C0083a.f2232g);
        this.f2413c = new A();
    }
}
