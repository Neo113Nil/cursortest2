package com.withpersona.sdk2.inquiry.ui.network;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/LocationDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LocationDataJsonAdapter extends JsonAdapter {
    public volatile Constructor constructorRef;
    public final JsonAdapter nullableStringAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public LocationDataJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("id", "address_street_1", "address_street_2", "address_city", "address_subdivision", "address_postal_code", "address_country_code", "address_business_name");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "addressStreet1");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
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
                    str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -3;
                    break;
                case 2:
                    str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -5;
                    break;
                case 3:
                    str4 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    str5 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    str6 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -33;
                    break;
                case 6:
                    str7 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -65;
                    break;
                case 7:
                    str8 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -129;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -255) {
            String str9 = str8;
            String str10 = str7;
            String str11 = str6;
            String str12 = str5;
            String str13 = str4;
            String str14 = str3;
            String str15 = str2;
            String str16 = str;
            if (str16 != null) {
                return new LocationData(str16, str15, str14, str13, str12, str11, str10, str9);
            }
            throw Util.missingProperty("id", "id", jsonReader);
        }
        String str17 = str8;
        String str18 = str7;
        String str19 = str6;
        String str20 = str5;
        String str21 = str4;
        String str22 = str3;
        String str23 = str2;
        String str24 = str;
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            constructor = LocationData.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        if (str24 == null) {
            throw Util.missingProperty("id", "id", jsonReader);
        }
        Object newInstance = constructor.newInstance(str24, str23, str22, str21, str20, str19, str18, str17, Integer.valueOf(i), null);
        newInstance.getClass();
        return (LocationData) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        LocationData locationData = (LocationData) obj;
        jsonWriter.getClass();
        if (locationData == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, locationData.id);
        jsonWriter.name("address_street_1");
        String str = locationData.addressStreet1;
        JsonAdapter jsonAdapter = this.nullableStringAdapter;
        jsonAdapter.toJson(jsonWriter, str);
        jsonWriter.name("address_street_2");
        jsonAdapter.toJson(jsonWriter, locationData.addressStreet2);
        jsonWriter.name("address_city");
        jsonAdapter.toJson(jsonWriter, locationData.addressCity);
        jsonWriter.name("address_subdivision");
        jsonAdapter.toJson(jsonWriter, locationData.addressSubdivision);
        jsonWriter.name("address_postal_code");
        jsonAdapter.toJson(jsonWriter, locationData.addressPostalCode);
        jsonWriter.name("address_country_code");
        jsonAdapter.toJson(jsonWriter, locationData.addressCountryCode);
        jsonWriter.name("address_business_name");
        jsonAdapter.toJson(jsonWriter, locationData.addressBusinessName);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(34, "GeneratedJsonAdapter(LocationData)");
    }
}
