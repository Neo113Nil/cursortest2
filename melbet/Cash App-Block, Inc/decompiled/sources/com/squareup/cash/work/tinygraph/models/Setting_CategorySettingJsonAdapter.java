package com.squareup.cash.work.tinygraph.models;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.work.tinygraph.models.Setting;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/work/tinygraph/models/Setting_CategorySettingJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/work/tinygraph/models/Setting$CategorySetting;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Setting_CategorySettingJsonAdapter extends JsonAdapter {
    public volatile Constructor constructorRef;
    public final JsonAdapter nullableBooleanAdapter;
    public final JsonAdapter nullableDoubleAdapter;
    public final JsonAdapter nullableIntAdapter;
    public final JsonAdapter nullableStringAdapter;
    public final JsonAdapter nullableWorkweekConfigurationAdapter;
    public final JsonReader.Options options;

    public Setting_CategorySettingJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("automaticClockoutBuffer", "canDeclareCashTips", "earlyBreakCompletionBuffer", "earlyClockinBuffer", "minScheduledShiftBuffer", "geofenceRadiusInMeters", "canClockinClockoutFromEmployeeApp", "canRequestTimeOff", "canRequestTimecardEdit", "workweekConfiguration", "fileSharingEnabled", "gifSharingEnabled", "messageRetentionSettings", "messageTranslationSettingsEnabled", "profanityFilterSettingsEnabled", "userSuspensionSettingsEnabled", "welcomeMessageEnabled");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "automaticClockoutBuffer");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "canDeclareCashTips");
        this.nullableDoubleAdapter = moshi.adapter(Double.class, emptySet, "geofenceRadiusInMeters");
        this.nullableWorkweekConfigurationAdapter = moshi.adapter(Setting.WorkweekConfiguration.class, emptySet, "workweekConfiguration");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "messageRetentionSettings");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        int i;
        jsonReader.getClass();
        jsonReader.beginObject();
        int i2 = -1;
        String str = null;
        Boolean bool = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Double d = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Setting.WorkweekConfiguration workweekConfiguration = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        Integer num = null;
        Boolean bool7 = null;
        Boolean bool8 = null;
        Boolean bool9 = null;
        Boolean bool10 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    continue;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -2;
                    continue;
                case 1:
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i2 &= -3;
                    continue;
                case 2:
                    str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -5;
                    continue;
                case 3:
                    str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -9;
                    continue;
                case 4:
                    str4 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -17;
                    continue;
                case 5:
                    d = (Double) this.nullableDoubleAdapter.fromJson(jsonReader);
                    i2 &= -33;
                    continue;
                case 6:
                    bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i2 &= -65;
                    continue;
                case 7:
                    bool3 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i2 &= -129;
                    continue;
                case 8:
                    bool4 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i2 &= -257;
                    continue;
                case 9:
                    workweekConfiguration = (Setting.WorkweekConfiguration) this.nullableWorkweekConfigurationAdapter.fromJson(jsonReader);
                    i2 &= -513;
                    continue;
                case 10:
                    bool5 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i2 &= -1025;
                    continue;
                case 11:
                    bool6 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i2 &= -2049;
                    continue;
                case 12:
                    num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    i2 &= -4097;
                    continue;
                case 13:
                    bool7 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i2 &= -8193;
                    continue;
                case 14:
                    bool8 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i2 &= -16385;
                    continue;
                case 15:
                    bool9 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i = -32769;
                    break;
                case 16:
                    bool10 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i = -65537;
                    break;
            }
            i2 &= i;
        }
        jsonReader.endObject();
        if (i2 == -131072) {
            Boolean bool11 = bool4;
            Boolean bool12 = bool3;
            Boolean bool13 = bool2;
            Double d2 = d;
            String str5 = str4;
            String str6 = str3;
            return new Setting.CategorySetting(str, bool, str2, str6, str5, d2, bool13, bool12, bool11, workweekConfiguration, bool5, bool6, num, bool7, bool8, bool9, bool10);
        }
        Boolean bool14 = bool4;
        Boolean bool15 = bool3;
        Boolean bool16 = bool2;
        Double d3 = d;
        String str7 = str4;
        String str8 = str3;
        String str9 = str2;
        Boolean bool17 = bool;
        String str10 = str;
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Setting.CategorySetting.class.getDeclaredConstructor(String.class, Boolean.class, String.class, String.class, String.class, Double.class, Boolean.class, Boolean.class, Boolean.class, Setting.WorkweekConfiguration.class, Boolean.class, Boolean.class, Integer.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        Object newInstance = constructor.newInstance(str10, bool17, str9, str8, str7, d3, bool16, bool15, bool14, workweekConfiguration, bool5, bool6, num, bool7, bool8, bool9, bool10, Integer.valueOf(i2), null);
        newInstance.getClass();
        return (Setting.CategorySetting) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        Setting.CategorySetting categorySetting = (Setting.CategorySetting) obj;
        jsonWriter.getClass();
        if (categorySetting == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("automaticClockoutBuffer");
        String str = categorySetting.automaticClockoutBuffer;
        JsonAdapter jsonAdapter = this.nullableStringAdapter;
        jsonAdapter.toJson(jsonWriter, str);
        jsonWriter.name("canDeclareCashTips");
        Boolean bool = categorySetting.canDeclareCashTips;
        JsonAdapter jsonAdapter2 = this.nullableBooleanAdapter;
        jsonAdapter2.toJson(jsonWriter, bool);
        jsonWriter.name("earlyBreakCompletionBuffer");
        jsonAdapter.toJson(jsonWriter, categorySetting.earlyBreakCompletionBuffer);
        jsonWriter.name("earlyClockinBuffer");
        jsonAdapter.toJson(jsonWriter, categorySetting.earlyClockinBuffer);
        jsonWriter.name("minScheduledShiftBuffer");
        jsonAdapter.toJson(jsonWriter, categorySetting.minScheduledShiftBuffer);
        jsonWriter.name("geofenceRadiusInMeters");
        this.nullableDoubleAdapter.toJson(jsonWriter, categorySetting.geofenceRadiusInMeters);
        jsonWriter.name("canClockinClockoutFromEmployeeApp");
        jsonAdapter2.toJson(jsonWriter, categorySetting.canClockinClockoutFromEmployeeApp);
        jsonWriter.name("canRequestTimeOff");
        jsonAdapter2.toJson(jsonWriter, categorySetting.canRequestTimeOff);
        jsonWriter.name("canRequestTimecardEdit");
        jsonAdapter2.toJson(jsonWriter, categorySetting.canRequestTimecardEdit);
        jsonWriter.name("workweekConfiguration");
        this.nullableWorkweekConfigurationAdapter.toJson(jsonWriter, categorySetting.workweekConfiguration);
        jsonWriter.name("fileSharingEnabled");
        jsonAdapter2.toJson(jsonWriter, categorySetting.fileSharingEnabled);
        jsonWriter.name("gifSharingEnabled");
        jsonAdapter2.toJson(jsonWriter, categorySetting.gifSharingEnabled);
        jsonWriter.name("messageRetentionSettings");
        this.nullableIntAdapter.toJson(jsonWriter, categorySetting.messageRetentionSettings);
        jsonWriter.name("messageTranslationSettingsEnabled");
        jsonAdapter2.toJson(jsonWriter, categorySetting.messageTranslationSettingsEnabled);
        jsonWriter.name("profanityFilterSettingsEnabled");
        jsonAdapter2.toJson(jsonWriter, categorySetting.profanityFilterSettingsEnabled);
        jsonWriter.name("userSuspensionSettingsEnabled");
        jsonAdapter2.toJson(jsonWriter, categorySetting.userSuspensionSettingsEnabled);
        jsonWriter.name("welcomeMessageEnabled");
        jsonAdapter2.toJson(jsonWriter, categorySetting.welcomeMessageEnabled);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(45, "GeneratedJsonAdapter(Setting.CategorySetting)");
    }
}
