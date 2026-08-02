package com.withpersona.sdk2.inquiry.tracking.model;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0011\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00120\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableStringAdapter", "", "nullableBooleanAdapter", "", "nullableDoubleAdapter", "", "nullableLongAdapter", "", "nullableMapOfStringBooleanAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TrackingMetadataJsonAdapter extends JsonAdapter {
    private volatile Constructor<TrackingMetadata> constructorRef;
    private final JsonAdapter nullableBooleanAdapter;
    private final JsonAdapter nullableDoubleAdapter;
    private final JsonAdapter nullableLongAdapter;
    private final JsonAdapter nullableMapOfStringBooleanAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options;

    public TrackingMetadataJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("sdk", "sdk_version", "app_version", "app_namespace", "device_model", "is_simulator", "os_version", "connection_type", "cellular_technology", "thermal_state", "system_available_memory_mb", "battery_level", "is_low_power_mode", "app_memory_usage_mb", "is_charging", "is_backgrounded", "locale", "timezone", "feature_flags");
        this.nullableStringAdapter = b.a(moshi, String.class, "sdk", "adapter(...)");
        this.nullableBooleanAdapter = b.a(moshi, Boolean.class, "isSimulator", "adapter(...)");
        this.nullableDoubleAdapter = b.a(moshi, Double.class, "systemAvailableMemoryMb", "adapter(...)");
        this.nullableLongAdapter = b.a(moshi, Long.class, "appMemoryUsageMb", "adapter(...)");
        this.nullableMapOfStringBooleanAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, Boolean.class), EmptySet.INSTANCE, "featureFlags");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public TrackingMetadata fromJson(JsonReader reader) {
        int i;
        reader.getClass();
        reader.beginObject();
        int i2 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Boolean bool = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        Double d = null;
        Double d2 = null;
        Boolean bool2 = null;
        Long l = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        String str10 = null;
        String str11 = null;
        Map map = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    continue;
                case 0:
                    i = -2;
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    i = -3;
                    str2 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    i = -5;
                    str3 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    i = -9;
                    str4 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    i = -17;
                    str5 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    i = -33;
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 6:
                    i = -65;
                    str6 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 7:
                    i = -129;
                    str7 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 8:
                    i = -257;
                    str8 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 9:
                    i = -513;
                    str9 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 10:
                    i = -1025;
                    d = (Double) this.nullableDoubleAdapter.fromJson(reader);
                    break;
                case 11:
                    i = -2049;
                    d2 = (Double) this.nullableDoubleAdapter.fromJson(reader);
                    break;
                case 12:
                    i = -4097;
                    bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 13:
                    i = -8193;
                    l = (Long) this.nullableLongAdapter.fromJson(reader);
                    break;
                case 14:
                    i = -16385;
                    bool3 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 15:
                    i = -32769;
                    bool4 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 16:
                    i = -65537;
                    str10 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 17:
                    i = -131073;
                    str11 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 18:
                    i = -262145;
                    map = (Map) this.nullableMapOfStringBooleanAdapter.fromJson(reader);
                    break;
            }
            i2 &= i;
        }
        reader.endObject();
        if (i2 == -524288) {
            String str12 = str8;
            String str13 = str7;
            String str14 = str6;
            Boolean bool5 = bool;
            String str15 = str5;
            String str16 = str4;
            return new TrackingMetadata(str, str2, str3, str16, str15, bool5, str14, str13, str12, str9, d, d2, bool2, l, bool3, bool4, str10, str11, map);
        }
        String str17 = str8;
        String str18 = str7;
        String str19 = str6;
        Boolean bool6 = bool;
        String str20 = str5;
        String str21 = str4;
        String str22 = str3;
        String str23 = str2;
        String str24 = str;
        Constructor<TrackingMetadata> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TrackingMetadata.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, Boolean.class, String.class, String.class, String.class, String.class, Double.class, Double.class, Boolean.class, Long.class, Boolean.class, Boolean.class, String.class, String.class, Map.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        TrackingMetadata newInstance = constructor.newInstance(str24, str23, str22, str21, str20, bool6, str19, str18, str17, str9, d, d2, bool2, l, bool3, bool4, str10, str11, map, Integer.valueOf(i2), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, TrackingMetadata value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("sdk");
        this.nullableStringAdapter.toJson(writer, value_.getSdk());
        writer.name("sdk_version");
        this.nullableStringAdapter.toJson(writer, value_.getSdkVersion());
        writer.name("app_version");
        this.nullableStringAdapter.toJson(writer, value_.getAppVersion());
        writer.name("app_namespace");
        this.nullableStringAdapter.toJson(writer, value_.getAppNamespace());
        writer.name("device_model");
        this.nullableStringAdapter.toJson(writer, value_.getDeviceModel());
        writer.name("is_simulator");
        this.nullableBooleanAdapter.toJson(writer, value_.isSimulator());
        writer.name("os_version");
        this.nullableStringAdapter.toJson(writer, value_.getOsVersion());
        writer.name("connection_type");
        this.nullableStringAdapter.toJson(writer, value_.getConnectionType());
        writer.name("cellular_technology");
        this.nullableStringAdapter.toJson(writer, value_.getCellularTechnology());
        writer.name("thermal_state");
        this.nullableStringAdapter.toJson(writer, value_.getThermalState());
        writer.name("system_available_memory_mb");
        this.nullableDoubleAdapter.toJson(writer, value_.getSystemAvailableMemoryMb());
        writer.name("battery_level");
        this.nullableDoubleAdapter.toJson(writer, value_.getBatteryLevel());
        writer.name("is_low_power_mode");
        this.nullableBooleanAdapter.toJson(writer, value_.isLowPowerMode());
        writer.name("app_memory_usage_mb");
        this.nullableLongAdapter.toJson(writer, value_.getAppMemoryUsageMb());
        writer.name("is_charging");
        this.nullableBooleanAdapter.toJson(writer, value_.isCharging());
        writer.name("is_backgrounded");
        this.nullableBooleanAdapter.toJson(writer, value_.isBackgrounded());
        writer.name("locale");
        this.nullableStringAdapter.toJson(writer, value_.getLocale());
        writer.name("timezone");
        this.nullableStringAdapter.toJson(writer, value_.getTimezone());
        writer.name("feature_flags");
        this.nullableMapOfStringBooleanAdapter.toJson(writer, value_.getFeatureFlags());
        writer.endObject();
    }

    public String toString() {
        return a.a("GeneratedJsonAdapter(TrackingMetadata)", 38);
    }
}
