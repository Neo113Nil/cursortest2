package com.squareup.cash.userjourneys.data;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/userjourneys/data/JourneyContextJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/userjourneys/data/JourneyContext;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class JourneyContextJsonAdapter extends JsonAdapter {
    public final JsonAdapter nullableStringAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public JourneyContextJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("entityId", "sessionToken", "appToken", "platformName", "platformVersion", "deviceModel", "appName", "appVersion", "locale");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "entityId");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "sessionId");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        while (true) {
            String str10 = str;
            String str11 = str2;
            String str12 = str3;
            if (!jsonReader.hasNext()) {
                String str13 = str4;
                String str14 = str5;
                jsonReader.endObject();
                if (str11 == null) {
                    throw Util.missingProperty("sessionId", "sessionToken", jsonReader);
                }
                if (str13 == null) {
                    throw Util.missingProperty("platformName", "platformName", jsonReader);
                }
                if (str14 == null) {
                    throw Util.missingProperty("platformVersion", "platformVersion", jsonReader);
                }
                if (str6 == null) {
                    throw Util.missingProperty("deviceModel", "deviceModel", jsonReader);
                }
                if (str7 == null) {
                    throw Util.missingProperty("appName", "appName", jsonReader);
                }
                if (str8 == null) {
                    throw Util.missingProperty("appVersion", "appVersion", jsonReader);
                }
                if (str9 != null) {
                    return new JourneyContext(str10, str11, str12, str13, str14, str6, str7, str8, str9);
                }
                throw Util.missingProperty("locale", "locale", jsonReader);
            }
            String str15 = str4;
            int selectName = jsonReader.selectName(this.options);
            JsonAdapter jsonAdapter = this.nullableStringAdapter;
            String str16 = str5;
            JsonAdapter jsonAdapter2 = this.stringAdapter;
            switch (selectName) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str4 = str15;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str5 = str16;
                case 0:
                    str = (String) jsonAdapter.fromJson(jsonReader);
                    str4 = str15;
                    str2 = str11;
                    str3 = str12;
                    str5 = str16;
                case 1:
                    str2 = (String) jsonAdapter2.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("sessionId", "sessionToken", jsonReader);
                    }
                    str4 = str15;
                    str = str10;
                    str3 = str12;
                    str5 = str16;
                case 2:
                    str3 = (String) jsonAdapter.fromJson(jsonReader);
                    str4 = str15;
                    str = str10;
                    str2 = str11;
                    str5 = str16;
                case 3:
                    str4 = (String) jsonAdapter2.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("platformName", "platformName", jsonReader);
                    }
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str5 = str16;
                case 4:
                    str5 = (String) jsonAdapter2.fromJson(jsonReader);
                    if (str5 == null) {
                        throw Util.unexpectedNull("platformVersion", "platformVersion", jsonReader);
                    }
                    str4 = str15;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                case 5:
                    str6 = (String) jsonAdapter2.fromJson(jsonReader);
                    if (str6 == null) {
                        throw Util.unexpectedNull("deviceModel", "deviceModel", jsonReader);
                    }
                    str4 = str15;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str5 = str16;
                case 6:
                    str7 = (String) jsonAdapter2.fromJson(jsonReader);
                    if (str7 == null) {
                        throw Util.unexpectedNull("appName", "appName", jsonReader);
                    }
                    str4 = str15;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str5 = str16;
                case 7:
                    str8 = (String) jsonAdapter2.fromJson(jsonReader);
                    if (str8 == null) {
                        throw Util.unexpectedNull("appVersion", "appVersion", jsonReader);
                    }
                    str4 = str15;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str5 = str16;
                case 8:
                    str9 = (String) jsonAdapter2.fromJson(jsonReader);
                    if (str9 == null) {
                        throw Util.unexpectedNull("locale", "locale", jsonReader);
                    }
                    str4 = str15;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str5 = str16;
                default:
                    str4 = str15;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str5 = str16;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        JourneyContext journeyContext = (JourneyContext) obj;
        jsonWriter.getClass();
        if (journeyContext == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("entityId");
        String entityId = journeyContext.getEntityId();
        JsonAdapter jsonAdapter = this.nullableStringAdapter;
        jsonAdapter.toJson(jsonWriter, entityId);
        jsonWriter.name("sessionToken");
        String sessionId = journeyContext.getSessionId();
        JsonAdapter jsonAdapter2 = this.stringAdapter;
        jsonAdapter2.toJson(jsonWriter, sessionId);
        jsonWriter.name("appToken");
        jsonAdapter.toJson(jsonWriter, journeyContext.getAppToken());
        jsonWriter.name("platformName");
        jsonAdapter2.toJson(jsonWriter, journeyContext.getPlatformName());
        jsonWriter.name("platformVersion");
        jsonAdapter2.toJson(jsonWriter, journeyContext.getPlatformVersion());
        jsonWriter.name("deviceModel");
        jsonAdapter2.toJson(jsonWriter, journeyContext.getDeviceModel());
        jsonWriter.name("appName");
        jsonAdapter2.toJson(jsonWriter, journeyContext.getAppName());
        jsonWriter.name("appVersion");
        jsonAdapter2.toJson(jsonWriter, journeyContext.getAppVersion());
        jsonWriter.name("locale");
        jsonAdapter2.toJson(jsonWriter, journeyContext.getLocale());
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(36, "GeneratedJsonAdapter(JourneyContext)");
    }
}
