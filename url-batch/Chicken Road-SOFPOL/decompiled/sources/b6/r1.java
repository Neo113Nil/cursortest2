package b6;

import j0.g2;
import j0.o2;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class r1 implements p6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1442e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1443f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1444g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1445h;
    public final /* synthetic */ Object i;

    public /* synthetic */ r1(Boolean bool, Object obj, androidx.lifecycle.u uVar, p6.c cVar, int i) {
        this.f1441d = 3;
        this.f1444g = bool;
        this.i = obj;
        this.f1442e = uVar;
        this.f1445h = cVar;
        this.f1443f = i;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f1441d) {
            case 0:
                ((Integer) obj2).getClass();
                k.z((List) this.f1444g, (p6.c) this.f1445h, (w) this.i, (y0.m) this.f1442e, (m0.s) obj, m0.b.w(this.f1443f | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                j0.j.d((p6.a) this.f1444g, (y0.m) this.f1442e, (u2.o) this.f1445h, (u0.c) this.i, (m0.s) obj, m0.b.w(this.f1443f | 1));
                break;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                ((Integer) obj2).getClass();
                j0.z0.b((j0.b0) this.f1444g, (g2) this.f1445h, (o2) this.i, (u0.c) this.f1442e, (m0.s) obj, m0.b.w(this.f1443f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                m.a.b((Boolean) this.f1444g, this.i, (androidx.lifecycle.u) this.f1442e, (p6.c) this.f1445h, (m0.s) obj, m0.b.w(this.f1443f | 1));
                break;
        }
        return c6.m.f1757a;
    }

    public /* synthetic */ r1(Object obj, Object obj2, Object obj3, Object obj4, int i, int i8) {
        this.f1441d = i8;
        this.f1444g = obj;
        this.f1445h = obj2;
        this.i = obj3;
        this.f1442e = obj4;
        this.f1443f = i;
    }

    public /* synthetic */ r1(p6.a aVar, y0.m mVar, u2.o oVar, u0.c cVar, int i) {
        this.f1441d = 1;
        this.f1444g = aVar;
        this.f1442e = mVar;
        this.f1445h = oVar;
        this.i = cVar;
        this.f1443f = i;
    }
}
