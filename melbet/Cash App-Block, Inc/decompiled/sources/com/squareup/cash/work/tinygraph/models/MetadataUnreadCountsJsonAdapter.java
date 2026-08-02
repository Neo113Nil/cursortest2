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

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/work/tinygraph/models/MetadataUnreadCountsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/work/tinygraph/models/MetadataUnreadCounts;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MetadataUnreadCountsJsonAdapter extends JsonAdapter {
    public volatile Constructor constructorRef;
    public final JsonAdapter nullableIntAdapter;
    public final JsonReader.Options options;

    public MetadataUnreadCountsJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("announcements", "conversations", "mentions", "messages");
        this.nullableIntAdapter = moshi.adapter(Integer.class, EmptySet.INSTANCE, "announcements");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (selectName == 1) {
                num2 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (selectName == 2) {
                num3 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                i &= -5;
            } else if (selectName == 3) {
                num4 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                i &= -9;
            }
        }
        jsonReader.endObject();
        if (i == -16) {
            return new MetadataUnreadCounts(num, num2, num3, num4);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            constructor = MetadataUnreadCounts.class.getDeclaredConstructor(Integer.class, Integer.class, Integer.class, Integer.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        Object newInstance = constructor.newInstance(num, num2, num3, num4, Integer.valueOf(i), null);
        newInstance.getClass();
        return (MetadataUnreadCounts) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        MetadataUnreadCounts metadataUnreadCounts = (MetadataUnreadCounts) obj;
        jsonWriter.getClass();
        if (metadataUnreadCounts == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("announcements");
        Integer num = metadataUnreadCounts.announcements;
        JsonAdapter jsonAdapter = this.nullableIntAdapter;
        jsonAdapter.toJson(jsonWriter, num);
        jsonWriter.name("conversations");
        jsonAdapter.toJson(jsonWriter, metadataUnreadCounts.conversations);
        jsonWriter.name("mentions");
        jsonAdapter.toJson(jsonWriter, metadataUnreadCounts.mentions);
        jsonWriter.name("messages");
        jsonAdapter.toJson(jsonWriter, metadataUnreadCounts.messages);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(42, "GeneratedJsonAdapter(MetadataUnreadCounts)");
    }
}
