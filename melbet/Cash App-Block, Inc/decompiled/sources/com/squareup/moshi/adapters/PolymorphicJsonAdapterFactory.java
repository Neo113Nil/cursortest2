package com.squareup.moshi.adapters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class PolymorphicJsonAdapterFactory implements JsonAdapter.Factory {
    public final Class baseType;
    public final JsonAdapter fallbackJsonAdapter;
    public final String labelKey;
    public final List labels;
    public final List subtypes;

    public final class PolymorphicJsonAdapter extends JsonAdapter {
        public final JsonAdapter fallbackJsonAdapter;
        public final ArrayList jsonAdapters;
        public final String labelKey;
        public final JsonReader.Options labelKeyOptions;
        public final JsonReader.Options labelOptions;
        public final List labels;
        public final List subtypes;

        public PolymorphicJsonAdapter(String str, List list, List list2, ArrayList arrayList, JsonAdapter jsonAdapter) {
            this.labelKey = str;
            this.labels = list;
            this.subtypes = list2;
            this.jsonAdapters = arrayList;
            this.fallbackJsonAdapter = jsonAdapter;
            this.labelKeyOptions = JsonReader.Options.of(str);
            this.labelOptions = JsonReader.Options.of((String[]) list.toArray(new String[0]));
        }

        @Override // com.squareup.moshi.JsonAdapter
        public final Object fromJson(JsonReader jsonReader) {
            JsonReader peekJson = jsonReader.peekJson();
            peekJson.failOnUnknown = false;
            try {
                int labelIndex = labelIndex(peekJson);
                peekJson.close();
                return labelIndex == -1 ? this.fallbackJsonAdapter.fromJson(jsonReader) : ((JsonAdapter) this.jsonAdapters.get(labelIndex)).fromJson(jsonReader);
            } catch (Throwable th) {
                peekJson.close();
                throw th;
            }
        }

        public final int labelIndex(JsonReader jsonReader) {
            jsonReader.beginObject();
            while (true) {
                boolean hasNext = jsonReader.hasNext();
                String str = this.labelKey;
                if (!hasNext) {
                    throw new JsonDataException("Missing label for ".concat(str));
                }
                if (jsonReader.selectName(this.labelKeyOptions) != -1) {
                    int selectString = jsonReader.selectString(this.labelOptions);
                    if (selectString != -1 || this.fallbackJsonAdapter != null) {
                        return selectString;
                    }
                    StringBuilder sb = new StringBuilder("Expected one of ");
                    Recorder$$ExternalSyntheticOutline2.m(" for key '", str, "' but found '", sb, this.labels);
                    Path$$ExternalSyntheticBUOutline0.m(sb, jsonReader.nextString(), "'. Register a subtype for this label.");
                    return 0;
                }
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }

        @Override // com.squareup.moshi.JsonAdapter
        public final void toJson(JsonWriter jsonWriter, Object obj) {
            JsonAdapter jsonAdapter;
            Class<?> cls = obj.getClass();
            List list = this.subtypes;
            int indexOf = list.indexOf(cls);
            JsonAdapter jsonAdapter2 = this.fallbackJsonAdapter;
            if (indexOf != -1) {
                jsonAdapter = (JsonAdapter) this.jsonAdapters.get(indexOf);
            } else {
                if (jsonAdapter2 == null) {
                    StringBuilder sb = new StringBuilder("Expected one of ");
                    sb.append(list);
                    sb.append(" but found ");
                    sb.append(obj);
                    WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m(sb, ", a ", obj.getClass(), ". Register this subtype.");
                    return;
                }
                jsonAdapter = jsonAdapter2;
            }
            jsonWriter.beginObject();
            if (jsonAdapter != jsonAdapter2) {
                jsonWriter.name(this.labelKey).value((String) this.labels.get(indexOf));
            }
            int beginFlatten = jsonWriter.beginFlatten();
            jsonAdapter.toJson(jsonWriter, obj);
            jsonWriter.flattenStackSize = beginFlatten;
            jsonWriter.endObject();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("PolymorphicJsonAdapter("), this.labelKey, ")");
        }
    }

    public PolymorphicJsonAdapterFactory(Class cls, String str, List list, List list2, JsonAdapter jsonAdapter) {
        this.baseType = cls;
        this.labelKey = str;
        this.labels = list;
        this.subtypes = list2;
        this.fallbackJsonAdapter = jsonAdapter;
    }

    public static PolymorphicJsonAdapterFactory of(Class cls, String str) {
        List list = Collections.EMPTY_LIST;
        return new PolymorphicJsonAdapterFactory(cls, str, list, list, null);
    }

    @Override // com.squareup.moshi.JsonAdapter.Factory
    public final JsonAdapter create(Type type2, Set set, Moshi moshi) {
        if (Types.getRawType(type2) != this.baseType || !set.isEmpty()) {
            return null;
        }
        List list = this.subtypes;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(moshi.adapter((Type) list.get(i)));
        }
        return new PolymorphicJsonAdapter(this.labelKey, this.labels, this.subtypes, arrayList, this.fallbackJsonAdapter).nullSafe();
    }

    public final PolymorphicJsonAdapterFactory withFallbackJsonAdapter(JsonAdapter jsonAdapter) {
        return new PolymorphicJsonAdapterFactory(this.baseType, this.labelKey, this.labels, this.subtypes, jsonAdapter);
    }

    public final PolymorphicJsonAdapterFactory withSubtype(Class cls, String str) {
        List list = this.labels;
        if (list.contains(str)) {
            a$$ExternalSyntheticBUOutline0.m$3("Labels must be unique.");
            return null;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(str);
        ArrayList arrayList2 = new ArrayList(this.subtypes);
        arrayList2.add(cls);
        return new PolymorphicJsonAdapterFactory(this.baseType, this.labelKey, arrayList, arrayList2, this.fallbackJsonAdapter);
    }
}
