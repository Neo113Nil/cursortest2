package n0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import m0.g;

/* loaded from: classes.dex */
public class b implements n0.a {

    /* renamed from: a, reason: collision with root package name */
    private final g f19372a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f19373b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private final Executor f19374c = new a();

    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            b.this.d(runnable);
        }
    }

    public b(Executor executor) {
        this.f19372a = new g(executor);
    }

    @Override // n0.a
    public Executor a() {
        return this.f19374c;
    }

    @Override // n0.a
    public void b(Runnable runnable) {
        this.f19372a.execute(runnable);
    }

    @Override // n0.a
    public g c() {
        return this.f19372a;
    }

    public void d(Runnable runnable) {
        this.f19373b.post(runnable);
    }
}
