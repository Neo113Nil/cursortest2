package F;

/* loaded from: classes.dex */
public final class B extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r0.H f864e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f865f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f866g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r0.H f867h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f868i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r0.H f869j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f870k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(r0.H h3, int i3, int i4, r0.H h4, int i5, r0.H h5, int i6) {
        super(1);
        this.f864e = h3;
        this.f865f = i3;
        this.f866g = i4;
        this.f867h = h4;
        this.f868i = i5;
        this.f869j = h5;
        this.f870k = i6;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        r0.G g3 = (r0.G) obj;
        int i3 = this.f866g;
        r0.H h3 = this.f864e;
        if (h3 != null) {
            r0.G.f(g3, h3, 0, Math.round((1 + 0.0f) * ((i3 - this.f865f) / 2.0f)));
        }
        r0.H h4 = this.f867h;
        int i4 = this.f868i;
        r0.G.f(g3, h4, i4, 0);
        r0.H h5 = this.f869j;
        if (h5 != null) {
            r0.G.f(g3, h5, i4 + h4.f7114d, Math.round((1 + 0.0f) * ((i3 - this.f870k) / 2.0f)));
        }
        return L1.z.f2729a;
    }
}
