package com.withpersona.sdk2.inquiry.tracking.model;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0011\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/VideoStartEventDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/tracking/model/VideoStartEventData;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableStringAdapter", "", "nullableIntAdapter", "", "nullableTrackingMetadataAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VideoStartEventDataJsonAdapter extends JsonAdapter {
    private volatile Constructor<VideoStartEventData> constructorRef;
    private final JsonAdapter nullableIntAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonAdapter nullableTrackingMetadataAdapter;
    private final JsonReader.Options options;

    public VideoStartEventDataJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("step_name", "page_name", "capture_method", "attempt", "metadata");
        this.nullableStringAdapter = b.a(moshi, String.class, "stepName", "adapter(...)");
        this.nullableIntAdapter = b.a(moshi, Integer.class, "attempt", "adapter(...)");
        this.nullableTrackingMetadataAdapter = b.a(moshi, TrackingMetadata.class, "metadata", "adapter(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public VideoStartEventData fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        TrackingMetadata trackingMetadata = null;
        int i = -1;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.nullableStringAdapter.fromJson(reader);
            } else if (selectName == 1) {
                str2 = (String) this.nullableStringAdapter.fromJson(reader);
                i &= -3;
            } else if (selectName == 2) {
                str3 = (String) this.nullableStringAdapter.fromJson(reader);
                i &= -5;
            } else if (selectName == 3) {
                num = (Integer) this.nullableIntAdapter.fromJson(reader);
                i &= -9;
            } else if (selectName == 4) {
                trackingMetadata = (TrackingMetadata) this.nullableTrackingMetadataAdapter.fromJson(reader);
                i &= -17;
            }
        }
        reader.endObject();
        if (i == -31) {
            TrackingMetadata trackingMetadata2 = trackingMetadata;
            Integer num2 = num;
            return new VideoStartEventData(str, str2, str3, num2, trackingMetadata2);
        }
        TrackingMetadata trackingMetadata3 = trackingMetadata;
        Integer num3 = num;
        String str4 = str3;
        String str5 = str2;
        String str6 = str;
        Constructor<VideoStartEventData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = VideoStartEventData.class.getDeclaredConstructor(String.class, String.class, String.class, Integer.class, TrackingMetadata.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        VideoStartEventData newInstance = constructor.newInstance(str6, str5, str4, num3, trackingMetadata3, Integer.valueOf(i), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, VideoStartEventData value_) {
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
        writer.name("attempt");
        this.nullableIntAdapter.toJson(writer, value_.getAttempt());
        writer.name("metadata");
        this.nullableTrackingMetadataAdapter.toJson(writer, value_.getMetadata());
        writer.endObject();
    }

    public String toString() {
        return a.a("GeneratedJsonAdapter(VideoStartEventData)", 41);
    }
}
