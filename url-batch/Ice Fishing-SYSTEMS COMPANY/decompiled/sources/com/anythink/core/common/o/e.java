package com.anythink.core.common.o;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import com.anythink.basead.exoplayer.f;
import com.anythink.basead.exoplayer.h.o;
import com.anythink.core.common.d.t;
import com.anythink.core.common.d.u;
import com.anythink.core.common.v.af;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class e {

    /* renamed from: d, reason: collision with root package name */
    private static e f16118d;

    /* renamed from: b, reason: collision with root package name */
    long f16120b;

    /* renamed from: f, reason: collision with root package name */
    private Context f16123f;

    /* renamed from: g, reason: collision with root package name */
    private ActivityManager f16124g;

    /* renamed from: h, reason: collision with root package name */
    private d f16125h;

    /* renamed from: j, reason: collision with root package name */
    private boolean f16126j;

    /* renamed from: k, reason: collision with root package name */
    private volatile Integer f16127k;

    /* renamed from: l, reason: collision with root package name */
    private volatile Integer f16128l;

    /* renamed from: m, reason: collision with root package name */
    private volatile Long f16129m;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16122e = false;
    private final File i = Environment.getDataDirectory();

    /* renamed from: a, reason: collision with root package name */
    final long f16119a = f.f7344a;

    /* renamed from: c, reason: collision with root package name */
    AtomicInteger f16121c = new AtomicInteger();

    private e() {
        Context g9 = t.b().g();
        this.f16123f = g9;
        this.f16124g = (ActivityManager) g9.getSystemService("activity");
        this.f16125h = new d();
    }

    public static e a() {
        if (f16118d == null) {
            synchronized (e.class) {
                try {
                    if (f16118d == null) {
                        f16118d = new e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16118d;
    }

    private void i() {
        d dVar = this.f16125h;
        Context context = this.f16123f;
        ActivityManager activityManager = this.f16124g;
        int memoryClass = activityManager.getMemoryClass();
        if ((context.getApplicationContext().getApplicationInfo().flags & o.f7899d) == 1048576) {
            memoryClass = activityManager.getLargeMemoryClass();
        }
        dVar.f16113d = memoryClass;
        if (t.b().c("t_mem")) {
            return;
        }
        if (this.f16127k == null) {
            this.f16127k = Integer.valueOf(af.b(this.f16123f, u.b.f13004a, u.a.f12985g, -1));
        }
        if (this.f16127k.intValue() <= 0) {
            this.f16127k = Integer.valueOf(b.a());
            af.a(this.f16123f, u.b.f13004a, u.a.f12985g, this.f16127k.intValue());
        }
        this.f16125h.f16110a = this.f16127k.intValue();
    }

    private void j() {
        if (t.b().c("c_num")) {
            return;
        }
        if (this.f16128l == null) {
            this.f16128l = Integer.valueOf(af.b(this.f16123f, u.b.f13004a, u.a.f12986h, -1));
        }
        if (this.f16128l.intValue() <= 0) {
            this.f16128l = Integer.valueOf(Runtime.getRuntime().availableProcessors());
            af.a(this.f16123f, u.b.f13004a, u.a.f12986h, this.f16128l.intValue());
        }
        this.f16125h.f16114e = this.f16128l.intValue();
    }

    private void k() {
        if (t.b().c("t_store")) {
            return;
        }
        if (this.f16129m == null) {
            this.f16129m = Long.valueOf(af.b(this.f16123f, u.b.f13004a, u.a.i, -1L));
        }
        if (this.f16129m.longValue() <= 0) {
            try {
                this.f16129m = Long.valueOf((new StatFs(this.i.getPath()).getBlockCountLong() * r0.getBlockSize()) / 1048576);
            } catch (Throwable unused) {
            }
            af.a(this.f16123f, u.b.f13004a, u.a.i, this.f16129m.longValue());
        }
        this.f16125h.f16115f = this.f16129m.longValue();
    }

    private long l() {
        try {
            return (new StatFs(this.i.getPath()).getAvailableBlocksLong() * r0.getBlockSize()) / 1048576;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public final d b() {
        if (!this.f16122e) {
            return null;
        }
        if (SystemClock.elapsedRealtime() - this.f16120b <= f.f7344a) {
            return this.f16125h;
        }
        this.f16120b = SystemClock.elapsedRealtime();
        this.f16125h.f16117h = a.a();
        this.f16125h.f16111b = b.b();
        this.f16125h.f16116g = l();
        this.f16125h.f16112c = b.a(this.f16124g);
        return this.f16125h;
    }

    public final synchronized void c() {
        this.f16121c.incrementAndGet();
    }

    public final synchronized void d() {
        this.f16121c.decrementAndGet();
    }

    public final synchronized int e() {
        return this.f16121c.get();
    }

    public final int f() {
        if (t.b().c("t_mem")) {
            return 0;
        }
        if (this.f16127k == null) {
            this.f16127k = Integer.valueOf(af.b(this.f16123f, u.b.f13004a, u.a.f12985g, -1));
        }
        if (this.f16127k.intValue() > 0) {
            return this.f16127k.intValue();
        }
        return 0;
    }

    public final int g() {
        if (t.b().c("c_num")) {
            return 0;
        }
        if (this.f16128l == null) {
            this.f16128l = Integer.valueOf(af.b(this.f16123f, u.b.f13004a, u.a.f12986h, -1));
        }
        if (this.f16128l.intValue() > 0) {
            return this.f16128l.intValue();
        }
        return 0;
    }

    public final long h() {
        if (t.b().c("t_store")) {
            return 0L;
        }
        if (this.f16129m == null) {
            this.f16129m = Long.valueOf(af.b(this.f16123f, u.b.f13004a, u.a.i, -1L));
        }
        if (this.f16129m.longValue() > 0) {
            return this.f16129m.longValue();
        }
        return 0L;
    }

    public final void a(com.anythink.core.d.b bVar) {
        this.f16122e = bVar.i();
        synchronized (this) {
            try {
                if (!this.f16126j) {
                    d dVar = this.f16125h;
                    Context context = this.f16123f;
                    ActivityManager activityManager = this.f16124g;
                    int memoryClass = activityManager.getMemoryClass();
                    if ((context.getApplicationContext().getApplicationInfo().flags & o.f7899d) == 1048576) {
                        memoryClass = activityManager.getLargeMemoryClass();
                    }
                    dVar.f16113d = memoryClass;
                    if (!t.b().c("t_mem")) {
                        if (this.f16127k == null) {
                            this.f16127k = Integer.valueOf(af.b(this.f16123f, u.b.f13004a, u.a.f12985g, -1));
                        }
                        if (this.f16127k.intValue() <= 0) {
                            this.f16127k = Integer.valueOf(b.a());
                            af.a(this.f16123f, u.b.f13004a, u.a.f12985g, this.f16127k.intValue());
                        }
                        this.f16125h.f16110a = this.f16127k.intValue();
                    }
                    if (!t.b().c("c_num")) {
                        if (this.f16128l == null) {
                            this.f16128l = Integer.valueOf(af.b(this.f16123f, u.b.f13004a, u.a.f12986h, -1));
                        }
                        if (this.f16128l.intValue() <= 0) {
                            this.f16128l = Integer.valueOf(Runtime.getRuntime().availableProcessors());
                            af.a(this.f16123f, u.b.f13004a, u.a.f12986h, this.f16128l.intValue());
                        }
                        this.f16125h.f16114e = this.f16128l.intValue();
                    }
                    if (!t.b().c("t_store")) {
                        if (this.f16129m == null) {
                            this.f16129m = Long.valueOf(af.b(this.f16123f, u.b.f13004a, u.a.i, -1L));
                        }
                        if (this.f16129m.longValue() <= 0) {
                            try {
                                this.f16129m = Long.valueOf((new StatFs(this.i.getPath()).getBlockCountLong() * r5.getBlockSize()) / 1048576);
                            } catch (Throwable unused) {
                            }
                            af.a(this.f16123f, u.b.f13004a, u.a.i, this.f16129m.longValue());
                        }
                        this.f16125h.f16115f = this.f16129m.longValue();
                    }
                    this.f16126j = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
