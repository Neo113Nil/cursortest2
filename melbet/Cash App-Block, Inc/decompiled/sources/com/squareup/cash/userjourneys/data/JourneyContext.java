package com.squareup.cash.userjourneys.data;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003Jg\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010'\u001a\u00020(HÖ\u0081\u0004J\n\u0010)\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000f¨\u0006*"}, d2 = {"Lcom/squareup/cash/userjourneys/data/JourneyContext;", "", "entityId", "", "sessionId", "appToken", "platformName", "platformVersion", "deviceModel", "appName", "appVersion", "locale", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEntityId", "()Ljava/lang/String;", "getSessionId$annotations", "()V", "getSessionId", "getAppToken", "getPlatformName", "getPlatformVersion", "getDeviceModel", "getAppName", "getAppVersion", "getLocale", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class JourneyContext {
    private final String appName;
    private final String appToken;
    private final String appVersion;
    private final String deviceModel;
    private final String entityId;
    private final String locale;
    private final String platformName;
    private final String platformVersion;
    private final String sessionId;

    public JourneyContext(String str, @Json(name = "sessionToken") String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, str4, str5, str6, str7);
        str8.getClass();
        str9.getClass();
        this.entityId = str;
        this.sessionId = str2;
        this.appToken = str3;
        this.platformName = str4;
        this.platformVersion = str5;
        this.deviceModel = str6;
        this.appName = str7;
        this.appVersion = str8;
        this.locale = str9;
    }

    public static /* synthetic */ JourneyContext copy$default(JourneyContext journeyContext, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = journeyContext.entityId;
        }
        if ((i & 2) != 0) {
            str2 = journeyContext.sessionId;
        }
        if ((i & 4) != 0) {
            str3 = journeyContext.appToken;
        }
        if ((i & 8) != 0) {
            str4 = journeyContext.platformName;
        }
        if ((i & 16) != 0) {
            str5 = journeyContext.platformVersion;
        }
        if ((i & 32) != 0) {
            str6 = journeyContext.deviceModel;
        }
        if ((i & 64) != 0) {
            str7 = journeyContext.appName;
        }
        if ((i & 128) != 0) {
            str8 = journeyContext.appVersion;
        }
        if ((i & 256) != 0) {
            str9 = journeyContext.locale;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str5;
        String str15 = str3;
        return journeyContext.copy(str, str2, str15, str4, str14, str12, str13, str10, str11);
    }

    @Json(name = "sessionToken")
    public static /* synthetic */ void getSessionId$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getEntityId() {
        return this.entityId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAppToken() {
        return this.appToken;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPlatformName() {
        return this.platformName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPlatformVersion() {
        return this.platformVersion;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    /* renamed from: component8, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    /* renamed from: component9, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    public final JourneyContext copy(String entityId, @Json(name = "sessionToken") String sessionId, String appToken, String platformName, String platformVersion, String deviceModel, String appName, String appVersion, String locale) {
        BalanceFeedKt$$ExternalSyntheticOutline0.m(sessionId, platformName, platformVersion, deviceModel, appName);
        appVersion.getClass();
        locale.getClass();
        return new JourneyContext(entityId, sessionId, appToken, platformName, platformVersion, deviceModel, appName, appVersion, locale);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JourneyContext)) {
            return false;
        }
        JourneyContext journeyContext = (JourneyContext) other;
        return Intrinsics.areEqual(this.entityId, journeyContext.entityId) && Intrinsics.areEqual(this.sessionId, journeyContext.sessionId) && Intrinsics.areEqual(this.appToken, journeyContext.appToken) && Intrinsics.areEqual(this.platformName, journeyContext.platformName) && Intrinsics.areEqual(this.platformVersion, journeyContext.platformVersion) && Intrinsics.areEqual(this.deviceModel, journeyContext.deviceModel) && Intrinsics.areEqual(this.appName, journeyContext.appName) && Intrinsics.areEqual(this.appVersion, journeyContext.appVersion) && Intrinsics.areEqual(this.locale, journeyContext.locale);
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getAppToken() {
        return this.appToken;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getEntityId() {
        return this.entityId;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getPlatformName() {
        return this.platformName;
    }

    public final String getPlatformVersion() {
        return this.platformVersion;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        String str = this.entityId;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.sessionId);
        String str2 = this.appToken;
        return this.locale.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.platformName), 31, this.platformVersion), 31, this.deviceModel), 31, this.appName), 31, this.appVersion);
    }

    public String toString() {
        String str = this.entityId;
        String str2 = this.sessionId;
        String str3 = this.appToken;
        String str4 = this.platformName;
        String str5 = this.platformVersion;
        String str6 = this.deviceModel;
        String str7 = this.appName;
        String str8 = this.appVersion;
        String str9 = this.locale;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("JourneyContext(entityId=", str, ", sessionId=", str2, ", appToken=");
        Boxes$$ExternalSyntheticOutline1.m(m, str3, ", platformName=", str4, ", platformVersion=");
        Boxes$$ExternalSyntheticOutline1.m(m, str5, ", deviceModel=", str6, ", appName=");
        Boxes$$ExternalSyntheticOutline1.m(m, str7, ", appVersion=", str8, ", locale=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, str9, ")");
    }
}
