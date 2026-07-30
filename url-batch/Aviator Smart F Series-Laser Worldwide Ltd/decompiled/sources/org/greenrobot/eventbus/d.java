package org.greenrobot.eventbus;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.greenrobot.eventbus.f;

/* loaded from: classes5.dex */
public class d {
    private static final ExecutorService DEFAULT_EXECUTOR_SERVICE = Executors.newCachedThreadPool();
    boolean ignoreGeneratedIndex;
    f logger;
    g mainThreadSupport;
    List<Class<?>> skipMethodVerificationForClasses;
    boolean strictMethodVerification;
    List<n7.b> subscriberInfoIndexes;
    boolean throwSubscriberException;
    boolean logSubscriberExceptions = true;
    boolean logNoSubscriberMessages = true;
    boolean sendSubscriberExceptionEvent = true;
    boolean sendNoSubscriberEvent = true;
    boolean eventInheritance = true;
    ExecutorService executorService = DEFAULT_EXECUTOR_SERVICE;

    d() {
    }

    public d addIndex(n7.b bVar) {
        if (this.subscriberInfoIndexes == null) {
            this.subscriberInfoIndexes = new ArrayList();
        }
        this.subscriberInfoIndexes.add(bVar);
        return this;
    }

    public c build() {
        return new c(this);
    }

    public d eventInheritance(boolean z7) {
        this.eventInheritance = z7;
        return this;
    }

    public d executorService(ExecutorService executorService) {
        this.executorService = executorService;
        return this;
    }

    f getLogger() {
        f fVar = this.logger;
        return fVar != null ? fVar : f.a.get();
    }

    g getMainThreadSupport() {
        g gVar = this.mainThreadSupport;
        if (gVar != null) {
            return gVar;
        }
        if (m7.a.areAvailable()) {
            return m7.a.get().defaultMainThreadSupport;
        }
        return null;
    }

    public d ignoreGeneratedIndex(boolean z7) {
        this.ignoreGeneratedIndex = z7;
        return this;
    }

    public c installDefaultEventBus() {
        c cVar;
        synchronized (c.class) {
            try {
                if (c.defaultInstance != null) {
                    throw new EventBusException("Default instance already exists. It may be only set once before it's used the first time to ensure consistent behavior.");
                }
                c.defaultInstance = build();
                cVar = c.defaultInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public d logNoSubscriberMessages(boolean z7) {
        this.logNoSubscriberMessages = z7;
        return this;
    }

    public d logSubscriberExceptions(boolean z7) {
        this.logSubscriberExceptions = z7;
        return this;
    }

    public d logger(f fVar) {
        this.logger = fVar;
        return this;
    }

    public d sendNoSubscriberEvent(boolean z7) {
        this.sendNoSubscriberEvent = z7;
        return this;
    }

    public d sendSubscriberExceptionEvent(boolean z7) {
        this.sendSubscriberExceptionEvent = z7;
        return this;
    }

    public d skipMethodVerificationFor(Class<?> cls) {
        if (this.skipMethodVerificationForClasses == null) {
            this.skipMethodVerificationForClasses = new ArrayList();
        }
        this.skipMethodVerificationForClasses.add(cls);
        return this;
    }

    public d strictMethodVerification(boolean z7) {
        this.strictMethodVerification = z7;
        return this;
    }

    public d throwSubscriberException(boolean z7) {
        this.throwSubscriberException = z7;
        return this;
    }
}
