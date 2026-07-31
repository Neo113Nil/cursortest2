package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroBillingProgramAvailabilityResultAndroid.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/margelo/nitro/iap/NitroBillingProgramAvailabilityResultAndroid;", "", "billingProgram", "Lcom/margelo/nitro/iap/BillingProgramAndroid;", "isAvailable", "", "<init>", "(Lcom/margelo/nitro/iap/BillingProgramAndroid;Z)V", "getBillingProgram", "()Lcom/margelo/nitro/iap/BillingProgramAndroid;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NitroBillingProgramAvailabilityResultAndroid {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final BillingProgramAndroid billingProgram;
    private final boolean isAvailable;

    public static /* synthetic */ NitroBillingProgramAvailabilityResultAndroid copy$default(NitroBillingProgramAvailabilityResultAndroid nitroBillingProgramAvailabilityResultAndroid, BillingProgramAndroid billingProgramAndroid, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            billingProgramAndroid = nitroBillingProgramAvailabilityResultAndroid.billingProgram;
        }
        if ((i & 2) != 0) {
            z = nitroBillingProgramAvailabilityResultAndroid.isAvailable;
        }
        return nitroBillingProgramAvailabilityResultAndroid.copy(billingProgramAndroid, z);
    }

    @JvmStatic
    private static final NitroBillingProgramAvailabilityResultAndroid fromCpp(BillingProgramAndroid billingProgramAndroid, boolean z) {
        return INSTANCE.fromCpp(billingProgramAndroid, z);
    }

    /* renamed from: component1, reason: from getter */
    public final BillingProgramAndroid getBillingProgram() {
        return this.billingProgram;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsAvailable() {
        return this.isAvailable;
    }

    public final NitroBillingProgramAvailabilityResultAndroid copy(BillingProgramAndroid billingProgram, boolean isAvailable) {
        Intrinsics.checkNotNullParameter(billingProgram, "billingProgram");
        return new NitroBillingProgramAvailabilityResultAndroid(billingProgram, isAvailable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroBillingProgramAvailabilityResultAndroid)) {
            return false;
        }
        NitroBillingProgramAvailabilityResultAndroid nitroBillingProgramAvailabilityResultAndroid = (NitroBillingProgramAvailabilityResultAndroid) other;
        return this.billingProgram == nitroBillingProgramAvailabilityResultAndroid.billingProgram && this.isAvailable == nitroBillingProgramAvailabilityResultAndroid.isAvailable;
    }

    public int hashCode() {
        return (this.billingProgram.hashCode() * 31) + Boolean.hashCode(this.isAvailable);
    }

    public String toString() {
        return "NitroBillingProgramAvailabilityResultAndroid(billingProgram=" + this.billingProgram + ", isAvailable=" + this.isAvailable + ")";
    }

    public NitroBillingProgramAvailabilityResultAndroid(BillingProgramAndroid billingProgram, boolean z) {
        Intrinsics.checkNotNullParameter(billingProgram, "billingProgram");
        this.billingProgram = billingProgram;
        this.isAvailable = z;
    }

    public final BillingProgramAndroid getBillingProgram() {
        return this.billingProgram;
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    /* compiled from: NitroBillingProgramAvailabilityResultAndroid.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0003¨\u0006\n"}, d2 = {"Lcom/margelo/nitro/iap/NitroBillingProgramAvailabilityResultAndroid$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/NitroBillingProgramAvailabilityResultAndroid;", "billingProgram", "Lcom/margelo/nitro/iap/BillingProgramAndroid;", "isAvailable", "", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroBillingProgramAvailabilityResultAndroid fromCpp(BillingProgramAndroid billingProgram, boolean isAvailable) {
            return new NitroBillingProgramAvailabilityResultAndroid(billingProgram, isAvailable);
        }
    }
}
