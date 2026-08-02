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

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_GovernmentId_ReviewUploadPageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$ReviewUploadPage;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NextStep_GovernmentId_ReviewUploadPageJsonAdapter extends JsonAdapter {
    private final JsonReader.Options options;
    private final JsonAdapter stringAdapter;

    public NextStep_GovernmentId_ReviewUploadPageJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("titleFront", "titleBack", "titlePdf417", "titlePassportSignature", "descriptionFront", "descriptionBack", "descriptionPdf417", "descriptionPassportSignature", "confirmButtonText", "chooseAnotherButtonText");
        this.stringAdapter = moshi.adapter(String.class, EmptySet.INSTANCE, "titleFront");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NextStep.GovernmentId.ReviewUploadPage fromJson(JsonReader reader) {
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
        while (true) {
            String str11 = str;
            String str12 = str2;
            String str13 = str3;
            String str14 = str4;
            String str15 = str5;
            String str16 = str6;
            if (!reader.hasNext()) {
                String str17 = str7;
                reader.endObject();
                if (str11 == null) {
                    throw Util.missingProperty("titleFront", "titleFront", reader);
                }
                if (str12 == null) {
                    throw Util.missingProperty("titleBack", "titleBack", reader);
                }
                if (str13 == null) {
                    throw Util.missingProperty("titlePdf417", "titlePdf417", reader);
                }
                if (str14 == null) {
                    throw Util.missingProperty("titlePassportSignature", "titlePassportSignature", reader);
                }
                if (str15 == null) {
                    throw Util.missingProperty("descriptionFront", "descriptionFront", reader);
                }
                if (str16 == null) {
                    throw Util.missingProperty("descriptionBack", "descriptionBack", reader);
                }
                if (str17 == null) {
                    throw Util.missingProperty("descriptionPdf417", "descriptionPdf417", reader);
                }
                if (str8 == null) {
                    throw Util.missingProperty("descriptionPassportSignature", "descriptionPassportSignature", reader);
                }
                if (str9 == null) {
                    throw Util.missingProperty("confirmButtonText", "confirmButtonText", reader);
                }
                if (str10 != null) {
                    return new NextStep.GovernmentId.ReviewUploadPage(str11, str12, str13, str14, str15, str16, str17, str8, str9, str10);
                }
                throw Util.missingProperty("chooseAnotherButtonText", "chooseAnotherButtonText", reader);
            }
            String str18 = str7;
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    str7 = str18;
                    str = str11;
                    str2 = str12;
                    str3 = str13;
                    str4 = str14;
                    str5 = str15;
                    str6 = str16;
                case 0:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw Util.unexpectedNull("titleFront", "titleFront", reader);
                    }
                    str7 = str18;
                    str2 = str12;
                    str3 = str13;
                    str4 = str14;
                    str5 = str15;
                    str6 = str16;
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("titleBack", "titleBack", reader);
                    }
                    str7 = str18;
                    str = str11;
                    str3 = str13;
                    str4 = str14;
                    str5 = str15;
                    str6 = str16;
                case 2:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("titlePdf417", "titlePdf417", reader);
                    }
                    str7 = str18;
                    str = str11;
                    str2 = str12;
                    str4 = str14;
                    str5 = str15;
                    str6 = str16;
                case 3:
                    str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("titlePassportSignature", "titlePassportSignature", reader);
                    }
                    str7 = str18;
                    str = str11;
                    str2 = str12;
                    str3 = str13;
                    str5 = str15;
                    str6 = str16;
                case 4:
                    str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw Util.unexpectedNull("descriptionFront", "descriptionFront", reader);
                    }
                    str7 = str18;
                    str = str11;
                    str2 = str12;
                    str3 = str13;
                    str4 = str14;
                    str6 = str16;
                case 5:
                    str6 = (String) this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        throw Util.unexpectedNull("descriptionBack", "descriptionBack", reader);
                    }
                    str7 = str18;
                    str = str11;
                    str2 = str12;
                    str3 = str13;
                    str4 = str14;
                    str5 = str15;
                case 6:
                    str7 = (String) this.stringAdapter.fromJson(reader);
                    if (str7 == null) {
                        throw Util.unexpectedNull("descriptionPdf417", "descriptionPdf417", reader);
                    }
                    str = str11;
                    str2 = str12;
                    str3 = str13;
                    str4 = str14;
                    str5 = str15;
                    str6 = str16;
                case 7:
                    str8 = (String) this.stringAdapter.fromJson(reader);
                    if (str8 == null) {
                        throw Util.unexpectedNull("descriptionPassportSignature", "descriptionPassportSignature", reader);
                    }
                    str7 = str18;
                    str = str11;
                    str2 = str12;
                    str3 = str13;
                    str4 = str14;
                    str5 = str15;
                    str6 = str16;
                case 8:
                    str9 = (String) this.stringAdapter.fromJson(reader);
                    if (str9 == null) {
                        throw Util.unexpectedNull("confirmButtonText", "confirmButtonText", reader);
                    }
                    str7 = str18;
                    str = str11;
                    str2 = str12;
                    str3 = str13;
                    str4 = str14;
                    str5 = str15;
                    str6 = str16;
                case 9:
                    str10 = (String) this.stringAdapter.fromJson(reader);
                    if (str10 == null) {
                        throw Util.unexpectedNull("chooseAnotherButtonText", "chooseAnotherButtonText", reader);
                    }
                    str7 = str18;
                    str = str11;
                    str2 = str12;
                    str3 = str13;
                    str4 = str14;
                    str5 = str15;
                    str6 = str16;
                default:
                    str7 = str18;
                    str = str11;
                    str2 = str12;
                    str3 = str13;
                    str4 = str14;
                    str5 = str15;
                    str6 = str16;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, NextStep.GovernmentId.ReviewUploadPage value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("titleFront");
        this.stringAdapter.toJson(writer, value_.getTitleFront());
        writer.name("titleBack");
        this.stringAdapter.toJson(writer, value_.getTitleBack());
        writer.name("titlePdf417");
        this.stringAdapter.toJson(writer, value_.getTitlePdf417());
        writer.name("titlePassportSignature");
        this.stringAdapter.toJson(writer, value_.getTitlePassportSignature());
        writer.name("descriptionFront");
        this.stringAdapter.toJson(writer, value_.getDescriptionFront());
        writer.name("descriptionBack");
        this.stringAdapter.toJson(writer, value_.getDescriptionBack());
        writer.name("descriptionPdf417");
        this.stringAdapter.toJson(writer, value_.getDescriptionPdf417());
        writer.name("descriptionPassportSignature");
        this.stringAdapter.toJson(writer, value_.getDescriptionPassportSignature());
        writer.name("confirmButtonText");
        this.stringAdapter.toJson(writer, value_.getConfirmButtonText());
        writer.name("chooseAnotherButtonText");
        this.stringAdapter.toJson(writer, value_.getChooseAnotherButtonText());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(60, "GeneratedJsonAdapter(NextStep.GovernmentId.ReviewUploadPage)");
    }
}
