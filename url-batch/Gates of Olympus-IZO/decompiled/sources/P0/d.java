package P0;

import I.C0089d;
import I.C0113p;
import L1.z;
import e2.AbstractC0381e;
import h1.C0438i;
import q1.C0784h;
import r0.M;
import r0.P;
import t0.g0;
import u0.AbstractC0963b0;
import u0.T;

/* loaded from: classes.dex */
public final class d extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3030e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y1.e f3031f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3032g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3033h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3034i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Q.a aVar, Object obj, Object obj2, int i3) {
        super(2);
        this.f3030e = 1;
        this.f3031f = aVar;
        this.f3033h = obj;
        this.f3034i = obj2;
        this.f3032g = i3;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f3030e) {
            case 0:
                ((Number) obj2).intValue();
                int T2 = C0089d.T(this.f3032g | 1);
                Q.a aVar = (Q.a) this.f3031f;
                I2.d.b((Y1.a) this.f3033h, (o) this.f3034i, aVar, (C0113p) obj, T2);
                break;
            case 1:
                ((Number) obj2).intValue();
                int T3 = C0089d.T(this.f3032g) | 1;
                Object obj3 = this.f3033h;
                Object obj4 = this.f3034i;
                ((Q.a) this.f3031f).c(obj3, obj4, (C0113p) obj, T3);
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                ((Number) obj2).intValue();
                int T4 = C0089d.T(this.f3032g | 1);
                Q.a aVar2 = (Q.a) this.f3031f;
                ((R.i) this.f3033h).e(this.f3034i, aVar2, (C0113p) obj, T4);
                break;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                ((Number) obj2).intValue();
                int T5 = C0089d.T(this.f3032g | 1);
                Y1.e eVar = this.f3031f;
                M.c((P) this.f3033h, (U.l) this.f3034i, eVar, (C0113p) obj, T5);
                break;
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                ((Number) obj2).intValue();
                int T6 = C0089d.T(this.f3032g | 1);
                Q.a aVar3 = (Q.a) this.f3031f;
                AbstractC0381e.f((C0784h) this.f3033h, (R.i) this.f3034i, aVar3, (C0113p) obj, T6);
                break;
            case 5:
                ((Number) obj2).intValue();
                int T7 = C0089d.T(this.f3032g | 1);
                Q.a aVar4 = (Q.a) this.f3031f;
                ((u.P) this.f3033h).e(this.f3034i, aVar4, (C0113p) obj, T7);
                break;
            default:
                ((Number) obj2).intValue();
                int T8 = C0089d.T(this.f3032g | 1);
                AbstractC0963b0.a((g0) this.f3033h, (T) this.f3034i, (Q.a) this.f3031f, (C0113p) obj, T8);
                break;
        }
        return z.f2729a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, Y1.e eVar, int i3, int i4) {
        super(2);
        this.f3030e = i4;
        this.f3033h = obj;
        this.f3034i = obj2;
        this.f3031f = eVar;
        this.f3032g = i3;
    }
}
