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
    public final Context f814a;

    /* renamed from: b, reason: collision with root package name */
    public final H.e f815b;

    /* renamed from: c, reason: collision with root package name */
    public final H0.e f816c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f817d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f818e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f819f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f820g;
    public q1.l h;

    public s(Context context, H.e eVar) {
        H0.e eVar2 = t.f821d;
        this.f817d = new Object();
        q1.d.h(context, "Context cannot be null");
        this.f814a = context.getApplicationContext();
        this.f815b = eVar;
        this.f816c = eVar2;
    }

    public final void a() {
        synchronized (this.f817d) {
            try {
                this.h = null;
                Handler handler = this.f818e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f818e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f820g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f819f = null;
                this.f820g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final H.k b() {
        try {
            H0.e eVar = this.f816c;
            Context context = this.f814a;
            H.e eVar2 = this.f815b;
            eVar.getClass();
            H.j a2 = H.d.a(context, eVar2);
            int i = a2.f240a;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            H.k[] kVarArr = (H.k[]) a2.f241b;
            if (kVarArr == null || kVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return kVarArr[0];
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("provider not found", e2);
        }
    }

    @Override // T.i
    public final void u(q1.l lVar) {
        synchronized (this.f817d) {
            this.h = lVar;
        }
        synchronized (this.f817d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f819f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0036a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f820g = threadPoolExecutor;
                    this.f819f = threadPoolExecutor;
                }
                this.f819f.execute(new B0.q(5, this));
            } finally {
            }
        }
    }
}
