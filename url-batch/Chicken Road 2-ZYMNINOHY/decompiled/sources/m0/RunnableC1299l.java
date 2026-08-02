package m0;

import W.J;
import android.os.Handler;
import java.io.Closeable;
import v2.f0;

/* renamed from: m0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1299l implements Runnable, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f14400a = J.o(null);

    /* renamed from: b, reason: collision with root package name */
    public final long f14401b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14402c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1300m f14403d;

    public RunnableC1299l(C1300m c1300m, long j4) {
        this.f14403d = c1300m;
        this.f14401b = j4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f14402c = false;
        this.f14400a.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1300m c1300m = this.f14403d;
        L3.h hVar = c1300m.f14410g;
        hVar.g(hVar.c(4, c1300m.f14414k, f0.f15629g, c1300m.f14411h));
        this.f14400a.postDelayed(this, this.f14401b);
    }
}
