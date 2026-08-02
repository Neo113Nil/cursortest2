package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kwz extends kwx {
    private final kxb a;
    private final kxa b;
    private final kvb c;
    private final Object g;

    public kwz(kxb kxbVar, kxa kxaVar, kvb kvbVar, Object obj) {
        this.a = kxbVar;
        this.b = kxaVar;
        this.c = kvbVar;
        this.g = obj;
    }

    @Override // defpackage.kwx
    public final void a(Throwable th) {
        boolean z = kvo.a;
        kxb kxbVar = this.a;
        kxa kxaVar = this.b;
        kvb kvbVar = this.c;
        kvb P = kxb.P(kvbVar);
        Object obj = this.g;
        if (P == null || !kxbVar.O(kxaVar, P, obj)) {
            kxaVar.a.j(2);
            kvb P2 = kxb.P(kvbVar);
            if (P2 == null || !kxbVar.O(kxaVar, P2, obj)) {
                kxbVar.n(kxbVar.z(kxaVar, obj));
            }
        }
    }

    @Override // defpackage.kwx
    public final boolean b() {
        return false;
    }
}
