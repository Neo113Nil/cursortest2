package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Mdoc;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0015\u001a\u00020\u000eH\u0016J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc_AttributesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Attributes;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableJsonLogicBooleanAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "nullableProviderAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Provider;", "nullableStringAdapter", "", "booleanAdapter", "", "nullableIntAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Mdoc_AttributesJsonAdapter extends JsonAdapter {
    private final JsonAdapter booleanAdapter;
    private volatile Constructor<Mdoc.Attributes> constructorRef;
    private final JsonAdapter nullableIntAdapter;
    private final JsonAdapter nullableJsonLogicBooleanAdapter;
    private final JsonAdapter nullableProviderAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options;

    public Mdoc_AttributesJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("disabled", "hidden", "provider", "noMdocAvailableText", "errorRetrievingMdocText", "showWhenMdocNotAvailable", "successfulMdocRetrievalTransitionComponentName", "autoSubmitCountdownText", "autoSubmitIntervalSeconds");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableJsonLogicBooleanAdapter = moshi.adapter(JsonLogicBoolean.class, emptySet, "disabled");
        this.nullableProviderAdapter = moshi.adapter(Mdoc.Provider.class, emptySet, "provider");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "noMdocAvailableText");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "showWhenMdocNotAvailable");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "autoSubmitIntervalSeconds");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Mdoc.Attributes fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        int i = -1;
        JsonLogicBoolean jsonLogicBoolean = null;
        JsonLogicBoolean jsonLogicBoolean2 = null;
        Mdoc.Provider provider = null;
        String str = null;
        String str2 = null;
        Boolean bool = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    jsonLogicBoolean = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                    break;
                case 1:
                    jsonLogicBoolean2 = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                    break;
                case 2:
                    provider = (Mdoc.Provider) this.nullableProviderAdapter.fromJson(reader);
                    break;
                case 3:
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    str2 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    bool = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw Util.unexpectedNull("showWhenMdocNotAvailable", "showWhenMdocNotAvailable", reader);
                    }
                    break;
                case 6:
                    str3 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 7:
                    str4 = (String) this.nullableStringAdapter.fromJson(reader);
                    i &= -129;
                    break;
                case 8:
                    num = (Integer) this.nullableIntAdapter.fromJson(reader);
                    i &= -257;
                    break;
            }
        }
        reader.endObject();
        if (i == -385) {
            Boolean bool2 = bool;
            String str5 = str2;
            String str6 = str;
            Mdoc.Provider provider2 = provider;
            JsonLogicBoolean jsonLogicBoolean3 = jsonLogicBoolean2;
            JsonLogicBoolean jsonLogicBoolean4 = jsonLogicBoolean;
            if (bool2 == null) {
                throw Util.missingProperty("showWhenMdocNotAvailable", "showWhenMdocNotAvailable", reader);
            }
            Integer num2 = num;
            return new Mdoc.Attributes(jsonLogicBoolean4, jsonLogicBoolean3, provider2, str6, str5, bool2.booleanValue(), str3, str4, num2);
        }
        String str7 = str4;
        String str8 = str3;
        Integer num3 = num;
        Boolean bool3 = bool;
        String str9 = str2;
        String str10 = str;
        Mdoc.Provider provider3 = provider;
        JsonLogicBoolean jsonLogicBoolean5 = jsonLogicBoolean2;
        JsonLogicBoolean jsonLogicBoolean6 = jsonLogicBoolean;
        Constructor<Mdoc.Attributes> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Mdoc.Attributes.class.getDeclaredConstructor(JsonLogicBoolean.class, JsonLogicBoolean.class, Mdoc.Provider.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        Constructor<Mdoc.Attributes> constructor2 = constructor;
        if (bool3 == null) {
            throw Util.missingProperty("showWhenMdocNotAvailable", "showWhenMdocNotAvailable", reader);
        }
        Mdoc.Attributes newInstance = constructor2.newInstance(jsonLogicBoolean6, jsonLogicBoolean5, provider3, str10, str9, bool3, str8, str7, num3, Integer.valueOf(i), null);
        newInstance.getClass();
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, Mdoc.Attributes value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("disabled");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getDisabled());
        writer.name("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getHidden());
        writer.name("provider");
        this.nullableProviderAdapter.toJson(writer, value_.getProvider());
        writer.name("noMdocAvailableText");
        this.nullableStringAdapter.toJson(writer, value_.getNoMdocAvailableText());
        writer.name("errorRetrievingMdocText");
        this.nullableStringAdapter.toJson(writer, value_.getErrorRetrievingMdocText());
        writer.name("showWhenMdocNotAvailable");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getShowWhenMdocNotAvailable()));
        writer.name("successfulMdocRetrievalTransitionComponentName");
        this.nullableStringAdapter.toJson(writer, value_.getSuccessfulMdocRetrievalTransitionComponentName());
        writer.name("autoSubmitCountdownText");
        this.nullableStringAdapter.toJson(writer, value_.getAutoSubmitCountdownText());
        writer.name("autoSubmitIntervalSeconds");
        this.nullableIntAdapter.toJson(writer, value_.getAutoSubmitIntervalSeconds());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(37, "GeneratedJsonAdapter(Mdoc.Attributes)");
    }
}
