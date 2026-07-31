package com.appsflyer.internal.models;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: SubscriptionPurchase.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB/\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/appsflyer/internal/models/SubscribeWithGoogleInfo;", "", "emailAddress", "", "familyName", "givenName", "profileId", "profileName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmailAddress", "()Ljava/lang/String;", "getFamilyName", "getGivenName", "getProfileId", "getProfileName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final /* data */ class SubscribeWithGoogleInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String emailAddress;
    private final String familyName;
    private final String givenName;
    private final String profileId;
    private final String profileName;

    public static /* synthetic */ SubscribeWithGoogleInfo copy$default(SubscribeWithGoogleInfo subscribeWithGoogleInfo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscribeWithGoogleInfo.emailAddress;
        }
        if ((i & 2) != 0) {
            str2 = subscribeWithGoogleInfo.familyName;
        }
        if ((i & 4) != 0) {
            str3 = subscribeWithGoogleInfo.givenName;
        }
        if ((i & 8) != 0) {
            str4 = subscribeWithGoogleInfo.profileId;
        }
        if ((i & 16) != 0) {
            str5 = subscribeWithGoogleInfo.profileName;
        }
        String str6 = str5;
        String str7 = str3;
        return subscribeWithGoogleInfo.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEmailAddress() {
        return this.emailAddress;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFamilyName() {
        return this.familyName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getGivenName() {
        return this.givenName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getProfileId() {
        return this.profileId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getProfileName() {
        return this.profileName;
    }

    public final SubscribeWithGoogleInfo copy(String emailAddress, String familyName, String givenName, String profileId, String profileName) {
        Intrinsics.checkNotNullParameter(emailAddress, "emailAddress");
        Intrinsics.checkNotNullParameter(familyName, "familyName");
        Intrinsics.checkNotNullParameter(givenName, "givenName");
        Intrinsics.checkNotNullParameter(profileId, "profileId");
        Intrinsics.checkNotNullParameter(profileName, "profileName");
        return new SubscribeWithGoogleInfo(emailAddress, familyName, givenName, profileId, profileName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscribeWithGoogleInfo)) {
            return false;
        }
        SubscribeWithGoogleInfo subscribeWithGoogleInfo = (SubscribeWithGoogleInfo) other;
        return Intrinsics.areEqual(this.emailAddress, subscribeWithGoogleInfo.emailAddress) && Intrinsics.areEqual(this.familyName, subscribeWithGoogleInfo.familyName) && Intrinsics.areEqual(this.givenName, subscribeWithGoogleInfo.givenName) && Intrinsics.areEqual(this.profileId, subscribeWithGoogleInfo.profileId) && Intrinsics.areEqual(this.profileName, subscribeWithGoogleInfo.profileName);
    }

    public int hashCode() {
        return (((((((this.emailAddress.hashCode() * 31) + this.familyName.hashCode()) * 31) + this.givenName.hashCode()) * 31) + this.profileId.hashCode()) * 31) + this.profileName.hashCode();
    }

    public String toString() {
        return "SubscribeWithGoogleInfo(emailAddress=" + this.emailAddress + ", familyName=" + this.familyName + ", givenName=" + this.givenName + ", profileId=" + this.profileId + ", profileName=" + this.profileName + ")";
    }

    public SubscribeWithGoogleInfo(String emailAddress, String familyName, String givenName, String profileId, String profileName) {
        Intrinsics.checkNotNullParameter(emailAddress, "emailAddress");
        Intrinsics.checkNotNullParameter(familyName, "familyName");
        Intrinsics.checkNotNullParameter(givenName, "givenName");
        Intrinsics.checkNotNullParameter(profileId, "profileId");
        Intrinsics.checkNotNullParameter(profileName, "profileName");
        this.emailAddress = emailAddress;
        this.familyName = familyName;
        this.givenName = givenName;
        this.profileId = profileId;
        this.profileName = profileName;
    }

    public final String getEmailAddress() {
        return this.emailAddress;
    }

    public final String getFamilyName() {
        return this.familyName;
    }

    public final String getGivenName() {
        return this.givenName;
    }

    public final String getProfileId() {
        return this.profileId;
    }

    public final String getProfileName() {
        return this.profileName;
    }

    /* compiled from: SubscriptionPurchase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/appsflyer/internal/models/SubscribeWithGoogleInfo$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/SubscribeWithGoogleInfo;", "()V", "fromJson", "json", "Lorg/json/JSONObject;", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion implements Deserialize<SubscribeWithGoogleInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        public SubscribeWithGoogleInfo fromJson(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            String optString = json.optString("emailAddress");
            Intrinsics.checkNotNullExpressionValue(optString, "optString(\"emailAddress\")");
            String optString2 = json.optString("familyName");
            Intrinsics.checkNotNullExpressionValue(optString2, "optString(\"familyName\")");
            String optString3 = json.optString("givenName");
            Intrinsics.checkNotNullExpressionValue(optString3, "optString(\"givenName\")");
            String optString4 = json.optString("profileId");
            Intrinsics.checkNotNullExpressionValue(optString4, "optString(\"profileId\")");
            String optString5 = json.optString("profileName");
            Intrinsics.checkNotNullExpressionValue(optString5, "optString(\"profileName\")");
            return new SubscribeWithGoogleInfo(optString, optString2, optString3, optString4, optString5);
        }
    }
}
