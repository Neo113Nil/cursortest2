package com.withpersona.sdk2.inquiry.network.dto;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "attributesAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;", "nullableRelationshipsAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/Relationships;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InquirySessionDataJsonAdapter extends JsonAdapter {
    private final JsonAdapter attributesAdapter;
    private final JsonAdapter nullableRelationshipsAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter stringAdapter;

    public InquirySessionDataJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("id", "attributes", "relationships");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.attributesAdapter = moshi.adapter(Attributes.class, emptySet, "attributes");
        this.nullableRelationshipsAdapter = moshi.adapter(Relationships.class, emptySet, "relationships");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public InquirySessionData fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        String str = null;
        Attributes attributes = null;
        Relationships relationships = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw Util.unexpectedNull("id", "id", reader);
                }
            } else if (selectName == 1) {
                attributes = (Attributes) this.attributesAdapter.fromJson(reader);
                if (attributes == null) {
                    throw Util.unexpectedNull("attributes", "attributes", reader);
                }
            } else if (selectName == 2) {
                relationships = (Relationships) this.nullableRelationshipsAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (str == null) {
            throw Util.missingProperty("id", "id", reader);
        }
        if (attributes != null) {
            return new InquirySessionData(str, attributes, relationships);
        }
        throw Util.missingProperty("attributes", "attributes", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, InquirySessionData value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.name("attributes");
        this.attributesAdapter.toJson(writer, value_.getAttributes());
        writer.name("relationships");
        this.nullableRelationshipsAdapter.toJson(writer, value_.getRelationships());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(40, "GeneratedJsonAdapter(InquirySessionData)");
    }
}
