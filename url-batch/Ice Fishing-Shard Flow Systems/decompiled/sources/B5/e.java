package B5;

import J4.h;
import J4.s;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f206g = Logger.getLogger(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final f f207a;

    /* renamed from: b, reason: collision with root package name */
    public long f208b;

    /* renamed from: c, reason: collision with root package name */
    public int f209c;

    /* renamed from: d, reason: collision with root package name */
    public int f210d;

    /* renamed from: e, reason: collision with root package name */
    public long f211e;

    /* renamed from: f, reason: collision with root package name */
    public final s f212f;

    public e(f fVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f208b = timeUnit.toNanos(1000L);
        this.f209c = 2048;
        this.f210d = 512;
        this.f211e = timeUnit.toNanos(30000L);
        this.f212f = h.f1386d;
        this.f207a = fVar;
    }

    public final d a() {
        int i2 = this.f210d;
        int i5 = this.f209c;
        if (i2 > i5) {
            f206g.log(Level.WARNING, "maxExportBatchSize should not exceed maxQueueSize. Setting maxExportBatchSize to {0} instead of {1}", new Object[]{Integer.valueOf(i5), Integer.valueOf(this.f210d)});
            this.f210d = this.f209c;
        }
        return new d(this.f207a, this.f212f, this.f208b, this.f209c, this.f210d, this.f211e);
    }
}
