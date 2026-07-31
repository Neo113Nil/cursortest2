package com.margelo.nitro.iap;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExternalPurchaseCustomLinkNoticeResultIOS.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/margelo/nitro/iap/ExternalPurchaseCustomLinkNoticeResultIOS;", "", "continued", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/margelo/nitro/iap/Variant_NullType_String;", "<init>", "(ZLcom/margelo/nitro/iap/Variant_NullType_String;)V", "getContinued", "()Z", "getError", "()Lcom/margelo/nitro/iap/Variant_NullType_String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ExternalPurchaseCustomLinkNoticeResultIOS {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean continued;
    private final Variant_NullType_String error;

    public static /* synthetic */ ExternalPurchaseCustomLinkNoticeResultIOS copy$default(ExternalPurchaseCustomLinkNoticeResultIOS externalPurchaseCustomLinkNoticeResultIOS, boolean z, Variant_NullType_String variant_NullType_String, int i, Object obj) {
        if ((i & 1) != 0) {
            z = externalPurchaseCustomLinkNoticeResultIOS.continued;
        }
        if ((i & 2) != 0) {
            variant_NullType_String = externalPurchaseCustomLinkNoticeResultIOS.error;
        }
        return externalPurchaseCustomLinkNoticeResultIOS.copy(z, variant_NullType_String);
    }

    @JvmStatic
    private static final ExternalPurchaseCustomLinkNoticeResultIOS fromCpp(boolean z, Variant_NullType_String variant_NullType_String) {
        return INSTANCE.fromCpp(z, variant_NullType_String);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getContinued() {
        return this.continued;
    }

    /* renamed from: component2, reason: from getter */
    public final Variant_NullType_String getError() {
        return this.error;
    }

    public final ExternalPurchaseCustomLinkNoticeResultIOS copy(boolean continued, Variant_NullType_String error) {
        return new ExternalPurchaseCustomLinkNoticeResultIOS(continued, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalPurchaseCustomLinkNoticeResultIOS)) {
            return false;
        }
        ExternalPurchaseCustomLinkNoticeResultIOS externalPurchaseCustomLinkNoticeResultIOS = (ExternalPurchaseCustomLinkNoticeResultIOS) other;
        return this.continued == externalPurchaseCustomLinkNoticeResultIOS.continued && Intrinsics.areEqual(this.error, externalPurchaseCustomLinkNoticeResultIOS.error);
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.continued) * 31;
        Variant_NullType_String variant_NullType_String = this.error;
        return hashCode + (variant_NullType_String == null ? 0 : variant_NullType_String.hashCode());
    }

    public String toString() {
        return "ExternalPurchaseCustomLinkNoticeResultIOS(continued=" + this.continued + ", error=" + this.error + ")";
    }

    public ExternalPurchaseCustomLinkNoticeResultIOS(boolean z, Variant_NullType_String variant_NullType_String) {
        this.continued = z;
        this.error = variant_NullType_String;
    }

    public final boolean getContinued() {
        return this.continued;
    }

    public final Variant_NullType_String getError() {
        return this.error;
    }

    /* compiled from: ExternalPurchaseCustomLinkNoticeResultIOS.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0003¨\u0006\n"}, d2 = {"Lcom/margelo/nitro/iap/ExternalPurchaseCustomLinkNoticeResultIOS$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/ExternalPurchaseCustomLinkNoticeResultIOS;", "continued", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/margelo/nitro/iap/Variant_NullType_String;", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final ExternalPurchaseCustomLinkNoticeResultIOS fromCpp(boolean continued, Variant_NullType_String error) {
            return new ExternalPurchaseCustomLinkNoticeResultIOS(continued, error);
        }
    }
}
