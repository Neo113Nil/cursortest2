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
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputRadioGroup;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0012\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup_AttributesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$Attributes;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableStringAdapter", "", "listOfOptionWithDescriptionAdapter", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/OptionWithDescription;", "nullableJsonLogicBooleanAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InputRadioGroup_AttributesJsonAdapter extends JsonAdapter {
    private volatile Constructor<InputRadioGroup.Attributes> constructorRef;
    private final JsonAdapter listOfOptionWithDescriptionAdapter;
    private final JsonAdapter nullableJsonLogicBooleanAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options;

    public InputRadioGroup_AttributesJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("prefill", AnnotatedPrivateKey.LABEL, "options", "hidden", "disabled");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "prefill");
        this.listOfOptionWithDescriptionAdapter = moshi.adapter(Types.newParameterizedType(List.class, OptionWithDescription.class), emptySet, "options");
        this.nullableJsonLogicBooleanAdapter = moshi.adapter(JsonLogicBoolean.class, emptySet, "hidden");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public InputRadioGroup.Attributes fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        String str = null;
        String str2 = null;
        List list = null;
        JsonLogicBoolean jsonLogicBoolean = null;
        JsonLogicBoolean jsonLogicBoolean2 = null;
        int i = -1;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.nullableStringAdapter.fromJson(reader);
            } else if (selectName == 1) {
                str2 = (String) this.nullableStringAdapter.fromJson(reader);
            } else if (selectName == 2) {
                list = (List) this.listOfOptionWithDescriptionAdapter.fromJson(reader);
                if (list == null) {
                    throw Util.unexpectedNull("options_", "options", reader);
                }
            } else if (selectName == 3) {
                jsonLogicBoolean = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                i &= -9;
            } else if (selectName == 4) {
                jsonLogicBoolean2 = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                i &= -17;
            }
        }
        reader.endObject();
        if (i == -25) {
            JsonLogicBoolean jsonLogicBoolean3 = jsonLogicBoolean2;
            JsonLogicBoolean jsonLogicBoolean4 = jsonLogicBoolean;
            List list2 = list;
            String str3 = str2;
            String str4 = str;
            if (list2 != null) {
                return new InputRadioGroup.Attributes(str4, str3, list2, jsonLogicBoolean4, jsonLogicBoolean3);
            }
            throw Util.missingProperty("options_", "options", reader);
        }
        JsonLogicBoolean jsonLogicBoolean5 = jsonLogicBoolean2;
        JsonLogicBoolean jsonLogicBoolean6 = jsonLogicBoolean;
        List list3 = list;
        String str5 = str2;
        String str6 = str;
        Constructor<InputRadioGroup.Attributes> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = InputRadioGroup.Attributes.class.getDeclaredConstructor(String.class, String.class, List.class, JsonLogicBoolean.class, JsonLogicBoolean.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        if (list3 == null) {
            throw Util.missingProperty("options_", "options", reader);
        }
        InputRadioGroup.Attributes newInstance = constructor.newInstance(str6, str5, list3, jsonLogicBoolean6, jsonLogicBoolean5, Integer.valueOf(i), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, InputRadioGroup.Attributes value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("prefill");
        this.nullableStringAdapter.toJson(writer, value_.getPrefill());
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
        return SVG$Unit$EnumUnboxingLocalUtility.m(48, "GeneratedJsonAdapter(InputRadioGroup.Attributes)");
    }
}
