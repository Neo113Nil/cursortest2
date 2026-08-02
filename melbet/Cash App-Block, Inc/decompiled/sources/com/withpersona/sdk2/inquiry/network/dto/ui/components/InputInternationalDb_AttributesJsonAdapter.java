package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputInternationalDb;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0012\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb_AttributesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb$Attributes;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableStringAdapter", "", "nullableBooleanAdapter", "", "listOfIdTypeAdapter", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb$IdType;", "nullableJsonLogicBooleanAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InputInternationalDb_AttributesJsonAdapter extends JsonAdapter {
    private final JsonAdapter listOfIdTypeAdapter;
    private final JsonAdapter nullableBooleanAdapter;
    private final JsonAdapter nullableJsonLogicBooleanAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options;

    public InputInternationalDb_AttributesJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("prefillIdbCountry", "prefillIdbType", "prefillIdbValue", "errorIdbCountry", "errorIdbType", "errorIdbValue", "hideCountryIfPrefilled", "hideTypeIfPrefilled", "hideCountryIfSingleChoice", "hideTypeIfSingleChoice", "allowedIdTypes", AnnotatedPrivateKey.LABEL, "labelIdbCountry", "labelIdbType", "labelIdbValue", "placeholderIdbCountry", "placeholderIdbType", "placeholderIdbValue", "hidden", "disabled");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "prefillIdbCountry");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "hideCountryIfPrefilled");
        this.listOfIdTypeAdapter = moshi.adapter(Types.newParameterizedType(List.class, InputInternationalDb.IdType.class), emptySet, "allowedIdTypes");
        this.nullableJsonLogicBooleanAdapter = moshi.adapter(JsonLogicBoolean.class, emptySet, "hidden");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public InputInternationalDb.Attributes fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        List list = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        JsonLogicBoolean jsonLogicBoolean = null;
        JsonLogicBoolean jsonLogicBoolean2 = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    str2 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    str3 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    str4 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    str5 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    str6 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 7:
                    bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 8:
                    bool3 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 9:
                    bool4 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 10:
                    list = (List) this.listOfIdTypeAdapter.fromJson(reader);
                    if (list == null) {
                        throw Util.unexpectedNull("allowedIdTypes", "allowedIdTypes", reader);
                    }
                    break;
                case 11:
                    str7 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 12:
                    str8 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 13:
                    str9 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 14:
                    str10 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 15:
                    str11 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 16:
                    str12 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 17:
                    str13 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 18:
                    jsonLogicBoolean = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                    break;
                case 19:
                    jsonLogicBoolean2 = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (list != null) {
            return new InputInternationalDb.Attributes(str, str2, str3, str4, str5, str6, bool, bool2, bool3, bool4, list, str7, str8, str9, str10, str11, str12, str13, jsonLogicBoolean, jsonLogicBoolean2);
        }
        throw Util.missingProperty("allowedIdTypes", "allowedIdTypes", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, InputInternationalDb.Attributes value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("prefillIdbCountry");
        this.nullableStringAdapter.toJson(writer, value_.getPrefillIdbCountry());
        writer.name("prefillIdbType");
        this.nullableStringAdapter.toJson(writer, value_.getPrefillIdbType());
        writer.name("prefillIdbValue");
        this.nullableStringAdapter.toJson(writer, value_.getPrefillIdbValue());
        writer.name("errorIdbCountry");
        this.nullableStringAdapter.toJson(writer, value_.getErrorIdbCountry());
        writer.name("errorIdbType");
        this.nullableStringAdapter.toJson(writer, value_.getErrorIdbType());
        writer.name("errorIdbValue");
        this.nullableStringAdapter.toJson(writer, value_.getErrorIdbValue());
        writer.name("hideCountryIfPrefilled");
        this.nullableBooleanAdapter.toJson(writer, value_.getHideCountryIfPrefilled());
        writer.name("hideTypeIfPrefilled");
        this.nullableBooleanAdapter.toJson(writer, value_.getHideTypeIfPrefilled());
        writer.name("hideCountryIfSingleChoice");
        this.nullableBooleanAdapter.toJson(writer, value_.getHideCountryIfSingleChoice());
        writer.name("hideTypeIfSingleChoice");
        this.nullableBooleanAdapter.toJson(writer, value_.getHideTypeIfSingleChoice());
        writer.name("allowedIdTypes");
        this.listOfIdTypeAdapter.toJson(writer, value_.getAllowedIdTypes());
        writer.name(AnnotatedPrivateKey.LABEL);
        this.nullableStringAdapter.toJson(writer, value_.getLabel());
        writer.name("labelIdbCountry");
        this.nullableStringAdapter.toJson(writer, value_.getLabelIdbCountry());
        writer.name("labelIdbType");
        this.nullableStringAdapter.toJson(writer, value_.getLabelIdbType());
        writer.name("labelIdbValue");
        this.nullableStringAdapter.toJson(writer, value_.getLabelIdbValue());
        writer.name("placeholderIdbCountry");
        this.nullableStringAdapter.toJson(writer, value_.getPlaceholderIdbCountry());
        writer.name("placeholderIdbType");
        this.nullableStringAdapter.toJson(writer, value_.getPlaceholderIdbType());
        writer.name("placeholderIdbValue");
        this.nullableStringAdapter.toJson(writer, value_.getPlaceholderIdbValue());
        writer.name("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getHidden());
        writer.name("disabled");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getDisabled());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(53, "GeneratedJsonAdapter(InputInternationalDb.Attributes)");
    }
}
