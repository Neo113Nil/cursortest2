package sqip.internal;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes10.dex */
public final class UrlModule_EventsUrlFactory implements Factory {

    public static final class InstanceHolder {
        static final UrlModule_EventsUrlFactory INSTANCE = new UrlModule_EventsUrlFactory();

        private InstanceHolder() {
        }
    }

    public static UrlModule_EventsUrlFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String eventsUrl() {
        String eventsUrl = UrlModule.INSTANCE.eventsUrl();
        Preconditions.checkNotNullFromProvides(eventsUrl);
        return eventsUrl;
    }

    @Override // javax.inject.Provider
    public String get() {
        return eventsUrl();
    }
}
