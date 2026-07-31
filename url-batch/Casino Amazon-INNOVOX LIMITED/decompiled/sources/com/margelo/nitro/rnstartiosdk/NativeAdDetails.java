package com.margelo.nitro.rnstartiosdk;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NativeAdDetails.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0001/B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003Jq\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u00060"}, d2 = {"Lcom/margelo/nitro/rnstartiosdk/NativeAdDetails;", "", "title", "", "description", "rating", "", "imageUrl", "secondaryImageUrl", "installs", "category", "packageName", "campaignAction", "Lcom/margelo/nitro/rnstartiosdk/CampaignAction;", "callToAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/margelo/nitro/rnstartiosdk/CampaignAction;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getRating", "()D", "getImageUrl", "getSecondaryImageUrl", "getInstalls", "getCategory", "getPackageName", "getCampaignAction", "()Lcom/margelo/nitro/rnstartiosdk/CampaignAction;", "getCallToAction", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "react-native-start-io-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NativeAdDetails {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String callToAction;
    private final CampaignAction campaignAction;
    private final String category;
    private final String description;
    private final String imageUrl;
    private final String installs;
    private final String packageName;
    private final double rating;
    private final String secondaryImageUrl;
    private final String title;

    public static /* synthetic */ NativeAdDetails copy$default(NativeAdDetails nativeAdDetails, String str, String str2, double d, String str3, String str4, String str5, String str6, String str7, CampaignAction campaignAction, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nativeAdDetails.title;
        }
        if ((i & 2) != 0) {
            str2 = nativeAdDetails.description;
        }
        if ((i & 4) != 0) {
            d = nativeAdDetails.rating;
        }
        if ((i & 8) != 0) {
            str3 = nativeAdDetails.imageUrl;
        }
        if ((i & 16) != 0) {
            str4 = nativeAdDetails.secondaryImageUrl;
        }
        if ((i & 32) != 0) {
            str5 = nativeAdDetails.installs;
        }
        if ((i & 64) != 0) {
            str6 = nativeAdDetails.category;
        }
        if ((i & 128) != 0) {
            str7 = nativeAdDetails.packageName;
        }
        if ((i & 256) != 0) {
            campaignAction = nativeAdDetails.campaignAction;
        }
        if ((i & 512) != 0) {
            str8 = nativeAdDetails.callToAction;
        }
        CampaignAction campaignAction2 = campaignAction;
        String str9 = str8;
        String str10 = str7;
        String str11 = str5;
        String str12 = str3;
        double d2 = d;
        return nativeAdDetails.copy(str, str2, d2, str12, str4, str11, str6, str10, campaignAction2, str9);
    }

    @JvmStatic
    private static final NativeAdDetails fromCpp(String str, String str2, double d, String str3, String str4, String str5, String str6, String str7, CampaignAction campaignAction, String str8) {
        return INSTANCE.fromCpp(str, str2, d, str3, str4, str5, str6, str7, campaignAction, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final String getCallToAction() {
        return this.callToAction;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final double getRating() {
        return this.rating;
    }

    /* renamed from: component4, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSecondaryImageUrl() {
        return this.secondaryImageUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final String getInstalls() {
        return this.installs;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* renamed from: component8, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* renamed from: component9, reason: from getter */
    public final CampaignAction getCampaignAction() {
        return this.campaignAction;
    }

    public final NativeAdDetails copy(String title, String description, double rating, String imageUrl, String secondaryImageUrl, String installs, String category, String packageName, CampaignAction campaignAction, String callToAction) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(installs, "installs");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(campaignAction, "campaignAction");
        Intrinsics.checkNotNullParameter(callToAction, "callToAction");
        return new NativeAdDetails(title, description, rating, imageUrl, secondaryImageUrl, installs, category, packageName, campaignAction, callToAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeAdDetails)) {
            return false;
        }
        NativeAdDetails nativeAdDetails = (NativeAdDetails) other;
        return Intrinsics.areEqual(this.title, nativeAdDetails.title) && Intrinsics.areEqual(this.description, nativeAdDetails.description) && Double.compare(this.rating, nativeAdDetails.rating) == 0 && Intrinsics.areEqual(this.imageUrl, nativeAdDetails.imageUrl) && Intrinsics.areEqual(this.secondaryImageUrl, nativeAdDetails.secondaryImageUrl) && Intrinsics.areEqual(this.installs, nativeAdDetails.installs) && Intrinsics.areEqual(this.category, nativeAdDetails.category) && Intrinsics.areEqual(this.packageName, nativeAdDetails.packageName) && this.campaignAction == nativeAdDetails.campaignAction && Intrinsics.areEqual(this.callToAction, nativeAdDetails.callToAction);
    }

    public int hashCode() {
        int hashCode = ((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + Double.hashCode(this.rating)) * 31;
        String str = this.imageUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.secondaryImageUrl;
        return ((((((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.installs.hashCode()) * 31) + this.category.hashCode()) * 31) + this.packageName.hashCode()) * 31) + this.campaignAction.hashCode()) * 31) + this.callToAction.hashCode();
    }

    public String toString() {
        return "NativeAdDetails(title=" + this.title + ", description=" + this.description + ", rating=" + this.rating + ", imageUrl=" + this.imageUrl + ", secondaryImageUrl=" + this.secondaryImageUrl + ", installs=" + this.installs + ", category=" + this.category + ", packageName=" + this.packageName + ", campaignAction=" + this.campaignAction + ", callToAction=" + this.callToAction + ")";
    }

    public NativeAdDetails(String title, String description, double d, String str, String str2, String installs, String category, String packageName, CampaignAction campaignAction, String callToAction) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(installs, "installs");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(campaignAction, "campaignAction");
        Intrinsics.checkNotNullParameter(callToAction, "callToAction");
        this.title = title;
        this.description = description;
        this.rating = d;
        this.imageUrl = str;
        this.secondaryImageUrl = str2;
        this.installs = installs;
        this.category = category;
        this.packageName = packageName;
        this.campaignAction = campaignAction;
        this.callToAction = callToAction;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final double getRating() {
        return this.rating;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getSecondaryImageUrl() {
        return this.secondaryImageUrl;
    }

    public final String getInstalls() {
        return this.installs;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final CampaignAction getCampaignAction() {
        return this.campaignAction;
    }

    public final String getCallToAction() {
        return this.callToAction;
    }

    /* compiled from: NativeAdDetails.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0007H\u0003¨\u0006\u0013"}, d2 = {"Lcom/margelo/nitro/rnstartiosdk/NativeAdDetails$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/rnstartiosdk/NativeAdDetails;", "title", "", "description", "rating", "", "imageUrl", "secondaryImageUrl", "installs", "category", "packageName", "campaignAction", "Lcom/margelo/nitro/rnstartiosdk/CampaignAction;", "callToAction", "react-native-start-io-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NativeAdDetails fromCpp(String title, String description, double rating, String imageUrl, String secondaryImageUrl, String installs, String category, String packageName, CampaignAction campaignAction, String callToAction) {
            return new NativeAdDetails(title, description, rating, imageUrl, secondaryImageUrl, installs, category, packageName, campaignAction, callToAction);
        }
    }
}
