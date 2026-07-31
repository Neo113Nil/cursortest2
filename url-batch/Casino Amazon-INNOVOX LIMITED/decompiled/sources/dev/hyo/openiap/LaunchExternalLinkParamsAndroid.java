package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001!B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Ldev/hyo/openiap/LaunchExternalLinkParamsAndroid;", "", "billingProgram", "Ldev/hyo/openiap/BillingProgramAndroid;", "launchMode", "Ldev/hyo/openiap/ExternalLinkLaunchModeAndroid;", "linkType", "Ldev/hyo/openiap/ExternalLinkTypeAndroid;", "linkUri", "", "<init>", "(Ldev/hyo/openiap/BillingProgramAndroid;Ldev/hyo/openiap/ExternalLinkLaunchModeAndroid;Ldev/hyo/openiap/ExternalLinkTypeAndroid;Ljava/lang/String;)V", "getBillingProgram", "()Ldev/hyo/openiap/BillingProgramAndroid;", "getLaunchMode", "()Ldev/hyo/openiap/ExternalLinkLaunchModeAndroid;", "getLinkType", "()Ldev/hyo/openiap/ExternalLinkTypeAndroid;", "getLinkUri", "()Ljava/lang/String;", "toJson", "", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LaunchExternalLinkParamsAndroid {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final BillingProgramAndroid billingProgram;
    private final ExternalLinkLaunchModeAndroid launchMode;
    private final ExternalLinkTypeAndroid linkType;
    private final String linkUri;

    public static /* synthetic */ LaunchExternalLinkParamsAndroid copy$default(LaunchExternalLinkParamsAndroid launchExternalLinkParamsAndroid, BillingProgramAndroid billingProgramAndroid, ExternalLinkLaunchModeAndroid externalLinkLaunchModeAndroid, ExternalLinkTypeAndroid externalLinkTypeAndroid, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            billingProgramAndroid = launchExternalLinkParamsAndroid.billingProgram;
        }
        if ((i & 2) != 0) {
            externalLinkLaunchModeAndroid = launchExternalLinkParamsAndroid.launchMode;
        }
        if ((i & 4) != 0) {
            externalLinkTypeAndroid = launchExternalLinkParamsAndroid.linkType;
        }
        if ((i & 8) != 0) {
            str = launchExternalLinkParamsAndroid.linkUri;
        }
        return launchExternalLinkParamsAndroid.copy(billingProgramAndroid, externalLinkLaunchModeAndroid, externalLinkTypeAndroid, str);
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

    public final LaunchExternalLinkParamsAndroid copy(BillingProgramAndroid billingProgram, ExternalLinkLaunchModeAndroid launchMode, ExternalLinkTypeAndroid linkType, String linkUri) {
        Intrinsics.checkNotNullParameter(billingProgram, "billingProgram");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(linkType, "linkType");
        Intrinsics.checkNotNullParameter(linkUri, "linkUri");
        return new LaunchExternalLinkParamsAndroid(billingProgram, launchMode, linkType, linkUri);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LaunchExternalLinkParamsAndroid)) {
            return false;
        }
        LaunchExternalLinkParamsAndroid launchExternalLinkParamsAndroid = (LaunchExternalLinkParamsAndroid) other;
        return this.billingProgram == launchExternalLinkParamsAndroid.billingProgram && this.launchMode == launchExternalLinkParamsAndroid.launchMode && this.linkType == launchExternalLinkParamsAndroid.linkType && Intrinsics.areEqual(this.linkUri, launchExternalLinkParamsAndroid.linkUri);
    }

    public int hashCode() {
        return (((((this.billingProgram.hashCode() * 31) + this.launchMode.hashCode()) * 31) + this.linkType.hashCode()) * 31) + this.linkUri.hashCode();
    }

    public String toString() {
        return "LaunchExternalLinkParamsAndroid(billingProgram=" + this.billingProgram + ", launchMode=" + this.launchMode + ", linkType=" + this.linkType + ", linkUri=" + this.linkUri + ")";
    }

    public LaunchExternalLinkParamsAndroid(BillingProgramAndroid billingProgram, ExternalLinkLaunchModeAndroid launchMode, ExternalLinkTypeAndroid linkType, String linkUri) {
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

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/LaunchExternalLinkParamsAndroid$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/LaunchExternalLinkParamsAndroid;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LaunchExternalLinkParamsAndroid fromJson(Map<String, ? extends Object> json) {
            BillingProgramAndroid billingProgramAndroid;
            ExternalLinkLaunchModeAndroid externalLinkLaunchModeAndroid;
            ExternalLinkTypeAndroid externalLinkTypeAndroid;
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("billingProgram");
            String str = obj instanceof String ? (String) obj : null;
            if (str == null || (billingProgramAndroid = BillingProgramAndroid.INSTANCE.fromJson(str)) == null) {
                billingProgramAndroid = BillingProgramAndroid.Unspecified;
            }
            Object obj2 = json.get("launchMode");
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            if (str2 == null || (externalLinkLaunchModeAndroid = ExternalLinkLaunchModeAndroid.INSTANCE.fromJson(str2)) == null) {
                externalLinkLaunchModeAndroid = ExternalLinkLaunchModeAndroid.Unspecified;
            }
            Object obj3 = json.get("linkType");
            String str3 = obj3 instanceof String ? (String) obj3 : null;
            if (str3 == null || (externalLinkTypeAndroid = ExternalLinkTypeAndroid.INSTANCE.fromJson(str3)) == null) {
                externalLinkTypeAndroid = ExternalLinkTypeAndroid.Unspecified;
            }
            Object obj4 = json.get("linkUri");
            String str4 = obj4 instanceof String ? (String) obj4 : null;
            if (str4 == null) {
                return null;
            }
            return new LaunchExternalLinkParamsAndroid(billingProgramAndroid, externalLinkLaunchModeAndroid, externalLinkTypeAndroid, str4);
        }
    }

    public final Map<String, Object> toJson() {
        return MapsKt.mapOf(TuplesKt.to("billingProgram", this.billingProgram.toJson()), TuplesKt.to("launchMode", this.launchMode.toJson()), TuplesKt.to("linkType", this.linkType.toJson()), TuplesKt.to("linkUri", this.linkUri));
    }
}
