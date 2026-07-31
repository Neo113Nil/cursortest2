package l;

import b0.C0265P;
import d0.AbstractC0322c;
import d0.InterfaceC0323d;

/* loaded from: classes.dex */
public final class C extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5417e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f5418f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f5419g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f5420h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5421i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(Object obj, long j3, long j4, Object obj2, int i3) {
        super(1);
        this.f5417e = i3;
        this.f5420h = obj;
        this.f5418f = j3;
        this.f5419g = j4;
        this.f5421i = obj2;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f5417e) {
            case 0:
                r0.G g3 = (r0.G) obj;
                long j3 = this.f5418f;
                long j4 = this.f5419g;
                R.h hVar = (R.h) this.f5421i;
                r0.H h3 = (r0.H) this.f5420h;
                g3.getClass();
                long c3 = I2.d.c(((int) (j3 >> 32)) + ((int) (j4 >> 32)), ((int) (j3 & 4294967295L)) + ((int) (j4 & 4294967295L)));
                r0.G.a(g3, h3);
                h3.Q(M0.g.c(c3, h3.f7118h), 0.0f, hVar);
                break;
            default:
                t0.F f3 = (t0.F) obj;
                f3.b();
                InterfaceC0323d.q(f3, (C0265P) this.f5420h, this.f5418f, this.f5419g, 0.0f, (AbstractC0322c) this.f5421i, 104);
                break;
        }
        return L1.z.f2729a;
    }
}
