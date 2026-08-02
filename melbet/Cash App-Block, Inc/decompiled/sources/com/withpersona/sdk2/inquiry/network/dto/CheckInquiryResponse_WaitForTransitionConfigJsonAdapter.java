package com.withpersona.sdk2.inquiry.network.dto;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse_WaitForTransitionConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$WaitForTransitionConfig;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableLongAdapter", "", "pollingModeAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$PollingMode;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CheckInquiryResponse_WaitForTransitionConfigJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableLongAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter pollingModeAdapter;

    public CheckInquiryResponse_WaitForTransitionConfigJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("intervalMs", "maxAttempts", "pollingMode");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableLongAdapter = moshi.adapter(Long.class, emptySet, "intervalMs");
        this.pollingModeAdapter = moshi.adapter(CheckInquiryResponse.PollingMode.class, emptySet, "pollingMode");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public CheckInquiryResponse.WaitForTransitionConfig fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        Long l = null;
        Long l2 = null;
        CheckInquiryResponse.PollingMode pollingMode = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                l = (Long) this.nullableLongAdapter.fromJson(reader);
            } else if (selectName == 1) {
                l2 = (Long) this.nullableLongAdapter.fromJson(reader);
            } else if (selectName == 2 && (pollingMode = (CheckInquiryResponse.PollingMode) this.pollingModeAdapter.fromJson(reader)) == null) {
                throw Util.unexpectedNull("pollingMode", "pollingMode", reader);
            }
        }
        reader.endObject();
        if (pollingMode != null) {
            return new CheckInquiryResponse.WaitForTransitionConfig(l, l2, pollingMode);
        }
        throw Util.missingProperty("pollingMode", "pollingMode", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, CheckInquiryResponse.WaitForTransitionConfig value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("intervalMs");
        this.nullableLongAdapter.toJson(writer, value_.getIntervalMs());
        writer.name("maxAttempts");
        this.nullableLongAdapter.toJson(writer, value_.getMaxAttempts());
        writer.name("pollingMode");
        this.pollingModeAdapter.toJson(writer, value_.getPollingMode());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(66, "GeneratedJsonAdapter(CheckInquiryResponse.WaitForTransitionConfig)");
    }
}
