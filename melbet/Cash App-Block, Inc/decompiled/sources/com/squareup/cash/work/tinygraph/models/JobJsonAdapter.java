package com.squareup.cash.work.tinygraph.models;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/work/tinygraph/models/JobJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/work/tinygraph/models/Job;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class JobJsonAdapter extends JsonAdapter {
    public final JsonAdapter longAdapter;
    public final JsonAdapter nullableAnyAdapter;
    public final JsonAdapter nullableEntityReferenceAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public JobJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("id", "createdAt", "updatedAt", "proto", "merchantId");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "createdAt");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, "protoJson");
        this.nullableEntityReferenceAdapter = moshi.adapter(EntityReference.class, emptySet, "merchantId");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        Long l = null;
        Long l2 = null;
        String str = null;
        Object obj = null;
        EntityReference entityReference = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName != 0) {
                JsonAdapter jsonAdapter = this.longAdapter;
                if (selectName == 1) {
                    l = (Long) jsonAdapter.fromJson(jsonReader);
                    if (l == null) {
                        throw Util.unexpectedNull("createdAt", "createdAt", jsonReader);
                    }
                } else if (selectName == 2) {
                    l2 = (Long) jsonAdapter.fromJson(jsonReader);
                    if (l2 == null) {
                        throw Util.unexpectedNull("updatedAt", "updatedAt", jsonReader);
                    }
                } else if (selectName == 3) {
                    obj = this.nullableAnyAdapter.fromJson(jsonReader);
                } else if (selectName == 4) {
                    entityReference = (EntityReference) this.nullableEntityReferenceAdapter.fromJson(jsonReader);
                }
            } else {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("id", "id", jsonReader);
                }
            }
        }
        jsonReader.endObject();
        Long l3 = l2;
        if (str == null) {
            throw Util.missingProperty("id", "id", jsonReader);
        }
        if (l == null) {
            throw Util.missingProperty("createdAt", "createdAt", jsonReader);
        }
        long longValue = l.longValue();
        if (l3 != null) {
            return new Job(str, longValue, l3.longValue(), obj, entityReference);
        }
        throw Util.missingProperty("updatedAt", "updatedAt", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        Job job = (Job) obj;
        jsonWriter.getClass();
        if (job == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, job.id);
        jsonWriter.name("createdAt");
        long j = job.createdAt;
        JsonAdapter jsonAdapter = this.longAdapter;
        BalanceFeedKt$$ExternalSyntheticOutline0.m(j, jsonAdapter, jsonWriter, "updatedAt");
        BalanceFeedKt$$ExternalSyntheticOutline0.m(job.updatedAt, jsonAdapter, jsonWriter, "proto");
        this.nullableAnyAdapter.toJson(jsonWriter, job.protoJson);
        jsonWriter.name("merchantId");
        this.nullableEntityReferenceAdapter.toJson(jsonWriter, job.merchantId);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(25, "GeneratedJsonAdapter(Job)");
    }
}
