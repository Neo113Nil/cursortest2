package P3;

import X2.h;
import X2.s;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f2312f = Logger.getLogger(d.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final e f2313a;

    /* renamed from: b, reason: collision with root package name */
    public long f2314b;

    /* renamed from: c, reason: collision with root package name */
    public int f2315c;

    /* renamed from: d, reason: collision with root package name */
    public int f2316d;

    /* renamed from: e, reason: collision with root package name */
    public long f2317e;

    public d(e eVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f2314b = timeUnit.toNanos(1000L);
        this.f2315c = 2048;
        this.f2316d = 512;
        this.f2317e = timeUnit.toNanos(30000L);
        s sVar = h.f3518a;
        Objects.requireNonNull(eVar, "logRecordExporter");
        this.f2313a = eVar;
    }

    public final c a() {
        int i2 = this.f2316d;
        int i3 = this.f2315c;
        if (i2 > i3) {
            f2312f.log(Level.WARNING, "maxExportBatchSize should not exceed maxQueueSize. Setting maxExportBatchSize to {0} instead of {1}", new Object[]{Integer.valueOf(i3), Integer.valueOf(this.f2316d)});
            this.f2316d = this.f2315c;
        }
        long j2 = this.f2314b;
        int i6 = this.f2315c;
        int i7 = this.f2316d;
        long j6 = this.f2317e;
        s sVar = h.f3518a;
        return new c(this.f2313a, j2, i6, i7, j6);
    }
}
