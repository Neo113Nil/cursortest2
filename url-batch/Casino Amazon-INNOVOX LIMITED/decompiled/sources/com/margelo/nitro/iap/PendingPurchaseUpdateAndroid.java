package com.margelo.nitro.iap;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PendingPurchaseUpdateAndroid.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J(\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/margelo/nitro/iap/PendingPurchaseUpdateAndroid;", "", "products", "", "", "purchaseToken", "<init>", "([Ljava/lang/String;Ljava/lang/String;)V", "getProducts", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getPurchaseToken", "()Ljava/lang/String;", "component1", "component2", "copy", "([Ljava/lang/String;Ljava/lang/String;)Lcom/margelo/nitro/iap/PendingPurchaseUpdateAndroid;", "equals", "", "other", "hashCode", "", "toString", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PendingPurchaseUpdateAndroid {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String[] products;
    private final String purchaseToken;

    public static /* synthetic */ PendingPurchaseUpdateAndroid copy$default(PendingPurchaseUpdateAndroid pendingPurchaseUpdateAndroid, String[] strArr, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            strArr = pendingPurchaseUpdateAndroid.products;
        }
        if ((i & 2) != 0) {
            str = pendingPurchaseUpdateAndroid.purchaseToken;
        }
        return pendingPurchaseUpdateAndroid.copy(strArr, str);
    }

    @JvmStatic
    private static final PendingPurchaseUpdateAndroid fromCpp(String[] strArr, String str) {
        return INSTANCE.fromCpp(strArr, str);
    }

    /* renamed from: component1, reason: from getter */
    public final String[] getProducts() {
        return this.products;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final PendingPurchaseUpdateAndroid copy(String[] products, String purchaseToken) {
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        return new PendingPurchaseUpdateAndroid(products, purchaseToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PendingPurchaseUpdateAndroid)) {
            return false;
        }
        PendingPurchaseUpdateAndroid pendingPurchaseUpdateAndroid = (PendingPurchaseUpdateAndroid) other;
        return Intrinsics.areEqual(this.products, pendingPurchaseUpdateAndroid.products) && Intrinsics.areEqual(this.purchaseToken, pendingPurchaseUpdateAndroid.purchaseToken);
    }

    public int hashCode() {
        return (Arrays.hashCode(this.products) * 31) + this.purchaseToken.hashCode();
    }

    public String toString() {
        return "PendingPurchaseUpdateAndroid(products=" + Arrays.toString(this.products) + ", purchaseToken=" + this.purchaseToken + ")";
    }

    public PendingPurchaseUpdateAndroid(String[] products, String purchaseToken) {
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        this.products = products;
        this.purchaseToken = purchaseToken;
    }

    public final String[] getProducts() {
        return this.products;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* compiled from: PendingPurchaseUpdateAndroid.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/margelo/nitro/iap/PendingPurchaseUpdateAndroid$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/PendingPurchaseUpdateAndroid;", "products", "", "", "purchaseToken", "([Ljava/lang/String;Ljava/lang/String;)Lcom/margelo/nitro/iap/PendingPurchaseUpdateAndroid;", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final PendingPurchaseUpdateAndroid fromCpp(String[] products, String purchaseToken) {
            return new PendingPurchaseUpdateAndroid(products, purchaseToken);
        }
    }
}
