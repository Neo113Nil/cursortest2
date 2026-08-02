package sqip.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import sqip.internal.HttpModule;
import sqip.internal.NetworkMode;
import sqip.internal.event.EventModule;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0006"}, d2 = {"Lsqip/internal/UrlModule;", "", "()V", "eventsUrl", "", "paymentUrl", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class UrlModule {
    public static final UrlModule INSTANCE = new UrlModule();

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NetworkMode.Endpoint.values().length];
            try {
                iArr[NetworkMode.Endpoint.PRODUCTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkMode.Endpoint.SANDBOX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NetworkMode.Endpoint.STAGING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NetworkMode.Endpoint.FAKE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private UrlModule() {
    }

    @EventModule.EventsUrl
    public final String eventsUrl() {
        int i = WhenMappings.$EnumSwitchMapping$0[NetworkMode.INSTANCE.getEndpoint().ordinal()];
        if (i == 1) {
            return "https://api.squareup.com";
        }
        if (i == 2) {
            return "https://api.squareupsandbox.com";
        }
        if (i == 3) {
            return "https:/api.squareupstaging.com/";
        }
        if (i != 4) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Don't use Fake endpoint in Release build!");
        return null;
    }

    @HttpModule.PaymentUrl
    public final String paymentUrl() {
        int i = WhenMappings.$EnumSwitchMapping$0[NetworkMode.INSTANCE.getEndpoint().ordinal()];
        if (i == 1) {
            return "https://pci-connect.squareup.com/";
        }
        if (i == 2) {
            return "https://pci-connect.squareupsandbox.com/";
        }
        if (i == 3) {
            return "https://pci-connect.squareupstaging.com/";
        }
        if (i != 4) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Don't use Fake endpoint in Release build!");
        return null;
    }
}
