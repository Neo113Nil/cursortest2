package okhttp3.internal.connection;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.cache.DiskLruCache$cleanupTask$1;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.platform.Android10Platform;
import okhttp3.internal.platform.Platform;
import papa.internal.AppUpdateDetector$$ExternalSyntheticLambda0;

/* loaded from: classes3.dex */
public final class RealConnectionPool {
    public final Object cleanupQueue;
    public final Object cleanupTask;
    public final Object connections;
    public final long keepAliveDurationNs;

    public RealConnectionPool(TaskRunner taskRunner) {
        taskRunner.getClass();
        TimeUnit.MINUTES.getClass();
        this.keepAliveDurationNs = 300000000000L;
        this.cleanupQueue = taskRunner.newQueue();
        this.cleanupTask = new DiskLruCache$cleanupTask$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), _UtilJvmKt.okHttpName, " ConnectionPool connection closer"), 1, this);
        this.connections = new ConcurrentLinkedQueue();
    }

    public int pruneAndGetAllocationCount(RealConnection realConnection, long j) {
        TimeZone timeZone = _UtilJvmKt.UTC;
        ArrayList arrayList = realConnection.calls;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + realConnection.route.address.url + " was leaked. Did you forget to close a response body?";
                Android10Platform android10Platform = Platform.platform;
                Platform.platform.logCloseableLeak(((RealCall.CallReference) reference).callStackTrace, str);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    realConnection.idleAtNs = j - this.keepAliveDurationNs;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public RealConnectionPool(Function0 function0, long j, Function0 function02) {
        function0.getClass();
        this.cleanupQueue = function0;
        this.keepAliveDurationNs = j;
        this.cleanupTask = function02;
        this.connections = LazyKt.lazy(new AppUpdateDetector$$ExternalSyntheticLambda0(this, 6));
    }
}
