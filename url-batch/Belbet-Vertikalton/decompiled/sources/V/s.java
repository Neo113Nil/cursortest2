package V;

import a.AbstractC0058a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class s implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1295a;

    /* renamed from: b, reason: collision with root package name */
    public final J.d f1296b;

    /* renamed from: c, reason: collision with root package name */
    public final N0.e f1297c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1298d;
    public Handler e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f1299f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f1300g;

    /* renamed from: h, reason: collision with root package name */
    public AbstractC0058a f1301h;

    public s(Context context, J.d dVar) {
        N0.e eVar = t.f1302d;
        this.f1298d = new Object();
        H1.d.l(context, "Context cannot be null");
        this.f1295a = context.getApplicationContext();
        this.f1296b = dVar;
        this.f1297c = eVar;
    }

    public final void a() {
        synchronized (this.f1298d) {
            try {
                this.f1301h = null;
                Handler handler = this.e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f1300g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f1299f = null;
                this.f1300g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final J.i b() {
        try {
            N0.e eVar = this.f1297c;
            Context context = this.f1295a;
            J.d dVar = this.f1296b;
            eVar.getClass();
            D1.p a2 = J.c.a(context, dVar);
            int i = a2.f270a;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            J.i[] iVarArr = (J.i[]) a2.f271b;
            if (iVarArr == null || iVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return iVarArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }

    @Override // V.i
    public final void e(AbstractC0058a abstractC0058a) {
        synchronized (this.f1298d) {
            this.f1301h = abstractC0058a;
        }
        synchronized (this.f1298d) {
            try {
                if (this.f1301h == null) {
                    return;
                }
                if (this.f1299f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0035a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f1300g = threadPoolExecutor;
                    this.f1299f = threadPoolExecutor;
                }
                this.f1299f.execute(new A0.b(8, this));
            } finally {
            }
        }
    }
}
