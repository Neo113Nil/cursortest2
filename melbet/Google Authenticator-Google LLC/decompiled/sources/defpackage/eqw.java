package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eqw implements elj {
    public final float a;
    public final gzp b;
    private final int c;
    private final int d;

    public eqw(int i, int i2, float f, gzp gzpVar) {
        this.d = i;
        this.c = i2;
        this.a = f;
        this.b = gzpVar;
    }

    public static final eqv d() {
        eqv eqvVar = new eqv();
        eqvVar.a = 10;
        eqvVar.b = 1.0f;
        eqvVar.d = (byte) 3;
        eqvVar.c = gyf.a;
        eqvVar.e = 1;
        return eqvVar;
    }

    @Override // defpackage.elj
    public final int a() {
        return this.c;
    }

    @Override // defpackage.elj
    public final boolean b() {
        return this.d == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eqw)) {
            return false;
        }
        eqw eqwVar = (eqw) obj;
        int i = this.d;
        int i2 = eqwVar.d;
        if (i == 0) {
            throw null;
        }
        if (i == i2 && this.c == eqwVar.c) {
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(eqwVar.a) && this.b.equals(eqwVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        a.D(i);
        float f = this.a;
        return ((((this.c ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ Float.floatToIntBits(f)) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "TimerConfigurations{enablement=" + elk.a(this.d) + ", rateLimitPerSecond=" + this.c + ", samplingProbability=" + this.a + ", perEventConfigurationFlags=" + String.valueOf(this.b) + "}";
    }

    public eqw() {
        throw null;
    }

    @Override // defpackage.elj
    public final /* synthetic */ void c() {
    }
}
