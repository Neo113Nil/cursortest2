package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroRentalDetailsAndroid.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/margelo/nitro/iap/NitroRentalDetailsAndroid;", "", "rentalExpirationPeriod", "Lcom/margelo/nitro/iap/Variant_NullType_String;", "rentalPeriod", "", "<init>", "(Lcom/margelo/nitro/iap/Variant_NullType_String;Ljava/lang/String;)V", "getRentalExpirationPeriod", "()Lcom/margelo/nitro/iap/Variant_NullType_String;", "getRentalPeriod", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NitroRentalDetailsAndroid {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Variant_NullType_String rentalExpirationPeriod;
    private final String rentalPeriod;

    public static /* synthetic */ NitroRentalDetailsAndroid copy$default(NitroRentalDetailsAndroid nitroRentalDetailsAndroid, Variant_NullType_String variant_NullType_String, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            variant_NullType_String = nitroRentalDetailsAndroid.rentalExpirationPeriod;
        }
        if ((i & 2) != 0) {
            str = nitroRentalDetailsAndroid.rentalPeriod;
        }
        return nitroRentalDetailsAndroid.copy(variant_NullType_String, str);
    }

    @JvmStatic
    private static final NitroRentalDetailsAndroid fromCpp(Variant_NullType_String variant_NullType_String, String str) {
        return INSTANCE.fromCpp(variant_NullType_String, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Variant_NullType_String getRentalExpirationPeriod() {
        return this.rentalExpirationPeriod;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRentalPeriod() {
        return this.rentalPeriod;
    }

    public final NitroRentalDetailsAndroid copy(Variant_NullType_String rentalExpirationPeriod, String rentalPeriod) {
        Intrinsics.checkNotNullParameter(rentalPeriod, "rentalPeriod");
        return new NitroRentalDetailsAndroid(rentalExpirationPeriod, rentalPeriod);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroRentalDetailsAndroid)) {
            return false;
        }
        NitroRentalDetailsAndroid nitroRentalDetailsAndroid = (NitroRentalDetailsAndroid) other;
        return Intrinsics.areEqual(this.rentalExpirationPeriod, nitroRentalDetailsAndroid.rentalExpirationPeriod) && Intrinsics.areEqual(this.rentalPeriod, nitroRentalDetailsAndroid.rentalPeriod);
    }

    public int hashCode() {
        Variant_NullType_String variant_NullType_String = this.rentalExpirationPeriod;
        return ((variant_NullType_String == null ? 0 : variant_NullType_String.hashCode()) * 31) + this.rentalPeriod.hashCode();
    }

    public String toString() {
        return "NitroRentalDetailsAndroid(rentalExpirationPeriod=" + this.rentalExpirationPeriod + ", rentalPeriod=" + this.rentalPeriod + ")";
    }

    public NitroRentalDetailsAndroid(Variant_NullType_String variant_NullType_String, String rentalPeriod) {
        Intrinsics.checkNotNullParameter(rentalPeriod, "rentalPeriod");
        this.rentalExpirationPeriod = variant_NullType_String;
        this.rentalPeriod = rentalPeriod;
    }

    public final Variant_NullType_String getRentalExpirationPeriod() {
        return this.rentalExpirationPeriod;
    }

    public final String getRentalPeriod() {
        return this.rentalPeriod;
    }

    /* compiled from: NitroRentalDetailsAndroid.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0003¨\u0006\n"}, d2 = {"Lcom/margelo/nitro/iap/NitroRentalDetailsAndroid$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/NitroRentalDetailsAndroid;", "rentalExpirationPeriod", "Lcom/margelo/nitro/iap/Variant_NullType_String;", "rentalPeriod", "", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroRentalDetailsAndroid fromCpp(Variant_NullType_String rentalExpirationPeriod, String rentalPeriod) {
            return new NitroRentalDetailsAndroid(rentalExpirationPeriod, rentalPeriod);
        }
    }
}
