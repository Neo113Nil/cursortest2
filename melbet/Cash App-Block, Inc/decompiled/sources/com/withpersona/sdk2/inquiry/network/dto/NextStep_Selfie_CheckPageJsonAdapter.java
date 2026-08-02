package com.withpersona.sdk2.inquiry.network.dto;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_Selfie_CheckPageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CheckPage;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableStringAdapter", "", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NextStep_Selfie_CheckPageJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options;

    public NextStep_Selfie_CheckPageJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("title", "description", "selfieLabelFront", "selfieLabelLeft", "selfieLabelRight", "btnSubmit", "btnRetake");
        this.nullableStringAdapter = moshi.adapter(String.class, EmptySet.INSTANCE, "title");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NextStep.Selfie.CheckPage fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    str2 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    str3 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    str4 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    str5 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    str6 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    str7 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new NextStep.Selfie.CheckPage(str, str2, str3, str4, str5, str6, str7);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, NextStep.Selfie.CheckPage value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("title");
        this.nullableStringAdapter.toJson(writer, value_.getTitle());
        writer.name("description");
        this.nullableStringAdapter.toJson(writer, value_.getDescription());
        writer.name("selfieLabelFront");
        this.nullableStringAdapter.toJson(writer, value_.getSelfieLabelFront());
        writer.name("selfieLabelLeft");
        this.nullableStringAdapter.toJson(writer, value_.getSelfieLabelLeft());
        writer.name("selfieLabelRight");
        this.nullableStringAdapter.toJson(writer, value_.getSelfieLabelRight());
        writer.name("btnSubmit");
        this.nullableStringAdapter.toJson(writer, value_.getBtnSubmit());
        writer.name("btnRetake");
        this.nullableStringAdapter.toJson(writer, value_.getBtnRetake());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(47, "GeneratedJsonAdapter(NextStep.Selfie.CheckPage)");
    }
}
