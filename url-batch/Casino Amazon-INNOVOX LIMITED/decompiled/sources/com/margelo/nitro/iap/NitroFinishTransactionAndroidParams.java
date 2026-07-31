package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroFinishTransactionAndroidParams.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/margelo/nitro/iap/NitroFinishTransactionAndroidParams;", "", "purchaseToken", "", "isConsumable", "Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "<init>", "(Ljava/lang/String;Lcom/margelo/nitro/iap/Variant_NullType_Boolean;)V", "getPurchaseToken", "()Ljava/lang/String;", "()Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NitroFinishTransactionAndroidParams {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Variant_NullType_Boolean isConsumable;
    private final String purchaseToken;

    public static /* synthetic */ NitroFinishTransactionAndroidParams copy$default(NitroFinishTransactionAndroidParams nitroFinishTransactionAndroidParams, String str, Variant_NullType_Boolean variant_NullType_Boolean, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nitroFinishTransactionAndroidParams.purchaseToken;
        }
        if ((i & 2) != 0) {
            variant_NullType_Boolean = nitroFinishTransactionAndroidParams.isConsumable;
        }
        return nitroFinishTransactionAndroidParams.copy(str, variant_NullType_Boolean);
    }

    @JvmStatic
    private static final NitroFinishTransactionAndroidParams fromCpp(String str, Variant_NullType_Boolean variant_NullType_Boolean) {
        return INSTANCE.fromCpp(str, variant_NullType_Boolean);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* renamed from: component2, reason: from getter */
    public final Variant_NullType_Boolean getIsConsumable() {
        return this.isConsumable;
    }

    public final NitroFinishTransactionAndroidParams copy(String purchaseToken, Variant_NullType_Boolean isConsumable) {
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        return new NitroFinishTransactionAndroidParams(purchaseToken, isConsumable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroFinishTransactionAndroidParams)) {
            return false;
        }
        NitroFinishTransactionAndroidParams nitroFinishTransactionAndroidParams = (NitroFinishTransactionAndroidParams) other;
        return Intrinsics.areEqual(this.purchaseToken, nitroFinishTransactionAndroidParams.purchaseToken) && Intrinsics.areEqual(this.isConsumable, nitroFinishTransactionAndroidParams.isConsumable);
    }

    public int hashCode() {
        int hashCode = this.purchaseToken.hashCode() * 31;
        Variant_NullType_Boolean variant_NullType_Boolean = this.isConsumable;
        return hashCode + (variant_NullType_Boolean == null ? 0 : variant_NullType_Boolean.hashCode());
    }

    public String toString() {
        return "NitroFinishTransactionAndroidParams(purchaseToken=" + this.purchaseToken + ", isConsumable=" + this.isConsumable + ")";
    }

    public NitroFinishTransactionAndroidParams(String purchaseToken, Variant_NullType_Boolean variant_NullType_Boolean) {
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        this.purchaseToken = purchaseToken;
        this.isConsumable = variant_NullType_Boolean;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final Variant_NullType_Boolean isConsumable() {
        return this.isConsumable;
    }

    /* compiled from: NitroFinishTransactionAndroidParams.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0003¨\u0006\n"}, d2 = {"Lcom/margelo/nitro/iap/NitroFinishTransactionAndroidParams$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/NitroFinishTransactionAndroidParams;", "purchaseToken", "", "isConsumable", "Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroFinishTransactionAndroidParams fromCpp(String purchaseToken, Variant_NullType_Boolean isConsumable) {
            return new NitroFinishTransactionAndroidParams(purchaseToken, isConsumable);
        }
    }
}
