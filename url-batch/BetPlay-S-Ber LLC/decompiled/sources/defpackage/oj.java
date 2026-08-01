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

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class oj implements bh {
    public final Context f;
    public final nj g;
    public final vg h;
    public final Object i = new Object();
    public Handler j;
    public ThreadPoolExecutor k;
    public ThreadPoolExecutor l;
    public j8 m;

    public oj(Context context, nj njVar) {
        vw.o(context, "Context cannot be null");
        this.f = context.getApplicationContext();
        this.g = njVar;
        this.h = pj.d;
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

    public final yj b() {
        try {
            vg vgVar = this.h;
            Context context = this.f;
            nj njVar = this.g;
            vgVar.getClass();
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{njVar}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            v2 a = mj.a(context, Collections.unmodifiableList(arrayList));
            int i = a.a;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            yj[] yjVarArr = (yj[]) ((List) a.b).get(0);
            if (yjVarArr == null || yjVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return yjVarArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }

    @Override // defpackage.bh
    public final void h(j8 j8Var) {
        synchronized (this.i) {
            this.m = j8Var;
        }
        synchronized (this.i) {
            try {
                if (this.m == null) {
                    return;
                }
                if (this.k == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new dc("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.l = threadPoolExecutor;
                    this.k = threadPoolExecutor;
                }
                this.k.execute(new q1(7, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
