package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dtz implements kri {
    final /* synthetic */ bd a;
    final /* synthetic */ koi b;
    private final /* synthetic */ int c;

    public dtz(bd bdVar, koi koiVar, int i) {
        this.c = i;
        this.a = bdVar;
        this.b = koiVar;
    }

    @Override // defpackage.kri
    public final /* synthetic */ Object a() {
        aeh aehVar;
        agh N;
        agh N2;
        agh N3;
        int i = this.c;
        if (i == 0) {
            agl a = adk.a(this.b);
            aehVar = a instanceof aeh ? (aeh) a : null;
            if (aehVar != null && (N = aehVar.N()) != null) {
                return N;
            }
            agh N4 = this.a.N();
            N4.getClass();
            return N4;
        }
        koi koiVar = this.b;
        if (i != 1) {
            agl a2 = adk.a(koiVar);
            aehVar = a2 instanceof aeh ? (aeh) a2 : null;
            if (aehVar != null && (N3 = aehVar.N()) != null) {
                return N3;
            }
            agh N5 = this.a.N();
            N5.getClass();
            return N5;
        }
        agl a3 = adk.a(koiVar);
        aehVar = a3 instanceof aeh ? (aeh) a3 : null;
        if (aehVar != null && (N2 = aehVar.N()) != null) {
            return N2;
        }
        agh N6 = this.a.N();
        N6.getClass();
        return N6;
    }
}
