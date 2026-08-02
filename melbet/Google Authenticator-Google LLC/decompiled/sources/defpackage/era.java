package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class era {
    public int a;
    public byte b;
    public int c;
    public erb d;

    public final erc a() {
        int i;
        erb erbVar;
        if (this.b == 7 && (i = this.c) != 0 && (erbVar = this.d) != null) {
            return new erc(i, this.a, erbVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" enablement");
        }
        if ((this.b & 1) == 0) {
            sb.append(" rateLimitPerSecond");
        }
        if (this.d == null) {
            sb.append(" dynamicSampler");
        }
        if ((this.b & 2) == 0) {
            sb.append(" recordTimerDuration");
        }
        if ((this.b & 4) == 0) {
            sb.append(" sendEmptyTraces");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
