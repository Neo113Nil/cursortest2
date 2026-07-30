package l;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends j6.i implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public l f5404g;

    /* renamed from: h, reason: collision with root package name */
    public r6.r f5405h;

    /* renamed from: i, reason: collision with root package name */
    public int f5406i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f5407j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f5408k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i1 f5409l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f5410m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q6.c f5411n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Object obj, i1 i1Var, long j8, q6.c cVar, h6.d dVar2) {
        super(1, dVar2);
        this.f5407j = dVar;
        this.f5408k = obj;
        this.f5409l = i1Var;
        this.f5410m = j8;
        this.f5411n = cVar;
    }

    @Override // j6.a
    public final h6.d create(h6.d dVar) {
        return new b(this.f5407j, this.f5408k, this.f5409l, this.f5410m, this.f5411n, dVar);
    }

    @Override // q6.c
    public final Object f(Object obj) {
        return ((b) create((h6.d) obj)).invokeSuspend(d6.z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        l lVar;
        r6.r rVar;
        i1 i1Var = this.f5409l;
        int i7 = this.f5406i;
        int i8 = 1;
        d dVar = this.f5407j;
        try {
            if (i7 == 0) {
                d6.a.e(obj);
                dVar.f5427c.f5564h = (q) dVar.f5425a.f5702a.f(this.f5408k);
                dVar.f5429e.setValue(i1Var.f5534c);
                dVar.f5428d.setValue(Boolean.TRUE);
                l lVar2 = dVar.f5427c;
                l lVar3 = new l(lVar2.f5562f, lVar2.f5563g.getValue(), e.g(lVar2.f5564h), lVar2.f5565i, Long.MIN_VALUE, lVar2.f5567k);
                r6.r rVar2 = new r6.r();
                long j8 = this.f5410m;
                a aVar = new a(dVar, lVar3, this.f5411n, rVar2, 0);
                this.f5404g = lVar3;
                this.f5405h = rVar2;
                this.f5406i = 1;
                Object b9 = e.b(lVar3, i1Var, j8, aVar, this);
                i6.a aVar2 = i6.a.f4956f;
                if (b9 == aVar2) {
                    return aVar2;
                }
                lVar = lVar3;
                rVar = rVar2;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rVar = this.f5405h;
                lVar = this.f5404g;
                d6.a.e(obj);
            }
            if (!rVar.f7964f) {
                i8 = 2;
            }
            d.b(dVar);
            return new i(i8, 0, lVar);
        } catch (CancellationException e9) {
            d.b(dVar);
            throw e9;
        }
    }
}
