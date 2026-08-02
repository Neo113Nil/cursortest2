package com.withpersona.sdk2.inquiry.tracking.model;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingUiEventJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingUiEvent;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableStringAdapter", "", "nullableTrackingMetadataAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TrackingUiEventJsonAdapter extends JsonAdapter {
    private volatile Constructor<TrackingUiEvent> constructorRef;
    private final JsonAdapter nullableStringAdapter;
    private final JsonAdapter nullableTrackingMetadataAdapter;
    private final JsonReader.Options options;

    public TrackingUiEventJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("pageName", "stepName", "metadata");
        this.nullableStringAdapter = b.a(moshi, String.class, "pageName", "adapter(...)");
        this.nullableTrackingMetadataAdapter = b.a(moshi, TrackingMetadata.class, "metadata", "adapter(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public TrackingUiEvent fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        String str = null;
        String str2 = null;
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
            } else if (selectName == 2) {
                trackingMetadata = (TrackingMetadata) this.nullableTrackingMetadataAdapter.fromJson(reader);
                i = -5;
            }
        }
        reader.endObject();
        if (i == -5) {
            return new TrackingUiEvent(str, str2, trackingMetadata);
        }
        Constructor<TrackingUiEvent> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TrackingUiEvent.class.getDeclaredConstructor(String.class, String.class, TrackingMetadata.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        TrackingUiEvent newInstance = constructor.newInstance(str, str2, trackingMetadata, Integer.valueOf(i), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, TrackingUiEvent value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("pageName");
        this.nullableStringAdapter.toJson(writer, value_.getPageName());
        writer.name("stepName");
        this.nullableStringAdapter.toJson(writer, value_.getStepName());
        writer.name("metadata");
        this.nullableTrackingMetadataAdapter.toJson(writer, value_.getMetadata());
        writer.endObject();
    }

    public String toString() {
        return a.a("GeneratedJsonAdapter(TrackingUiEvent)", 37);
    }
}
