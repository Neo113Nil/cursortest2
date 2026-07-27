package w;

import A.AbstractC0017m;
import G.C0192d;
import G.C0216p;
import G.InterfaceC0213n0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p0.InterfaceC0980p;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;

/* renamed from: w.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1274n extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ A.a0 f11257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ P f11258e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f11259i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f11260j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function1 f11261k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ G0.y f11262l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ G0.s f11263m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ M0.b f11264n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11265o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1274n(A.a0 a0Var, P p4, boolean z4, boolean z5, Function1 function1, G0.y yVar, G0.s sVar, M0.b bVar, int i2) {
        super(2);
        this.f11257d = a0Var;
        this.f11258e = p4;
        this.f11259i = z4;
        this.f11260j = z5;
        this.f11261k = function1;
        this.f11262l = yVar;
        this.f11263m = sVar;
        this.f11264n = bVar;
        this.f11265o = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0095, code lost:
    
        if (r2 != false) goto L26;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Object obj, Object obj2) {
        C0216p c0216p = (C0216p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else {
            G0.y yVar = this.f11262l;
            G0.s sVar = this.f11263m;
            P p4 = this.f11258e;
            C1273m c1273m = new C1273m(p4, this.f11261k, yVar, sVar, this.f11264n, this.f11265o);
            S.l lVar = S.l.f3977a;
            int i2 = c0216p.f2861P;
            InterfaceC0213n0 m4 = c0216p.m();
            S.o d4 = S.a.d(c0216p, lVar);
            InterfaceC1070k.f9822h.getClass();
            C1068i c1068i = C1069j.f9816b;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, c1273m, C1069j.f9820f);
            C0192d.R(c0216p, m4, C1069j.f9819e);
            C1067h c1067h = C1069j.f9821g;
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i2))) {
                AbstractC0017m.r(i2, c0216p, i2, c1067h);
            }
            C0192d.R(c0216p, d4, C1069j.f9818d);
            boolean z4 = true;
            c0216p.q(true);
            EnumC1257F a4 = p4.a();
            EnumC1257F enumC1257F = EnumC1257F.f11023d;
            boolean z5 = this.f11259i;
            if (a4 != enumC1257F && p4.c() != null) {
                InterfaceC0980p c4 = p4.c();
                Intrinsics.c(c4);
                if (c4.p()) {
                }
            }
            z4 = false;
            A.a0 a0Var = this.f11257d;
            M.f(a0Var, z4, c0216p, 0);
            if (p4.a() == EnumC1257F.f11025i && !this.f11260j && z5) {
                c0216p.S(-2032274);
                M.e(a0Var, c0216p, 0);
                c0216p.q(false);
            } else {
                c0216p.S(-1955394);
                c0216p.q(false);
            }
        }
        return Unit.f7487a;
    }
}
