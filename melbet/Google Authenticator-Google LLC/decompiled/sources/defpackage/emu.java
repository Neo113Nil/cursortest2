package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class emu implements elj {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final double e;
    private final int f;

    public emu(byte[] bArr) {
        this.f = 1;
        this.a = 2097152;
        this.b = 30000;
        this.c = 5000;
        this.d = 1000;
        this.e = 5.0d;
    }

    @Override // defpackage.elj
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.elj
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof emu)) {
            return false;
        }
        emu emuVar = (emu) obj;
        int i = this.f;
        int i2 = emuVar.f;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1 && this.a == emuVar.a && this.b == emuVar.b && this.c == emuVar.c && this.d == emuVar.d) {
            if (Double.doubleToLongBits(this.e) == Double.doubleToLongBits(emuVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a.D(this.f);
        double d = this.e;
        long doubleToLongBits = Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32);
        return ((this.d ^ ((((((this.a ^ (-722379962)) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003)) * 1000003) ^ ((int) doubleToLongBits);
    }

    public final String toString() {
        return "CpuProfilingConfigurations{enablement=" + elk.a(this.f) + ", maxBufferSizeBytes=" + this.a + ", sampleDurationMs=" + this.b + ", sampleDurationSkewMs=" + this.c + ", sampleFrequencyMicro=" + this.d + ", samplesPerEpoch=" + this.e + "}";
    }

    @Override // defpackage.elj
    public final /* synthetic */ void c() {
    }

    public emu() {
        throw null;
    }
}
