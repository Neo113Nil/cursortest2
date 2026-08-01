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
    public final Context f875a;

    /* renamed from: b, reason: collision with root package name */
    public final H.e f876b;

    /* renamed from: c, reason: collision with root package name */
    public final J0.e f877c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f878e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f879f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f880g;
    public z1.l h;

    public r(Context context, H.e eVar) {
        J0.e eVar2 = s.d;
        this.d = new Object();
        z1.d.q(context, "Context cannot be null");
        this.f875a = context.getApplicationContext();
        this.f876b = eVar;
        this.f877c = eVar2;
    }

    public final void a() {
        synchronized (this.d) {
            try {
                this.h = null;
                Handler handler = this.f878e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f878e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f880g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f879f = null;
                this.f880g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final H.k b() {
        try {
            J0.e eVar = this.f877c;
            Context context = this.f875a;
            H.e eVar2 = this.f876b;
            eVar.getClass();
            H.j a2 = H.d.a(context, eVar2);
            int i = a2.f292a;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            H.k[] kVarArr = (H.k[]) a2.f293b;
            if (kVarArr == null || kVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return kVarArr[0];
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("provider not found", e2);
        }
    }

    @Override // U.i
    public final void q(z1.l lVar) {
        synchronized (this.d) {
            this.h = lVar;
        }
        synchronized (this.d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f879f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0034a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f880g = threadPoolExecutor;
                    this.f879f = threadPoolExecutor;
                }
                this.f879f.execute(new D0.p(7, this));
            } finally {
            }
        }
    }
}
