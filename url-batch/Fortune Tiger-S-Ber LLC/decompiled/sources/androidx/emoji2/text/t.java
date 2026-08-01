package androidx.emoji2.text;

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

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class t implements k {

    /* renamed from: f, reason: collision with root package name */
    public final Context f359f;
    public final h0.d g;
    public final g2.f h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f360i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public Handler f361j;

    /* renamed from: k, reason: collision with root package name */
    public ThreadPoolExecutor f362k;

    /* renamed from: l, reason: collision with root package name */
    public ThreadPoolExecutor f363l;

    /* renamed from: m, reason: collision with root package name */
    public k3.m f364m;

    public t(Context context, h0.d dVar) {
        k3.d.h(context, "Context cannot be null");
        this.f359f = context.getApplicationContext();
        this.g = dVar;
        this.h = u.f365d;
    }

    public final void a() {
        synchronized (this.f360i) {
            try {
                this.f364m = null;
                Handler handler = this.f361j;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f361j = null;
                ThreadPoolExecutor threadPoolExecutor = this.f363l;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f362k = null;
                this.f363l = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final h0.i b() {
        try {
            g2.f fVar = this.h;
            Context context = this.f359f;
            h0.d dVar = this.g;
            fVar.getClass();
            Object[] objArr = {dVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            f.f a4 = h0.c.a(context, Collections.unmodifiableList(arrayList));
            int i4 = a4.f1596f;
            if (i4 != 0) {
                throw new RuntimeException("fetchFonts failed (" + i4 + ")");
            }
            h0.i[] iVarArr = (h0.i[]) ((List) a4.g).get(0);
            if (iVarArr == null || iVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return iVarArr[0];
        } catch (PackageManager.NameNotFoundException e4) {
            throw new RuntimeException("provider not found", e4);
        }
    }

    @Override // androidx.emoji2.text.k
    public final void f(k3.m mVar) {
        synchronized (this.f360i) {
            this.f364m = mVar;
        }
        synchronized (this.f360i) {
            try {
                if (this.f364m == null) {
                    return;
                }
                if (this.f362k == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f363l = threadPoolExecutor;
                    this.f362k = threadPoolExecutor;
                }
                this.f362k.execute(new a2.r(3, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
