package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroReceiptValidationResultIOS.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/margelo/nitro/iap/NitroReceiptValidationResultIOS;", "", "isValid", "", "receiptData", "", "jwsRepresentation", "latestTransaction", "Lcom/margelo/nitro/iap/Variant_NullType_NitroPurchase;", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lcom/margelo/nitro/iap/Variant_NullType_NitroPurchase;)V", "()Z", "getReceiptData", "()Ljava/lang/String;", "getJwsRepresentation", "getLatestTransaction", "()Lcom/margelo/nitro/iap/Variant_NullType_NitroPurchase;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NitroReceiptValidationResultIOS {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isValid;
    private final String jwsRepresentation;
    private final Variant_NullType_NitroPurchase latestTransaction;
    private final String receiptData;

    public static /* synthetic */ NitroReceiptValidationResultIOS copy$default(NitroReceiptValidationResultIOS nitroReceiptValidationResultIOS, boolean z, String str, String str2, Variant_NullType_NitroPurchase variant_NullType_NitroPurchase, int i, Object obj) {
        if ((i & 1) != 0) {
            z = nitroReceiptValidationResultIOS.isValid;
        }
        if ((i & 2) != 0) {
            str = nitroReceiptValidationResultIOS.receiptData;
        }
        if ((i & 4) != 0) {
            str2 = nitroReceiptValidationResultIOS.jwsRepresentation;
        }
        if ((i & 8) != 0) {
            variant_NullType_NitroPurchase = nitroReceiptValidationResultIOS.latestTransaction;
        }
        return nitroReceiptValidationResultIOS.copy(z, str, str2, variant_NullType_NitroPurchase);
    }

    @JvmStatic
    private static final NitroReceiptValidationResultIOS fromCpp(boolean z, String str, String str2, Variant_NullType_NitroPurchase variant_NullType_NitroPurchase) {
        return INSTANCE.fromCpp(z, str, str2, variant_NullType_NitroPurchase);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getReceiptData() {
        return this.receiptData;
    }

    /* renamed from: component3, reason: from getter */
    public final String getJwsRepresentation() {
        return this.jwsRepresentation;
    }

    /* renamed from: component4, reason: from getter */
    public final Variant_NullType_NitroPurchase getLatestTransaction() {
        return this.latestTransaction;
    }

    public final NitroReceiptValidationResultIOS copy(boolean isValid, String receiptData, String jwsRepresentation, Variant_NullType_NitroPurchase latestTransaction) {
        Intrinsics.checkNotNullParameter(receiptData, "receiptData");
        Intrinsics.checkNotNullParameter(jwsRepresentation, "jwsRepresentation");
        return new NitroReceiptValidationResultIOS(isValid, receiptData, jwsRepresentation, latestTransaction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroReceiptValidationResultIOS)) {
            return false;
        }
        NitroReceiptValidationResultIOS nitroReceiptValidationResultIOS = (NitroReceiptValidationResultIOS) other;
        return this.isValid == nitroReceiptValidationResultIOS.isValid && Intrinsics.areEqual(this.receiptData, nitroReceiptValidationResultIOS.receiptData) && Intrinsics.areEqual(this.jwsRepresentation, nitroReceiptValidationResultIOS.jwsRepresentation) && Intrinsics.areEqual(this.latestTransaction, nitroReceiptValidationResultIOS.latestTransaction);
    }

    public int hashCode() {
        int hashCode = ((((Boolean.hashCode(this.isValid) * 31) + this.receiptData.hashCode()) * 31) + this.jwsRepresentation.hashCode()) * 31;
        Variant_NullType_NitroPurchase variant_NullType_NitroPurchase = this.latestTransaction;
        return hashCode + (variant_NullType_NitroPurchase == null ? 0 : variant_NullType_NitroPurchase.hashCode());
    }

    public String toString() {
        return "NitroReceiptValidationResultIOS(isValid=" + this.isValid + ", receiptData=" + this.receiptData + ", jwsRepresentation=" + this.jwsRepresentation + ", latestTransaction=" + this.latestTransaction + ")";
    }

    public NitroReceiptValidationResultIOS(boolean z, String receiptData, String jwsRepresentation, Variant_NullType_NitroPurchase variant_NullType_NitroPurchase) {
        Intrinsics.checkNotNullParameter(receiptData, "receiptData");
        Intrinsics.checkNotNullParameter(jwsRepresentation, "jwsRepresentation");
        this.isValid = z;
        this.receiptData = receiptData;
        this.jwsRepresentation = jwsRepresentation;
        this.latestTransaction = variant_NullType_NitroPurchase;
    }

    public final boolean isValid() {
        return this.isValid;
    }

    public final String getReceiptData() {
        return this.receiptData;
    }

    public final String getJwsRepresentation() {
        return this.jwsRepresentation;
    }

    public final Variant_NullType_NitroPurchase getLatestTransaction() {
        return this.latestTransaction;
    }

    /* compiled from: NitroReceiptValidationResultIOS.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0003¨\u0006\r"}, d2 = {"Lcom/margelo/nitro/iap/NitroReceiptValidationResultIOS$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/NitroReceiptValidationResultIOS;", "isValid", "", "receiptData", "", "jwsRepresentation", "latestTransaction", "Lcom/margelo/nitro/iap/Variant_NullType_NitroPurchase;", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroReceiptValidationResultIOS fromCpp(boolean isValid, String receiptData, String jwsRepresentation, Variant_NullType_NitroPurchase latestTransaction) {
            return new NitroReceiptValidationResultIOS(isValid, receiptData, jwsRepresentation, latestTransaction);
        }
    }
}
