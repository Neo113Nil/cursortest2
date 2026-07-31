package n;

import a0.AbstractC0236a;
import a0.C0241f;
import d0.C0401b;
import d0.C0407h;
import d0.InterfaceC0403d;
import e2.InterfaceC0424c;

/* renamed from: n.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0692s extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f7193e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.T f7194f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f7195g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f7196h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f7197i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f7198j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f7199k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0407h f7200l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0692s(boolean z3, b0.T t3, long j3, float f3, float f4, long j4, long j5, C0407h c0407h) {
        super(1);
        this.f7193e = z3;
        this.f7194f = t3;
        this.f7195g = j3;
        this.f7196h = f3;
        this.f7197i = f4;
        this.f7198j = j4;
        this.f7199k = j5;
        this.f7200l = c0407h;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        t0.G g3 = (t0.G) obj;
        g3.b();
        if (this.f7193e) {
            InterfaceC0403d.h0(g3, this.f7194f, 0L, 0L, this.f7195g, null, 246);
        } else {
            long j3 = this.f7195g;
            float b3 = AbstractC0236a.b(j3);
            float f3 = this.f7196h;
            if (b3 < f3) {
                float f4 = this.f7197i;
                C0401b c0401b = g3.f8573d;
                float d3 = C0241f.d(c0401b.d());
                float f5 = this.f7197i;
                float f6 = d3 - f5;
                float b4 = C0241f.b(c0401b.d()) - f5;
                b0.T t3 = this.f7194f;
                long j4 = this.f7195g;
                G1.m mVar = c0401b.f5649e;
                long n3 = mVar.n();
                mVar.h().f();
                try {
                    ((G1.m) ((B.Y) mVar.f2116b).f334d).h().r(f4, f4, f6, b4, 0);
                    InterfaceC0403d.h0(g3, t3, 0L, 0L, j4, null, 246);
                } finally {
                    A.k.q(mVar, n3);
                }
            } else {
                InterfaceC0403d.h0(g3, this.f7194f, this.f7198j, this.f7199k, r.r(j3, f3), this.f7200l, 208);
            }
        }
        return R1.y.f4171a;
    }
}
