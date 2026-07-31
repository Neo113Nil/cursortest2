package gbcorp.c312.merkmarker.info.data.service;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GTSLYApiService.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000bHÆ\u0003Je\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000bHÆ\u0001J\u0014\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020%HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, d2 = {"Lgbcorp/c312/merkmarker/info/data/service/GTSLYRequest;", "", "bundle", "", "fcm_token", "device", "appsFlyerId", "referrer", "language", "timezone", "appsInfo", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getBundle", "()Ljava/lang/String;", "getFcm_token", "getDevice", "getAppsFlyerId", "getReferrer", "getLanguage", "getTimezone", "getAppsInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GTSLYRequest {
    public static final int $stable = 8;
    private final String appsFlyerId;
    private final Map<String, Object> appsInfo;
    private final String bundle;
    private final String device;
    private final String fcm_token;
    private final String language;
    private final String referrer;
    private final String timezone;

    public static /* synthetic */ GTSLYRequest copy$default(GTSLYRequest gTSLYRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gTSLYRequest.bundle;
        }
        if ((i & 2) != 0) {
            str2 = gTSLYRequest.fcm_token;
        }
        if ((i & 4) != 0) {
            str3 = gTSLYRequest.device;
        }
        if ((i & 8) != 0) {
            str4 = gTSLYRequest.appsFlyerId;
        }
        if ((i & 16) != 0) {
            str5 = gTSLYRequest.referrer;
        }
        if ((i & 32) != 0) {
            str6 = gTSLYRequest.language;
        }
        if ((i & 64) != 0) {
            str7 = gTSLYRequest.timezone;
        }
        if ((i & 128) != 0) {
            map = gTSLYRequest.appsInfo;
        }
        String str8 = str7;
        Map map2 = map;
        String str9 = str5;
        String str10 = str6;
        return gTSLYRequest.copy(str, str2, str3, str4, str9, str10, str8, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBundle() {
        return this.bundle;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFcm_token() {
        return this.fcm_token;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDevice() {
        return this.device;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAppsFlyerId() {
        return this.appsFlyerId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getReferrer() {
        return this.referrer;
    }

    /* renamed from: component6, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTimezone() {
        return this.timezone;
    }

    public final Map<String, Object> component8() {
        return this.appsInfo;
    }

    public final GTSLYRequest copy(String bundle, String fcm_token, String device, String appsFlyerId, String referrer, String language, String timezone, Map<String, Object> appsInfo) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(fcm_token, "fcm_token");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(appsFlyerId, "appsFlyerId");
        Intrinsics.checkNotNullParameter(referrer, "referrer");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        Intrinsics.checkNotNullParameter(appsInfo, "appsInfo");
        return new GTSLYRequest(bundle, fcm_token, device, appsFlyerId, referrer, language, timezone, appsInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GTSLYRequest)) {
            return false;
        }
        GTSLYRequest gTSLYRequest = (GTSLYRequest) other;
        return Intrinsics.areEqual(this.bundle, gTSLYRequest.bundle) && Intrinsics.areEqual(this.fcm_token, gTSLYRequest.fcm_token) && Intrinsics.areEqual(this.device, gTSLYRequest.device) && Intrinsics.areEqual(this.appsFlyerId, gTSLYRequest.appsFlyerId) && Intrinsics.areEqual(this.referrer, gTSLYRequest.referrer) && Intrinsics.areEqual(this.language, gTSLYRequest.language) && Intrinsics.areEqual(this.timezone, gTSLYRequest.timezone) && Intrinsics.areEqual(this.appsInfo, gTSLYRequest.appsInfo);
    }

    public int hashCode() {
        return (((((((((((((this.bundle.hashCode() * 31) + this.fcm_token.hashCode()) * 31) + this.device.hashCode()) * 31) + this.appsFlyerId.hashCode()) * 31) + this.referrer.hashCode()) * 31) + this.language.hashCode()) * 31) + this.timezone.hashCode()) * 31) + this.appsInfo.hashCode();
    }

    public String toString() {
        return "GTSLYRequest(bundle=" + this.bundle + ", fcm_token=" + this.fcm_token + ", device=" + this.device + ", appsFlyerId=" + this.appsFlyerId + ", referrer=" + this.referrer + ", language=" + this.language + ", timezone=" + this.timezone + ", appsInfo=" + this.appsInfo + ")";
    }

    public GTSLYRequest(String bundle, String fcm_token, String device, String appsFlyerId, String referrer, String language, String timezone, Map<String, Object> appsInfo) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(fcm_token, "fcm_token");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(appsFlyerId, "appsFlyerId");
        Intrinsics.checkNotNullParameter(referrer, "referrer");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        Intrinsics.checkNotNullParameter(appsInfo, "appsInfo");
        this.bundle = bundle;
        this.fcm_token = fcm_token;
        this.device = device;
        this.appsFlyerId = appsFlyerId;
        this.referrer = referrer;
        this.language = language;
        this.timezone = timezone;
        this.appsInfo = appsInfo;
    }

    public final String getBundle() {
        return this.bundle;
    }

    public final String getFcm_token() {
        return this.fcm_token;
    }

    public final String getDevice() {
        return this.device;
    }

    public final String getAppsFlyerId() {
        return this.appsFlyerId;
    }

    public final String getReferrer() {
        return this.referrer;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    public /* synthetic */ GTSLYRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, (i & 128) != 0 ? new LinkedHashMap() : map);
    }

    public final Map<String, Object> getAppsInfo() {
        return this.appsInfo;
    }
}
