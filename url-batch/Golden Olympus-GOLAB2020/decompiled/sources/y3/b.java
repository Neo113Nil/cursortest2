package y3;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import t3.c;
import y3.b;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final a f46793b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Executor f46794a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Executor c(final String str) {
            final AtomicInteger atomicInteger = new AtomicInteger(0);
            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(new ThreadFactory() { // from class: y3.a
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread d4;
                    d4 = b.a.d(atomicInteger, str, runnable);
                    return d4;
                }
            });
            Intrinsics.checkNotNullExpressionValue(newCachedThreadPool, "newCachedThreadPool {\n  …Name-$tid\")\n            }");
            return newCachedThreadPool;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Thread d(AtomicInteger atomicTid, String libraryPackageName, Runnable runnable) {
            Intrinsics.checkNotNullParameter(atomicTid, "$atomicTid");
            Intrinsics.checkNotNullParameter(libraryPackageName, "$libraryPackageName");
            return new Thread(runnable, "tracer-io-" + libraryPackageName + '-' + atomicTid.getAndIncrement());
        }

        public final b e(c tracer) {
            Intrinsics.checkNotNullParameter(tracer, "tracer");
            return tracer.e();
        }

        private a() {
        }
    }

    public b(Executor executor, String libraryPackageName) {
        Intrinsics.checkNotNullParameter(libraryPackageName, "libraryPackageName");
        this.f46794a = executor == null ? f46793b.c(libraryPackageName) : executor;
    }

    public final Executor a() {
        return this.f46794a;
    }
}
