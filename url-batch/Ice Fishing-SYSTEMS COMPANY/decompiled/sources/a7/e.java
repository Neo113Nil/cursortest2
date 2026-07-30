package a7;

import i6.h;
import i6.s;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f4418g = Logger.getLogger(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final f f4419a;

    /* renamed from: b, reason: collision with root package name */
    public long f4420b;

    /* renamed from: c, reason: collision with root package name */
    public int f4421c;

    /* renamed from: d, reason: collision with root package name */
    public int f4422d;

    /* renamed from: e, reason: collision with root package name */
    public long f4423e;

    /* renamed from: f, reason: collision with root package name */
    public final s f4424f;

    public e(f fVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f4420b = timeUnit.toNanos(1000L);
        this.f4421c = 2048;
        this.f4422d = 512;
        this.f4423e = timeUnit.toNanos(30000L);
        this.f4424f = h.f38327n;
        this.f4419a = fVar;
    }

    public final d a() {
        int i = this.f4422d;
        int i4 = this.f4421c;
        if (i > i4) {
            f4418g.log(Level.WARNING, "maxExportBatchSize should not exceed maxQueueSize. Setting maxExportBatchSize to {0} instead of {1}", new Object[]{Integer.valueOf(i4), Integer.valueOf(this.f4422d)});
            this.f4422d = this.f4421c;
        }
        return new d(this.f4419a, this.f4424f, this.f4420b, this.f4421c, this.f4422d, this.f4423e);
    }
}
