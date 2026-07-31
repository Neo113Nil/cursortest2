package d4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class v implements k {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2291a;

    /* renamed from: b, reason: collision with root package name */
    public final n3.c f2292b;

    /* renamed from: c, reason: collision with root package name */
    public final w5.f f2293c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2294d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public Handler f2295e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f2296f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f2297g;

    /* renamed from: h, reason: collision with root package name */
    public a.a f2298h;

    public v(Context context, n3.c cVar) {
        h0.a.o(context, "Context cannot be null");
        this.f2291a = context.getApplicationContext();
        this.f2292b = cVar;
        this.f2293c = w.f2299d;
    }

    @Override // d4.k
    public final void a(a.a aVar) {
        synchronized (this.f2294d) {
            this.f2298h = aVar;
        }
        synchronized (this.f2294d) {
            try {
                if (this.f2298h == null) {
                    return;
                }
                if (this.f2296f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f2297g = threadPoolExecutor;
                    this.f2296f = threadPoolExecutor;
                }
                this.f2296f.execute(new a1.a(5, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f2294d) {
            try {
                this.f2298h = null;
                Handler handler = this.f2295e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f2295e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f2297g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f2296f = null;
                this.f2297g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final n3.h c() {
        try {
            w5.f fVar = this.f2293c;
            Context context = this.f2291a;
            n3.c cVar = this.f2292b;
            fVar.getClass();
            Object[] objArr = {cVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            k5.e a8 = n3.b.a(context, Collections.unmodifiableList(arrayList));
            int i = a8.f4189d;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            n3.h[] hVarArr = (n3.h[]) ((List) a8.f4190e).get(0);
            if (hVarArr == null || hVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return hVarArr[0];
        } catch (PackageManager.NameNotFoundException e8) {
            throw new RuntimeException("provider not found", e8);
        }
    }
}
