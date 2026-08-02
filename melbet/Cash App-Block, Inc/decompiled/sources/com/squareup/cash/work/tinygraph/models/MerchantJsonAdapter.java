package com.squareup.cash.work.tinygraph.models;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.work.tinygraph.models.Merchant;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/work/tinygraph/models/MerchantJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/work/tinygraph/models/Merchant;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MerchantJsonAdapter extends JsonAdapter {
    public volatile Constructor constructorRef;
    public final JsonAdapter longAdapter;
    public final JsonAdapter nullableAnyAdapter;
    public final JsonAdapter nullableBooleanAdapter;
    public final JsonAdapter nullableMapOfSubscriptionProductSubscriptionAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public MerchantJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("id", "createdAt", "updatedAt", "proto", "subscriptions", "hasExpiredCrewTrial");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "createdAt");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, "protoJson");
        this.nullableMapOfSubscriptionProductSubscriptionAdapter = moshi.adapter(Types.newParameterizedType(Map.class, Merchant.SubscriptionProduct.class, Merchant.Subscription.class), emptySet, "subscriptions");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "hasExpiredCrewTrial");
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
                    map = (Map) this.nullableMapOfSubscriptionProductSubscriptionAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i = -33;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -33) {
            Long l3 = l;
            String str2 = str;
            if (str2 == null) {
                throw Util.missingProperty("id", "id", jsonReader);
            }
            if (l3 == null) {
                throw Util.missingProperty("createdAt", "createdAt", jsonReader);
            }
            Long l4 = l2;
            Object obj2 = obj;
            long longValue = l3.longValue();
            if (l4 == null) {
                throw Util.missingProperty("updatedAt", "updatedAt", jsonReader);
            }
            return new Merchant(str2, longValue, l4.longValue(), obj2, map, bool);
        }
        Long l5 = l;
        Long l6 = l2;
        String str3 = str;
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls3 = Long.TYPE;
            constructor = Merchant.class.getDeclaredConstructor(String.class, cls3, cls3, Object.class, Map.class, Boolean.class, cls, cls2);
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
        Object newInstance = constructor2.newInstance(str3, l5, l6, obj, map, bool, Integer.valueOf(i), null);
        newInstance.getClass();
        return (Merchant) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        Merchant merchant = (Merchant) obj;
        jsonWriter.getClass();
        if (merchant == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, merchant.id);
        jsonWriter.name("createdAt");
        long j = merchant.createdAt;
        JsonAdapter jsonAdapter = this.longAdapter;
        BalanceFeedKt$$ExternalSyntheticOutline0.m(j, jsonAdapter, jsonWriter, "updatedAt");
        BalanceFeedKt$$ExternalSyntheticOutline0.m(merchant.updatedAt, jsonAdapter, jsonWriter, "proto");
        this.nullableAnyAdapter.toJson(jsonWriter, merchant.protoJson);
        jsonWriter.name("subscriptions");
        this.nullableMapOfSubscriptionProductSubscriptionAdapter.toJson(jsonWriter, merchant.subscriptions);
        jsonWriter.name("hasExpiredCrewTrial");
        this.nullableBooleanAdapter.toJson(jsonWriter, merchant.hasExpiredCrewTrial);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(30, "GeneratedJsonAdapter(Merchant)");
    }
}
