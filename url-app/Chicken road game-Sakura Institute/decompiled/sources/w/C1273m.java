package w;

import Q.AbstractC0274j;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC0967c;
import p0.InterfaceC0945F;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import p0.InterfaceC0977m;
import z2.C1412P;

/* renamed from: w.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1273m implements InterfaceC0945F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P f11245a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f11246b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G0.y f11247c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ G0.s f11248d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ M0.b f11249e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11250f;

    public C1273m(P p4, Function1 function1, G0.y yVar, G0.s sVar, M0.b bVar, int i2) {
        this.f11245a = p4;
        this.f11246b = function1;
        this.f11247c = yVar;
        this.f11248d = sVar;
        this.f11249e = bVar;
        this.f11250f = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0275  */
    @Override // p0.InterfaceC0945F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC0946G f(InterfaceC0947H interfaceC0947H, List list, long j4) {
        P p4;
        boolean z4;
        o0 o0Var;
        A0.I i2;
        int k4;
        int i4;
        A0.q qVar;
        A0.I i5;
        C1273m c1273m;
        P p5;
        P p6 = this.f11245a;
        AbstractC0274j c4 = Q.w.c();
        Function1 f4 = c4 != null ? c4.f() : null;
        AbstractC0274j d4 = Q.w.d(c4);
        try {
            o0 d5 = p6.d();
            A0.I i6 = d5 != null ? d5.f11290a : null;
            X x2 = p6.f11054a;
            M0.k layoutDirection = interfaceC0947H.getLayoutDirection();
            int i7 = x2.f11123f;
            boolean z5 = x2.f11122e;
            int i8 = x2.f11120c;
            if (i6 != null) {
                A0.o oVar = i6.f290b;
                if (!oVar.f350a.b()) {
                    A0.H h4 = i6.f289a;
                    if (Intrinsics.a(h4.f279a, x2.f11118a) && h4.f280b.c(x2.f11119b) && Intrinsics.a(h4.f281c, x2.f11126i) && h4.f282d == i8 && h4.f283e == z5 && u3.l.b0(h4.f284f, i7) && Intrinsics.a(h4.f285g, x2.f11124g) && h4.f286h == layoutDirection && Intrinsics.a(h4.f287i, x2.f11125h)) {
                        int k5 = M0.a.k(j4);
                        z4 = z5;
                        long j5 = h4.f288j;
                        if (k5 == M0.a.k(j5) && (!(z4 || u3.l.b0(i7, 2)) || (M0.a.i(j4) == M0.a.i(j5) && M0.a.h(j4) == M0.a.h(j5)))) {
                            p4 = p6;
                            i2 = i6;
                            o0Var = d5;
                            i5 = new A0.I(new A0.H(h4.f279a, x2.f11119b, h4.f281c, h4.f282d, h4.f283e, h4.f284f, h4.f285g, h4.f286h, h4.f287i, j4), oVar, u3.d.p(j4, u3.d.c(M.k(oVar.f353d), M.k(oVar.f354e))));
                            long j6 = i5.f291c;
                            Integer valueOf = Integer.valueOf((int) (j6 >> 32));
                            Integer valueOf2 = Integer.valueOf((int) (j6 & 4294967295L));
                            int intValue = valueOf.intValue();
                            int intValue2 = valueOf2.intValue();
                            if (Intrinsics.a(i2, i5)) {
                                o0 o0Var2 = o0Var;
                                o0 o0Var3 = new o0(i5, o0Var2 != null ? o0Var2.f11292c : null);
                                p5 = p4;
                                p5.f11062i.setValue(o0Var3);
                                p5.f11069p = false;
                                c1273m = this;
                                c1273m.f11246b.invoke(i5);
                                M.q(p5, c1273m.f11247c, c1273m.f11248d);
                            } else {
                                c1273m = this;
                                p5 = p4;
                            }
                            p5.f11060g.setValue(new M0.e(c1273m.f11249e.i0(c1273m.f11250f != 1 ? M.k(i5.f290b.b(0)) : 0)));
                            return interfaceC0947H.t(intValue, intValue2, C1412P.e(new Pair(AbstractC0967c.f9034a, Integer.valueOf(Math.round(i5.f292d))), new Pair(AbstractC0967c.f9035b, Integer.valueOf(Math.round(i5.f293e)))), C1265e.f11163i);
                        }
                        p4 = p6;
                        o0Var = d5;
                        i2 = i6;
                        x2.a(layoutDirection);
                        k4 = M0.a.k(j4);
                        i4 = ((!z4 || u3.l.b0(i7, 2)) && M0.a.e(j4)) ? M0.a.i(j4) : Integer.MAX_VALUE;
                        int i9 = (z4 && u3.l.b0(i7, 2)) ? 1 : i8;
                        if (k4 != i4) {
                            A0.q qVar2 = x2.f11127j;
                            if (qVar2 == null) {
                                throw new IllegalStateException("layoutIntrinsics must be called first");
                            }
                            i4 = kotlin.ranges.b.e(M.k(qVar2.c()), k4, i4);
                        }
                        qVar = x2.f11127j;
                        if (qVar != null) {
                            throw new IllegalStateException("layoutIntrinsics must be called first");
                        }
                        int h5 = M0.a.h(j4);
                        int min = Math.min(0, 262142);
                        int min2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
                        int l4 = u3.d.l(min2 == Integer.MAX_VALUE ? min : min2);
                        A0.o oVar2 = new A0.o(qVar, u3.d.a(min, min2, Math.min(l4, 0), h5 != Integer.MAX_VALUE ? Math.min(l4, h5) : Integer.MAX_VALUE), i9, u3.l.b0(i7, 2));
                        i5 = new A0.I(new A0.H(x2.f11118a, x2.f11119b, x2.f11126i, x2.f11120c, x2.f11122e, x2.f11123f, x2.f11124g, layoutDirection, x2.f11125h, j4), oVar2, u3.d.p(j4, u3.d.c(M.k(oVar2.f353d), M.k(oVar2.f354e))));
                        long j62 = i5.f291c;
                        Integer valueOf3 = Integer.valueOf((int) (j62 >> 32));
                        Integer valueOf22 = Integer.valueOf((int) (j62 & 4294967295L));
                        int intValue3 = valueOf3.intValue();
                        int intValue22 = valueOf22.intValue();
                        if (Intrinsics.a(i2, i5)) {
                        }
                        p5.f11060g.setValue(new M0.e(c1273m.f11249e.i0(c1273m.f11250f != 1 ? M.k(i5.f290b.b(0)) : 0)));
                        return interfaceC0947H.t(intValue3, intValue22, C1412P.e(new Pair(AbstractC0967c.f9034a, Integer.valueOf(Math.round(i5.f292d))), new Pair(AbstractC0967c.f9035b, Integer.valueOf(Math.round(i5.f293e)))), C1265e.f11163i);
                    }
                }
            }
            p4 = p6;
            z4 = z5;
            o0Var = d5;
            i2 = i6;
            x2.a(layoutDirection);
            k4 = M0.a.k(j4);
            if (z4) {
            }
            if (z4) {
            }
            if (k4 != i4) {
            }
            qVar = x2.f11127j;
            if (qVar != null) {
            }
        } finally {
            Q.w.f(c4, d4, f4);
        }
    }

    @Override // p0.InterfaceC0945F
    public final int h(InterfaceC0977m interfaceC0977m, List list, int i2) {
        P p4 = this.f11245a;
        p4.f11054a.a(interfaceC0977m.getLayoutDirection());
        A0.q qVar = p4.f11054a.f11127j;
        if (qVar != null) {
            return M.k(qVar.c());
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }
}
