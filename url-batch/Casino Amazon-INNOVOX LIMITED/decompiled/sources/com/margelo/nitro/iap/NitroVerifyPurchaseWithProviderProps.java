package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroVerifyPurchaseWithProviderProps.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/margelo/nitro/iap/NitroVerifyPurchaseWithProviderProps;", "", "iapkit", "Lcom/margelo/nitro/iap/Variant_NullType_NitroVerifyPurchaseWithIapkitProps;", "provider", "Lcom/margelo/nitro/iap/PurchaseVerificationProvider;", "<init>", "(Lcom/margelo/nitro/iap/Variant_NullType_NitroVerifyPurchaseWithIapkitProps;Lcom/margelo/nitro/iap/PurchaseVerificationProvider;)V", "getIapkit", "()Lcom/margelo/nitro/iap/Variant_NullType_NitroVerifyPurchaseWithIapkitProps;", "getProvider", "()Lcom/margelo/nitro/iap/PurchaseVerificationProvider;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NitroVerifyPurchaseWithProviderProps {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Variant_NullType_NitroVerifyPurchaseWithIapkitProps iapkit;
    private final PurchaseVerificationProvider provider;

    public static /* synthetic */ NitroVerifyPurchaseWithProviderProps copy$default(NitroVerifyPurchaseWithProviderProps nitroVerifyPurchaseWithProviderProps, Variant_NullType_NitroVerifyPurchaseWithIapkitProps variant_NullType_NitroVerifyPurchaseWithIapkitProps, PurchaseVerificationProvider purchaseVerificationProvider, int i, Object obj) {
        if ((i & 1) != 0) {
            variant_NullType_NitroVerifyPurchaseWithIapkitProps = nitroVerifyPurchaseWithProviderProps.iapkit;
        }
        if ((i & 2) != 0) {
            purchaseVerificationProvider = nitroVerifyPurchaseWithProviderProps.provider;
        }
        return nitroVerifyPurchaseWithProviderProps.copy(variant_NullType_NitroVerifyPurchaseWithIapkitProps, purchaseVerificationProvider);
    }

    @JvmStatic
    private static final NitroVerifyPurchaseWithProviderProps fromCpp(Variant_NullType_NitroVerifyPurchaseWithIapkitProps variant_NullType_NitroVerifyPurchaseWithIapkitProps, PurchaseVerificationProvider purchaseVerificationProvider) {
        return INSTANCE.fromCpp(variant_NullType_NitroVerifyPurchaseWithIapkitProps, purchaseVerificationProvider);
    }

    /* renamed from: component1, reason: from getter */
    public final Variant_NullType_NitroVerifyPurchaseWithIapkitProps getIapkit() {
        return this.iapkit;
    }

    /* renamed from: component2, reason: from getter */
    public final PurchaseVerificationProvider getProvider() {
        return this.provider;
    }

    public final NitroVerifyPurchaseWithProviderProps copy(Variant_NullType_NitroVerifyPurchaseWithIapkitProps iapkit, PurchaseVerificationProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new NitroVerifyPurchaseWithProviderProps(iapkit, provider);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroVerifyPurchaseWithProviderProps)) {
            return false;
        }
        NitroVerifyPurchaseWithProviderProps nitroVerifyPurchaseWithProviderProps = (NitroVerifyPurchaseWithProviderProps) other;
        return Intrinsics.areEqual(this.iapkit, nitroVerifyPurchaseWithProviderProps.iapkit) && this.provider == nitroVerifyPurchaseWithProviderProps.provider;
    }

    public int hashCode() {
        Variant_NullType_NitroVerifyPurchaseWithIapkitProps variant_NullType_NitroVerifyPurchaseWithIapkitProps = this.iapkit;
        return ((variant_NullType_NitroVerifyPurchaseWithIapkitProps == null ? 0 : variant_NullType_NitroVerifyPurchaseWithIapkitProps.hashCode()) * 31) + this.provider.hashCode();
    }

    public String toString() {
        return "NitroVerifyPurchaseWithProviderProps(iapkit=" + this.iapkit + ", provider=" + this.provider + ")";
    }

    public NitroVerifyPurchaseWithProviderProps(Variant_NullType_NitroVerifyPurchaseWithIapkitProps variant_NullType_NitroVerifyPurchaseWithIapkitProps, PurchaseVerificationProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.iapkit = variant_NullType_NitroVerifyPurchaseWithIapkitProps;
        this.provider = provider;
    }

    public final Variant_NullType_NitroVerifyPurchaseWithIapkitProps getIapkit() {
        return this.iapkit;
    }

    public final PurchaseVerificationProvider getProvider() {
        return this.provider;
    }

    /* compiled from: NitroVerifyPurchaseWithProviderProps.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0003¨\u0006\n"}, d2 = {"Lcom/margelo/nitro/iap/NitroVerifyPurchaseWithProviderProps$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/NitroVerifyPurchaseWithProviderProps;", "iapkit", "Lcom/margelo/nitro/iap/Variant_NullType_NitroVerifyPurchaseWithIapkitProps;", "provider", "Lcom/margelo/nitro/iap/PurchaseVerificationProvider;", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroVerifyPurchaseWithProviderProps fromCpp(Variant_NullType_NitroVerifyPurchaseWithIapkitProps iapkit, PurchaseVerificationProvider provider) {
            return new NitroVerifyPurchaseWithProviderProps(iapkit, provider);
        }
    }
}
