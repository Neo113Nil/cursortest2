package c4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.lifecycle.d0;
import com.google.android.gms.internal.measurement.bf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s implements j {

    /* renamed from: d, reason: collision with root package name */
    public final Context f1779d;

    /* renamed from: e, reason: collision with root package name */
    public final l3.c f1780e;

    /* renamed from: i, reason: collision with root package name */
    public final u8.d f1781i;

    /* renamed from: r, reason: collision with root package name */
    public final Object f1782r = new Object();

    /* renamed from: s, reason: collision with root package name */
    public Handler f1783s;

    /* renamed from: t, reason: collision with root package name */
    public ThreadPoolExecutor f1784t;

    /* renamed from: u, reason: collision with root package name */
    public ThreadPoolExecutor f1785u;

    /* renamed from: v, reason: collision with root package name */
    public a.a f1786v;

    public s(Context context, l3.c cVar) {
        i7.a.A(context, "Context cannot be null");
        this.f1779d = context.getApplicationContext();
        this.f1780e = cVar;
        this.f1781i = t.f1787d;
    }

    public final void a() {
        synchronized (this.f1782r) {
            try {
                this.f1786v = null;
                Handler handler = this.f1783s;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f1783s = null;
                ThreadPoolExecutor threadPoolExecutor = this.f1785u;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f1784t = null;
                this.f1785u = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c4.j
    public final void b(a.a aVar) {
        synchronized (this.f1782r) {
            this.f1786v = aVar;
        }
        synchronized (this.f1782r) {
            try {
                if (this.f1786v == null) {
                    return;
                }
                if (this.f1784t == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f1785u = threadPoolExecutor;
                    this.f1784t = threadPoolExecutor;
                }
                this.f1784t.execute(new d0(1, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final l3.h c() {
        try {
            u8.d dVar = this.f1781i;
            Context context = this.f1779d;
            l3.c cVar = this.f1780e;
            dVar.getClass();
            Object[] objArr = {cVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            bf a9 = l3.b.a(context, Collections.unmodifiableList(arrayList));
            int i3 = a9.f2174d;
            if (i3 != 0) {
                throw new RuntimeException(n0.l.f(i3, "fetchFonts failed (", ")"));
            }
            l3.h[] hVarArr = (l3.h[]) ((List) a9.f2175e).get(0);
            if (hVarArr == null || hVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return hVarArr[0];
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("provider not found", e2);
        }
    }
}
