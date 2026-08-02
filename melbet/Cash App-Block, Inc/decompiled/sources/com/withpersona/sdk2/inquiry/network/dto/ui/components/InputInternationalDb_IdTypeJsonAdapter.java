package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputInternationalDb;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\r\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb_IdTypeJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb$IdType;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableStringAdapter", "", "nullableBooleanAdapter", "", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InputInternationalDb_IdTypeJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableBooleanAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options;

    public InputInternationalDb_IdTypeJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("mask", "placeholder", "secure", "countryName", "countryCode", "idType", "name", "description");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "mask");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "secure");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public InputInternationalDb.IdType fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        String str = null;
        String str2 = null;
        Boolean bool = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
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
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 3:
                    str3 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    str4 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    str5 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    str6 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 7:
                    str7 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new InputInternationalDb.IdType(str, str2, bool, str3, str4, str5, str6, str7);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, InputInternationalDb.IdType value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("mask");
        this.nullableStringAdapter.toJson(writer, value_.getMask());
        writer.name("placeholder");
        this.nullableStringAdapter.toJson(writer, value_.getPlaceholder());
        writer.name("secure");
        this.nullableBooleanAdapter.toJson(writer, value_.getSecure());
        writer.name("countryName");
        this.nullableStringAdapter.toJson(writer, value_.getCountryName());
        writer.name("countryCode");
        this.nullableStringAdapter.toJson(writer, value_.getCountryCode());
        writer.name("idType");
        this.nullableStringAdapter.toJson(writer, value_.getIdType());
        writer.name("name");
        this.nullableStringAdapter.toJson(writer, value_.getName());
        writer.name("description");
        this.nullableStringAdapter.toJson(writer, value_.getDescription());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(49, "GeneratedJsonAdapter(InputInternationalDb.IdType)");
    }
}
