package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class emz implements elj {
    public final float a;
    public final int b;
    public final gzp c;
    private final int d;

    public emz(int i, float f, int i2, gzp gzpVar) {
        this.d = i;
        this.a = f;
        this.b = i2;
        this.c = gzpVar;
    }

    public static final emy d() {
        emy emyVar = new emy();
        emyVar.a = 100.0f;
        emyVar.d = 1;
        emyVar.b = 100;
        emyVar.c = (byte) 3;
        return emyVar;
    }

    @Override // defpackage.elj
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.elj
    public final boolean b() {
        int i = this.d;
        return i == 3 || i == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof emz)) {
            return false;
        }
        emz emzVar = (emz) obj;
        int i = this.d;
        int i2 = emzVar.d;
        if (i == 0) {
            throw null;
        }
        if (i == i2) {
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(emzVar.a) && this.b == emzVar.b && this.c.equals(emzVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        a.D(i);
        return ((this.b ^ ((((i ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.a)) * 1000003)) * (-721379959)) ^ 2040732332;
    }

    public final String toString() {
        return "CrashConfigurations{enablement=" + elk.a(this.d) + ", startupSamplePercentage=" + this.a + ", debugLogsSize=" + this.b + ", generalConfigurationsMetricExtension=null, crashLoopListener=" + String.valueOf(this.c) + "}";
    }

    public emz() {
        throw null;
    }

    @Override // defpackage.elj
    public final void c() {
    }
}
