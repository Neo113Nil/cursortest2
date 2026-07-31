package okhttp3.internal.connection;

import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Address;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.platform.Platform;

@Metadata
/* loaded from: classes3.dex */
public final class RealConnectionPool {

    /* renamed from: f, reason: collision with root package name */
    public static final Companion f42809f = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f42810a;

    /* renamed from: b, reason: collision with root package name */
    private final long f42811b;

    /* renamed from: c, reason: collision with root package name */
    private final TaskQueue f42812c;

    /* renamed from: d, reason: collision with root package name */
    private final RealConnectionPool$cleanupTask$1 f42813d;

    /* renamed from: e, reason: collision with root package name */
    private final ConcurrentLinkedQueue f42814e;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [okhttp3.internal.connection.RealConnectionPool$cleanupTask$1] */
    public RealConnectionPool(TaskRunner taskRunner, int i4, long j4, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f42810a = i4;
        this.f42811b = timeUnit.toNanos(j4);
        this.f42812c = taskRunner.i();
        final String str = Util.f42597i + " ConnectionPool";
        this.f42813d = new Task(str) { // from class: okhttp3.internal.connection.RealConnectionPool$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public long f() {
                return RealConnectionPool.this.b(System.nanoTime());
            }
        };
        this.f42814e = new ConcurrentLinkedQueue();
        if (j4 > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j4).toString());
    }

    private final int d(RealConnection realConnection, long j4) {
        if (Util.f42596h && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
        }
        List n4 = realConnection.n();
        int i4 = 0;
        while (i4 < n4.size()) {
            Reference reference = (Reference) n4.get(i4);
            if (reference.get() != null) {
                i4++;
            } else {
                Intrinsics.checkNotNull(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                Platform.f43120a.g().m("A connection to " + realConnection.A().a().l() + " was leaked. Did you forget to close a response body?", ((RealCall.CallReference) reference).a());
                n4.remove(i4);
                realConnection.D(true);
                if (n4.isEmpty()) {
                    realConnection.C(j4 - this.f42811b);
                    return 0;
                }
            }
        }
        return n4.size();
    }

    public final boolean a(Address address, RealCall call, List list, boolean z4) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator it = this.f42814e.iterator();
        while (it.hasNext()) {
            RealConnection connection = (RealConnection) it.next();
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (z4) {
                    try {
                        if (connection.v()) {
                        }
                        Unit unit = Unit.f41027a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (connection.t(address, list)) {
                    call.c(connection);
                    return true;
                }
                Unit unit2 = Unit.f41027a;
            }
        }
        return false;
    }

    public final long b(long j4) {
        Iterator it = this.f42814e.iterator();
        int i4 = 0;
        long j5 = Long.MIN_VALUE;
        RealConnection realConnection = null;
        int i5 = 0;
        while (it.hasNext()) {
            RealConnection connection = (RealConnection) it.next();
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (d(connection, j4) > 0) {
                    i5++;
                } else {
                    i4++;
                    long o4 = j4 - connection.o();
                    if (o4 > j5) {
                        realConnection = connection;
                        j5 = o4;
                    }
                    Unit unit = Unit.f41027a;
                }
            }
        }
        long j6 = this.f42811b;
        if (j5 < j6 && i4 <= this.f42810a) {
            if (i4 > 0) {
                return j6 - j5;
            }
            if (i5 > 0) {
                return j6;
            }
            return -1L;
        }
        Intrinsics.checkNotNull(realConnection);
        synchronized (realConnection) {
            if (!realConnection.n().isEmpty()) {
                return 0L;
            }
            if (realConnection.o() + j5 != j4) {
                return 0L;
            }
            realConnection.D(true);
            this.f42814e.remove(realConnection);
            Util.m(realConnection.E());
            if (this.f42814e.isEmpty()) {
                this.f42812c.a();
            }
            return 0L;
        }
    }

    public final boolean c(RealConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (Util.f42596h && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        if (!connection.p() && this.f42810a != 0) {
            TaskQueue.j(this.f42812c, this.f42813d, 0L, 2, null);
            return false;
        }
        connection.D(true);
        this.f42814e.remove(connection);
        if (this.f42814e.isEmpty()) {
            this.f42812c.a();
        }
        return true;
    }

    public final void e(RealConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (!Util.f42596h || Thread.holdsLock(connection)) {
            this.f42814e.add(connection);
            TaskQueue.j(this.f42812c, this.f42813d, 0L, 2, null);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }
}
