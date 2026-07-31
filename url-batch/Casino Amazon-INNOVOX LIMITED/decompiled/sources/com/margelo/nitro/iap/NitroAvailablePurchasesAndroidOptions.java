package com.margelo.nitro.iap;

import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroAvailablePurchasesAndroidOptions.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/margelo/nitro/iap/NitroAvailablePurchasesAndroidOptions;", "", WebViewManager.EVENT_TYPE_KEY, "Lcom/margelo/nitro/iap/NitroAvailablePurchasesAndroidType;", "includeSuspended", "Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "<init>", "(Lcom/margelo/nitro/iap/NitroAvailablePurchasesAndroidType;Lcom/margelo/nitro/iap/Variant_NullType_Boolean;)V", "getType", "()Lcom/margelo/nitro/iap/NitroAvailablePurchasesAndroidType;", "getIncludeSuspended", "()Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NitroAvailablePurchasesAndroidOptions {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Variant_NullType_Boolean includeSuspended;
    private final NitroAvailablePurchasesAndroidType type;

    public static /* synthetic */ NitroAvailablePurchasesAndroidOptions copy$default(NitroAvailablePurchasesAndroidOptions nitroAvailablePurchasesAndroidOptions, NitroAvailablePurchasesAndroidType nitroAvailablePurchasesAndroidType, Variant_NullType_Boolean variant_NullType_Boolean, int i, Object obj) {
        if ((i & 1) != 0) {
            nitroAvailablePurchasesAndroidType = nitroAvailablePurchasesAndroidOptions.type;
        }
        if ((i & 2) != 0) {
            variant_NullType_Boolean = nitroAvailablePurchasesAndroidOptions.includeSuspended;
        }
        return nitroAvailablePurchasesAndroidOptions.copy(nitroAvailablePurchasesAndroidType, variant_NullType_Boolean);
    }

    @JvmStatic
    private static final NitroAvailablePurchasesAndroidOptions fromCpp(NitroAvailablePurchasesAndroidType nitroAvailablePurchasesAndroidType, Variant_NullType_Boolean variant_NullType_Boolean) {
        return INSTANCE.fromCpp(nitroAvailablePurchasesAndroidType, variant_NullType_Boolean);
    }

    /* renamed from: component1, reason: from getter */
    public final NitroAvailablePurchasesAndroidType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final Variant_NullType_Boolean getIncludeSuspended() {
        return this.includeSuspended;
    }

    public final NitroAvailablePurchasesAndroidOptions copy(NitroAvailablePurchasesAndroidType type, Variant_NullType_Boolean includeSuspended) {
        return new NitroAvailablePurchasesAndroidOptions(type, includeSuspended);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroAvailablePurchasesAndroidOptions)) {
            return false;
        }
        NitroAvailablePurchasesAndroidOptions nitroAvailablePurchasesAndroidOptions = (NitroAvailablePurchasesAndroidOptions) other;
        return this.type == nitroAvailablePurchasesAndroidOptions.type && Intrinsics.areEqual(this.includeSuspended, nitroAvailablePurchasesAndroidOptions.includeSuspended);
    }

    public int hashCode() {
        NitroAvailablePurchasesAndroidType nitroAvailablePurchasesAndroidType = this.type;
        int hashCode = (nitroAvailablePurchasesAndroidType == null ? 0 : nitroAvailablePurchasesAndroidType.hashCode()) * 31;
        Variant_NullType_Boolean variant_NullType_Boolean = this.includeSuspended;
        return hashCode + (variant_NullType_Boolean != null ? variant_NullType_Boolean.hashCode() : 0);
    }

    public String toString() {
        return "NitroAvailablePurchasesAndroidOptions(type=" + this.type + ", includeSuspended=" + this.includeSuspended + ")";
    }

    public NitroAvailablePurchasesAndroidOptions(NitroAvailablePurchasesAndroidType nitroAvailablePurchasesAndroidType, Variant_NullType_Boolean variant_NullType_Boolean) {
        this.type = nitroAvailablePurchasesAndroidType;
        this.includeSuspended = variant_NullType_Boolean;
    }

    public final NitroAvailablePurchasesAndroidType getType() {
        return this.type;
    }

    public final Variant_NullType_Boolean getIncludeSuspended() {
        return this.includeSuspended;
    }

    /* compiled from: NitroAvailablePurchasesAndroidOptions.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0003¨\u0006\n"}, d2 = {"Lcom/margelo/nitro/iap/NitroAvailablePurchasesAndroidOptions$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/NitroAvailablePurchasesAndroidOptions;", WebViewManager.EVENT_TYPE_KEY, "Lcom/margelo/nitro/iap/NitroAvailablePurchasesAndroidType;", "includeSuspended", "Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroAvailablePurchasesAndroidOptions fromCpp(NitroAvailablePurchasesAndroidType type, Variant_NullType_Boolean includeSuspended) {
            return new NitroAvailablePurchasesAndroidOptions(type, includeSuspended);
        }
    }
}
