package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.dto.ui.BasicButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCompleteComponentStyle;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0011\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CompleteButtonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CompleteButton;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "nullableBasicButtonAttributesAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "nullableButtonCompleteComponentStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCompleteComponentStyle;", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CompleteButtonJsonAdapter extends JsonAdapter {
    private volatile Constructor<CompleteButton> constructorRef;
    private final JsonAdapter nullableBasicButtonAttributesAdapter;
    private final JsonAdapter nullableButtonCompleteComponentStyleAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter stringAdapter;

    public CompleteButtonJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("name", "attributes", "styles");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "name");
        this.nullableBasicButtonAttributesAdapter = moshi.adapter(BasicButtonAttributes.class, emptySet, "attributes");
        this.nullableButtonCompleteComponentStyleAdapter = moshi.adapter(ButtonCompleteComponentStyle.class, emptySet, "styles");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public CompleteButton fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        String str = null;
        BasicButtonAttributes basicButtonAttributes = null;
        ButtonCompleteComponentStyle buttonCompleteComponentStyle = null;
        int i = -1;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw Util.unexpectedNull("name", "name", reader);
                }
            } else if (selectName == 1) {
                basicButtonAttributes = (BasicButtonAttributes) this.nullableBasicButtonAttributesAdapter.fromJson(reader);
            } else if (selectName == 2) {
                buttonCompleteComponentStyle = (ButtonCompleteComponentStyle) this.nullableButtonCompleteComponentStyleAdapter.fromJson(reader);
                i = -5;
            }
        }
        reader.endObject();
        if (i == -5) {
            if (str != null) {
                return new CompleteButton(str, basicButtonAttributes, buttonCompleteComponentStyle);
            }
            throw Util.missingProperty("name", "name", reader);
        }
        Constructor<CompleteButton> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CompleteButton.class.getDeclaredConstructor(String.class, BasicButtonAttributes.class, ButtonCompleteComponentStyle.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        if (str == null) {
            throw Util.missingProperty("name", "name", reader);
        }
        CompleteButton newInstance = constructor.newInstance(str, basicButtonAttributes, buttonCompleteComponentStyle, Integer.valueOf(i), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, CompleteButton value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("name");
        this.stringAdapter.toJson(writer, value_.getName());
        writer.name("attributes");
        this.nullableBasicButtonAttributesAdapter.toJson(writer, value_.getAttributes());
        writer.name("styles");
        this.nullableButtonCompleteComponentStyleAdapter.toJson(writer, value_.getStyles());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(36, "GeneratedJsonAdapter(CompleteButton)");
    }
}
