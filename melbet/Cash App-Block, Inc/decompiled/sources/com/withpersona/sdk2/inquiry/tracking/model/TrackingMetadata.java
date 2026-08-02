package com.withpersona.sdk2.inquiry.tracking.model;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b1\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B÷\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0003\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010>\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010?\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010@\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010A\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010B\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010E\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\u0019HÆ\u0003Jþ\u0001\u0010F\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\u0016\b\u0003\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010GJ\u0013\u0010H\u001a\u00020\t2\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010J\u001a\u00020KHÖ\u0001J\t\u0010L\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010#\u001a\u0004\b\b\u0010\"R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010*\u001a\u0004\b+\u0010)R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010#\u001a\u0004\b\u0011\u0010\"R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010#\u001a\u0004\b\u0014\u0010\"R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010#\u001a\u0004\b\u0015\u0010\"R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001dR\u001f\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b1\u00102¨\u0006M"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "", "sdk", "", "sdkVersion", "appVersion", "appNamespace", "deviceModel", "isSimulator", "", "osVersion", "connectionType", "cellularTechnology", "thermalState", "systemAvailableMemoryMb", "", "batteryLevel", "isLowPowerMode", "appMemoryUsageMb", "", "isCharging", "isBackgrounded", "locale", "timezone", "featureFlags", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getSdk", "()Ljava/lang/String;", "getSdkVersion", "getAppVersion", "getAppNamespace", "getDeviceModel", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOsVersion", "getConnectionType", "getCellularTechnology", "getThermalState", "getSystemAvailableMemoryMb", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getBatteryLevel", "getAppMemoryUsageMb", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLocale", "getTimezone", "getFeatureFlags", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "equals", "other", "hashCode", "", "toString", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TrackingMetadata {
    private final Long appMemoryUsageMb;
    private final String appNamespace;
    private final String appVersion;
    private final Double batteryLevel;
    private final String cellularTechnology;
    private final String connectionType;
    private final String deviceModel;
    private final Map<String, Boolean> featureFlags;
    private final Boolean isBackgrounded;
    private final Boolean isCharging;
    private final Boolean isLowPowerMode;
    private final Boolean isSimulator;
    private final String locale;
    private final String osVersion;
    private final String sdk;
    private final String sdkVersion;
    private final Double systemAvailableMemoryMb;
    private final String thermalState;
    private final String timezone;

    public /* synthetic */ TrackingMetadata(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, String str9, Double d, Double d2, Boolean bool2, Long l, Boolean bool3, Boolean bool4, String str10, String str11, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : d, (i & 2048) != 0 ? null : d2, (i & 4096) != 0 ? null : bool2, (i & PKIFailureInfo.certRevoked) != 0 ? null : l, (i & 16384) != 0 ? null : bool3, (i & 32768) != 0 ? null : bool4, (i & 65536) != 0 ? null : str10, (i & PKIFailureInfo.unsupportedVersion) != 0 ? null : str11, (i & PKIFailureInfo.transactionIdInUse) != 0 ? null : map);
    }

    public static /* synthetic */ TrackingMetadata copy$default(TrackingMetadata trackingMetadata, String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, String str9, Double d, Double d2, Boolean bool2, Long l, Boolean bool3, Boolean bool4, String str10, String str11, Map map, int i, Object obj) {
        Map map2;
        String str12;
        String str13 = (i & 1) != 0 ? trackingMetadata.sdk : str;
        String str14 = (i & 2) != 0 ? trackingMetadata.sdkVersion : str2;
        String str15 = (i & 4) != 0 ? trackingMetadata.appVersion : str3;
        String str16 = (i & 8) != 0 ? trackingMetadata.appNamespace : str4;
        String str17 = (i & 16) != 0 ? trackingMetadata.deviceModel : str5;
        Boolean bool5 = (i & 32) != 0 ? trackingMetadata.isSimulator : bool;
        String str18 = (i & 64) != 0 ? trackingMetadata.osVersion : str6;
        String str19 = (i & 128) != 0 ? trackingMetadata.connectionType : str7;
        String str20 = (i & 256) != 0 ? trackingMetadata.cellularTechnology : str8;
        String str21 = (i & 512) != 0 ? trackingMetadata.thermalState : str9;
        Double d3 = (i & 1024) != 0 ? trackingMetadata.systemAvailableMemoryMb : d;
        Double d4 = (i & 2048) != 0 ? trackingMetadata.batteryLevel : d2;
        Boolean bool6 = (i & 4096) != 0 ? trackingMetadata.isLowPowerMode : bool2;
        Long l2 = (i & PKIFailureInfo.certRevoked) != 0 ? trackingMetadata.appMemoryUsageMb : l;
        String str22 = str13;
        Boolean bool7 = (i & 16384) != 0 ? trackingMetadata.isCharging : bool3;
        Boolean bool8 = (i & 32768) != 0 ? trackingMetadata.isBackgrounded : bool4;
        String str23 = (i & 65536) != 0 ? trackingMetadata.locale : str10;
        String str24 = (i & PKIFailureInfo.unsupportedVersion) != 0 ? trackingMetadata.timezone : str11;
        if ((i & PKIFailureInfo.transactionIdInUse) != 0) {
            str12 = str24;
            map2 = trackingMetadata.featureFlags;
        } else {
            map2 = map;
            str12 = str24;
        }
        return trackingMetadata.copy(str22, str14, str15, str16, str17, bool5, str18, str19, str20, str21, d3, d4, bool6, l2, bool7, bool8, str23, str12, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSdk() {
        return this.sdk;
    }

    /* renamed from: component10, reason: from getter */
    public final String getThermalState() {
        return this.thermalState;
    }

    /* renamed from: component11, reason: from getter */
    public final Double getSystemAvailableMemoryMb() {
        return this.systemAvailableMemoryMb;
    }

    /* renamed from: component12, reason: from getter */
    public final Double getBatteryLevel() {
        return this.batteryLevel;
    }

    /* renamed from: component13, reason: from getter */
    public final Boolean getIsLowPowerMode() {
        return this.isLowPowerMode;
    }

    /* renamed from: component14, reason: from getter */
    public final Long getAppMemoryUsageMb() {
        return this.appMemoryUsageMb;
    }

    /* renamed from: component15, reason: from getter */
    public final Boolean getIsCharging() {
        return this.isCharging;
    }

    /* renamed from: component16, reason: from getter */
    public final Boolean getIsBackgrounded() {
        return this.isBackgrounded;
    }

    /* renamed from: component17, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    /* renamed from: component18, reason: from getter */
    public final String getTimezone() {
        return this.timezone;
    }

    public final Map<String, Boolean> component19() {
        return this.featureFlags;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAppNamespace() {
        return this.appNamespace;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIsSimulator() {
        return this.isSimulator;
    }

    /* renamed from: component7, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    /* renamed from: component8, reason: from getter */
    public final String getConnectionType() {
        return this.connectionType;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCellularTechnology() {
        return this.cellularTechnology;
    }

    public final TrackingMetadata copy(String sdk, @Json(name = "sdk_version") String sdkVersion, @Json(name = "app_version") String appVersion, @Json(name = "app_namespace") String appNamespace, @Json(name = "device_model") String deviceModel, @Json(name = "is_simulator") Boolean isSimulator, @Json(name = "os_version") String osVersion, @Json(name = "connection_type") String connectionType, @Json(name = "cellular_technology") String cellularTechnology, @Json(name = "thermal_state") String thermalState, @Json(name = "system_available_memory_mb") Double systemAvailableMemoryMb, @Json(name = "battery_level") Double batteryLevel, @Json(name = "is_low_power_mode") Boolean isLowPowerMode, @Json(name = "app_memory_usage_mb") Long appMemoryUsageMb, @Json(name = "is_charging") Boolean isCharging, @Json(name = "is_backgrounded") Boolean isBackgrounded, String locale, String timezone, @Json(name = "feature_flags") Map<String, Boolean> featureFlags) {
        return new TrackingMetadata(sdk, sdkVersion, appVersion, appNamespace, deviceModel, isSimulator, osVersion, connectionType, cellularTechnology, thermalState, systemAvailableMemoryMb, batteryLevel, isLowPowerMode, appMemoryUsageMb, isCharging, isBackgrounded, locale, timezone, featureFlags);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackingMetadata)) {
            return false;
        }
        TrackingMetadata trackingMetadata = (TrackingMetadata) other;
        return Intrinsics.areEqual(this.sdk, trackingMetadata.sdk) && Intrinsics.areEqual(this.sdkVersion, trackingMetadata.sdkVersion) && Intrinsics.areEqual(this.appVersion, trackingMetadata.appVersion) && Intrinsics.areEqual(this.appNamespace, trackingMetadata.appNamespace) && Intrinsics.areEqual(this.deviceModel, trackingMetadata.deviceModel) && Intrinsics.areEqual(this.isSimulator, trackingMetadata.isSimulator) && Intrinsics.areEqual(this.osVersion, trackingMetadata.osVersion) && Intrinsics.areEqual(this.connectionType, trackingMetadata.connectionType) && Intrinsics.areEqual(this.cellularTechnology, trackingMetadata.cellularTechnology) && Intrinsics.areEqual(this.thermalState, trackingMetadata.thermalState) && Intrinsics.areEqual((Object) this.systemAvailableMemoryMb, (Object) trackingMetadata.systemAvailableMemoryMb) && Intrinsics.areEqual((Object) this.batteryLevel, (Object) trackingMetadata.batteryLevel) && Intrinsics.areEqual(this.isLowPowerMode, trackingMetadata.isLowPowerMode) && Intrinsics.areEqual(this.appMemoryUsageMb, trackingMetadata.appMemoryUsageMb) && Intrinsics.areEqual(this.isCharging, trackingMetadata.isCharging) && Intrinsics.areEqual(this.isBackgrounded, trackingMetadata.isBackgrounded) && Intrinsics.areEqual(this.locale, trackingMetadata.locale) && Intrinsics.areEqual(this.timezone, trackingMetadata.timezone) && Intrinsics.areEqual(this.featureFlags, trackingMetadata.featureFlags);
    }

    public final Long getAppMemoryUsageMb() {
        return this.appMemoryUsageMb;
    }

    public final String getAppNamespace() {
        return this.appNamespace;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final Double getBatteryLevel() {
        return this.batteryLevel;
    }

    public final String getCellularTechnology() {
        return this.cellularTechnology;
    }

    public final String getConnectionType() {
        return this.connectionType;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final Map<String, Boolean> getFeatureFlags() {
        return this.featureFlags;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final String getSdk() {
        return this.sdk;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final Double getSystemAvailableMemoryMb() {
        return this.systemAvailableMemoryMb;
    }

    public final String getThermalState() {
        return this.thermalState;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    public int hashCode() {
        String str = this.sdk;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sdkVersion;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.appVersion;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.appNamespace;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.deviceModel;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.isSimulator;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.osVersion;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.connectionType;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.cellularTechnology;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.thermalState;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Double d = this.systemAvailableMemoryMb;
        int hashCode11 = (hashCode10 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.batteryLevel;
        int hashCode12 = (hashCode11 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Boolean bool2 = this.isLowPowerMode;
        int hashCode13 = (hashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l = this.appMemoryUsageMb;
        int hashCode14 = (hashCode13 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool3 = this.isCharging;
        int hashCode15 = (hashCode14 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isBackgrounded;
        int hashCode16 = (hashCode15 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str10 = this.locale;
        int hashCode17 = (hashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.timezone;
        int hashCode18 = (hashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Map<String, Boolean> map = this.featureFlags;
        return hashCode18 + (map != null ? map.hashCode() : 0);
    }

    public final Boolean isBackgrounded() {
        return this.isBackgrounded;
    }

    public final Boolean isCharging() {
        return this.isCharging;
    }

    public final Boolean isLowPowerMode() {
        return this.isLowPowerMode;
    }

    public final Boolean isSimulator() {
        return this.isSimulator;
    }

    public String toString() {
        String str = this.sdk;
        String str2 = this.sdkVersion;
        String str3 = this.appVersion;
        String str4 = this.appNamespace;
        String str5 = this.deviceModel;
        Boolean bool = this.isSimulator;
        String str6 = this.osVersion;
        String str7 = this.connectionType;
        String str8 = this.cellularTechnology;
        String str9 = this.thermalState;
        Double d = this.systemAvailableMemoryMb;
        Double d2 = this.batteryLevel;
        Boolean bool2 = this.isLowPowerMode;
        Long l = this.appMemoryUsageMb;
        Boolean bool3 = this.isCharging;
        Boolean bool4 = this.isBackgrounded;
        String str10 = this.locale;
        String str11 = this.timezone;
        Map<String, Boolean> map = this.featureFlags;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TrackingMetadata(sdk=", str, ", sdkVersion=", str2, ", appVersion=");
        Boxes$$ExternalSyntheticOutline1.m(m, str3, ", appNamespace=", str4, ", deviceModel=");
        Thread$State$EnumUnboxingLocalUtility.m(m, str5, ", isSimulator=", bool, ", osVersion=");
        Boxes$$ExternalSyntheticOutline1.m(m, str6, ", connectionType=", str7, ", cellularTechnology=");
        Boxes$$ExternalSyntheticOutline1.m(m, str8, ", thermalState=", str9, ", systemAvailableMemoryMb=");
        m.append(d);
        m.append(", batteryLevel=");
        m.append(d2);
        m.append(", isLowPowerMode=");
        m.append(bool2);
        m.append(", appMemoryUsageMb=");
        m.append(l);
        m.append(", isCharging=");
        Thread$State$EnumUnboxingLocalUtility.m(m, bool3, ", isBackgrounded=", bool4, ", locale=");
        Boxes$$ExternalSyntheticOutline1.m(m, str10, ", timezone=", str11, ", featureFlags=");
        return re$$ExternalSyntheticOutline0.m(")", m, map);
    }

    public TrackingMetadata(String str, @Json(name = "sdk_version") String str2, @Json(name = "app_version") String str3, @Json(name = "app_namespace") String str4, @Json(name = "device_model") String str5, @Json(name = "is_simulator") Boolean bool, @Json(name = "os_version") String str6, @Json(name = "connection_type") String str7, @Json(name = "cellular_technology") String str8, @Json(name = "thermal_state") String str9, @Json(name = "system_available_memory_mb") Double d, @Json(name = "battery_level") Double d2, @Json(name = "is_low_power_mode") Boolean bool2, @Json(name = "app_memory_usage_mb") Long l, @Json(name = "is_charging") Boolean bool3, @Json(name = "is_backgrounded") Boolean bool4, String str10, String str11, @Json(name = "feature_flags") Map<String, Boolean> map) {
        this.sdk = str;
        this.sdkVersion = str2;
        this.appVersion = str3;
        this.appNamespace = str4;
        this.deviceModel = str5;
        this.isSimulator = bool;
        this.osVersion = str6;
        this.connectionType = str7;
        this.cellularTechnology = str8;
        this.thermalState = str9;
        this.systemAvailableMemoryMb = d;
        this.batteryLevel = d2;
        this.isLowPowerMode = bool2;
        this.appMemoryUsageMb = l;
        this.isCharging = bool3;
        this.isBackgrounded = bool4;
        this.locale = str10;
        this.timezone = str11;
        this.featureFlags = map;
    }

    public TrackingMetadata() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }
}
