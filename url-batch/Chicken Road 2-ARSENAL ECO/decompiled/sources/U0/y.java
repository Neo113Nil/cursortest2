package U0;

/* loaded from: classes.dex */
public final class y extends q {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f2590g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.google.android.gms.common.internal.a aVar, int i7) {
        super(aVar, i7, null);
        this.f2590g = aVar;
    }

    @Override // U0.q
    public final void a(R0.a aVar) {
        com.google.android.gms.common.internal.a aVar2 = this.f2590g;
        aVar2.f3879n.a(aVar);
        aVar2.f3869d = aVar.f2053g;
        aVar2.f3870e = System.currentTimeMillis();
    }

    @Override // U0.q
    public final boolean b() {
        this.f2590g.f3879n.a(R0.a.f2051j);
        return true;
    }
}
