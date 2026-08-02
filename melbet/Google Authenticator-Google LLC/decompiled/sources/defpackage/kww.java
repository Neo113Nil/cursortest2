package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kww extends kxb implements kwu {
    private final boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kww() {
        super(true);
        kxb e;
        boolean z = true;
        H(null);
        kva E = E();
        kvb kvbVar = E instanceof kvb ? (kvb) E : null;
        if (kvbVar != null && (e = kvbVar.e()) != null) {
            while (!e.bN()) {
                kva E2 = e.E();
                kvb kvbVar2 = E2 instanceof kvb ? (kvb) E2 : null;
                if (kvbVar2 != null && (e = kvbVar2.e()) != null) {
                }
            }
            this.a = z;
        }
        z = false;
        this.a = z;
    }

    @Override // defpackage.kxb
    public final boolean bN() {
        return this.a;
    }

    @Override // defpackage.kxb
    public final boolean bO() {
        return true;
    }
}
