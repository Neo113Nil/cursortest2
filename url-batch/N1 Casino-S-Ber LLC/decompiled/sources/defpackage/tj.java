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

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class tj implements jh {
    public final Context f;
    public final sj g;
    public final dh h;
    public final Object i = new Object();
    public Handler j;
    public ThreadPoolExecutor k;
    public ThreadPoolExecutor l;
    public zo m;

    public tj(Context context, sj sjVar) {
        zo.g(context, "Context cannot be null");
        this.f = context.getApplicationContext();
        this.g = sjVar;
        this.h = uj.d;
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

    public final dk b() {
        try {
            dh dhVar = this.h;
            Context context = this.f;
            sj sjVar = this.g;
            dhVar.getClass();
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{sjVar}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            or a = rj.a(context, Collections.unmodifiableList(arrayList));
            int i = a.f;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            dk[] dkVarArr = (dk[]) ((List) a.g).get(0);
            if (dkVarArr == null || dkVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return dkVarArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }

    @Override // defpackage.jh
    public final void e(zo zoVar) {
        synchronized (this.i) {
            this.m = zoVar;
        }
        synchronized (this.i) {
            try {
                if (this.m == null) {
                    return;
                }
                if (this.k == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new zb("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.l = threadPoolExecutor;
                    this.k = threadPoolExecutor;
                }
                this.k.execute(new m1(7, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
