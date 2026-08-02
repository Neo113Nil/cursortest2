package com.withpersona.sdk2.inquiry.tracking.model;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0092\u0001\u0010*\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\b2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0007\u0010\u0018R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001a\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001b\u0010\u0015R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001c\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0015\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\r\u0010\u0018R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001e\u0010\u0018R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u000f\u0010\u0018¨\u00061"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/CameraDebugData;", "", "deviceType", "", "lensAperture", "", "systemPressureLevel", "isLowLightBoostEnabled", "", "currentIso", "currentExposureDuration", "currentZoomFactor", "autoFocusSystem", "isVirtualDevice", "hasFlash", "isFlashAvailable", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getDeviceType", "()Ljava/lang/String;", "getLensAperture", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getSystemPressureLevel", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCurrentIso", "getCurrentExposureDuration", "getCurrentZoomFactor", "getAutoFocusSystem", "getHasFlash", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/withpersona/sdk2/inquiry/tracking/model/CameraDebugData;", "equals", "other", "hashCode", "", "toString", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CameraDebugData {
    private final String autoFocusSystem;
    private final Double currentExposureDuration;
    private final Double currentIso;
    private final Double currentZoomFactor;
    private final String deviceType;
    private final Boolean hasFlash;
    private final Boolean isFlashAvailable;
    private final Boolean isLowLightBoostEnabled;
    private final Boolean isVirtualDevice;
    private final Double lensAperture;
    private final String systemPressureLevel;

    public /* synthetic */ CameraDebugData(String str, Double d, String str2, Boolean bool, Double d2, Double d3, Double d4, String str3, Boolean bool2, Boolean bool3, Boolean bool4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : d2, (i & 32) != 0 ? null : d3, (i & 64) != 0 ? null : d4, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : bool2, (i & 512) != 0 ? null : bool3, (i & 1024) != 0 ? null : bool4);
    }

    public static /* synthetic */ CameraDebugData copy$default(CameraDebugData cameraDebugData, String str, Double d, String str2, Boolean bool, Double d2, Double d3, Double d4, String str3, Boolean bool2, Boolean bool3, Boolean bool4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cameraDebugData.deviceType;
        }
        if ((i & 2) != 0) {
            d = cameraDebugData.lensAperture;
        }
        if ((i & 4) != 0) {
            str2 = cameraDebugData.systemPressureLevel;
        }
        if ((i & 8) != 0) {
            bool = cameraDebugData.isLowLightBoostEnabled;
        }
        if ((i & 16) != 0) {
            d2 = cameraDebugData.currentIso;
        }
        if ((i & 32) != 0) {
            d3 = cameraDebugData.currentExposureDuration;
        }
        if ((i & 64) != 0) {
            d4 = cameraDebugData.currentZoomFactor;
        }
        if ((i & 128) != 0) {
            str3 = cameraDebugData.autoFocusSystem;
        }
        if ((i & 256) != 0) {
            bool2 = cameraDebugData.isVirtualDevice;
        }
        if ((i & 512) != 0) {
            bool3 = cameraDebugData.hasFlash;
        }
        if ((i & 1024) != 0) {
            bool4 = cameraDebugData.isFlashAvailable;
        }
        Boolean bool5 = bool3;
        Boolean bool6 = bool4;
        String str4 = str3;
        Boolean bool7 = bool2;
        Double d5 = d3;
        Double d6 = d4;
        Double d7 = d2;
        String str5 = str2;
        return cameraDebugData.copy(str, d, str5, bool, d7, d5, d6, str4, bool7, bool5, bool6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDeviceType() {
        return this.deviceType;
    }

    /* renamed from: component10, reason: from getter */
    public final Boolean getHasFlash() {
        return this.hasFlash;
    }

    /* renamed from: component11, reason: from getter */
    public final Boolean getIsFlashAvailable() {
        return this.isFlashAvailable;
    }

    /* renamed from: component2, reason: from getter */
    public final Double getLensAperture() {
        return this.lensAperture;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSystemPressureLevel() {
        return this.systemPressureLevel;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getIsLowLightBoostEnabled() {
        return this.isLowLightBoostEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final Double getCurrentIso() {
        return this.currentIso;
    }

    /* renamed from: component6, reason: from getter */
    public final Double getCurrentExposureDuration() {
        return this.currentExposureDuration;
    }

    /* renamed from: component7, reason: from getter */
    public final Double getCurrentZoomFactor() {
        return this.currentZoomFactor;
    }

    /* renamed from: component8, reason: from getter */
    public final String getAutoFocusSystem() {
        return this.autoFocusSystem;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getIsVirtualDevice() {
        return this.isVirtualDevice;
    }

    public final CameraDebugData copy(@Json(name = "device_type") String deviceType, @Json(name = "lens_aperture") Double lensAperture, @Json(name = "system_pressure_level") String systemPressureLevel, @Json(name = "is_low_light_boost_enabled") Boolean isLowLightBoostEnabled, @Json(name = "current_iso") Double currentIso, @Json(name = "current_exposure_duration") Double currentExposureDuration, @Json(name = "current_zoom_factor") Double currentZoomFactor, @Json(name = "auto_focus_system") String autoFocusSystem, @Json(name = "is_virtual_device") Boolean isVirtualDevice, @Json(name = "has_flash") Boolean hasFlash, @Json(name = "is_flash_available") Boolean isFlashAvailable) {
        return new CameraDebugData(deviceType, lensAperture, systemPressureLevel, isLowLightBoostEnabled, currentIso, currentExposureDuration, currentZoomFactor, autoFocusSystem, isVirtualDevice, hasFlash, isFlashAvailable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraDebugData)) {
            return false;
        }
        CameraDebugData cameraDebugData = (CameraDebugData) other;
        return Intrinsics.areEqual(this.deviceType, cameraDebugData.deviceType) && Intrinsics.areEqual((Object) this.lensAperture, (Object) cameraDebugData.lensAperture) && Intrinsics.areEqual(this.systemPressureLevel, cameraDebugData.systemPressureLevel) && Intrinsics.areEqual(this.isLowLightBoostEnabled, cameraDebugData.isLowLightBoostEnabled) && Intrinsics.areEqual((Object) this.currentIso, (Object) cameraDebugData.currentIso) && Intrinsics.areEqual((Object) this.currentExposureDuration, (Object) cameraDebugData.currentExposureDuration) && Intrinsics.areEqual((Object) this.currentZoomFactor, (Object) cameraDebugData.currentZoomFactor) && Intrinsics.areEqual(this.autoFocusSystem, cameraDebugData.autoFocusSystem) && Intrinsics.areEqual(this.isVirtualDevice, cameraDebugData.isVirtualDevice) && Intrinsics.areEqual(this.hasFlash, cameraDebugData.hasFlash) && Intrinsics.areEqual(this.isFlashAvailable, cameraDebugData.isFlashAvailable);
    }

    public final String getAutoFocusSystem() {
        return this.autoFocusSystem;
    }

    public final Double getCurrentExposureDuration() {
        return this.currentExposureDuration;
    }

    public final Double getCurrentIso() {
        return this.currentIso;
    }

    public final Double getCurrentZoomFactor() {
        return this.currentZoomFactor;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public final Boolean getHasFlash() {
        return this.hasFlash;
    }

    public final Double getLensAperture() {
        return this.lensAperture;
    }

    public final String getSystemPressureLevel() {
        return this.systemPressureLevel;
    }

    public int hashCode() {
        String str = this.deviceType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d = this.lensAperture;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.systemPressureLevel;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isLowLightBoostEnabled;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d2 = this.currentIso;
        int hashCode5 = (hashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.currentExposureDuration;
        int hashCode6 = (hashCode5 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.currentZoomFactor;
        int hashCode7 = (hashCode6 + (d4 == null ? 0 : d4.hashCode())) * 31;
        String str3 = this.autoFocusSystem;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.isVirtualDevice;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hasFlash;
        int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isFlashAvailable;
        return hashCode10 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final Boolean isFlashAvailable() {
        return this.isFlashAvailable;
    }

    public final Boolean isLowLightBoostEnabled() {
        return this.isLowLightBoostEnabled;
    }

    public final Boolean isVirtualDevice() {
        return this.isVirtualDevice;
    }

    public String toString() {
        String str = this.deviceType;
        Double d = this.lensAperture;
        String str2 = this.systemPressureLevel;
        Boolean bool = this.isLowLightBoostEnabled;
        Double d2 = this.currentIso;
        Double d3 = this.currentExposureDuration;
        Double d4 = this.currentZoomFactor;
        String str3 = this.autoFocusSystem;
        Boolean bool2 = this.isVirtualDevice;
        Boolean bool3 = this.hasFlash;
        Boolean bool4 = this.isFlashAvailable;
        StringBuilder sb = new StringBuilder("CameraDebugData(deviceType=");
        sb.append(str);
        sb.append(", lensAperture=");
        sb.append(d);
        sb.append(", systemPressureLevel=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, str2, ", isLowLightBoostEnabled=", bool, ", currentIso=");
        sb.append(d2);
        sb.append(", currentExposureDuration=");
        sb.append(d3);
        sb.append(", currentZoomFactor=");
        sb.append(d4);
        sb.append(", autoFocusSystem=");
        sb.append(str3);
        sb.append(", isVirtualDevice=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, bool2, ", hasFlash=", bool3, ", isFlashAvailable=");
        return Thread$State$EnumUnboxingLocalUtility.m(sb, bool4, ")");
    }

    public CameraDebugData(@Json(name = "device_type") String str, @Json(name = "lens_aperture") Double d, @Json(name = "system_pressure_level") String str2, @Json(name = "is_low_light_boost_enabled") Boolean bool, @Json(name = "current_iso") Double d2, @Json(name = "current_exposure_duration") Double d3, @Json(name = "current_zoom_factor") Double d4, @Json(name = "auto_focus_system") String str3, @Json(name = "is_virtual_device") Boolean bool2, @Json(name = "has_flash") Boolean bool3, @Json(name = "is_flash_available") Boolean bool4) {
        this.deviceType = str;
        this.lensAperture = d;
        this.systemPressureLevel = str2;
        this.isLowLightBoostEnabled = bool;
        this.currentIso = d2;
        this.currentExposureDuration = d3;
        this.currentZoomFactor = d4;
        this.autoFocusSystem = str3;
        this.isVirtualDevice = bool2;
        this.hasFlash = bool3;
        this.isFlashAvailable = bool4;
    }

    public CameraDebugData() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
}
