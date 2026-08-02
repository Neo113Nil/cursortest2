package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class erc implements elj {
    public final erb a;
    private final int b;
    private final int c;

    public erc(int i, int i2, erb erbVar) {
        this.c = i;
        this.b = i2;
        this.a = erbVar;
    }

    public static final era d() {
        era eraVar = new era();
        eraVar.a = 10;
        byte b = eraVar.b;
        eraVar.b = (byte) (b | 3);
        eraVar.d = new erb();
        eraVar.c = 1;
        eraVar.b = (byte) (b | 7);
        return eraVar;
    }

    @Override // defpackage.elj
    public final int a() {
        return this.b;
    }

    @Override // defpackage.elj
    public final boolean b() {
        return this.c == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof erc)) {
            return false;
        }
        erc ercVar = (erc) obj;
        int i = this.c;
        int i2 = ercVar.c;
        if (i != 0) {
            return i == i2 && this.b == ercVar.b && this.a.equals(ercVar.a);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.c;
        a.D(i);
        erb erbVar = this.a;
        return ((((((this.b ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ erbVar.hashCode()) * 1000003) ^ 1237) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "TraceConfigurations{enablement=" + elk.a(this.c) + ", rateLimitPerSecond=" + this.b + ", dynamicSampler=" + String.valueOf(this.a) + ", recordTimerDuration=false, sendEmptyTraces=false}";
    }

    public erc() {
        throw null;
    }

    @Override // defpackage.elj
    public final /* synthetic */ void c() {
    }
}
