package p4;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public interface a<V> extends Future<V> {
    void d(Runnable runnable, Executor executor);
}
