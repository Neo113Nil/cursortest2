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

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_GovernmentId_CapturePageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CapturePage;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableStringAdapter", "", "stringAdapter", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NextStep_GovernmentId_CapturePageJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter stringAdapter;

    public NextStep_GovernmentId_CapturePageJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("title", "scanFront", "scanBack", "scanPdf417", "scanFrontOrBack", "scanSignature", "capturing", "confirmCapture", "disclaimer", "hintHoldStill", "hintLowLight", "btnHelp", "barcodeHelpModalTitle", "barcodeHelpModalPrompt", "barcodeHelpModalHints", "barcodeHelpModalContinueBtn", "idFrontHelpModalTitle", "idFrontHelpModalPrompt", "idFrontHelpModalHintsMobile", "idFrontHelpModalContinueBtn", "idBackHelpModalTitle", "idBackHelpModalPrompt", "idBackHelpModalHintsMobile", "idBackHelpModalContinueBtn", "staticCaptureTipsTitle", "staticCaptureTipsSubtext");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "scanFront");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NextStep.GovernmentId.CapturePage fromJson(JsonReader reader) {
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
        String str20 = null;
        String str21 = null;
        String str22 = null;
        String str23 = null;
        String str24 = null;
        String str25 = null;
        String str26 = null;
        while (true) {
            String str27 = str;
            String str28 = str2;
            String str29 = str3;
            String str30 = str4;
            String str31 = str5;
            if (!reader.hasNext()) {
                String str32 = str6;
                reader.endObject();
                if (str28 == null) {
                    throw Util.missingProperty("scanFront", "scanFront", reader);
                }
                if (str29 == null) {
                    throw Util.missingProperty("scanBack", "scanBack", reader);
                }
                if (str30 == null) {
                    throw Util.missingProperty("scanPdf417", "scanPdf417", reader);
                }
                if (str31 == null) {
                    throw Util.missingProperty("scanFrontOrBack", "scanFrontOrBack", reader);
                }
                if (str32 == null) {
                    throw Util.missingProperty("scanSignature", "scanSignature", reader);
                }
                if (str7 == null) {
                    throw Util.missingProperty("capturing", "capturing", reader);
                }
                if (str8 != null) {
                    return new NextStep.GovernmentId.CapturePage(str27, str28, str29, str30, str31, str32, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26);
                }
                throw Util.missingProperty("confirmCapture", "confirmCapture", reader);
            }
            String str33 = str6;
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    str6 = str33;
                    str = str27;
                    str2 = str28;
                    str3 = str29;
                    str4 = str30;
                    str5 = str31;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    str6 = str33;
                    str2 = str28;
                    str3 = str29;
                    str4 = str30;
                    str5 = str31;
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("scanFront", "scanFront", reader);
                    }
                    str6 = str33;
                    str = str27;
                    str3 = str29;
                    str4 = str30;
                    str5 = str31;
                case 2:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("scanBack", "scanBack", reader);
                    }
                    str6 = str33;
                    str = str27;
                    str2 = str28;
                    str4 = str30;
                    str5 = str31;
                case 3:
                    str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("scanPdf417", "scanPdf417", reader);
                    }
                    str6 = str33;
                    str = str27;
                    str2 = str28;
                    str3 = str29;
                    str5 = str31;
                case 4:
                    str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw Util.unexpectedNull("scanFrontOrBack", "scanFrontOrBack", reader);
                    }
                    str6 = str33;
                    str = str27;
                    str2 = str28;
                    str3 = str29;
                    str4 = str30;
                case 5:
                    str6 = (String) this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        throw Util.unexpectedNull("scanSignature", "scanSignature", reader);
                    }
                    str = str27;
                    str2 = str28;
                    str3 = str29;
                    str4 = str30;
                    str5 = str31;
                case 6:
                    str7 = (String) this.stringAdapter.fromJson(reader);
                    if (str7 == null) {
                        throw Util.unexpectedNull("capturing", "capturing", reader);
                    }
                    str6 = str33;
                    str = str27;
                    str2 = str28;
                    str3 = str29;
                    str4 = str30;
                    str5 = str31;
                case 7:
                    str8 = (String) this.stringAdapter.fromJson(reader);
                    if (str8 == null) {
                        throw Util.unexpectedNull("confirmCapture", "confirmCapture", reader);
                    }
                    str6 = str33;
                    str = str27;
                    str2 = str28;
                    str3 = str29;
                    str4 = str30;
                    str5 = str31;
                case 8:
                    str9 = (String) this.nullableStringAdapter.fromJson(reader);
                    str6 = str33;
                    str = str27;
                    str2 = str28;
                    str3 = str29;
                    str4 = str30;
                    str5 = str31;
                case 9:
                    str10 = (String) this.nullableStringAdapter.fromJson(reader);
                    str6 = str33;
                    str = str27;
                    str2 = str28;
                    str3 = str29;
                    str4 = str30;
                    str5 = str31;
                case 10:
                    str11 = (String) this.nullableStringAdapter.fromJson(reader);
                    str6 = str33;
                    str = str27;
                    str2 = str28;
                    str3 = str29;
                    str4 = str30;
                    str5 = str31;
                case 11:
                    str12 = (String) this.nullableStringAdapter.fromJson(reader);
                    str6 = str33;
                    str = str27;
                    str2 = str28;
                    str3 = str29;
                    str4 = str30;
                    str5 = str31;
                case 12:
                    str13 = (String) this.nullableStringAdapter.fromJson(reader);
                    str6 = str33;
                    str = str27;
                    str2 = str28;
                    str3 = str29;
                    str4 = str30;
                    str5 = str31;
                case 13:
                    str14 = (String) this.nullableStringAdapter.fromJson(reader);
                    str6 = str33;
                    str = str27;
                    str2 = str28;
                    str3 = str29;
                    str4 = str30;
                    str5 = str31;
                case 14:
                    str15 = (String) this.nullableStringAdapter.fromJson(reader);
                    str6 = str33;
                    str = str27;
                    str2 = str28;
                    str3 = str29;
                    str4 = str30;
                    str5 = str31;
                case 15:
                    str16 = (String) this.nullableStringAdapter.fromJson(reader);
                    str6 = str33;
                    str = str27;
                    str2 = str28;
                    str3 = str29;
                    str4 = str30;
                    str5 = str31;
                case 16:
                    str17 = (String) this.nullableStringAdapter.fromJson(reader);
                    str6 = str33;
                    str = str27;
                    str2 = str28;
                    str3 = str29;
                    str4 = str30;
                    str5 = str31;
                case 17:
                    str18 = (String) this.nullableStringAdapter.fromJson(reader);
                    str6 = str33;
                    str = str27;
                    str2 = str28;
                    str3 = str29;
                    str4 = str30;
                    str5 = str31;
                case 18:
                    str19 = (String) this.nullableStringAdapter.fromJson(reader);
                    str6 = str33;
                    str = str27;
                    str2 = str28;
                    str3 = str29;
                    str4 = str30;
                    str5 = str31;
                case 19:
                    str20 = (String) this.nullableStringAdapter.fromJson(reader);
                    str6 = str33;
                    str = str27;
                    str2 = str28;
                    str3 = str29;
                    str4 = str30;
                    str5 = str31;
                case 20:
                    str21 = (String) this.nullableStringAdapter.fromJson(reader);
                    str6 = str33;
                    str = str27;
                    str2 = str28;
                    str3 = str29;
                    str4 = str30;
                    str5 = str31;
                case 21:
                    str22 = (String) this.nullableStringAdapter.fromJson(reader);
                    str6 = str33;
                    str = str27;
                    str2 = str28;
                    str3 = str29;
                    str4 = str30;
                    str5 = str31;
                case 22:
                    str23 = (String) this.nullableStringAdapter.fromJson(reader);
                    str6 = str33;
                    str = str27;
                    str2 = str28;
                    str3 = str29;
                    str4 = str30;
                    str5 = str31;
                case 23:
                    str24 = (String) this.nullableStringAdapter.fromJson(reader);
                    str6 = str33;
                    str = str27;
                    str2 = str28;
                    str3 = str29;
                    str4 = str30;
                    str5 = str31;
                case 24:
                    str25 = (String) this.nullableStringAdapter.fromJson(reader);
                    str6 = str33;
                    str = str27;
                    str2 = str28;
                    str3 = str29;
                    str4 = str30;
                    str5 = str31;
                case 25:
                    str26 = (String) this.nullableStringAdapter.fromJson(reader);
                    str6 = str33;
                    str = str27;
                    str2 = str28;
                    str3 = str29;
                    str4 = str30;
                    str5 = str31;
                default:
                    str6 = str33;
                    str = str27;
                    str2 = str28;
                    str3 = str29;
                    str4 = str30;
                    str5 = str31;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, NextStep.GovernmentId.CapturePage value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("title");
        this.nullableStringAdapter.toJson(writer, value_.getTitle());
        writer.name("scanFront");
        this.stringAdapter.toJson(writer, value_.getScanFront());
        writer.name("scanBack");
        this.stringAdapter.toJson(writer, value_.getScanBack());
        writer.name("scanPdf417");
        this.stringAdapter.toJson(writer, value_.getScanPdf417());
        writer.name("scanFrontOrBack");
        this.stringAdapter.toJson(writer, value_.getScanFrontOrBack());
        writer.name("scanSignature");
        this.stringAdapter.toJson(writer, value_.getScanSignature());
        writer.name("capturing");
        this.stringAdapter.toJson(writer, value_.getCapturing());
        writer.name("confirmCapture");
        this.stringAdapter.toJson(writer, value_.getConfirmCapture());
        writer.name("disclaimer");
        this.nullableStringAdapter.toJson(writer, value_.getDisclaimer());
        writer.name("hintHoldStill");
        this.nullableStringAdapter.toJson(writer, value_.getHintHoldStill());
        writer.name("hintLowLight");
        this.nullableStringAdapter.toJson(writer, value_.getHintLowLight());
        writer.name("btnHelp");
        this.nullableStringAdapter.toJson(writer, value_.getBtnHelp());
        writer.name("barcodeHelpModalTitle");
        this.nullableStringAdapter.toJson(writer, value_.getBarcodeHelpModalTitle());
        writer.name("barcodeHelpModalPrompt");
        this.nullableStringAdapter.toJson(writer, value_.getBarcodeHelpModalPrompt());
        writer.name("barcodeHelpModalHints");
        this.nullableStringAdapter.toJson(writer, value_.getBarcodeHelpModalHints());
        writer.name("barcodeHelpModalContinueBtn");
        this.nullableStringAdapter.toJson(writer, value_.getBarcodeHelpModalContinueBtn());
        writer.name("idFrontHelpModalTitle");
        this.nullableStringAdapter.toJson(writer, value_.getIdFrontHelpModalTitle());
        writer.name("idFrontHelpModalPrompt");
        this.nullableStringAdapter.toJson(writer, value_.getIdFrontHelpModalPrompt());
        writer.name("idFrontHelpModalHintsMobile");
        this.nullableStringAdapter.toJson(writer, value_.getIdFrontHelpModalHintsMobile());
        writer.name("idFrontHelpModalContinueBtn");
        this.nullableStringAdapter.toJson(writer, value_.getIdFrontHelpModalContinueBtn());
        writer.name("idBackHelpModalTitle");
        this.nullableStringAdapter.toJson(writer, value_.getIdBackHelpModalTitle());
        writer.name("idBackHelpModalPrompt");
        this.nullableStringAdapter.toJson(writer, value_.getIdBackHelpModalPrompt());
        writer.name("idBackHelpModalHintsMobile");
        this.nullableStringAdapter.toJson(writer, value_.getIdBackHelpModalHintsMobile());
        writer.name("idBackHelpModalContinueBtn");
        this.nullableStringAdapter.toJson(writer, value_.getIdBackHelpModalContinueBtn());
        writer.name("staticCaptureTipsTitle");
        this.nullableStringAdapter.toJson(writer, value_.getStaticCaptureTipsTitle());
        writer.name("staticCaptureTipsSubtext");
        this.nullableStringAdapter.toJson(writer, value_.getStaticCaptureTipsSubtext());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(55, "GeneratedJsonAdapter(NextStep.GovernmentId.CapturePage)");
    }
}
