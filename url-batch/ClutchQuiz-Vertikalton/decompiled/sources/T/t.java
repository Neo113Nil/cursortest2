package T;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class t implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f837a;

    /* renamed from: b, reason: collision with root package name */
    public final H.e f838b;

    /* renamed from: c, reason: collision with root package name */
    public final O0.e f839c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f840e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f841f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f842g;
    public d h;

    public t(Context context, H.e eVar) {
        O0.e eVar2 = u.d;
        this.d = new Object();
        A.c.k(context, "Context cannot be null");
        this.f837a = context.getApplicationContext();
        this.f838b = eVar;
        this.f839c = eVar2;
    }

    public final void a() {
        synchronized (this.d) {
            try {
                this.h = null;
                Handler handler = this.f840e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f840e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f842g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f841f = null;
                this.f842g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final H.k b() {
        try {
            O0.e eVar = this.f839c;
            Context context = this.f837a;
            H.e eVar2 = this.f838b;
            eVar.getClass();
            H.j a2 = H.d.a(context, eVar2);
            int i = a2.f235a;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            H.k[] kVarArr = (H.k[]) a2.f236b;
            if (kVarArr == null || kVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return kVarArr[0];
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("provider not found", e2);
        }
    }

    @Override // T.j
    public final void i(d dVar) {
        synchronized (this.d) {
            this.h = dVar;
        }
        synchronized (this.d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f841f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0029a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f842g = threadPoolExecutor;
                    this.f841f = threadPoolExecutor;
                }
                this.f841f.execute(new B0.b(6, this));
            } finally {
            }
        }
    }
}
