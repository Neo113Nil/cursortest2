package com.withpersona.sdk2.inquiry.network.dto;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_Selfie_PromptPageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$PromptPage;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "nullableStringAdapter", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NextStep_Selfie_PromptPageJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter stringAdapter;

    public NextStep_Selfie_PromptPageJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("selfieTitle", "selfiePrompt", "selfiePromptCenter", "agreeToPolicy", "btnSubmit", "cameraPermissionsTitle", "cameraPermissionsPrompt", "cameraPermissionsBtnContinueMobile", "cameraPermissionsBtnCancel", "microphonePermissionsBtnCancel", "microphonePermissionsBtnContinueMobile", "microphonePermissionsPrompt", "microphonePermissionsTitle");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "cameraPermissionsTitle");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NextStep.Selfie.PromptPage fromJson(JsonReader reader) {
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
        String str13 = null;
        while (true) {
            String str14 = str;
            String str15 = str2;
            String str16 = str3;
            String str17 = str4;
            String str18 = str5;
            String str19 = str6;
            String str20 = str7;
            String str21 = str8;
            if (!reader.hasNext()) {
                String str22 = str9;
                reader.endObject();
                if (str14 == null) {
                    throw Util.missingProperty("title", "selfieTitle", reader);
                }
                if (str15 == null) {
                    throw Util.missingProperty("prompt", "selfiePrompt", reader);
                }
                if (str16 == null) {
                    throw Util.missingProperty("promptCenter", "selfiePromptCenter", reader);
                }
                if (str17 == null) {
                    throw Util.missingProperty("disclosure", "agreeToPolicy", reader);
                }
                if (str18 != null) {
                    return new NextStep.Selfie.PromptPage(str14, str15, str16, str17, str18, str19, str20, str21, str22, str10, str11, str12, str13);
                }
                throw Util.missingProperty("buttonSubmit", "btnSubmit", reader);
            }
            String str23 = str9;
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    str9 = str23;
                    str = str14;
                    str2 = str15;
                    str3 = str16;
                    str4 = str17;
                    str5 = str18;
                    str6 = str19;
                    str7 = str20;
                    str8 = str21;
                case 0:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw Util.unexpectedNull("title", "selfieTitle", reader);
                    }
                    str9 = str23;
                    str2 = str15;
                    str3 = str16;
                    str4 = str17;
                    str5 = str18;
                    str6 = str19;
                    str7 = str20;
                    str8 = str21;
                case 1:
                    String str24 = (String) this.stringAdapter.fromJson(reader);
                    if (str24 == null) {
                        throw Util.unexpectedNull("prompt", "selfiePrompt", reader);
                    }
                    str2 = str24;
                    str9 = str23;
                    str = str14;
                    str3 = str16;
                    str4 = str17;
                    str5 = str18;
                    str6 = str19;
                    str7 = str20;
                    str8 = str21;
                case 2:
                    String str25 = (String) this.stringAdapter.fromJson(reader);
                    if (str25 == null) {
                        throw Util.unexpectedNull("promptCenter", "selfiePromptCenter", reader);
                    }
                    str3 = str25;
                    str9 = str23;
                    str = str14;
                    str2 = str15;
                    str4 = str17;
                    str5 = str18;
                    str6 = str19;
                    str7 = str20;
                    str8 = str21;
                case 3:
                    str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("disclosure", "agreeToPolicy", reader);
                    }
                    str9 = str23;
                    str = str14;
                    str2 = str15;
                    str3 = str16;
                    str5 = str18;
                    str6 = str19;
                    str7 = str20;
                    str8 = str21;
                case 4:
                    str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw Util.unexpectedNull("buttonSubmit", "btnSubmit", reader);
                    }
                    str9 = str23;
                    str = str14;
                    str2 = str15;
                    str3 = str16;
                    str4 = str17;
                    str6 = str19;
                    str7 = str20;
                    str8 = str21;
                case 5:
                    str6 = (String) this.nullableStringAdapter.fromJson(reader);
                    str9 = str23;
                    str = str14;
                    str2 = str15;
                    str3 = str16;
                    str4 = str17;
                    str5 = str18;
                    str7 = str20;
                    str8 = str21;
                case 6:
                    str7 = (String) this.nullableStringAdapter.fromJson(reader);
                    str9 = str23;
                    str = str14;
                    str2 = str15;
                    str3 = str16;
                    str4 = str17;
                    str5 = str18;
                    str6 = str19;
                    str8 = str21;
                case 7:
                    str8 = (String) this.nullableStringAdapter.fromJson(reader);
                    str9 = str23;
                    str = str14;
                    str2 = str15;
                    str3 = str16;
                    str4 = str17;
                    str5 = str18;
                    str6 = str19;
                    str7 = str20;
                case 8:
                    str9 = (String) this.nullableStringAdapter.fromJson(reader);
                    str = str14;
                    str2 = str15;
                    str3 = str16;
                    str4 = str17;
                    str5 = str18;
                    str6 = str19;
                    str7 = str20;
                    str8 = str21;
                case 9:
                    str10 = (String) this.nullableStringAdapter.fromJson(reader);
                    str9 = str23;
                    str = str14;
                    str2 = str15;
                    str3 = str16;
                    str4 = str17;
                    str5 = str18;
                    str6 = str19;
                    str7 = str20;
                    str8 = str21;
                case 10:
                    str11 = (String) this.nullableStringAdapter.fromJson(reader);
                    str9 = str23;
                    str = str14;
                    str2 = str15;
                    str3 = str16;
                    str4 = str17;
                    str5 = str18;
                    str6 = str19;
                    str7 = str20;
                    str8 = str21;
                case 11:
                    str12 = (String) this.nullableStringAdapter.fromJson(reader);
                    str9 = str23;
                    str = str14;
                    str2 = str15;
                    str3 = str16;
                    str4 = str17;
                    str5 = str18;
                    str6 = str19;
                    str7 = str20;
                    str8 = str21;
                case 12:
                    str13 = (String) this.nullableStringAdapter.fromJson(reader);
                    str9 = str23;
                    str = str14;
                    str2 = str15;
                    str3 = str16;
                    str4 = str17;
                    str5 = str18;
                    str6 = str19;
                    str7 = str20;
                    str8 = str21;
                default:
                    str9 = str23;
                    str = str14;
                    str2 = str15;
                    str3 = str16;
                    str4 = str17;
                    str5 = str18;
                    str6 = str19;
                    str7 = str20;
                    str8 = str21;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, NextStep.Selfie.PromptPage value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("selfieTitle");
        this.stringAdapter.toJson(writer, value_.getTitle());
        writer.name("selfiePrompt");
        this.stringAdapter.toJson(writer, value_.getPrompt());
        writer.name("selfiePromptCenter");
        this.stringAdapter.toJson(writer, value_.getPromptCenter());
        writer.name("agreeToPolicy");
        this.stringAdapter.toJson(writer, value_.getDisclosure());
        writer.name("btnSubmit");
        this.stringAdapter.toJson(writer, value_.getButtonSubmit());
        writer.name("cameraPermissionsTitle");
        this.nullableStringAdapter.toJson(writer, value_.getCameraPermissionsTitle());
        writer.name("cameraPermissionsPrompt");
        this.nullableStringAdapter.toJson(writer, value_.getCameraPermissionsPrompt());
        writer.name("cameraPermissionsBtnContinueMobile");
        this.nullableStringAdapter.toJson(writer, value_.getCameraPermissionsAllowButtonText());
        writer.name("cameraPermissionsBtnCancel");
        this.nullableStringAdapter.toJson(writer, value_.getCameraPermissionsCancelButtonText());
        writer.name("microphonePermissionsBtnCancel");
        this.nullableStringAdapter.toJson(writer, value_.getMicrophonePermissionsBtnCancel());
        writer.name("microphonePermissionsBtnContinueMobile");
        this.nullableStringAdapter.toJson(writer, value_.getMicrophonePermissionsBtnContinueMobile());
        writer.name("microphonePermissionsPrompt");
        this.nullableStringAdapter.toJson(writer, value_.getMicrophonePermissionsPrompt());
        writer.name("microphonePermissionsTitle");
        this.nullableStringAdapter.toJson(writer, value_.getMicrophonePermissionsTitle());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(48, "GeneratedJsonAdapter(NextStep.Selfie.PromptPage)");
    }
}
