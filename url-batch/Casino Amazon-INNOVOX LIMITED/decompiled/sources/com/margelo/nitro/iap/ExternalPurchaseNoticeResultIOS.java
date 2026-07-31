package com.margelo.nitro.iap;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExternalPurchaseNoticeResultIOS.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/margelo/nitro/iap/ExternalPurchaseNoticeResultIOS;", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/margelo/nitro/iap/Variant_NullType_String;", "externalPurchaseToken", "result", "Lcom/margelo/nitro/iap/ExternalPurchaseNoticeAction;", "<init>", "(Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/ExternalPurchaseNoticeAction;)V", "getError", "()Lcom/margelo/nitro/iap/Variant_NullType_String;", "getExternalPurchaseToken", "getResult", "()Lcom/margelo/nitro/iap/ExternalPurchaseNoticeAction;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ExternalPurchaseNoticeResultIOS {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Variant_NullType_String error;
    private final Variant_NullType_String externalPurchaseToken;
    private final ExternalPurchaseNoticeAction result;

    public static /* synthetic */ ExternalPurchaseNoticeResultIOS copy$default(ExternalPurchaseNoticeResultIOS externalPurchaseNoticeResultIOS, Variant_NullType_String variant_NullType_String, Variant_NullType_String variant_NullType_String2, ExternalPurchaseNoticeAction externalPurchaseNoticeAction, int i, Object obj) {
        if ((i & 1) != 0) {
            variant_NullType_String = externalPurchaseNoticeResultIOS.error;
        }
        if ((i & 2) != 0) {
            variant_NullType_String2 = externalPurchaseNoticeResultIOS.externalPurchaseToken;
        }
        if ((i & 4) != 0) {
            externalPurchaseNoticeAction = externalPurchaseNoticeResultIOS.result;
        }
        return externalPurchaseNoticeResultIOS.copy(variant_NullType_String, variant_NullType_String2, externalPurchaseNoticeAction);
    }

    @JvmStatic
    private static final ExternalPurchaseNoticeResultIOS fromCpp(Variant_NullType_String variant_NullType_String, Variant_NullType_String variant_NullType_String2, ExternalPurchaseNoticeAction externalPurchaseNoticeAction) {
        return INSTANCE.fromCpp(variant_NullType_String, variant_NullType_String2, externalPurchaseNoticeAction);
    }

    /* renamed from: component1, reason: from getter */
    public final Variant_NullType_String getError() {
        return this.error;
    }

    /* renamed from: component2, reason: from getter */
    public final Variant_NullType_String getExternalPurchaseToken() {
        return this.externalPurchaseToken;
    }

    /* renamed from: component3, reason: from getter */
    public final ExternalPurchaseNoticeAction getResult() {
        return this.result;
    }

    public final ExternalPurchaseNoticeResultIOS copy(Variant_NullType_String error, Variant_NullType_String externalPurchaseToken, ExternalPurchaseNoticeAction result) {
        Intrinsics.checkNotNullParameter(result, "result");
        return new ExternalPurchaseNoticeResultIOS(error, externalPurchaseToken, result);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalPurchaseNoticeResultIOS)) {
            return false;
        }
        ExternalPurchaseNoticeResultIOS externalPurchaseNoticeResultIOS = (ExternalPurchaseNoticeResultIOS) other;
        return Intrinsics.areEqual(this.error, externalPurchaseNoticeResultIOS.error) && Intrinsics.areEqual(this.externalPurchaseToken, externalPurchaseNoticeResultIOS.externalPurchaseToken) && this.result == externalPurchaseNoticeResultIOS.result;
    }

    public int hashCode() {
        Variant_NullType_String variant_NullType_String = this.error;
        int hashCode = (variant_NullType_String == null ? 0 : variant_NullType_String.hashCode()) * 31;
        Variant_NullType_String variant_NullType_String2 = this.externalPurchaseToken;
        return ((hashCode + (variant_NullType_String2 != null ? variant_NullType_String2.hashCode() : 0)) * 31) + this.result.hashCode();
    }

    public String toString() {
        return "ExternalPurchaseNoticeResultIOS(error=" + this.error + ", externalPurchaseToken=" + this.externalPurchaseToken + ", result=" + this.result + ")";
    }

    public ExternalPurchaseNoticeResultIOS(Variant_NullType_String variant_NullType_String, Variant_NullType_String variant_NullType_String2, ExternalPurchaseNoticeAction result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.error = variant_NullType_String;
        this.externalPurchaseToken = variant_NullType_String2;
        this.result = result;
    }

    public final Variant_NullType_String getError() {
        return this.error;
    }

    public final Variant_NullType_String getExternalPurchaseToken() {
        return this.externalPurchaseToken;
    }

    public final ExternalPurchaseNoticeAction getResult() {
        return this.result;
    }

    /* compiled from: ExternalPurchaseNoticeResultIOS.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nH\u0003¨\u0006\u000b"}, d2 = {"Lcom/margelo/nitro/iap/ExternalPurchaseNoticeResultIOS$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/ExternalPurchaseNoticeResultIOS;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/margelo/nitro/iap/Variant_NullType_String;", "externalPurchaseToken", "result", "Lcom/margelo/nitro/iap/ExternalPurchaseNoticeAction;", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final ExternalPurchaseNoticeResultIOS fromCpp(Variant_NullType_String error, Variant_NullType_String externalPurchaseToken, ExternalPurchaseNoticeAction result) {
            return new ExternalPurchaseNoticeResultIOS(error, externalPurchaseToken, result);
        }
    }
}
