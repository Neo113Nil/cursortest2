package com.appsflyer.internal.models;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1d;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.InterfaceC1490j3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata
/* loaded from: classes.dex */
public final class AutoRenewingPlan {
    public static final Companion Companion = new Companion(null);
    private final Boolean autoRenewEnabled;
    private final SubscriptionItemPriceChangeDetails priceChangeDetails;

    @Metadata
    public static final class Companion implements Deserialize<AutoRenewingPlan> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int getOneTimePurchaseOfferDetails = 0;
        private static int getPackageName = 1;
        private static char[] InAppPurchaseEvent = {8976, 31969, 40143, 15537, 23735, 64621, 7233, 48215, 56366, 31801, 40429, 15815, 23983, 64956, 7570, 48510, 8961, 31974, 40146, 15549, 23680, 64587, 7239, 48211, 56375, 31771, 40422, 15842, 23976, 64932, 7574, 48499, 56653, 32055};
        private static long toJsonMap = -6458867719560463212L;

        private Companion() {
        }

        private static void a(int i4, char c4, int i5, Object[] objArr) {
            AFPurchaseConnectorA1d aFPurchaseConnectorA1d = new AFPurchaseConnectorA1d();
            long[] jArr = new long[i4];
            aFPurchaseConnectorA1d.getQuantity = 0;
            $11 = ($10 + 19) % UserVerificationMethods.USER_VERIFY_PATTERN;
            while (true) {
                int i6 = aFPurchaseConnectorA1d.getQuantity;
                if (i6 >= i4) {
                    break;
                }
                $11 = ($10 + InterfaceC1490j3.d.b.f16817i) % UserVerificationMethods.USER_VERIFY_PATTERN;
                jArr[i6] = (((char) (InAppPurchaseEvent[i5 + i6] ^ 5120776544585851761L)) ^ (i6 * (5120776544585851761L ^ toJsonMap))) ^ c4;
                aFPurchaseConnectorA1d.getQuantity = i6 + 1;
            }
            char[] cArr = new char[i4];
            aFPurchaseConnectorA1d.getQuantity = 0;
            while (true) {
                int i7 = aFPurchaseConnectorA1d.getQuantity;
                if (i7 >= i4) {
                    objArr[0] = new String(cArr);
                    return;
                } else {
                    cArr[i7] = (char) jArr[i7];
                    aFPurchaseConnectorA1d.getQuantity = i7 + 1;
                }
            }
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ AutoRenewingPlan fromJson(JSONObject jSONObject) {
            getPackageName = (getOneTimePurchaseOfferDetails + 89) % UserVerificationMethods.USER_VERIFY_PATTERN;
            AutoRenewingPlan fromJson = fromJson(jSONObject);
            getOneTimePurchaseOfferDetails = (getPackageName + 99) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return fromJson;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        public final AutoRenewingPlan fromJson(JSONObject jSONObject) {
            Object nullable;
            Object object;
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a(17 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, objArr);
            nullable = SubscriptionPurchaseKt.getNullable(jSONObject, ((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            a(TextUtils.indexOf((CharSequence) "", '0', 0) + 19, (char) TextUtils.getCapsMode("", 0, 0), 17 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
            object = SubscriptionPurchaseKt.toObject(jSONObject, ((String) objArr2[0]).intern(), SubscriptionItemPriceChangeDetails.Companion);
            AutoRenewingPlan autoRenewingPlan = new AutoRenewingPlan((Boolean) nullable, (SubscriptionItemPriceChangeDetails) object);
            int i4 = getOneTimePurchaseOfferDetails + 57;
            getPackageName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 == 0) {
                int i5 = 33 / 0;
            }
            return autoRenewingPlan;
        }
    }

    public AutoRenewingPlan(Boolean bool, SubscriptionItemPriceChangeDetails subscriptionItemPriceChangeDetails) {
        this.autoRenewEnabled = bool;
        this.priceChangeDetails = subscriptionItemPriceChangeDetails;
    }

    public static /* synthetic */ AutoRenewingPlan copy$default(AutoRenewingPlan autoRenewingPlan, Boolean bool, SubscriptionItemPriceChangeDetails subscriptionItemPriceChangeDetails, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            bool = autoRenewingPlan.autoRenewEnabled;
        }
        if ((i4 & 2) != 0) {
            subscriptionItemPriceChangeDetails = autoRenewingPlan.priceChangeDetails;
        }
        return autoRenewingPlan.copy(bool, subscriptionItemPriceChangeDetails);
    }

    public final Boolean component1() {
        return this.autoRenewEnabled;
    }

    public final SubscriptionItemPriceChangeDetails component2() {
        return this.priceChangeDetails;
    }

    public final AutoRenewingPlan copy(Boolean bool, SubscriptionItemPriceChangeDetails subscriptionItemPriceChangeDetails) {
        return new AutoRenewingPlan(bool, subscriptionItemPriceChangeDetails);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoRenewingPlan)) {
            return false;
        }
        AutoRenewingPlan autoRenewingPlan = (AutoRenewingPlan) obj;
        return Intrinsics.areEqual(this.autoRenewEnabled, autoRenewingPlan.autoRenewEnabled) && Intrinsics.areEqual(this.priceChangeDetails, autoRenewingPlan.priceChangeDetails);
    }

    public final Boolean getAutoRenewEnabled() {
        return this.autoRenewEnabled;
    }

    public final SubscriptionItemPriceChangeDetails getPriceChangeDetails() {
        return this.priceChangeDetails;
    }

    public final int hashCode() {
        Boolean bool = this.autoRenewEnabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        SubscriptionItemPriceChangeDetails subscriptionItemPriceChangeDetails = this.priceChangeDetails;
        return hashCode + (subscriptionItemPriceChangeDetails != null ? subscriptionItemPriceChangeDetails.hashCode() : 0);
    }

    public final String toString() {
        return "AutoRenewingPlan(autoRenewEnabled=" + this.autoRenewEnabled + ", priceChangeDetails=" + this.priceChangeDetails + ")";
    }
}
