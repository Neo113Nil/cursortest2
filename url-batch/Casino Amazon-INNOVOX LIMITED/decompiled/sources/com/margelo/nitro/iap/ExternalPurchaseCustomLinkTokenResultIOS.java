package com.margelo.nitro.iap;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExternalPurchaseCustomLinkTokenResultIOS.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/margelo/nitro/iap/ExternalPurchaseCustomLinkTokenResultIOS;", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/margelo/nitro/iap/Variant_NullType_String;", "token", "<init>", "(Lcom/margelo/nitro/iap/Variant_NullType_String;Lcom/margelo/nitro/iap/Variant_NullType_String;)V", "getError", "()Lcom/margelo/nitro/iap/Variant_NullType_String;", "getToken", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ExternalPurchaseCustomLinkTokenResultIOS {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Variant_NullType_String error;
    private final Variant_NullType_String token;

    public static /* synthetic */ ExternalPurchaseCustomLinkTokenResultIOS copy$default(ExternalPurchaseCustomLinkTokenResultIOS externalPurchaseCustomLinkTokenResultIOS, Variant_NullType_String variant_NullType_String, Variant_NullType_String variant_NullType_String2, int i, Object obj) {
        if ((i & 1) != 0) {
            variant_NullType_String = externalPurchaseCustomLinkTokenResultIOS.error;
        }
        if ((i & 2) != 0) {
            variant_NullType_String2 = externalPurchaseCustomLinkTokenResultIOS.token;
        }
        return externalPurchaseCustomLinkTokenResultIOS.copy(variant_NullType_String, variant_NullType_String2);
    }

    @JvmStatic
    private static final ExternalPurchaseCustomLinkTokenResultIOS fromCpp(Variant_NullType_String variant_NullType_String, Variant_NullType_String variant_NullType_String2) {
        return INSTANCE.fromCpp(variant_NullType_String, variant_NullType_String2);
    }

    /* renamed from: component1, reason: from getter */
    public final Variant_NullType_String getError() {
        return this.error;
    }

    /* renamed from: component2, reason: from getter */
    public final Variant_NullType_String getToken() {
        return this.token;
    }

    public final ExternalPurchaseCustomLinkTokenResultIOS copy(Variant_NullType_String error, Variant_NullType_String token) {
        return new ExternalPurchaseCustomLinkTokenResultIOS(error, token);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalPurchaseCustomLinkTokenResultIOS)) {
            return false;
        }
        ExternalPurchaseCustomLinkTokenResultIOS externalPurchaseCustomLinkTokenResultIOS = (ExternalPurchaseCustomLinkTokenResultIOS) other;
        return Intrinsics.areEqual(this.error, externalPurchaseCustomLinkTokenResultIOS.error) && Intrinsics.areEqual(this.token, externalPurchaseCustomLinkTokenResultIOS.token);
    }

    public int hashCode() {
        Variant_NullType_String variant_NullType_String = this.error;
        int hashCode = (variant_NullType_String == null ? 0 : variant_NullType_String.hashCode()) * 31;
        Variant_NullType_String variant_NullType_String2 = this.token;
        return hashCode + (variant_NullType_String2 != null ? variant_NullType_String2.hashCode() : 0);
    }

    public String toString() {
        return "ExternalPurchaseCustomLinkTokenResultIOS(error=" + this.error + ", token=" + this.token + ")";
    }

    public ExternalPurchaseCustomLinkTokenResultIOS(Variant_NullType_String variant_NullType_String, Variant_NullType_String variant_NullType_String2) {
        this.error = variant_NullType_String;
        this.token = variant_NullType_String2;
    }

    public final Variant_NullType_String getError() {
        return this.error;
    }

    public final Variant_NullType_String getToken() {
        return this.token;
    }

    /* compiled from: ExternalPurchaseCustomLinkTokenResultIOS.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0003¨\u0006\t"}, d2 = {"Lcom/margelo/nitro/iap/ExternalPurchaseCustomLinkTokenResultIOS$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/ExternalPurchaseCustomLinkTokenResultIOS;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/margelo/nitro/iap/Variant_NullType_String;", "token", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final ExternalPurchaseCustomLinkTokenResultIOS fromCpp(Variant_NullType_String error, Variant_NullType_String token) {
            return new ExternalPurchaseCustomLinkTokenResultIOS(error, token);
        }
    }
}
