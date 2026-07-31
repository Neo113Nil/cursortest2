package z0;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final k f46844d = new k();

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f46846b = A0.a.a();

    /* renamed from: a, reason: collision with root package name */
    public final Executor f46845a = new a();

    /* renamed from: c, reason: collision with root package name */
    public final Executor f46847c = A0.a.b();

    public static final class a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return f46844d.f46847c;
    }
}
