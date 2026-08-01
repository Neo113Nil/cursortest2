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
    public final Context f808a;

    /* renamed from: b, reason: collision with root package name */
    public final H.e f809b;

    /* renamed from: c, reason: collision with root package name */
    public final M0.e f810c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f811e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f812f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f813g;
    public u1.l h;

    public r(Context context, H.e eVar) {
        M0.e eVar2 = s.d;
        this.d = new Object();
        u1.d.g(context, "Context cannot be null");
        this.f808a = context.getApplicationContext();
        this.f809b = eVar;
        this.f810c = eVar2;
    }

    public final void a() {
        synchronized (this.d) {
            try {
                this.h = null;
                Handler handler = this.f811e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f811e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f813g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f812f = null;
                this.f813g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final H.k b() {
        try {
            M0.e eVar = this.f810c;
            Context context = this.f808a;
            H.e eVar2 = this.f809b;
            eVar.getClass();
            H.j a2 = H.d.a(context, eVar2);
            int i = a2.f289a;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            H.k[] kVarArr = (H.k[]) a2.f290b;
            if (kVarArr == null || kVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return kVarArr[0];
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("provider not found", e2);
        }
    }

    @Override // T.i
    public final void h(u1.l lVar) {
        synchronized (this.d) {
            this.h = lVar;
        }
        synchronized (this.d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f812f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0030a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f813g = threadPoolExecutor;
                    this.f812f = threadPoolExecutor;
                }
                this.f812f.execute(new G0.o(5, this));
            } finally {
            }
        }
    }
}
