package w;

import A.C0022s;
import G.C0208l;
import G.C0216p;
import a.AbstractC0345a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import s.C1093I;
import s0.C1157n;
import t.C1199c;
import y2.C1338m;

/* renamed from: w.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1275o extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P f11272d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A0.L f11273e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11274i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f11275j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m0 f11276k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ G0.y f11277l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0022s f11278m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ S.o f11279n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ S.o f11280o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ S.o f11281p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ S.o f11282q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1199c f11283r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ A.a0 f11284s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f11285t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f11286u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Function1 f11287v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ G0.s f11288w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ M0.b f11289x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1275o(P p4, A0.L l4, int i2, int i4, m0 m0Var, G0.y yVar, C0022s c0022s, S.o oVar, S.o oVar2, S.o oVar3, S.o oVar4, C1199c c1199c, A.a0 a0Var, boolean z4, boolean z5, Function1 function1, G0.s sVar, M0.b bVar) {
        super(2);
        this.f11272d = p4;
        this.f11273e = l4;
        this.f11274i = i2;
        this.f11275j = i4;
        this.f11276k = m0Var;
        this.f11277l = yVar;
        this.f11278m = c0022s;
        this.f11279n = oVar;
        this.f11280o = oVar2;
        this.f11281p = oVar3;
        this.f11282q = oVar4;
        this.f11283r = c1199c;
        this.f11284s = a0Var;
        this.f11285t = z4;
        this.f11286u = z5;
        this.f11287v = function1;
        this.f11288w = sVar;
        this.f11289x = bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        S.o q0Var;
        C0216p c0216p = (C0216p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else {
            S.l lVar = S.l.f3977a;
            P p4 = this.f11272d;
            S.o d4 = androidx.compose.foundation.layout.c.d(lVar, ((M0.e) p4.f11060g.getValue()).f3545d, 0.0f, 2);
            C1157n c1157n = C1157n.f10272m;
            int i2 = this.f11274i;
            int i4 = this.f11275j;
            A0.L l4 = this.f11273e;
            S.o b4 = S.a.b(d4, c1157n, new C1258G(i2, i4, l4));
            boolean h4 = c0216p.h(p4);
            Object I3 = c0216p.I();
            if (h4 || I3 == C0208l.f2826a) {
                I3 = new C1093I(7, p4);
                c0216p.c0(I3);
            }
            Function0 function0 = (Function0) I3;
            m0 m0Var = this.f11276k;
            o.N n2 = (o.N) m0Var.f11256e.getValue();
            G0.y yVar = this.f11277l;
            int i5 = A0.K.f300c;
            long j4 = yVar.f3094b;
            int i6 = (int) (j4 >> 32);
            long j5 = m0Var.f11255d;
            if (i6 == ((int) (j5 >> 32)) && (i6 = (int) (j4 & 4294967295L)) == ((int) (j5 & 4294967295L))) {
                i6 = A0.K.e(j4);
            }
            m0Var.f11255d = j4;
            G0.F l5 = M.l(this.f11278m, yVar.f3093a);
            int ordinal = n2.ordinal();
            if (ordinal == 0) {
                q0Var = new q0(m0Var, i6, l5, function0);
            } else {
                if (ordinal != 1) {
                    throw new C1338m();
                }
                q0Var = new C1259H(m0Var, i6, l5, function0);
            }
            AbstractC0345a.d(androidx.compose.foundation.relocation.a.a(S.a.b(u3.l.V(b4).h(q0Var).h(this.f11279n).h(this.f11280o), c1157n, new A.i0(7, l4)).h(this.f11281p).h(this.f11282q), this.f11283r), O.f.b(-363167407, new C1274n(this.f11284s, p4, this.f11285t, this.f11286u, this.f11287v, yVar, this.f11288w, this.f11289x, this.f11275j), c0216p), c0216p, 48);
        }
        return Unit.f7487a;
    }
}
