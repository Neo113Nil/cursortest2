package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroBillingProgramReportingDetailsAndroid.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/margelo/nitro/iap/NitroBillingProgramReportingDetailsAndroid;", "", "billingProgram", "Lcom/margelo/nitro/iap/BillingProgramAndroid;", "externalTransactionToken", "", "<init>", "(Lcom/margelo/nitro/iap/BillingProgramAndroid;Ljava/lang/String;)V", "getBillingProgram", "()Lcom/margelo/nitro/iap/BillingProgramAndroid;", "getExternalTransactionToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NitroBillingProgramReportingDetailsAndroid {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final BillingProgramAndroid billingProgram;
    private final String externalTransactionToken;

    public static /* synthetic */ NitroBillingProgramReportingDetailsAndroid copy$default(NitroBillingProgramReportingDetailsAndroid nitroBillingProgramReportingDetailsAndroid, BillingProgramAndroid billingProgramAndroid, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            billingProgramAndroid = nitroBillingProgramReportingDetailsAndroid.billingProgram;
        }
        if ((i & 2) != 0) {
            str = nitroBillingProgramReportingDetailsAndroid.externalTransactionToken;
        }
        return nitroBillingProgramReportingDetailsAndroid.copy(billingProgramAndroid, str);
    }

    @JvmStatic
    private static final NitroBillingProgramReportingDetailsAndroid fromCpp(BillingProgramAndroid billingProgramAndroid, String str) {
        return INSTANCE.fromCpp(billingProgramAndroid, str);
    }

    /* renamed from: component1, reason: from getter */
    public final BillingProgramAndroid getBillingProgram() {
        return this.billingProgram;
    }

    /* renamed from: component2, reason: from getter */
    public final String getExternalTransactionToken() {
        return this.externalTransactionToken;
    }

    public final NitroBillingProgramReportingDetailsAndroid copy(BillingProgramAndroid billingProgram, String externalTransactionToken) {
        Intrinsics.checkNotNullParameter(billingProgram, "billingProgram");
        Intrinsics.checkNotNullParameter(externalTransactionToken, "externalTransactionToken");
        return new NitroBillingProgramReportingDetailsAndroid(billingProgram, externalTransactionToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroBillingProgramReportingDetailsAndroid)) {
            return false;
        }
        NitroBillingProgramReportingDetailsAndroid nitroBillingProgramReportingDetailsAndroid = (NitroBillingProgramReportingDetailsAndroid) other;
        return this.billingProgram == nitroBillingProgramReportingDetailsAndroid.billingProgram && Intrinsics.areEqual(this.externalTransactionToken, nitroBillingProgramReportingDetailsAndroid.externalTransactionToken);
    }

    public int hashCode() {
        return (this.billingProgram.hashCode() * 31) + this.externalTransactionToken.hashCode();
    }

    public String toString() {
        return "NitroBillingProgramReportingDetailsAndroid(billingProgram=" + this.billingProgram + ", externalTransactionToken=" + this.externalTransactionToken + ")";
    }

    public NitroBillingProgramReportingDetailsAndroid(BillingProgramAndroid billingProgram, String externalTransactionToken) {
        Intrinsics.checkNotNullParameter(billingProgram, "billingProgram");
        Intrinsics.checkNotNullParameter(externalTransactionToken, "externalTransactionToken");
        this.billingProgram = billingProgram;
        this.externalTransactionToken = externalTransactionToken;
    }

    public final BillingProgramAndroid getBillingProgram() {
        return this.billingProgram;
    }

    public final String getExternalTransactionToken() {
        return this.externalTransactionToken;
    }

    /* compiled from: NitroBillingProgramReportingDetailsAndroid.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0003¨\u0006\n"}, d2 = {"Lcom/margelo/nitro/iap/NitroBillingProgramReportingDetailsAndroid$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/NitroBillingProgramReportingDetailsAndroid;", "billingProgram", "Lcom/margelo/nitro/iap/BillingProgramAndroid;", "externalTransactionToken", "", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroBillingProgramReportingDetailsAndroid fromCpp(BillingProgramAndroid billingProgram, String externalTransactionToken) {
            return new NitroBillingProgramReportingDetailsAndroid(billingProgram, externalTransactionToken);
        }
    }
}
