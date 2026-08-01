package defpackage;

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

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class xl implements kj {
    public final Context f;
    public final wl g;
    public final ej h;
    public final Object i = new Object();
    public Handler j;
    public ThreadPoolExecutor k;
    public ThreadPoolExecutor l;
    public b9 m;

    public xl(Context context, wl wlVar) {
        b9.f(context, "Context cannot be null");
        this.f = context.getApplicationContext();
        this.g = wlVar;
        this.h = yl.d;
    }

    public final void a() {
        synchronized (this.i) {
            try {
                this.m = null;
                Handler handler = this.j;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.j = null;
                ThreadPoolExecutor threadPoolExecutor = this.l;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.k = null;
                this.l = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final hm b() {
        try {
            ej ejVar = this.h;
            Context context = this.f;
            wl wlVar = this.g;
            ejVar.getClass();
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{wlVar}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            l2 a = vl.a(context, Collections.unmodifiableList(arrayList));
            int i = a.f;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            hm[] hmVarArr = (hm[]) ((List) a.g).get(0);
            if (hmVarArr == null || hmVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return hmVarArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }

    @Override // defpackage.kj
    public final void i(b9 b9Var) {
        synchronized (this.i) {
            this.m = b9Var;
        }
        synchronized (this.i) {
            try {
                if (this.m == null) {
                    return;
                }
                if (this.k == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new zc("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.l = threadPoolExecutor;
                    this.k = threadPoolExecutor;
                }
                this.k.execute(new n1(7, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
