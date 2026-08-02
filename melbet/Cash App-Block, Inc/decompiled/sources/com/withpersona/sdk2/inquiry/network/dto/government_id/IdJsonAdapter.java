package com.withpersona.sdk2.inquiry.network.dto.government_id;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0011\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/IdJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "listOfStringAdapter", "", "nullableIdIconAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdIcon;", "nullableListOfCapturePageConfigAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IdJsonAdapter extends JsonAdapter {
    private final JsonAdapter listOfStringAdapter;
    private final JsonAdapter nullableIdIconAdapter;
    private final JsonAdapter nullableListOfCapturePageConfigAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter stringAdapter;

    public IdJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("class", "requiresSides", "icon", "capturePageConfigs");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "class");
        this.listOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), emptySet, "requiresSides");
        this.nullableIdIconAdapter = moshi.adapter(Id.IdIcon.class, emptySet, "icon");
        this.nullableListOfCapturePageConfigAdapter = moshi.adapter(Types.newParameterizedType(List.class, CapturePageConfig.class), emptySet, "capturePageConfigs");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Id fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        String str = null;
        List list = null;
        Id.IdIcon idIcon = null;
        List list2 = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw Util.unexpectedNull("class_", "class", reader);
                }
            } else if (selectName == 1) {
                list = (List) this.listOfStringAdapter.fromJson(reader);
                if (list == null) {
                    throw Util.unexpectedNull("requiresSides", "requiresSides", reader);
                }
            } else if (selectName == 2) {
                idIcon = (Id.IdIcon) this.nullableIdIconAdapter.fromJson(reader);
            } else if (selectName == 3) {
                list2 = (List) this.nullableListOfCapturePageConfigAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (str == null) {
            throw Util.missingProperty("class_", "class", reader);
        }
        if (list != null) {
            return new Id(str, list, idIcon, list2);
        }
        throw Util.missingProperty("requiresSides", "requiresSides", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, Id value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("class");
        this.stringAdapter.toJson(writer, value_.getClass());
        writer.name("requiresSides");
        this.listOfStringAdapter.toJson(writer, value_.getRequiresSides());
        writer.name("icon");
        this.nullableIdIconAdapter.toJson(writer, value_.getIcon());
        writer.name("capturePageConfigs");
        this.nullableListOfCapturePageConfigAdapter.toJson(writer, value_.getCapturePageConfigs());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(24, "GeneratedJsonAdapter(Id)");
    }
}
