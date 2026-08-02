package com.squareup.cash.work.tinygraph.models;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/work/tinygraph/models/EntityReferenceJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/work/tinygraph/models/EntityReference;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EntityReferenceJsonAdapter extends JsonAdapter {
    public volatile Constructor constructorRef;
    public final JsonAdapter entityTypeAdapter;
    public final JsonAdapter longAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public EntityReferenceJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("id", "entityType", "updatedAt");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.entityTypeAdapter = moshi.adapter(EntityType.class, emptySet, "entityType");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "updatedAt");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        Long l = 0L;
        jsonReader.beginObject();
        String str = null;
        EntityType entityType = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("id", "id", jsonReader);
                }
            } else if (selectName == 1) {
                entityType = (EntityType) this.entityTypeAdapter.fromJson(jsonReader);
                if (entityType == null) {
                    throw Util.unexpectedNull("entityType", "entityType", jsonReader);
                }
            } else if (selectName == 2) {
                l = (Long) this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw Util.unexpectedNull("updatedAt", "updatedAt", jsonReader);
                }
                i = -5;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -5) {
            if (str == null) {
                throw Util.missingProperty("id", "id", jsonReader);
            }
            if (entityType != null) {
                return new EntityReference(str, entityType, l.longValue());
            }
            throw Util.missingProperty("entityType", "entityType", jsonReader);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            constructor = EntityReference.class.getDeclaredConstructor(String.class, EntityType.class, Long.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        if (str == null) {
            throw Util.missingProperty("id", "id", jsonReader);
        }
        if (entityType == null) {
            throw Util.missingProperty("entityType", "entityType", jsonReader);
        }
        Object newInstance = constructor.newInstance(str, entityType, l, Integer.valueOf(i), null);
        newInstance.getClass();
        return (EntityReference) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        EntityReference entityReference = (EntityReference) obj;
        jsonWriter.getClass();
        if (entityReference == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, entityReference.id);
        jsonWriter.name("entityType");
        this.entityTypeAdapter.toJson(jsonWriter, entityReference.entityType);
        jsonWriter.name("updatedAt");
        this.longAdapter.toJson(jsonWriter, Long.valueOf(entityReference.updatedAt));
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(37, "GeneratedJsonAdapter(EntityReference)");
    }
}
