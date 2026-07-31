package F;

/* renamed from: F.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0059p0 extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r0.H f1327e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r0.H f1328f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1329g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1330h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r0.H f1331i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1332j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1333k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1334l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1335m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0059p0(r0.H h3, r0.H h4, int i3, int i4, r0.H h5, int i5, int i6, int i7, int i8) {
        super(1);
        this.f1327e = h3;
        this.f1328f = h4;
        this.f1329g = i3;
        this.f1330h = i4;
        this.f1331i = h5;
        this.f1332j = i5;
        this.f1333k = i6;
        this.f1334l = i7;
        this.f1335m = i8;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        r0.G g3 = (r0.G) obj;
        r0.H h3 = this.f1327e;
        if (h3 != null) {
            r0.G.f(g3, h3, (this.f1334l - h3.f7114d) / 2, (this.f1335m - h3.f7115e) / 2);
        }
        r0.G.f(g3, this.f1328f, this.f1329g, this.f1330h);
        r0.G.f(g3, this.f1331i, this.f1332j, this.f1333k);
        return L1.z.f2729a;
    }
}
