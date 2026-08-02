package com.withpersona.sdk2.inquiry.internal.network;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.internal.network.ExchangeOneTimeLinkCodeRequest;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeRequest_DataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeRequest$Data;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ExchangeOneTimeLinkCodeRequest_DataJsonAdapter extends JsonAdapter {
    public final JsonAdapter attributesAdapter;
    public volatile Constructor constructorRef;
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public ExchangeOneTimeLinkCodeRequest_DataJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("attributes", "type");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.attributesAdapter = moshi.adapter(ExchangeOneTimeLinkCodeRequest.Attributes.class, emptySet, "attributes");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "type");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        ExchangeOneTimeLinkCodeRequest.Attributes attributes = null;
        String str = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                attributes = (ExchangeOneTimeLinkCodeRequest.Attributes) this.attributesAdapter.fromJson(jsonReader);
                if (attributes == null) {
                    throw Util.unexpectedNull("attributes", "attributes", jsonReader);
                }
            } else if (selectName == 1) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("type", "type", jsonReader);
                }
                i = -3;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -3) {
            if (attributes == null) {
                throw Util.missingProperty("attributes", "attributes", jsonReader);
            }
            str.getClass();
            return new ExchangeOneTimeLinkCodeRequest.Data(attributes, str);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ExchangeOneTimeLinkCodeRequest.Data.class.getDeclaredConstructor(ExchangeOneTimeLinkCodeRequest.Attributes.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        if (attributes == null) {
            throw Util.missingProperty("attributes", "attributes", jsonReader);
        }
        Object newInstance = constructor.newInstance(attributes, str, Integer.valueOf(i), null);
        newInstance.getClass();
        return (ExchangeOneTimeLinkCodeRequest.Data) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        ExchangeOneTimeLinkCodeRequest.Data data = (ExchangeOneTimeLinkCodeRequest.Data) obj;
        jsonWriter.getClass();
        if (data == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("attributes");
        this.attributesAdapter.toJson(jsonWriter, data.attributes);
        jsonWriter.name("type");
        this.stringAdapter.toJson(jsonWriter, data.f1458type);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(57, "GeneratedJsonAdapter(ExchangeOneTimeLinkCodeRequest.Data)");
    }
}
