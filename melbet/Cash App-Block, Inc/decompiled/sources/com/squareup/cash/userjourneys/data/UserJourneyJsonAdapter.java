package com.squareup.cash.userjourneys.data;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.userjourneys.tracker.UserJourney$Name;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/userjourneys/data/UserJourneyJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/userjourneys/data/UserJourney;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UserJourneyJsonAdapter extends JsonAdapter {
    public final JsonAdapter booleanAdapter;
    public volatile Constructor constructorRef;
    public final JsonAdapter journeyContextAdapter;
    public final JsonAdapter longAdapter;
    public final JsonAdapter nameAdapter;
    public final JsonAdapter nullableStringAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter setOfStringAdapter;
    public final JsonAdapter uUIDAdapter;

    public UserJourneyJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("id", "name", "createdAtEpoch", "createdAtRealtime", "frustrationSignals", "frictionSignals", "tags", "variant", "context", "isSubJourney");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.uUIDAdapter = moshi.adapter(UUID.class, emptySet, "id");
        this.nameAdapter = moshi.adapter(UserJourney$Name.class, emptySet, "name");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "createdAtEpoch");
        this.setOfStringAdapter = moshi.adapter(Types.newParameterizedType(Set.class, String.class), emptySet, "frustrationSignals");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "variant");
        this.journeyContextAdapter = moshi.adapter(JourneyContext.class, emptySet, "context");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isSubJourney");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        int i;
        jsonReader.getClass();
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        int i2 = -1;
        Boolean bool2 = bool;
        UserJourney$Name userJourney$Name = null;
        UUID uuid = null;
        Long l = null;
        Long l2 = null;
        Set set = null;
        Set set2 = null;
        Set set3 = null;
        String str = null;
        JourneyContext journeyContext = null;
        while (true) {
            UserJourney$Name userJourney$Name2 = userJourney$Name;
            UUID uuid2 = uuid;
            Long l3 = l;
            Long l4 = l2;
            Set set4 = set;
            if (!jsonReader.hasNext()) {
                Set set5 = set2;
                jsonReader.endObject();
                if (i2 == -513) {
                    if (uuid2 == null) {
                        throw Util.missingProperty("id", "id", jsonReader);
                    }
                    if (userJourney$Name2 == null) {
                        throw Util.missingProperty("name", "name", jsonReader);
                    }
                    if (l3 == null) {
                        throw Util.missingProperty("createdAtEpoch", "createdAtEpoch", jsonReader);
                    }
                    long longValue = l3.longValue();
                    if (l4 == null) {
                        throw Util.missingProperty("createdAtRealtime", "createdAtRealtime", jsonReader);
                    }
                    long longValue2 = l4.longValue();
                    if (set4 == null) {
                        throw Util.missingProperty("frustrationSignals", "frustrationSignals", jsonReader);
                    }
                    if (set5 == null) {
                        throw Util.missingProperty("frictionSignals", "frictionSignals", jsonReader);
                    }
                    if (set3 == null) {
                        throw Util.missingProperty("tags", "tags", jsonReader);
                    }
                    if (journeyContext == null) {
                        throw Util.missingProperty("context", "context", jsonReader);
                    }
                    return new UserJourney(uuid2, userJourney$Name2, longValue, longValue2, set4, set5, set3, str, journeyContext, bool2.booleanValue());
                }
                Constructor constructor = this.constructorRef;
                if (constructor == null) {
                    Class cls = Integer.TYPE;
                    Class cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
                    Class cls3 = Long.TYPE;
                    i = i2;
                    constructor = UserJourney.class.getDeclaredConstructor(UUID.class, UserJourney$Name.class, cls3, cls3, Set.class, Set.class, Set.class, String.class, JourneyContext.class, Boolean.TYPE, cls, cls2);
                    this.constructorRef = constructor;
                    constructor.getClass();
                } else {
                    i = i2;
                }
                Constructor constructor2 = constructor;
                if (uuid2 == null) {
                    throw Util.missingProperty("id", "id", jsonReader);
                }
                if (userJourney$Name2 == null) {
                    throw Util.missingProperty("name", "name", jsonReader);
                }
                if (l3 == null) {
                    throw Util.missingProperty("createdAtEpoch", "createdAtEpoch", jsonReader);
                }
                if (l4 == null) {
                    throw Util.missingProperty("createdAtRealtime", "createdAtRealtime", jsonReader);
                }
                if (set4 == null) {
                    throw Util.missingProperty("frustrationSignals", "frustrationSignals", jsonReader);
                }
                if (set5 == null) {
                    throw Util.missingProperty("frictionSignals", "frictionSignals", jsonReader);
                }
                if (set3 == null) {
                    throw Util.missingProperty("tags", "tags", jsonReader);
                }
                if (journeyContext == null) {
                    throw Util.missingProperty("context", "context", jsonReader);
                }
                Object newInstance = constructor2.newInstance(uuid2, userJourney$Name2, l3, l4, set4, set5, set3, str, journeyContext, bool2, Integer.valueOf(i), null);
                newInstance.getClass();
                return (UserJourney) newInstance;
            }
            Set set6 = set2;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    userJourney$Name = userJourney$Name2;
                    set2 = set6;
                    uuid = uuid2;
                    l = l3;
                    l2 = l4;
                    set = set4;
                case 0:
                    uuid = (UUID) this.uUIDAdapter.fromJson(jsonReader);
                    if (uuid == null) {
                        throw Util.unexpectedNull("id", "id", jsonReader);
                    }
                    userJourney$Name = userJourney$Name2;
                    set2 = set6;
                    l = l3;
                    l2 = l4;
                    set = set4;
                case 1:
                    userJourney$Name = (UserJourney$Name) this.nameAdapter.fromJson(jsonReader);
                    if (userJourney$Name == null) {
                        throw Util.unexpectedNull("name", "name", jsonReader);
                    }
                    set2 = set6;
                    uuid = uuid2;
                    l = l3;
                    l2 = l4;
                    set = set4;
                case 2:
                    l = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l == null) {
                        throw Util.unexpectedNull("createdAtEpoch", "createdAtEpoch", jsonReader);
                    }
                    userJourney$Name = userJourney$Name2;
                    set2 = set6;
                    uuid = uuid2;
                    l2 = l4;
                    set = set4;
                case 3:
                    l2 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l2 == null) {
                        throw Util.unexpectedNull("createdAtRealtime", "createdAtRealtime", jsonReader);
                    }
                    userJourney$Name = userJourney$Name2;
                    set2 = set6;
                    uuid = uuid2;
                    l = l3;
                    set = set4;
                case 4:
                    set = (Set) this.setOfStringAdapter.fromJson(jsonReader);
                    if (set == null) {
                        throw Util.unexpectedNull("frustrationSignals", "frustrationSignals", jsonReader);
                    }
                    userJourney$Name = userJourney$Name2;
                    set2 = set6;
                    uuid = uuid2;
                    l = l3;
                    l2 = l4;
                case 5:
                    set2 = (Set) this.setOfStringAdapter.fromJson(jsonReader);
                    if (set2 == null) {
                        throw Util.unexpectedNull("frictionSignals", "frictionSignals", jsonReader);
                    }
                    userJourney$Name = userJourney$Name2;
                    uuid = uuid2;
                    l = l3;
                    l2 = l4;
                    set = set4;
                case 6:
                    set3 = (Set) this.setOfStringAdapter.fromJson(jsonReader);
                    if (set3 == null) {
                        throw Util.unexpectedNull("tags", "tags", jsonReader);
                    }
                    userJourney$Name = userJourney$Name2;
                    set2 = set6;
                    uuid = uuid2;
                    l = l3;
                    l2 = l4;
                    set = set4;
                case 7:
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    userJourney$Name = userJourney$Name2;
                    set2 = set6;
                    uuid = uuid2;
                    l = l3;
                    l2 = l4;
                    set = set4;
                case 8:
                    journeyContext = (JourneyContext) this.journeyContextAdapter.fromJson(jsonReader);
                    if (journeyContext == null) {
                        throw Util.unexpectedNull("context", "context", jsonReader);
                    }
                    userJourney$Name = userJourney$Name2;
                    set2 = set6;
                    uuid = uuid2;
                    l = l3;
                    l2 = l4;
                    set = set4;
                case 9:
                    bool2 = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("isSubJourney", "isSubJourney", jsonReader);
                    }
                    userJourney$Name = userJourney$Name2;
                    set2 = set6;
                    uuid = uuid2;
                    l = l3;
                    l2 = l4;
                    set = set4;
                    i2 = -513;
                default:
                    userJourney$Name = userJourney$Name2;
                    set2 = set6;
                    uuid = uuid2;
                    l = l3;
                    l2 = l4;
                    set = set4;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        UserJourney userJourney = (UserJourney) obj;
        jsonWriter.getClass();
        if (userJourney == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.uUIDAdapter.toJson(jsonWriter, userJourney.getId());
        jsonWriter.name("name");
        this.nameAdapter.toJson(jsonWriter, userJourney.getName());
        jsonWriter.name("createdAtEpoch");
        Long valueOf = Long.valueOf(userJourney.getCreatedAtEpoch());
        JsonAdapter jsonAdapter = this.longAdapter;
        jsonAdapter.toJson(jsonWriter, valueOf);
        jsonWriter.name("createdAtRealtime");
        jsonAdapter.toJson(jsonWriter, Long.valueOf(userJourney.getCreatedAtRealtime()));
        jsonWriter.name("frustrationSignals");
        Set<String> frustrationSignals = userJourney.getFrustrationSignals();
        JsonAdapter jsonAdapter2 = this.setOfStringAdapter;
        jsonAdapter2.toJson(jsonWriter, frustrationSignals);
        jsonWriter.name("frictionSignals");
        jsonAdapter2.toJson(jsonWriter, userJourney.getFrictionSignals());
        jsonWriter.name("tags");
        jsonAdapter2.toJson(jsonWriter, userJourney.getTags());
        jsonWriter.name("variant");
        this.nullableStringAdapter.toJson(jsonWriter, userJourney.getVariant());
        jsonWriter.name("context");
        this.journeyContextAdapter.toJson(jsonWriter, userJourney.getContext());
        jsonWriter.name("isSubJourney");
        this.booleanAdapter.toJson(jsonWriter, Boolean.valueOf(userJourney.isSubJourney()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(33, "GeneratedJsonAdapter(UserJourney)");
    }
}
