package com.withpersona.sdk2.inquiry.tracking.model;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nfcScanPhaseAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;", "nfcScanStatusAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanStatus;", "nullableLongAdapter", "", "nullableStringAdapter", "", "nullableTrackingMetadataAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NfcScanEventDataJsonAdapter extends JsonAdapter {
    private volatile Constructor<NfcScanEventData> constructorRef;
    private final JsonAdapter nfcScanPhaseAdapter;
    private final JsonAdapter nfcScanStatusAdapter;
    private final JsonAdapter nullableLongAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonAdapter nullableTrackingMetadataAdapter;
    private final JsonReader.Options options;

    public NfcScanEventDataJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("phase", "status", "duration_ms", "auth_method", "chip_auth_status", "data_group_type", "metadata");
        this.nfcScanPhaseAdapter = b.a(moshi, NfcScanPhase.class, "phase", "adapter(...)");
        this.nfcScanStatusAdapter = b.a(moshi, NfcScanStatus.class, "status", "adapter(...)");
        this.nullableLongAdapter = b.a(moshi, Long.class, "durationMs", "adapter(...)");
        this.nullableStringAdapter = b.a(moshi, String.class, "authMethod", "adapter(...)");
        this.nullableTrackingMetadataAdapter = b.a(moshi, TrackingMetadata.class, "metadata", "adapter(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NfcScanEventData fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        int i = -1;
        NfcScanPhase nfcScanPhase = null;
        NfcScanStatus nfcScanStatus = null;
        Long l = null;
        String str = null;
        String str2 = null;
        String str3 = null;
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
                    nfcScanStatus = (NfcScanStatus) this.nfcScanStatusAdapter.fromJson(reader);
                    if (nfcScanStatus == null) {
                        throw Util.unexpectedNull("status", "status", reader);
                    }
                    break;
                case 2:
                    l = (Long) this.nullableLongAdapter.fromJson(reader);
                    i &= -5;
                    break;
                case 3:
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    i &= -9;
                    break;
                case 4:
                    str2 = (String) this.nullableStringAdapter.fromJson(reader);
                    i &= -17;
                    break;
                case 5:
                    str3 = (String) this.nullableStringAdapter.fromJson(reader);
                    i &= -33;
                    break;
                case 6:
                    trackingMetadata = (TrackingMetadata) this.nullableTrackingMetadataAdapter.fromJson(reader);
                    i &= -65;
                    break;
            }
        }
        reader.endObject();
        if (i == -125) {
            TrackingMetadata trackingMetadata2 = trackingMetadata;
            String str4 = str3;
            String str5 = str2;
            String str6 = str;
            Long l2 = l;
            NfcScanStatus nfcScanStatus2 = nfcScanStatus;
            NfcScanPhase nfcScanPhase2 = nfcScanPhase;
            if (nfcScanPhase2 == null) {
                throw Util.missingProperty("phase", "phase", reader);
            }
            if (nfcScanStatus2 != null) {
                return new NfcScanEventData(nfcScanPhase2, nfcScanStatus2, l2, str6, str5, str4, trackingMetadata2);
            }
            throw Util.missingProperty("status", "status", reader);
        }
        TrackingMetadata trackingMetadata3 = trackingMetadata;
        String str7 = str3;
        String str8 = str2;
        String str9 = str;
        Long l3 = l;
        NfcScanStatus nfcScanStatus3 = nfcScanStatus;
        NfcScanPhase nfcScanPhase3 = nfcScanPhase;
        Constructor<NfcScanEventData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = NfcScanEventData.class.getDeclaredConstructor(NfcScanPhase.class, NfcScanStatus.class, Long.class, String.class, String.class, String.class, TrackingMetadata.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        Constructor<NfcScanEventData> constructor2 = constructor;
        if (nfcScanPhase3 == null) {
            throw Util.missingProperty("phase", "phase", reader);
        }
        if (nfcScanStatus3 == null) {
            throw Util.missingProperty("status", "status", reader);
        }
        NfcScanEventData newInstance = constructor2.newInstance(nfcScanPhase3, nfcScanStatus3, l3, str9, str8, str7, trackingMetadata3, Integer.valueOf(i), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, NfcScanEventData value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("phase");
        this.nfcScanPhaseAdapter.toJson(writer, value_.getPhase());
        writer.name("status");
        this.nfcScanStatusAdapter.toJson(writer, value_.getStatus());
        writer.name("duration_ms");
        this.nullableLongAdapter.toJson(writer, value_.getDurationMs());
        writer.name("auth_method");
        this.nullableStringAdapter.toJson(writer, value_.getAuthMethod());
        writer.name("chip_auth_status");
        this.nullableStringAdapter.toJson(writer, value_.getChipAuthStatus());
        writer.name("data_group_type");
        this.nullableStringAdapter.toJson(writer, value_.getDataGroupType());
        writer.name("metadata");
        this.nullableTrackingMetadataAdapter.toJson(writer, value_.getMetadata());
        writer.endObject();
    }

    public String toString() {
        return a.a("GeneratedJsonAdapter(NfcScanEventData)", 38);
    }
}
