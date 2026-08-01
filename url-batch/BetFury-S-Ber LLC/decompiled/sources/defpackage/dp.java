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

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class dp implements yl {
    public final Context f;
    public final cp g;
    public final sl h;
    public final Object i = new Object();
    public Handler j;
    public ThreadPoolExecutor k;
    public ThreadPoolExecutor l;
    public bi m;

    public dp(Context context, cp cpVar) {
        bi.q(context, "Context cannot be null");
        this.f = context.getApplicationContext();
        this.g = cpVar;
        this.h = ep.d;
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

    @Override // defpackage.yl
    public final void b(bi biVar) {
        synchronized (this.i) {
            this.m = biVar;
        }
        synchronized (this.i) {
            try {
                if (this.m == null) {
                    return;
                }
                if (this.k == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new be("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.l = threadPoolExecutor;
                    this.k = threadPoolExecutor;
                }
                this.k.execute(new r1(7, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final np c() {
        try {
            sl slVar = this.h;
            Context context = this.f;
            cp cpVar = this.g;
            slVar.getClass();
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{cpVar}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            u2 a = bp.a(context, Collections.unmodifiableList(arrayList));
            int i = a.f;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            np[] npVarArr = (np[]) ((List) a.g).get(0);
            if (npVarArr == null || npVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return npVarArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
