package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidSubscriptionOfferInput.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/margelo/nitro/iap/AndroidSubscriptionOfferInput;", "", "offerToken", "", "sku", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getOfferToken", "()Ljava/lang/String;", "getSku", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AndroidSubscriptionOfferInput {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String offerToken;
    private final String sku;

    public static /* synthetic */ AndroidSubscriptionOfferInput copy$default(AndroidSubscriptionOfferInput androidSubscriptionOfferInput, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = androidSubscriptionOfferInput.offerToken;
        }
        if ((i & 2) != 0) {
            str2 = androidSubscriptionOfferInput.sku;
        }
        return androidSubscriptionOfferInput.copy(str, str2);
    }

    @JvmStatic
    private static final AndroidSubscriptionOfferInput fromCpp(String str, String str2) {
        return INSTANCE.fromCpp(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOfferToken() {
        return this.offerToken;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    public final AndroidSubscriptionOfferInput copy(String offerToken, String sku) {
        Intrinsics.checkNotNullParameter(offerToken, "offerToken");
        Intrinsics.checkNotNullParameter(sku, "sku");
        return new AndroidSubscriptionOfferInput(offerToken, sku);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AndroidSubscriptionOfferInput)) {
            return false;
        }
        AndroidSubscriptionOfferInput androidSubscriptionOfferInput = (AndroidSubscriptionOfferInput) other;
        return Intrinsics.areEqual(this.offerToken, androidSubscriptionOfferInput.offerToken) && Intrinsics.areEqual(this.sku, androidSubscriptionOfferInput.sku);
    }

    public int hashCode() {
        return (this.offerToken.hashCode() * 31) + this.sku.hashCode();
    }

    public String toString() {
        return "AndroidSubscriptionOfferInput(offerToken=" + this.offerToken + ", sku=" + this.sku + ")";
    }

    public AndroidSubscriptionOfferInput(String offerToken, String sku) {
        Intrinsics.checkNotNullParameter(offerToken, "offerToken");
        Intrinsics.checkNotNullParameter(sku, "sku");
        this.offerToken = offerToken;
        this.sku = sku;
    }

    public final String getOfferToken() {
        return this.offerToken;
    }

    public final String getSku() {
        return this.sku;
    }

    /* compiled from: AndroidSubscriptionOfferInput.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0003¨\u0006\t"}, d2 = {"Lcom/margelo/nitro/iap/AndroidSubscriptionOfferInput$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/AndroidSubscriptionOfferInput;", "offerToken", "", "sku", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final AndroidSubscriptionOfferInput fromCpp(String offerToken, String sku) {
            return new AndroidSubscriptionOfferInput(offerToken, sku);
        }
    }
}
