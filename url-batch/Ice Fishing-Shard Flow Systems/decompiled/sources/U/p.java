package U;

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
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class p implements i {

    /* renamed from: d, reason: collision with root package name */
    public final Context f2688d;

    /* renamed from: e, reason: collision with root package name */
    public final F.f f2689e;

    /* renamed from: i, reason: collision with root package name */
    public final c2.e f2690i;

    /* renamed from: l, reason: collision with root package name */
    public final Object f2691l = new Object();

    /* renamed from: m, reason: collision with root package name */
    public Handler f2692m;

    /* renamed from: n, reason: collision with root package name */
    public ThreadPoolExecutor f2693n;

    /* renamed from: o, reason: collision with root package name */
    public ThreadPoolExecutor f2694o;

    /* renamed from: p, reason: collision with root package name */
    public V6.b f2695p;

    public p(Context context, F.f fVar) {
        AbstractC1053a.j(context, "Context cannot be null");
        this.f2688d = context.getApplicationContext();
        this.f2689e = fVar;
        this.f2690i = q.f2696d;
    }

    @Override // U.i
    public final void a(V6.b bVar) {
        synchronized (this.f2691l) {
            this.f2695p = bVar;
        }
        synchronized (this.f2691l) {
            try {
                if (this.f2695p == null) {
                    return;
                }
                if (this.f2693n == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f2694o = threadPoolExecutor;
                    this.f2693n = threadPoolExecutor;
                }
                this.f2693n.execute(new A.k(4, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f2691l) {
            try {
                this.f2695p = null;
                Handler handler = this.f2692m;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f2692m = null;
                ThreadPoolExecutor threadPoolExecutor = this.f2694o;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f2693n = null;
                this.f2694o = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final F.k c() {
        try {
            c2.e eVar = this.f2690i;
            Context context = this.f2688d;
            F.f fVar = this.f2689e;
            eVar.getClass();
            Object[] objArr = {fVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            B6.p a7 = F.e.a(context, Collections.unmodifiableList(arrayList));
            int i2 = a7.f233b;
            if (i2 != 0) {
                throw new RuntimeException(C4.p.h(i2, "fetchFonts failed (", ")"));
            }
            F.k[] kVarArr = (F.k[]) ((List) a7.f234c).get(0);
            if (kVarArr == null || kVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return kVarArr[0];
        } catch (PackageManager.NameNotFoundException e7) {
            throw new RuntimeException("provider not found", e7);
        }
    }
}
