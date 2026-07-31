package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroVerifyPurchaseWithIapkitProps.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/margelo/nitro/iap/NitroVerifyPurchaseWithIapkitProps;", "", "apiKey", "Lcom/margelo/nitro/iap/Variant_NullType_String;", "apple", "Lcom/margelo/nitro/iap/Variant_NullType_NitroVerifyPurchaseWithIapkitAppleProps;", "google", "Lcom/margelo/nitro/iap/Variant_NullType_NitroVerifyPurchaseWithIapkitGoogleProps;", "<init>", "(Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_NitroVerifyPurchaseWithIapkitAppleProps;Lcom/margelo/nitro/iap/Variant_NullType_NitroVerifyPurchaseWithIapkitGoogleProps;)V", "getApiKey", "()Lcom/margelo/nitro/iap/Variant_NullType_String;", "getApple", "()Lcom/margelo/nitro/iap/Variant_NullType_NitroVerifyPurchaseWithIapkitAppleProps;", "getGoogle", "()Lcom/margelo/nitro/iap/Variant_NullType_NitroVerifyPurchaseWithIapkitGoogleProps;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NitroVerifyPurchaseWithIapkitProps {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Variant_NullType_String apiKey;
    private final Variant_NullType_NitroVerifyPurchaseWithIapkitAppleProps apple;
    private final Variant_NullType_NitroVerifyPurchaseWithIapkitGoogleProps google;

    public static /* synthetic */ NitroVerifyPurchaseWithIapkitProps copy$default(NitroVerifyPurchaseWithIapkitProps nitroVerifyPurchaseWithIapkitProps, Variant_NullType_String variant_NullType_String, Variant_NullType_NitroVerifyPurchaseWithIapkitAppleProps variant_NullType_NitroVerifyPurchaseWithIapkitAppleProps, Variant_NullType_NitroVerifyPurchaseWithIapkitGoogleProps variant_NullType_NitroVerifyPurchaseWithIapkitGoogleProps, int i, Object obj) {
        if ((i & 1) != 0) {
            variant_NullType_String = nitroVerifyPurchaseWithIapkitProps.apiKey;
        }
        if ((i & 2) != 0) {
            variant_NullType_NitroVerifyPurchaseWithIapkitAppleProps = nitroVerifyPurchaseWithIapkitProps.apple;
        }
        if ((i & 4) != 0) {
            variant_NullType_NitroVerifyPurchaseWithIapkitGoogleProps = nitroVerifyPurchaseWithIapkitProps.google;
        }
        return nitroVerifyPurchaseWithIapkitProps.copy(variant_NullType_String, variant_NullType_NitroVerifyPurchaseWithIapkitAppleProps, variant_NullType_NitroVerifyPurchaseWithIapkitGoogleProps);
    }

    @JvmStatic
    private static final NitroVerifyPurchaseWithIapkitProps fromCpp(Variant_NullType_String variant_NullType_String, Variant_NullType_NitroVerifyPurchaseWithIapkitAppleProps variant_NullType_NitroVerifyPurchaseWithIapkitAppleProps, Variant_NullType_NitroVerifyPurchaseWithIapkitGoogleProps variant_NullType_NitroVerifyPurchaseWithIapkitGoogleProps) {
        return INSTANCE.fromCpp(variant_NullType_String, variant_NullType_NitroVerifyPurchaseWithIapkitAppleProps, variant_NullType_NitroVerifyPurchaseWithIapkitGoogleProps);
    }

    /* renamed from: component1, reason: from getter */
    public final Variant_NullType_String getApiKey() {
        return this.apiKey;
    }

    /* renamed from: component2, reason: from getter */
    public final Variant_NullType_NitroVerifyPurchaseWithIapkitAppleProps getApple() {
        return this.apple;
    }

    /* renamed from: component3, reason: from getter */
    public final Variant_NullType_NitroVerifyPurchaseWithIapkitGoogleProps getGoogle() {
        return this.google;
    }

    public final NitroVerifyPurchaseWithIapkitProps copy(Variant_NullType_String apiKey, Variant_NullType_NitroVerifyPurchaseWithIapkitAppleProps apple, Variant_NullType_NitroVerifyPurchaseWithIapkitGoogleProps google) {
        return new NitroVerifyPurchaseWithIapkitProps(apiKey, apple, google);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroVerifyPurchaseWithIapkitProps)) {
            return false;
        }
        NitroVerifyPurchaseWithIapkitProps nitroVerifyPurchaseWithIapkitProps = (NitroVerifyPurchaseWithIapkitProps) other;
        return Intrinsics.areEqual(this.apiKey, nitroVerifyPurchaseWithIapkitProps.apiKey) && Intrinsics.areEqual(this.apple, nitroVerifyPurchaseWithIapkitProps.apple) && Intrinsics.areEqual(this.google, nitroVerifyPurchaseWithIapkitProps.google);
    }

    public int hashCode() {
        Variant_NullType_String variant_NullType_String = this.apiKey;
        int hashCode = (variant_NullType_String == null ? 0 : variant_NullType_String.hashCode()) * 31;
        Variant_NullType_NitroVerifyPurchaseWithIapkitAppleProps variant_NullType_NitroVerifyPurchaseWithIapkitAppleProps = this.apple;
        int hashCode2 = (hashCode + (variant_NullType_NitroVerifyPurchaseWithIapkitAppleProps == null ? 0 : variant_NullType_NitroVerifyPurchaseWithIapkitAppleProps.hashCode())) * 31;
        Variant_NullType_NitroVerifyPurchaseWithIapkitGoogleProps variant_NullType_NitroVerifyPurchaseWithIapkitGoogleProps = this.google;
        return hashCode2 + (variant_NullType_NitroVerifyPurchaseWithIapkitGoogleProps != null ? variant_NullType_NitroVerifyPurchaseWithIapkitGoogleProps.hashCode() : 0);
    }

    public String toString() {
        return "NitroVerifyPurchaseWithIapkitProps(apiKey=" + this.apiKey + ", apple=" + this.apple + ", google=" + this.google + ")";
    }

    public NitroVerifyPurchaseWithIapkitProps(Variant_NullType_String variant_NullType_String, Variant_NullType_NitroVerifyPurchaseWithIapkitAppleProps variant_NullType_NitroVerifyPurchaseWithIapkitAppleProps, Variant_NullType_NitroVerifyPurchaseWithIapkitGoogleProps variant_NullType_NitroVerifyPurchaseWithIapkitGoogleProps) {
        this.apiKey = variant_NullType_String;
        this.apple = variant_NullType_NitroVerifyPurchaseWithIapkitAppleProps;
        this.google = variant_NullType_NitroVerifyPurchaseWithIapkitGoogleProps;
    }

    public final Variant_NullType_String getApiKey() {
        return this.apiKey;
    }

    public final Variant_NullType_NitroVerifyPurchaseWithIapkitAppleProps getApple() {
        return this.apple;
    }

    public final Variant_NullType_NitroVerifyPurchaseWithIapkitGoogleProps getGoogle() {
        return this.google;
    }

    /* compiled from: NitroVerifyPurchaseWithIapkitProps.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0003¨\u0006\f"}, d2 = {"Lcom/margelo/nitro/iap/NitroVerifyPurchaseWithIapkitProps$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/NitroVerifyPurchaseWithIapkitProps;", "apiKey", "Lcom/margelo/nitro/iap/Variant_NullType_String;", "apple", "Lcom/margelo/nitro/iap/Variant_NullType_NitroVerifyPurchaseWithIapkitAppleProps;", "google", "Lcom/margelo/nitro/iap/Variant_NullType_NitroVerifyPurchaseWithIapkitGoogleProps;", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroVerifyPurchaseWithIapkitProps fromCpp(Variant_NullType_String apiKey, Variant_NullType_NitroVerifyPurchaseWithIapkitAppleProps apple, Variant_NullType_NitroVerifyPurchaseWithIapkitGoogleProps google) {
            return new NitroVerifyPurchaseWithIapkitProps(apiKey, apple, google);
        }
    }
}
