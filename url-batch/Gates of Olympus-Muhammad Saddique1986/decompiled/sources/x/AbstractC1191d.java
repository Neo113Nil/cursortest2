package x;

import B.InterfaceC0013n;
import F.C0106l0;
import I.C0159l;
import I.C0167p;
import I.C0173s0;
import e2.InterfaceC0424c;
import h2.AbstractC0508a;
import r.AbstractC0856c;
import r0.C0929z;

/* renamed from: x.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1191d {

    /* renamed from: a, reason: collision with root package name */
    public static final float f10060a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f10061b;

    static {
        float f3 = 25;
        f10060a = f3;
        f10061b = (f3 * 2.0f) / 2.4142137f;
    }

    public static final void a(InterfaceC0013n interfaceC0013n, U.q qVar, long j3, C0167p c0167p, int i3) {
        int i4;
        int i5;
        c0167p.S(1776202187);
        if ((i3 & 6) == 0) {
            i4 = ((i3 & 8) == 0 ? c0167p.f(interfaceC0013n) : c0167p.h(interfaceC0013n) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.f(qVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= 128;
        }
        if ((i4 & 147) == 146 && c0167p.x()) {
            c0167p.L();
        } else {
            c0167p.N();
            if ((i3 & 1) == 0 || c0167p.w()) {
                i5 = i4 & (-897);
                j3 = 9205357640488583168L;
            } else {
                c0167p.L();
                i5 = i4 & (-897);
            }
            c0167p.q();
            int i6 = i5 & 14;
            boolean z3 = i6 == 4 || ((i5 & 8) != 0 && c0167p.h(interfaceC0013n));
            Object G3 = c0167p.G();
            if (z3 || G3 == C0159l.f2829a) {
                G3 = new C0929z(13, interfaceC0013n);
                c0167p.a0(G3);
            }
            AbstractC0508a.e(interfaceC0013n, U.b.f4462e, Q.f.b(-1653527038, new C0106l0(1, j3, A0.k.a(qVar, (InterfaceC0424c) G3)), c0167p), c0167p, i6 | 432);
        }
        long j4 = j3;
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new G.m(interfaceC0013n, qVar, j4, i3);
        }
    }

    public static final void b(U.q qVar, C0167p c0167p, int i3, int i4) {
        int i5;
        c0167p.S(694251107);
        int i6 = i4 & 1;
        if (i6 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (c0167p.f(qVar) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i5 & 3) == 2 && c0167p.x()) {
            c0167p.L();
        } else {
            if (i6 != 0) {
                qVar = U.n.f4488a;
            }
            AbstractC0856c.a(c0167p, U.a.b(androidx.compose.foundation.layout.c.i(qVar, f10061b, f10060a), C1190c.f10058e));
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C1188a(qVar, i3, i4);
        }
    }
}
