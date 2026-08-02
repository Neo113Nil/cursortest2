package com.withpersona.sdk2.inquiry.document.network;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.document.network.CreateDocumentRequest;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest_DataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Data;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "document_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CreateDocumentRequest_DataJsonAdapter extends JsonAdapter {
    public final JsonAdapter attributesAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public CreateDocumentRequest_DataJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("type", "attributes");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "type");
        this.attributesAdapter = moshi.adapter(CreateDocumentRequest.Attributes.class, emptySet, "attributes");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        String str = null;
        CreateDocumentRequest.Attributes attributes = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("type", "type", jsonReader);
                }
            } else if (selectName == 1 && (attributes = (CreateDocumentRequest.Attributes) this.attributesAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("attributes", "attributes", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("type", "type", jsonReader);
        }
        if (attributes != null) {
            return new CreateDocumentRequest.Data(str, attributes);
        }
        throw Util.missingProperty("attributes", "attributes", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        CreateDocumentRequest.Data data = (CreateDocumentRequest.Data) obj;
        jsonWriter.getClass();
        if (data == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("type");
        this.stringAdapter.toJson(jsonWriter, data.f1450type);
        jsonWriter.name("attributes");
        this.attributesAdapter.toJson(jsonWriter, data.attributes);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(48, "GeneratedJsonAdapter(CreateDocumentRequest.Data)");
    }
}
