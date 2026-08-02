package sqip.internal.event;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.concurrent.ExecutorService;

/* loaded from: classes10.dex */
public final class EventModule_EventsUploadExecutorFactory implements Factory {

    public static final class InstanceHolder {
        static final EventModule_EventsUploadExecutorFactory INSTANCE = new EventModule_EventsUploadExecutorFactory();

        private InstanceHolder() {
        }
    }

    public static EventModule_EventsUploadExecutorFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ExecutorService eventsUploadExecutor() {
        ExecutorService eventsUploadExecutor = EventModule.INSTANCE.eventsUploadExecutor();
        Preconditions.checkNotNullFromProvides(eventsUploadExecutor);
        return eventsUploadExecutor;
    }

    @Override // javax.inject.Provider
    public ExecutorService get() {
        return eventsUploadExecutor();
    }
}
