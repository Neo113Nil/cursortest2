package com.withpersona.sdk2.inquiry.network.dto.ui;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Button;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0014\u001a\u00020\nH\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "nullableButtonTypeAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button$ButtonType;", "nullableStringAdapter", "nullableIntAdapter", "", "nullableJsonLogicBooleanAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class BasicButtonAttributesJsonAdapter extends JsonAdapter {
    private volatile Constructor<BasicButtonAttributes> constructorRef;
    private final JsonAdapter nullableButtonTypeAdapter;
    private final JsonAdapter nullableIntAdapter;
    private final JsonAdapter nullableJsonLogicBooleanAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter stringAdapter;

    public BasicButtonAttributesJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("text", "buttonType", "autoSubmitCountdownText", "autoSubmitIntervalSeconds", "hidden", "disabled");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "text");
        this.nullableButtonTypeAdapter = moshi.adapter(Button.ButtonType.class, emptySet, "buttonType");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "autoSubmitCountdownText");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "autoSubmitIntervalSeconds");
        this.nullableJsonLogicBooleanAdapter = moshi.adapter(JsonLogicBoolean.class, emptySet, "hidden");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public BasicButtonAttributes fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        int i = -1;
        String str = null;
        Button.ButtonType buttonType = null;
        String str2 = null;
        Integer num = null;
        JsonLogicBoolean jsonLogicBoolean = null;
        JsonLogicBoolean jsonLogicBoolean2 = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw Util.unexpectedNull("text", "text", reader);
                    }
                    break;
                case 1:
                    buttonType = (Button.ButtonType) this.nullableButtonTypeAdapter.fromJson(reader);
                    break;
                case 2:
                    str2 = (String) this.nullableStringAdapter.fromJson(reader);
                    i &= -5;
                    break;
                case 3:
                    num = (Integer) this.nullableIntAdapter.fromJson(reader);
                    i &= -9;
                    break;
                case 4:
                    jsonLogicBoolean = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                    i &= -17;
                    break;
                case 5:
                    jsonLogicBoolean2 = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                    i &= -33;
                    break;
            }
        }
        reader.endObject();
        if (i == -61) {
            JsonLogicBoolean jsonLogicBoolean3 = jsonLogicBoolean2;
            JsonLogicBoolean jsonLogicBoolean4 = jsonLogicBoolean;
            Integer num2 = num;
            String str3 = str2;
            Button.ButtonType buttonType2 = buttonType;
            String str4 = str;
            if (str4 != null) {
                return new BasicButtonAttributes(str4, buttonType2, str3, num2, jsonLogicBoolean4, jsonLogicBoolean3);
            }
            throw Util.missingProperty("text", "text", reader);
        }
        JsonLogicBoolean jsonLogicBoolean5 = jsonLogicBoolean2;
        JsonLogicBoolean jsonLogicBoolean6 = jsonLogicBoolean;
        Integer num3 = num;
        String str5 = str2;
        Button.ButtonType buttonType3 = buttonType;
        String str6 = str;
        Constructor<BasicButtonAttributes> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = BasicButtonAttributes.class.getDeclaredConstructor(String.class, Button.ButtonType.class, String.class, Integer.class, JsonLogicBoolean.class, JsonLogicBoolean.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        if (str6 == null) {
            throw Util.missingProperty("text", "text", reader);
        }
        BasicButtonAttributes newInstance = constructor.newInstance(str6, buttonType3, str5, num3, jsonLogicBoolean6, jsonLogicBoolean5, Integer.valueOf(i), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, BasicButtonAttributes value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("text");
        this.stringAdapter.toJson(writer, value_.getText());
        writer.name("buttonType");
        this.nullableButtonTypeAdapter.toJson(writer, value_.getButtonType());
        writer.name("autoSubmitCountdownText");
        this.nullableStringAdapter.toJson(writer, value_.getAutoSubmitCountdownText());
        writer.name("autoSubmitIntervalSeconds");
        this.nullableIntAdapter.toJson(writer, value_.getAutoSubmitIntervalSeconds());
        writer.name("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getHidden());
        writer.name("disabled");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getDisabled());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(43, "GeneratedJsonAdapter(BasicButtonAttributes)");
    }
}
