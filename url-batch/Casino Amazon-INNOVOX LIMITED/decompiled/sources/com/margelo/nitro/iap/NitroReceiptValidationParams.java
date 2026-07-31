package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroReceiptValidationParams.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/margelo/nitro/iap/NitroReceiptValidationParams;", "", "apple", "Lcom/margelo/nitro/iap/Variant_NullType_NitroReceiptValidationAppleOptions;", "google", "Lcom/margelo/nitro/iap/Variant_NullType_NitroReceiptValidationGoogleOptions;", "horizon", "Lcom/margelo/nitro/iap/Variant_NullType_NitroReceiptValidationHorizonOptions;", "<init>", "(Lcom/margelo/nitro/iap/Variant_NullType_NitroReceiptValidationAppleOptions;Lcom/margelo/nitro/iap/Variant_NullType_NitroReceiptValidationGoogleOptions;Lcom/margelo/nitro/iap/Variant_NullType_NitroReceiptValidationHorizonOptions;)V", "getApple", "()Lcom/margelo/nitro/iap/Variant_NullType_NitroReceiptValidationAppleOptions;", "getGoogle", "()Lcom/margelo/nitro/iap/Variant_NullType_NitroReceiptValidationGoogleOptions;", "getHorizon", "()Lcom/margelo/nitro/iap/Variant_NullType_NitroReceiptValidationHorizonOptions;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NitroReceiptValidationParams {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Variant_NullType_NitroReceiptValidationAppleOptions apple;
    private final Variant_NullType_NitroReceiptValidationGoogleOptions google;
    private final Variant_NullType_NitroReceiptValidationHorizonOptions horizon;

    public static /* synthetic */ NitroReceiptValidationParams copy$default(NitroReceiptValidationParams nitroReceiptValidationParams, Variant_NullType_NitroReceiptValidationAppleOptions variant_NullType_NitroReceiptValidationAppleOptions, Variant_NullType_NitroReceiptValidationGoogleOptions variant_NullType_NitroReceiptValidationGoogleOptions, Variant_NullType_NitroReceiptValidationHorizonOptions variant_NullType_NitroReceiptValidationHorizonOptions, int i, Object obj) {
        if ((i & 1) != 0) {
            variant_NullType_NitroReceiptValidationAppleOptions = nitroReceiptValidationParams.apple;
        }
        if ((i & 2) != 0) {
            variant_NullType_NitroReceiptValidationGoogleOptions = nitroReceiptValidationParams.google;
        }
        if ((i & 4) != 0) {
            variant_NullType_NitroReceiptValidationHorizonOptions = nitroReceiptValidationParams.horizon;
        }
        return nitroReceiptValidationParams.copy(variant_NullType_NitroReceiptValidationAppleOptions, variant_NullType_NitroReceiptValidationGoogleOptions, variant_NullType_NitroReceiptValidationHorizonOptions);
    }

    @JvmStatic
    private static final NitroReceiptValidationParams fromCpp(Variant_NullType_NitroReceiptValidationAppleOptions variant_NullType_NitroReceiptValidationAppleOptions, Variant_NullType_NitroReceiptValidationGoogleOptions variant_NullType_NitroReceiptValidationGoogleOptions, Variant_NullType_NitroReceiptValidationHorizonOptions variant_NullType_NitroReceiptValidationHorizonOptions) {
        return INSTANCE.fromCpp(variant_NullType_NitroReceiptValidationAppleOptions, variant_NullType_NitroReceiptValidationGoogleOptions, variant_NullType_NitroReceiptValidationHorizonOptions);
    }

    /* renamed from: component1, reason: from getter */
    public final Variant_NullType_NitroReceiptValidationAppleOptions getApple() {
        return this.apple;
    }

    /* renamed from: component2, reason: from getter */
    public final Variant_NullType_NitroReceiptValidationGoogleOptions getGoogle() {
        return this.google;
    }

    /* renamed from: component3, reason: from getter */
    public final Variant_NullType_NitroReceiptValidationHorizonOptions getHorizon() {
        return this.horizon;
    }

    public final NitroReceiptValidationParams copy(Variant_NullType_NitroReceiptValidationAppleOptions apple, Variant_NullType_NitroReceiptValidationGoogleOptions google, Variant_NullType_NitroReceiptValidationHorizonOptions horizon) {
        return new NitroReceiptValidationParams(apple, google, horizon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroReceiptValidationParams)) {
            return false;
        }
        NitroReceiptValidationParams nitroReceiptValidationParams = (NitroReceiptValidationParams) other;
        return Intrinsics.areEqual(this.apple, nitroReceiptValidationParams.apple) && Intrinsics.areEqual(this.google, nitroReceiptValidationParams.google) && Intrinsics.areEqual(this.horizon, nitroReceiptValidationParams.horizon);
    }

    public int hashCode() {
        Variant_NullType_NitroReceiptValidationAppleOptions variant_NullType_NitroReceiptValidationAppleOptions = this.apple;
        int hashCode = (variant_NullType_NitroReceiptValidationAppleOptions == null ? 0 : variant_NullType_NitroReceiptValidationAppleOptions.hashCode()) * 31;
        Variant_NullType_NitroReceiptValidationGoogleOptions variant_NullType_NitroReceiptValidationGoogleOptions = this.google;
        int hashCode2 = (hashCode + (variant_NullType_NitroReceiptValidationGoogleOptions == null ? 0 : variant_NullType_NitroReceiptValidationGoogleOptions.hashCode())) * 31;
        Variant_NullType_NitroReceiptValidationHorizonOptions variant_NullType_NitroReceiptValidationHorizonOptions = this.horizon;
        return hashCode2 + (variant_NullType_NitroReceiptValidationHorizonOptions != null ? variant_NullType_NitroReceiptValidationHorizonOptions.hashCode() : 0);
    }

    public String toString() {
        return "NitroReceiptValidationParams(apple=" + this.apple + ", google=" + this.google + ", horizon=" + this.horizon + ")";
    }

    public NitroReceiptValidationParams(Variant_NullType_NitroReceiptValidationAppleOptions variant_NullType_NitroReceiptValidationAppleOptions, Variant_NullType_NitroReceiptValidationGoogleOptions variant_NullType_NitroReceiptValidationGoogleOptions, Variant_NullType_NitroReceiptValidationHorizonOptions variant_NullType_NitroReceiptValidationHorizonOptions) {
        this.apple = variant_NullType_NitroReceiptValidationAppleOptions;
        this.google = variant_NullType_NitroReceiptValidationGoogleOptions;
        this.horizon = variant_NullType_NitroReceiptValidationHorizonOptions;
    }

    public final Variant_NullType_NitroReceiptValidationAppleOptions getApple() {
        return this.apple;
    }

    public final Variant_NullType_NitroReceiptValidationGoogleOptions getGoogle() {
        return this.google;
    }

    public final Variant_NullType_NitroReceiptValidationHorizonOptions getHorizon() {
        return this.horizon;
    }

    /* compiled from: NitroReceiptValidationParams.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0003¨\u0006\f"}, d2 = {"Lcom/margelo/nitro/iap/NitroReceiptValidationParams$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/NitroReceiptValidationParams;", "apple", "Lcom/margelo/nitro/iap/Variant_NullType_NitroReceiptValidationAppleOptions;", "google", "Lcom/margelo/nitro/iap/Variant_NullType_NitroReceiptValidationGoogleOptions;", "horizon", "Lcom/margelo/nitro/iap/Variant_NullType_NitroReceiptValidationHorizonOptions;", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroReceiptValidationParams fromCpp(Variant_NullType_NitroReceiptValidationAppleOptions apple, Variant_NullType_NitroReceiptValidationGoogleOptions google, Variant_NullType_NitroReceiptValidationHorizonOptions horizon) {
            return new NitroReceiptValidationParams(apple, google, horizon);
        }
    }
}
