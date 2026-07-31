package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Ldev/hyo/openiap/DeveloperBillingOptionParamsAndroid;", "", "billingProgram", "Ldev/hyo/openiap/BillingProgramAndroid;", "launchMode", "Ldev/hyo/openiap/DeveloperBillingLaunchModeAndroid;", "linkUri", "", "<init>", "(Ldev/hyo/openiap/BillingProgramAndroid;Ldev/hyo/openiap/DeveloperBillingLaunchModeAndroid;Ljava/lang/String;)V", "getBillingProgram", "()Ldev/hyo/openiap/BillingProgramAndroid;", "getLaunchMode", "()Ldev/hyo/openiap/DeveloperBillingLaunchModeAndroid;", "getLinkUri", "()Ljava/lang/String;", "toJson", "", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DeveloperBillingOptionParamsAndroid {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final BillingProgramAndroid billingProgram;
    private final DeveloperBillingLaunchModeAndroid launchMode;
    private final String linkUri;

    public static /* synthetic */ DeveloperBillingOptionParamsAndroid copy$default(DeveloperBillingOptionParamsAndroid developerBillingOptionParamsAndroid, BillingProgramAndroid billingProgramAndroid, DeveloperBillingLaunchModeAndroid developerBillingLaunchModeAndroid, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            billingProgramAndroid = developerBillingOptionParamsAndroid.billingProgram;
        }
        if ((i & 2) != 0) {
            developerBillingLaunchModeAndroid = developerBillingOptionParamsAndroid.launchMode;
        }
        if ((i & 4) != 0) {
            str = developerBillingOptionParamsAndroid.linkUri;
        }
        return developerBillingOptionParamsAndroid.copy(billingProgramAndroid, developerBillingLaunchModeAndroid, str);
    }

    /* renamed from: component1, reason: from getter */
    public final BillingProgramAndroid getBillingProgram() {
        return this.billingProgram;
    }

    /* renamed from: component2, reason: from getter */
    public final DeveloperBillingLaunchModeAndroid getLaunchMode() {
        return this.launchMode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLinkUri() {
        return this.linkUri;
    }

    public final DeveloperBillingOptionParamsAndroid copy(BillingProgramAndroid billingProgram, DeveloperBillingLaunchModeAndroid launchMode, String linkUri) {
        Intrinsics.checkNotNullParameter(billingProgram, "billingProgram");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(linkUri, "linkUri");
        return new DeveloperBillingOptionParamsAndroid(billingProgram, launchMode, linkUri);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeveloperBillingOptionParamsAndroid)) {
            return false;
        }
        DeveloperBillingOptionParamsAndroid developerBillingOptionParamsAndroid = (DeveloperBillingOptionParamsAndroid) other;
        return this.billingProgram == developerBillingOptionParamsAndroid.billingProgram && this.launchMode == developerBillingOptionParamsAndroid.launchMode && Intrinsics.areEqual(this.linkUri, developerBillingOptionParamsAndroid.linkUri);
    }

    public int hashCode() {
        return (((this.billingProgram.hashCode() * 31) + this.launchMode.hashCode()) * 31) + this.linkUri.hashCode();
    }

    public String toString() {
        return "DeveloperBillingOptionParamsAndroid(billingProgram=" + this.billingProgram + ", launchMode=" + this.launchMode + ", linkUri=" + this.linkUri + ")";
    }

    public DeveloperBillingOptionParamsAndroid(BillingProgramAndroid billingProgram, DeveloperBillingLaunchModeAndroid launchMode, String linkUri) {
        Intrinsics.checkNotNullParameter(billingProgram, "billingProgram");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(linkUri, "linkUri");
        this.billingProgram = billingProgram;
        this.launchMode = launchMode;
        this.linkUri = linkUri;
    }

    public final BillingProgramAndroid getBillingProgram() {
        return this.billingProgram;
    }

    public final DeveloperBillingLaunchModeAndroid getLaunchMode() {
        return this.launchMode;
    }

    public final String getLinkUri() {
        return this.linkUri;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/DeveloperBillingOptionParamsAndroid$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/DeveloperBillingOptionParamsAndroid;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DeveloperBillingOptionParamsAndroid fromJson(Map<String, ? extends Object> json) {
            BillingProgramAndroid billingProgramAndroid;
            DeveloperBillingLaunchModeAndroid developerBillingLaunchModeAndroid;
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("billingProgram");
            String str = obj instanceof String ? (String) obj : null;
            if (str == null || (billingProgramAndroid = BillingProgramAndroid.INSTANCE.fromJson(str)) == null) {
                billingProgramAndroid = BillingProgramAndroid.Unspecified;
            }
            Object obj2 = json.get("launchMode");
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            if (str2 == null || (developerBillingLaunchModeAndroid = DeveloperBillingLaunchModeAndroid.INSTANCE.fromJson(str2)) == null) {
                developerBillingLaunchModeAndroid = DeveloperBillingLaunchModeAndroid.Unspecified;
            }
            Object obj3 = json.get("linkUri");
            String str3 = obj3 instanceof String ? (String) obj3 : null;
            if (str3 == null) {
                return null;
            }
            return new DeveloperBillingOptionParamsAndroid(billingProgramAndroid, developerBillingLaunchModeAndroid, str3);
        }
    }

    public final Map<String, Object> toJson() {
        return MapsKt.mapOf(TuplesKt.to("billingProgram", this.billingProgram.toJson()), TuplesKt.to("launchMode", this.launchMode.toJson()), TuplesKt.to("linkUri", this.linkUri));
    }
}
