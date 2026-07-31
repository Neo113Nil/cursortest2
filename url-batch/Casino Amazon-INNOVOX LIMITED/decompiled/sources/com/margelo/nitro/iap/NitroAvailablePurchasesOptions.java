package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroAvailablePurchasesOptions.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/margelo/nitro/iap/NitroAvailablePurchasesOptions;", "", "ios", "Lcom/margelo/nitro/iap/Variant_NullType_NitroAvailablePurchasesIosOptions;", "android", "Lcom/margelo/nitro/iap/Variant_NullType_NitroAvailablePurchasesAndroidOptions;", "<init>", "(Lcom/margelo/nitro/iap/Variant_NullType_NitroAvailablePurchasesIosOptions;Lcom/margelo/nitro/iap/Variant_NullType_NitroAvailablePurchasesAndroidOptions;)V", "getIos", "()Lcom/margelo/nitro/iap/Variant_NullType_NitroAvailablePurchasesIosOptions;", "getAndroid", "()Lcom/margelo/nitro/iap/Variant_NullType_NitroAvailablePurchasesAndroidOptions;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NitroAvailablePurchasesOptions {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Variant_NullType_NitroAvailablePurchasesAndroidOptions android;
    private final Variant_NullType_NitroAvailablePurchasesIosOptions ios;

    public static /* synthetic */ NitroAvailablePurchasesOptions copy$default(NitroAvailablePurchasesOptions nitroAvailablePurchasesOptions, Variant_NullType_NitroAvailablePurchasesIosOptions variant_NullType_NitroAvailablePurchasesIosOptions, Variant_NullType_NitroAvailablePurchasesAndroidOptions variant_NullType_NitroAvailablePurchasesAndroidOptions, int i, Object obj) {
        if ((i & 1) != 0) {
            variant_NullType_NitroAvailablePurchasesIosOptions = nitroAvailablePurchasesOptions.ios;
        }
        if ((i & 2) != 0) {
            variant_NullType_NitroAvailablePurchasesAndroidOptions = nitroAvailablePurchasesOptions.android;
        }
        return nitroAvailablePurchasesOptions.copy(variant_NullType_NitroAvailablePurchasesIosOptions, variant_NullType_NitroAvailablePurchasesAndroidOptions);
    }

    @JvmStatic
    private static final NitroAvailablePurchasesOptions fromCpp(Variant_NullType_NitroAvailablePurchasesIosOptions variant_NullType_NitroAvailablePurchasesIosOptions, Variant_NullType_NitroAvailablePurchasesAndroidOptions variant_NullType_NitroAvailablePurchasesAndroidOptions) {
        return INSTANCE.fromCpp(variant_NullType_NitroAvailablePurchasesIosOptions, variant_NullType_NitroAvailablePurchasesAndroidOptions);
    }

    /* renamed from: component1, reason: from getter */
    public final Variant_NullType_NitroAvailablePurchasesIosOptions getIos() {
        return this.ios;
    }

    /* renamed from: component2, reason: from getter */
    public final Variant_NullType_NitroAvailablePurchasesAndroidOptions getAndroid() {
        return this.android;
    }

    public final NitroAvailablePurchasesOptions copy(Variant_NullType_NitroAvailablePurchasesIosOptions ios, Variant_NullType_NitroAvailablePurchasesAndroidOptions android2) {
        return new NitroAvailablePurchasesOptions(ios, android2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroAvailablePurchasesOptions)) {
            return false;
        }
        NitroAvailablePurchasesOptions nitroAvailablePurchasesOptions = (NitroAvailablePurchasesOptions) other;
        return Intrinsics.areEqual(this.ios, nitroAvailablePurchasesOptions.ios) && Intrinsics.areEqual(this.android, nitroAvailablePurchasesOptions.android);
    }

    public int hashCode() {
        Variant_NullType_NitroAvailablePurchasesIosOptions variant_NullType_NitroAvailablePurchasesIosOptions = this.ios;
        int hashCode = (variant_NullType_NitroAvailablePurchasesIosOptions == null ? 0 : variant_NullType_NitroAvailablePurchasesIosOptions.hashCode()) * 31;
        Variant_NullType_NitroAvailablePurchasesAndroidOptions variant_NullType_NitroAvailablePurchasesAndroidOptions = this.android;
        return hashCode + (variant_NullType_NitroAvailablePurchasesAndroidOptions != null ? variant_NullType_NitroAvailablePurchasesAndroidOptions.hashCode() : 0);
    }

    public String toString() {
        return "NitroAvailablePurchasesOptions(ios=" + this.ios + ", android=" + this.android + ")";
    }

    public NitroAvailablePurchasesOptions(Variant_NullType_NitroAvailablePurchasesIosOptions variant_NullType_NitroAvailablePurchasesIosOptions, Variant_NullType_NitroAvailablePurchasesAndroidOptions variant_NullType_NitroAvailablePurchasesAndroidOptions) {
        this.ios = variant_NullType_NitroAvailablePurchasesIosOptions;
        this.android = variant_NullType_NitroAvailablePurchasesAndroidOptions;
    }

    public final Variant_NullType_NitroAvailablePurchasesIosOptions getIos() {
        return this.ios;
    }

    public final Variant_NullType_NitroAvailablePurchasesAndroidOptions getAndroid() {
        return this.android;
    }

    /* compiled from: NitroAvailablePurchasesOptions.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0003¨\u0006\n"}, d2 = {"Lcom/margelo/nitro/iap/NitroAvailablePurchasesOptions$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/NitroAvailablePurchasesOptions;", "ios", "Lcom/margelo/nitro/iap/Variant_NullType_NitroAvailablePurchasesIosOptions;", "android", "Lcom/margelo/nitro/iap/Variant_NullType_NitroAvailablePurchasesAndroidOptions;", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroAvailablePurchasesOptions fromCpp(Variant_NullType_NitroAvailablePurchasesIosOptions ios, Variant_NullType_NitroAvailablePurchasesAndroidOptions android2) {
            return new NitroAvailablePurchasesOptions(ios, android2);
        }
    }
}
