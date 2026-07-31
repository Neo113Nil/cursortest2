package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroVerifyPurchaseWithProviderError.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/margelo/nitro/iap/NitroVerifyPurchaseWithProviderError;", "", "code", "Lcom/margelo/nitro/iap/Variant_NullType_String;", "message", "", "<init>", "(Lcom/margelo/nitro/iap/Variant_NullType_String;Ljava/lang/String;)V", "getCode", "()Lcom/margelo/nitro/iap/Variant_NullType_String;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NitroVerifyPurchaseWithProviderError {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Variant_NullType_String code;
    private final String message;

    public static /* synthetic */ NitroVerifyPurchaseWithProviderError copy$default(NitroVerifyPurchaseWithProviderError nitroVerifyPurchaseWithProviderError, Variant_NullType_String variant_NullType_String, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            variant_NullType_String = nitroVerifyPurchaseWithProviderError.code;
        }
        if ((i & 2) != 0) {
            str = nitroVerifyPurchaseWithProviderError.message;
        }
        return nitroVerifyPurchaseWithProviderError.copy(variant_NullType_String, str);
    }

    @JvmStatic
    private static final NitroVerifyPurchaseWithProviderError fromCpp(Variant_NullType_String variant_NullType_String, String str) {
        return INSTANCE.fromCpp(variant_NullType_String, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Variant_NullType_String getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final NitroVerifyPurchaseWithProviderError copy(Variant_NullType_String code, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new NitroVerifyPurchaseWithProviderError(code, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroVerifyPurchaseWithProviderError)) {
            return false;
        }
        NitroVerifyPurchaseWithProviderError nitroVerifyPurchaseWithProviderError = (NitroVerifyPurchaseWithProviderError) other;
        return Intrinsics.areEqual(this.code, nitroVerifyPurchaseWithProviderError.code) && Intrinsics.areEqual(this.message, nitroVerifyPurchaseWithProviderError.message);
    }

    public int hashCode() {
        Variant_NullType_String variant_NullType_String = this.code;
        return ((variant_NullType_String == null ? 0 : variant_NullType_String.hashCode()) * 31) + this.message.hashCode();
    }

    public String toString() {
        return "NitroVerifyPurchaseWithProviderError(code=" + this.code + ", message=" + this.message + ")";
    }

    public NitroVerifyPurchaseWithProviderError(Variant_NullType_String variant_NullType_String, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.code = variant_NullType_String;
        this.message = message;
    }

    public final Variant_NullType_String getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    /* compiled from: NitroVerifyPurchaseWithProviderError.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0003¨\u0006\n"}, d2 = {"Lcom/margelo/nitro/iap/NitroVerifyPurchaseWithProviderError$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/NitroVerifyPurchaseWithProviderError;", "code", "Lcom/margelo/nitro/iap/Variant_NullType_String;", "message", "", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroVerifyPurchaseWithProviderError fromCpp(Variant_NullType_String code, String message) {
            return new NitroVerifyPurchaseWithProviderError(code, message);
        }
    }
}
