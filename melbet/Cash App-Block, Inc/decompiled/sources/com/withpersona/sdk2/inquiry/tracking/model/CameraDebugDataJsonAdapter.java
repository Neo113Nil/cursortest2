package com.withpersona.sdk2.inquiry.tracking.model;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0011\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/CameraDebugDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/tracking/model/CameraDebugData;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableStringAdapter", "", "nullableDoubleAdapter", "", "nullableBooleanAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CameraDebugDataJsonAdapter extends JsonAdapter {
    private volatile Constructor<CameraDebugData> constructorRef;
    private final JsonAdapter nullableBooleanAdapter;
    private final JsonAdapter nullableDoubleAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options;

    public CameraDebugDataJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("device_type", "lens_aperture", "system_pressure_level", "is_low_light_boost_enabled", "current_iso", "current_exposure_duration", "current_zoom_factor", "auto_focus_system", "is_virtual_device", "has_flash", "is_flash_available");
        this.nullableStringAdapter = b.a(moshi, String.class, "deviceType", "adapter(...)");
        this.nullableDoubleAdapter = b.a(moshi, Double.class, "lensAperture", "adapter(...)");
        this.nullableBooleanAdapter = b.a(moshi, Boolean.class, "isLowLightBoostEnabled", "adapter(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public CameraDebugData fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        int i = -1;
        String str = null;
        Double d = null;
        String str2 = null;
        Boolean bool = null;
        Double d2 = null;
        Double d3 = null;
        Double d4 = null;
        String str3 = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    i &= -2;
                    break;
                case 1:
                    d = (Double) this.nullableDoubleAdapter.fromJson(reader);
                    i &= -3;
                    break;
                case 2:
                    str2 = (String) this.nullableStringAdapter.fromJson(reader);
                    i &= -5;
                    break;
                case 3:
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    i &= -9;
                    break;
                case 4:
                    d2 = (Double) this.nullableDoubleAdapter.fromJson(reader);
                    i &= -17;
                    break;
                case 5:
                    d3 = (Double) this.nullableDoubleAdapter.fromJson(reader);
                    i &= -33;
                    break;
                case 6:
                    d4 = (Double) this.nullableDoubleAdapter.fromJson(reader);
                    i &= -65;
                    break;
                case 7:
                    str3 = (String) this.nullableStringAdapter.fromJson(reader);
                    i &= -129;
                    break;
                case 8:
                    bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    i &= -257;
                    break;
                case 9:
                    bool3 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    i &= -513;
                    break;
                case 10:
                    bool4 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    i &= -1025;
                    break;
            }
        }
        reader.endObject();
        if (i == -2048) {
            Boolean bool5 = bool2;
            String str4 = str3;
            Double d5 = d4;
            Double d6 = d3;
            Double d7 = d2;
            Boolean bool6 = bool;
            return new CameraDebugData(str, d, str2, bool6, d7, d6, d5, str4, bool5, bool3, bool4);
        }
        Boolean bool7 = bool2;
        String str5 = str3;
        Double d8 = d4;
        Double d9 = d3;
        Double d10 = d2;
        Boolean bool8 = bool;
        String str6 = str2;
        Double d11 = d;
        String str7 = str;
        Constructor<CameraDebugData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CameraDebugData.class.getDeclaredConstructor(String.class, Double.class, String.class, Boolean.class, Double.class, Double.class, Double.class, String.class, Boolean.class, Boolean.class, Boolean.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        CameraDebugData newInstance = constructor.newInstance(str7, d11, str6, bool8, d10, d9, d8, str5, bool7, bool3, bool4, Integer.valueOf(i), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, CameraDebugData value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("device_type");
        this.nullableStringAdapter.toJson(writer, value_.getDeviceType());
        writer.name("lens_aperture");
        this.nullableDoubleAdapter.toJson(writer, value_.getLensAperture());
        writer.name("system_pressure_level");
        this.nullableStringAdapter.toJson(writer, value_.getSystemPressureLevel());
        writer.name("is_low_light_boost_enabled");
        this.nullableBooleanAdapter.toJson(writer, value_.isLowLightBoostEnabled());
        writer.name("current_iso");
        this.nullableDoubleAdapter.toJson(writer, value_.getCurrentIso());
        writer.name("current_exposure_duration");
        this.nullableDoubleAdapter.toJson(writer, value_.getCurrentExposureDuration());
        writer.name("current_zoom_factor");
        this.nullableDoubleAdapter.toJson(writer, value_.getCurrentZoomFactor());
        writer.name("auto_focus_system");
        this.nullableStringAdapter.toJson(writer, value_.getAutoFocusSystem());
        writer.name("is_virtual_device");
        this.nullableBooleanAdapter.toJson(writer, value_.isVirtualDevice());
        writer.name("has_flash");
        this.nullableBooleanAdapter.toJson(writer, value_.getHasFlash());
        writer.name("is_flash_available");
        this.nullableBooleanAdapter.toJson(writer, value_.isFlashAvailable());
        writer.endObject();
    }

    public String toString() {
        return a.a("GeneratedJsonAdapter(CameraDebugData)", 37);
    }
}
