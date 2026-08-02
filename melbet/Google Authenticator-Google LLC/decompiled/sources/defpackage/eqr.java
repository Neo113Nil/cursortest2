package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eqr implements elj {
    public final gzp a;
    private final int b;

    public eqr(int i, gzp gzpVar) {
        this.b = i;
        this.a = gzpVar;
    }

    public static final eqq d() {
        eqq eqqVar = new eqq();
        eqqVar.a = (byte) 1;
        eqqVar.c = gyf.a;
        eqqVar.b = 1;
        return eqqVar;
    }

    @Override // defpackage.elj
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.elj
    public final boolean b() {
        int i = this.b;
        return i == 3 || i == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eqr)) {
            return false;
        }
        eqr eqrVar = (eqr) obj;
        int i = this.b;
        int i2 = eqrVar.b;
        if (i != 0) {
            return i == i2 && this.a.equals(eqrVar.a);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.b;
        a.D(i);
        return (((((i ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ 2040732332) * 1000003;
    }

    public final String toString() {
        return "StorageConfigurations{enablement=" + elk.a(this.b) + ", manualCapture=false, dirStatsConfigurations=" + String.valueOf(this.a) + ", generalConfigurationsMetricExtension=null}";
    }

    public eqr() {
        throw null;
    }

    @Override // defpackage.elj
    public final void c() {
    }
}
