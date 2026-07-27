package o1;

/* loaded from: classes.dex */
public final class z extends r {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f11611g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.google.android.gms.common.internal.a aVar, int i2) {
        super(aVar, i2, null);
        this.f11611g = aVar;
    }

    @Override // o1.r
    public final void a(l1.b bVar) {
        com.google.android.gms.common.internal.a aVar = this.f11611g;
        aVar.getClass();
        aVar.f5006n.a(bVar);
        aVar.f4996d = bVar.f11000b;
        aVar.f4997e = System.currentTimeMillis();
    }

    @Override // o1.r
    public final boolean b() {
        this.f11611g.f5006n.a(l1.b.f10998e);
        return true;
    }
}
