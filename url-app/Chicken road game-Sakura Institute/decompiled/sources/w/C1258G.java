package w;

import G.C0208l;
import G.C0216p;
import G.X0;
import a.AbstractC0345a;
import s0.AbstractC1144g0;

/* renamed from: w.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1258G extends M2.p implements L2.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11028e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ A0.L f11029i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1258G(int i2, int i4, A0.L l4) {
        super(3);
        this.f11027d = i2;
        this.f11028e = i4;
        this.f11029i = l4;
    }

    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        C0216p c0216p = (C0216p) obj2;
        ((Number) obj3).intValue();
        c0216p.S(408240218);
        int i2 = this.f11027d;
        int i4 = this.f11028e;
        M.s(i2, i4);
        S.l lVar = S.l.f3977a;
        if (i2 == 1 && i4 == Integer.MAX_VALUE) {
            c0216p.q(false);
            return lVar;
        }
        M0.b bVar = (M0.b) c0216p.k(AbstractC1144g0.f10218f);
        F0.d dVar = (F0.d) c0216p.k(AbstractC1144g0.f10221i);
        M0.k kVar = (M0.k) c0216p.k(AbstractC1144g0.f10224l);
        A0.L l4 = this.f11029i;
        boolean f4 = c0216p.f(l4) | c0216p.f(kVar);
        Object I3 = c0216p.I();
        G.W w4 = C0208l.f2826a;
        if (f4 || I3 == w4) {
            I3 = AbstractC0345a.E(l4, kVar);
            c0216p.c0(I3);
        }
        A0.L l5 = (A0.L) I3;
        boolean f5 = c0216p.f(dVar) | c0216p.f(l5);
        Object I4 = c0216p.I();
        if (f5 || I4 == w4) {
            A0.D d4 = l5.f303a;
            F0.r rVar = d4.f261f;
            F0.k kVar2 = d4.f258c;
            if (kVar2 == null) {
                kVar2 = F0.k.f2614i;
            }
            F0.i iVar = d4.f259d;
            int i5 = iVar != null ? iVar.f2611a : 0;
            F0.j jVar = d4.f260e;
            I4 = ((F0.e) dVar).b(rVar, kVar2, i5, jVar != null ? jVar.f2612a : 1);
            c0216p.c0(I4);
        }
        X0 x02 = (X0) I4;
        boolean f6 = c0216p.f(x02.getValue()) | c0216p.f(bVar) | c0216p.f(dVar) | c0216p.f(l4) | c0216p.f(kVar);
        Object I5 = c0216p.I();
        if (f6 || I5 == w4) {
            I5 = Integer.valueOf((int) (b0.a(l5, bVar, dVar, b0.f11137a, 1) & 4294967295L));
            c0216p.c0(I5);
        }
        int intValue = ((Number) I5).intValue();
        boolean f7 = c0216p.f(x02.getValue()) | c0216p.f(bVar) | c0216p.f(dVar) | c0216p.f(l4) | c0216p.f(kVar);
        Object I6 = c0216p.I();
        if (f7 || I6 == w4) {
            StringBuilder sb = new StringBuilder();
            String str = b0.f11137a;
            sb.append(str);
            sb.append('\n');
            sb.append(str);
            I6 = Integer.valueOf((int) (b0.a(l5, bVar, dVar, sb.toString(), 2) & 4294967295L));
            c0216p.c0(I6);
        }
        int intValue2 = ((Number) I6).intValue() - intValue;
        Integer valueOf = i2 == 1 ? null : Integer.valueOf(((i2 - 1) * intValue2) + intValue);
        Integer valueOf2 = i4 != Integer.MAX_VALUE ? Integer.valueOf(((i4 - 1) * intValue2) + intValue) : null;
        S.o c4 = androidx.compose.foundation.layout.c.c(lVar, valueOf != null ? bVar.i0(valueOf.intValue()) : Float.NaN, valueOf2 != null ? bVar.i0(valueOf2.intValue()) : Float.NaN);
        c0216p.q(false);
        return c4;
    }
}
