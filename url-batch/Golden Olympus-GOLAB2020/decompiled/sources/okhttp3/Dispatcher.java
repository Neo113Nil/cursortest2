package okhttp3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;

@Metadata
/* loaded from: classes3.dex */
public final class Dispatcher {

    /* renamed from: c, reason: collision with root package name */
    private Runnable f42362c;

    /* renamed from: d, reason: collision with root package name */
    private ExecutorService f42363d;

    /* renamed from: a, reason: collision with root package name */
    private int f42360a = 64;

    /* renamed from: b, reason: collision with root package name */
    private int f42361b = 5;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayDeque f42364e = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque f42365f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque f42366g = new ArrayDeque();

    private final void c(Deque deque, Object obj) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f42362c;
            Unit unit = Unit.f41027a;
        }
        if (f() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private final boolean f() {
        int i4;
        boolean z4;
        if (Util.f42596h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = this.f42364e.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    RealCall.AsyncCall asyncCall = (RealCall.AsyncCall) it.next();
                    if (this.f42365f.size() >= this.f42360a) {
                        break;
                    }
                    if (asyncCall.b().get() < this.f42361b) {
                        it.remove();
                        asyncCall.b().incrementAndGet();
                        Intrinsics.checkNotNullExpressionValue(asyncCall, "asyncCall");
                        arrayList.add(asyncCall);
                        this.f42365f.add(asyncCall);
                    }
                }
                z4 = g() > 0;
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (i4 = 0; i4 < size; i4++) {
            ((RealCall.AsyncCall) arrayList.get(i4)).a(b());
        }
        return z4;
    }

    public final synchronized void a(RealCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.f42366g.add(call);
    }

    public final synchronized ExecutorService b() {
        ExecutorService executorService;
        try {
            if (this.f42363d == null) {
                this.f42363d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Util.M(Util.f42597i + " Dispatcher", false));
            }
            executorService = this.f42363d;
            Intrinsics.checkNotNull(executorService);
        } catch (Throwable th) {
            throw th;
        }
        return executorService;
    }

    public final void d(RealCall.AsyncCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
        call.b().decrementAndGet();
        c(this.f42365f, call);
    }

    public final void e(RealCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
        c(this.f42366g, call);
    }

    public final synchronized int g() {
        return this.f42365f.size() + this.f42366g.size();
    }
}
