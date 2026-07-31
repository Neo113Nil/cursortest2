package l;

/* renamed from: l.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0562g extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r0.H[] f5467e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0563h f5468f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5469g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5470h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0562g(r0.H[] hArr, C0563h c0563h, int i3, int i4) {
        super(1);
        this.f5467e = hArr;
        this.f5468f = c0563h;
        this.f5469g = i3;
        this.f5470h = i4;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        r0.G g3 = (r0.G) obj;
        for (r0.H h3 : this.f5467e) {
            if (h3 != null) {
                long a3 = this.f5468f.f5471a.f5480b.a(I2.l.e(h3.f7114d, h3.f7115e), I2.l.e(this.f5469g, this.f5470h), M0.j.f2775d);
                r0.G.d(g3, h3, (int) (a3 >> 32), (int) (a3 & 4294967295L));
            }
        }
        return L1.z.f2729a;
    }
}
