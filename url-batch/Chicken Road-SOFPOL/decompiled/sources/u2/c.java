package u2;

import m0.s;
import w1.k1;
import x1.b1;
import x1.o0;
import x1.t;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c extends q6.j implements p6.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7309e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7310f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f7311g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p6.e f7312h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, p6.e eVar, int i, int i8) {
        super(2);
        this.f7309e = i8;
        this.f7310f = obj;
        this.f7311g = obj2;
        this.f7312h = eVar;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f7309e) {
            case 0:
                ((Number) obj2).intValue();
                r2.o.b((p6.a) this.f7310f, (o) this.f7311g, (u0.c) this.f7312h, (s) obj, m0.b.w(385));
                break;
            case 1:
                s sVar = (s) obj;
                int intValue = ((Number) obj2).intValue();
                if (sVar.N(intValue & 1, (intValue & 3) != 2)) {
                    b1.a((t) this.f7310f, (o0) this.f7311g, this.f7312h, sVar, 0);
                } else {
                    sVar.Q();
                }
                break;
            default:
                ((Number) obj2).intValue();
                b1.a((k1) this.f7310f, (o0) this.f7311g, this.f7312h, (s) obj, m0.b.w(1));
                break;
        }
        return c6.m.f1757a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(t tVar, o0 o0Var, p6.e eVar) {
        super(2);
        this.f7309e = 1;
        this.f7310f = tVar;
        this.f7311g = o0Var;
        this.f7312h = eVar;
    }
}
