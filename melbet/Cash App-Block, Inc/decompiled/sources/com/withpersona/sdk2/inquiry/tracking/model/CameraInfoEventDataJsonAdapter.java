package com.withpersona.sdk2.inquiry.tracking.model;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableStringAdapter", "", "nullableCameraSizeAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/CameraSize;", "nullableDoubleAdapter", "", "nullableCameraDebugDataAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/CameraDebugData;", "nullableTrackingMetadataAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CameraInfoEventDataJsonAdapter extends JsonAdapter {
    private volatile Constructor<CameraInfoEventData> constructorRef;
    private final JsonAdapter nullableCameraDebugDataAdapter;
    private final JsonAdapter nullableCameraSizeAdapter;
    private final JsonAdapter nullableDoubleAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonAdapter nullableTrackingMetadataAdapter;
    private final JsonReader.Options options;

    public CameraInfoEventDataJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of(AnnotatedPrivateKey.LABEL, "position", "size", "frame_rate", "aspect_ratio", "debug_data", "metadata");
        this.nullableStringAdapter = b.a(moshi, String.class, AnnotatedPrivateKey.LABEL, "adapter(...)");
        this.nullableCameraSizeAdapter = b.a(moshi, CameraSize.class, "size", "adapter(...)");
        this.nullableDoubleAdapter = b.a(moshi, Double.class, "frameRate", "adapter(...)");
        this.nullableCameraDebugDataAdapter = b.a(moshi, CameraDebugData.class, "debugData", "adapter(...)");
        this.nullableTrackingMetadataAdapter = b.a(moshi, TrackingMetadata.class, "metadata", "adapter(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public CameraInfoEventData fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        int i = -1;
        String str = null;
        String str2 = null;
        CameraSize cameraSize = null;
        Double d = null;
        Double d2 = null;
        CameraDebugData cameraDebugData = null;
        TrackingMetadata trackingMetadata = null;
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
                    str2 = (String) this.nullableStringAdapter.fromJson(reader);
                    i &= -3;
                    break;
                case 2:
                    cameraSize = (CameraSize) this.nullableCameraSizeAdapter.fromJson(reader);
                    i &= -5;
                    break;
                case 3:
                    d = (Double) this.nullableDoubleAdapter.fromJson(reader);
                    i &= -9;
                    break;
                case 4:
                    d2 = (Double) this.nullableDoubleAdapter.fromJson(reader);
                    i &= -17;
                    break;
                case 5:
                    cameraDebugData = (CameraDebugData) this.nullableCameraDebugDataAdapter.fromJson(reader);
                    i &= -33;
                    break;
                case 6:
                    trackingMetadata = (TrackingMetadata) this.nullableTrackingMetadataAdapter.fromJson(reader);
                    i &= -65;
                    break;
            }
        }
        reader.endObject();
        if (i == -128) {
            TrackingMetadata trackingMetadata2 = trackingMetadata;
            CameraDebugData cameraDebugData2 = cameraDebugData;
            Double d3 = d2;
            Double d4 = d;
            return new CameraInfoEventData(str, str2, cameraSize, d4, d3, cameraDebugData2, trackingMetadata2);
        }
        TrackingMetadata trackingMetadata3 = trackingMetadata;
        CameraDebugData cameraDebugData3 = cameraDebugData;
        Double d5 = d2;
        Double d6 = d;
        CameraSize cameraSize2 = cameraSize;
        String str3 = str2;
        String str4 = str;
        Constructor<CameraInfoEventData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CameraInfoEventData.class.getDeclaredConstructor(String.class, String.class, CameraSize.class, Double.class, Double.class, CameraDebugData.class, TrackingMetadata.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        CameraInfoEventData newInstance = constructor.newInstance(str4, str3, cameraSize2, d6, d5, cameraDebugData3, trackingMetadata3, Integer.valueOf(i), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, CameraInfoEventData value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name(AnnotatedPrivateKey.LABEL);
        this.nullableStringAdapter.toJson(writer, value_.getLabel());
        writer.name("position");
        this.nullableStringAdapter.toJson(writer, value_.getPosition());
        writer.name("size");
        this.nullableCameraSizeAdapter.toJson(writer, value_.getSize());
        writer.name("frame_rate");
        this.nullableDoubleAdapter.toJson(writer, value_.getFrameRate());
        writer.name("aspect_ratio");
        this.nullableDoubleAdapter.toJson(writer, value_.getAspectRatio());
        writer.name("debug_data");
        this.nullableCameraDebugDataAdapter.toJson(writer, value_.getDebugData());
        writer.name("metadata");
        this.nullableTrackingMetadataAdapter.toJson(writer, value_.getMetadata());
        writer.endObject();
    }

    public String toString() {
        return a.a("GeneratedJsonAdapter(CameraInfoEventData)", 41);
    }
}
