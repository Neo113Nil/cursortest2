package kotlinx.coroutines.flow;

import kotlinx.coroutines.flow.internal.SubscriptionCountStateFlow;

/* loaded from: classes3.dex */
public interface SharingStarted {

    public final class Companion {
        public static final StartedLazily Eagerly = new StartedLazily(1);
        public static final StartedLazily Lazily = new StartedLazily(0);

        public static StartedWhileSubscribed WhileSubscribed$default() {
            return new StartedWhileSubscribed(0L, Long.MAX_VALUE);
        }
    }

    Flow command(SubscriptionCountStateFlow subscriptionCountStateFlow);
}
