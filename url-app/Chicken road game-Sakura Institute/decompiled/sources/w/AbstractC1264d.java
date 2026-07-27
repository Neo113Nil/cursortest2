package w;

import A.InterfaceC0019o;
import D.C0145k0;
import D.C0163q0;
import G.C0208l;
import G.C0216p;
import G.C0222s0;
import kotlin.jvm.functions.Function1;
import q.AbstractC1024c;
import s0.C1157n;
import s0.C1160o0;

/* renamed from: w.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1264d {

    /* renamed from: a, reason: collision with root package name */
    public static final float f11151a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f11152b;

    static {
        float f4 = 25;
        f11151a = f4;
        f11152b = (f4 * 2.0f) / 2.4142137f;
    }

    public static final void a(InterfaceC0019o interfaceC0019o, S.o oVar, long j4, C0216p c0216p, int i2) {
        int i4;
        int i5;
        c0216p.U(1776202187);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? c0216p.f(interfaceC0019o) : c0216p.h(interfaceC0019o) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.f(oVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= 128;
        }
        if ((i4 & 147) == 146 && c0216p.z()) {
            c0216p.N();
        } else {
            c0216p.P();
            if ((i2 & 1) == 0 || c0216p.y()) {
                i5 = i4 & (-897);
                j4 = 9205357640488583168L;
            } else {
                c0216p.N();
                i5 = i4 & (-897);
            }
            c0216p.r();
            int i6 = i5 & 14;
            boolean z4 = i6 == 4 || ((i5 & 8) != 0 && c0216p.h(interfaceC0019o));
            Object I3 = c0216p.I();
            if (z4 || I3 == C0208l.f2826a) {
                I3 = new C1160o0(7, interfaceC0019o);
                c0216p.c0(I3);
            }
            M1.a.e(interfaceC0019o, S.b.f3953e, O.f.b(-1653527038, new C0145k0(1, j4, y0.k.a(oVar, (Function1) I3)), c0216p), c0216p, i6 | 432);
        }
        long j5 = j4;
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0163q0(interfaceC0019o, oVar, j5, i2, 1);
        }
    }

    public static final void b(S.o oVar, C0216p c0216p, int i2, int i4) {
        int i5;
        c0216p.U(694251107);
        int i6 = i4 & 1;
        if (i6 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (c0216p.f(oVar) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i5 & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else {
            if (i6 != 0) {
                oVar = S.l.f3977a;
            }
            AbstractC1024c.a(c0216p, S.a.b(androidx.compose.foundation.layout.c.h(oVar, f11152b, f11151a), C1157n.f10272m, C1263c.f11138d));
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C1261a(oVar, i2, i4);
        }
    }
}
