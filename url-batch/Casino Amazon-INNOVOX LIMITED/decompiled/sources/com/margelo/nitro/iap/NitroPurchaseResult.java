package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroPurchaseResult.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/margelo/nitro/iap/NitroPurchaseResult;", "", "responseCode", "", "debugMessage", "", "code", "message", "purchaseToken", "<init>", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getResponseCode", "()D", "getDebugMessage", "()Ljava/lang/String;", "getCode", "getMessage", "getPurchaseToken", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NitroPurchaseResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String code;
    private final String debugMessage;
    private final String message;
    private final String purchaseToken;
    private final double responseCode;

    public static /* synthetic */ NitroPurchaseResult copy$default(NitroPurchaseResult nitroPurchaseResult, double d, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            d = nitroPurchaseResult.responseCode;
        }
        double d2 = d;
        if ((i & 2) != 0) {
            str = nitroPurchaseResult.debugMessage;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = nitroPurchaseResult.code;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = nitroPurchaseResult.message;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = nitroPurchaseResult.purchaseToken;
        }
        return nitroPurchaseResult.copy(d2, str5, str6, str7, str4);
    }

    @JvmStatic
    private static final NitroPurchaseResult fromCpp(double d, String str, String str2, String str3, String str4) {
        return INSTANCE.fromCpp(d, str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final double getResponseCode() {
        return this.responseCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDebugMessage() {
        return this.debugMessage;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final NitroPurchaseResult copy(double responseCode, String debugMessage, String code, String message, String purchaseToken) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        return new NitroPurchaseResult(responseCode, debugMessage, code, message, purchaseToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroPurchaseResult)) {
            return false;
        }
        NitroPurchaseResult nitroPurchaseResult = (NitroPurchaseResult) other;
        return Double.compare(this.responseCode, nitroPurchaseResult.responseCode) == 0 && Intrinsics.areEqual(this.debugMessage, nitroPurchaseResult.debugMessage) && Intrinsics.areEqual(this.code, nitroPurchaseResult.code) && Intrinsics.areEqual(this.message, nitroPurchaseResult.message) && Intrinsics.areEqual(this.purchaseToken, nitroPurchaseResult.purchaseToken);
    }

    public int hashCode() {
        int hashCode = Double.hashCode(this.responseCode) * 31;
        String str = this.debugMessage;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.code.hashCode()) * 31) + this.message.hashCode()) * 31;
        String str2 = this.purchaseToken;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "NitroPurchaseResult(responseCode=" + this.responseCode + ", debugMessage=" + this.debugMessage + ", code=" + this.code + ", message=" + this.message + ", purchaseToken=" + this.purchaseToken + ")";
    }

    public NitroPurchaseResult(double d, String str, String code, String message, String str2) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        this.responseCode = d;
        this.debugMessage = str;
        this.code = code;
        this.message = message;
        this.purchaseToken = str2;
    }

    public final double getResponseCode() {
        return this.responseCode;
    }

    public final String getDebugMessage() {
        return this.debugMessage;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* compiled from: NitroPurchaseResult.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0003¨\u0006\r"}, d2 = {"Lcom/margelo/nitro/iap/NitroPurchaseResult$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/NitroPurchaseResult;", "responseCode", "", "debugMessage", "", "code", "message", "purchaseToken", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroPurchaseResult fromCpp(double responseCode, String debugMessage, String code, String message, String purchaseToken) {
            return new NitroPurchaseResult(responseCode, debugMessage, code, message, purchaseToken);
        }
    }
}
