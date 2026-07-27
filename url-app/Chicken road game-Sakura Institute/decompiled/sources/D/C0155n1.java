package D;

import A.AbstractC0017m;
import G.C0192d;
import G.C0216p;
import G.InterfaceC0213n0;
import androidx.compose.material3.MinimumInteractiveModifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m.C0847u;
import p.C0935k;
import p0.InterfaceC0945F;
import q.AbstractC1035n;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;
import s0.AbstractC1144g0;

/* renamed from: D.n1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0155n1 extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S.o f1924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Z.P f1925e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f1926i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f1927j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0847u f1928k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0935k f1929l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f1930m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Function0 f1931n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f1932o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ O.a f1933p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0155n1(S.o oVar, Z.P p4, long j4, float f4, C0847u c0847u, C0935k c0935k, boolean z4, Function0 function0, float f5, O.a aVar) {
        super(2);
        this.f1924d = oVar;
        this.f1925e = p4;
        this.f1926i = j4;
        this.f1927j = f4;
        this.f1928k = c0847u;
        this.f1929l = c0935k;
        this.f1930m = z4;
        this.f1931n = function0;
        this.f1932o = f5;
        this.f1933p = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        C0216p c0216p = (C0216p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else {
            G.Y0 y02 = AbstractC0168s0.f2009a;
            S.o d4 = androidx.compose.foundation.a.d(AbstractC0161p1.c(this.f1924d.h(MinimumInteractiveModifier.f5147a), this.f1925e, AbstractC0161p1.d(this.f1926i, this.f1927j, c0216p), this.f1928k, ((M0.b) c0216p.k(AbstractC1144g0.f10218f)).L(this.f1932o)), this.f1929l, X0.a(false, 0.0f, 0L, c0216p, 0, 7), this.f1930m, null, this.f1931n, 24);
            InterfaceC0945F e4 = AbstractC1035n.e(S.b.f3952d, true);
            int i2 = c0216p.f2861P;
            InterfaceC0213n0 m4 = c0216p.m();
            S.o d5 = S.a.d(c0216p, d4);
            InterfaceC1070k.f9822h.getClass();
            C1068i c1068i = C1069j.f9816b;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, e4, C1069j.f9820f);
            C0192d.R(c0216p, m4, C1069j.f9819e);
            C1067h c1067h = C1069j.f9821g;
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i2))) {
                AbstractC0017m.r(i2, c0216p, i2, c1067h);
            }
            C0192d.R(c0216p, d5, C1069j.f9818d);
            this.f1933p.h(c0216p, 0);
            c0216p.q(true);
        }
        return Unit.f7487a;
    }
}
