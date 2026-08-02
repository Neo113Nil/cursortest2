package com.withpersona.sdk2.inquiry.network.dto;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000f\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField_IntegerFieldJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$IntegerField;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableIntAdapter", "", "stringAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InquiryField_IntegerFieldJsonAdapter extends JsonAdapter {
    private volatile Constructor<InquiryField.IntegerField> constructorRef;
    private final JsonAdapter nullableIntAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter stringAdapter;

    public InquiryField_IntegerFieldJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("value", "type");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "value");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "type");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public InquiryField.IntegerField fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        Integer num = null;
        String str = null;
        int i = -1;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                num = (Integer) this.nullableIntAdapter.fromJson(reader);
            } else if (selectName == 1) {
                str = (String) this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw Util.unexpectedNull("type", "type", reader);
                }
                i = -3;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i == -3) {
            str.getClass();
            return new InquiryField.IntegerField(num, str);
        }
        Constructor<InquiryField.IntegerField> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = InquiryField.IntegerField.class.getDeclaredConstructor(Integer.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        InquiryField.IntegerField newInstance = constructor.newInstance(num, str, Integer.valueOf(i), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, InquiryField.IntegerField value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("value");
        this.nullableIntAdapter.toJson(writer, value_.getValue());
        writer.name("type");
        this.stringAdapter.toJson(writer, value_.getType());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(47, "GeneratedJsonAdapter(InquiryField.IntegerField)");
    }
}
