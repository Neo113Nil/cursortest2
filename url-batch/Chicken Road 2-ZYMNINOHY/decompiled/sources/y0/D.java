package y0;

/* loaded from: classes.dex */
public final class D extends s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f16082b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G0.c f16083c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(G0.c cVar, y yVar, y yVar2) {
        super(yVar);
        this.f16083c = cVar;
        this.f16082b = yVar2;
    }

    @Override // y0.s, y0.y
    public final x e(long j4) {
        x e4 = this.f16082b.e(j4);
        z zVar = e4.f16222a;
        long j5 = zVar.f16225a;
        long j6 = zVar.f16226b;
        long j7 = this.f16083c.f828b;
        z zVar2 = new z(j5, j6 + j7);
        z zVar3 = e4.f16223b;
        return new x(zVar2, new z(zVar3.f16225a, zVar3.f16226b + j7));
    }
}
