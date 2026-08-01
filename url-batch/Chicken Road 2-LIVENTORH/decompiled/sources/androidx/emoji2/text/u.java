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

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class u implements k {

    /* renamed from: f, reason: collision with root package name */
    public final Context f357f;

    /* renamed from: g, reason: collision with root package name */
    public final k0.d f358g;

    /* renamed from: h, reason: collision with root package name */
    public final l2.f f359h;
    public final Object i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public Handler f360j;

    /* renamed from: k, reason: collision with root package name */
    public ThreadPoolExecutor f361k;

    /* renamed from: l, reason: collision with root package name */
    public ThreadPoolExecutor f362l;

    /* renamed from: m, reason: collision with root package name */
    public a.y f363m;

    public u(Context context, k0.d dVar) {
        h.a.m(context, "Context cannot be null");
        this.f357f = context.getApplicationContext();
        this.f358g = dVar;
        this.f359h = v.d;
    }

    public final void a() {
        synchronized (this.i) {
            try {
                this.f363m = null;
                Handler handler = this.f360j;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f360j = null;
                ThreadPoolExecutor threadPoolExecutor = this.f362l;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f361k = null;
                this.f362l = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final k0.i b() {
        try {
            l2.f fVar = this.f359h;
            Context context = this.f357f;
            k0.d dVar = this.f358g;
            fVar.getClass();
            Object[] objArr = {dVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            g.f a2 = k0.c.a(context, Collections.unmodifiableList(arrayList));
            int i = a2.f1631f;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            k0.i[] iVarArr = (k0.i[]) ((List) a2.f1632g).get(0);
            if (iVarArr == null || iVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return iVarArr[0];
        } catch (PackageManager.NameNotFoundException e4) {
            throw new RuntimeException("provider not found", e4);
        }
    }

    @Override // androidx.emoji2.text.k
    public final void w(a.y yVar) {
        synchronized (this.i) {
            this.f363m = yVar;
        }
        synchronized (this.i) {
            try {
                if (this.f363m == null) {
                    return;
                }
                if (this.f361k == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f362l = threadPoolExecutor;
                    this.f361k = threadPoolExecutor;
                }
                this.f361k.execute(new a.j(2, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
