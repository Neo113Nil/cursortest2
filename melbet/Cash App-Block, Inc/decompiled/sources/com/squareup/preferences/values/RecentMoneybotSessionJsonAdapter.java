package com.squareup.preferences.values;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/preferences/values/RecentMoneybotSessionJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/preferences/values/RecentMoneybotSession;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "preferences"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RecentMoneybotSessionJsonAdapter extends JsonAdapter {
    public volatile Constructor constructorRef;
    public final JsonAdapter nullableLongAdapter;
    public final JsonAdapter nullableStringAdapter;
    public final JsonReader.Options options;

    public RecentMoneybotSessionJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("sessionId", "updatedAtMs");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "sessionId");
        this.nullableLongAdapter = moshi.adapter(Long.class, emptySet, "updatedAtMs");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        String str = null;
        Long l = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (selectName == 1) {
                l = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                i &= -3;
            }
        }
        jsonReader.endObject();
        if (i == -4) {
            return new RecentMoneybotSession(str, l);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            constructor = RecentMoneybotSession.class.getDeclaredConstructor(String.class, Long.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        Object newInstance = constructor.newInstance(str, l, Integer.valueOf(i), null);
        newInstance.getClass();
        return (RecentMoneybotSession) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        RecentMoneybotSession recentMoneybotSession = (RecentMoneybotSession) obj;
        jsonWriter.getClass();
        if (recentMoneybotSession == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("sessionId");
        this.nullableStringAdapter.toJson(jsonWriter, recentMoneybotSession.sessionId);
        jsonWriter.name("updatedAtMs");
        this.nullableLongAdapter.toJson(jsonWriter, recentMoneybotSession.updatedAtMs);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(43, "GeneratedJsonAdapter(RecentMoneybotSession)");
    }
}
