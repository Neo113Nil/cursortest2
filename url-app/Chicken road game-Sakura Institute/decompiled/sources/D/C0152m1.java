package D;

import A.AbstractC0017m;
import G.C0192d;
import G.C0216p;
import G.InterfaceC0213n0;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m.C0847u;
import p0.InterfaceC0945F;
import q.AbstractC1035n;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;
import s0.AbstractC1144g0;

/* renamed from: D.m1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0152m1 extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S.o f1896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Z.P f1897e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f1898i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f1899j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0847u f1900k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f1901l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ O.a f1902m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0152m1(S.o oVar, Z.P p4, long j4, float f4, C0847u c0847u, float f5, O.a aVar) {
        super(2);
        this.f1896d = oVar;
        this.f1897e = p4;
        this.f1898i = j4;
        this.f1899j = f4;
        this.f1900k = c0847u;
        this.f1901l = f5;
        this.f1902m = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        C0216p c0216p = (C0216p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else {
            long d4 = AbstractC0161p1.d(this.f1898i, this.f1899j, c0216p);
            float L3 = ((M0.b) c0216p.k(AbstractC1144g0.f10218f)).L(this.f1901l);
            S.o c4 = AbstractC0161p1.c(this.f1896d, this.f1897e, d4, this.f1900k, L3);
            C0173u c0173u = C0173u.f2037m;
            AtomicInteger atomicInteger = y0.k.f11579a;
            S.o a4 = l0.w.a(c4.h(new AppendedSemanticsElement(c0173u, false)), Unit.f7487a, new C0149l1(2, null));
            InterfaceC0945F e4 = AbstractC1035n.e(S.b.f3952d, true);
            int i2 = c0216p.f2861P;
            InterfaceC0213n0 m4 = c0216p.m();
            S.o d5 = S.a.d(c0216p, a4);
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
            this.f1902m.h(c0216p, 0);
            c0216p.q(true);
        }
        return Unit.f7487a;
    }
}
