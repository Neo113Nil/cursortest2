package com.squareup.cash.work.tinygraph.models;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.work.tinygraph.models.Person;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/work/tinygraph/models/PersonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/work/tinygraph/models/Person;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PersonJsonAdapter extends JsonAdapter {
    public volatile Constructor constructorRef;
    public final JsonAdapter longAdapter;
    public final JsonAdapter nullableAnyAdapter;
    public final JsonAdapter nullableBooleanAdapter;
    public final JsonAdapter nullableMapOfStringNameAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public PersonJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("id", "createdAt", "updatedAt", "proto", "names", "isSquareEmployee", "isImpersonated");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "createdAt");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, "protoJson");
        this.nullableMapOfStringNameAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, Person.Name.class), emptySet, "personNamesPerMerchant");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "isSquareEmployee");
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
        Map map = null;
        Boolean bool = null;
        Boolean bool2 = null;
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
                    map = (Map) this.nullableMapOfStringNameAdapter.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i &= -33;
                    break;
                case 6:
                    bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i &= -65;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -113) {
            Long l3 = l;
            String str2 = str;
            if (str2 == null) {
                throw Util.missingProperty("id", "id", jsonReader);
            }
            if (l3 == null) {
                throw Util.missingProperty("createdAt", "createdAt", jsonReader);
            }
            Long l4 = l2;
            Boolean bool3 = bool2;
            Object obj2 = obj;
            long longValue = l3.longValue();
            if (l4 == null) {
                throw Util.missingProperty("updatedAt", "updatedAt", jsonReader);
            }
            return new Person(str2, longValue, l4.longValue(), obj2, map, bool, bool3);
        }
        Long l5 = l;
        Long l6 = l2;
        String str3 = str;
        Boolean bool4 = bool2;
        Object obj3 = obj;
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls3 = Long.TYPE;
            constructor = Person.class.getDeclaredConstructor(String.class, cls3, cls3, Object.class, Map.class, Boolean.class, Boolean.class, cls, cls2);
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
        Object newInstance = constructor2.newInstance(str3, l5, l6, obj3, map, bool, bool4, Integer.valueOf(i), null);
        newInstance.getClass();
        return (Person) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        Person person = (Person) obj;
        jsonWriter.getClass();
        if (person == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, person.id);
        jsonWriter.name("createdAt");
        long j = person.createdAt;
        JsonAdapter jsonAdapter = this.longAdapter;
        BalanceFeedKt$$ExternalSyntheticOutline0.m(j, jsonAdapter, jsonWriter, "updatedAt");
        BalanceFeedKt$$ExternalSyntheticOutline0.m(person.updatedAt, jsonAdapter, jsonWriter, "proto");
        this.nullableAnyAdapter.toJson(jsonWriter, person.protoJson);
        jsonWriter.name("names");
        this.nullableMapOfStringNameAdapter.toJson(jsonWriter, person.personNamesPerMerchant);
        jsonWriter.name("isSquareEmployee");
        Boolean bool = person.isSquareEmployee;
        JsonAdapter jsonAdapter2 = this.nullableBooleanAdapter;
        jsonAdapter2.toJson(jsonWriter, bool);
        jsonWriter.name("isImpersonated");
        jsonAdapter2.toJson(jsonWriter, person.isImpersonated);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(28, "GeneratedJsonAdapter(Person)");
    }
}
