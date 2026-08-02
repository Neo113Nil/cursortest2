package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CreatePersonaSheet;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\r\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet_CardCtaPage_ComponentNameMappingJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage$ComponentNameMapping;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableStringAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CreatePersonaSheet_CardCtaPage_ComponentNameMappingJsonAdapter extends JsonAdapter {
    private volatile Constructor<CreatePersonaSheet.CardCtaPage.ComponentNameMapping> constructorRef;
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options;

    public CreatePersonaSheet_CardCtaPage_ComponentNameMappingJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("startButton", "dismissButton");
        this.nullableStringAdapter = moshi.adapter(String.class, EmptySet.INSTANCE, "startButton");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public CreatePersonaSheet.CardCtaPage.ComponentNameMapping fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        String str = null;
        String str2 = null;
        int i = -1;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.nullableStringAdapter.fromJson(reader);
                i &= -2;
            } else if (selectName == 1) {
                str2 = (String) this.nullableStringAdapter.fromJson(reader);
                i &= -3;
            }
        }
        reader.endObject();
        if (i == -4) {
            return new CreatePersonaSheet.CardCtaPage.ComponentNameMapping(str, str2);
        }
        Constructor<CreatePersonaSheet.CardCtaPage.ComponentNameMapping> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CreatePersonaSheet.CardCtaPage.ComponentNameMapping.class.getDeclaredConstructor(String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        CreatePersonaSheet.CardCtaPage.ComponentNameMapping newInstance = constructor.newInstance(str, str2, Integer.valueOf(i), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, CreatePersonaSheet.CardCtaPage.ComponentNameMapping value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("startButton");
        this.nullableStringAdapter.toJson(writer, value_.getStartButton());
        writer.name("dismissButton");
        this.nullableStringAdapter.toJson(writer, value_.getDismissButton());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(73, "GeneratedJsonAdapter(CreatePersonaSheet.CardCtaPage.ComponentNameMapping)");
    }
}
