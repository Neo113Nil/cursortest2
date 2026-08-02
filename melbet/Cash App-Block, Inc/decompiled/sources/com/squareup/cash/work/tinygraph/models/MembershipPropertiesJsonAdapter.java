package com.squareup.cash.work.tinygraph.models;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import java.util.Set;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/work/tinygraph/models/MembershipPropertiesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/work/tinygraph/models/MembershipProperties;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MembershipPropertiesJsonAdapter extends JsonAdapter {
    public volatile Constructor constructorRef;
    public final JsonAdapter nullableBooleanAdapter;
    public final JsonAdapter nullableMembershipWageAdapter;
    public final JsonAdapter nullableSetOfStringAdapter;
    public final JsonAdapter nullableStringAdapter;
    public final JsonReader.Options options;

    public MembershipPropertiesJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("isOwner", "isAdmin", "accessBlockers", "teamMemberId", "wage");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "isOwner");
        this.nullableSetOfStringAdapter = moshi.adapter(Types.newParameterizedType(Set.class, String.class), emptySet, "accessBlockers");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "teamMemberId");
        this.nullableMembershipWageAdapter = moshi.adapter(MembershipWage.class, emptySet, "wage");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        Boolean bool = null;
        Boolean bool2 = null;
        Set set = null;
        String str = null;
        MembershipWage membershipWage = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                bool = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (selectName == 1) {
                bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (selectName == 2) {
                set = (Set) this.nullableSetOfStringAdapter.fromJson(jsonReader);
                i &= -5;
            } else if (selectName == 3) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                i &= -9;
            } else if (selectName == 4) {
                membershipWage = (MembershipWage) this.nullableMembershipWageAdapter.fromJson(jsonReader);
                i &= -17;
            }
        }
        jsonReader.endObject();
        if (i == -32) {
            MembershipWage membershipWage2 = membershipWage;
            String str2 = str;
            return new MembershipProperties(bool, bool2, set, str2, membershipWage2);
        }
        MembershipWage membershipWage3 = membershipWage;
        String str3 = str;
        Set set2 = set;
        Boolean bool3 = bool2;
        Boolean bool4 = bool;
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            constructor = MembershipProperties.class.getDeclaredConstructor(Boolean.class, Boolean.class, Set.class, String.class, MembershipWage.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        Object newInstance = constructor.newInstance(bool4, bool3, set2, str3, membershipWage3, Integer.valueOf(i), null);
        newInstance.getClass();
        return (MembershipProperties) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        MembershipProperties membershipProperties = (MembershipProperties) obj;
        jsonWriter.getClass();
        if (membershipProperties == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("isOwner");
        Boolean bool = membershipProperties.isOwner;
        JsonAdapter jsonAdapter = this.nullableBooleanAdapter;
        jsonAdapter.toJson(jsonWriter, bool);
        jsonWriter.name("isAdmin");
        jsonAdapter.toJson(jsonWriter, membershipProperties.isAdmin);
        jsonWriter.name("accessBlockers");
        this.nullableSetOfStringAdapter.toJson(jsonWriter, membershipProperties.accessBlockers);
        jsonWriter.name("teamMemberId");
        this.nullableStringAdapter.toJson(jsonWriter, membershipProperties.teamMemberId);
        jsonWriter.name("wage");
        this.nullableMembershipWageAdapter.toJson(jsonWriter, membershipProperties.wage);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(42, "GeneratedJsonAdapter(MembershipProperties)");
    }
}
