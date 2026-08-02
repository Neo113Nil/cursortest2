package com.squareup.cash.userjourneys.data;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.squareup.protos.cash.blockuserjourneys.api.v1.JourneyOutcome;
import com.squareup.protos.cash.blockuserjourneys.api.v1.JourneyTerminationReason;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/userjourneys/data/TerminationContextJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/userjourneys/data/TerminationContext;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TerminationContextJsonAdapter extends JsonAdapter {
    public volatile Constructor constructorRef;
    public final JsonAdapter journeyOutcomeAdapter;
    public final JsonAdapter longAdapter;
    public final JsonAdapter nullableJourneyTerminationReasonAdapter;
    public final JsonReader.Options options;

    public TerminationContextJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("outcome", "terminationReason", "durationRealtime");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.journeyOutcomeAdapter = moshi.adapter(JourneyOutcome.class, emptySet, "outcome");
        this.nullableJourneyTerminationReasonAdapter = moshi.adapter(JourneyTerminationReason.class, emptySet, "terminationReason");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "durationRealtime");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        JourneyOutcome journeyOutcome = null;
        JourneyTerminationReason journeyTerminationReason = null;
        Long l = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                journeyOutcome = (JourneyOutcome) this.journeyOutcomeAdapter.fromJson(jsonReader);
                if (journeyOutcome == null) {
                    throw Util.unexpectedNull("outcome", "outcome", jsonReader);
                }
            } else if (selectName == 1) {
                journeyTerminationReason = (JourneyTerminationReason) this.nullableJourneyTerminationReasonAdapter.fromJson(jsonReader);
                i = -3;
            } else if (selectName == 2 && (l = (Long) this.longAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("durationRealtime", "durationRealtime", jsonReader);
            }
        }
        jsonReader.endObject();
        if (i == -3) {
            if (journeyOutcome == null) {
                throw Util.missingProperty("outcome", "outcome", jsonReader);
            }
            if (l != null) {
                return new TerminationContext(journeyOutcome, journeyTerminationReason, l.longValue());
            }
            throw Util.missingProperty("durationRealtime", "durationRealtime", jsonReader);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TerminationContext.class.getDeclaredConstructor(JourneyOutcome.class, JourneyTerminationReason.class, Long.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        if (journeyOutcome == null) {
            throw Util.missingProperty("outcome", "outcome", jsonReader);
        }
        if (l == null) {
            throw Util.missingProperty("durationRealtime", "durationRealtime", jsonReader);
        }
        Object newInstance = constructor.newInstance(journeyOutcome, journeyTerminationReason, l, Integer.valueOf(i), null);
        newInstance.getClass();
        return (TerminationContext) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        TerminationContext terminationContext = (TerminationContext) obj;
        jsonWriter.getClass();
        if (terminationContext == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("outcome");
        this.journeyOutcomeAdapter.toJson(jsonWriter, terminationContext.getOutcome());
        jsonWriter.name("terminationReason");
        this.nullableJourneyTerminationReasonAdapter.toJson(jsonWriter, terminationContext.getTerminationReason());
        jsonWriter.name("durationRealtime");
        this.longAdapter.toJson(jsonWriter, Long.valueOf(terminationContext.getDurationRealtime()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(40, "GeneratedJsonAdapter(TerminationContext)");
    }
}
