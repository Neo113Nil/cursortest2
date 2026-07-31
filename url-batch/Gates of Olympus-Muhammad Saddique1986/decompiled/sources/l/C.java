package l;

import b0.T;
import d0.AbstractC0404e;
import d0.InterfaceC0403d;
import e2.InterfaceC0424c;
import r0.AbstractC0892N;
import r0.AbstractC0893O;

/* loaded from: classes.dex */
public final class C extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6432e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f6433f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f6434g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f6435h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6436i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(Object obj, long j3, long j4, Object obj2, int i3) {
        super(1);
        this.f6432e = i3;
        this.f6435h = obj;
        this.f6433f = j3;
        this.f6434g = j4;
        this.f6436i = obj2;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f6432e) {
            case 0:
                AbstractC0892N abstractC0892N = (AbstractC0892N) obj;
                long j3 = this.f6433f;
                long j4 = this.f6434g;
                R.h hVar = (R.h) this.f6436i;
                AbstractC0893O abstractC0893O = (AbstractC0893O) this.f6435h;
                abstractC0892N.getClass();
                long c2 = l0.c.c(((int) (j3 >> 32)) + ((int) (j4 >> 32)), ((int) (j3 & 4294967295L)) + ((int) (j4 & 4294967295L)));
                AbstractC0892N.a(abstractC0892N, abstractC0893O);
                abstractC0893O.f0(O0.h.c(c2, abstractC0893O.f8130h), 0.0f, hVar);
                break;
            default:
                t0.G g3 = (t0.G) obj;
                g3.b();
                InterfaceC0403d.s(g3, (T) this.f6435h, this.f6433f, this.f6434g, 0.0f, (AbstractC0404e) this.f6436i, 104);
                break;
        }
        return R1.y.f4171a;
    }
}
