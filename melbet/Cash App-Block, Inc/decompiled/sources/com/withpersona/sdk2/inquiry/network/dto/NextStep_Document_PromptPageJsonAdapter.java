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

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_Document_PromptPageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$PromptPage;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableStringAdapter", "", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NextStep_Document_PromptPageJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options;

    public NextStep_Document_PromptPageJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("title", "prompt", "disclaimer", "captureOptionsDialogTitle", "btnCapture", "btnUpload", "btnSubmit", "cameraPermissionsTitle", "cameraPermissionsPrompt", "cameraPermissionsBtnContinueMobile", "cameraPermissionsBtnCancel", "largeFileErrorPrompt");
        this.nullableStringAdapter = moshi.adapter(String.class, EmptySet.INSTANCE, "title");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NextStep.Document.PromptPage fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
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
                case 7:
                    str8 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 8:
                    str9 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 9:
                    str10 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 10:
                    str11 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 11:
                    str12 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new NextStep.Document.PromptPage(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, NextStep.Document.PromptPage value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("title");
        this.nullableStringAdapter.toJson(writer, value_.getTitle());
        writer.name("prompt");
        this.nullableStringAdapter.toJson(writer, value_.getPrompt());
        writer.name("disclaimer");
        this.nullableStringAdapter.toJson(writer, value_.getDisclaimer());
        writer.name("captureOptionsDialogTitle");
        this.nullableStringAdapter.toJson(writer, value_.getCaptureOptionsDialogTitle());
        writer.name("btnCapture");
        this.nullableStringAdapter.toJson(writer, value_.getBtnCapture());
        writer.name("btnUpload");
        this.nullableStringAdapter.toJson(writer, value_.getBtnUpload());
        writer.name("btnSubmit");
        this.nullableStringAdapter.toJson(writer, value_.getBtnSubmit());
        writer.name("cameraPermissionsTitle");
        this.nullableStringAdapter.toJson(writer, value_.getCameraPermissionsTitle());
        writer.name("cameraPermissionsPrompt");
        this.nullableStringAdapter.toJson(writer, value_.getCameraPermissionsPrompt());
        writer.name("cameraPermissionsBtnContinueMobile");
        this.nullableStringAdapter.toJson(writer, value_.getCameraPermissionsAllowButtonText());
        writer.name("cameraPermissionsBtnCancel");
        this.nullableStringAdapter.toJson(writer, value_.getCameraPermissionsCancelButtonText());
        writer.name("largeFileErrorPrompt");
        this.nullableStringAdapter.toJson(writer, value_.getLargeFileErrorPrompt());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(50, "GeneratedJsonAdapter(NextStep.Document.PromptPage)");
    }
}
