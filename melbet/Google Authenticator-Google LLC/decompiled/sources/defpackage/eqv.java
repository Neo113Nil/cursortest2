package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eqv {
    public int a;
    public float b;
    public gzp c = gyf.a;
    public byte d;
    public int e;

    public final eqw a() {
        int i;
        if (this.d == 3 && (i = this.e) != 0) {
            eqw eqwVar = new eqw(i, this.a, this.b, this.c);
            float f = eqwVar.a;
            hoq.I(f > 0.0f && f <= 1.0f, "Sampling Probability shall be > 0 and <= 1");
            return eqwVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == 0) {
            sb.append(" enablement");
        }
        if ((this.d & 1) == 0) {
            sb.append(" rateLimitPerSecond");
        }
        if ((this.d & 2) == 0) {
            sb.append(" samplingProbability");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
