package V;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class q implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f903a;

    /* renamed from: b, reason: collision with root package name */
    public final J.d f904b;

    /* renamed from: c, reason: collision with root package name */
    public final L0.e f905c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f906e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f907f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f908g;
    public z1.d h;

    public q(Context context, J.d dVar) {
        L0.e eVar = r.d;
        this.d = new Object();
        z1.l.q(context, "Context cannot be null");
        this.f903a = context.getApplicationContext();
        this.f904b = dVar;
        this.f905c = eVar;
    }

    public final void a() {
        synchronized (this.d) {
            try {
                this.h = null;
                Handler handler = this.f906e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f906e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f908g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f907f = null;
                this.f908g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final J.j b() {
        try {
            L0.e eVar = this.f905c;
            Context context = this.f903a;
            J.d dVar = this.f904b;
            eVar.getClass();
            J.i a2 = J.c.a(context, dVar);
            int i = a2.f373a;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            J.j[] jVarArr = (J.j[]) a2.f374b;
            if (jVarArr == null || jVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return jVarArr[0];
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("provider not found", e2);
        }
    }

    @Override // V.i
    public final void p(z1.d dVar) {
        synchronized (this.d) {
            this.h = dVar;
        }
        synchronized (this.d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f907f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f908g = threadPoolExecutor;
                    this.f907f = threadPoolExecutor;
                }
                this.f907f.execute(new B.a(7, this));
            } finally {
            }
        }
    }
}
