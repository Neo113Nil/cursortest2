package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0016\u001a\u00020\fH\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan_AttributesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "nullableJsonLogicBooleanAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "nullableStringAdapter", "", "nullableListOfDataGroupTypesAdapter", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$DataGroupTypes;", "nullableBooleanAdapter", "", "nullableListOfScanHintAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$ScanHint;", "nullableTipsButtonLocationAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$TipsButtonLocation;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GovernmentIdNfcScan_AttributesJsonAdapter extends JsonAdapter {
    private final JsonAdapter nullableBooleanAdapter;
    private final JsonAdapter nullableJsonLogicBooleanAdapter;
    private final JsonAdapter nullableListOfDataGroupTypesAdapter;
    private final JsonAdapter nullableListOfScanHintAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonAdapter nullableTipsButtonLocationAdapter;
    private final JsonReader.Options options;

    public GovernmentIdNfcScan_AttributesJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("hidden", "disabled", "documentNumberLabel", "prefillCardAccessNumber", "prefillDocumentNumber", "dateOfBirthLabel", "prefillDateOfBirth", "cardAccessNumberLabel", "expirationDateLabel", "prefillExpirationDate", "launchButtonText", "scanDocumentPrompt", "scanDocumentPromptTitle", "scanDocumentSuccess", "scanDocumentSuccessTitle", "enabledDataGroups", "authenticating", "authenticatingTitle", "reading", "readingTitle", "requiredText", "scanDocumentError", "enableNfcPrompt", "authenticationErrorPrompt", "hidePrefilledInputs", "connectionLostPrompt", "unsupportedDocumentType", "retryError", "scanHints", "hintsSheetTitle", "closeHintSheetButtonText", "userUnableToScanHintSheetButtonText", "errorModalChipNotDetectedTitle", "errorModalChipNotDetectedText", "errorModalLostConnectionTitle", "errorModalLostConnectionText", "errorModalIncorrectIdDetailsTitle", "errorModalIncorrectIdDetailsText", "errorModalGenericErrorTitle", "errorModalGenericErrorText", "errorModalTryAgainButtonText", "errorModalTroubleshootingTipsButtonText", "errorModalReenterIdDetailsButtonText", "rescanDocumentPrompt", "successfulScanTransitionComponentName", "unableToScanTransitionComponentName", "incorrectIdDetailsTransitionComponentName", "tipsButtonLocation");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableJsonLogicBooleanAdapter = moshi.adapter(JsonLogicBoolean.class, emptySet, "hidden");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "documentNumberLabel");
        this.nullableListOfDataGroupTypesAdapter = moshi.adapter(Types.newParameterizedType(List.class, GovernmentIdNfcScan.DataGroupTypes.class), emptySet, "enabledDataGroups");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "hidePrefilledInputs");
        this.nullableListOfScanHintAdapter = moshi.adapter(Types.newParameterizedType(List.class, GovernmentIdNfcScan.ScanHint.class), emptySet, "scanHints");
        this.nullableTipsButtonLocationAdapter = moshi.adapter(GovernmentIdNfcScan.TipsButtonLocation.class, emptySet, "tipsButtonLocation");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public GovernmentIdNfcScan.Attributes fromJson(JsonReader reader) {
        reader.getClass();
        reader.beginObject();
        JsonLogicBoolean jsonLogicBoolean = null;
        JsonLogicBoolean jsonLogicBoolean2 = null;
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
        List list = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        String str19 = null;
        String str20 = null;
        String str21 = null;
        Boolean bool = null;
        String str22 = null;
        String str23 = null;
        String str24 = null;
        List list2 = null;
        String str25 = null;
        String str26 = null;
        String str27 = null;
        String str28 = null;
        String str29 = null;
        String str30 = null;
        String str31 = null;
        String str32 = null;
        String str33 = null;
        String str34 = null;
        String str35 = null;
        String str36 = null;
        String str37 = null;
        String str38 = null;
        String str39 = null;
        String str40 = null;
        String str41 = null;
        String str42 = null;
        GovernmentIdNfcScan.TipsButtonLocation tipsButtonLocation = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    jsonLogicBoolean = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                    break;
                case 1:
                    jsonLogicBoolean2 = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                    break;
                case 2:
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    str2 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    str3 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    str4 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    str5 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 7:
                    str6 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 8:
                    str7 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 9:
                    str8 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 10:
                    str9 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 11:
                    str10 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 12:
                    str11 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 13:
                    str12 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 14:
                    str13 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 15:
                    list = (List) this.nullableListOfDataGroupTypesAdapter.fromJson(reader);
                    break;
                case 16:
                    str14 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 17:
                    str15 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 18:
                    str16 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 19:
                    str17 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 20:
                    str18 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 21:
                    str19 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 22:
                    str20 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 23:
                    str21 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 24:
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 25:
                    str22 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 26:
                    str23 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 27:
                    str24 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 28:
                    list2 = (List) this.nullableListOfScanHintAdapter.fromJson(reader);
                    break;
                case 29:
                    str25 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 30:
                    str26 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 31:
                    str27 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 32:
                    str28 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 33:
                    str29 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 34:
                    str30 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 35:
                    str31 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 36:
                    str32 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 37:
                    str33 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 38:
                    str34 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 39:
                    str35 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 40:
                    str36 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 41:
                    str37 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 42:
                    str38 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 43:
                    str39 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 44:
                    str40 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 45:
                    str41 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 46:
                    str42 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 47:
                    tipsButtonLocation = (GovernmentIdNfcScan.TipsButtonLocation) this.nullableTipsButtonLocationAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new GovernmentIdNfcScan.Attributes(jsonLogicBoolean, jsonLogicBoolean2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, list, str14, str15, str16, str17, str18, str19, str20, str21, bool, str22, str23, str24, list2, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, tipsButtonLocation);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, GovernmentIdNfcScan.Attributes value_) {
        writer.getClass();
        if (value_ == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        writer.beginObject();
        writer.name("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getHidden());
        writer.name("disabled");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getDisabled());
        writer.name("documentNumberLabel");
        this.nullableStringAdapter.toJson(writer, value_.getDocumentNumberLabel());
        writer.name("prefillCardAccessNumber");
        this.nullableStringAdapter.toJson(writer, value_.getPrefillCardAccessNumber());
        writer.name("prefillDocumentNumber");
        this.nullableStringAdapter.toJson(writer, value_.getPrefillDocumentNumber());
        writer.name("dateOfBirthLabel");
        this.nullableStringAdapter.toJson(writer, value_.getDateOfBirthLabel());
        writer.name("prefillDateOfBirth");
        this.nullableStringAdapter.toJson(writer, value_.getPrefillDateOfBirth());
        writer.name("cardAccessNumberLabel");
        this.nullableStringAdapter.toJson(writer, value_.getCardAccessNumberLabel());
        writer.name("expirationDateLabel");
        this.nullableStringAdapter.toJson(writer, value_.getExpirationDateLabel());
        writer.name("prefillExpirationDate");
        this.nullableStringAdapter.toJson(writer, value_.getPrefillExpirationDate());
        writer.name("launchButtonText");
        this.nullableStringAdapter.toJson(writer, value_.getLaunchButtonText());
        writer.name("scanDocumentPrompt");
        this.nullableStringAdapter.toJson(writer, value_.getScanDocumentPrompt());
        writer.name("scanDocumentPromptTitle");
        this.nullableStringAdapter.toJson(writer, value_.getScanDocumentPromptTitle());
        writer.name("scanDocumentSuccess");
        this.nullableStringAdapter.toJson(writer, value_.getScanDocumentSuccess());
        writer.name("scanDocumentSuccessTitle");
        this.nullableStringAdapter.toJson(writer, value_.getScanDocumentSuccessTitle());
        writer.name("enabledDataGroups");
        this.nullableListOfDataGroupTypesAdapter.toJson(writer, value_.getEnabledDataGroups());
        writer.name("authenticating");
        this.nullableStringAdapter.toJson(writer, value_.getAuthenticating());
        writer.name("authenticatingTitle");
        this.nullableStringAdapter.toJson(writer, value_.getAuthenticatingTitle());
        writer.name("reading");
        this.nullableStringAdapter.toJson(writer, value_.getReading());
        writer.name("readingTitle");
        this.nullableStringAdapter.toJson(writer, value_.getReadingTitle());
        writer.name("requiredText");
        this.nullableStringAdapter.toJson(writer, value_.getRequiredText());
        writer.name("scanDocumentError");
        this.nullableStringAdapter.toJson(writer, value_.getScanDocumentError());
        writer.name("enableNfcPrompt");
        this.nullableStringAdapter.toJson(writer, value_.getEnableNfcPrompt());
        writer.name("authenticationErrorPrompt");
        this.nullableStringAdapter.toJson(writer, value_.getAuthenticationErrorPrompt());
        writer.name("hidePrefilledInputs");
        this.nullableBooleanAdapter.toJson(writer, value_.getHidePrefilledInputs());
        writer.name("connectionLostPrompt");
        this.nullableStringAdapter.toJson(writer, value_.getConnectionLostPrompt());
        writer.name("unsupportedDocumentType");
        this.nullableStringAdapter.toJson(writer, value_.getUnsupportedDocumentType());
        writer.name("retryError");
        this.nullableStringAdapter.toJson(writer, value_.getRetryError());
        writer.name("scanHints");
        this.nullableListOfScanHintAdapter.toJson(writer, value_.getScanHints());
        writer.name("hintsSheetTitle");
        this.nullableStringAdapter.toJson(writer, value_.getHintsSheetTitle());
        writer.name("closeHintSheetButtonText");
        this.nullableStringAdapter.toJson(writer, value_.getCloseHintSheetButtonText());
        writer.name("userUnableToScanHintSheetButtonText");
        this.nullableStringAdapter.toJson(writer, value_.getUserUnableToScanHintSheetButtonText());
        writer.name("errorModalChipNotDetectedTitle");
        this.nullableStringAdapter.toJson(writer, value_.getErrorModalChipNotDetectedTitle());
        writer.name("errorModalChipNotDetectedText");
        this.nullableStringAdapter.toJson(writer, value_.getErrorModalChipNotDetectedText());
        writer.name("errorModalLostConnectionTitle");
        this.nullableStringAdapter.toJson(writer, value_.getErrorModalLostConnectionTitle());
        writer.name("errorModalLostConnectionText");
        this.nullableStringAdapter.toJson(writer, value_.getErrorModalLostConnectionText());
        writer.name("errorModalIncorrectIdDetailsTitle");
        this.nullableStringAdapter.toJson(writer, value_.getErrorModalIncorrectIdDetailsTitle());
        writer.name("errorModalIncorrectIdDetailsText");
        this.nullableStringAdapter.toJson(writer, value_.getErrorModalIncorrectIdDetailsText());
        writer.name("errorModalGenericErrorTitle");
        this.nullableStringAdapter.toJson(writer, value_.getErrorModalGenericErrorTitle());
        writer.name("errorModalGenericErrorText");
        this.nullableStringAdapter.toJson(writer, value_.getErrorModalGenericErrorText());
        writer.name("errorModalTryAgainButtonText");
        this.nullableStringAdapter.toJson(writer, value_.getErrorModalTryAgainButtonText());
        writer.name("errorModalTroubleshootingTipsButtonText");
        this.nullableStringAdapter.toJson(writer, value_.getErrorModalTroubleshootingTipsButtonText());
        writer.name("errorModalReenterIdDetailsButtonText");
        this.nullableStringAdapter.toJson(writer, value_.getErrorModalReenterIdDetailsButtonText());
        writer.name("rescanDocumentPrompt");
        this.nullableStringAdapter.toJson(writer, value_.getRescanDocumentPrompt());
        writer.name("successfulScanTransitionComponentName");
        this.nullableStringAdapter.toJson(writer, value_.getSuccessfulScanTransitionComponentName());
        writer.name("unableToScanTransitionComponentName");
        this.nullableStringAdapter.toJson(writer, value_.getUnableToScanTransitionComponentName());
        writer.name("incorrectIdDetailsTransitionComponentName");
        this.nullableStringAdapter.toJson(writer, value_.getIncorrectIdDetailsTransitionComponentName());
        writer.name("tipsButtonLocation");
        this.nullableTipsButtonLocationAdapter.toJson(writer, value_.getTipsButtonLocation());
        writer.endObject();
    }

    public String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(52, "GeneratedJsonAdapter(GovernmentIdNfcScan.Attributes)");
    }
}
