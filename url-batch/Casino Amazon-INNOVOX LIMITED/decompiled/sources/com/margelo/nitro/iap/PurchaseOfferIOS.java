package com.margelo.nitro.iap;

import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PurchaseOfferIOS.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/margelo/nitro/iap/PurchaseOfferIOS;", "", "id", "", "paymentMode", WebViewManager.EVENT_TYPE_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getPaymentMode", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PurchaseOfferIOS {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String id;
    private final String paymentMode;
    private final String type;

    public static /* synthetic */ PurchaseOfferIOS copy$default(PurchaseOfferIOS purchaseOfferIOS, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = purchaseOfferIOS.id;
        }
        if ((i & 2) != 0) {
            str2 = purchaseOfferIOS.paymentMode;
        }
        if ((i & 4) != 0) {
            str3 = purchaseOfferIOS.type;
        }
        return purchaseOfferIOS.copy(str, str2, str3);
    }

    @JvmStatic
    private static final PurchaseOfferIOS fromCpp(String str, String str2, String str3) {
        return INSTANCE.fromCpp(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPaymentMode() {
        return this.paymentMode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final PurchaseOfferIOS copy(String id, String paymentMode, String type) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(paymentMode, "paymentMode");
        Intrinsics.checkNotNullParameter(type, "type");
        return new PurchaseOfferIOS(id, paymentMode, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseOfferIOS)) {
            return false;
        }
        PurchaseOfferIOS purchaseOfferIOS = (PurchaseOfferIOS) other;
        return Intrinsics.areEqual(this.id, purchaseOfferIOS.id) && Intrinsics.areEqual(this.paymentMode, purchaseOfferIOS.paymentMode) && Intrinsics.areEqual(this.type, purchaseOfferIOS.type);
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.paymentMode.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "PurchaseOfferIOS(id=" + this.id + ", paymentMode=" + this.paymentMode + ", type=" + this.type + ")";
    }

    public PurchaseOfferIOS(String id, String paymentMode, String type) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(paymentMode, "paymentMode");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id;
        this.paymentMode = paymentMode;
        this.type = type;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPaymentMode() {
        return this.paymentMode;
    }

    public final String getType() {
        return this.type;
    }

    /* compiled from: PurchaseOfferIOS.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0003¨\u0006\n"}, d2 = {"Lcom/margelo/nitro/iap/PurchaseOfferIOS$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/PurchaseOfferIOS;", "id", "", "paymentMode", WebViewManager.EVENT_TYPE_KEY, "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final PurchaseOfferIOS fromCpp(String id, String paymentMode, String type) {
            return new PurchaseOfferIOS(id, paymentMode, type);
        }
    }
}
