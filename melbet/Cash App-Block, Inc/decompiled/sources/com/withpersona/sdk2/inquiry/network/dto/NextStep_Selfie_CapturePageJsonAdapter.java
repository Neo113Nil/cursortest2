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

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_Selfie_CapturePageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CapturePage;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableStringAdapter", "", "stringAdapter", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NextStep_Selfie_CapturePageJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter stringAdapter;

    public NextStep_Selfie_CapturePageJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("title", "selfieHintTakePhoto", "selfieHintCenterFace", "selfieHintFaceTooClose", "selfieHintFaceTooFar", "selfieHintMultipleFaces", "selfieHintFaceIncomplete", "selfieHintPoseNotCenter", "selfieHintLookLeft", "selfieHintLookRight", "selfieHintHoldStill", "autoCaptureOn", "captureSuccess", "selfieHintCenterFaceDescription", "selfieHintLookLeftDescription", "selfieHintLookRightDescription", "cameraLoadingTitle", "selfieHintVerifying", "selfieHintAutoCaptureTimeout");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "selfieHintTakePhoto");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NextStep.Selfie.CapturePage fromJson(JsonReader reader) {
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
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        String str19 = null;
        while (true) {
            String str20 = str;
            String str21 = str2;
            String str22 = str3;
            String str23 = str4;
            String str24 = str5;
            String str25 = str6;
            String str26 = str7;
            String str27 = str8;
            if (!reader.hasNext()) {
                String str28 = str9;
                reader.endObject();
                if (str21 == null) {
                    throw Util.missingProperty("selfieHintTakePhoto", "selfieHintTakePhoto", reader);
                }
                if (str22 == null) {
                    throw Util.missingProperty("selfieHintCenterFace", "selfieHintCenterFace", reader);
                }
                if (str23 == null) {
                    throw Util.missingProperty("selfieHintFaceTooClose", "selfieHintFaceTooClose", reader);
                }
                if (str24 == null) {
                    throw Util.missingProperty("selfieHintFaceTooFar", "selfieHintFaceTooFar", reader);
                }
                if (str25 == null) {
                    throw Util.missingProperty("selfieHintMultipleFaces", "selfieHintMultipleFaces", reader);
                }
                if (str26 == null) {
                    throw Util.missingProperty("selfieHintFaceIncomplete", "selfieHintFaceIncomplete", reader);
                }
                if (str27 == null) {
                    throw Util.missingProperty("selfieHintPoseNotCenter", "selfieHintPoseNotCenter", reader);
                }
                if (str28 == null) {
                    throw Util.missingProperty("selfieHintLookLeft", "selfieHintLookLeft", reader);
                }
                if (str10 == null) {
                    throw Util.missingProperty("selfieHintLookRight", "selfieHintLookRight", reader);
                }
                if (str11 != null) {
                    return new NextStep.Selfie.CapturePage(str20, str21, str22, str23, str24, str25, str26, str27, str28, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19);
                }
                throw Util.missingProperty("selfieHintHoldStill", "selfieHintHoldStill", reader);
            }
            String str29 = str9;
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    str9 = str29;
                    str = str20;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str5 = str24;
                    str6 = str25;
                    str7 = str26;
                    str8 = str27;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    str9 = str29;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str5 = str24;
                    str6 = str25;
                    str7 = str26;
                    str8 = str27;
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("selfieHintTakePhoto", "selfieHintTakePhoto", reader);
                    }
                    str9 = str29;
                    str = str20;
                    str3 = str22;
                    str4 = str23;
                    str5 = str24;
                    str6 = str25;
                    str7 = str26;
                    str8 = str27;
                case 2:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("selfieHintCenterFace", "selfieHintCenterFace", reader);
                    }
                    str9 = str29;
                    str = str20;
                    str2 = str21;
                    str4 = str23;
                    str5 = str24;
                    str6 = str25;
                    str7 = str26;
                    str8 = str27;
                case 3:
                    str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("selfieHintFaceTooClose", "selfieHintFaceTooClose", reader);
                    }
                    str9 = str29;
                    str = str20;
                    str2 = str21;
                    str3 = str22;
                    str5 = str24;
                    str6 = str25;
                    str7 = str26;
                    str8 = str27;
                case 4:
                    str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw Util.unexpectedNull("selfieHintFaceTooFar", "selfieHintFaceTooFar", reader);
                    }
                    str9 = str29;
                    str = str20;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str6 = str25;
                    str7 = str26;
                    str8 = str27;
                case 5:
                    str6 = (String) this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        throw Util.unexpectedNull("selfieHintMultipleFaces", "selfieHintMultipleFaces", reader);
                    }
                    str9 = str29;
                    str = str20;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str5 = str24;
                    str7 = str26;
                    str8 = str27;
                case 6:
                    str7 = (String) this.stringAdapter.fromJson(reader);
                    if (str7 == null) {
                        throw Util.unexpectedNull("selfieHintFaceIncomplete", "selfieHintFaceIncomplete", reader);
                    }
                    str9 = str29;
                    str = str20;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str5 = str24;
                    str6 = str25;
                    str8 = str27;
                case 7:
                    str8 = (String) this.stringAdapter.fromJson(reader);
                    if (str8 == null) {
                        throw Util.unexpectedNull("selfieHintPoseNotCenter", "selfieHintPoseNotCenter", reader);
                    }
                    str9 = str29;
                    str = str20;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str5 = str24;
                    str6 = str25;
                    str7 = str26;
                case 8:
                    str9 = (String) this.stringAdapter.fromJson(reader);
                    if (str9 == null) {
                        throw Util.unexpectedNull("selfieHintLookLeft", "selfieHintLookLeft", reader);
                    }
                    str = str20;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str5 = str24;
                    str6 = str25;
                    str7 = str26;
                    str8 = str27;
                case 9:
                    str10 = (String) this.stringAdapter.fromJson(reader);
                    if (str10 == null) {
                        throw Util.unexpectedNull("selfieHintLookRight", "selfieHintLookRight", reader);
                    }
                    str9 = str29;
                    str = str20;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str5 = str24;
                    str6 = str25;
                    str7 = str26;
                    str8 = str27;
                case 10:
                    str11 = (String) this.stringAdapter.fromJson(reader);
                    if (str11 == null) {
                        throw Util.unexpectedNull("selfieHintHoldStill", "selfieHintHoldStill", reader);
                    }
                    str9 = str29;
                    str = str20;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str5 = str24;
                    str6 = str25;
                    str7 = str26;
                    str8 = str27;
                case 11:
                    str12 = (String) this.nullableStringAdapter.fromJson(reader);
                    str9 = str29;
                    str = str20;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str5 = str24;
                    str6 = str25;
                    str7 = str26;
                    str8 = str27;
                case 12:
                    str13 = (String) this.nullableStringAdapter.fromJson(reader);
                    str9 = str29;
                    str = str20;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str5 = str24;
                    str6 = str25;
                    str7 = str26;
                    str8 = str27;
                case 13:
                    str14 = (String) this.nullableStringAdapter.fromJson(reader);
                    str9 = str29;
                    str = str20;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str5 = str24;
                    str6 = str25;
                    str7 = str26;
                    str8 = str27;
                case 14:
                    str15 = (String) this.nullableStringAdapter.fromJson(reader);
                    str9 = str29;
                    str = str20;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str5 = str24;
                    str6 = str25;
                    str7 = str26;
                    str8 = str27;
                case 15:
                    str16 = (String) this.nullableStringAdapter.fromJson(reader);
                    str9 = str29;
                    str = str20;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str5 = str24;
                    str6 = str25;
                    str7 = str26;
                    str8 = str27;
                case 16:
                    str17 = (String) this.nullableStringAdapter.fromJson(reader);
                    str9 = str29;
                    str = str20;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str5 = str24;
                    str6 = str25;
                    str7 = str26;
                    str8 = str27;
                case 17:
                    str18 = (String) this.nullableStringAdapter.fromJson(reader);
                    str9 = str29;
                    str = str20;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str5 = str24;
                    str6 = str25;
                    str7 = str26;
                    str8 = str27;
                case 18:
                    str19 = (String) this.nullableStringAdapter.fromJson(reader);
                    str9 = str29;
                    str = str20;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str5 = str24;
                    str6 = str25;
                    str7 = str26;
                    str8 = str27;
                default:
                    str9 = str29;
                    str = str20;
                    str2 = str21;
                    str3 = str22;
                    str4 = str23;
                    str5 = str24;
                    str6 = str25;
                    str7 = str26;
                    str8 = str27;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, NextStep.Selfie.CapturePage value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("title");
        this.nullableStringAdapter.toJson(writer, value_.getTitle());
        writer.name("selfieHintTakePhoto");
        this.stringAdapter.toJson(writer, value_.getSelfieHintTakePhoto());
        writer.name("selfieHintCenterFace");
        this.stringAdapter.toJson(writer, value_.getSelfieHintCenterFace());
        writer.name("selfieHintFaceTooClose");
        this.stringAdapter.toJson(writer, value_.getSelfieHintFaceTooClose());
        writer.name("selfieHintFaceTooFar");
        this.stringAdapter.toJson(writer, value_.getSelfieHintFaceTooFar());
        writer.name("selfieHintMultipleFaces");
        this.stringAdapter.toJson(writer, value_.getSelfieHintMultipleFaces());
        writer.name("selfieHintFaceIncomplete");
        this.stringAdapter.toJson(writer, value_.getSelfieHintFaceIncomplete());
        writer.name("selfieHintPoseNotCenter");
        this.stringAdapter.toJson(writer, value_.getSelfieHintPoseNotCenter());
        writer.name("selfieHintLookLeft");
        this.stringAdapter.toJson(writer, value_.getSelfieHintLookLeft());
        writer.name("selfieHintLookRight");
        this.stringAdapter.toJson(writer, value_.getSelfieHintLookRight());
        writer.name("selfieHintHoldStill");
        this.stringAdapter.toJson(writer, value_.getSelfieHintHoldStill());
        writer.name("autoCaptureOn");
        this.nullableStringAdapter.toJson(writer, value_.getAutoCaptureOn());
        writer.name("captureSuccess");
        this.nullableStringAdapter.toJson(writer, value_.getCaptureSuccess());
        writer.name("selfieHintCenterFaceDescription");
        this.nullableStringAdapter.toJson(writer, value_.getSelfieHintCenterFaceDescription());
        writer.name("selfieHintLookLeftDescription");
        this.nullableStringAdapter.toJson(writer, value_.getSelfieHintLookLeftDescription());
        writer.name("selfieHintLookRightDescription");
        this.nullableStringAdapter.toJson(writer, value_.getSelfieHintLookRightDescription());
        writer.name("cameraLoadingTitle");
        this.nullableStringAdapter.toJson(writer, value_.getCameraLoadingTitle());
        writer.name("selfieHintVerifying");
        this.nullableStringAdapter.toJson(writer, value_.getSelfieHintVerifying());
        writer.name("selfieHintAutoCaptureTimeout");
        this.nullableStringAdapter.toJson(writer, value_.getSelfieHintAutoCaptureTimeout());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(49, "GeneratedJsonAdapter(NextStep.Selfie.CapturePage)");
    }
}
