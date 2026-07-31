package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroVerifyPurchaseWithProviderResult.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/margelo/nitro/iap/NitroVerifyPurchaseWithProviderResult;", "", "iapkit", "Lcom/margelo/nitro/iap/Variant_NullType_NitroVerifyPurchaseWithIapkitResult;", "errors", "Lcom/margelo/nitro/iap/Variant_NullType_Array_NitroVerifyPurchaseWithProviderError_;", "provider", "Lcom/margelo/nitro/iap/PurchaseVerificationProvider;", "<init>", "(Lcom/margelo/nitro/iap/Variant_NullType_NitroVerifyPurchaseWithIapkitResult;Lcom/margelo/nitro/iap/Variant_NullType_Array_NitroVerifyPurchaseWithProviderError_;Lcom/margelo/nitro/iap/PurchaseVerificationProvider;)V", "getIapkit", "()Lcom/margelo/nitro/iap/Variant_NullType_NitroVerifyPurchaseWithIapkitResult;", "getErrors", "()Lcom/margelo/nitro/iap/Variant_NullType_Array_NitroVerifyPurchaseWithProviderError_;", "getProvider", "()Lcom/margelo/nitro/iap/PurchaseVerificationProvider;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NitroVerifyPurchaseWithProviderResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Variant_NullType_Array_NitroVerifyPurchaseWithProviderError_ errors;
    private final Variant_NullType_NitroVerifyPurchaseWithIapkitResult iapkit;
    private final PurchaseVerificationProvider provider;

    public static /* synthetic */ NitroVerifyPurchaseWithProviderResult copy$default(NitroVerifyPurchaseWithProviderResult nitroVerifyPurchaseWithProviderResult, Variant_NullType_NitroVerifyPurchaseWithIapkitResult variant_NullType_NitroVerifyPurchaseWithIapkitResult, Variant_NullType_Array_NitroVerifyPurchaseWithProviderError_ variant_NullType_Array_NitroVerifyPurchaseWithProviderError_, PurchaseVerificationProvider purchaseVerificationProvider, int i, Object obj) {
        if ((i & 1) != 0) {
            variant_NullType_NitroVerifyPurchaseWithIapkitResult = nitroVerifyPurchaseWithProviderResult.iapkit;
        }
        if ((i & 2) != 0) {
            variant_NullType_Array_NitroVerifyPurchaseWithProviderError_ = nitroVerifyPurchaseWithProviderResult.errors;
        }
        if ((i & 4) != 0) {
            purchaseVerificationProvider = nitroVerifyPurchaseWithProviderResult.provider;
        }
        return nitroVerifyPurchaseWithProviderResult.copy(variant_NullType_NitroVerifyPurchaseWithIapkitResult, variant_NullType_Array_NitroVerifyPurchaseWithProviderError_, purchaseVerificationProvider);
    }

    @JvmStatic
    private static final NitroVerifyPurchaseWithProviderResult fromCpp(Variant_NullType_NitroVerifyPurchaseWithIapkitResult variant_NullType_NitroVerifyPurchaseWithIapkitResult, Variant_NullType_Array_NitroVerifyPurchaseWithProviderError_ variant_NullType_Array_NitroVerifyPurchaseWithProviderError_, PurchaseVerificationProvider purchaseVerificationProvider) {
        return INSTANCE.fromCpp(variant_NullType_NitroVerifyPurchaseWithIapkitResult, variant_NullType_Array_NitroVerifyPurchaseWithProviderError_, purchaseVerificationProvider);
    }

    /* renamed from: component1, reason: from getter */
    public final Variant_NullType_NitroVerifyPurchaseWithIapkitResult getIapkit() {
        return this.iapkit;
    }

    /* renamed from: component2, reason: from getter */
    public final Variant_NullType_Array_NitroVerifyPurchaseWithProviderError_ getErrors() {
        return this.errors;
    }

    /* renamed from: component3, reason: from getter */
    public final PurchaseVerificationProvider getProvider() {
        return this.provider;
    }

    public final NitroVerifyPurchaseWithProviderResult copy(Variant_NullType_NitroVerifyPurchaseWithIapkitResult iapkit, Variant_NullType_Array_NitroVerifyPurchaseWithProviderError_ errors, PurchaseVerificationProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NitroVerifyPurchaseWithProviderResult(iapkit, errors, provider);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroVerifyPurchaseWithProviderResult)) {
            return false;
        }
        NitroVerifyPurchaseWithProviderResult nitroVerifyPurchaseWithProviderResult = (NitroVerifyPurchaseWithProviderResult) other;
        return Intrinsics.areEqual(this.iapkit, nitroVerifyPurchaseWithProviderResult.iapkit) && Intrinsics.areEqual(this.errors, nitroVerifyPurchaseWithProviderResult.errors) && this.provider == nitroVerifyPurchaseWithProviderResult.provider;
    }

    public int hashCode() {
        Variant_NullType_NitroVerifyPurchaseWithIapkitResult variant_NullType_NitroVerifyPurchaseWithIapkitResult = this.iapkit;
        int hashCode = (variant_NullType_NitroVerifyPurchaseWithIapkitResult == null ? 0 : variant_NullType_NitroVerifyPurchaseWithIapkitResult.hashCode()) * 31;
        Variant_NullType_Array_NitroVerifyPurchaseWithProviderError_ variant_NullType_Array_NitroVerifyPurchaseWithProviderError_ = this.errors;
        return ((hashCode + (variant_NullType_Array_NitroVerifyPurchaseWithProviderError_ != null ? variant_NullType_Array_NitroVerifyPurchaseWithProviderError_.hashCode() : 0)) * 31) + this.provider.hashCode();
    }

    public String toString() {
        return "NitroVerifyPurchaseWithProviderResult(iapkit=" + this.iapkit + ", errors=" + this.errors + ", provider=" + this.provider + ")";
    }

    public NitroVerifyPurchaseWithProviderResult(Variant_NullType_NitroVerifyPurchaseWithIapkitResult variant_NullType_NitroVerifyPurchaseWithIapkitResult, Variant_NullType_Array_NitroVerifyPurchaseWithProviderError_ variant_NullType_Array_NitroVerifyPurchaseWithProviderError_, PurchaseVerificationProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.iapkit = variant_NullType_NitroVerifyPurchaseWithIapkitResult;
        this.errors = variant_NullType_Array_NitroVerifyPurchaseWithProviderError_;
        this.provider = provider;
    }

    public final Variant_NullType_NitroVerifyPurchaseWithIapkitResult getIapkit() {
        return this.iapkit;
    }

    public final Variant_NullType_Array_NitroVerifyPurchaseWithProviderError_ getErrors() {
        return this.errors;
    }

    public final PurchaseVerificationProvider getProvider() {
        return this.provider;
    }

    /* compiled from: NitroVerifyPurchaseWithProviderResult.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0003¨\u0006\f"}, d2 = {"Lcom/margelo/nitro/iap/NitroVerifyPurchaseWithProviderResult$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/NitroVerifyPurchaseWithProviderResult;", "iapkit", "Lcom/margelo/nitro/iap/Variant_NullType_NitroVerifyPurchaseWithIapkitResult;", "errors", "Lcom/margelo/nitro/iap/Variant_NullType_Array_NitroVerifyPurchaseWithProviderError_;", "provider", "Lcom/margelo/nitro/iap/PurchaseVerificationProvider;", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroVerifyPurchaseWithProviderResult fromCpp(Variant_NullType_NitroVerifyPurchaseWithIapkitResult iapkit, Variant_NullType_Array_NitroVerifyPurchaseWithProviderError_ errors, PurchaseVerificationProvider provider) {
            return new NitroVerifyPurchaseWithProviderResult(iapkit, errors, provider);
        }
    }
}
