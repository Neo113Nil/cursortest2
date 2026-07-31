package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: NitroLimitedQuantityInfoAndroid.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/margelo/nitro/iap/NitroLimitedQuantityInfoAndroid;", "", "maximumQuantity", "", "remainingQuantity", "<init>", "(DD)V", "getMaximumQuantity", "()D", "getRemainingQuantity", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NitroLimitedQuantityInfoAndroid {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final double maximumQuantity;
    private final double remainingQuantity;

    public static /* synthetic */ NitroLimitedQuantityInfoAndroid copy$default(NitroLimitedQuantityInfoAndroid nitroLimitedQuantityInfoAndroid, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = nitroLimitedQuantityInfoAndroid.maximumQuantity;
        }
        if ((i & 2) != 0) {
            d2 = nitroLimitedQuantityInfoAndroid.remainingQuantity;
        }
        return nitroLimitedQuantityInfoAndroid.copy(d, d2);
    }

    @JvmStatic
    private static final NitroLimitedQuantityInfoAndroid fromCpp(double d, double d2) {
        return INSTANCE.fromCpp(d, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final double getMaximumQuantity() {
        return this.maximumQuantity;
    }

    /* renamed from: component2, reason: from getter */
    public final double getRemainingQuantity() {
        return this.remainingQuantity;
    }

    public final NitroLimitedQuantityInfoAndroid copy(double maximumQuantity, double remainingQuantity) {
        return new NitroLimitedQuantityInfoAndroid(maximumQuantity, remainingQuantity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroLimitedQuantityInfoAndroid)) {
            return false;
        }
        NitroLimitedQuantityInfoAndroid nitroLimitedQuantityInfoAndroid = (NitroLimitedQuantityInfoAndroid) other;
        return Double.compare(this.maximumQuantity, nitroLimitedQuantityInfoAndroid.maximumQuantity) == 0 && Double.compare(this.remainingQuantity, nitroLimitedQuantityInfoAndroid.remainingQuantity) == 0;
    }

    public int hashCode() {
        return (Double.hashCode(this.maximumQuantity) * 31) + Double.hashCode(this.remainingQuantity);
    }

    public String toString() {
        return "NitroLimitedQuantityInfoAndroid(maximumQuantity=" + this.maximumQuantity + ", remainingQuantity=" + this.remainingQuantity + ")";
    }

    public NitroLimitedQuantityInfoAndroid(double d, double d2) {
        this.maximumQuantity = d;
        this.remainingQuantity = d2;
    }

    public final double getMaximumQuantity() {
        return this.maximumQuantity;
    }

    public final double getRemainingQuantity() {
        return this.remainingQuantity;
    }

    /* compiled from: NitroLimitedQuantityInfoAndroid.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0003¨\u0006\t"}, d2 = {"Lcom/margelo/nitro/iap/NitroLimitedQuantityInfoAndroid$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/NitroLimitedQuantityInfoAndroid;", "maximumQuantity", "", "remainingQuantity", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroLimitedQuantityInfoAndroid fromCpp(double maximumQuantity, double remainingQuantity) {
            return new NitroLimitedQuantityInfoAndroid(maximumQuantity, remainingQuantity);
        }
    }
}
