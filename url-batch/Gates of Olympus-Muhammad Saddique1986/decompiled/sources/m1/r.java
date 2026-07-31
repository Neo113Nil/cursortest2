package m1;

import a1.AbstractC0242a;
import a1.C0243b;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class r implements InterfaceC0650h {

    /* renamed from: d, reason: collision with root package name */
    public final Context f6967d;

    /* renamed from: e, reason: collision with root package name */
    public final G1.g f6968e;

    /* renamed from: f, reason: collision with root package name */
    public final A1.i f6969f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f6970g;

    /* renamed from: h, reason: collision with root package name */
    public Handler f6971h;

    /* renamed from: i, reason: collision with root package name */
    public ThreadPoolExecutor f6972i;

    /* renamed from: j, reason: collision with root package name */
    public ThreadPoolExecutor f6973j;

    /* renamed from: k, reason: collision with root package name */
    public O2.l f6974k;

    public r(Context context, G1.g gVar) {
        A1.i iVar = s.f6975d;
        this.f6970g = new Object();
        l0.c.m(context, "Context cannot be null");
        this.f6967d = context.getApplicationContext();
        this.f6968e = gVar;
        this.f6969f = iVar;
    }

    public final void a() {
        synchronized (this.f6970g) {
            try {
                this.f6974k = null;
                Handler handler = this.f6971h;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f6971h = null;
                ThreadPoolExecutor threadPoolExecutor = this.f6973j;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f6972i = null;
                this.f6973j = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // m1.InterfaceC0650h
    public final void b(O2.l lVar) {
        synchronized (this.f6970g) {
            this.f6974k = lVar;
        }
        synchronized (this.f6970g) {
            try {
                if (this.f6974k == null) {
                    return;
                }
                if (this.f6972i == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0643a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f6973j = threadPoolExecutor;
                    this.f6972i = threadPoolExecutor;
                }
                this.f6972i.execute(new E.t(8, this));
            } finally {
            }
        }
    }

    public final C0243b c() {
        try {
            A1.i iVar = this.f6969f;
            Context context = this.f6967d;
            G1.g gVar = this.f6968e;
            iVar.getClass();
            K2.m a3 = AbstractC0242a.a(context, gVar);
            int i3 = a3.f3330b;
            if (i3 != 0) {
                throw new RuntimeException(A.k.g(i3, "fetchFonts failed (", ")"));
            }
            C0243b[] c0243bArr = (C0243b[]) a3.f3331c;
            if (c0243bArr == null || c0243bArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return c0243bArr[0];
        } catch (PackageManager.NameNotFoundException e3) {
            throw new RuntimeException("provider not found", e3);
        }
    }
}
