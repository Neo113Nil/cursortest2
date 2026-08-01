package androidx.emoji2.text;

import a4.e0;
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

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class u implements k {

    /* renamed from: f, reason: collision with root package name */
    public final Context f475f;

    /* renamed from: g, reason: collision with root package name */
    public final k0.d f476g;
    public final o2.f h;
    public final Object i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public Handler f477j;

    /* renamed from: k, reason: collision with root package name */
    public ThreadPoolExecutor f478k;

    /* renamed from: l, reason: collision with root package name */
    public ThreadPoolExecutor f479l;

    /* renamed from: m, reason: collision with root package name */
    public b4.d f480m;

    public u(Context context, k0.d dVar) {
        b4.l.h(context, "Context cannot be null");
        this.f475f = context.getApplicationContext();
        this.f476g = dVar;
        this.h = v.d;
    }

    public final void a() {
        synchronized (this.i) {
            try {
                this.f480m = null;
                Handler handler = this.f477j;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f477j = null;
                ThreadPoolExecutor threadPoolExecutor = this.f479l;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f478k = null;
                this.f479l = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final k0.i b() {
        try {
            o2.f fVar = this.h;
            Context context = this.f475f;
            k0.d dVar = this.f476g;
            fVar.getClass();
            Object[] objArr = {dVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            e0 a5 = k0.c.a(context, Collections.unmodifiableList(arrayList));
            int i = a5.f167a;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            k0.i[] iVarArr = (k0.i[]) ((List) a5.f168b).get(0);
            if (iVarArr == null || iVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return iVarArr[0];
        } catch (PackageManager.NameNotFoundException e4) {
            throw new RuntimeException("provider not found", e4);
        }
    }

    @Override // androidx.emoji2.text.k
    public final void g(b4.d dVar) {
        synchronized (this.i) {
            this.f480m = dVar;
        }
        synchronized (this.i) {
            try {
                if (this.f480m == null) {
                    return;
                }
                if (this.f478k == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f479l = threadPoolExecutor;
                    this.f478k = threadPoolExecutor;
                }
                this.f478k.execute(new a.j(2, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
