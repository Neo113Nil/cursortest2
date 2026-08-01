package U;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class s implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1110a;

    /* renamed from: b, reason: collision with root package name */
    public final H.e f1111b;

    /* renamed from: c, reason: collision with root package name */
    public final R0.e f1112c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f1113e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f1114f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f1115g;
    public H1.d h;

    public s(Context context, H.e eVar) {
        R0.e eVar2 = t.d;
        this.d = new Object();
        H1.d.j(context, "Context cannot be null");
        this.f1110a = context.getApplicationContext();
        this.f1111b = eVar;
        this.f1112c = eVar2;
    }

    public final void a() {
        synchronized (this.d) {
            try {
                this.h = null;
                Handler handler = this.f1113e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f1113e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f1115g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f1114f = null;
                this.f1115g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final H.j b() {
        try {
            R0.e eVar = this.f1112c;
            Context context = this.f1110a;
            H.e eVar2 = this.f1111b;
            eVar.getClass();
            C0.f a2 = H.d.a(context, eVar2);
            int i = a2.f95a;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            H.j[] jVarArr = (H.j[]) a2.f96b;
            if (jVarArr == null || jVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return jVarArr[0];
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("provider not found", e2);
        }
    }

    @Override // U.i
    public final void e(H1.d dVar) {
        synchronized (this.d) {
            this.h = dVar;
        }
        synchronized (this.d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f1114f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0030a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f1115g = threadPoolExecutor;
                    this.f1114f = threadPoolExecutor;
                }
                this.f1114f.execute(new E0.b(3, this));
            } finally {
            }
        }
    }
}
