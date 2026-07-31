package com.margelo.nitro.iap;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserChoiceBillingDetails.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ(\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/margelo/nitro/iap/UserChoiceBillingDetails;", "", "externalTransactionToken", "", "products", "", "<init>", "(Ljava/lang/String;[Ljava/lang/String;)V", "getExternalTransactionToken", "()Ljava/lang/String;", "getProducts", "()[Ljava/lang/String;", "[Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/String;[Ljava/lang/String;)Lcom/margelo/nitro/iap/UserChoiceBillingDetails;", "equals", "", "other", "hashCode", "", "toString", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserChoiceBillingDetails {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String externalTransactionToken;
    private final String[] products;

    public static /* synthetic */ UserChoiceBillingDetails copy$default(UserChoiceBillingDetails userChoiceBillingDetails, String str, String[] strArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userChoiceBillingDetails.externalTransactionToken;
        }
        if ((i & 2) != 0) {
            strArr = userChoiceBillingDetails.products;
        }
        return userChoiceBillingDetails.copy(str, strArr);
    }

    @JvmStatic
    private static final UserChoiceBillingDetails fromCpp(String str, String[] strArr) {
        return INSTANCE.fromCpp(str, strArr);
    }

    /* renamed from: component1, reason: from getter */
    public final String getExternalTransactionToken() {
        return this.externalTransactionToken;
    }

    /* renamed from: component2, reason: from getter */
    public final String[] getProducts() {
        return this.products;
    }

    public final UserChoiceBillingDetails copy(String externalTransactionToken, String[] products) {
        Intrinsics.checkNotNullParameter(externalTransactionToken, "externalTransactionToken");
        Intrinsics.checkNotNullParameter(products, "products");
        return new UserChoiceBillingDetails(externalTransactionToken, products);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserChoiceBillingDetails)) {
            return false;
        }
        UserChoiceBillingDetails userChoiceBillingDetails = (UserChoiceBillingDetails) other;
        return Intrinsics.areEqual(this.externalTransactionToken, userChoiceBillingDetails.externalTransactionToken) && Intrinsics.areEqual(this.products, userChoiceBillingDetails.products);
    }

    public int hashCode() {
        return (this.externalTransactionToken.hashCode() * 31) + Arrays.hashCode(this.products);
    }

    public String toString() {
        return "UserChoiceBillingDetails(externalTransactionToken=" + this.externalTransactionToken + ", products=" + Arrays.toString(this.products) + ")";
    }

    public UserChoiceBillingDetails(String externalTransactionToken, String[] products) {
        Intrinsics.checkNotNullParameter(externalTransactionToken, "externalTransactionToken");
        Intrinsics.checkNotNullParameter(products, "products");
        this.externalTransactionToken = externalTransactionToken;
        this.products = products;
    }

    public final String getExternalTransactionToken() {
        return this.externalTransactionToken;
    }

    public final String[] getProducts() {
        return this.products;
    }

    /* compiled from: UserChoiceBillingDetails.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/margelo/nitro/iap/UserChoiceBillingDetails$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/UserChoiceBillingDetails;", "externalTransactionToken", "", "products", "", "(Ljava/lang/String;[Ljava/lang/String;)Lcom/margelo/nitro/iap/UserChoiceBillingDetails;", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final UserChoiceBillingDetails fromCpp(String externalTransactionToken, String[] products) {
            return new UserChoiceBillingDetails(externalTransactionToken, products);
        }
    }
}
