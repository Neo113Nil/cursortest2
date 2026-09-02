package U4;

import c4.C0289h;
import c4.s;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f2623g = Logger.getLogger(d.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final e f2624a;

    /* renamed from: b, reason: collision with root package name */
    public long f2625b;

    /* renamed from: c, reason: collision with root package name */
    public int f2626c;

    /* renamed from: d, reason: collision with root package name */
    public int f2627d;

    /* renamed from: e, reason: collision with root package name */
    public long f2628e;

    /* renamed from: f, reason: collision with root package name */
    public final s f2629f;

    public d(e eVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f2625b = timeUnit.toNanos(1000L);
        this.f2626c = 2048;
        this.f2627d = 512;
        this.f2628e = timeUnit.toNanos(30000L);
        this.f2629f = C0289h.f3817f;
        this.f2624a = eVar;
    }

    public final c a() {
        int i7 = this.f2627d;
        int i8 = this.f2626c;
        if (i7 > i8) {
            f2623g.log(Level.WARNING, "maxExportBatchSize should not exceed maxQueueSize. Setting maxExportBatchSize to {0} instead of {1}", new Object[]{Integer.valueOf(i8), Integer.valueOf(this.f2627d)});
            this.f2627d = this.f2626c;
        }
        return new c(this.f2624a, this.f2629f, this.f2625b, this.f2626c, this.f2627d, this.f2628e);
    }
}
