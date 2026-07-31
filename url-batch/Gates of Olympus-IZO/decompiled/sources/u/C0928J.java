package u;

/* renamed from: u.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0928J extends Z1.j implements Y1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8013e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0931M f8014f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0928J(C0931M c0931m, int i3) {
        super(0);
        this.f8013e = i3;
        this.f8014f = c0931m;
    }

    @Override // Y1.a
    public final Object b() {
        switch (this.f8013e) {
            case 0:
                C0931M c0931m = this.f8014f;
                return Float.valueOf(c0931m.f8021r.a() - c0931m.f8021r.c());
            case 1:
                return Float.valueOf(this.f8014f.f8021r.b());
            default:
                return Float.valueOf(this.f8014f.f8021r.e());
        }
    }
}
