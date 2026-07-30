package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class g20 implements xu {
    public final Context d;
    public final f20 e;
    public final j41 g;
    public final Object h = new Object();
    public Handler i;
    public ThreadPoolExecutor j;
    public ThreadPoolExecutor k;
    public la0 l;

    public g20(Context context, f20 f20Var) {
        ka0.l(context, "Context cannot be null");
        this.d = context.getApplicationContext();
        this.e = f20Var;
        this.g = h20.d;
    }

    public final void a() {
        synchronized (this.h) {
            try {
                this.l = null;
                Handler handler = this.i;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.i = null;
                ThreadPoolExecutor threadPoolExecutor = this.k;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.j = null;
                this.k = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.xu
    public final void b(la0 la0Var) {
        synchronized (this.h) {
            this.l = la0Var;
        }
        synchronized (this.h) {
            try {
                if (this.l == null) {
                    return;
                }
                if (this.j == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new bm("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.k = threadPoolExecutor;
                    this.j = threadPoolExecutor;
                }
                this.j.execute(new e4(4, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final z20 c() {
        try {
            j41 j41Var = this.g;
            Context context = this.d;
            f20 f20Var = this.e;
            j41Var.getClass();
            jj a = e20.a(context, List.of(f20Var));
            int i = a.d;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            z20[] z20VarArr = (z20[]) ((List) a.e).get(0);
            if (z20VarArr == null || z20VarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return z20VarArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
