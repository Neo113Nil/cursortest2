package P0;

import I.C0089d;
import I.C0113p;
import L1.z;
import h.AbstractC0416e;
import h1.C0438i;
import m.C0583H;
import r.AbstractC0818o;
import s.C0863f;
import s.C0866i;
import u.C0940h;
import u0.C0961a0;

/* loaded from: classes.dex */
public final class m extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3047e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3048f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3049g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj, int i3, int i4) {
        super(2);
        this.f3047e = i4;
        this.f3049g = obj;
        this.f3048f = i3;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f3047e) {
            case 0:
                ((Number) obj2).intValue();
                int T2 = C0089d.T(this.f3048f | 1);
                ((n) this.f3049g).a(T2, (C0113p) obj);
                break;
            case 1:
                ((Number) obj2).intValue();
                int T3 = C0089d.T(this.f3048f | 1);
                ((C0583H) this.f3049g).a(T3, (C0113p) obj);
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                ((Number) obj2).intValue();
                int T4 = C0089d.T(this.f3048f | 1);
                AbstractC0818o.a((U.l) this.f3049g, (C0113p) obj, T4);
                break;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                ((Number) obj2).intValue();
                int T5 = C0089d.T(this.f3048f | 1);
                AbstractC0416e.c((r1.p) this.f3049g, (C0113p) obj, T5);
                break;
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                C0113p c0113p = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p.x()) {
                    c0113p.L();
                } else {
                    C0866i c0866i = (C0866i) this.f3049g;
                    F2.h hVar = c0866i.f7372b.f7365h;
                    int i3 = this.f3048f;
                    C0940h e3 = hVar.e(i3);
                    int i4 = i3 - e3.f8066a;
                    ((C0863f) e3.f8068c).f7364c.e(c0866i.f7373c, Integer.valueOf(i4), c0113p, 0);
                }
                break;
            case 5:
                C0113p c0113p2 = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p2.x()) {
                    c0113p2.L();
                } else {
                    F2.h hVar2 = ((t.h) this.f3049g).f7587b.f7585i;
                    int i5 = this.f3048f;
                    C0940h e4 = hVar2.e(i5);
                    ((t.e) e4.f8068c).f7580d.e(t.i.f7589a, Integer.valueOf(i5 - e4.f8066a), c0113p2, 6);
                }
                break;
            case 6:
                ((Number) obj2).intValue();
                int T6 = C0089d.T(this.f3048f | 1);
                AbstractC0416e.e((Q.a) this.f3049g, (C0113p) obj, T6);
                break;
            default:
                ((Number) obj2).intValue();
                int T7 = C0089d.T(this.f3048f | 1);
                ((C0961a0) this.f3049g).a(T7, (C0113p) obj);
                break;
        }
        return z.f2729a;
    }
}
