package kotlinx.coroutines;

import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public abstract class ExecutorCoroutineDispatcher extends CoroutineDispatcher implements Closeable {
    public static final Key Key = new Key(null);

    public static final class Key extends kotlin.coroutines.b {
        public /* synthetic */ Key(kotlin.jvm.internal.o oVar) {
            this();
        }

        private Key() {
            super(CoroutineDispatcher.Key, new f6.l() { // from class: kotlinx.coroutines.ExecutorCoroutineDispatcher.Key.1
                @Override // f6.l
                public final ExecutorCoroutineDispatcher invoke(CoroutineContext.a aVar) {
                    if (aVar instanceof ExecutorCoroutineDispatcher) {
                        return (ExecutorCoroutineDispatcher) aVar;
                    }
                    return null;
                }
            });
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public abstract Executor getExecutor();
}
