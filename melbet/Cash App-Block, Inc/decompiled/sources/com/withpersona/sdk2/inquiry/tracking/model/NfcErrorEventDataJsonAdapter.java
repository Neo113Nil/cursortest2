package com.withpersona.sdk2.inquiry.tracking.model;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0017\u001a\u00020\fH\u0016J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorEventDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorEventData;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nfcScanPhaseAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;", "nullableStringAdapter", "", "nullableNfcErrorTypeAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorType;", "nullableLongAdapter", "", "nullableIntAdapter", "", "nullableTrackingMetadataAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NfcErrorEventDataJsonAdapter extends JsonAdapter {
    private volatile Constructor<NfcErrorEventData> constructorRef;
    private final JsonAdapter nfcScanPhaseAdapter;
    private final JsonAdapter nullableIntAdapter;
    private final JsonAdapter nullableLongAdapter;
    private final JsonAdapter nullableNfcErrorTypeAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonAdapter nullableTrackingMetadataAdapter;
    private final JsonReader.Options options;

    public NfcErrorEventDataJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("phase", "category", "error_message", "error_type", "duration_ms", "auth_method", "data_group_type", "card_status_word", "metadata");
        this.nfcScanPhaseAdapter = b.a(moshi, NfcScanPhase.class, "phase", "adapter(...)");
        this.nullableStringAdapter = b.a(moshi, String.class, "category", "adapter(...)");
        this.nullableNfcErrorTypeAdapter = b.a(moshi, NfcErrorType.class, "errorType", "adapter(...)");
        this.nullableLongAdapter = b.a(moshi, Long.class, "durationMs", "adapter(...)");
        this.nullableIntAdapter = b.a(moshi, Integer.class, "cardStatusWord", "adapter(...)");
        this.nullableTrackingMetadataAdapter = b.a(moshi, TrackingMetadata.class, "metadata", "adapter(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NfcErrorEventData fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        int i = -1;
        NfcScanPhase nfcScanPhase = null;
        String str = null;
        String str2 = null;
        NfcErrorType nfcErrorType = null;
        Long l = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        TrackingMetadata trackingMetadata = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    nfcScanPhase = (NfcScanPhase) this.nfcScanPhaseAdapter.fromJson(reader);
                    if (nfcScanPhase == null) {
                        throw Util.unexpectedNull("phase", "phase", reader);
                    }
                    break;
                case 1:
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    i &= -3;
                    break;
                case 2:
                    str2 = (String) this.nullableStringAdapter.fromJson(reader);
                    i &= -5;
                    break;
                case 3:
                    nfcErrorType = (NfcErrorType) this.nullableNfcErrorTypeAdapter.fromJson(reader);
                    i &= -9;
                    break;
                case 4:
                    l = (Long) this.nullableLongAdapter.fromJson(reader);
                    i &= -17;
                    break;
                case 5:
                    str3 = (String) this.nullableStringAdapter.fromJson(reader);
                    i &= -33;
                    break;
                case 6:
                    str4 = (String) this.nullableStringAdapter.fromJson(reader);
                    i &= -65;
                    break;
                case 7:
                    num = (Integer) this.nullableIntAdapter.fromJson(reader);
                    i &= -129;
                    break;
                case 8:
                    trackingMetadata = (TrackingMetadata) this.nullableTrackingMetadataAdapter.fromJson(reader);
                    i &= -257;
                    break;
            }
        }
        reader.endObject();
        if (i == -511) {
            TrackingMetadata trackingMetadata2 = trackingMetadata;
            Integer num2 = num;
            String str5 = str4;
            String str6 = str3;
            Long l2 = l;
            NfcErrorType nfcErrorType2 = nfcErrorType;
            String str7 = str2;
            String str8 = str;
            NfcScanPhase nfcScanPhase2 = nfcScanPhase;
            if (nfcScanPhase2 != null) {
                return new NfcErrorEventData(nfcScanPhase2, str8, str7, nfcErrorType2, l2, str6, str5, num2, trackingMetadata2);
            }
            throw Util.missingProperty("phase", "phase", reader);
        }
        TrackingMetadata trackingMetadata3 = trackingMetadata;
        Integer num3 = num;
        String str9 = str4;
        String str10 = str3;
        Long l3 = l;
        NfcErrorType nfcErrorType3 = nfcErrorType;
        String str11 = str2;
        String str12 = str;
        NfcScanPhase nfcScanPhase3 = nfcScanPhase;
        Constructor<NfcErrorEventData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = NfcErrorEventData.class.getDeclaredConstructor(NfcScanPhase.class, String.class, String.class, NfcErrorType.class, Long.class, String.class, String.class, Integer.class, TrackingMetadata.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        if (nfcScanPhase3 == null) {
            throw Util.missingProperty("phase", "phase", reader);
        }
        NfcErrorEventData newInstance = constructor.newInstance(nfcScanPhase3, str12, str11, nfcErrorType3, l3, str10, str9, num3, trackingMetadata3, Integer.valueOf(i), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, NfcErrorEventData value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("phase");
        this.nfcScanPhaseAdapter.toJson(writer, value_.getPhase());
        writer.name("category");
        this.nullableStringAdapter.toJson(writer, value_.getCategory());
        writer.name("error_message");
        this.nullableStringAdapter.toJson(writer, value_.getErrorMessage());
        writer.name("error_type");
        this.nullableNfcErrorTypeAdapter.toJson(writer, value_.getErrorType());
        writer.name("duration_ms");
        this.nullableLongAdapter.toJson(writer, value_.getDurationMs());
        writer.name("auth_method");
        this.nullableStringAdapter.toJson(writer, value_.getAuthMethod());
        writer.name("data_group_type");
        this.nullableStringAdapter.toJson(writer, value_.getDataGroupType());
        writer.name("card_status_word");
        this.nullableIntAdapter.toJson(writer, value_.getCardStatusWord());
        writer.name("metadata");
        this.nullableTrackingMetadataAdapter.toJson(writer, value_.getMetadata());
        writer.endObject();
    }

    public String toString() {
        return a.a("GeneratedJsonAdapter(NfcErrorEventData)", 39);
    }
}
