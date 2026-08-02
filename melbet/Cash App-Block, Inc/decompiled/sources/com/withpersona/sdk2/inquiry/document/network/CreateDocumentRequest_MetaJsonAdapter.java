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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest_MetaJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Meta;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "document_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CreateDocumentRequest_MetaJsonAdapter extends JsonAdapter {
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public CreateDocumentRequest_MetaJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("fieldKeyDocument");
        this.stringAdapter = moshi.adapter(String.class, EmptySet.INSTANCE, "fieldKeyDocument");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0 && (str = (String) this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("fieldKeyDocument", "fieldKeyDocument", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str != null) {
            return new CreateDocumentRequest.Meta(str);
        }
        throw Util.missingProperty("fieldKeyDocument", "fieldKeyDocument", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        CreateDocumentRequest.Meta meta = (CreateDocumentRequest.Meta) obj;
        jsonWriter.getClass();
        if (meta == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("fieldKeyDocument");
        this.stringAdapter.toJson(jsonWriter, meta.fieldKeyDocument);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(48, "GeneratedJsonAdapter(CreateDocumentRequest.Meta)");
    }
}
