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

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/work/tinygraph/models/MetadataPropertiesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/work/tinygraph/models/MetadataProperties;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MetadataPropertiesJsonAdapter extends JsonAdapter {
    public volatile Constructor constructorRef;
    public final JsonAdapter nullableLastSentActivityAdapter;
    public final JsonAdapter nullableLongAdapter;
    public final JsonAdapter nullableMetadataCommunicationsAdapter;
    public final JsonAdapter nullableMetadataUnreadCountsAdapter;
    public final JsonReader.Options options;

    public MetadataPropertiesJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("communications", "unreadCounts", "lastSentActivity", "lastReadActivity", "lastVisibleMessageReadActivity", "muteEndTime", "conversationCutOff", "earliestVisibleMessageCreatedAt");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableMetadataCommunicationsAdapter = moshi.adapter(MetadataCommunications.class, emptySet, "communications");
        this.nullableMetadataUnreadCountsAdapter = moshi.adapter(MetadataUnreadCounts.class, emptySet, "unreadCounts");
        this.nullableLastSentActivityAdapter = moshi.adapter(LastSentActivity.class, emptySet, "lastSentActivity");
        this.nullableLongAdapter = moshi.adapter(Long.class, emptySet, "muteEndTime");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        int i = -1;
        MetadataCommunications metadataCommunications = null;
        MetadataUnreadCounts metadataUnreadCounts = null;
        LastSentActivity lastSentActivity = null;
        LastSentActivity lastSentActivity2 = null;
        LastSentActivity lastSentActivity3 = null;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    metadataCommunications = (MetadataCommunications) this.nullableMetadataCommunicationsAdapter.fromJson(jsonReader);
                    i &= -2;
                    break;
                case 1:
                    metadataUnreadCounts = (MetadataUnreadCounts) this.nullableMetadataUnreadCountsAdapter.fromJson(jsonReader);
                    i &= -3;
                    break;
                case 2:
                    lastSentActivity = (LastSentActivity) this.nullableLastSentActivityAdapter.fromJson(jsonReader);
                    i &= -5;
                    break;
                case 3:
                    lastSentActivity2 = (LastSentActivity) this.nullableLastSentActivityAdapter.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    lastSentActivity3 = (LastSentActivity) this.nullableLastSentActivityAdapter.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    l = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    i &= -33;
                    break;
                case 6:
                    l2 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    i &= -65;
                    break;
                case 7:
                    l3 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    i &= -129;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -256) {
            Long l4 = l3;
            Long l5 = l2;
            Long l6 = l;
            LastSentActivity lastSentActivity4 = lastSentActivity3;
            LastSentActivity lastSentActivity5 = lastSentActivity2;
            return new MetadataProperties(metadataCommunications, metadataUnreadCounts, lastSentActivity, lastSentActivity5, lastSentActivity4, l6, l5, l4);
        }
        Long l7 = l3;
        Long l8 = l2;
        Long l9 = l;
        LastSentActivity lastSentActivity6 = lastSentActivity3;
        LastSentActivity lastSentActivity7 = lastSentActivity2;
        LastSentActivity lastSentActivity8 = lastSentActivity;
        MetadataUnreadCounts metadataUnreadCounts2 = metadataUnreadCounts;
        MetadataCommunications metadataCommunications2 = metadataCommunications;
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            constructor = MetadataProperties.class.getDeclaredConstructor(MetadataCommunications.class, MetadataUnreadCounts.class, LastSentActivity.class, LastSentActivity.class, LastSentActivity.class, Long.class, Long.class, Long.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        Object newInstance = constructor.newInstance(metadataCommunications2, metadataUnreadCounts2, lastSentActivity8, lastSentActivity7, lastSentActivity6, l9, l8, l7, Integer.valueOf(i), null);
        newInstance.getClass();
        return (MetadataProperties) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        MetadataProperties metadataProperties = (MetadataProperties) obj;
        jsonWriter.getClass();
        if (metadataProperties == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("communications");
        this.nullableMetadataCommunicationsAdapter.toJson(jsonWriter, metadataProperties.communications);
        jsonWriter.name("unreadCounts");
        this.nullableMetadataUnreadCountsAdapter.toJson(jsonWriter, metadataProperties.unreadCounts);
        jsonWriter.name("lastSentActivity");
        LastSentActivity lastSentActivity = metadataProperties.lastSentActivity;
        JsonAdapter jsonAdapter = this.nullableLastSentActivityAdapter;
        jsonAdapter.toJson(jsonWriter, lastSentActivity);
        jsonWriter.name("lastReadActivity");
        jsonAdapter.toJson(jsonWriter, metadataProperties.lastReadActivity);
        jsonWriter.name("lastVisibleMessageReadActivity");
        jsonAdapter.toJson(jsonWriter, metadataProperties.lastVisibleMessageReadActivity);
        jsonWriter.name("muteEndTime");
        Long l = metadataProperties.muteEndTime;
        JsonAdapter jsonAdapter2 = this.nullableLongAdapter;
        jsonAdapter2.toJson(jsonWriter, l);
        jsonWriter.name("conversationCutOff");
        jsonAdapter2.toJson(jsonWriter, metadataProperties.conversationCutOff);
        jsonWriter.name("earliestVisibleMessageCreatedAt");
        jsonAdapter2.toJson(jsonWriter, metadataProperties.earliestVisibleMessageCreatedAt);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(40, "GeneratedJsonAdapter(MetadataProperties)");
    }
}
