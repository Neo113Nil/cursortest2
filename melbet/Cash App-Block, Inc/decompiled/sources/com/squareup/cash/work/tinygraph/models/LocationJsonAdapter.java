package com.squareup.cash.work.tinygraph.models;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.work.tinygraph.models.Location;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/work/tinygraph/models/LocationJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/work/tinygraph/models/Location;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LocationJsonAdapter extends JsonAdapter {
    public volatile Constructor constructorRef;
    public final JsonAdapter longAdapter;
    public final JsonAdapter nullableAnyAdapter;
    public final JsonAdapter nullableCoordinatesAdapter;
    public final JsonAdapter nullableEntityReferenceAdapter;
    public final JsonAdapter nullableLocationStatusAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public LocationJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("id", "createdAt", "updatedAt", "proto", "merchantId", "status", "coordinates");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "createdAt");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, "protoJson");
        this.nullableEntityReferenceAdapter = moshi.adapter(EntityReference.class, emptySet, "merchantId");
        this.nullableLocationStatusAdapter = moshi.adapter(LocationStatus.class, emptySet, "status");
        this.nullableCoordinatesAdapter = moshi.adapter(Location.Coordinates.class, emptySet, "coordinates");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        int i = -1;
        String str = null;
        Long l = null;
        Long l2 = null;
        Object obj = null;
        EntityReference entityReference = null;
        LocationStatus locationStatus = null;
        Location.Coordinates coordinates = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("id", "id", jsonReader);
                    }
                    break;
                case 1:
                    l = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l == null) {
                        throw Util.unexpectedNull("createdAt", "createdAt", jsonReader);
                    }
                    break;
                case 2:
                    l2 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l2 == null) {
                        throw Util.unexpectedNull("updatedAt", "updatedAt", jsonReader);
                    }
                    break;
                case 3:
                    obj = this.nullableAnyAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    entityReference = (EntityReference) this.nullableEntityReferenceAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    locationStatus = (LocationStatus) this.nullableLocationStatusAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    coordinates = (Location.Coordinates) this.nullableCoordinatesAdapter.fromJson(jsonReader);
                    i = -65;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -65) {
            Long l3 = l;
            String str2 = str;
            if (str2 == null) {
                throw Util.missingProperty("id", "id", jsonReader);
            }
            if (l3 == null) {
                throw Util.missingProperty("createdAt", "createdAt", jsonReader);
            }
            Long l4 = l2;
            Location.Coordinates coordinates2 = coordinates;
            Object obj2 = obj;
            long longValue = l3.longValue();
            if (l4 == null) {
                throw Util.missingProperty("updatedAt", "updatedAt", jsonReader);
            }
            return new Location(str2, longValue, l4.longValue(), obj2, entityReference, locationStatus, coordinates2);
        }
        Long l5 = l;
        EntityReference entityReference2 = entityReference;
        String str3 = str;
        Long l6 = l2;
        Location.Coordinates coordinates3 = coordinates;
        Object obj3 = obj;
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls3 = Long.TYPE;
            constructor = Location.class.getDeclaredConstructor(String.class, cls3, cls3, Object.class, EntityReference.class, LocationStatus.class, Location.Coordinates.class, cls, cls2);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        Constructor constructor2 = constructor;
        if (str3 == null) {
            throw Util.missingProperty("id", "id", jsonReader);
        }
        if (l5 == null) {
            throw Util.missingProperty("createdAt", "createdAt", jsonReader);
        }
        if (l6 == null) {
            throw Util.missingProperty("updatedAt", "updatedAt", jsonReader);
        }
        Object newInstance = constructor2.newInstance(str3, l5, l6, obj3, entityReference2, locationStatus, coordinates3, Integer.valueOf(i), null);
        newInstance.getClass();
        return (Location) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        Location location = (Location) obj;
        jsonWriter.getClass();
        if (location == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, location.id);
        jsonWriter.name("createdAt");
        long j = location.createdAt;
        JsonAdapter jsonAdapter = this.longAdapter;
        BalanceFeedKt$$ExternalSyntheticOutline0.m(j, jsonAdapter, jsonWriter, "updatedAt");
        BalanceFeedKt$$ExternalSyntheticOutline0.m(location.updatedAt, jsonAdapter, jsonWriter, "proto");
        this.nullableAnyAdapter.toJson(jsonWriter, location.protoJson);
        jsonWriter.name("merchantId");
        this.nullableEntityReferenceAdapter.toJson(jsonWriter, location.merchantId);
        jsonWriter.name("status");
        this.nullableLocationStatusAdapter.toJson(jsonWriter, location.status);
        jsonWriter.name("coordinates");
        this.nullableCoordinatesAdapter.toJson(jsonWriter, location.coordinates);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(30, "GeneratedJsonAdapter(Location)");
    }
}
