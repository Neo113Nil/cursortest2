package k;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e0 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5202g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g0 f5203h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f5204i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(g0 g0Var, long j8, int i7) {
        super(1);
        this.f5202g = i7;
        this.f5203h = g0Var;
        this.f5204i = j8;
    }

    /* JADX WARN: Type inference failed for: r11v14, types: [q6.c, r6.l] */
    /* JADX WARN: Type inference failed for: r11v24, types: [q6.c, r6.l] */
    /* JADX WARN: Type inference failed for: r11v6, types: [q6.c, r6.l] */
    @Override // q6.c
    public final Object f(Object obj) {
        long j8;
        int ordinal;
        switch (this.f5202g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int ordinal2 = ((w) obj).ordinal();
                g0 g0Var = this.f5203h;
                long j9 = this.f5204i;
                if (ordinal2 == 0) {
                    t tVar = g0Var.f5215v.f5222a.f5258b;
                    if (tVar != null) {
                        j9 = ((m2.j) tVar.f5264b.f(new m2.j(j9))).f6321a;
                    }
                } else if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        throw new b4.c();
                    }
                    t tVar2 = g0Var.f5216w.f5225a.f5258b;
                    if (tVar2 != null) {
                        j9 = ((m2.j) tVar2.f5264b.f(new m2.j(j9))).f6321a;
                    }
                }
                return new m2.j(j9);
            default:
                w wVar = (w) obj;
                g0 g0Var2 = this.f5203h;
                if (g0Var2.A != null && g0Var2.A0() != null && !r6.k.a(g0Var2.A, g0Var2.A0()) && (ordinal = wVar.ordinal()) != 0 && ordinal != 1) {
                    if (ordinal != 2) {
                        throw new b4.c();
                    }
                    t tVar3 = g0Var2.f5216w.f5225a.f5258b;
                    if (tVar3 != null) {
                        ?? r11 = tVar3.f5264b;
                        long j10 = this.f5204i;
                        long j11 = ((m2.j) r11.f(new m2.j(j10))).f6321a;
                        s0.c A0 = g0Var2.A0();
                        r6.k.c(A0);
                        m2.k kVar = m2.k.f6322f;
                        long a3 = ((s0.g) A0).a(j10, j11, kVar);
                        s0.c cVar = g0Var2.A;
                        r6.k.c(cVar);
                        j8 = m2.h.b(a3, cVar.a(j10, j11, kVar));
                        return new m2.h(j8);
                    }
                }
                j8 = 0;
                return new m2.h(j8);
        }
    }
}
