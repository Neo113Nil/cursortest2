package V;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class r implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f917a;

    /* renamed from: b, reason: collision with root package name */
    public final I.d f918b;

    /* renamed from: c, reason: collision with root package name */
    public final K0.e f919c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f920e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f921f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f922g;

    /* renamed from: h, reason: collision with root package name */
    public A1.m f923h;

    public r(Context context, I.d dVar) {
        K0.e eVar = s.d;
        this.d = new Object();
        A1.m.j(context, "Context cannot be null");
        this.f917a = context.getApplicationContext();
        this.f918b = dVar;
        this.f919c = eVar;
    }

    public final void a() {
        synchronized (this.d) {
            try {
                this.f923h = null;
                Handler handler = this.f920e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f920e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f922g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f921f = null;
                this.f922g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final I.j b() {
        try {
            K0.e eVar = this.f919c;
            Context context = this.f917a;
            I.d dVar = this.f918b;
            eVar.getClass();
            I.i a2 = I.c.a(context, dVar);
            int i = a2.f335a;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            I.j[] jVarArr = (I.j[]) a2.f336b;
            if (jVarArr == null || jVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return jVarArr[0];
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("provider not found", e2);
        }
    }

    @Override // V.i
    public final void s(A1.m mVar) {
        synchronized (this.d) {
            this.f923h = mVar;
        }
        synchronized (this.d) {
            try {
                if (this.f923h == null) {
                    return;
                }
                if (this.f921f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f922g = threadPoolExecutor;
                    this.f921f = threadPoolExecutor;
                }
                this.f921f.execute(new A.a(8, this));
            } finally {
            }
        }
    }
}
