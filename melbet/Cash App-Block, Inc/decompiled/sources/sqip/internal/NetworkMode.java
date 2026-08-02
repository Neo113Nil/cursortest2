package sqip.internal;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.internal.Tags;
import sqip.InAppPaymentsSdk;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lsqip/internal/NetworkMode;", "", "()V", "SANDBOX_PREFIX", "", "STAGING_PREFIX", "value", "Lsqip/internal/NetworkMode$Endpoint;", "endpoint", "getEndpoint", "()Lsqip/internal/NetworkMode$Endpoint;", "setEndpoint", "(Lsqip/internal/NetworkMode$Endpoint;)V", "Endpoint", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NetworkMode {
    public static final NetworkMode INSTANCE = new NetworkMode();
    private static final String SANDBOX_PREFIX = "sandbox-sq0idb";
    private static final String STAGING_PREFIX = "sq0ids";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lsqip/internal/NetworkMode$Endpoint;", "", "(Ljava/lang/String;I)V", "FAKE", "PRODUCTION", "SANDBOX", "STAGING", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Endpoint {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Endpoint[] $VALUES;
        public static final Endpoint FAKE = new Endpoint("FAKE", 0);
        public static final Endpoint PRODUCTION = new Endpoint("PRODUCTION", 1);
        public static final Endpoint SANDBOX = new Endpoint("SANDBOX", 2);
        public static final Endpoint STAGING = new Endpoint("STAGING", 3);

        private static final /* synthetic */ Endpoint[] $values() {
            return new Endpoint[]{FAKE, PRODUCTION, SANDBOX, STAGING};
        }

        static {
            Endpoint[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
        }

        private Endpoint(String str, int i) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Endpoint valueOf(String str) {
            return (Endpoint) Enum.valueOf(Endpoint.class, str);
        }

        public static Endpoint[] values() {
            return (Endpoint[]) $VALUES.clone();
        }
    }

    private NetworkMode() {
    }

    public final Endpoint getEndpoint() {
        return StringsKt__StringsJVMKt.startsWith(InAppPaymentsSdk.getSquareApplicationId(), SANDBOX_PREFIX, false) ? Endpoint.SANDBOX : StringsKt__StringsJVMKt.startsWith(InAppPaymentsSdk.getSquareApplicationId(), STAGING_PREFIX, false) ? Endpoint.STAGING : Endpoint.PRODUCTION;
    }

    public final void setEndpoint(Endpoint endpoint) {
        endpoint.getClass();
    }
}
