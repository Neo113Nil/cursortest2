package u;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public q6.p f7006h;
    public r.k i;

    /* renamed from: j, reason: collision with root package name */
    public int f7007j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f7008k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f7009l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a1 f7010m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(float f6, i iVar, a1 a1Var, g6.c cVar) {
        super(2, cVar);
        this.f7008k = f6;
        this.f7009l = iVar;
        this.f7010m = a1Var;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        return ((h) l((g6.c) obj2, (a7.u) obj)).p(c6.m.f1757a);
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        return new h(this.f7008k, this.f7009l, this.f7010m, cVar);
    }

    @Override // i6.a
    public final Object p(Object obj) {
        float f6;
        r.k kVar;
        q6.p pVar;
        r.k kVar2;
        int i = this.f7007j;
        if (i == 0) {
            s6.a.K(obj);
            f6 = this.f7008k;
            if (Math.abs(f6) > 1.0f) {
                q6.p pVar2 = new q6.p();
                pVar2.f6202d = f6;
                q6.p pVar3 = new q6.p();
                r.k a8 = r.d.a(28, f6);
                try {
                    i iVar = this.f7009l;
                    r.s sVar = iVar.f7013a;
                    a0.d0 d0Var = new a0.d0(pVar3, this.f7010m, pVar2, iVar, 4);
                    this.f7006h = pVar2;
                    this.i = a8;
                    this.f7007j = 1;
                    kVar = a8;
                    try {
                        Object b8 = r.d.b(kVar, new r.r(sVar, r.d.f6262j, a8.f6331e.getValue(), a8.f6332f), Long.MIN_VALUE, d0Var, this);
                        Object obj2 = h6.a.f3204d;
                        if (b8 != obj2) {
                            b8 = c6.m.f1757a;
                        }
                        if (b8 == obj2) {
                            return obj2;
                        }
                        pVar = pVar2;
                    } catch (CancellationException unused) {
                        pVar = pVar2;
                        kVar2 = kVar;
                        pVar.f6202d = ((Number) kVar2.f6330d.f6414b.i(kVar2.f6332f)).floatValue();
                        f6 = pVar.f6202d;
                        return new Float(f6);
                    }
                } catch (CancellationException unused2) {
                    kVar = a8;
                }
            }
            return new Float(f6);
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kVar2 = this.i;
        pVar = this.f7006h;
        try {
            s6.a.K(obj);
        } catch (CancellationException unused3) {
            pVar.f6202d = ((Number) kVar2.f6330d.f6414b.i(kVar2.f6332f)).floatValue();
            f6 = pVar.f6202d;
            return new Float(f6);
        }
        f6 = pVar.f6202d;
        return new Float(f6);
    }
}
