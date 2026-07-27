package A1;

import A.AbstractC0017m;
import D.N1;
import G.C0192d;
import G.C0216p;
import G.InterfaceC0213n0;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;
import q.AbstractC1024c;
import q.AbstractC1031j;
import q.AbstractC1039r;
import q.C1041t;
import q.C1042u;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;
import y2.C1338m;
import z1.AbstractC1365I;
import z1.AbstractC1366J;
import z1.C1372P;
import z1.C1381g;
import z1.EnumC1388n;

/* renamed from: A1.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0053e0 implements L2.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1372P f592e;

    public /* synthetic */ C0053e0(C1372P c1372p, int i2) {
        this.f591d = i2;
        this.f592e = c1372p;
    }

    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        long j4;
        int i2;
        switch (this.f591d) {
            case 0:
                C1042u PaperCard = (C1042u) obj;
                C0216p c0216p = (C0216p) obj2;
                int intValue = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(PaperCard, "$this$PaperCard");
                if ((intValue & 17) == 16 && c0216p.z()) {
                    c0216p.N();
                } else {
                    S.f fVar = S.b.f3962q;
                    S.l lVar = S.l.f3977a;
                    q.f0 b4 = q.e0.b(AbstractC1031j.f9265a, fVar, c0216p, 48);
                    int i4 = c0216p.f2861P;
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
                    C1067h c1067h = C1069j.f9820f;
                    C0192d.R(c0216p, b4, c1067h);
                    C1067h c1067h2 = C1069j.f9819e;
                    C0192d.R(c0216p, m4, c1067h2);
                    C1067h c1067h3 = C1069j.f9821g;
                    if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i4))) {
                        AbstractC0017m.r(i4, c0216p, i4, c1067h3);
                    }
                    C1067h c1067h4 = C1069j.f9818d;
                    C0192d.R(c0216p, d4, c1067h4);
                    S.o a4 = q.h0.f9258a.a(lVar, true);
                    C1041t a5 = AbstractC1039r.a(AbstractC1031j.f9267c, S.b.f3963r, c0216p, 0);
                    int i5 = c0216p.f2861P;
                    InterfaceC0213n0 m5 = c0216p.m();
                    S.o d5 = S.a.d(c0216p, a4);
                    c0216p.W();
                    if (c0216p.f2860O) {
                        c0216p.l(c1068i);
                    } else {
                        c0216p.f0();
                    }
                    C0192d.R(c0216p, a5, c1067h);
                    C0192d.R(c0216p, m5, c1067h2);
                    if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i5))) {
                        AbstractC0017m.r(i5, c0216p, i5, c1067h3);
                    }
                    C0192d.R(c0216p, d5, c1067h4);
                    C1372P c1372p = this.f592e;
                    N1.b(c1372p.f11838b, null, AbstractC1365I.f11807h, u3.l.k0(19), null, F0.k.f2617l, F0.r.f2625c, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 199680, 0, 130962);
                    AbstractC1024c.a(c0216p, androidx.compose.foundation.layout.c.b(lVar, 2));
                    N1.b(c1372p.f11839c + " · " + c1372p.f11840d, null, AbstractC1365I.f11806g, u3.l.k0(13), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 3072, 0, 131058);
                    c0216p.q(true);
                    EnumC1388n enumC1388n = c1372p.f11841e;
                    String name = enumC1388n.name();
                    int ordinal = enumC1388n.ordinal();
                    if (ordinal == 0) {
                        j4 = AbstractC1365I.f11811l;
                    } else if (ordinal == 1) {
                        j4 = AbstractC1365I.f11805f;
                    } else if (ordinal == 2) {
                        j4 = AbstractC1365I.f11809j;
                    } else {
                        if (ordinal != 3) {
                            throw new C1338m();
                        }
                        j4 = AbstractC1365I.f11804e;
                    }
                    AbstractC0864b.a(name, j4, c0216p, 0);
                    c0216p.q(true);
                    Q.v vVar = AbstractC1366J.f11817c;
                    if (vVar == null || !vVar.isEmpty()) {
                        ListIterator listIterator = vVar.listIterator();
                        i2 = 0;
                        while (true) {
                            A2.b bVar = (A2.b) listIterator;
                            if (bVar.hasNext()) {
                                if (Intrinsics.a(((C1381g) bVar.next()).f11864b, c1372p.f11837a) && (i2 = i2 + 1) < 0) {
                                    throw new ArithmeticException("Count overflow has happened.");
                                }
                            }
                        }
                    } else {
                        i2 = 0;
                    }
                    AbstractC1024c.a(c0216p, androidx.compose.foundation.layout.c.b(lVar, 6));
                    N1.b(i2 + " events", null, AbstractC1365I.f11813n, u3.l.k0(12), null, null, F0.r.f2626d, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 3072, 0, 130994);
                }
                return Unit.f7487a;
            default:
                C1042u PaperCard2 = (C1042u) obj;
                C0216p c0216p2 = (C0216p) obj2;
                int intValue2 = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(PaperCard2, "$this$PaperCard");
                if ((intValue2 & 17) == 16 && c0216p2.z()) {
                    c0216p2.N();
                } else {
                    C1372P c1372p2 = this.f592e;
                    N1.b(c1372p2.f11838b, null, AbstractC1365I.f11807h, u3.l.k0(17), null, F0.k.f2617l, F0.r.f2625c, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p2, 199680, 0, 130962);
                    N1.b(c1372p2.f11839c + " · " + c1372p2.f11840d + " · " + c1372p2.f11841e.name(), null, AbstractC1365I.f11806g, u3.l.k0(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p2, 3072, 0, 131058);
                    AbstractC1024c.a(c0216p2, androidx.compose.foundation.layout.c.b(S.l.f3977a, (float) 4));
                    N1.b("Tap to open podium view ▸", null, AbstractC1365I.f11805f, u3.l.k0(12), null, F0.k.f2616k, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p2, 199686, 0, 131026);
                }
                return Unit.f7487a;
        }
    }
}
