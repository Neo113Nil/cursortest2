package androidx.privacysandbox.ads.adservices.adselection;

import android.adservices.adselection.AdSelectionFromOutcomesConfig;
import android.net.Uri;
import androidx.privacysandbox.ads.adservices.common.AdSelectionSignals;
import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdSelectionFromOutcomesConfig.kt */
@ExperimentalFeatures.Ext10OptIn
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\fH\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006'"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionFromOutcomesConfig;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/adservices/adselection/AdSelectionFromOutcomesConfig;", "convertToAdServices$ads_adservices_release", "()Landroid/adservices/adselection/AdSelectionFromOutcomesConfig;", "convertToAdServices", "Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "seller", "Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "getSeller", "()Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "", "", "adSelectionIds", "Ljava/util/List;", "getAdSelectionIds", "()Ljava/util/List;", "Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;", "adSelectionSignals", "Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;", "getAdSelectionSignals", "()Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;", "Landroid/net/Uri;", "selectionLogicUri", "Landroid/net/Uri;", "getSelectionLogicUri", "()Landroid/net/Uri;", "setSelectionLogicUri", "(Landroid/net/Uri;)V", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdSelectionFromOutcomesConfig {
    private final List adSelectionIds;
    private final AdSelectionSignals adSelectionSignals;
    private Uri selectionLogicUri;
    private final AdTechIdentifier seller;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdSelectionFromOutcomesConfig)) {
            return false;
        }
        AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig = (AdSelectionFromOutcomesConfig) other;
        return Intrinsics.areEqual(this.seller, adSelectionFromOutcomesConfig.seller) && Intrinsics.areEqual(this.adSelectionIds, adSelectionFromOutcomesConfig.adSelectionIds) && Intrinsics.areEqual(this.adSelectionSignals, adSelectionFromOutcomesConfig.adSelectionSignals) && Intrinsics.areEqual(this.selectionLogicUri, adSelectionFromOutcomesConfig.selectionLogicUri);
    }

    public int hashCode() {
        return (((((this.seller.hashCode() * 31) + this.adSelectionIds.hashCode()) * 31) + this.adSelectionSignals.hashCode()) * 31) + this.selectionLogicUri.hashCode();
    }

    public String toString() {
        return "AdSelectionFromOutcomesConfig: seller=" + this.seller + ", adSelectionIds='" + this.adSelectionIds + "', adSelectionSignals=" + this.adSelectionSignals + ", selectionLogicUri=" + this.selectionLogicUri;
    }

    public final android.adservices.adselection.AdSelectionFromOutcomesConfig convertToAdServices$ads_adservices_release() {
        AdSelectionFromOutcomesConfig.Builder selectionSignals;
        AdSelectionFromOutcomesConfig.Builder adSelectionIds;
        AdSelectionFromOutcomesConfig.Builder selectionLogicUri;
        AdSelectionFromOutcomesConfig.Builder seller;
        android.adservices.adselection.AdSelectionFromOutcomesConfig build;
        selectionSignals = AdSelectionFromOutcomesConfig$$ExternalSyntheticApiModelOutline0.m().setSelectionSignals(this.adSelectionSignals.convertToAdServices$ads_adservices_release());
        adSelectionIds = selectionSignals.setAdSelectionIds(this.adSelectionIds);
        selectionLogicUri = adSelectionIds.setSelectionLogicUri(this.selectionLogicUri);
        seller = selectionLogicUri.setSeller(this.seller.convertToAdServices$ads_adservices_release());
        build = seller.build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .s…s())\n            .build()");
        return build;
    }
}
