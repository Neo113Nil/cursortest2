package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class emy {
    public float a;
    public int b;
    public byte c;
    public int d;
    private final gzp e = gyf.a;

    public final emz a() {
        int i;
        if (this.c == 3 && (i = this.d) != 0) {
            emz emzVar = new emz(i, this.a, this.b, this.e);
            float f = emzVar.a;
            hoq.y(f > 0.0f && f <= 100.0f, "StartupSamplePercentage should be a floating number > 0 and <= 100.");
            return emzVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == 0) {
            sb.append(" enablement");
        }
        if ((this.c & 1) == 0) {
            sb.append(" startupSamplePercentage");
        }
        if ((this.c & 2) == 0) {
            sb.append(" debugLogsSize");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
