package dev.hyo.openiap.utils;

import dev.hyo.openiap.ActiveSubscription;
import dev.hyo.openiap.PurchaseAndroid;
import dev.hyo.openiap.PurchaseState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BillingConverters.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007¨\u0006\b"}, d2 = {"fromBillingState", "Ldev/hyo/openiap/PurchaseState;", "Ldev/hyo/openiap/PurchaseState$Companion;", "state", "", "toActiveSubscription", "Ldev/hyo/openiap/ActiveSubscription;", "Ldev/hyo/openiap/PurchaseAndroid;", "openiap_playRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BillingConvertersKt {
    public static final PurchaseState fromBillingState(PurchaseState.Companion companion, int i) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        if (i == 0) {
            return PurchaseState.Unknown;
        }
        if (i == 1) {
            return PurchaseState.Purchased;
        }
        if (i == 2) {
            return PurchaseState.Pending;
        }
        return PurchaseState.Unknown;
    }

    public static final ActiveSubscription toActiveSubscription(PurchaseAndroid purchaseAndroid) {
        Intrinsics.checkNotNullParameter(purchaseAndroid, "<this>");
        return new ActiveSubscription(purchaseAndroid.getAutoRenewingAndroid(), purchaseAndroid.getCurrentPlanId(), purchaseAndroid.getCurrentPlanId(), null, null, null, true, purchaseAndroid.getProductId(), purchaseAndroid.getPurchaseToken(), purchaseAndroid.getPurchaseToken(), null, purchaseAndroid.getTransactionDate(), purchaseAndroid.getId(), null, 9272, null);
    }
}
