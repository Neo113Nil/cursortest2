package F;

/* renamed from: F.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0037e0 extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1225e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r0.H f1226f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1227g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1228h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0037e0(int i3, r0.H h3, int i4) {
        super(1);
        this.f1227g = i3;
        this.f1226f = h3;
        this.f1228h = i4;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f1225e) {
            case 0:
                r0.G.d((r0.G) obj, this.f1226f, M1.B.M((this.f1227g - r0.f7114d) / 2.0f), M1.B.M((this.f1228h - r0.f7115e) / 2.0f));
                break;
            default:
                r0.G.d((r0.G) obj, this.f1226f, this.f1227g, this.f1228h);
                break;
        }
        return L1.z.f2729a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0037e0(r0.H h3, int i3, int i4) {
        super(1);
        this.f1226f = h3;
        this.f1227g = i3;
        this.f1228h = i4;
    }
}
