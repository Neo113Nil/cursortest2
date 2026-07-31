package b6;

import java.util.List;
import m0.t2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements p6.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1403e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1404f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m0.z0 f1405g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1406h;
    public final /* synthetic */ Object i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1407j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ t2 f1408k;

    public /* synthetic */ o0(x0 x0Var, a7.u uVar, w wVar, m0.z0 z0Var, m0.z0 z0Var2, m0.z0 z0Var3, m0.z0 z0Var4) {
        this.f1402d = 0;
        this.f1403e = x0Var;
        this.f1404f = uVar;
        this.f1407j = wVar;
        this.f1405g = z0Var;
        this.f1406h = z0Var2;
        this.i = z0Var3;
        this.f1408k = z0Var4;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        int i = this.f1402d;
        c6.m mVar = c6.m.f1757a;
        t2 t2Var = this.f1408k;
        Object obj2 = this.i;
        Object obj3 = this.f1406h;
        Object obj4 = this.f1407j;
        Object obj5 = this.f1404f;
        Object obj6 = this.f1403e;
        switch (i) {
            case 0:
                x0 x0Var = (x0) obj6;
                z.f fVar = (z.f) obj;
                q6.i.e(fVar, "$this$LazyRow");
                List list = x0Var.f1501c;
                fVar.a(list.size(), new f0(1, list), new u0.c(802480018, true, new v0(list, x0Var, (a7.u) obj5, (w) obj4, this.f1405g, (m0.z0) obj3, (m0.z0) obj2, (m0.z0) t2Var)));
                return mVar;
            case 1:
                h0 h0Var = (h0) obj;
                q6.i.e(h0Var, "item");
                k.l((x0) obj6, (a7.u) obj5, this.f1405g, (m0.z0) obj3, (m0.z0) obj2, (w) obj4, (m0.z0) t2Var, h0Var, i.f1336d);
                return mVar;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                h0 h0Var2 = (h0) obj;
                q6.i.e(h0Var2, "item");
                k.l((x0) obj6, (a7.u) obj5, this.f1405g, (m0.z0) obj3, (m0.z0) obj2, (w) obj4, (m0.z0) t2Var, h0Var2, i.f1337e);
                return mVar;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                h0 h0Var3 = (h0) obj;
                q6.i.e(h0Var3, "item");
                k.l((x0) obj6, (a7.u) obj5, this.f1405g, (m0.z0) obj3, (m0.z0) obj2, (w) obj4, (m0.z0) t2Var, h0Var3, i.f1338f);
                return mVar;
            default:
                o.c0 c0Var = (o.c0) obj6;
                p4.i iVar = (p4.i) obj5;
                p6.c cVar = (p6.c) obj4;
                p6.c cVar2 = (p6.c) obj3;
                p6.c cVar3 = (p6.c) obj2;
                q.p pVar = (q.p) obj;
                float f6 = 0.0f;
                if (!((List) t2Var.getValue()).contains(pVar.b())) {
                    q.m0 m0Var = q.m0.f5873b;
                    q.n0 n0Var = q.n0.f5878b;
                    int i8 = androidx.compose.animation.a.f456b;
                    return new q.b0(m0Var, n0Var, 0.0f, new q.t0(q.h.f5839f));
                }
                String str = ((o4.d) pVar.b()).i;
                int b8 = c0Var.b(str);
                if (b8 >= 0) {
                    f6 = c0Var.f5429c[b8];
                } else {
                    c0Var.d(str, 0.0f);
                }
                if (!q6.i.a(((o4.d) pVar.c()).i, ((o4.d) pVar.b()).i)) {
                    f6 = (((Boolean) iVar.f5746c.getValue()).booleanValue() || ((Boolean) this.f1405g.getValue()).booleanValue()) ? f6 - 1.0f : f6 + 1.0f;
                }
                c0Var.d(((o4.d) pVar.c()).i, f6);
                return new q.b0((q.m0) cVar.i(pVar), (q.n0) cVar2.i(pVar), f6, (q.t0) cVar3.i(pVar));
        }
    }

    public /* synthetic */ o0(x0 x0Var, a7.u uVar, m0.z0 z0Var, m0.z0 z0Var2, m0.z0 z0Var3, w wVar, m0.z0 z0Var4, int i) {
        this.f1402d = i;
        this.f1403e = x0Var;
        this.f1404f = uVar;
        this.f1405g = z0Var;
        this.f1406h = z0Var2;
        this.i = z0Var3;
        this.f1407j = wVar;
        this.f1408k = z0Var4;
    }

    public /* synthetic */ o0(o.c0 c0Var, p4.i iVar, p6.c cVar, p6.c cVar2, p6.c cVar3, t2 t2Var, m0.z0 z0Var) {
        this.f1402d = 4;
        this.f1403e = c0Var;
        this.f1404f = iVar;
        this.f1407j = cVar;
        this.f1406h = cVar2;
        this.i = cVar3;
        this.f1408k = t2Var;
        this.f1405g = z0Var;
    }
}
