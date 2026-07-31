package F;

import I.C0105l;
import I.C0113p;
import I.C0119s0;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import b0.AbstractC0259J;
import d0.InterfaceC0323d;
import e2.AbstractC0381e;
import e2.C0377a;
import java.util.concurrent.atomic.AtomicInteger;
import m.C0610u;

/* renamed from: F.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0076y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1428a;

    /* renamed from: b, reason: collision with root package name */
    public static final U.l f1429b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f1430c = 240;

    /* renamed from: d, reason: collision with root package name */
    public static final float f1431d = H.k.f1746c;

    static {
        float f3 = 10;
        f1428a = f3;
        f1429b = androidx.compose.foundation.layout.a.n(androidx.compose.ui.layout.a.b(C0068u0.f1394e).e(new AppendedSemanticsElement(C0058p.f1324i, true)), 0.0f, f3, 1);
        new C0610u(0.2f, 0.0f, 0.8f, 1.0f);
        new C0610u(0.4f, 0.0f, 1.0f, 1.0f);
        new C0610u(0.0f, 0.0f, 0.65f, 1.0f);
        new C0610u(0.1f, 0.0f, 0.45f, 1.0f);
        new C0610u(0.4f, 0.0f, 0.2f, 1.0f);
    }

    public static final void a(Y1.a aVar, U.l lVar, long j3, long j4, int i3, float f3, Y1.c cVar, C0113p c0113p, int i4) {
        int i5;
        float f4;
        int i6;
        int i7;
        Y1.c cVar2;
        Y1.c cVar3;
        U.l lVar2;
        Y1.c cVar4;
        int i8;
        float f5;
        int i9 = 2;
        c0113p.S(-339970038);
        if ((i4 & 6) == 0) {
            i5 = (c0113p.h(aVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= c0113p.f(lVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= c0113p.e(j3) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= c0113p.e(j4) ? 2048 : 1024;
        }
        int i10 = 221184 | i5;
        if ((1572864 & i4) == 0) {
            i10 = 745472 | i5;
        }
        if ((599187 & i10) == 599186 && c0113p.x()) {
            c0113p.L();
            i8 = i3;
            f5 = f3;
            cVar4 = cVar;
        } else {
            c0113p.N();
            int i11 = i4 & 1;
            Object obj = C0105l.f2272a;
            if (i11 == 0 || c0113p.w()) {
                int i12 = AbstractC0064s0.f1373a;
                f4 = AbstractC0064s0.f1375c;
                boolean z3 = ((((i10 & 896) ^ 384) > 256 && c0113p.e(j3)) || (i10 & 384) == 256) | ((i10 & 57344) == 16384);
                Object G3 = c0113p.G();
                if (z3 || G3 == obj) {
                    G3 = new C0070v0(j3, i12);
                    c0113p.a0(G3);
                }
                i6 = i12;
                i7 = i10 & (-3670017);
                cVar2 = (Y1.c) G3;
            } else {
                c0113p.L();
                i7 = i10 & (-3670017);
                i6 = i3;
                f4 = f3;
                cVar2 = cVar;
            }
            c0113p.q();
            boolean z4 = (i7 & 14) == 4;
            Object G4 = c0113p.G();
            if (z4 || G4 == obj) {
                G4 = new A2.l(5, aVar);
                c0113p.a0(G4);
            }
            Y1.a aVar2 = (Y1.a) G4;
            U.l e3 = lVar.e(f1429b);
            boolean f6 = c0113p.f(aVar2);
            Object G5 = c0113p.G();
            if (f6 || G5 == obj) {
                G5 = new C0047j0(i9, aVar2);
                c0113p.a0(G5);
            }
            AtomicInteger atomicInteger = z0.k.f8985a;
            U.l r3 = androidx.compose.foundation.layout.a.r(e3.e(new AppendedSemanticsElement((Y1.c) G5, true)), f1430c, f1431d);
            boolean f7 = ((i7 & 57344) == 16384) | ((458752 & i7) == 131072) | c0113p.f(aVar2) | ((((i7 & 7168) ^ 3072) > 2048 && c0113p.e(j4)) || (i7 & 3072) == 2048) | ((((i7 & 896) ^ 384) > 256 && c0113p.e(j3)) || (i7 & 384) == 256) | c0113p.f(cVar2);
            Object G6 = c0113p.G();
            if (f7 || G6 == obj) {
                cVar3 = cVar2;
                lVar2 = r3;
                Object c0072w0 = new C0072w0(i6, f4, aVar2, j4, j3, cVar3);
                c0113p.a0(c0072w0);
                G6 = c0072w0;
            } else {
                cVar3 = cVar2;
                lVar2 = r3;
            }
            g2.i.B(lVar2, (Y1.c) G6, c0113p, 0);
            cVar4 = cVar3;
            i8 = i6;
            f5 = f4;
        }
        C0119s0 r4 = c0113p.r();
        if (r4 != null) {
            r4.f2347d = new C0074x0(aVar, lVar, j3, j4, i8, f5, cVar4, i4);
        }
    }

    public static final void b(InterfaceC0323d interfaceC0323d, float f3, float f4, long j3, float f5, int i3) {
        float d3 = a0.f.d(interfaceC0323d.c());
        float b2 = a0.f.b(interfaceC0323d.c());
        float f6 = 2;
        float f7 = b2 / f6;
        boolean z3 = interfaceC0323d.getLayoutDirection() == M0.j.f2775d;
        float f8 = (z3 ? f3 : 1.0f - f4) * d3;
        float f9 = (z3 ? f4 : 1.0f - f3) * d3;
        if (AbstractC0259J.q(i3, 0) || b2 > d3) {
            interfaceC0323d.V(j3, I2.l.f(f8, f7), I2.l.f(f9, f7), f5, (r22 & 16) != 0 ? 0 : 0, 1.0f, null, 3);
            return;
        }
        float f10 = f5 / f6;
        C0377a c0377a = new C0377a(f10, d3 - f10);
        float floatValue = ((Number) AbstractC0381e.t(Float.valueOf(f8), c0377a)).floatValue();
        float floatValue2 = ((Number) AbstractC0381e.t(Float.valueOf(f9), c0377a)).floatValue();
        if (Math.abs(f4 - f3) > 0.0f) {
            interfaceC0323d.V(j3, I2.l.f(floatValue, f7), I2.l.f(floatValue2, f7), f5, (r22 & 16) != 0 ? 0 : i3, 1.0f, null, 3);
        }
    }
}
