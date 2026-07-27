package A;

import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.InterfaceC0213n0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import q.AbstractC1024c;
import q.C1023b;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;

/* renamed from: A.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0007c extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f110e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ S.o f111i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0019o f112j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0007c(long j4, boolean z4, S.o oVar, InterfaceC0019o interfaceC0019o) {
        super(2);
        this.f109d = j4;
        this.f110e = z4;
        this.f111i = oVar;
        this.f112j = interfaceC0019o;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        C0216p c0216p = (C0216p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else {
            long j4 = this.f109d;
            G.W w4 = C0208l.f2826a;
            InterfaceC0019o interfaceC0019o = this.f112j;
            boolean z4 = this.f110e;
            if (j4 != 9205357640488583168L) {
                c0216p.S(-837727128);
                C1023b c1023b = z4 ? AbstractC1024c.f9241b : AbstractC1024c.f9240a;
                S.o f4 = androidx.compose.foundation.layout.c.f(this.f111i, Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), 0.0f, 0.0f, 12);
                q.f0 b4 = q.e0.b(c1023b, S.b.f3961p, c0216p, 0);
                int i2 = c0216p.f2861P;
                InterfaceC0213n0 m4 = c0216p.m();
                S.o d4 = S.a.d(c0216p, f4);
                InterfaceC1070k.f9822h.getClass();
                C1068i c1068i = C1069j.f9816b;
                c0216p.W();
                if (c0216p.f2860O) {
                    c0216p.l(c1068i);
                } else {
                    c0216p.f0();
                }
                C0192d.R(c0216p, b4, C1069j.f9820f);
                C0192d.R(c0216p, m4, C1069j.f9819e);
                C1067h c1067h = C1069j.f9821g;
                if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i2))) {
                    AbstractC0017m.r(i2, c0216p, i2, c1067h);
                }
                C0192d.R(c0216p, d4, C1069j.f9818d);
                S.l lVar = S.l.f3977a;
                boolean h4 = c0216p.h(interfaceC0019o);
                Object I3 = c0216p.I();
                if (h4 || I3 == w4) {
                    I3 = new C0006b(interfaceC0019o, 0);
                    c0216p.c0(I3);
                }
                M1.a.i(lVar, (Function0) I3, z4, c0216p, 6);
                c0216p.q(true);
                c0216p.q(false);
            } else {
                c0216p.S(-836867312);
                boolean h5 = c0216p.h(interfaceC0019o);
                Object I4 = c0216p.I();
                if (h5 || I4 == w4) {
                    I4 = new C0006b(interfaceC0019o, 1);
                    c0216p.c0(I4);
                }
                M1.a.i(this.f111i, (Function0) I4, z4, c0216p, 0);
                c0216p.q(false);
            }
        }
        return Unit.f7487a;
    }
}
