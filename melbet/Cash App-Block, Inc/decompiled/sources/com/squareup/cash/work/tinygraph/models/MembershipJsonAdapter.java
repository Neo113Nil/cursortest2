package com.squareup.cash.work.tinygraph.models;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/work/tinygraph/models/MembershipJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/work/tinygraph/models/Membership;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MembershipJsonAdapter extends JsonAdapter {
    public volatile Constructor constructorRef;
    public final JsonAdapter entityReferenceAdapter;
    public final JsonAdapter longAdapter;
    public final JsonAdapter nullableBooleanAdapter;
    public final JsonAdapter nullableEntityReferenceAdapter;
    public final JsonAdapter nullableListOfStringAdapter;
    public final JsonAdapter nullableLongAdapter;
    public final JsonAdapter nullableMembershipPropertiesAdapter;
    public final JsonAdapter nullableMembershipStatusAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public MembershipJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("id", "createdAt", "updatedAt", "fromId", "toId", "merchantId", "isTransitive", "metadataId", "status", "invitedAt", "properties", "permissions");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "createdAt");
        this.entityReferenceAdapter = moshi.adapter(EntityReference.class, emptySet, "fromReference");
        this.nullableEntityReferenceAdapter = moshi.adapter(EntityReference.class, emptySet, "merchantId");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "isTransitive");
        this.nullableMembershipStatusAdapter = moshi.adapter(MembershipStatus.class, emptySet, "status");
        this.nullableLongAdapter = moshi.adapter(Long.class, emptySet, "invitedAt");
        this.nullableMembershipPropertiesAdapter = moshi.adapter(MembershipProperties.class, emptySet, "properties");
        this.nullableListOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), emptySet, "permissions");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        String str;
        jsonReader.getClass();
        jsonReader.beginObject();
        int i = -1;
        String str2 = null;
        Long l = null;
        Long l2 = null;
        EntityReference entityReference = null;
        EntityReference entityReference2 = null;
        EntityReference entityReference3 = null;
        Boolean bool = null;
        EntityReference entityReference4 = null;
        MembershipStatus membershipStatus = null;
        Long l3 = null;
        MembershipProperties membershipProperties = null;
        List list = null;
        while (true) {
            String str3 = str2;
            Long l4 = l;
            Long l5 = l2;
            if (!jsonReader.hasNext()) {
                EntityReference entityReference5 = entityReference;
                jsonReader.endObject();
                if (i == -4065) {
                    if (str3 == null) {
                        throw Util.missingProperty("id", "id", jsonReader);
                    }
                    if (l4 == null) {
                        throw Util.missingProperty("createdAt", "createdAt", jsonReader);
                    }
                    long longValue = l4.longValue();
                    if (l5 == null) {
                        throw Util.missingProperty("updatedAt", "updatedAt", jsonReader);
                    }
                    EntityReference entityReference6 = entityReference2;
                    EntityReference entityReference7 = entityReference3;
                    long longValue2 = l5.longValue();
                    if (entityReference5 == null) {
                        throw Util.missingProperty("fromReference", "fromId", jsonReader);
                    }
                    if (entityReference6 != null) {
                        return new Membership(str3, longValue, longValue2, entityReference5, entityReference6, entityReference7, bool, entityReference4, membershipStatus, l3, membershipProperties, list);
                    }
                    throw Util.missingProperty("toReference", "toId", jsonReader);
                }
                EntityReference entityReference8 = entityReference2;
                EntityReference entityReference9 = entityReference3;
                int i2 = i;
                Constructor constructor = this.constructorRef;
                if (constructor == null) {
                    Class cls = Integer.TYPE;
                    Class cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
                    Class cls3 = Long.TYPE;
                    str = str3;
                    constructor = Membership.class.getDeclaredConstructor(String.class, cls3, cls3, EntityReference.class, EntityReference.class, EntityReference.class, Boolean.class, EntityReference.class, MembershipStatus.class, Long.class, MembershipProperties.class, List.class, cls, cls2);
                    this.constructorRef = constructor;
                    constructor.getClass();
                } else {
                    str = str3;
                }
                if (str == null) {
                    throw Util.missingProperty("id", "id", jsonReader);
                }
                if (l4 == null) {
                    throw Util.missingProperty("createdAt", "createdAt", jsonReader);
                }
                if (l5 == null) {
                    throw Util.missingProperty("updatedAt", "updatedAt", jsonReader);
                }
                if (entityReference5 == null) {
                    throw Util.missingProperty("fromReference", "fromId", jsonReader);
                }
                if (entityReference8 == null) {
                    throw Util.missingProperty("toReference", "toId", jsonReader);
                }
                String str4 = str;
                Object newInstance = constructor.newInstance(str4, l4, l5, entityReference5, entityReference8, entityReference9, bool, entityReference4, membershipStatus, l3, membershipProperties, list, Integer.valueOf(i2), null);
                newInstance.getClass();
                return (Membership) newInstance;
            }
            EntityReference entityReference10 = entityReference;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    entityReference = entityReference10;
                    str2 = str3;
                    l = l4;
                    l2 = l5;
                case 0:
                    String str5 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        throw Util.unexpectedNull("id", "id", jsonReader);
                    }
                    str2 = str5;
                    entityReference = entityReference10;
                    l = l4;
                    l2 = l5;
                case 1:
                    Long l6 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l6 == null) {
                        throw Util.unexpectedNull("createdAt", "createdAt", jsonReader);
                    }
                    l = l6;
                    entityReference = entityReference10;
                    str2 = str3;
                    l2 = l5;
                case 2:
                    Long l7 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l7 == null) {
                        throw Util.unexpectedNull("updatedAt", "updatedAt", jsonReader);
                    }
                    l2 = l7;
                    entityReference = entityReference10;
                    str2 = str3;
                    l = l4;
                case 3:
                    entityReference = (EntityReference) this.entityReferenceAdapter.fromJson(jsonReader);
                    if (entityReference == null) {
                        throw Util.unexpectedNull("fromReference", "fromId", jsonReader);
                    }
                    str2 = str3;
                    l = l4;
                    l2 = l5;
                case 4:
                    entityReference2 = (EntityReference) this.entityReferenceAdapter.fromJson(jsonReader);
                    if (entityReference2 == null) {
                        throw Util.unexpectedNull("toReference", "toId", jsonReader);
                    }
                    entityReference = entityReference10;
                    str2 = str3;
                    l = l4;
                    l2 = l5;
                case 5:
                    entityReference3 = (EntityReference) this.nullableEntityReferenceAdapter.fromJson(jsonReader);
                    i &= -33;
                    entityReference = entityReference10;
                    str2 = str3;
                    l = l4;
                    l2 = l5;
                case 6:
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i &= -65;
                    entityReference = entityReference10;
                    str2 = str3;
                    l = l4;
                    l2 = l5;
                case 7:
                    entityReference4 = (EntityReference) this.nullableEntityReferenceAdapter.fromJson(jsonReader);
                    i &= -129;
                    entityReference = entityReference10;
                    str2 = str3;
                    l = l4;
                    l2 = l5;
                case 8:
                    membershipStatus = (MembershipStatus) this.nullableMembershipStatusAdapter.fromJson(jsonReader);
                    i &= -257;
                    entityReference = entityReference10;
                    str2 = str3;
                    l = l4;
                    l2 = l5;
                case 9:
                    l3 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    i &= -513;
                    entityReference = entityReference10;
                    str2 = str3;
                    l = l4;
                    l2 = l5;
                case 10:
                    membershipProperties = (MembershipProperties) this.nullableMembershipPropertiesAdapter.fromJson(jsonReader);
                    i &= -1025;
                    entityReference = entityReference10;
                    str2 = str3;
                    l = l4;
                    l2 = l5;
                case 11:
                    list = (List) this.nullableListOfStringAdapter.fromJson(jsonReader);
                    i &= -2049;
                    entityReference = entityReference10;
                    str2 = str3;
                    l = l4;
                    l2 = l5;
                default:
                    entityReference = entityReference10;
                    str2 = str3;
                    l = l4;
                    l2 = l5;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        Membership membership = (Membership) obj;
        jsonWriter.getClass();
        if (membership == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, membership.id);
        jsonWriter.name("createdAt");
        long j = membership.createdAt;
        JsonAdapter jsonAdapter = this.longAdapter;
        BalanceFeedKt$$ExternalSyntheticOutline0.m(j, jsonAdapter, jsonWriter, "updatedAt");
        BalanceFeedKt$$ExternalSyntheticOutline0.m(membership.updatedAt, jsonAdapter, jsonWriter, "fromId");
        EntityReference entityReference = membership.fromReference;
        JsonAdapter jsonAdapter2 = this.entityReferenceAdapter;
        jsonAdapter2.toJson(jsonWriter, entityReference);
        jsonWriter.name("toId");
        jsonAdapter2.toJson(jsonWriter, membership.toReference);
        jsonWriter.name("merchantId");
        EntityReference entityReference2 = membership.merchantId;
        JsonAdapter jsonAdapter3 = this.nullableEntityReferenceAdapter;
        jsonAdapter3.toJson(jsonWriter, entityReference2);
        jsonWriter.name("isTransitive");
        this.nullableBooleanAdapter.toJson(jsonWriter, membership.isTransitive);
        jsonWriter.name("metadataId");
        jsonAdapter3.toJson(jsonWriter, membership.metadataReference);
        jsonWriter.name("status");
        this.nullableMembershipStatusAdapter.toJson(jsonWriter, membership.status);
        jsonWriter.name("invitedAt");
        this.nullableLongAdapter.toJson(jsonWriter, membership.invitedAt);
        jsonWriter.name("properties");
        this.nullableMembershipPropertiesAdapter.toJson(jsonWriter, membership.properties);
        jsonWriter.name("permissions");
        this.nullableListOfStringAdapter.toJson(jsonWriter, membership.permissions);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(32, "GeneratedJsonAdapter(Membership)");
    }
}
