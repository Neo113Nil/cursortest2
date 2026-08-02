package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class epj {
    public int a;
    public boolean b;
    public byte c;
    public int d;
    public Object e;

    public epj() {
        this.e = gyf.a;
    }

    public final epk a() {
        int i;
        if (this.c == Byte.MAX_VALUE && (i = this.d) != 0) {
            return new epk(i, this.a, (gzp) this.e, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == 0) {
            sb.append(" enablement");
        }
        if ((this.c & 1) == 0) {
            sb.append(" rateLimitPerSecond");
        }
        if ((this.c & 2) == 0) {
            sb.append(" recordMetricPerProcess");
        }
        if ((this.c & 4) == 0) {
            sb.append(" forceGcBeforeRecordMemory");
        }
        if ((this.c & 8) == 0) {
            sb.append(" captureDebugMetrics");
        }
        if ((this.c & 16) == 0) {
            sb.append(" captureMemoryInfo");
        }
        if ((this.c & 32) == 0) {
            sb.append(" recordMemoryPeriodically");
        }
        if ((this.c & 64) == 0) {
            sb.append(" randomizePeriodicMemoryMetricStartTime");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [hvm, java.lang.Object] */
    public final eiv b() {
        if (this.c == 7) {
            eiv eivVar = new eiv(this.e, this.a, this.d, this.b);
            hoq.J(eivVar.c > 0, "Thread pool size must be less than or equal to %s", 2);
            return eivVar;
        }
        StringBuilder sb = new StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" primesMetricExecutorPriority");
        }
        if ((this.c & 2) == 0) {
            sb.append(" primesMetricExecutorPoolSize");
        }
        if ((this.c & 4) == 0) {
            sb.append(" enableDeferredTasks");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void c(boolean z) {
        this.b = z;
        this.c = (byte) (this.c | 4);
    }

    public epj(byte[] bArr) {
    }
}
