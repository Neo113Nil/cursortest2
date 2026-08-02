package io.opentelemetry.context;

import io.opentelemetry.context.internal.shaded.WeakConcurrentMap;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/* loaded from: classes9.dex */
public final class StrictContextStorage implements ContextStorage, AutoCloseable {
    public static final Logger logger = Logger.getLogger(StrictContextStorage.class.getName());
    public final PendingScopes pendingScopes;

    final class CallerStackTrace extends Throwable {
    }

    public final class PendingScopes extends WeakConcurrentMap {
        public final ConcurrentHashMap map;

        public PendingScopes(ConcurrentHashMap concurrentHashMap) {
            super(concurrentHashMap);
            this.map = concurrentHashMap;
            Thread thread = new Thread(this);
            thread.setName("weak-ref-cleaner-strictcontextstorage");
            thread.setPriority(1);
            thread.setDaemon(true);
            thread.start();
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (!Thread.interrupted()) {
                try {
                    Reference remove = remove();
                    CallerStackTrace callerStackTrace = remove != null ? (CallerStackTrace) this.map.remove(remove) : null;
                    if (callerStackTrace != null) {
                        StrictContextStorage.logger.log(Level.SEVERE, "Scope garbage collected before being closed.", (Throwable) StrictContextStorage.callerError(callerStackTrace));
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    public StrictContextStorage() {
        ThreadLocalContextStorage threadLocalContextStorage = ThreadLocalContextStorage.INSTANCE;
        this.pendingScopes = new PendingScopes(new ConcurrentHashMap());
    }

    public static AssertionError callerError(CallerStackTrace callerStackTrace) {
        callerStackTrace.getClass();
        AssertionError assertionError = new AssertionError("Thread [null] opened a scope of null here:");
        assertionError.setStackTrace(callerStackTrace.getStackTrace());
        return assertionError;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        PendingScopes pendingScopes;
        while (true) {
            pendingScopes = this.pendingScopes;
            Reference poll = pendingScopes.poll();
            if (poll == null) {
                break;
            } else {
                pendingScopes.target.remove(poll);
            }
        }
        ConcurrentHashMap concurrentHashMap = pendingScopes.map;
        List list = (List) concurrentHashMap.values().stream().filter(new StrictContextStorage$PendingScopes$$ExternalSyntheticLambda0()).collect(Collectors.toList());
        concurrentHashMap.clear();
        if (list.isEmpty()) {
            return;
        }
        if (list.size() > 1) {
            Level level = Level.SEVERE;
            Logger logger2 = logger;
            logger2.log(level, "Multiple scopes leaked - first will be thrown as an error.");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                logger2.log(Level.SEVERE, "Scope leaked", (Throwable) callerError((CallerStackTrace) it.next()));
            }
        }
        throw callerError((CallerStackTrace) list.get(0));
    }

    @Override // io.opentelemetry.context.ContextStorage
    public final Context current() {
        return ThreadLocalContextStorage.INSTANCE.current();
    }
}
