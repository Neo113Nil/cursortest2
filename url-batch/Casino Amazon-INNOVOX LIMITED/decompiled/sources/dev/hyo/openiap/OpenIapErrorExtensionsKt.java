package dev.hyo.openiap;

import dev.hyo.openiap.OpenIapError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OpenIapErrorExtensions.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"fromBillingResponseCode", "Ldev/hyo/openiap/OpenIapError;", "Ldev/hyo/openiap/OpenIapError$Companion;", "responseCode", "", "debugMessage", "", "openiap_playRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OpenIapErrorExtensionsKt {
    public static /* synthetic */ OpenIapError fromBillingResponseCode$default(OpenIapError.Companion companion, int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        return fromBillingResponseCode(companion, i, str);
    }

    public static final OpenIapError fromBillingResponseCode(OpenIapError.Companion companion, int i, String str) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        switch (i) {
            case -3:
                return OpenIapError.ServiceTimeout.INSTANCE;
            case -2:
                return OpenIapError.FeatureNotSupported.INSTANCE;
            case -1:
                return OpenIapError.ServiceDisconnected.INSTANCE;
            case 0:
            default:
                return OpenIapError.UnknownError.INSTANCE;
            case 1:
                return OpenIapError.UserCancelled.INSTANCE;
            case 2:
                return OpenIapError.ServiceUnavailable.INSTANCE;
            case 3:
                return OpenIapError.BillingUnavailable.INSTANCE;
            case 4:
                return OpenIapError.ItemUnavailable.INSTANCE;
            case 5:
                return OpenIapError.DeveloperError.INSTANCE;
            case 6:
                return OpenIapError.BillingError.INSTANCE;
            case 7:
                return OpenIapError.ItemAlreadyOwned.INSTANCE;
            case 8:
                return OpenIapError.ItemNotOwned.INSTANCE;
        }
    }
}
