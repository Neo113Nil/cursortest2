package com.appsflyer;

import com.appsflyer.internal.AFg1cSDK;
import com.appsflyer.internal.AFg1hSDK;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
/* loaded from: classes.dex */
public final class AFAdRevenueData {
    private final String currencyIso4217Code;
    private final MediationNetwork mediationNetwork;
    private final String monetizationNetwork;
    private final double revenue;

    public AFAdRevenueData(String str, MediationNetwork mediationNetwork, String str2, double d7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mediationNetwork, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.monetizationNetwork = str;
        this.mediationNetwork = mediationNetwork;
        this.currencyIso4217Code = str2;
        this.revenue = d7;
    }

    private final boolean AFAdRevenueData() {
        try {
            Currency.getInstance(this.currencyIso4217Code);
            return true;
        } catch (Throwable unused) {
            AFg1hSDK.w$default(AFLogger.INSTANCE, AFg1cSDK.AD_REVENUE, "Currency is not ISO 4217 currency code", false, 4, null);
            return false;
        }
    }

    public static /* synthetic */ AFAdRevenueData copy$default(AFAdRevenueData aFAdRevenueData, String str, MediationNetwork mediationNetwork, String str2, double d7, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = aFAdRevenueData.monetizationNetwork;
        }
        if ((i2 & 2) != 0) {
            mediationNetwork = aFAdRevenueData.mediationNetwork;
        }
        if ((i2 & 4) != 0) {
            str2 = aFAdRevenueData.currencyIso4217Code;
        }
        if ((i2 & 8) != 0) {
            d7 = aFAdRevenueData.revenue;
        }
        String str3 = str2;
        return aFAdRevenueData.copy(str, mediationNetwork, str3, d7);
    }

    public final boolean areAllFieldsValid() {
        return !StringsKt.z(this.monetizationNetwork) && AFAdRevenueData();
    }

    public final String component1() {
        return this.monetizationNetwork;
    }

    public final MediationNetwork component2() {
        return this.mediationNetwork;
    }

    public final String component3() {
        return this.currencyIso4217Code;
    }

    public final double component4() {
        return this.revenue;
    }

    public final AFAdRevenueData copy(String str, MediationNetwork mediationNetwork, String str2, double d7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mediationNetwork, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new AFAdRevenueData(str, mediationNetwork, str2, d7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFAdRevenueData)) {
            return false;
        }
        AFAdRevenueData aFAdRevenueData = (AFAdRevenueData) obj;
        return Intrinsics.a(this.monetizationNetwork, aFAdRevenueData.monetizationNetwork) && this.mediationNetwork == aFAdRevenueData.mediationNetwork && Intrinsics.a(this.currencyIso4217Code, aFAdRevenueData.currencyIso4217Code) && Double.compare(this.revenue, aFAdRevenueData.revenue) == 0;
    }

    public final String getCurrencyIso4217Code() {
        return this.currencyIso4217Code;
    }

    public final MediationNetwork getMediationNetwork() {
        return this.mediationNetwork;
    }

    public final String getMonetizationNetwork() {
        return this.monetizationNetwork;
    }

    public final double getRevenue() {
        return this.revenue;
    }

    public final int hashCode() {
        return Double.hashCode(this.revenue) + ((this.currencyIso4217Code.hashCode() + ((this.mediationNetwork.hashCode() + (this.monetizationNetwork.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AFAdRevenueData(monetizationNetwork=" + this.monetizationNetwork + ", mediationNetwork=" + this.mediationNetwork + ", currencyIso4217Code=" + this.currencyIso4217Code + ", revenue=" + this.revenue + ")";
    }
}
