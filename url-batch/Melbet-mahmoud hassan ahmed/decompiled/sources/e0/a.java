package e0;

import android.os.Handler;
import android.os.Looper;
import d0.q;

/* loaded from: classes.dex */
public class a implements q {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f15759a = p.d.a(Looper.getMainLooper());

    @Override // d0.q
    public void a(long j7, Runnable runnable) {
        this.f15759a.postDelayed(runnable, j7);
    }

    @Override // d0.q
    public void b(Runnable runnable) {
        this.f15759a.removeCallbacks(runnable);
    }
}
