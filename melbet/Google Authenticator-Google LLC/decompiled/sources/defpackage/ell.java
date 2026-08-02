package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ell implements elj {
    private final int a;
    private final eos b;

    public ell(int i, eos eosVar) {
        this.a = i;
        this.b = eosVar;
    }

    public static final eqq d() {
        eqq eqqVar = new eqq(null);
        eqqVar.c = new eos();
        eqqVar.b = 1;
        eqqVar.a = (byte) 1;
        return eqqVar;
    }

    @Override // defpackage.elj
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.elj
    public final boolean b() {
        return this.a == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ell)) {
            return false;
        }
        ell ellVar = (ell) obj;
        int i = this.a;
        int i2 = ellVar.a;
        if (i != 0) {
            return i == i2 && this.b.equals(ellVar.b);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.a;
        a.D(i);
        return this.b.hashCode() ^ ((((i ^ 1000003) * 1000003) ^ 1237) * 1000003);
    }

    public final String toString() {
        return "BatteryConfigurations{enablement=" + elk.a(this.a) + ", chargeCounterEnabled=false, metricExtensionProvider=" + String.valueOf(this.b) + "}";
    }

    public ell() {
        throw null;
    }

    @Override // defpackage.elj
    public final /* synthetic */ void c() {
    }
}
