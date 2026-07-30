package l3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.lifecycle.c0;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5925a;

    /* renamed from: b, reason: collision with root package name */
    public final g3.k f5926b;

    /* renamed from: c, reason: collision with root package name */
    public final j4.i f5927c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5928d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public Handler f5929e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f5930f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f5931g;

    /* renamed from: h, reason: collision with root package name */
    public a8.m f5932h;

    public s(Context context, g3.k kVar) {
        a.a.m(context, "Context cannot be null");
        this.f5925a = context.getApplicationContext();
        this.f5926b = kVar;
        this.f5927c = t.f5933d;
    }

    @Override // l3.j
    public final void a(a8.m mVar) {
        synchronized (this.f5928d) {
            this.f5932h = mVar;
        }
        synchronized (this.f5928d) {
            try {
                if (this.f5932h == null) {
                    return;
                }
                if (this.f5930f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f5931g = threadPoolExecutor;
                    this.f5930f = threadPoolExecutor;
                }
                this.f5930f.execute(new c0(7, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f5928d) {
            try {
                this.f5932h = null;
                Handler handler = this.f5929e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f5929e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f5931g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f5930f = null;
                this.f5931g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final y2.b c() {
        try {
            j4.i iVar = this.f5927c;
            Context context = this.f5925a;
            g3.k kVar = this.f5926b;
            iVar.getClass();
            l.i a3 = y2.a.a(context, kVar);
            int i7 = a3.f5525b;
            if (i7 != 0) {
                throw new RuntimeException(a0.m.g(i7, "fetchFonts failed (", ")"));
            }
            y2.b[] bVarArr = (y2.b[]) a3.f5526c;
            if (bVarArr == null || bVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return bVarArr[0];
        } catch (PackageManager.NameNotFoundException e9) {
            throw new RuntimeException("provider not found", e9);
        }
    }
}
