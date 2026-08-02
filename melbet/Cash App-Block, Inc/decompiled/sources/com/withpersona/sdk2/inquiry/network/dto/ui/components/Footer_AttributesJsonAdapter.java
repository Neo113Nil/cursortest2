package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Footer;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Footer_AttributesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Footer$Attributes;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "listOfUiComponentConfigAdapter", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "nullableIntAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Footer_AttributesJsonAdapter extends JsonAdapter {
    private volatile Constructor<Footer.Attributes> constructorRef;
    private final JsonAdapter listOfUiComponentConfigAdapter;
    private final JsonAdapter nullableIntAdapter;
    private final JsonReader.Options options;

    public Footer_AttributesJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("children", "firstBelowTheFoldChildIndex");
        Util.ParameterizedTypeImpl newParameterizedType = Types.newParameterizedType(List.class, UiComponentConfig.class);
        EmptySet emptySet = EmptySet.INSTANCE;
        this.listOfUiComponentConfigAdapter = moshi.adapter(newParameterizedType, emptySet, "children");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "firstBelowTheFoldChildIndex");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Footer.Attributes fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        List list = null;
        Integer num = null;
        int i = -1;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                list = (List) this.listOfUiComponentConfigAdapter.fromJson(reader);
                if (list == null) {
                    throw Util.unexpectedNull("children", "children", reader);
                }
                i &= -2;
            } else if (selectName == 1) {
                num = (Integer) this.nullableIntAdapter.fromJson(reader);
                i &= -3;
            }
        }
        reader.endObject();
        if (i == -4) {
            list.getClass();
            return new Footer.Attributes(list, num);
        }
        Constructor<Footer.Attributes> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Footer.Attributes.class.getDeclaredConstructor(List.class, Integer.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        Footer.Attributes newInstance = constructor.newInstance(list, num, Integer.valueOf(i), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, Footer.Attributes value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("children");
        this.listOfUiComponentConfigAdapter.toJson(writer, value_.getChildren());
        writer.name("firstBelowTheFoldChildIndex");
        this.nullableIntAdapter.toJson(writer, value_.getFirstBelowTheFoldChildIndex());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(39, "GeneratedJsonAdapter(Footer.Attributes)");
    }
}
