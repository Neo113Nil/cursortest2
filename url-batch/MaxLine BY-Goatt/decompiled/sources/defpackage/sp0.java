package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sp0 implements zf0 {
    public final Context m;
    public final rp0 n;
    public final u30 o;
    public final Object p = new Object();
    public Handler q;
    public ThreadPoolExecutor r;
    public ThreadPoolExecutor s;
    public s93 t;

    public sp0(Context context, rp0 rp0Var) {
        j8.o(context, "Context cannot be null");
        this.m = context.getApplicationContext();
        this.n = rp0Var;
        this.o = tp0.d;
    }

    @Override // defpackage.zf0
    public final void a(s93 s93Var) {
        synchronized (this.p) {
            this.t = s93Var;
        }
        synchronized (this.p) {
            try {
                if (this.t == null) {
                    return;
                }
                if (this.r == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new t00("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.s = threadPoolExecutor;
                    this.r = threadPoolExecutor;
                }
                this.r.execute(new k3(18, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.p) {
            try {
                this.t = null;
                Handler handler = this.q;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.q = null;
                ThreadPoolExecutor threadPoolExecutor = this.s;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.r = null;
                this.s = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final mq0 c() {
        try {
            u30 u30Var = this.o;
            Context context = this.m;
            rp0 rp0Var = this.n;
            u30Var.getClass();
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{rp0Var}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            lq0 a = qp0.a(context, Collections.unmodifiableList(arrayList));
            int i = a.a;
            if (i != 0) {
                throw new RuntimeException(in1.l(i, "fetchFonts failed (", ")"));
            }
            mq0[] mq0VarArr = (mq0[]) a.b.get(0);
            if (mq0VarArr == null || mq0VarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return mq0VarArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
