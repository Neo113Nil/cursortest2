package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class epk implements elj {
    public final gzp a;
    public final boolean b;
    private final int c;
    private final int d;

    public epk(int i, int i2, gzp gzpVar, boolean z) {
        this.d = i;
        this.c = i2;
        this.a = gzpVar;
        this.b = z;
    }

    public static epj d() {
        epj epjVar = new epj();
        epjVar.a = 3;
        epjVar.e = gyf.a;
        epjVar.b = true;
        epjVar.d = 1;
        epjVar.c = Byte.MAX_VALUE;
        return epjVar;
    }

    @Override // defpackage.elj
    public final int a() {
        return this.c;
    }

    @Override // defpackage.elj
    public final boolean b() {
        return this.d != 2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof epk)) {
            return false;
        }
        epk epkVar = (epk) obj;
        int i = this.d;
        int i2 = epkVar.d;
        if (i != 0) {
            return i == i2 && this.c == epkVar.c && this.a.equals(epkVar.a) && this.b == epkVar.b;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.d;
        a.D(i);
        return ((((((((((((((this.c ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ 1237) * 1000003) ^ 2040732332) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "MemoryConfigurations{enablement=" + elk.a(this.d) + ", rateLimitPerSecond=" + this.c + ", recordMetricPerProcess=false, metricExtensionProvider=" + String.valueOf(this.a) + ", forceGcBeforeRecordMemory=false, captureDebugMetrics=false, captureMemoryInfo=" + this.b + ", recordMemoryPeriodically=false, randomizePeriodicMemoryMetricStartTime=false}";
    }

    public epk() {
        throw null;
    }

    @Override // defpackage.elj
    public final /* synthetic */ void c() {
    }
}
