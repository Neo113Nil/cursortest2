package F;

import H2.AbstractC0080b;
import I.C0089d;
import I.C0113p;
import I.InterfaceC0110n0;
import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import b0.C0288u;
import java.util.concurrent.atomic.AtomicInteger;
import m.AbstractC0595e;
import r.AbstractC0818o;
import r0.InterfaceC0827A;
import t0.C0900h;
import t0.C0901i;
import t0.C0906n;
import t0.InterfaceC0902j;

/* renamed from: F.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0051l0 extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0043h0 f1291e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f1292f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f1293g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Y1.e f1294h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f1295i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Q.a f1296j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0051l0(C0043h0 c0043h0, boolean z3, boolean z4, Y1.e eVar, boolean z5, Q.a aVar) {
        super(2);
        this.f1291e = c0043h0;
        this.f1292f = z3;
        this.f1293g = z4;
        this.f1294h = eVar;
        this.f1295i = z5;
        this.f1296j = aVar;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        U.l lVar;
        C0113p c0113p = (C0113p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0113p.x()) {
            c0113p.L();
        } else {
            boolean z3 = this.f1293g;
            boolean z4 = this.f1292f;
            C0043h0 c0043h0 = this.f1291e;
            I.X0 a3 = l.L.a(!z3 ? c0043h0.f1258f : z4 ? c0043h0.f1253a : c0043h0.f1256d, AbstractC0595e.i(100, 0, null, 6), null, c0113p, 48, 12);
            if (this.f1294h == null || !(this.f1295i || z4)) {
                lVar = U.i.f3302a;
            } else {
                C0058p c0058p = C0058p.f1323h;
                AtomicInteger atomicInteger = z0.k.f8985a;
                lVar = new ClearAndSetSemanticsElement(c0058p);
            }
            InterfaceC0827A e3 = AbstractC0818o.e(U.a.f3280d, false);
            int i3 = c0113p.f2306P;
            InterfaceC0110n0 m3 = c0113p.m();
            U.l c3 = U.m.c(c0113p, lVar);
            InterfaceC0902j.f7933c.getClass();
            C0906n c0906n = C0901i.f7920b;
            c0113p.U();
            if (c0113p.f2305O) {
                c0113p.l(c0906n);
            } else {
                c0113p.d0();
            }
            C0089d.Q(c0113p, C0901i.f7923e, e3);
            C0089d.Q(c0113p, C0901i.f7922d, m3);
            C0900h c0900h = C0901i.f7924f;
            if (c0113p.f2305O || !Z1.i.a(c0113p.G(), Integer.valueOf(i3))) {
                AbstractC0080b.p(i3, c0113p, i3, c0900h);
            }
            C0089d.Q(c0113p, C0901i.f7921c, c3);
            C0089d.a(P.f1079a.a(new C0288u(((C0288u) a3.getValue()).f4298a)), this.f1296j, c0113p, 8);
            c0113p.p(true);
        }
        return L1.z.f2729a;
    }
}
