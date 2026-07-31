package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0001;B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010%J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010!J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u0096\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u00104J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0014¨\u0006<"}, d2 = {"Ldev/hyo/openiap/AppTransaction;", "", "appId", "", "appTransactionId", "", "appVersion", "appVersionId", "bundleId", "deviceVerification", "deviceVerificationNonce", "environment", "originalAppVersion", "originalPlatform", "originalPurchaseDate", "preorderDate", "signedDate", "<init>", "(DLjava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/Double;D)V", "getAppId", "()D", "getAppTransactionId", "()Ljava/lang/String;", "getAppVersion", "getAppVersionId", "getBundleId", "getDeviceVerification", "getDeviceVerificationNonce", "getEnvironment", "getOriginalAppVersion", "getOriginalPlatform", "getOriginalPurchaseDate", "getPreorderDate", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getSignedDate", "toJson", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(DLjava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/Double;D)Ldev/hyo/openiap/AppTransaction;", "equals", "", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AppTransaction {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final double appId;
    private final String appTransactionId;
    private final String appVersion;
    private final double appVersionId;
    private final String bundleId;
    private final String deviceVerification;
    private final String deviceVerificationNonce;
    private final String environment;
    private final String originalAppVersion;
    private final String originalPlatform;
    private final double originalPurchaseDate;
    private final Double preorderDate;
    private final double signedDate;

    public static /* synthetic */ AppTransaction copy$default(AppTransaction appTransaction, double d, String str, String str2, double d2, String str3, String str4, String str5, String str6, String str7, String str8, double d3, Double d4, double d5, int i, Object obj) {
        double d6;
        Double d7;
        double d8 = (i & 1) != 0 ? appTransaction.appId : d;
        String str9 = (i & 2) != 0 ? appTransaction.appTransactionId : str;
        String str10 = (i & 4) != 0 ? appTransaction.appVersion : str2;
        double d9 = (i & 8) != 0 ? appTransaction.appVersionId : d2;
        String str11 = (i & 16) != 0 ? appTransaction.bundleId : str3;
        String str12 = (i & 32) != 0 ? appTransaction.deviceVerification : str4;
        String str13 = (i & 64) != 0 ? appTransaction.deviceVerificationNonce : str5;
        String str14 = (i & 128) != 0 ? appTransaction.environment : str6;
        String str15 = (i & 256) != 0 ? appTransaction.originalAppVersion : str7;
        String str16 = (i & 512) != 0 ? appTransaction.originalPlatform : str8;
        double d10 = (i & 1024) != 0 ? appTransaction.originalPurchaseDate : d3;
        double d11 = d8;
        Double d12 = (i & 2048) != 0 ? appTransaction.preorderDate : d4;
        if ((i & 4096) != 0) {
            d7 = d12;
            d6 = appTransaction.signedDate;
        } else {
            d6 = d5;
            d7 = d12;
        }
        return appTransaction.copy(d11, str9, str10, d9, str11, str12, str13, str14, str15, str16, d10, d7, d6);
    }

    /* renamed from: component1, reason: from getter */
    public final double getAppId() {
        return this.appId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getOriginalPlatform() {
        return this.originalPlatform;
    }

    /* renamed from: component11, reason: from getter */
    public final double getOriginalPurchaseDate() {
        return this.originalPurchaseDate;
    }

    /* renamed from: component12, reason: from getter */
    public final Double getPreorderDate() {
        return this.preorderDate;
    }

    /* renamed from: component13, reason: from getter */
    public final double getSignedDate() {
        return this.signedDate;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAppTransactionId() {
        return this.appTransactionId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    /* renamed from: component4, reason: from getter */
    public final double getAppVersionId() {
        return this.appVersionId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBundleId() {
        return this.bundleId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDeviceVerification() {
        return this.deviceVerification;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDeviceVerificationNonce() {
        return this.deviceVerificationNonce;
    }

    /* renamed from: component8, reason: from getter */
    public final String getEnvironment() {
        return this.environment;
    }

    /* renamed from: component9, reason: from getter */
    public final String getOriginalAppVersion() {
        return this.originalAppVersion;
    }

    public final AppTransaction copy(double appId, String appTransactionId, String appVersion, double appVersionId, String bundleId, String deviceVerification, String deviceVerificationNonce, String environment, String originalAppVersion, String originalPlatform, double originalPurchaseDate, Double preorderDate, double signedDate) {
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        Intrinsics.checkNotNullParameter(deviceVerification, "deviceVerification");
        Intrinsics.checkNotNullParameter(deviceVerificationNonce, "deviceVerificationNonce");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(originalAppVersion, "originalAppVersion");
        return new AppTransaction(appId, appTransactionId, appVersion, appVersionId, bundleId, deviceVerification, deviceVerificationNonce, environment, originalAppVersion, originalPlatform, originalPurchaseDate, preorderDate, signedDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppTransaction)) {
            return false;
        }
        AppTransaction appTransaction = (AppTransaction) other;
        return Double.compare(this.appId, appTransaction.appId) == 0 && Intrinsics.areEqual(this.appTransactionId, appTransaction.appTransactionId) && Intrinsics.areEqual(this.appVersion, appTransaction.appVersion) && Double.compare(this.appVersionId, appTransaction.appVersionId) == 0 && Intrinsics.areEqual(this.bundleId, appTransaction.bundleId) && Intrinsics.areEqual(this.deviceVerification, appTransaction.deviceVerification) && Intrinsics.areEqual(this.deviceVerificationNonce, appTransaction.deviceVerificationNonce) && Intrinsics.areEqual(this.environment, appTransaction.environment) && Intrinsics.areEqual(this.originalAppVersion, appTransaction.originalAppVersion) && Intrinsics.areEqual(this.originalPlatform, appTransaction.originalPlatform) && Double.compare(this.originalPurchaseDate, appTransaction.originalPurchaseDate) == 0 && Intrinsics.areEqual((Object) this.preorderDate, (Object) appTransaction.preorderDate) && Double.compare(this.signedDate, appTransaction.signedDate) == 0;
    }

    public int hashCode() {
        int hashCode = Double.hashCode(this.appId) * 31;
        String str = this.appTransactionId;
        int hashCode2 = (((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.appVersion.hashCode()) * 31) + Double.hashCode(this.appVersionId)) * 31) + this.bundleId.hashCode()) * 31) + this.deviceVerification.hashCode()) * 31) + this.deviceVerificationNonce.hashCode()) * 31) + this.environment.hashCode()) * 31) + this.originalAppVersion.hashCode()) * 31;
        String str2 = this.originalPlatform;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Double.hashCode(this.originalPurchaseDate)) * 31;
        Double d = this.preorderDate;
        return ((hashCode3 + (d != null ? d.hashCode() : 0)) * 31) + Double.hashCode(this.signedDate);
    }

    public String toString() {
        return "AppTransaction(appId=" + this.appId + ", appTransactionId=" + this.appTransactionId + ", appVersion=" + this.appVersion + ", appVersionId=" + this.appVersionId + ", bundleId=" + this.bundleId + ", deviceVerification=" + this.deviceVerification + ", deviceVerificationNonce=" + this.deviceVerificationNonce + ", environment=" + this.environment + ", originalAppVersion=" + this.originalAppVersion + ", originalPlatform=" + this.originalPlatform + ", originalPurchaseDate=" + this.originalPurchaseDate + ", preorderDate=" + this.preorderDate + ", signedDate=" + this.signedDate + ")";
    }

    public AppTransaction(double d, String str, String appVersion, double d2, String bundleId, String deviceVerification, String deviceVerificationNonce, String environment, String originalAppVersion, String str2, double d3, Double d4, double d5) {
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        Intrinsics.checkNotNullParameter(deviceVerification, "deviceVerification");
        Intrinsics.checkNotNullParameter(deviceVerificationNonce, "deviceVerificationNonce");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(originalAppVersion, "originalAppVersion");
        this.appId = d;
        this.appTransactionId = str;
        this.appVersion = appVersion;
        this.appVersionId = d2;
        this.bundleId = bundleId;
        this.deviceVerification = deviceVerification;
        this.deviceVerificationNonce = deviceVerificationNonce;
        this.environment = environment;
        this.originalAppVersion = originalAppVersion;
        this.originalPlatform = str2;
        this.originalPurchaseDate = d3;
        this.preorderDate = d4;
        this.signedDate = d5;
    }

    public /* synthetic */ AppTransaction(double d, String str, String str2, double d2, String str3, String str4, String str5, String str6, String str7, String str8, double d3, Double d4, double d5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, (i & 2) != 0 ? null : str, str2, d2, str3, str4, str5, str6, str7, (i & 512) != 0 ? null : str8, d3, (i & 2048) != 0 ? null : d4, d5);
    }

    public final double getAppId() {
        return this.appId;
    }

    public final String getAppTransactionId() {
        return this.appTransactionId;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final double getAppVersionId() {
        return this.appVersionId;
    }

    public final String getBundleId() {
        return this.bundleId;
    }

    public final String getDeviceVerification() {
        return this.deviceVerification;
    }

    public final String getDeviceVerificationNonce() {
        return this.deviceVerificationNonce;
    }

    public final String getEnvironment() {
        return this.environment;
    }

    public final String getOriginalAppVersion() {
        return this.originalAppVersion;
    }

    public final String getOriginalPlatform() {
        return this.originalPlatform;
    }

    public final double getOriginalPurchaseDate() {
        return this.originalPurchaseDate;
    }

    public final Double getPreorderDate() {
        return this.preorderDate;
    }

    public final double getSignedDate() {
        return this.signedDate;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/AppTransaction$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/AppTransaction;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
            	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
            	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
            */
        public final dev.hyo.openiap.AppTransaction fromJson(java.util.Map<java.lang.String, ? extends java.lang.Object> r26) {
            /*
                Method dump skipped, instructions count: 319
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: dev.hyo.openiap.AppTransaction.Companion.fromJson(java.util.Map):dev.hyo.openiap.AppTransaction");
        }
    }

    public final Map<String, Object> toJson() {
        return MapsKt.mapOf(TuplesKt.to("__typename", "AppTransaction"), TuplesKt.to("appId", Double.valueOf(this.appId)), TuplesKt.to("appTransactionId", this.appTransactionId), TuplesKt.to("appVersion", this.appVersion), TuplesKt.to("appVersionId", Double.valueOf(this.appVersionId)), TuplesKt.to("bundleId", this.bundleId), TuplesKt.to("deviceVerification", this.deviceVerification), TuplesKt.to("deviceVerificationNonce", this.deviceVerificationNonce), TuplesKt.to("environment", this.environment), TuplesKt.to("originalAppVersion", this.originalAppVersion), TuplesKt.to("originalPlatform", this.originalPlatform), TuplesKt.to("originalPurchaseDate", Double.valueOf(this.originalPurchaseDate)), TuplesKt.to("preorderDate", this.preorderDate), TuplesKt.to("signedDate", Double.valueOf(this.signedDate)));
    }
}
