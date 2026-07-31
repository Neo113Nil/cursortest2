package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: InitConnectionConfig.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/margelo/nitro/iap/InitConnectionConfig;", "", "alternativeBillingModeAndroid", "Lcom/margelo/nitro/iap/AlternativeBillingModeAndroid;", "enableBillingProgramAndroid", "Lcom/margelo/nitro/iap/BillingProgramAndroid;", "<init>", "(Lcom/margelo/nitro/iap/AlternativeBillingModeAndroid;Lcom/margelo/nitro/iap/BillingProgramAndroid;)V", "getAlternativeBillingModeAndroid", "()Lcom/margelo/nitro/iap/AlternativeBillingModeAndroid;", "getEnableBillingProgramAndroid", "()Lcom/margelo/nitro/iap/BillingProgramAndroid;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class InitConnectionConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AlternativeBillingModeAndroid alternativeBillingModeAndroid;
    private final BillingProgramAndroid enableBillingProgramAndroid;

    public static /* synthetic */ InitConnectionConfig copy$default(InitConnectionConfig initConnectionConfig, AlternativeBillingModeAndroid alternativeBillingModeAndroid, BillingProgramAndroid billingProgramAndroid, int i, Object obj) {
        if ((i & 1) != 0) {
            alternativeBillingModeAndroid = initConnectionConfig.alternativeBillingModeAndroid;
        }
        if ((i & 2) != 0) {
            billingProgramAndroid = initConnectionConfig.enableBillingProgramAndroid;
        }
        return initConnectionConfig.copy(alternativeBillingModeAndroid, billingProgramAndroid);
    }

    @JvmStatic
    private static final InitConnectionConfig fromCpp(AlternativeBillingModeAndroid alternativeBillingModeAndroid, BillingProgramAndroid billingProgramAndroid) {
        return INSTANCE.fromCpp(alternativeBillingModeAndroid, billingProgramAndroid);
    }

    /* renamed from: component1, reason: from getter */
    public final AlternativeBillingModeAndroid getAlternativeBillingModeAndroid() {
        return this.alternativeBillingModeAndroid;
    }

    /* renamed from: component2, reason: from getter */
    public final BillingProgramAndroid getEnableBillingProgramAndroid() {
        return this.enableBillingProgramAndroid;
    }

    public final InitConnectionConfig copy(AlternativeBillingModeAndroid alternativeBillingModeAndroid, BillingProgramAndroid enableBillingProgramAndroid) {
        return new InitConnectionConfig(alternativeBillingModeAndroid, enableBillingProgramAndroid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitConnectionConfig)) {
            return false;
        }
        InitConnectionConfig initConnectionConfig = (InitConnectionConfig) other;
        return this.alternativeBillingModeAndroid == initConnectionConfig.alternativeBillingModeAndroid && this.enableBillingProgramAndroid == initConnectionConfig.enableBillingProgramAndroid;
    }

    public int hashCode() {
        AlternativeBillingModeAndroid alternativeBillingModeAndroid = this.alternativeBillingModeAndroid;
        int hashCode = (alternativeBillingModeAndroid == null ? 0 : alternativeBillingModeAndroid.hashCode()) * 31;
        BillingProgramAndroid billingProgramAndroid = this.enableBillingProgramAndroid;
        return hashCode + (billingProgramAndroid != null ? billingProgramAndroid.hashCode() : 0);
    }

    public String toString() {
        return "InitConnectionConfig(alternativeBillingModeAndroid=" + this.alternativeBillingModeAndroid + ", enableBillingProgramAndroid=" + this.enableBillingProgramAndroid + ")";
    }

    public InitConnectionConfig(AlternativeBillingModeAndroid alternativeBillingModeAndroid, BillingProgramAndroid billingProgramAndroid) {
        this.alternativeBillingModeAndroid = alternativeBillingModeAndroid;
        this.enableBillingProgramAndroid = billingProgramAndroid;
    }

    public final AlternativeBillingModeAndroid getAlternativeBillingModeAndroid() {
        return this.alternativeBillingModeAndroid;
    }

    public final BillingProgramAndroid getEnableBillingProgramAndroid() {
        return this.enableBillingProgramAndroid;
    }

    /* compiled from: InitConnectionConfig.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0003¨\u0006\n"}, d2 = {"Lcom/margelo/nitro/iap/InitConnectionConfig$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/InitConnectionConfig;", "alternativeBillingModeAndroid", "Lcom/margelo/nitro/iap/AlternativeBillingModeAndroid;", "enableBillingProgramAndroid", "Lcom/margelo/nitro/iap/BillingProgramAndroid;", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final InitConnectionConfig fromCpp(AlternativeBillingModeAndroid alternativeBillingModeAndroid, BillingProgramAndroid enableBillingProgramAndroid) {
            return new InitConnectionConfig(alternativeBillingModeAndroid, enableBillingProgramAndroid);
        }
    }
}
