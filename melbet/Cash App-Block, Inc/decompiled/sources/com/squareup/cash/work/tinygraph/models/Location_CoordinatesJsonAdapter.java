package com.squareup.cash.work.tinygraph.models;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.work.tinygraph.models.Location;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/work/tinygraph/models/Location_CoordinatesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/work/tinygraph/models/Location$Coordinates;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Location_CoordinatesJsonAdapter extends JsonAdapter {
    public final JsonAdapter doubleAdapter;
    public final JsonReader.Options options;

    public Location_CoordinatesJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("latitude", "longitude");
        this.doubleAdapter = moshi.adapter(Double.TYPE, EmptySet.INSTANCE, "latitude");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        Double d = null;
        Double d2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName != -1) {
                JsonAdapter jsonAdapter = this.doubleAdapter;
                if (selectName == 0) {
                    d = (Double) jsonAdapter.fromJson(jsonReader);
                    if (d == null) {
                        throw Util.unexpectedNull("latitude", "latitude", jsonReader);
                    }
                } else if (selectName == 1 && (d2 = (Double) jsonAdapter.fromJson(jsonReader)) == null) {
                    throw Util.unexpectedNull("longitude", "longitude", jsonReader);
                }
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (d == null) {
            throw Util.missingProperty("latitude", "latitude", jsonReader);
        }
        double doubleValue = d.doubleValue();
        if (d2 != null) {
            return new Location.Coordinates(doubleValue, d2.doubleValue());
        }
        throw Util.missingProperty("longitude", "longitude", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        Location.Coordinates coordinates = (Location.Coordinates) obj;
        jsonWriter.getClass();
        if (coordinates == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("latitude");
        Double valueOf = Double.valueOf(coordinates.latitude);
        JsonAdapter jsonAdapter = this.doubleAdapter;
        jsonAdapter.toJson(jsonWriter, valueOf);
        jsonWriter.name("longitude");
        jsonAdapter.toJson(jsonWriter, Double.valueOf(coordinates.longitude));
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(42, "GeneratedJsonAdapter(Location.Coordinates)");
    }
}
