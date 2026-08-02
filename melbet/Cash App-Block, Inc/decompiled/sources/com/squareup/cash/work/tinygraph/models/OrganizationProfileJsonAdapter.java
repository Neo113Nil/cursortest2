package com.squareup.cash.work.tinygraph.models;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/work/tinygraph/models/OrganizationProfileJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/work/tinygraph/models/OrganizationProfile;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OrganizationProfileJsonAdapter extends JsonAdapter {
    public volatile Constructor constructorRef;
    public final JsonAdapter nullableStringAdapter;
    public final JsonReader.Options options;

    public OrganizationProfileJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("displayName", "avatar");
        this.nullableStringAdapter = moshi.adapter(String.class, EmptySet.INSTANCE, "displayName");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (selectName == 1) {
                str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                i &= -3;
            }
        }
        jsonReader.endObject();
        if (i == -4) {
            return new OrganizationProfile(str, str2);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            constructor = OrganizationProfile.class.getDeclaredConstructor(String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        Object newInstance = constructor.newInstance(str, str2, Integer.valueOf(i), null);
        newInstance.getClass();
        return (OrganizationProfile) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        OrganizationProfile organizationProfile = (OrganizationProfile) obj;
        jsonWriter.getClass();
        if (organizationProfile == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("displayName");
        String str = organizationProfile.displayName;
        JsonAdapter jsonAdapter = this.nullableStringAdapter;
        jsonAdapter.toJson(jsonWriter, str);
        jsonWriter.name("avatar");
        jsonAdapter.toJson(jsonWriter, organizationProfile.avatar);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(41, "GeneratedJsonAdapter(OrganizationProfile)");
    }
}
