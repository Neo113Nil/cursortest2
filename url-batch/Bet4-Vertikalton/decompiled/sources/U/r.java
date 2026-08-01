package U;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class r implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f866a;

    /* renamed from: b, reason: collision with root package name */
    public final H.e f867b;

    /* renamed from: c, reason: collision with root package name */
    public final J0.e f868c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f869e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f870f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f871g;
    public w1.l h;

    public r(Context context, H.e eVar) {
        J0.e eVar2 = s.d;
        this.d = new Object();
        w1.d.l(context, "Context cannot be null");
        this.f866a = context.getApplicationContext();
        this.f867b = eVar;
        this.f868c = eVar2;
    }

    public final void a() {
        synchronized (this.d) {
            try {
                this.h = null;
                Handler handler = this.f869e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f869e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f871g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f870f = null;
                this.f871g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final H.k b() {
        try {
            J0.e eVar = this.f868c;
            Context context = this.f866a;
            H.e eVar2 = this.f867b;
            eVar.getClass();
            H.j a2 = H.d.a(context, eVar2);
            int i = a2.f275a;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            H.k[] kVarArr = (H.k[]) a2.f276b;
            if (kVarArr == null || kVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return kVarArr[0];
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("provider not found", e2);
        }
    }

    @Override // U.i
    public final void g(w1.l lVar) {
        synchronized (this.d) {
            this.h = lVar;
        }
        synchronized (this.d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f870f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0034a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f871g = threadPoolExecutor;
                    this.f870f = threadPoolExecutor;
                }
                this.f870f.execute(new D0.p(6, this));
            } finally {
            }
        }
    }
}
