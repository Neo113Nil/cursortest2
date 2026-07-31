package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroLaunchExternalLinkParamsAndroid.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/margelo/nitro/iap/NitroLaunchExternalLinkParamsAndroid;", "", "billingProgram", "Lcom/margelo/nitro/iap/BillingProgramAndroid;", "launchMode", "Lcom/margelo/nitro/iap/ExternalLinkLaunchModeAndroid;", "linkType", "Lcom/margelo/nitro/iap/ExternalLinkTypeAndroid;", "linkUri", "", "<init>", "(Lcom/margelo/nitro/iap/BillingProgramAndroid;Lcom/margelo/nitro/iap/ExternalLinkLaunchModeAndroid;Lcom/margelo/nitro/iap/ExternalLinkTypeAndroid;Ljava/lang/String;)V", "getBillingProgram", "()Lcom/margelo/nitro/iap/BillingProgramAndroid;", "getLaunchMode", "()Lcom/margelo/nitro/iap/ExternalLinkLaunchModeAndroid;", "getLinkType", "()Lcom/margelo/nitro/iap/ExternalLinkTypeAndroid;", "getLinkUri", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NitroLaunchExternalLinkParamsAndroid {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final BillingProgramAndroid billingProgram;
    private final ExternalLinkLaunchModeAndroid launchMode;
    private final ExternalLinkTypeAndroid linkType;
    private final String linkUri;

    public static /* synthetic */ NitroLaunchExternalLinkParamsAndroid copy$default(NitroLaunchExternalLinkParamsAndroid nitroLaunchExternalLinkParamsAndroid, BillingProgramAndroid billingProgramAndroid, ExternalLinkLaunchModeAndroid externalLinkLaunchModeAndroid, ExternalLinkTypeAndroid externalLinkTypeAndroid, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            billingProgramAndroid = nitroLaunchExternalLinkParamsAndroid.billingProgram;
        }
        if ((i & 2) != 0) {
            externalLinkLaunchModeAndroid = nitroLaunchExternalLinkParamsAndroid.launchMode;
        }
        if ((i & 4) != 0) {
            externalLinkTypeAndroid = nitroLaunchExternalLinkParamsAndroid.linkType;
        }
        if ((i & 8) != 0) {
            str = nitroLaunchExternalLinkParamsAndroid.linkUri;
        }
        return nitroLaunchExternalLinkParamsAndroid.copy(billingProgramAndroid, externalLinkLaunchModeAndroid, externalLinkTypeAndroid, str);
    }

    @JvmStatic
    private static final NitroLaunchExternalLinkParamsAndroid fromCpp(BillingProgramAndroid billingProgramAndroid, ExternalLinkLaunchModeAndroid externalLinkLaunchModeAndroid, ExternalLinkTypeAndroid externalLinkTypeAndroid, String str) {
        return INSTANCE.fromCpp(billingProgramAndroid, externalLinkLaunchModeAndroid, externalLinkTypeAndroid, str);
    }

    /* renamed from: component1, reason: from getter */
    public final BillingProgramAndroid getBillingProgram() {
        return this.billingProgram;
    }

    /* renamed from: component2, reason: from getter */
    public final ExternalLinkLaunchModeAndroid getLaunchMode() {
        return this.launchMode;
    }

    /* renamed from: component3, reason: from getter */
    public final ExternalLinkTypeAndroid getLinkType() {
        return this.linkType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLinkUri() {
        return this.linkUri;
    }

    public final NitroLaunchExternalLinkParamsAndroid copy(BillingProgramAndroid billingProgram, ExternalLinkLaunchModeAndroid launchMode, ExternalLinkTypeAndroid linkType, String linkUri) {
        Intrinsics.checkNotNullParameter(billingProgram, "billingProgram");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(linkType, "linkType");
        Intrinsics.checkNotNullParameter(linkUri, "linkUri");
        return new NitroLaunchExternalLinkParamsAndroid(billingProgram, launchMode, linkType, linkUri);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroLaunchExternalLinkParamsAndroid)) {
            return false;
        }
        NitroLaunchExternalLinkParamsAndroid nitroLaunchExternalLinkParamsAndroid = (NitroLaunchExternalLinkParamsAndroid) other;
        return this.billingProgram == nitroLaunchExternalLinkParamsAndroid.billingProgram && this.launchMode == nitroLaunchExternalLinkParamsAndroid.launchMode && this.linkType == nitroLaunchExternalLinkParamsAndroid.linkType && Intrinsics.areEqual(this.linkUri, nitroLaunchExternalLinkParamsAndroid.linkUri);
    }

    public int hashCode() {
        return (((((this.billingProgram.hashCode() * 31) + this.launchMode.hashCode()) * 31) + this.linkType.hashCode()) * 31) + this.linkUri.hashCode();
    }

    public String toString() {
        return "NitroLaunchExternalLinkParamsAndroid(billingProgram=" + this.billingProgram + ", launchMode=" + this.launchMode + ", linkType=" + this.linkType + ", linkUri=" + this.linkUri + ")";
    }

    public NitroLaunchExternalLinkParamsAndroid(BillingProgramAndroid billingProgram, ExternalLinkLaunchModeAndroid launchMode, ExternalLinkTypeAndroid linkType, String linkUri) {
        Intrinsics.checkNotNullParameter(billingProgram, "billingProgram");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(linkType, "linkType");
        Intrinsics.checkNotNullParameter(linkUri, "linkUri");
        this.billingProgram = billingProgram;
        this.launchMode = launchMode;
        this.linkType = linkType;
        this.linkUri = linkUri;
    }

    public final BillingProgramAndroid getBillingProgram() {
        return this.billingProgram;
    }

    public final ExternalLinkLaunchModeAndroid getLaunchMode() {
        return this.launchMode;
    }

    public final ExternalLinkTypeAndroid getLinkType() {
        return this.linkType;
    }

    public final String getLinkUri() {
        return this.linkUri;
    }

    /* compiled from: NitroLaunchExternalLinkParamsAndroid.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0003¨\u0006\u000e"}, d2 = {"Lcom/margelo/nitro/iap/NitroLaunchExternalLinkParamsAndroid$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/NitroLaunchExternalLinkParamsAndroid;", "billingProgram", "Lcom/margelo/nitro/iap/BillingProgramAndroid;", "launchMode", "Lcom/margelo/nitro/iap/ExternalLinkLaunchModeAndroid;", "linkType", "Lcom/margelo/nitro/iap/ExternalLinkTypeAndroid;", "linkUri", "", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroLaunchExternalLinkParamsAndroid fromCpp(BillingProgramAndroid billingProgram, ExternalLinkLaunchModeAndroid launchMode, ExternalLinkTypeAndroid linkType, String linkUri) {
            return new NitroLaunchExternalLinkParamsAndroid(billingProgram, launchMode, linkType, linkUri);
        }
    }
}
