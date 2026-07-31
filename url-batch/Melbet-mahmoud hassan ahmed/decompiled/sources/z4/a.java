package z4;

import c5.d;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    private static a f23710e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f23711f;

    /* renamed from: a, reason: collision with root package name */
    private d f23712a;

    /* renamed from: b, reason: collision with root package name */
    private b5.a f23713b;

    /* renamed from: c, reason: collision with root package name */
    private FlutterJNI.c f23714c;

    /* renamed from: d, reason: collision with root package name */
    private ExecutorService f23715d;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private d f23716a;

        /* renamed from: b, reason: collision with root package name */
        private b5.a f23717b;

        /* renamed from: c, reason: collision with root package name */
        private FlutterJNI.c f23718c;

        /* renamed from: d, reason: collision with root package name */
        private ExecutorService f23719d;

        /* renamed from: z4.a$b$a, reason: collision with other inner class name */
        private class ThreadFactoryC0160a implements ThreadFactory {

            /* renamed from: a, reason: collision with root package name */
            private int f23720a;

            private ThreadFactoryC0160a() {
                this.f23720a = 0;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                StringBuilder sb = new StringBuilder();
                sb.append("flutter-worker-");
                int i7 = this.f23720a;
                this.f23720a = i7 + 1;
                sb.append(i7);
                thread.setName(sb.toString());
                return thread;
            }
        }

        private void b() {
            if (this.f23718c == null) {
                this.f23718c = new FlutterJNI.c();
            }
            if (this.f23719d == null) {
                this.f23719d = Executors.newCachedThreadPool(new ThreadFactoryC0160a());
            }
            if (this.f23716a == null) {
                this.f23716a = new d(this.f23718c.a(), this.f23719d);
            }
        }

        public a a() {
            b();
            return new a(this.f23716a, this.f23717b, this.f23718c, this.f23719d);
        }
    }

    private a(d dVar, b5.a aVar, FlutterJNI.c cVar, ExecutorService executorService) {
        this.f23712a = dVar;
        this.f23713b = aVar;
        this.f23714c = cVar;
        this.f23715d = executorService;
    }

    public static a e() {
        f23711f = true;
        if (f23710e == null) {
            f23710e = new b().a();
        }
        return f23710e;
    }

    public b5.a a() {
        return this.f23713b;
    }

    public ExecutorService b() {
        return this.f23715d;
    }

    public d c() {
        return this.f23712a;
    }

    public FlutterJNI.c d() {
        return this.f23714c;
    }
}
