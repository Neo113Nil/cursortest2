package b6;

import android.graphics.Typeface;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class f1 implements p6.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1319e;

    public /* synthetic */ f1(int i, Object obj) {
        this.f1318d = i;
        this.f1319e = obj;
    }

    @Override // p6.g
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f1318d) {
            case 0:
                q6.i.e((q.k) obj, "$this$composable");
                q6.i.e((o4.d) obj2, "it");
                k.y((w) this.f1319e, null, (m0.s) obj3, 0);
                break;
            case 1:
                q6.i.e((q.k) obj, "$this$composable");
                q6.i.e((o4.d) obj2, "it");
                k.c((w) this.f1319e, null, (m0.s) obj3, 0);
                break;
            default:
                n2.c cVar = (n2.c) this.f1319e;
                j2.r b8 = ((j2.e) cVar.f5310e).b((j2.p) obj, (j2.k) obj2, ((j2.i) obj3).f3992a, ((j2.j) obj4).f3993a);
                if (b8 instanceof j2.r) {
                    Object obj5 = b8.f4008d;
                    q6.i.c(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
                    return (Typeface) obj5;
                }
                a0.g1 g1Var = new a0.g1(b8, cVar.f5314j);
                cVar.f5314j = g1Var;
                Object obj6 = g1Var.f85c;
                q6.i.c(obj6, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) obj6;
        }
        return c6.m.f1757a;
    }
}
