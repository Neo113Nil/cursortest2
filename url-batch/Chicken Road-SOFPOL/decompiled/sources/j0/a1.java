package j0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class a1 implements p6.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3526d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u1.l0 f3527e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3528f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3529g;

    public /* synthetic */ a1(int i, int i8, u1.l0 l0Var) {
        this.f3526d = 0;
        this.f3528f = i;
        this.f3527e = l0Var;
        this.f3529g = i8;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        switch (this.f3526d) {
            case 0:
                u1.k0.g((u1.k0) obj, this.f3527e, s6.a.B((this.f3528f - r0.f7230d) / 2.0f), s6.a.B((this.f3529g - r0.f7231e) / 2.0f));
                break;
            case 1:
                u1.k0.g((u1.k0) obj, this.f3527e, this.f3528f, this.f3529g);
                break;
            default:
                u1.k0.g((u1.k0) obj, this.f3527e, this.f3528f, this.f3529g);
                break;
        }
        return c6.m.f1757a;
    }

    public /* synthetic */ a1(u1.l0 l0Var, int i, int i8, int i9) {
        this.f3526d = i9;
        this.f3527e = l0Var;
        this.f3528f = i;
        this.f3529g = i8;
    }
}
