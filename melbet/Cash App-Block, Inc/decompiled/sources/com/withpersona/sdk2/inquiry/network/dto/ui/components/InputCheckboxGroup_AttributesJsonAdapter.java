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
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckboxGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup_AttributesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup$Attributes;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableListOfStringAdapter", "", "", "nullableStringAdapter", "listOfOptionWithDescriptionAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/OptionWithDescription;", "nullableJsonLogicBooleanAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InputCheckboxGroup_AttributesJsonAdapter extends JsonAdapter {
    private final JsonAdapter listOfOptionWithDescriptionAdapter;
    private final JsonAdapter nullableJsonLogicBooleanAdapter;
    private final JsonAdapter nullableListOfStringAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options;

    public InputCheckboxGroup_AttributesJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("prefill", AnnotatedPrivateKey.LABEL, "options", "hidden", "disabled");
        Util.ParameterizedTypeImpl newParameterizedType = Types.newParameterizedType(List.class, String.class);
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableListOfStringAdapter = moshi.adapter(newParameterizedType, emptySet, "prefill");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, AnnotatedPrivateKey.LABEL);
        this.listOfOptionWithDescriptionAdapter = moshi.adapter(Types.newParameterizedType(List.class, OptionWithDescription.class), emptySet, "options");
        this.nullableJsonLogicBooleanAdapter = moshi.adapter(JsonLogicBoolean.class, emptySet, "hidden");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public InputCheckboxGroup.Attributes fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        List list = null;
        String str = null;
        List list2 = null;
        JsonLogicBoolean jsonLogicBoolean = null;
        JsonLogicBoolean jsonLogicBoolean2 = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                list = (List) this.nullableListOfStringAdapter.fromJson(reader);
            } else if (selectName == 1) {
                str = (String) this.nullableStringAdapter.fromJson(reader);
            } else if (selectName == 2) {
                list2 = (List) this.listOfOptionWithDescriptionAdapter.fromJson(reader);
                if (list2 == null) {
                    throw Util.unexpectedNull("options_", "options", reader);
                }
            } else if (selectName == 3) {
                jsonLogicBoolean = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(reader);
            } else if (selectName == 4) {
                jsonLogicBoolean2 = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (list2 != null) {
            return new InputCheckboxGroup.Attributes(list, str, list2, jsonLogicBoolean, jsonLogicBoolean2);
        }
        throw Util.missingProperty("options_", "options", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, InputCheckboxGroup.Attributes value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("prefill");
        this.nullableListOfStringAdapter.toJson(writer, value_.getPrefill());
        writer.name(AnnotatedPrivateKey.LABEL);
        this.nullableStringAdapter.toJson(writer, value_.getLabel());
        writer.name("options");
        this.listOfOptionWithDescriptionAdapter.toJson(writer, value_.getOptions());
        writer.name("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getHidden());
        writer.name("disabled");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getDisabled());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(51, "GeneratedJsonAdapter(InputCheckboxGroup.Attributes)");
    }
}
