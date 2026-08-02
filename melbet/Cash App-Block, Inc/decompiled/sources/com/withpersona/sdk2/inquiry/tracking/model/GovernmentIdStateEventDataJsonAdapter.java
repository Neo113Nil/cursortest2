package com.withpersona.sdk2.inquiry.tracking.model;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "govIdCaptureStateAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;", "nullableGovIdCaptureMethodAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureMethod;", "nullableTrackingMetadataAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GovernmentIdStateEventDataJsonAdapter extends JsonAdapter {
    private volatile Constructor<GovernmentIdStateEventData> constructorRef;
    private final JsonAdapter govIdCaptureStateAdapter;
    private final JsonAdapter nullableGovIdCaptureMethodAdapter;
    private final JsonAdapter nullableTrackingMetadataAdapter;
    private final JsonReader.Options options;

    public GovernmentIdStateEventDataJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("state", "capture_method", "metadata");
        this.govIdCaptureStateAdapter = b.a(moshi, GovIdCaptureState.class, "govIdCaptureState", "adapter(...)");
        this.nullableGovIdCaptureMethodAdapter = b.a(moshi, GovIdCaptureMethod.class, "captureMethod", "adapter(...)");
        this.nullableTrackingMetadataAdapter = b.a(moshi, TrackingMetadata.class, "metadata", "adapter(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public GovernmentIdStateEventData fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        GovIdCaptureState govIdCaptureState = null;
        GovIdCaptureMethod govIdCaptureMethod = null;
        TrackingMetadata trackingMetadata = null;
        int i = -1;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                govIdCaptureState = (GovIdCaptureState) this.govIdCaptureStateAdapter.fromJson(reader);
                if (govIdCaptureState == null) {
                    throw Util.unexpectedNull("govIdCaptureState", "state", reader);
                }
            } else if (selectName == 1) {
                govIdCaptureMethod = (GovIdCaptureMethod) this.nullableGovIdCaptureMethodAdapter.fromJson(reader);
            } else if (selectName == 2) {
                trackingMetadata = (TrackingMetadata) this.nullableTrackingMetadataAdapter.fromJson(reader);
                i = -5;
            }
        }
        reader.endObject();
        if (i == -5) {
            if (govIdCaptureState != null) {
                return new GovernmentIdStateEventData(govIdCaptureState, govIdCaptureMethod, trackingMetadata);
            }
            throw Util.missingProperty("govIdCaptureState", "state", reader);
        }
        Constructor<GovernmentIdStateEventData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = GovernmentIdStateEventData.class.getDeclaredConstructor(GovIdCaptureState.class, GovIdCaptureMethod.class, TrackingMetadata.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        if (govIdCaptureState == null) {
            throw Util.missingProperty("govIdCaptureState", "state", reader);
        }
        GovernmentIdStateEventData newInstance = constructor.newInstance(govIdCaptureState, govIdCaptureMethod, trackingMetadata, Integer.valueOf(i), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, GovernmentIdStateEventData value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("state");
        this.govIdCaptureStateAdapter.toJson(writer, value_.getGovIdCaptureState());
        writer.name("capture_method");
        this.nullableGovIdCaptureMethodAdapter.toJson(writer, value_.getCaptureMethod());
        writer.name("metadata");
        this.nullableTrackingMetadataAdapter.toJson(writer, value_.getMetadata());
        writer.endObject();
    }

    public String toString() {
        return a.a("GeneratedJsonAdapter(GovernmentIdStateEventData)", 48);
    }
}
