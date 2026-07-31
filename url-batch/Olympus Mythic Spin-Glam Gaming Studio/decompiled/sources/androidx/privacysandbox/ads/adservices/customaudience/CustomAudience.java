package androidx.privacysandbox.ads.adservices.customaudience;

import android.net.Uri;
import androidx.privacysandbox.ads.adservices.common.AdSelectionSignals;
import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.time.Instant;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomAudience.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u00012J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010&\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0019\u0010)\u001a\u0004\u0018\u00010(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010.\u001a\u0004\u0018\u00010-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudience;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "buyer", "Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "getBuyer", "()Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "name", "Ljava/lang/String;", "getName", "Landroid/net/Uri;", "dailyUpdateUri", "Landroid/net/Uri;", "getDailyUpdateUri", "()Landroid/net/Uri;", "biddingLogicUri", "getBiddingLogicUri", "", "Landroidx/privacysandbox/ads/adservices/common/AdData;", "ads", "Ljava/util/List;", "getAds", "()Ljava/util/List;", "Ljava/time/Instant;", "activationTime", "Ljava/time/Instant;", "getActivationTime", "()Ljava/time/Instant;", SDKConstants.PARAM_EXPIRATION_TIME, "getExpirationTime", "Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;", "userBiddingSignals", "Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;", "getUserBiddingSignals", "()Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;", "Landroidx/privacysandbox/ads/adservices/customaudience/TrustedBiddingData;", "trustedBiddingSignals", "Landroidx/privacysandbox/ads/adservices/customaudience/TrustedBiddingData;", "getTrustedBiddingSignals", "()Landroidx/privacysandbox/ads/adservices/customaudience/TrustedBiddingData;", "Builder", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomAudience {
    private final Instant activationTime;
    private final List ads;
    private final Uri biddingLogicUri;
    private final AdTechIdentifier buyer;
    private final Uri dailyUpdateUri;
    private final Instant expirationTime;
    private final String name;
    private final TrustedBiddingData trustedBiddingSignals;
    private final AdSelectionSignals userBiddingSignals;

    /* compiled from: CustomAudience.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudience$Builder;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
    }

    public final AdTechIdentifier getBuyer() {
        return this.buyer;
    }

    public final String getName() {
        return this.name;
    }

    public final Uri getDailyUpdateUri() {
        return this.dailyUpdateUri;
    }

    public final Uri getBiddingLogicUri() {
        return this.biddingLogicUri;
    }

    public final List getAds() {
        return this.ads;
    }

    public final Instant getActivationTime() {
        return this.activationTime;
    }

    public final Instant getExpirationTime() {
        return this.expirationTime;
    }

    public final AdSelectionSignals getUserBiddingSignals() {
        return this.userBiddingSignals;
    }

    public final TrustedBiddingData getTrustedBiddingSignals() {
        return this.trustedBiddingSignals;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomAudience)) {
            return false;
        }
        CustomAudience customAudience = (CustomAudience) other;
        return Intrinsics.areEqual(this.buyer, customAudience.buyer) && Intrinsics.areEqual(this.name, customAudience.name) && Intrinsics.areEqual(this.activationTime, customAudience.activationTime) && Intrinsics.areEqual(this.expirationTime, customAudience.expirationTime) && Intrinsics.areEqual(this.dailyUpdateUri, customAudience.dailyUpdateUri) && Intrinsics.areEqual(this.userBiddingSignals, customAudience.userBiddingSignals) && Intrinsics.areEqual(this.trustedBiddingSignals, customAudience.trustedBiddingSignals) && Intrinsics.areEqual(this.ads, customAudience.ads);
    }

    public int hashCode() {
        int hashCode = ((this.buyer.hashCode() * 31) + this.name.hashCode()) * 31;
        Instant instant = this.activationTime;
        int hashCode2 = (hashCode + (instant != null ? instant.hashCode() : 0)) * 31;
        Instant instant2 = this.expirationTime;
        int hashCode3 = (((hashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 31) + this.dailyUpdateUri.hashCode()) * 31;
        AdSelectionSignals adSelectionSignals = this.userBiddingSignals;
        int hashCode4 = (hashCode3 + (adSelectionSignals != null ? adSelectionSignals.hashCode() : 0)) * 31;
        TrustedBiddingData trustedBiddingData = this.trustedBiddingSignals;
        return ((((hashCode4 + (trustedBiddingData != null ? trustedBiddingData.hashCode() : 0)) * 31) + this.biddingLogicUri.hashCode()) * 31) + this.ads.hashCode();
    }

    public String toString() {
        return "CustomAudience: buyer=" + this.biddingLogicUri + ", name=" + this.name + ", activationTime=" + this.activationTime + ", expirationTime=" + this.expirationTime + ", dailyUpdateUri=" + this.dailyUpdateUri + ", userBiddingSignals=" + this.userBiddingSignals + ", trustedBiddingSignals=" + this.trustedBiddingSignals + ", biddingLogicUri=" + this.biddingLogicUri + ", ads=" + this.ads;
    }
}
