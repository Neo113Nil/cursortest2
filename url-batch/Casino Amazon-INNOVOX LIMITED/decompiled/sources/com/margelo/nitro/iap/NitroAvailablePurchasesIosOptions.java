package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroAvailablePurchasesIosOptions.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/margelo/nitro/iap/NitroAvailablePurchasesIosOptions;", "", "alsoPublishToEventListener", "Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "onlyIncludeActiveItems", "alsoPublishToEventListenerIOS", "includeSuspendedAndroid", "onlyIncludeActiveItemsIOS", "<init>", "(Lcom/margelo/nitro/iap/Variant_NullType_Boolean;Lcom/margelo/nitro/iap/Variant_NullType_Boolean;Lcom/margelo/nitro/iap/Variant_NullType_Boolean;Lcom/margelo/nitro/iap/Variant_NullType_Boolean;Lcom/margelo/nitro/iap/Variant_NullType_Boolean;)V", "getAlsoPublishToEventListener", "()Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "getOnlyIncludeActiveItems", "getAlsoPublishToEventListenerIOS", "getIncludeSuspendedAndroid", "getOnlyIncludeActiveItemsIOS", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NitroAvailablePurchasesIosOptions {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Variant_NullType_Boolean alsoPublishToEventListener;
    private final Variant_NullType_Boolean alsoPublishToEventListenerIOS;
    private final Variant_NullType_Boolean includeSuspendedAndroid;
    private final Variant_NullType_Boolean onlyIncludeActiveItems;
    private final Variant_NullType_Boolean onlyIncludeActiveItemsIOS;

    public static /* synthetic */ NitroAvailablePurchasesIosOptions copy$default(NitroAvailablePurchasesIosOptions nitroAvailablePurchasesIosOptions, Variant_NullType_Boolean variant_NullType_Boolean, Variant_NullType_Boolean variant_NullType_Boolean2, Variant_NullType_Boolean variant_NullType_Boolean3, Variant_NullType_Boolean variant_NullType_Boolean4, Variant_NullType_Boolean variant_NullType_Boolean5, int i, Object obj) {
        if ((i & 1) != 0) {
            variant_NullType_Boolean = nitroAvailablePurchasesIosOptions.alsoPublishToEventListener;
        }
        if ((i & 2) != 0) {
            variant_NullType_Boolean2 = nitroAvailablePurchasesIosOptions.onlyIncludeActiveItems;
        }
        if ((i & 4) != 0) {
            variant_NullType_Boolean3 = nitroAvailablePurchasesIosOptions.alsoPublishToEventListenerIOS;
        }
        if ((i & 8) != 0) {
            variant_NullType_Boolean4 = nitroAvailablePurchasesIosOptions.includeSuspendedAndroid;
        }
        if ((i & 16) != 0) {
            variant_NullType_Boolean5 = nitroAvailablePurchasesIosOptions.onlyIncludeActiveItemsIOS;
        }
        Variant_NullType_Boolean variant_NullType_Boolean6 = variant_NullType_Boolean5;
        Variant_NullType_Boolean variant_NullType_Boolean7 = variant_NullType_Boolean3;
        return nitroAvailablePurchasesIosOptions.copy(variant_NullType_Boolean, variant_NullType_Boolean2, variant_NullType_Boolean7, variant_NullType_Boolean4, variant_NullType_Boolean6);
    }

    @JvmStatic
    private static final NitroAvailablePurchasesIosOptions fromCpp(Variant_NullType_Boolean variant_NullType_Boolean, Variant_NullType_Boolean variant_NullType_Boolean2, Variant_NullType_Boolean variant_NullType_Boolean3, Variant_NullType_Boolean variant_NullType_Boolean4, Variant_NullType_Boolean variant_NullType_Boolean5) {
        return INSTANCE.fromCpp(variant_NullType_Boolean, variant_NullType_Boolean2, variant_NullType_Boolean3, variant_NullType_Boolean4, variant_NullType_Boolean5);
    }

    /* renamed from: component1, reason: from getter */
    public final Variant_NullType_Boolean getAlsoPublishToEventListener() {
        return this.alsoPublishToEventListener;
    }

    /* renamed from: component2, reason: from getter */
    public final Variant_NullType_Boolean getOnlyIncludeActiveItems() {
        return this.onlyIncludeActiveItems;
    }

    /* renamed from: component3, reason: from getter */
    public final Variant_NullType_Boolean getAlsoPublishToEventListenerIOS() {
        return this.alsoPublishToEventListenerIOS;
    }

    /* renamed from: component4, reason: from getter */
    public final Variant_NullType_Boolean getIncludeSuspendedAndroid() {
        return this.includeSuspendedAndroid;
    }

    /* renamed from: component5, reason: from getter */
    public final Variant_NullType_Boolean getOnlyIncludeActiveItemsIOS() {
        return this.onlyIncludeActiveItemsIOS;
    }

    public final NitroAvailablePurchasesIosOptions copy(Variant_NullType_Boolean alsoPublishToEventListener, Variant_NullType_Boolean onlyIncludeActiveItems, Variant_NullType_Boolean alsoPublishToEventListenerIOS, Variant_NullType_Boolean includeSuspendedAndroid, Variant_NullType_Boolean onlyIncludeActiveItemsIOS) {
        return new NitroAvailablePurchasesIosOptions(alsoPublishToEventListener, onlyIncludeActiveItems, alsoPublishToEventListenerIOS, includeSuspendedAndroid, onlyIncludeActiveItemsIOS);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroAvailablePurchasesIosOptions)) {
            return false;
        }
        NitroAvailablePurchasesIosOptions nitroAvailablePurchasesIosOptions = (NitroAvailablePurchasesIosOptions) other;
        return Intrinsics.areEqual(this.alsoPublishToEventListener, nitroAvailablePurchasesIosOptions.alsoPublishToEventListener) && Intrinsics.areEqual(this.onlyIncludeActiveItems, nitroAvailablePurchasesIosOptions.onlyIncludeActiveItems) && Intrinsics.areEqual(this.alsoPublishToEventListenerIOS, nitroAvailablePurchasesIosOptions.alsoPublishToEventListenerIOS) && Intrinsics.areEqual(this.includeSuspendedAndroid, nitroAvailablePurchasesIosOptions.includeSuspendedAndroid) && Intrinsics.areEqual(this.onlyIncludeActiveItemsIOS, nitroAvailablePurchasesIosOptions.onlyIncludeActiveItemsIOS);
    }

    public int hashCode() {
        Variant_NullType_Boolean variant_NullType_Boolean = this.alsoPublishToEventListener;
        int hashCode = (variant_NullType_Boolean == null ? 0 : variant_NullType_Boolean.hashCode()) * 31;
        Variant_NullType_Boolean variant_NullType_Boolean2 = this.onlyIncludeActiveItems;
        int hashCode2 = (hashCode + (variant_NullType_Boolean2 == null ? 0 : variant_NullType_Boolean2.hashCode())) * 31;
        Variant_NullType_Boolean variant_NullType_Boolean3 = this.alsoPublishToEventListenerIOS;
        int hashCode3 = (hashCode2 + (variant_NullType_Boolean3 == null ? 0 : variant_NullType_Boolean3.hashCode())) * 31;
        Variant_NullType_Boolean variant_NullType_Boolean4 = this.includeSuspendedAndroid;
        int hashCode4 = (hashCode3 + (variant_NullType_Boolean4 == null ? 0 : variant_NullType_Boolean4.hashCode())) * 31;
        Variant_NullType_Boolean variant_NullType_Boolean5 = this.onlyIncludeActiveItemsIOS;
        return hashCode4 + (variant_NullType_Boolean5 != null ? variant_NullType_Boolean5.hashCode() : 0);
    }

    public String toString() {
        return "NitroAvailablePurchasesIosOptions(alsoPublishToEventListener=" + this.alsoPublishToEventListener + ", onlyIncludeActiveItems=" + this.onlyIncludeActiveItems + ", alsoPublishToEventListenerIOS=" + this.alsoPublishToEventListenerIOS + ", includeSuspendedAndroid=" + this.includeSuspendedAndroid + ", onlyIncludeActiveItemsIOS=" + this.onlyIncludeActiveItemsIOS + ")";
    }

    public NitroAvailablePurchasesIosOptions(Variant_NullType_Boolean variant_NullType_Boolean, Variant_NullType_Boolean variant_NullType_Boolean2, Variant_NullType_Boolean variant_NullType_Boolean3, Variant_NullType_Boolean variant_NullType_Boolean4, Variant_NullType_Boolean variant_NullType_Boolean5) {
        this.alsoPublishToEventListener = variant_NullType_Boolean;
        this.onlyIncludeActiveItems = variant_NullType_Boolean2;
        this.alsoPublishToEventListenerIOS = variant_NullType_Boolean3;
        this.includeSuspendedAndroid = variant_NullType_Boolean4;
        this.onlyIncludeActiveItemsIOS = variant_NullType_Boolean5;
    }

    public final Variant_NullType_Boolean getAlsoPublishToEventListener() {
        return this.alsoPublishToEventListener;
    }

    public final Variant_NullType_Boolean getOnlyIncludeActiveItems() {
        return this.onlyIncludeActiveItems;
    }

    public final Variant_NullType_Boolean getAlsoPublishToEventListenerIOS() {
        return this.alsoPublishToEventListenerIOS;
    }

    public final Variant_NullType_Boolean getIncludeSuspendedAndroid() {
        return this.includeSuspendedAndroid;
    }

    public final Variant_NullType_Boolean getOnlyIncludeActiveItemsIOS() {
        return this.onlyIncludeActiveItemsIOS;
    }

    /* compiled from: NitroAvailablePurchasesIosOptions.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0003¨\u0006\f"}, d2 = {"Lcom/margelo/nitro/iap/NitroAvailablePurchasesIosOptions$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/NitroAvailablePurchasesIosOptions;", "alsoPublishToEventListener", "Lcom/margelo/nitro/iap/Variant_NullType_Boolean;", "onlyIncludeActiveItems", "alsoPublishToEventListenerIOS", "includeSuspendedAndroid", "onlyIncludeActiveItemsIOS", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroAvailablePurchasesIosOptions fromCpp(Variant_NullType_Boolean alsoPublishToEventListener, Variant_NullType_Boolean onlyIncludeActiveItems, Variant_NullType_Boolean alsoPublishToEventListenerIOS, Variant_NullType_Boolean includeSuspendedAndroid, Variant_NullType_Boolean onlyIncludeActiveItemsIOS) {
            return new NitroAvailablePurchasesIosOptions(alsoPublishToEventListener, onlyIncludeActiveItems, alsoPublishToEventListenerIOS, includeSuspendedAndroid, onlyIncludeActiveItemsIOS);
        }
    }
}
