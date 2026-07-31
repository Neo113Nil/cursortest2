package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JB\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0004\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006!"}, d2 = {"Ldev/hyo/openiap/VerifyPurchaseGoogleOptions;", "", "accessToken", "", "isSub", "", "packageName", "purchaseToken", "sku", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPackageName", "getPurchaseToken", "getSku", "toJson", "", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ldev/hyo/openiap/VerifyPurchaseGoogleOptions;", "equals", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class VerifyPurchaseGoogleOptions {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String accessToken;
    private final Boolean isSub;
    private final String packageName;
    private final String purchaseToken;
    private final String sku;

    public static /* synthetic */ VerifyPurchaseGoogleOptions copy$default(VerifyPurchaseGoogleOptions verifyPurchaseGoogleOptions, String str, Boolean bool, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = verifyPurchaseGoogleOptions.accessToken;
        }
        if ((i & 2) != 0) {
            bool = verifyPurchaseGoogleOptions.isSub;
        }
        if ((i & 4) != 0) {
            str2 = verifyPurchaseGoogleOptions.packageName;
        }
        if ((i & 8) != 0) {
            str3 = verifyPurchaseGoogleOptions.purchaseToken;
        }
        if ((i & 16) != 0) {
            str4 = verifyPurchaseGoogleOptions.sku;
        }
        String str5 = str4;
        String str6 = str2;
        return verifyPurchaseGoogleOptions.copy(str, bool, str6, str3, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsSub() {
        return this.isSub;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    public final VerifyPurchaseGoogleOptions copy(String accessToken, Boolean isSub, String packageName, String purchaseToken, String sku) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        Intrinsics.checkNotNullParameter(sku, "sku");
        return new VerifyPurchaseGoogleOptions(accessToken, isSub, packageName, purchaseToken, sku);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyPurchaseGoogleOptions)) {
            return false;
        }
        VerifyPurchaseGoogleOptions verifyPurchaseGoogleOptions = (VerifyPurchaseGoogleOptions) other;
        return Intrinsics.areEqual(this.accessToken, verifyPurchaseGoogleOptions.accessToken) && Intrinsics.areEqual(this.isSub, verifyPurchaseGoogleOptions.isSub) && Intrinsics.areEqual(this.packageName, verifyPurchaseGoogleOptions.packageName) && Intrinsics.areEqual(this.purchaseToken, verifyPurchaseGoogleOptions.purchaseToken) && Intrinsics.areEqual(this.sku, verifyPurchaseGoogleOptions.sku);
    }

    public int hashCode() {
        int hashCode = this.accessToken.hashCode() * 31;
        Boolean bool = this.isSub;
        return ((((((hashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.packageName.hashCode()) * 31) + this.purchaseToken.hashCode()) * 31) + this.sku.hashCode();
    }

    public String toString() {
        return "VerifyPurchaseGoogleOptions(accessToken=" + this.accessToken + ", isSub=" + this.isSub + ", packageName=" + this.packageName + ", purchaseToken=" + this.purchaseToken + ", sku=" + this.sku + ")";
    }

    public VerifyPurchaseGoogleOptions(String accessToken, Boolean bool, String packageName, String purchaseToken, String sku) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        Intrinsics.checkNotNullParameter(sku, "sku");
        this.accessToken = accessToken;
        this.isSub = bool;
        this.packageName = packageName;
        this.purchaseToken = purchaseToken;
        this.sku = sku;
    }

    public /* synthetic */ VerifyPurchaseGoogleOptions(String str, Boolean bool, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : bool, str2, str3, str4);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final Boolean isSub() {
        return this.isSub;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final String getSku() {
        return this.sku;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/VerifyPurchaseGoogleOptions$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/VerifyPurchaseGoogleOptions;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final VerifyPurchaseGoogleOptions fromJson(Map<String, ? extends Object> json) {
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("accessToken");
            String str = obj instanceof String ? (String) obj : null;
            Object obj2 = json.get("isSub");
            Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
            Object obj3 = json.get("packageName");
            String str2 = obj3 instanceof String ? (String) obj3 : null;
            Object obj4 = json.get("purchaseToken");
            String str3 = obj4 instanceof String ? (String) obj4 : null;
            Object obj5 = json.get("sku");
            String str4 = obj5 instanceof String ? (String) obj5 : null;
            if (str == null || str2 == null || str3 == null || str4 == null) {
                return null;
            }
            return new VerifyPurchaseGoogleOptions(str, bool, str2, str3, str4);
        }
    }

    public final Map<String, Object> toJson() {
        return MapsKt.mapOf(TuplesKt.to("accessToken", this.accessToken), TuplesKt.to("isSub", this.isSub), TuplesKt.to("packageName", this.packageName), TuplesKt.to("purchaseToken", this.purchaseToken), TuplesKt.to("sku", this.sku));
    }
}
