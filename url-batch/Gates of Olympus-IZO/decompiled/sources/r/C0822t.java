package r;

/* renamed from: r.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0822t extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r0.H[] f7094e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0823u f7095f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7096g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t0.O f7097h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int[] f7098i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0822t(r0.H[] hArr, C0823u c0823u, int i3, t0.O o3, int[] iArr) {
        super(1);
        this.f7094e = hArr;
        this.f7095f = c0823u;
        this.f7096g = i3;
        this.f7097h = o3;
        this.f7098i = iArr;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        r0.G g3 = (r0.G) obj;
        r0.H[] hArr = this.f7094e;
        int length = hArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            r0.H h3 = hArr[i3];
            Z1.i.c(h3);
            boolean z3 = h3.r() instanceof C0800L;
            M0.j layoutDirection = this.f7097h.getLayoutDirection();
            C0823u c0823u = this.f7095f;
            c0823u.getClass();
            r0.G.d(g3, h3, c0823u.f7100b.a(0, this.f7096g - h3.f7114d, layoutDirection), this.f7098i[i4]);
            i3++;
            i4++;
        }
        return L1.z.f2729a;
    }
}
