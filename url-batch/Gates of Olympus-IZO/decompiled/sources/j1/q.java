package j1;

import H2.AbstractC0080b;
import a.AbstractC0157a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import h.AbstractC0416e;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class q implements InterfaceC0517h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5274a;

    /* renamed from: b, reason: collision with root package name */
    public final A2.k f5275b;

    /* renamed from: c, reason: collision with root package name */
    public final F0.a f5276c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5277d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f5278e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f5279f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f5280g;

    /* renamed from: h, reason: collision with root package name */
    public AbstractC0416e f5281h;

    public q(Context context, A2.k kVar) {
        F0.a aVar = r.f5282d;
        this.f5277d = new Object();
        AbstractC0157a.p(context, "Context cannot be null");
        this.f5274a = context.getApplicationContext();
        this.f5275b = kVar;
        this.f5276c = aVar;
    }

    public final void a() {
        synchronized (this.f5277d) {
            try {
                this.f5281h = null;
                Handler handler = this.f5278e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f5278e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f5280g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f5279f = null;
                this.f5280g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Y0.b b() {
        try {
            F0.a aVar = this.f5276c;
            Context context = this.f5274a;
            A2.k kVar = this.f5275b;
            aVar.getClass();
            E2.n a3 = Y0.a.a(context, kVar);
            int i3 = a3.f843b;
            if (i3 != 0) {
                throw new RuntimeException(AbstractC0080b.i("fetchFonts failed (", i3, ")"));
            }
            Y0.b[] bVarArr = (Y0.b[]) a3.f844c;
            if (bVarArr == null || bVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return bVarArr[0];
        } catch (PackageManager.NameNotFoundException e3) {
            throw new RuntimeException("provider not found", e3);
        }
    }

    @Override // j1.InterfaceC0517h
    public final void f(AbstractC0416e abstractC0416e) {
        synchronized (this.f5277d) {
            this.f5281h = abstractC0416e;
        }
        synchronized (this.f5277d) {
            try {
                if (this.f5281h == null) {
                    return;
                }
                if (this.f5279f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0510a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f5280g = threadPoolExecutor;
                    this.f5279f = threadPoolExecutor;
                }
                this.f5279f.execute(new E.u(6, this));
            } finally {
            }
        }
    }
}
