package kotlinx.coroutines.flow;

import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import kotlinx.coroutines.flow.internal.SubscriptionCountStateFlow;

/* loaded from: classes3.dex */
public final class StartedLazily implements SharingStarted {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ StartedLazily(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlinx.coroutines.flow.SharingStarted
    public final Flow command(SubscriptionCountStateFlow subscriptionCountStateFlow) {
        switch (this.$r8$classId) {
            case 0:
                return new StartedLazily$command$$inlined$unsafeFlow$1(subscriptionCountStateFlow, 0);
            default:
                return new AppLockMonitor$special$$inlined$map$2(SharingCommand.START, 19);
        }
    }

    public final String toString() {
        switch (this.$r8$classId) {
            case 0:
                return "SharingStarted.Lazily";
            default:
                return "SharingStarted.Eagerly";
        }
    }
}
