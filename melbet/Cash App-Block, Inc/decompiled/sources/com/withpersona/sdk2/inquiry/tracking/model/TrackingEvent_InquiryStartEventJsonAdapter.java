package com.withpersona.sdk2.inquiry.tracking.model;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.tracking.model.TrackingEvent;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\r\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent_InquiryStartEventJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryStartEvent;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "nullableInquiryStartEventDataAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryStartEventData;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TrackingEvent_InquiryStartEventJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableInquiryStartEventDataAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter stringAdapter;

    public TrackingEvent_InquiryStartEventJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("id", "data", "created_at");
        this.stringAdapter = b.a(moshi, String.class, "id", "adapter(...)");
        this.nullableInquiryStartEventDataAdapter = b.a(moshi, InquiryStartEventData.class, "data", "adapter(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public TrackingEvent.InquiryStartEvent fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        String str = null;
        String str2 = null;
        InquiryStartEventData inquiryStartEventData = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw Util.unexpectedNull("id", "id", reader);
                }
            } else if (selectName == 1) {
                inquiryStartEventData = (InquiryStartEventData) this.nullableInquiryStartEventDataAdapter.fromJson(reader);
            } else if (selectName == 2 && (str2 = (String) this.stringAdapter.fromJson(reader)) == null) {
                throw Util.unexpectedNull("createdAt", "created_at", reader);
            }
        }
        reader.endObject();
        if (str == null) {
            throw Util.missingProperty("id", "id", reader);
        }
        if (str2 != null) {
            return new TrackingEvent.InquiryStartEvent(str, inquiryStartEventData, str2);
        }
        throw Util.missingProperty("createdAt", "created_at", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, TrackingEvent.InquiryStartEvent value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.name("data");
        this.nullableInquiryStartEventDataAdapter.toJson(writer, value_.getData());
        writer.name("created_at");
        this.stringAdapter.toJson(writer, value_.getCreatedAt());
        writer.endObject();
    }

    public String toString() {
        return a.a("GeneratedJsonAdapter(TrackingEvent.InquiryStartEvent)", 53);
    }
}
