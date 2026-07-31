package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroPurchaseRequest.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/margelo/nitro/iap/NitroPurchaseRequest;", "", "ios", "Lcom/margelo/nitro/iap/Variant_NullType_NitroRequestPurchaseIos;", "android", "Lcom/margelo/nitro/iap/Variant_NullType_NitroRequestPurchaseAndroid;", "apple", "google", "<init>", "(Lcom/margelo/nitro/iap/Variant_NullType_NitroRequestPurchaseIos;Lcom/margelo/nitro/iap/Variant_NullType_NitroRequestPurchaseAndroid;Lcom/margelo/nitro/iap/Variant_NullType_NitroRequestPurchaseIos;Lcom/margelo/nitro/iap/Variant_NullType_NitroRequestPurchaseAndroid;)V", "getIos", "()Lcom/margelo/nitro/iap/Variant_NullType_NitroRequestPurchaseIos;", "getAndroid", "()Lcom/margelo/nitro/iap/Variant_NullType_NitroRequestPurchaseAndroid;", "getApple", "getGoogle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NitroPurchaseRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Variant_NullType_NitroRequestPurchaseAndroid android;
    private final Variant_NullType_NitroRequestPurchaseIos apple;
    private final Variant_NullType_NitroRequestPurchaseAndroid google;
    private final Variant_NullType_NitroRequestPurchaseIos ios;

    public static /* synthetic */ NitroPurchaseRequest copy$default(NitroPurchaseRequest nitroPurchaseRequest, Variant_NullType_NitroRequestPurchaseIos variant_NullType_NitroRequestPurchaseIos, Variant_NullType_NitroRequestPurchaseAndroid variant_NullType_NitroRequestPurchaseAndroid, Variant_NullType_NitroRequestPurchaseIos variant_NullType_NitroRequestPurchaseIos2, Variant_NullType_NitroRequestPurchaseAndroid variant_NullType_NitroRequestPurchaseAndroid2, int i, Object obj) {
        if ((i & 1) != 0) {
            variant_NullType_NitroRequestPurchaseIos = nitroPurchaseRequest.ios;
        }
        if ((i & 2) != 0) {
            variant_NullType_NitroRequestPurchaseAndroid = nitroPurchaseRequest.android;
        }
        if ((i & 4) != 0) {
            variant_NullType_NitroRequestPurchaseIos2 = nitroPurchaseRequest.apple;
        }
        if ((i & 8) != 0) {
            variant_NullType_NitroRequestPurchaseAndroid2 = nitroPurchaseRequest.google;
        }
        return nitroPurchaseRequest.copy(variant_NullType_NitroRequestPurchaseIos, variant_NullType_NitroRequestPurchaseAndroid, variant_NullType_NitroRequestPurchaseIos2, variant_NullType_NitroRequestPurchaseAndroid2);
    }

    @JvmStatic
    private static final NitroPurchaseRequest fromCpp(Variant_NullType_NitroRequestPurchaseIos variant_NullType_NitroRequestPurchaseIos, Variant_NullType_NitroRequestPurchaseAndroid variant_NullType_NitroRequestPurchaseAndroid, Variant_NullType_NitroRequestPurchaseIos variant_NullType_NitroRequestPurchaseIos2, Variant_NullType_NitroRequestPurchaseAndroid variant_NullType_NitroRequestPurchaseAndroid2) {
        return INSTANCE.fromCpp(variant_NullType_NitroRequestPurchaseIos, variant_NullType_NitroRequestPurchaseAndroid, variant_NullType_NitroRequestPurchaseIos2, variant_NullType_NitroRequestPurchaseAndroid2);
    }

    /* renamed from: component1, reason: from getter */
    public final Variant_NullType_NitroRequestPurchaseIos getIos() {
        return this.ios;
    }

    /* renamed from: component2, reason: from getter */
    public final Variant_NullType_NitroRequestPurchaseAndroid getAndroid() {
        return this.android;
    }

    /* renamed from: component3, reason: from getter */
    public final Variant_NullType_NitroRequestPurchaseIos getApple() {
        return this.apple;
    }

    /* renamed from: component4, reason: from getter */
    public final Variant_NullType_NitroRequestPurchaseAndroid getGoogle() {
        return this.google;
    }

    public final NitroPurchaseRequest copy(Variant_NullType_NitroRequestPurchaseIos ios, Variant_NullType_NitroRequestPurchaseAndroid android2, Variant_NullType_NitroRequestPurchaseIos apple, Variant_NullType_NitroRequestPurchaseAndroid google) {
        return new NitroPurchaseRequest(ios, android2, apple, google);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroPurchaseRequest)) {
            return false;
        }
        NitroPurchaseRequest nitroPurchaseRequest = (NitroPurchaseRequest) other;
        return Intrinsics.areEqual(this.ios, nitroPurchaseRequest.ios) && Intrinsics.areEqual(this.android, nitroPurchaseRequest.android) && Intrinsics.areEqual(this.apple, nitroPurchaseRequest.apple) && Intrinsics.areEqual(this.google, nitroPurchaseRequest.google);
    }

    public int hashCode() {
        Variant_NullType_NitroRequestPurchaseIos variant_NullType_NitroRequestPurchaseIos = this.ios;
        int hashCode = (variant_NullType_NitroRequestPurchaseIos == null ? 0 : variant_NullType_NitroRequestPurchaseIos.hashCode()) * 31;
        Variant_NullType_NitroRequestPurchaseAndroid variant_NullType_NitroRequestPurchaseAndroid = this.android;
        int hashCode2 = (hashCode + (variant_NullType_NitroRequestPurchaseAndroid == null ? 0 : variant_NullType_NitroRequestPurchaseAndroid.hashCode())) * 31;
        Variant_NullType_NitroRequestPurchaseIos variant_NullType_NitroRequestPurchaseIos2 = this.apple;
        int hashCode3 = (hashCode2 + (variant_NullType_NitroRequestPurchaseIos2 == null ? 0 : variant_NullType_NitroRequestPurchaseIos2.hashCode())) * 31;
        Variant_NullType_NitroRequestPurchaseAndroid variant_NullType_NitroRequestPurchaseAndroid2 = this.google;
        return hashCode3 + (variant_NullType_NitroRequestPurchaseAndroid2 != null ? variant_NullType_NitroRequestPurchaseAndroid2.hashCode() : 0);
    }

    public String toString() {
        return "NitroPurchaseRequest(ios=" + this.ios + ", android=" + this.android + ", apple=" + this.apple + ", google=" + this.google + ")";
    }

    public NitroPurchaseRequest(Variant_NullType_NitroRequestPurchaseIos variant_NullType_NitroRequestPurchaseIos, Variant_NullType_NitroRequestPurchaseAndroid variant_NullType_NitroRequestPurchaseAndroid, Variant_NullType_NitroRequestPurchaseIos variant_NullType_NitroRequestPurchaseIos2, Variant_NullType_NitroRequestPurchaseAndroid variant_NullType_NitroRequestPurchaseAndroid2) {
        this.ios = variant_NullType_NitroRequestPurchaseIos;
        this.android = variant_NullType_NitroRequestPurchaseAndroid;
        this.apple = variant_NullType_NitroRequestPurchaseIos2;
        this.google = variant_NullType_NitroRequestPurchaseAndroid2;
    }

    public final Variant_NullType_NitroRequestPurchaseIos getIos() {
        return this.ios;
    }

    public final Variant_NullType_NitroRequestPurchaseAndroid getAndroid() {
        return this.android;
    }

    public final Variant_NullType_NitroRequestPurchaseIos getApple() {
        return this.apple;
    }

    public final Variant_NullType_NitroRequestPurchaseAndroid getGoogle() {
        return this.google;
    }

    /* compiled from: NitroPurchaseRequest.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0003¨\u0006\f"}, d2 = {"Lcom/margelo/nitro/iap/NitroPurchaseRequest$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/NitroPurchaseRequest;", "ios", "Lcom/margelo/nitro/iap/Variant_NullType_NitroRequestPurchaseIos;", "android", "Lcom/margelo/nitro/iap/Variant_NullType_NitroRequestPurchaseAndroid;", "apple", "google", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroPurchaseRequest fromCpp(Variant_NullType_NitroRequestPurchaseIos ios, Variant_NullType_NitroRequestPurchaseAndroid android2, Variant_NullType_NitroRequestPurchaseIos apple, Variant_NullType_NitroRequestPurchaseAndroid google) {
            return new NitroPurchaseRequest(ios, android2, apple, google);
        }
    }
}
