package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroReceiptValidationAppleOptions.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/margelo/nitro/iap/NitroReceiptValidationAppleOptions;", "", "sku", "", "<init>", "(Ljava/lang/String;)V", "getSku", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NitroReceiptValidationAppleOptions {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String sku;

    public static /* synthetic */ NitroReceiptValidationAppleOptions copy$default(NitroReceiptValidationAppleOptions nitroReceiptValidationAppleOptions, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nitroReceiptValidationAppleOptions.sku;
        }
        return nitroReceiptValidationAppleOptions.copy(str);
    }

    @JvmStatic
    private static final NitroReceiptValidationAppleOptions fromCpp(String str) {
        return INSTANCE.fromCpp(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    public final NitroReceiptValidationAppleOptions copy(String sku) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        return new NitroReceiptValidationAppleOptions(sku);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NitroReceiptValidationAppleOptions) && Intrinsics.areEqual(this.sku, ((NitroReceiptValidationAppleOptions) other).sku);
    }

    public int hashCode() {
        return this.sku.hashCode();
    }

    public String toString() {
        return "NitroReceiptValidationAppleOptions(sku=" + this.sku + ")";
    }

    public NitroReceiptValidationAppleOptions(String sku) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        this.sku = sku;
    }

    public final String getSku() {
        return this.sku;
    }

    /* compiled from: NitroReceiptValidationAppleOptions.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¨\u0006\b"}, d2 = {"Lcom/margelo/nitro/iap/NitroReceiptValidationAppleOptions$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/NitroReceiptValidationAppleOptions;", "sku", "", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroReceiptValidationAppleOptions fromCpp(String sku) {
            return new NitroReceiptValidationAppleOptions(sku);
        }
    }
}
