package s;

import A.C0005a;
import B1.C0097d;
import G.C0192d;
import G.C0205j0;
import G.C0208l;
import G.C0216p;
import G.C0222s0;
import G.W;
import G.Y0;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import q.n0;

/* renamed from: s.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1092H implements P.k, P.c {

    /* renamed from: a, reason: collision with root package name */
    public final P.l f9894a;

    /* renamed from: b, reason: collision with root package name */
    public final C0205j0 f9895b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f9896c;

    public C1092H(P.k kVar, Map map) {
        C1090F c1090f = new C1090F(kVar, 0);
        Y0 y02 = P.m.f3674a;
        this.f9894a = new P.l(map, c1090f);
        this.f9895b = C0192d.K(null, W.f2779l);
        this.f9896c = new LinkedHashSet();
    }

    @Override // P.c
    public final void a(Object obj) {
        P.c cVar = (P.c) this.f9895b.getValue();
        if (cVar == null) {
            throw new IllegalArgumentException("null wrappedHolder");
        }
        cVar.a(obj);
    }

    @Override // P.k
    public final boolean b(Object obj) {
        return this.f9894a.b(obj);
    }

    @Override // P.k
    public final Object c(String str) {
        return this.f9894a.c(str);
    }

    @Override // P.c
    public final void d(Object obj, O.a aVar, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(-697180401);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(obj) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.h(aVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0216p.h(this) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0216p.z()) {
            c0216p.N();
        } else {
            P.c cVar = (P.c) this.f9895b.getValue();
            if (cVar == null) {
                throw new IllegalArgumentException("null wrappedHolder");
            }
            cVar.d(obj, aVar, c0216p, i4 & 126);
            boolean h4 = c0216p.h(this) | c0216p.h(obj);
            Object I3 = c0216p.I();
            if (h4 || I3 == C0208l.f2826a) {
                I3 = new n0(this, 1, obj);
                c0216p.c0(I3);
            }
            C0192d.d(obj, (Function1) I3, c0216p);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0005a(this, obj, aVar, i2, 6);
        }
    }

    @Override // P.k
    public final C0097d e(String str, A3.e eVar) {
        return this.f9894a.e(str, eVar);
    }
}
