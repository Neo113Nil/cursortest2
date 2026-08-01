package T;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class s implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f813a;

    /* renamed from: b, reason: collision with root package name */
    public final H.e f814b;

    /* renamed from: c, reason: collision with root package name */
    public final H0.e f815c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f816d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f817e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f818f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f819g;
    public q1.l h;

    public s(Context context, H.e eVar) {
        H0.e eVar2 = t.f820d;
        this.f816d = new Object();
        q1.d.h(context, "Context cannot be null");
        this.f813a = context.getApplicationContext();
        this.f814b = eVar;
        this.f815c = eVar2;
    }

    public final void a() {
        synchronized (this.f816d) {
            try {
                this.h = null;
                Handler handler = this.f817e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f817e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f819g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f818f = null;
                this.f819g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final H.k b() {
        try {
            H0.e eVar = this.f815c;
            Context context = this.f813a;
            H.e eVar2 = this.f814b;
            eVar.getClass();
            H.j a2 = H.d.a(context, eVar2);
            int i = a2.f241a;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            H.k[] kVarArr = (H.k[]) a2.f242b;
            if (kVarArr == null || kVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return kVarArr[0];
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("provider not found", e2);
        }
    }

    @Override // T.i
    public final void q(q1.l lVar) {
        synchronized (this.f816d) {
            this.h = lVar;
        }
        synchronized (this.f816d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f818f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0036a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f819g = threadPoolExecutor;
                    this.f818f = threadPoolExecutor;
                }
                this.f818f.execute(new B0.q(5, this));
            } finally {
            }
        }
    }
}
