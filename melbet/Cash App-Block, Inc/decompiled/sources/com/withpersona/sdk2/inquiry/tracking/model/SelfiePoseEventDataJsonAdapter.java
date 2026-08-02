package com.withpersona.sdk2.inquiry.tracking.model;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseEventDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseEventData;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "selfiePoseTypeAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseType;", "selfieCaptureMethodAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureMethod;", "nullableTrackingMetadataAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SelfiePoseEventDataJsonAdapter extends JsonAdapter {
    private volatile Constructor<SelfiePoseEventData> constructorRef;
    private final JsonAdapter nullableTrackingMetadataAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter selfieCaptureMethodAdapter;
    private final JsonAdapter selfiePoseTypeAdapter;

    public SelfiePoseEventDataJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("pose", "capture_method", "metadata");
        this.selfiePoseTypeAdapter = b.a(moshi, SelfiePoseType.class, "poseType", "adapter(...)");
        this.selfieCaptureMethodAdapter = b.a(moshi, SelfieCaptureMethod.class, "captureMethod", "adapter(...)");
        this.nullableTrackingMetadataAdapter = b.a(moshi, TrackingMetadata.class, "metadata", "adapter(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public SelfiePoseEventData fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        SelfiePoseType selfiePoseType = null;
        SelfieCaptureMethod selfieCaptureMethod = null;
        TrackingMetadata trackingMetadata = null;
        int i = -1;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                selfiePoseType = (SelfiePoseType) this.selfiePoseTypeAdapter.fromJson(reader);
                if (selfiePoseType == null) {
                    throw Util.unexpectedNull("poseType", "pose", reader);
                }
            } else if (selectName == 1) {
                selfieCaptureMethod = (SelfieCaptureMethod) this.selfieCaptureMethodAdapter.fromJson(reader);
                if (selfieCaptureMethod == null) {
                    throw Util.unexpectedNull("captureMethod", "capture_method", reader);
                }
            } else if (selectName == 2) {
                trackingMetadata = (TrackingMetadata) this.nullableTrackingMetadataAdapter.fromJson(reader);
                i = -5;
            }
        }
        reader.endObject();
        if (i == -5) {
            if (selfiePoseType == null) {
                throw Util.missingProperty("poseType", "pose", reader);
            }
            if (selfieCaptureMethod != null) {
                return new SelfiePoseEventData(selfiePoseType, selfieCaptureMethod, trackingMetadata);
            }
            throw Util.missingProperty("captureMethod", "capture_method", reader);
        }
        Constructor<SelfiePoseEventData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = SelfiePoseEventData.class.getDeclaredConstructor(SelfiePoseType.class, SelfieCaptureMethod.class, TrackingMetadata.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        if (selfiePoseType == null) {
            throw Util.missingProperty("poseType", "pose", reader);
        }
        if (selfieCaptureMethod == null) {
            throw Util.missingProperty("captureMethod", "capture_method", reader);
        }
        SelfiePoseEventData newInstance = constructor.newInstance(selfiePoseType, selfieCaptureMethod, trackingMetadata, Integer.valueOf(i), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, SelfiePoseEventData value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("pose");
        this.selfiePoseTypeAdapter.toJson(writer, value_.getPoseType());
        writer.name("capture_method");
        this.selfieCaptureMethodAdapter.toJson(writer, value_.getCaptureMethod());
        writer.name("metadata");
        this.nullableTrackingMetadataAdapter.toJson(writer, value_.getMetadata());
        writer.endObject();
    }

    public String toString() {
        return a.a("GeneratedJsonAdapter(SelfiePoseEventData)", 41);
    }
}
