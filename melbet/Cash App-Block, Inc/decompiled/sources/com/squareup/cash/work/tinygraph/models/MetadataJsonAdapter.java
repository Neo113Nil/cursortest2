package com.squareup.cash.work.tinygraph.models;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/work/tinygraph/models/MetadataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/work/tinygraph/models/Metadata;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MetadataJsonAdapter extends JsonAdapter {
    public volatile Constructor constructorRef;
    public final JsonAdapter entityReferenceAdapter;
    public final JsonAdapter longAdapter;
    public final JsonAdapter nullableBooleanAdapter;
    public final JsonAdapter nullableEntityReferenceAdapter;
    public final JsonAdapter nullableExtendedAttributesAdapter;
    public final JsonAdapter nullableLongAdapter;
    public final JsonAdapter nullableMetadataPropertiesAdapter;
    public final JsonAdapter nullableOnSiteStatusAdapter;
    public final JsonAdapter nullableOrganizationProfileAdapter;
    public final JsonAdapter nullableStringAdapter;
    public final JsonAdapter nullableSuspensionAdapter;
    public final JsonAdapter nullableWorkingStatusAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public MetadataJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("id", "createdAt", "updatedAt", "fromId", "toId", "onSiteStatus", "conversationCutOff", "lastAcceptedOptInPolicyId", "profile", "suspension", "workingStatus", "activeJobExperienceId", "nextGoldStarGrantDate", "extendedAttributes", "isOwner", "properties");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "createdAt");
        this.entityReferenceAdapter = moshi.adapter(EntityReference.class, emptySet, "fromReference");
        this.nullableOnSiteStatusAdapter = moshi.adapter(OnSiteStatus.class, emptySet, "onSiteStatus");
        this.nullableLongAdapter = moshi.adapter(Long.class, emptySet, "conversationCutOff");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "lastAcceptedOptInPolicyId");
        this.nullableOrganizationProfileAdapter = moshi.adapter(OrganizationProfile.class, emptySet, "profile");
        this.nullableSuspensionAdapter = moshi.adapter(Suspension.class, emptySet, "suspension");
        this.nullableWorkingStatusAdapter = moshi.adapter(WorkingStatus.class, emptySet, "workingStatus");
        this.nullableEntityReferenceAdapter = moshi.adapter(EntityReference.class, emptySet, "activeJobExperienceId");
        this.nullableExtendedAttributesAdapter = moshi.adapter(ExtendedAttributes.class, emptySet, "extendedAttributes");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "isOwner");
        this.nullableMetadataPropertiesAdapter = moshi.adapter(MetadataProperties.class, emptySet, "properties");
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
        OnSiteStatus onSiteStatus = null;
        Long l3 = null;
        String str3 = null;
        OrganizationProfile organizationProfile = null;
        Suspension suspension = null;
        WorkingStatus workingStatus = null;
        EntityReference entityReference3 = null;
        Long l4 = null;
        ExtendedAttributes extendedAttributes = null;
        Boolean bool = null;
        MetadataProperties metadataProperties = null;
        while (true) {
            String str4 = str2;
            Long l5 = l;
            Long l6 = l2;
            if (!jsonReader.hasNext()) {
                EntityReference entityReference4 = entityReference;
                jsonReader.endObject();
                if (i == -65505) {
                    if (str4 == null) {
                        throw Util.missingProperty("id", "id", jsonReader);
                    }
                    if (l5 == null) {
                        throw Util.missingProperty("createdAt", "createdAt", jsonReader);
                    }
                    long longValue = l5.longValue();
                    if (l6 == null) {
                        throw Util.missingProperty("updatedAt", "updatedAt", jsonReader);
                    }
                    EntityReference entityReference5 = entityReference2;
                    OnSiteStatus onSiteStatus2 = onSiteStatus;
                    long longValue2 = l6.longValue();
                    if (entityReference4 == null) {
                        throw Util.missingProperty("fromReference", "fromId", jsonReader);
                    }
                    if (entityReference5 != null) {
                        return new Metadata(str4, longValue, longValue2, entityReference4, entityReference5, onSiteStatus2, l3, str3, organizationProfile, suspension, workingStatus, entityReference3, l4, extendedAttributes, bool, metadataProperties);
                    }
                    throw Util.missingProperty("toReference", "toId", jsonReader);
                }
                EntityReference entityReference6 = entityReference2;
                OnSiteStatus onSiteStatus3 = onSiteStatus;
                int i2 = i;
                Constructor constructor = this.constructorRef;
                if (constructor == null) {
                    Class cls = Integer.TYPE;
                    Class cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
                    Class cls3 = Long.TYPE;
                    str = str4;
                    constructor = Metadata.class.getDeclaredConstructor(String.class, cls3, cls3, EntityReference.class, EntityReference.class, OnSiteStatus.class, Long.class, String.class, OrganizationProfile.class, Suspension.class, WorkingStatus.class, EntityReference.class, Long.class, ExtendedAttributes.class, Boolean.class, MetadataProperties.class, cls, cls2);
                    this.constructorRef = constructor;
                    constructor.getClass();
                } else {
                    str = str4;
                }
                if (str == null) {
                    throw Util.missingProperty("id", "id", jsonReader);
                }
                if (l5 == null) {
                    throw Util.missingProperty("createdAt", "createdAt", jsonReader);
                }
                if (l6 == null) {
                    throw Util.missingProperty("updatedAt", "updatedAt", jsonReader);
                }
                if (entityReference4 == null) {
                    throw Util.missingProperty("fromReference", "fromId", jsonReader);
                }
                if (entityReference6 == null) {
                    throw Util.missingProperty("toReference", "toId", jsonReader);
                }
                String str5 = str;
                Object newInstance = constructor.newInstance(str5, l5, l6, entityReference4, entityReference6, onSiteStatus3, l3, str3, organizationProfile, suspension, workingStatus, entityReference3, l4, extendedAttributes, bool, metadataProperties, Integer.valueOf(i2), null);
                newInstance.getClass();
                return (Metadata) newInstance;
            }
            EntityReference entityReference7 = entityReference;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    entityReference = entityReference7;
                    str2 = str4;
                    l = l5;
                    l2 = l6;
                case 0:
                    String str6 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str6 == null) {
                        throw Util.unexpectedNull("id", "id", jsonReader);
                    }
                    str2 = str6;
                    entityReference = entityReference7;
                    l = l5;
                    l2 = l6;
                case 1:
                    Long l7 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l7 == null) {
                        throw Util.unexpectedNull("createdAt", "createdAt", jsonReader);
                    }
                    l = l7;
                    entityReference = entityReference7;
                    str2 = str4;
                    l2 = l6;
                case 2:
                    Long l8 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l8 == null) {
                        throw Util.unexpectedNull("updatedAt", "updatedAt", jsonReader);
                    }
                    l2 = l8;
                    entityReference = entityReference7;
                    str2 = str4;
                    l = l5;
                case 3:
                    entityReference = (EntityReference) this.entityReferenceAdapter.fromJson(jsonReader);
                    if (entityReference == null) {
                        throw Util.unexpectedNull("fromReference", "fromId", jsonReader);
                    }
                    str2 = str4;
                    l = l5;
                    l2 = l6;
                case 4:
                    entityReference2 = (EntityReference) this.entityReferenceAdapter.fromJson(jsonReader);
                    if (entityReference2 == null) {
                        throw Util.unexpectedNull("toReference", "toId", jsonReader);
                    }
                    entityReference = entityReference7;
                    str2 = str4;
                    l = l5;
                    l2 = l6;
                case 5:
                    onSiteStatus = (OnSiteStatus) this.nullableOnSiteStatusAdapter.fromJson(jsonReader);
                    i &= -33;
                    entityReference = entityReference7;
                    str2 = str4;
                    l = l5;
                    l2 = l6;
                case 6:
                    l3 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    i &= -65;
                    entityReference = entityReference7;
                    str2 = str4;
                    l = l5;
                    l2 = l6;
                case 7:
                    str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -129;
                    entityReference = entityReference7;
                    str2 = str4;
                    l = l5;
                    l2 = l6;
                case 8:
                    organizationProfile = (OrganizationProfile) this.nullableOrganizationProfileAdapter.fromJson(jsonReader);
                    i &= -257;
                    entityReference = entityReference7;
                    str2 = str4;
                    l = l5;
                    l2 = l6;
                case 9:
                    suspension = (Suspension) this.nullableSuspensionAdapter.fromJson(jsonReader);
                    i &= -513;
                    entityReference = entityReference7;
                    str2 = str4;
                    l = l5;
                    l2 = l6;
                case 10:
                    workingStatus = (WorkingStatus) this.nullableWorkingStatusAdapter.fromJson(jsonReader);
                    i &= -1025;
                    entityReference = entityReference7;
                    str2 = str4;
                    l = l5;
                    l2 = l6;
                case 11:
                    entityReference3 = (EntityReference) this.nullableEntityReferenceAdapter.fromJson(jsonReader);
                    i &= -2049;
                    entityReference = entityReference7;
                    str2 = str4;
                    l = l5;
                    l2 = l6;
                case 12:
                    l4 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    i &= -4097;
                    entityReference = entityReference7;
                    str2 = str4;
                    l = l5;
                    l2 = l6;
                case 13:
                    extendedAttributes = (ExtendedAttributes) this.nullableExtendedAttributesAdapter.fromJson(jsonReader);
                    i &= -8193;
                    entityReference = entityReference7;
                    str2 = str4;
                    l = l5;
                    l2 = l6;
                case 14:
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i &= -16385;
                    entityReference = entityReference7;
                    str2 = str4;
                    l = l5;
                    l2 = l6;
                case 15:
                    metadataProperties = (MetadataProperties) this.nullableMetadataPropertiesAdapter.fromJson(jsonReader);
                    i &= -32769;
                    entityReference = entityReference7;
                    str2 = str4;
                    l = l5;
                    l2 = l6;
                default:
                    entityReference = entityReference7;
                    str2 = str4;
                    l = l5;
                    l2 = l6;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        Metadata metadata = (Metadata) obj;
        jsonWriter.getClass();
        if (metadata == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, metadata.id);
        jsonWriter.name("createdAt");
        long j = metadata.createdAt;
        JsonAdapter jsonAdapter = this.longAdapter;
        BalanceFeedKt$$ExternalSyntheticOutline0.m(j, jsonAdapter, jsonWriter, "updatedAt");
        BalanceFeedKt$$ExternalSyntheticOutline0.m(metadata.updatedAt, jsonAdapter, jsonWriter, "fromId");
        EntityReference entityReference = metadata.fromReference;
        JsonAdapter jsonAdapter2 = this.entityReferenceAdapter;
        jsonAdapter2.toJson(jsonWriter, entityReference);
        jsonWriter.name("toId");
        jsonAdapter2.toJson(jsonWriter, metadata.toReference);
        jsonWriter.name("onSiteStatus");
        this.nullableOnSiteStatusAdapter.toJson(jsonWriter, metadata.onSiteStatus);
        jsonWriter.name("conversationCutOff");
        Long l = metadata.conversationCutOff;
        JsonAdapter jsonAdapter3 = this.nullableLongAdapter;
        jsonAdapter3.toJson(jsonWriter, l);
        jsonWriter.name("lastAcceptedOptInPolicyId");
        this.nullableStringAdapter.toJson(jsonWriter, metadata.lastAcceptedOptInPolicyId);
        jsonWriter.name("profile");
        this.nullableOrganizationProfileAdapter.toJson(jsonWriter, metadata.profile);
        jsonWriter.name("suspension");
        this.nullableSuspensionAdapter.toJson(jsonWriter, metadata.suspension);
        jsonWriter.name("workingStatus");
        this.nullableWorkingStatusAdapter.toJson(jsonWriter, metadata.workingStatus);
        jsonWriter.name("activeJobExperienceId");
        this.nullableEntityReferenceAdapter.toJson(jsonWriter, metadata.activeJobExperienceId);
        jsonWriter.name("nextGoldStarGrantDate");
        jsonAdapter3.toJson(jsonWriter, metadata.nextGoldStarGrantDate);
        jsonWriter.name("extendedAttributes");
        this.nullableExtendedAttributesAdapter.toJson(jsonWriter, metadata.extendedAttributes);
        jsonWriter.name("isOwner");
        this.nullableBooleanAdapter.toJson(jsonWriter, metadata.isOwner);
        jsonWriter.name("properties");
        this.nullableMetadataPropertiesAdapter.toJson(jsonWriter, metadata.properties);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(30, "GeneratedJsonAdapter(Metadata)");
    }
}
