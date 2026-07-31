package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroVerifyPurchaseWithIapkitGoogleProps.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/margelo/nitro/iap/NitroVerifyPurchaseWithIapkitGoogleProps;", "", "purchaseToken", "", "<init>", "(Ljava/lang/String;)V", "getPurchaseToken", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NitroVerifyPurchaseWithIapkitGoogleProps {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String purchaseToken;

    public static /* synthetic */ NitroVerifyPurchaseWithIapkitGoogleProps copy$default(NitroVerifyPurchaseWithIapkitGoogleProps nitroVerifyPurchaseWithIapkitGoogleProps, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nitroVerifyPurchaseWithIapkitGoogleProps.purchaseToken;
        }
        return nitroVerifyPurchaseWithIapkitGoogleProps.copy(str);
    }

    @JvmStatic
    private static final NitroVerifyPurchaseWithIapkitGoogleProps fromCpp(String str) {
        return INSTANCE.fromCpp(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final NitroVerifyPurchaseWithIapkitGoogleProps copy(String purchaseToken) {
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        return new NitroVerifyPurchaseWithIapkitGoogleProps(purchaseToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NitroVerifyPurchaseWithIapkitGoogleProps) && Intrinsics.areEqual(this.purchaseToken, ((NitroVerifyPurchaseWithIapkitGoogleProps) other).purchaseToken);
    }

    public int hashCode() {
        return this.purchaseToken.hashCode();
    }

    public String toString() {
        return "NitroVerifyPurchaseWithIapkitGoogleProps(purchaseToken=" + this.purchaseToken + ")";
    }

    public NitroVerifyPurchaseWithIapkitGoogleProps(String purchaseToken) {
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        this.purchaseToken = purchaseToken;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* compiled from: NitroVerifyPurchaseWithIapkitGoogleProps.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¨\u0006\b"}, d2 = {"Lcom/margelo/nitro/iap/NitroVerifyPurchaseWithIapkitGoogleProps$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/NitroVerifyPurchaseWithIapkitGoogleProps;", "purchaseToken", "", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroVerifyPurchaseWithIapkitGoogleProps fromCpp(String purchaseToken) {
            return new NitroVerifyPurchaseWithIapkitGoogleProps(purchaseToken);
        }
    }
}
