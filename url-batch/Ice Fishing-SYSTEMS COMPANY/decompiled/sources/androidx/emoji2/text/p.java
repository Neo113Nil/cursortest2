package androidx.emoji2.text;

import B2.N;
import D.RunnableC0281a;
import D.y;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class p implements i {

    /* renamed from: A, reason: collision with root package name */
    public S0.f f4900A;

    /* renamed from: n, reason: collision with root package name */
    public final Context f4901n;

    /* renamed from: u, reason: collision with root package name */
    public final N f4902u;

    /* renamed from: v, reason: collision with root package name */
    public final C3.e f4903v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f4904w;

    /* renamed from: x, reason: collision with root package name */
    public Handler f4905x;

    /* renamed from: y, reason: collision with root package name */
    public ThreadPoolExecutor f4906y;

    /* renamed from: z, reason: collision with root package name */
    public ThreadPoolExecutor f4907z;

    public p(Context context, N n9) {
        C3.e eVar = q.f4908d;
        this.f4904w = new Object();
        S0.f.f(context, "Context cannot be null");
        this.f4901n = context.getApplicationContext();
        this.f4902u = n9;
        this.f4903v = eVar;
    }

    public final void a() {
        synchronized (this.f4904w) {
            try {
                this.f4900A = null;
                Handler handler = this.f4905x;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f4905x = null;
                ThreadPoolExecutor threadPoolExecutor = this.f4907z;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f4906y = null;
                this.f4907z = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final L.h b() {
        try {
            C3.e eVar = this.f4903v;
            Context context = this.f4901n;
            N n9 = this.f4902u;
            eVar.getClass();
            G1.a a9 = L.c.a(context, n9);
            int i = a9.f1194u;
            if (i != 0) {
                throw new RuntimeException(y.i(i, "fetchFonts failed (", ")"));
            }
            L.h[] hVarArr = (L.h[]) a9.f1195v;
            if (hVarArr == null || hVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return hVarArr[0];
        } catch (PackageManager.NameNotFoundException e6) {
            throw new RuntimeException("provider not found", e6);
        }
    }

    @Override // androidx.emoji2.text.i
    public final void c(S0.f fVar) {
        synchronized (this.f4904w) {
            this.f4900A = fVar;
        }
        synchronized (this.f4904w) {
            try {
                if (this.f4900A == null) {
                    return;
                }
                if (this.f4906y == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f4907z = threadPoolExecutor;
                    this.f4906y = threadPoolExecutor;
                }
                this.f4906y.execute(new RunnableC0281a(12, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
