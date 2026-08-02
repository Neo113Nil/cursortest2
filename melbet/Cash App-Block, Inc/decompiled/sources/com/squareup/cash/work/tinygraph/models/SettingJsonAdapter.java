package com.squareup.cash.work.tinygraph.models;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.knotapi.knot.utilities.PreferenceManager;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.work.tinygraph.models.Setting;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/work/tinygraph/models/SettingJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/work/tinygraph/models/Setting;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SettingJsonAdapter extends JsonAdapter {
    public final JsonAdapter categoryAdapter;
    public final JsonAdapter categorySettingAdapter;
    public volatile Constructor constructorRef;
    public final JsonAdapter longAdapter;
    public final JsonAdapter nullableEntityReferenceAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public SettingJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("id", "createdAt", "updatedAt", "category", "merchantId", "providerId", PreferenceManager.PREF_SETTINGS);
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "createdAt");
        this.categoryAdapter = moshi.adapter(Setting.Category.class, emptySet, "category");
        this.nullableEntityReferenceAdapter = moshi.adapter(EntityReference.class, emptySet, "merchantId");
        this.categorySettingAdapter = moshi.adapter(Setting.CategorySetting.class, emptySet, "categorySetting");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        int i = -1;
        Long l = 0L;
        Long l2 = null;
        String str = null;
        Setting.Category category = null;
        EntityReference entityReference = null;
        EntityReference entityReference2 = null;
        Setting.CategorySetting categorySetting = null;
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
                    i &= -3;
                    break;
                case 2:
                    l2 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l2 == null) {
                        throw Util.unexpectedNull("updatedAt", "updatedAt", jsonReader);
                    }
                    i &= -5;
                    break;
                case 3:
                    category = (Setting.Category) this.categoryAdapter.fromJson(jsonReader);
                    if (category == null) {
                        throw Util.unexpectedNull("category", "category", jsonReader);
                    }
                    break;
                case 4:
                    entityReference = (EntityReference) this.nullableEntityReferenceAdapter.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    entityReference2 = (EntityReference) this.nullableEntityReferenceAdapter.fromJson(jsonReader);
                    i &= -33;
                    break;
                case 6:
                    categorySetting = (Setting.CategorySetting) this.categorySettingAdapter.fromJson(jsonReader);
                    if (categorySetting == null) {
                        throw Util.unexpectedNull("categorySetting", PreferenceManager.PREF_SETTINGS, jsonReader);
                    }
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -55) {
            if (str == null) {
                throw Util.missingProperty("id", "id", jsonReader);
            }
            long longValue = l.longValue();
            long longValue2 = l2.longValue();
            if (category == null) {
                throw Util.missingProperty("category", "category", jsonReader);
            }
            if (categorySetting != null) {
                return new Setting(str, longValue, longValue2, category, entityReference, entityReference2, categorySetting);
            }
            throw Util.missingProperty("categorySetting", PreferenceManager.PREF_SETTINGS, jsonReader);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls3 = Long.TYPE;
            constructor = Setting.class.getDeclaredConstructor(String.class, cls3, cls3, Setting.Category.class, EntityReference.class, EntityReference.class, Setting.CategorySetting.class, cls, cls2);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        Constructor constructor2 = constructor;
        if (str == null) {
            throw Util.missingProperty("id", "id", jsonReader);
        }
        if (category == null) {
            throw Util.missingProperty("category", "category", jsonReader);
        }
        if (categorySetting == null) {
            throw Util.missingProperty("categorySetting", PreferenceManager.PREF_SETTINGS, jsonReader);
        }
        Object newInstance = constructor2.newInstance(str, l, l2, category, entityReference, entityReference2, categorySetting, Integer.valueOf(i), null);
        newInstance.getClass();
        return (Setting) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        Setting setting = (Setting) obj;
        jsonWriter.getClass();
        if (setting == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, setting.id);
        jsonWriter.name("createdAt");
        long j = setting.createdAt;
        JsonAdapter jsonAdapter = this.longAdapter;
        BalanceFeedKt$$ExternalSyntheticOutline0.m(j, jsonAdapter, jsonWriter, "updatedAt");
        BalanceFeedKt$$ExternalSyntheticOutline0.m(setting.updatedAt, jsonAdapter, jsonWriter, "category");
        this.categoryAdapter.toJson(jsonWriter, setting.category);
        jsonWriter.name("merchantId");
        EntityReference entityReference = setting.merchantId;
        JsonAdapter jsonAdapter2 = this.nullableEntityReferenceAdapter;
        jsonAdapter2.toJson(jsonWriter, entityReference);
        jsonWriter.name("providerId");
        jsonAdapter2.toJson(jsonWriter, setting.providerId);
        jsonWriter.name(PreferenceManager.PREF_SETTINGS);
        this.categorySettingAdapter.toJson(jsonWriter, setting.categorySetting);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(29, "GeneratedJsonAdapter(Setting)");
    }
}
