package T;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class r implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f793a;

    /* renamed from: b, reason: collision with root package name */
    public final H.e f794b;

    /* renamed from: c, reason: collision with root package name */
    public final I0.e f795c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f796e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f797f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f798g;
    public u1.l h;

    public r(Context context, H.e eVar) {
        I0.e eVar2 = s.d;
        this.d = new Object();
        u1.l.k(context, "Context cannot be null");
        this.f793a = context.getApplicationContext();
        this.f794b = eVar;
        this.f795c = eVar2;
    }

    public final void a() {
        synchronized (this.d) {
            try {
                this.h = null;
                Handler handler = this.f796e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f796e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f798g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f797f = null;
                this.f798g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final H.k b() {
        try {
            I0.e eVar = this.f795c;
            Context context = this.f793a;
            H.e eVar2 = this.f794b;
            eVar.getClass();
            H.j a2 = H.d.a(context, eVar2);
            int i = a2.f220a;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            H.k[] kVarArr = (H.k[]) a2.f221b;
            if (kVarArr == null || kVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return kVarArr[0];
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("provider not found", e2);
        }
    }

    @Override // T.i
    public final void g(u1.l lVar) {
        synchronized (this.d) {
            this.h = lVar;
        }
        synchronized (this.d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f797f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0031a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f798g = threadPoolExecutor;
                    this.f797f = threadPoolExecutor;
                }
                this.f797f.execute(new C0.p(6, this));
            } finally {
            }
        }
    }
}
