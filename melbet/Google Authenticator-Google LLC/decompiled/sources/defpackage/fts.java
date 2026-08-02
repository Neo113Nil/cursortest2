package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fts implements kri {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public fts(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, koi] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, koi] */
    @Override // defpackage.kri
    public final /* synthetic */ Object a() {
        int i = this.b;
        if (i == 0) {
            return adk.a(this.a).O();
        }
        ?? r2 = this.a;
        if (i == 1) {
            return ((dfh) r2).a;
        }
        agl a = adk.a(r2);
        aeh aehVar = a instanceof aeh ? (aeh) a : null;
        return aehVar != null ? aehVar.P() : agm.a;
    }
}
