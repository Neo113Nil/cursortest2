package k1;

import A.AbstractC0017m;
import G1.y;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7397a;

    /* renamed from: b, reason: collision with root package name */
    public final Y0.b f7398b;

    /* renamed from: c, reason: collision with root package name */
    public final E1.i f7399c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7400d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f7401e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f7402f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f7403g;

    /* renamed from: h, reason: collision with root package name */
    public M1.a f7404h;

    public n(Context context, Y0.b bVar) {
        E1.i iVar = o.f7405d;
        this.f7400d = new Object();
        M1.a.p(context, "Context cannot be null");
        this.f7397a = context.getApplicationContext();
        this.f7398b = bVar;
        this.f7399c = iVar;
    }

    @Override // k1.g
    public final void a(M1.a aVar) {
        synchronized (this.f7400d) {
            this.f7404h = aVar;
        }
        synchronized (this.f7400d) {
            try {
                if (this.f7404h == null) {
                    return;
                }
                if (this.f7402f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0752a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f7403g = threadPoolExecutor;
                    this.f7402f = threadPoolExecutor;
                }
                this.f7402f.execute(new C.t(10, this));
            } finally {
            }
        }
    }

    public final void b() {
        synchronized (this.f7400d) {
            try {
                this.f7404h = null;
                Handler handler = this.f7401e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f7401e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f7403g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f7402f = null;
                this.f7403g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Y0.c c() {
        try {
            E1.i iVar = this.f7399c;
            Context context = this.f7397a;
            Y0.b bVar = this.f7398b;
            iVar.getClass();
            y a4 = Y0.a.a(context, bVar);
            int i2 = a4.f3164a;
            if (i2 != 0) {
                throw new RuntimeException(AbstractC0017m.h(i2, "fetchFonts failed (", ")"));
            }
            Y0.c[] cVarArr = (Y0.c[]) a4.f3165b;
            if (cVarArr == null || cVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return cVarArr[0];
        } catch (PackageManager.NameNotFoundException e4) {
            throw new RuntimeException("provider not found", e4);
        }
    }
}
