package b1;

import c6.m;
import d1.i;
import d1.n;
import f1.g0;
import f1.l0;
import m0.t2;
import q.c0;
import q.n0;
import q.v0;
import q6.j;
import q6.s;
import w0.p;
import w1.w1;
import w1.x1;
import x1.t;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f extends j implements p6.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1054e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1055f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1056g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1057h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(n nVar, i iVar, p6.c cVar) {
        super(1);
        this.f1054e = 1;
        this.f1055f = nVar;
        this.f1056g = iVar;
        this.f1057h = (j) cVar;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [p6.c, q6.j] */
    @Override // p6.c
    public final Object i(Object obj) {
        boolean booleanValue;
        switch (this.f1054e) {
            case 0:
                x1 x1Var = (x1) obj;
                g gVar = (g) x1Var;
                if (!((a) ((t) w1.f.v((g) this.f1056g)).m10getDragAndDropManager()).f1047b.contains(gVar) || !a.a.c(gVar, s6.a.u((b) this.f1057h))) {
                    return w1.f7817d;
                }
                ((s) this.f1055f).f6205d = x1Var;
                return w1.f7819f;
            case 1:
                n nVar = (n) obj;
                if (q6.i.a(nVar, (n) this.f1055f)) {
                    booleanValue = false;
                } else {
                    if (q6.i.a(nVar, ((i) this.f1056g).f2068c)) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    booleanValue = ((Boolean) ((j) this.f1057h).i(nVar)).booleanValue();
                }
                return Boolean.valueOf(booleanValue);
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                return new j4.b((p) this.f1055f, this.f1056g, (q.p) this.f1057h, 2);
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                g0 g0Var = (g0) obj;
                t2 t2Var = (t2) this.f1056g;
                t2 t2Var2 = (t2) this.f1055f;
                g0Var.a(t2Var2 != null ? ((Number) t2Var2.getValue()).floatValue() : 1.0f);
                g0Var.d(t2Var != null ? ((Number) t2Var.getValue()).floatValue() : 1.0f);
                g0Var.e(t2Var != null ? ((Number) t2Var.getValue()).floatValue() : 1.0f);
                t2 t2Var3 = (t2) this.f1057h;
                g0Var.f(t2Var3 != null ? ((l0) t2Var3.getValue()).f2685a : l0.f2683b);
                return m.f1757a;
            default:
                n0 n0Var = (n0) this.f1057h;
                int ordinal = ((c0) obj).ordinal();
                l0 l0Var = null;
                if (ordinal == 0) {
                    v0 v0Var = n0Var.f5880a;
                } else if (ordinal == 1) {
                    l0Var = (l0) this.f1055f;
                } else {
                    if (ordinal != 2) {
                        throw new a5.c();
                    }
                    v0 v0Var2 = n0Var.f5880a;
                }
                return new l0(l0Var != null ? l0Var.f2685a : l0.f2683b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.f1054e = i;
        this.f1055f = obj;
        this.f1056g = obj2;
        this.f1057h = obj3;
    }
}
