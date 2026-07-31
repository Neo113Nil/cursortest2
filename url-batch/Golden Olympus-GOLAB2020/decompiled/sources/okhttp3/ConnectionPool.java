package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealConnectionPool;

@Metadata
/* loaded from: classes3.dex */
public final class ConnectionPool {

    /* renamed from: a, reason: collision with root package name */
    private final RealConnectionPool f42324a;

    public ConnectionPool(RealConnectionPool delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f42324a = delegate;
    }

    public final RealConnectionPool a() {
        return this.f42324a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionPool(int i4, long j4, TimeUnit timeUnit) {
        this(new RealConnectionPool(TaskRunner.f42718i, i4, j4, timeUnit));
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
    }

    public ConnectionPool() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
