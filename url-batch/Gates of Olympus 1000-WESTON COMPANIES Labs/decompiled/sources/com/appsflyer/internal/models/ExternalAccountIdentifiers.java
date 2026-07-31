package com.appsflyer.internal.models;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: SubscriptionPurchase.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/appsflyer/internal/models/ExternalAccountIdentifiers;", "", "externalAccountId", "", "obfuscatedExternalAccountId", "obfuscatedExternalProfileId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getExternalAccountId", "()Ljava/lang/String;", "getObfuscatedExternalAccountId", "getObfuscatedExternalProfileId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final /* data */ class ExternalAccountIdentifiers {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String externalAccountId;
    private final String obfuscatedExternalAccountId;
    private final String obfuscatedExternalProfileId;

    public static /* synthetic */ ExternalAccountIdentifiers copy$default(ExternalAccountIdentifiers externalAccountIdentifiers, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = externalAccountIdentifiers.externalAccountId;
        }
        if ((i & 2) != 0) {
            str2 = externalAccountIdentifiers.obfuscatedExternalAccountId;
        }
        if ((i & 4) != 0) {
            str3 = externalAccountIdentifiers.obfuscatedExternalProfileId;
        }
        return externalAccountIdentifiers.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getExternalAccountId() {
        return this.externalAccountId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getObfuscatedExternalAccountId() {
        return this.obfuscatedExternalAccountId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getObfuscatedExternalProfileId() {
        return this.obfuscatedExternalProfileId;
    }

    public final ExternalAccountIdentifiers copy(String externalAccountId, String obfuscatedExternalAccountId, String obfuscatedExternalProfileId) {
        Intrinsics.checkNotNullParameter(externalAccountId, "externalAccountId");
        Intrinsics.checkNotNullParameter(obfuscatedExternalAccountId, "obfuscatedExternalAccountId");
        Intrinsics.checkNotNullParameter(obfuscatedExternalProfileId, "obfuscatedExternalProfileId");
        return new ExternalAccountIdentifiers(externalAccountId, obfuscatedExternalAccountId, obfuscatedExternalProfileId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalAccountIdentifiers)) {
            return false;
        }
        ExternalAccountIdentifiers externalAccountIdentifiers = (ExternalAccountIdentifiers) other;
        return Intrinsics.areEqual(this.externalAccountId, externalAccountIdentifiers.externalAccountId) && Intrinsics.areEqual(this.obfuscatedExternalAccountId, externalAccountIdentifiers.obfuscatedExternalAccountId) && Intrinsics.areEqual(this.obfuscatedExternalProfileId, externalAccountIdentifiers.obfuscatedExternalProfileId);
    }

    public int hashCode() {
        return (((this.externalAccountId.hashCode() * 31) + this.obfuscatedExternalAccountId.hashCode()) * 31) + this.obfuscatedExternalProfileId.hashCode();
    }

    public String toString() {
        return "ExternalAccountIdentifiers(externalAccountId=" + this.externalAccountId + ", obfuscatedExternalAccountId=" + this.obfuscatedExternalAccountId + ", obfuscatedExternalProfileId=" + this.obfuscatedExternalProfileId + ")";
    }

    public ExternalAccountIdentifiers(String externalAccountId, String obfuscatedExternalAccountId, String obfuscatedExternalProfileId) {
        Intrinsics.checkNotNullParameter(externalAccountId, "externalAccountId");
        Intrinsics.checkNotNullParameter(obfuscatedExternalAccountId, "obfuscatedExternalAccountId");
        Intrinsics.checkNotNullParameter(obfuscatedExternalProfileId, "obfuscatedExternalProfileId");
        this.externalAccountId = externalAccountId;
        this.obfuscatedExternalAccountId = obfuscatedExternalAccountId;
        this.obfuscatedExternalProfileId = obfuscatedExternalProfileId;
    }

    public final String getExternalAccountId() {
        return this.externalAccountId;
    }

    public final String getObfuscatedExternalAccountId() {
        return this.obfuscatedExternalAccountId;
    }

    public final String getObfuscatedExternalProfileId() {
        return this.obfuscatedExternalProfileId;
    }

    /* compiled from: SubscriptionPurchase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/appsflyer/internal/models/ExternalAccountIdentifiers$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/ExternalAccountIdentifiers;", "()V", "fromJson", "json", "Lorg/json/JSONObject;", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion implements Deserialize<ExternalAccountIdentifiers> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        public ExternalAccountIdentifiers fromJson(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            String optString = json.optString("externalAccountId");
            Intrinsics.checkNotNullExpressionValue(optString, "optString(\"externalAccountId\")");
            String optString2 = json.optString("obfuscatedExternalAccountId");
            Intrinsics.checkNotNullExpressionValue(optString2, "optString(\"obfuscatedExternalAccountId\")");
            String optString3 = json.optString("obfuscatedExternalProfileId");
            Intrinsics.checkNotNullExpressionValue(optString3, "optString(\"obfuscatedExternalProfileId\")");
            return new ExternalAccountIdentifiers(optString, optString2, optString3);
        }
    }
}
