package F;

import D1.C0014b;
import h1.C0438i;
import java.util.Collection;
import s.C0858a;
import s.C0880w;
import u.AbstractC0926H;
import u.C0923E;
import u.C0925G;

/* renamed from: F.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0066t0 extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1387e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1388f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1389g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0066t0(int i3, Collection collection) {
        super(1);
        this.f1387e = 1;
        this.f1388f = i3;
        this.f1389g = collection;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f1387e) {
            case 0:
                r0.G.d((r0.G) obj, (r0.H) this.f1389g, 0, -this.f1388f);
                break;
            case 1:
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                C0923E c0923e = (C0923E) obj;
                C0858a c0858a = ((C0880w) this.f1389g).f7474a;
                S.i c3 = S.u.c();
                S.u.f(c3, S.u.d(c3), c3 != null ? c3.f() : null);
                for (int i3 = 0; i3 < c0858a.f7341a; i3++) {
                    int i4 = this.f1388f + i3;
                    c0923e.getClass();
                    long j3 = AbstractC0926H.f8011a;
                    C0925G c0925g = c0923e.f8007b;
                    C0014b c0014b = c0925g.f8010c;
                    if (c0014b != null) {
                        c0923e.f8006a.add(new u.Q(c0014b, i4, j3, c0925g.f8009b));
                    }
                }
                break;
            default:
                C0923E c0923e2 = (C0923E) obj;
                C0858a c0858a2 = ((t.y) this.f1389g).f7688a;
                S.i c4 = S.u.c();
                S.u.f(c4, S.u.d(c4), c4 != null ? c4.f() : null);
                for (int i5 = 0; i5 < c0858a2.f7341a; i5++) {
                    int i6 = this.f1388f + i5;
                    c0923e2.getClass();
                    long j4 = AbstractC0926H.f8011a;
                    C0925G c0925g2 = c0923e2.f8007b;
                    C0014b c0014b2 = c0925g2.f8010c;
                    if (c0014b2 != null) {
                        c0923e2.f8006a.add(new u.Q(c0014b2, i6, j4, c0925g2.f8009b));
                    }
                }
                break;
        }
        return L1.z.f2729a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0066t0(Object obj, int i3, int i4) {
        super(1);
        this.f1387e = i4;
        this.f1389g = obj;
        this.f1388f = i3;
    }
}
