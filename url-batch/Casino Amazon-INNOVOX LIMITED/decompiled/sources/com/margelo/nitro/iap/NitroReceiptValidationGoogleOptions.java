package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroReceiptValidationGoogleOptions.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/margelo/nitro/iap/NitroReceiptValidationGoogleOptions;", "", "accessToken", "", "isSub", "Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "packageName", "purchaseToken", "sku", "<init>", "(Ljava/lang/String;Lcom/margelo/nitro/iap/Variant_NullType_Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "()Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "getPackageName", "getPurchaseToken", "getSku", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NitroReceiptValidationGoogleOptions {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String accessToken;
    private final Variant_NullType_Boolean isSub;
    private final String packageName;
    private final String purchaseToken;
    private final String sku;

    public static /* synthetic */ NitroReceiptValidationGoogleOptions copy$default(NitroReceiptValidationGoogleOptions nitroReceiptValidationGoogleOptions, String str, Variant_NullType_Boolean variant_NullType_Boolean, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nitroReceiptValidationGoogleOptions.accessToken;
        }
        if ((i & 2) != 0) {
            variant_NullType_Boolean = nitroReceiptValidationGoogleOptions.isSub;
        }
        if ((i & 4) != 0) {
            str2 = nitroReceiptValidationGoogleOptions.packageName;
        }
        if ((i & 8) != 0) {
            str3 = nitroReceiptValidationGoogleOptions.purchaseToken;
        }
        if ((i & 16) != 0) {
            str4 = nitroReceiptValidationGoogleOptions.sku;
        }
        String str5 = str4;
        String str6 = str2;
        return nitroReceiptValidationGoogleOptions.copy(str, variant_NullType_Boolean, str6, str3, str5);
    }

    @JvmStatic
    private static final NitroReceiptValidationGoogleOptions fromCpp(String str, Variant_NullType_Boolean variant_NullType_Boolean, String str2, String str3, String str4) {
        return INSTANCE.fromCpp(str, variant_NullType_Boolean, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* renamed from: component2, reason: from getter */
    public final Variant_NullType_Boolean getIsSub() {
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

    public final NitroReceiptValidationGoogleOptions copy(String accessToken, Variant_NullType_Boolean isSub, String packageName, String purchaseToken, String sku) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        Intrinsics.checkNotNullParameter(sku, "sku");
        return new NitroReceiptValidationGoogleOptions(accessToken, isSub, packageName, purchaseToken, sku);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroReceiptValidationGoogleOptions)) {
            return false;
        }
        NitroReceiptValidationGoogleOptions nitroReceiptValidationGoogleOptions = (NitroReceiptValidationGoogleOptions) other;
        return Intrinsics.areEqual(this.accessToken, nitroReceiptValidationGoogleOptions.accessToken) && Intrinsics.areEqual(this.isSub, nitroReceiptValidationGoogleOptions.isSub) && Intrinsics.areEqual(this.packageName, nitroReceiptValidationGoogleOptions.packageName) && Intrinsics.areEqual(this.purchaseToken, nitroReceiptValidationGoogleOptions.purchaseToken) && Intrinsics.areEqual(this.sku, nitroReceiptValidationGoogleOptions.sku);
    }

    public int hashCode() {
        int hashCode = this.accessToken.hashCode() * 31;
        Variant_NullType_Boolean variant_NullType_Boolean = this.isSub;
        return ((((((hashCode + (variant_NullType_Boolean == null ? 0 : variant_NullType_Boolean.hashCode())) * 31) + this.packageName.hashCode()) * 31) + this.purchaseToken.hashCode()) * 31) + this.sku.hashCode();
    }

    public String toString() {
        return "NitroReceiptValidationGoogleOptions(accessToken=" + this.accessToken + ", isSub=" + this.isSub + ", packageName=" + this.packageName + ", purchaseToken=" + this.purchaseToken + ", sku=" + this.sku + ")";
    }

    public NitroReceiptValidationGoogleOptions(String accessToken, Variant_NullType_Boolean variant_NullType_Boolean, String packageName, String purchaseToken, String sku) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        Intrinsics.checkNotNullParameter(sku, "sku");
        this.accessToken = accessToken;
        this.isSub = variant_NullType_Boolean;
        this.packageName = packageName;
        this.purchaseToken = purchaseToken;
        this.sku = sku;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final Variant_NullType_Boolean isSub() {
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

    /* compiled from: NitroReceiptValidationGoogleOptions.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0003¨\u0006\r"}, d2 = {"Lcom/margelo/nitro/iap/NitroReceiptValidationGoogleOptions$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/NitroReceiptValidationGoogleOptions;", "accessToken", "", "isSub", "Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "packageName", "purchaseToken", "sku", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroReceiptValidationGoogleOptions fromCpp(String accessToken, Variant_NullType_Boolean isSub, String packageName, String purchaseToken, String sku) {
            return new NitroReceiptValidationGoogleOptions(accessToken, isSub, packageName, purchaseToken, sku);
        }
    }
}
