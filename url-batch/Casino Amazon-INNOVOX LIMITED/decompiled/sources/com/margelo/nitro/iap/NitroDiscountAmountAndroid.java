package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroDiscountAmountAndroid.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/margelo/nitro/iap/NitroDiscountAmountAndroid;", "", "discountAmountMicros", "", "formattedDiscountAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDiscountAmountMicros", "()Ljava/lang/String;", "getFormattedDiscountAmount", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NitroDiscountAmountAndroid {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String discountAmountMicros;
    private final String formattedDiscountAmount;

    public static /* synthetic */ NitroDiscountAmountAndroid copy$default(NitroDiscountAmountAndroid nitroDiscountAmountAndroid, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nitroDiscountAmountAndroid.discountAmountMicros;
        }
        if ((i & 2) != 0) {
            str2 = nitroDiscountAmountAndroid.formattedDiscountAmount;
        }
        return nitroDiscountAmountAndroid.copy(str, str2);
    }

    @JvmStatic
    private static final NitroDiscountAmountAndroid fromCpp(String str, String str2) {
        return INSTANCE.fromCpp(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDiscountAmountMicros() {
        return this.discountAmountMicros;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFormattedDiscountAmount() {
        return this.formattedDiscountAmount;
    }

    public final NitroDiscountAmountAndroid copy(String discountAmountMicros, String formattedDiscountAmount) {
        Intrinsics.checkNotNullParameter(discountAmountMicros, "discountAmountMicros");
        Intrinsics.checkNotNullParameter(formattedDiscountAmount, "formattedDiscountAmount");
        return new NitroDiscountAmountAndroid(discountAmountMicros, formattedDiscountAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroDiscountAmountAndroid)) {
            return false;
        }
        NitroDiscountAmountAndroid nitroDiscountAmountAndroid = (NitroDiscountAmountAndroid) other;
        return Intrinsics.areEqual(this.discountAmountMicros, nitroDiscountAmountAndroid.discountAmountMicros) && Intrinsics.areEqual(this.formattedDiscountAmount, nitroDiscountAmountAndroid.formattedDiscountAmount);
    }

    public int hashCode() {
        return (this.discountAmountMicros.hashCode() * 31) + this.formattedDiscountAmount.hashCode();
    }

    public String toString() {
        return "NitroDiscountAmountAndroid(discountAmountMicros=" + this.discountAmountMicros + ", formattedDiscountAmount=" + this.formattedDiscountAmount + ")";
    }

    public NitroDiscountAmountAndroid(String discountAmountMicros, String formattedDiscountAmount) {
        Intrinsics.checkNotNullParameter(discountAmountMicros, "discountAmountMicros");
        Intrinsics.checkNotNullParameter(formattedDiscountAmount, "formattedDiscountAmount");
        this.discountAmountMicros = discountAmountMicros;
        this.formattedDiscountAmount = formattedDiscountAmount;
    }

    public final String getDiscountAmountMicros() {
        return this.discountAmountMicros;
    }

    public final String getFormattedDiscountAmount() {
        return this.formattedDiscountAmount;
    }

    /* compiled from: NitroDiscountAmountAndroid.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0003¨\u0006\t"}, d2 = {"Lcom/margelo/nitro/iap/NitroDiscountAmountAndroid$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/NitroDiscountAmountAndroid;", "discountAmountMicros", "", "formattedDiscountAmount", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroDiscountAmountAndroid fromCpp(String discountAmountMicros, String formattedDiscountAmount) {
            return new NitroDiscountAmountAndroid(discountAmountMicros, formattedDiscountAmount);
        }
    }
}
