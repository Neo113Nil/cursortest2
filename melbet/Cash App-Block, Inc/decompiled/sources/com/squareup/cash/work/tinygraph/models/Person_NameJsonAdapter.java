package com.squareup.cash.work.tinygraph.models;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.work.tinygraph.models.Person;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/work/tinygraph/models/Person_NameJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/work/tinygraph/models/Person$Name;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Person_NameJsonAdapter extends JsonAdapter {
    public volatile Constructor constructorRef;
    public final JsonAdapter nullableStringAdapter;
    public final JsonReader.Options options;

    public Person_NameJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("firstName", "lastName", "givenName", "familyName", "fullName", "initials");
        this.nullableStringAdapter = moshi.adapter(String.class, EmptySet.INSTANCE, "firstName");
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
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -2;
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
            }
        }
        jsonReader.endObject();
        if (i == -64) {
            String str7 = str6;
            String str8 = str5;
            String str9 = str4;
            return new Person.Name(str, str2, str3, str9, str8, str7);
        }
        String str10 = str6;
        String str11 = str5;
        String str12 = str4;
        String str13 = str3;
        String str14 = str2;
        String str15 = str;
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Person.Name.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        Object newInstance = constructor.newInstance(str15, str14, str13, str12, str11, str10, Integer.valueOf(i), null);
        newInstance.getClass();
        return (Person.Name) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        Person.Name name = (Person.Name) obj;
        jsonWriter.getClass();
        if (name == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("firstName");
        String str = name.firstName;
        JsonAdapter jsonAdapter = this.nullableStringAdapter;
        jsonAdapter.toJson(jsonWriter, str);
        jsonWriter.name("lastName");
        jsonAdapter.toJson(jsonWriter, name.lastName);
        jsonWriter.name("givenName");
        jsonAdapter.toJson(jsonWriter, name.givenName);
        jsonWriter.name("familyName");
        jsonAdapter.toJson(jsonWriter, name.familyName);
        jsonWriter.name("fullName");
        jsonAdapter.toJson(jsonWriter, name.fullName);
        jsonWriter.name("initials");
        jsonAdapter.toJson(jsonWriter, name.initials);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(33, "GeneratedJsonAdapter(Person.Name)");
    }
}
