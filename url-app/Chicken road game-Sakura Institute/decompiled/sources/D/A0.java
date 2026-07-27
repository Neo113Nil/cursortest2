package D;

import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import p.C0935k;

/* loaded from: classes.dex */
public final class A0 extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q.g0 f1167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f1168e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function0 f1169i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ O.a f1170j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ S.o f1171k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f1172l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function2 f1173m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f1174n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0181x0 f1175o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0935k f1176p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1177q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(q.g0 g0Var, boolean z4, Function0 function0, O.a aVar, S.o oVar, boolean z5, Function2 function2, boolean z6, C0181x0 c0181x0, C0935k c0935k, int i2) {
        super(2);
        this.f1167d = g0Var;
        this.f1168e = z4;
        this.f1169i = function0;
        this.f1170j = aVar;
        this.f1171k = oVar;
        this.f1172l = z5;
        this.f1173m = function2;
        this.f1174n = z6;
        this.f1175o = c0181x0;
        this.f1176p = c0935k;
        this.f1177q = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int U3 = C0192d.U(this.f1177q | 1);
        O.a aVar = this.f1170j;
        Function2 function2 = this.f1173m;
        boolean z4 = this.f1174n;
        H0.b(this.f1167d, this.f1168e, this.f1169i, aVar, this.f1171k, this.f1172l, function2, z4, this.f1175o, this.f1176p, (C0216p) obj, U3);
        return Unit.f7487a;
    }
}
