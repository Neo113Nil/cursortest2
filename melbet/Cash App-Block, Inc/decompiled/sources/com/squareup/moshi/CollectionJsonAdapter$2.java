package com.squareup.moshi;

import com.squareup.moshi.MapJsonAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class CollectionJsonAdapter$2 extends JsonAdapter {
    public static final MapJsonAdapter.AnonymousClass1 FACTORY = new MapJsonAdapter.AnonymousClass1(3);
    public final /* synthetic */ int $r8$classId;
    public final JsonAdapter elementAdapter;

    public CollectionJsonAdapter$2(JsonAdapter jsonAdapter, int i) {
        this.$r8$classId = i;
        this.elementAdapter = jsonAdapter;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        int i = this.$r8$classId;
        JsonAdapter jsonAdapter = this.elementAdapter;
        switch (i) {
            case 0:
                Collection newCollection = newCollection();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    ((ArrayList) newCollection).add(jsonAdapter.fromJson(jsonReader));
                }
                jsonReader.endArray();
                return newCollection;
            default:
                Collection newCollection2 = newCollection();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    newCollection2.add(jsonAdapter.fromJson(jsonReader));
                }
                jsonReader.endArray();
                return newCollection2;
        }
    }

    public final Collection newCollection() {
        switch (this.$r8$classId) {
            case 0:
                return new ArrayList();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        int i = this.$r8$classId;
        JsonAdapter jsonAdapter = this.elementAdapter;
        switch (i) {
            case 0:
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    jsonAdapter.toJson(jsonWriter, it.next());
                }
                jsonWriter.endArray();
                break;
            default:
                jsonWriter.beginArray();
                Iterator it2 = ((Collection) obj).iterator();
                while (it2.hasNext()) {
                    jsonAdapter.toJson(jsonWriter, it2.next());
                }
                jsonWriter.endArray();
                break;
        }
    }

    public final String toString() {
        return this.elementAdapter + ".collection()";
    }
}
