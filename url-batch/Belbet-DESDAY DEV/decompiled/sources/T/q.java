package T;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class q implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f740a;

    /* renamed from: b, reason: collision with root package name */
    public final H.e f741b;

    /* renamed from: c, reason: collision with root package name */
    public final H0.e f742c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f743e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f744f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f745g;
    public q1.d h;

    public q(Context context, H.e eVar) {
        H0.e eVar2 = r.d;
        this.d = new Object();
        q1.l.i(context, "Context cannot be null");
        this.f740a = context.getApplicationContext();
        this.f741b = eVar;
        this.f742c = eVar2;
    }

    public final void a() {
        synchronized (this.d) {
            try {
                this.h = null;
                Handler handler = this.f743e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f743e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f745g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f744f = null;
                this.f745g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final H.k b() {
        try {
            H0.e eVar = this.f742c;
            Context context = this.f740a;
            H.e eVar2 = this.f741b;
            eVar.getClass();
            H.j a2 = H.d.a(context, eVar2);
            int i = a2.f227a;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            H.k[] kVarArr = (H.k[]) a2.f228b;
            if (kVarArr == null || kVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return kVarArr[0];
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("provider not found", e2);
        }
    }

    @Override // T.i
    public final void l(q1.d dVar) {
        synchronized (this.d) {
            this.h = dVar;
        }
        synchronized (this.d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f744f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f745g = threadPoolExecutor;
                    this.f744f = threadPoolExecutor;
                }
                this.f744f.execute(new B0.q(6, this));
            } finally {
            }
        }
    }
}
