package com.margelo.nitro.iap;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExternalPurchaseLinkResultIOS.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/margelo/nitro/iap/ExternalPurchaseLinkResultIOS;", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/margelo/nitro/iap/Variant_NullType_String;", "success", "", "<init>", "(Lcom/margelo/nitro/iap/Variant_NullType_String;Z)V", "getError", "()Lcom/margelo/nitro/iap/Variant_NullType_String;", "getSuccess", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ExternalPurchaseLinkResultIOS {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Variant_NullType_String error;
    private final boolean success;

    public static /* synthetic */ ExternalPurchaseLinkResultIOS copy$default(ExternalPurchaseLinkResultIOS externalPurchaseLinkResultIOS, Variant_NullType_String variant_NullType_String, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            variant_NullType_String = externalPurchaseLinkResultIOS.error;
        }
        if ((i & 2) != 0) {
            z = externalPurchaseLinkResultIOS.success;
        }
        return externalPurchaseLinkResultIOS.copy(variant_NullType_String, z);
    }

    @JvmStatic
    private static final ExternalPurchaseLinkResultIOS fromCpp(Variant_NullType_String variant_NullType_String, boolean z) {
        return INSTANCE.fromCpp(variant_NullType_String, z);
    }

    /* renamed from: component1, reason: from getter */
    public final Variant_NullType_String getError() {
        return this.error;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public final ExternalPurchaseLinkResultIOS copy(Variant_NullType_String error, boolean success) {
        return new ExternalPurchaseLinkResultIOS(error, success);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalPurchaseLinkResultIOS)) {
            return false;
        }
        ExternalPurchaseLinkResultIOS externalPurchaseLinkResultIOS = (ExternalPurchaseLinkResultIOS) other;
        return Intrinsics.areEqual(this.error, externalPurchaseLinkResultIOS.error) && this.success == externalPurchaseLinkResultIOS.success;
    }

    public int hashCode() {
        Variant_NullType_String variant_NullType_String = this.error;
        return ((variant_NullType_String == null ? 0 : variant_NullType_String.hashCode()) * 31) + Boolean.hashCode(this.success);
    }

    public String toString() {
        return "ExternalPurchaseLinkResultIOS(error=" + this.error + ", success=" + this.success + ")";
    }

    public ExternalPurchaseLinkResultIOS(Variant_NullType_String variant_NullType_String, boolean z) {
        this.error = variant_NullType_String;
        this.success = z;
    }

    public final Variant_NullType_String getError() {
        return this.error;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    /* compiled from: ExternalPurchaseLinkResultIOS.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0003¨\u0006\n"}, d2 = {"Lcom/margelo/nitro/iap/ExternalPurchaseLinkResultIOS$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/ExternalPurchaseLinkResultIOS;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/margelo/nitro/iap/Variant_NullType_String;", "success", "", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final ExternalPurchaseLinkResultIOS fromCpp(Variant_NullType_String error, boolean success) {
            return new ExternalPurchaseLinkResultIOS(error, success);
        }
    }
}
