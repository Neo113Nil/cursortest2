package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\r\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress_AttributesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress$Attributes;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableStringAdapter", "", "nullableJsonLogicBooleanAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InputAddress_AttributesJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableJsonLogicBooleanAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options;

    public InputAddress_AttributesJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of(AnnotatedPrivateKey.LABEL, "editAddressManuallyPrompt", "placeholderAutocomplete", "fieldKeyAddressStreet1", "prefillAddressStreet1", "placeholderAddressStreet1", "fieldKeyAddressStreet2", "prefillAddressStreet2", "placeholderAddressStreet2", "fieldKeyAddressCity", "prefillAddressCity", "placeholderAddressCity", "fieldKeyAddressSubdivision", "prefillAddressSubdivision", "placeholderAddressSubdivision", "placeholderAddressSubdivisionUs", "fieldKeyAddressPostalCode", "prefillAddressPostalCode", "placeholderAddressPostalCode", "placeholderAddressPostalCodeUs", "selectedCountryCode", "hidden", "disabled", "addressAutocompleteMethod");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, AnnotatedPrivateKey.LABEL);
        this.nullableJsonLogicBooleanAdapter = moshi.adapter(JsonLogicBoolean.class, emptySet, "hidden");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public InputAddress.Attributes fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        String str19 = null;
        String str20 = null;
        String str21 = null;
        JsonLogicBoolean jsonLogicBoolean = null;
        JsonLogicBoolean jsonLogicBoolean2 = null;
        String str22 = null;
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
                    str7 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 7:
                    str8 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 8:
                    str9 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 9:
                    str10 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 10:
                    str11 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 11:
                    str12 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 12:
                    str13 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 13:
                    str14 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 14:
                    str15 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 15:
                    str16 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 16:
                    str17 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 17:
                    str18 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 18:
                    str19 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 19:
                    str20 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 20:
                    str21 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 21:
                    jsonLogicBoolean = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                    break;
                case 22:
                    jsonLogicBoolean2 = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                    break;
                case 23:
                    str22 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new InputAddress.Attributes(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, jsonLogicBoolean, jsonLogicBoolean2, str22);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, InputAddress.Attributes value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name(AnnotatedPrivateKey.LABEL);
        this.nullableStringAdapter.toJson(writer, value_.getLabel());
        writer.name("editAddressManuallyPrompt");
        this.nullableStringAdapter.toJson(writer, value_.getEditAddressManuallyPrompt());
        writer.name("placeholderAutocomplete");
        this.nullableStringAdapter.toJson(writer, value_.getPlaceholderAutocomplete());
        writer.name("fieldKeyAddressStreet1");
        this.nullableStringAdapter.toJson(writer, value_.getFieldKeyAddressStreet1());
        writer.name("prefillAddressStreet1");
        this.nullableStringAdapter.toJson(writer, value_.getPrefillAddressStreet1());
        writer.name("placeholderAddressStreet1");
        this.nullableStringAdapter.toJson(writer, value_.getPlaceholderAddressStreet1());
        writer.name("fieldKeyAddressStreet2");
        this.nullableStringAdapter.toJson(writer, value_.getFieldKeyAddressStreet2());
        writer.name("prefillAddressStreet2");
        this.nullableStringAdapter.toJson(writer, value_.getPrefillAddressStreet2());
        writer.name("placeholderAddressStreet2");
        this.nullableStringAdapter.toJson(writer, value_.getPlaceholderAddressStreet2());
        writer.name("fieldKeyAddressCity");
        this.nullableStringAdapter.toJson(writer, value_.getFieldKeyAddressCity());
        writer.name("prefillAddressCity");
        this.nullableStringAdapter.toJson(writer, value_.getPrefillAddressCity());
        writer.name("placeholderAddressCity");
        this.nullableStringAdapter.toJson(writer, value_.getPlaceholderAddressCity());
        writer.name("fieldKeyAddressSubdivision");
        this.nullableStringAdapter.toJson(writer, value_.getFieldKeyAddressSubdivision());
        writer.name("prefillAddressSubdivision");
        this.nullableStringAdapter.toJson(writer, value_.getPrefillAddressSubdivision());
        writer.name("placeholderAddressSubdivision");
        this.nullableStringAdapter.toJson(writer, value_.getPlaceholderAddressSubdivision());
        writer.name("placeholderAddressSubdivisionUs");
        this.nullableStringAdapter.toJson(writer, value_.getPlaceholderAddressSubdivisionUs());
        writer.name("fieldKeyAddressPostalCode");
        this.nullableStringAdapter.toJson(writer, value_.getFieldKeyAddressPostalCode());
        writer.name("prefillAddressPostalCode");
        this.nullableStringAdapter.toJson(writer, value_.getPrefillAddressPostalCode());
        writer.name("placeholderAddressPostalCode");
        this.nullableStringAdapter.toJson(writer, value_.getPlaceholderAddressPostalCode());
        writer.name("placeholderAddressPostalCodeUs");
        this.nullableStringAdapter.toJson(writer, value_.getPlaceholderAddressPostalCodeUs());
        writer.name("selectedCountryCode");
        this.nullableStringAdapter.toJson(writer, value_.getSelectedCountryCode());
        writer.name("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getHidden());
        writer.name("disabled");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getDisabled());
        writer.name("addressAutocompleteMethod");
        this.nullableStringAdapter.toJson(writer, value_.getAddressAutocompleteMethod());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(45, "GeneratedJsonAdapter(InputAddress.Attributes)");
    }
}
