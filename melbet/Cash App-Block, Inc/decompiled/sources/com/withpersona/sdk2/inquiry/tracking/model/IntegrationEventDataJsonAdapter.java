package com.withpersona.sdk2.inquiry.tracking.model;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0013\u001a\u00020\fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationEventDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationEventData;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableIntegrationStateAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;", "nullableStringAdapter", "", "nullableBooleanAdapter", "", "nullableTrackingMetadataAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IntegrationEventDataJsonAdapter extends JsonAdapter {
    private volatile Constructor<IntegrationEventData> constructorRef;
    private final JsonAdapter nullableBooleanAdapter;
    private final JsonAdapter nullableIntegrationStateAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonAdapter nullableTrackingMetadataAdapter;
    private final JsonReader.Options options;

    public IntegrationEventDataJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("state", "url", "isAuthTabEnabled", "metadata");
        this.nullableIntegrationStateAdapter = b.a(moshi, IntegrationState.class, "state", "adapter(...)");
        this.nullableStringAdapter = b.a(moshi, String.class, "url", "adapter(...)");
        this.nullableBooleanAdapter = b.a(moshi, Boolean.class, "isAuthTabEnabled", "adapter(...)");
        this.nullableTrackingMetadataAdapter = b.a(moshi, TrackingMetadata.class, "metadata", "adapter(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public IntegrationEventData fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        IntegrationState integrationState = null;
        String str = null;
        Boolean bool = null;
        TrackingMetadata trackingMetadata = null;
        int i = -1;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                integrationState = (IntegrationState) this.nullableIntegrationStateAdapter.fromJson(reader);
                i &= -2;
            } else if (selectName == 1) {
                str = (String) this.nullableStringAdapter.fromJson(reader);
                i &= -3;
            } else if (selectName == 2) {
                bool = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                i &= -5;
            } else if (selectName == 3) {
                trackingMetadata = (TrackingMetadata) this.nullableTrackingMetadataAdapter.fromJson(reader);
                i &= -9;
            }
        }
        reader.endObject();
        if (i == -16) {
            return new IntegrationEventData(integrationState, str, bool, trackingMetadata);
        }
        Constructor<IntegrationEventData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = IntegrationEventData.class.getDeclaredConstructor(IntegrationState.class, String.class, Boolean.class, TrackingMetadata.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        IntegrationEventData newInstance = constructor.newInstance(integrationState, str, bool, trackingMetadata, Integer.valueOf(i), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, IntegrationEventData value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("state");
        this.nullableIntegrationStateAdapter.toJson(writer, value_.getState());
        writer.name("url");
        this.nullableStringAdapter.toJson(writer, value_.getUrl());
        writer.name("isAuthTabEnabled");
        this.nullableBooleanAdapter.toJson(writer, value_.isAuthTabEnabled());
        writer.name("metadata");
        this.nullableTrackingMetadataAdapter.toJson(writer, value_.getMetadata());
        writer.endObject();
    }

    public String toString() {
        return a.a("GeneratedJsonAdapter(IntegrationEventData)", 42);
    }
}
