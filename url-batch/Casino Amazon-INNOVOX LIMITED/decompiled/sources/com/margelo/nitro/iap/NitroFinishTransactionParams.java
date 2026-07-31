package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroFinishTransactionParams.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/margelo/nitro/iap/NitroFinishTransactionParams;", "", "ios", "Lcom/margelo/nitro/iap/Variant_NullType_NitroFinishTransactionIosParams;", "android", "Lcom/margelo/nitro/iap/Variant_NullType_NitroFinishTransactionAndroidParams;", "<init>", "(Lcom/margelo/nitro/iap/Variant_NullType_NitroFinishTransactionIosParams;Lcom/margelo/nitro/iap/Variant_NullType_NitroFinishTransactionAndroidParams;)V", "getIos", "()Lcom/margelo/nitro/iap/Variant_NullType_NitroFinishTransactionIosParams;", "getAndroid", "()Lcom/margelo/nitro/iap/Variant_NullType_NitroFinishTransactionAndroidParams;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NitroFinishTransactionParams {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Variant_NullType_NitroFinishTransactionAndroidParams android;
    private final Variant_NullType_NitroFinishTransactionIosParams ios;

    public static /* synthetic */ NitroFinishTransactionParams copy$default(NitroFinishTransactionParams nitroFinishTransactionParams, Variant_NullType_NitroFinishTransactionIosParams variant_NullType_NitroFinishTransactionIosParams, Variant_NullType_NitroFinishTransactionAndroidParams variant_NullType_NitroFinishTransactionAndroidParams, int i, Object obj) {
        if ((i & 1) != 0) {
            variant_NullType_NitroFinishTransactionIosParams = nitroFinishTransactionParams.ios;
        }
        if ((i & 2) != 0) {
            variant_NullType_NitroFinishTransactionAndroidParams = nitroFinishTransactionParams.android;
        }
        return nitroFinishTransactionParams.copy(variant_NullType_NitroFinishTransactionIosParams, variant_NullType_NitroFinishTransactionAndroidParams);
    }

    @JvmStatic
    private static final NitroFinishTransactionParams fromCpp(Variant_NullType_NitroFinishTransactionIosParams variant_NullType_NitroFinishTransactionIosParams, Variant_NullType_NitroFinishTransactionAndroidParams variant_NullType_NitroFinishTransactionAndroidParams) {
        return INSTANCE.fromCpp(variant_NullType_NitroFinishTransactionIosParams, variant_NullType_NitroFinishTransactionAndroidParams);
    }

    /* renamed from: component1, reason: from getter */
    public final Variant_NullType_NitroFinishTransactionIosParams getIos() {
        return this.ios;
    }

    /* renamed from: component2, reason: from getter */
    public final Variant_NullType_NitroFinishTransactionAndroidParams getAndroid() {
        return this.android;
    }

    public final NitroFinishTransactionParams copy(Variant_NullType_NitroFinishTransactionIosParams ios, Variant_NullType_NitroFinishTransactionAndroidParams android2) {
        return new NitroFinishTransactionParams(ios, android2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroFinishTransactionParams)) {
            return false;
        }
        NitroFinishTransactionParams nitroFinishTransactionParams = (NitroFinishTransactionParams) other;
        return Intrinsics.areEqual(this.ios, nitroFinishTransactionParams.ios) && Intrinsics.areEqual(this.android, nitroFinishTransactionParams.android);
    }

    public int hashCode() {
        Variant_NullType_NitroFinishTransactionIosParams variant_NullType_NitroFinishTransactionIosParams = this.ios;
        int hashCode = (variant_NullType_NitroFinishTransactionIosParams == null ? 0 : variant_NullType_NitroFinishTransactionIosParams.hashCode()) * 31;
        Variant_NullType_NitroFinishTransactionAndroidParams variant_NullType_NitroFinishTransactionAndroidParams = this.android;
        return hashCode + (variant_NullType_NitroFinishTransactionAndroidParams != null ? variant_NullType_NitroFinishTransactionAndroidParams.hashCode() : 0);
    }

    public String toString() {
        return "NitroFinishTransactionParams(ios=" + this.ios + ", android=" + this.android + ")";
    }

    public NitroFinishTransactionParams(Variant_NullType_NitroFinishTransactionIosParams variant_NullType_NitroFinishTransactionIosParams, Variant_NullType_NitroFinishTransactionAndroidParams variant_NullType_NitroFinishTransactionAndroidParams) {
        this.ios = variant_NullType_NitroFinishTransactionIosParams;
        this.android = variant_NullType_NitroFinishTransactionAndroidParams;
    }

    public final Variant_NullType_NitroFinishTransactionIosParams getIos() {
        return this.ios;
    }

    public final Variant_NullType_NitroFinishTransactionAndroidParams getAndroid() {
        return this.android;
    }

    /* compiled from: NitroFinishTransactionParams.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0003¨\u0006\n"}, d2 = {"Lcom/margelo/nitro/iap/NitroFinishTransactionParams$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/NitroFinishTransactionParams;", "ios", "Lcom/margelo/nitro/iap/Variant_NullType_NitroFinishTransactionIosParams;", "android", "Lcom/margelo/nitro/iap/Variant_NullType_NitroFinishTransactionAndroidParams;", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroFinishTransactionParams fromCpp(Variant_NullType_NitroFinishTransactionIosParams ios, Variant_NullType_NitroFinishTransactionAndroidParams android2) {
            return new NitroFinishTransactionParams(ios, android2);
        }
    }
}
