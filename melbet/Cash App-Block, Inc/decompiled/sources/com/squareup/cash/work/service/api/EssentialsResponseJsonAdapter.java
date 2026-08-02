package com.squareup.cash.work.service.api;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.knotapi.knot.utilities.PreferenceManager;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.work.tinygraph.models.Job;
import com.squareup.cash.work.tinygraph.models.Location;
import com.squareup.cash.work.tinygraph.models.Membership;
import com.squareup.cash.work.tinygraph.models.Merchant;
import com.squareup.cash.work.tinygraph.models.Person;
import com.squareup.cash.work.tinygraph.models.Setting;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/work/service/api/EssentialsResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/work/service/api/EssentialsResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EssentialsResponseJsonAdapter extends JsonAdapter {
    public volatile Constructor constructorRef;
    public final JsonAdapter nullableListOfJobAdapter;
    public final JsonAdapter nullableListOfLocationAdapter;
    public final JsonAdapter nullableListOfMembershipAdapter;
    public final JsonAdapter nullableListOfMerchantAdapter;
    public final JsonAdapter nullableListOfMetadataAdapter;
    public final JsonAdapter nullableListOfSettingAdapter;
    public final JsonAdapter nullablePersonAdapter;
    public final JsonReader.Options options;

    public EssentialsResponseJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("person", "merchants", "memberships", "membershipMetadatas", "locations", "jobs", PreferenceManager.PREF_SETTINGS);
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullablePersonAdapter = moshi.adapter(Person.class, emptySet, "person");
        this.nullableListOfMerchantAdapter = moshi.adapter(Types.newParameterizedType(List.class, Merchant.class), emptySet, "merchants");
        this.nullableListOfMembershipAdapter = moshi.adapter(Types.newParameterizedType(List.class, Membership.class), emptySet, "memberships");
        this.nullableListOfMetadataAdapter = moshi.adapter(Types.newParameterizedType(List.class, com.squareup.cash.work.tinygraph.models.Metadata.class), emptySet, "metadatas");
        this.nullableListOfLocationAdapter = moshi.adapter(Types.newParameterizedType(List.class, Location.class), emptySet, "locations");
        this.nullableListOfJobAdapter = moshi.adapter(Types.newParameterizedType(List.class, Job.class), emptySet, "jobs");
        this.nullableListOfSettingAdapter = moshi.adapter(Types.newParameterizedType(List.class, Setting.class), emptySet, PreferenceManager.PREF_SETTINGS);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        int i = -1;
        Person person = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        List list6 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    person = (Person) this.nullablePersonAdapter.fromJson(jsonReader);
                    i &= -2;
                    break;
                case 1:
                    list = (List) this.nullableListOfMerchantAdapter.fromJson(jsonReader);
                    i &= -3;
                    break;
                case 2:
                    list2 = (List) this.nullableListOfMembershipAdapter.fromJson(jsonReader);
                    i &= -5;
                    break;
                case 3:
                    list3 = (List) this.nullableListOfMetadataAdapter.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    list4 = (List) this.nullableListOfLocationAdapter.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    list5 = (List) this.nullableListOfJobAdapter.fromJson(jsonReader);
                    i &= -33;
                    break;
                case 6:
                    list6 = (List) this.nullableListOfSettingAdapter.fromJson(jsonReader);
                    i &= -65;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -128) {
            List list7 = list6;
            List list8 = list5;
            List list9 = list4;
            List list10 = list3;
            return new EssentialsResponse(person, list, list2, list10, list9, list8, list7);
        }
        List list11 = list6;
        List list12 = list5;
        List list13 = list4;
        List list14 = list3;
        List list15 = list2;
        List list16 = list;
        Person person2 = person;
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            constructor = EssentialsResponse.class.getDeclaredConstructor(Person.class, List.class, List.class, List.class, List.class, List.class, List.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        Object newInstance = constructor.newInstance(person2, list16, list15, list14, list13, list12, list11, Integer.valueOf(i), null);
        newInstance.getClass();
        return (EssentialsResponse) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        EssentialsResponse essentialsResponse = (EssentialsResponse) obj;
        jsonWriter.getClass();
        if (essentialsResponse == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("person");
        this.nullablePersonAdapter.toJson(jsonWriter, essentialsResponse.person);
        jsonWriter.name("merchants");
        this.nullableListOfMerchantAdapter.toJson(jsonWriter, essentialsResponse.merchants);
        jsonWriter.name("memberships");
        this.nullableListOfMembershipAdapter.toJson(jsonWriter, essentialsResponse.memberships);
        jsonWriter.name("membershipMetadatas");
        this.nullableListOfMetadataAdapter.toJson(jsonWriter, essentialsResponse.metadatas);
        jsonWriter.name("locations");
        this.nullableListOfLocationAdapter.toJson(jsonWriter, essentialsResponse.locations);
        jsonWriter.name("jobs");
        this.nullableListOfJobAdapter.toJson(jsonWriter, essentialsResponse.jobs);
        jsonWriter.name(PreferenceManager.PREF_SETTINGS);
        this.nullableListOfSettingAdapter.toJson(jsonWriter, essentialsResponse.settings);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(40, "GeneratedJsonAdapter(EssentialsResponse)");
    }
}
