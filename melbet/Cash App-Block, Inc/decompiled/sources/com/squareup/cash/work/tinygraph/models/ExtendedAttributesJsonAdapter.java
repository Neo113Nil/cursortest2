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

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/work/tinygraph/models/ExtendedAttributesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/work/tinygraph/models/ExtendedAttributes;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExtendedAttributesJsonAdapter extends JsonAdapter {
    public volatile Constructor constructorRef;
    public final JsonAdapter nullableBooleanAdapter;
    public final JsonAdapter nullableLongAdapter;
    public final JsonAdapter nullableStringAdapter;
    public final JsonReader.Options options;

    public ExtendedAttributesJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("shiftCalendarTipLastShown", "shiftManagerTipLastShown", "addWageTipShown", "automaticallyDownload", "showDatesInLocalTimeZone", "hasDismissedFilesIntro", "hasSeenConnectionsTabEducation", "hasSeenConnectionsEducation", "hasDismissedAvailabilityUpsell", "purchases");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableLongAdapter = moshi.adapter(Long.class, emptySet, "shiftCalendarTipLastShown");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "addWageTipShown");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "automaticallyDownload");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        int i = -1;
        Long l = null;
        Long l2 = null;
        Boolean bool = null;
        String str = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    l = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    i &= -2;
                    break;
                case 1:
                    l2 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    i &= -3;
                    break;
                case 2:
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i &= -5;
                    break;
                case 3:
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    bool3 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i &= -33;
                    break;
                case 6:
                    bool4 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i &= -65;
                    break;
                case 7:
                    bool5 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i &= -129;
                    break;
                case 8:
                    bool6 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i &= -257;
                    break;
                case 9:
                    str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -513;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -1024) {
            Boolean bool7 = bool6;
            Boolean bool8 = bool5;
            Boolean bool9 = bool4;
            Boolean bool10 = bool3;
            Boolean bool11 = bool2;
            String str3 = str;
            return new ExtendedAttributes(l, l2, bool, str3, bool11, bool10, bool9, bool8, bool7, str2);
        }
        Boolean bool12 = bool6;
        Boolean bool13 = bool5;
        Boolean bool14 = bool4;
        Boolean bool15 = bool3;
        Boolean bool16 = bool2;
        String str4 = str;
        Boolean bool17 = bool;
        Long l3 = l2;
        Long l4 = l;
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ExtendedAttributes.class.getDeclaredConstructor(Long.class, Long.class, Boolean.class, String.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        Object newInstance = constructor.newInstance(l4, l3, bool17, str4, bool16, bool15, bool14, bool13, bool12, str2, Integer.valueOf(i), null);
        newInstance.getClass();
        return (ExtendedAttributes) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        ExtendedAttributes extendedAttributes = (ExtendedAttributes) obj;
        jsonWriter.getClass();
        if (extendedAttributes == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("shiftCalendarTipLastShown");
        Long l = extendedAttributes.shiftCalendarTipLastShown;
        JsonAdapter jsonAdapter = this.nullableLongAdapter;
        jsonAdapter.toJson(jsonWriter, l);
        jsonWriter.name("shiftManagerTipLastShown");
        jsonAdapter.toJson(jsonWriter, extendedAttributes.shiftManagerTipLastShown);
        jsonWriter.name("addWageTipShown");
        Boolean bool = extendedAttributes.addWageTipShown;
        JsonAdapter jsonAdapter2 = this.nullableBooleanAdapter;
        jsonAdapter2.toJson(jsonWriter, bool);
        jsonWriter.name("automaticallyDownload");
        String str = extendedAttributes.automaticallyDownload;
        JsonAdapter jsonAdapter3 = this.nullableStringAdapter;
        jsonAdapter3.toJson(jsonWriter, str);
        jsonWriter.name("showDatesInLocalTimeZone");
        jsonAdapter2.toJson(jsonWriter, extendedAttributes.showDatesInLocalTimeZone);
        jsonWriter.name("hasDismissedFilesIntro");
        jsonAdapter2.toJson(jsonWriter, extendedAttributes.hasDismissedFilesIntro);
        jsonWriter.name("hasSeenConnectionsTabEducation");
        jsonAdapter2.toJson(jsonWriter, extendedAttributes.hasSeenConnectionsTabEducation);
        jsonWriter.name("hasSeenConnectionsEducation");
        jsonAdapter2.toJson(jsonWriter, extendedAttributes.hasSeenConnectionsEducation);
        jsonWriter.name("hasDismissedAvailabilityUpsell");
        jsonAdapter2.toJson(jsonWriter, extendedAttributes.hasDismissedAvailabilityUpsell);
        jsonWriter.name("purchases");
        jsonAdapter3.toJson(jsonWriter, extendedAttributes.purchases);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(40, "GeneratedJsonAdapter(ExtendedAttributes)");
    }
}
