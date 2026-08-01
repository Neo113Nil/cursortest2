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
    public final Context f820a;

    /* renamed from: b, reason: collision with root package name */
    public final H.e f821b;

    /* renamed from: c, reason: collision with root package name */
    public final I0.e f822c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f823e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f824f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f825g;
    public x1.d h;

    public r(Context context, H.e eVar) {
        I0.e eVar2 = s.d;
        this.d = new Object();
        x1.d.j(context, "Context cannot be null");
        this.f820a = context.getApplicationContext();
        this.f821b = eVar;
        this.f822c = eVar2;
    }

    public final void a() {
        synchronized (this.d) {
            try {
                this.h = null;
                Handler handler = this.f823e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f823e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f825g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f824f = null;
                this.f825g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final H.k b() {
        try {
            I0.e eVar = this.f822c;
            Context context = this.f820a;
            H.e eVar2 = this.f821b;
            eVar.getClass();
            H.j a2 = H.d.a(context, eVar2);
            int i = a2.f273a;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            H.k[] kVarArr = (H.k[]) a2.f274b;
            if (kVarArr == null || kVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return kVarArr[0];
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("provider not found", e2);
        }
    }

    @Override // T.i
    public final void e(x1.d dVar) {
        synchronized (this.d) {
            this.h = dVar;
        }
        synchronized (this.d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f824f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0031a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f825g = threadPoolExecutor;
                    this.f824f = threadPoolExecutor;
                }
                this.f824f.execute(new C0.p(7, this));
            } finally {
            }
        }
    }
}
