package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroReceiptValidationHorizonOptions.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/margelo/nitro/iap/NitroReceiptValidationHorizonOptions;", "", "accessToken", "", "sku", "userId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getSku", "getUserId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NitroReceiptValidationHorizonOptions {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String accessToken;
    private final String sku;
    private final String userId;

    public static /* synthetic */ NitroReceiptValidationHorizonOptions copy$default(NitroReceiptValidationHorizonOptions nitroReceiptValidationHorizonOptions, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nitroReceiptValidationHorizonOptions.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = nitroReceiptValidationHorizonOptions.sku;
        }
        if ((i & 4) != 0) {
            str3 = nitroReceiptValidationHorizonOptions.userId;
        }
        return nitroReceiptValidationHorizonOptions.copy(str, str2, str3);
    }

    @JvmStatic
    private static final NitroReceiptValidationHorizonOptions fromCpp(String str, String str2, String str3) {
        return INSTANCE.fromCpp(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    public final NitroReceiptValidationHorizonOptions copy(String accessToken, String sku, String userId) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new NitroReceiptValidationHorizonOptions(accessToken, sku, userId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroReceiptValidationHorizonOptions)) {
            return false;
        }
        NitroReceiptValidationHorizonOptions nitroReceiptValidationHorizonOptions = (NitroReceiptValidationHorizonOptions) other;
        return Intrinsics.areEqual(this.accessToken, nitroReceiptValidationHorizonOptions.accessToken) && Intrinsics.areEqual(this.sku, nitroReceiptValidationHorizonOptions.sku) && Intrinsics.areEqual(this.userId, nitroReceiptValidationHorizonOptions.userId);
    }

    public int hashCode() {
        return (((this.accessToken.hashCode() * 31) + this.sku.hashCode()) * 31) + this.userId.hashCode();
    }

    public String toString() {
        return "NitroReceiptValidationHorizonOptions(accessToken=" + this.accessToken + ", sku=" + this.sku + ", userId=" + this.userId + ")";
    }

    public NitroReceiptValidationHorizonOptions(String accessToken, String sku, String userId) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.accessToken = accessToken;
        this.sku = sku;
        this.userId = userId;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getSku() {
        return this.sku;
    }

    public final String getUserId() {
        return this.userId;
    }

    /* compiled from: NitroReceiptValidationHorizonOptions.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0003¨\u0006\n"}, d2 = {"Lcom/margelo/nitro/iap/NitroReceiptValidationHorizonOptions$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/NitroReceiptValidationHorizonOptions;", "accessToken", "", "sku", "userId", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroReceiptValidationHorizonOptions fromCpp(String accessToken, String sku, String userId) {
            return new NitroReceiptValidationHorizonOptions(accessToken, sku, userId);
        }
    }
}
