package com.withpersona.sdk2.inquiry.tracking.model;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0013\u001a\u00020\nH\u0016J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/VideoStopEventDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/tracking/model/VideoStopEventData;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableStringAdapter", "", "nullableIntAdapter", "", "nullableDoubleAdapter", "", "nullableTrackingMetadataAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VideoStopEventDataJsonAdapter extends JsonAdapter {
    private volatile Constructor<VideoStopEventData> constructorRef;
    private final JsonAdapter nullableDoubleAdapter;
    private final JsonAdapter nullableIntAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonAdapter nullableTrackingMetadataAdapter;
    private final JsonReader.Options options;

    public VideoStopEventDataJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("step_name", "page_name", "capture_method", "asset_id", "elapsed_time", "chunks_length", "blob_size", "metadata");
        this.nullableStringAdapter = b.a(moshi, String.class, "stepName", "adapter(...)");
        this.nullableIntAdapter = b.a(moshi, Integer.class, "elapsedTime", "adapter(...)");
        this.nullableDoubleAdapter = b.a(moshi, Double.class, "blobSize", "adapter(...)");
        this.nullableTrackingMetadataAdapter = b.a(moshi, TrackingMetadata.class, "metadata", "adapter(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public VideoStopEventData fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        Integer num2 = null;
        Double d = null;
        TrackingMetadata trackingMetadata = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    str2 = (String) this.nullableStringAdapter.fromJson(reader);
                    i &= -3;
                    break;
                case 2:
                    str3 = (String) this.nullableStringAdapter.fromJson(reader);
                    i &= -5;
                    break;
                case 3:
                    str4 = (String) this.nullableStringAdapter.fromJson(reader);
                    i &= -9;
                    break;
                case 4:
                    num = (Integer) this.nullableIntAdapter.fromJson(reader);
                    i &= -17;
                    break;
                case 5:
                    num2 = (Integer) this.nullableIntAdapter.fromJson(reader);
                    i &= -33;
                    break;
                case 6:
                    d = (Double) this.nullableDoubleAdapter.fromJson(reader);
                    i &= -65;
                    break;
                case 7:
                    trackingMetadata = (TrackingMetadata) this.nullableTrackingMetadataAdapter.fromJson(reader);
                    i &= -129;
                    break;
            }
        }
        reader.endObject();
        if (i == -255) {
            TrackingMetadata trackingMetadata2 = trackingMetadata;
            Double d2 = d;
            Integer num3 = num2;
            Integer num4 = num;
            String str5 = str4;
            return new VideoStopEventData(str, str2, str3, str5, num4, num3, d2, trackingMetadata2);
        }
        TrackingMetadata trackingMetadata3 = trackingMetadata;
        Double d3 = d;
        Integer num5 = num2;
        Integer num6 = num;
        String str6 = str4;
        String str7 = str3;
        String str8 = str2;
        String str9 = str;
        Constructor<VideoStopEventData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = VideoStopEventData.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, Integer.class, Integer.class, Double.class, TrackingMetadata.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        VideoStopEventData newInstance = constructor.newInstance(str9, str8, str7, str6, num6, num5, d3, trackingMetadata3, Integer.valueOf(i), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, VideoStopEventData value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("step_name");
        this.nullableStringAdapter.toJson(writer, value_.getStepName());
        writer.name("page_name");
        this.nullableStringAdapter.toJson(writer, value_.getPageName());
        writer.name("capture_method");
        this.nullableStringAdapter.toJson(writer, value_.getCaptureMethod());
        writer.name("asset_id");
        this.nullableStringAdapter.toJson(writer, value_.getAssetId());
        writer.name("elapsed_time");
        this.nullableIntAdapter.toJson(writer, value_.getElapsedTime());
        writer.name("chunks_length");
        this.nullableIntAdapter.toJson(writer, value_.getChunksLength());
        writer.name("blob_size");
        this.nullableDoubleAdapter.toJson(writer, value_.getBlobSize());
        writer.name("metadata");
        this.nullableTrackingMetadataAdapter.toJson(writer, value_.getMetadata());
        writer.endObject();
    }

    public String toString() {
        return a.a("GeneratedJsonAdapter(VideoStopEventData)", 40);
    }
}
