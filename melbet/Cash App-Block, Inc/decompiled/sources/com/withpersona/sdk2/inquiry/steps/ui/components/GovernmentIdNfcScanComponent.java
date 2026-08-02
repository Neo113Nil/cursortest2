package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.R;
import com.squareup.moshi.Json;
import com.squareup.workflow1.ui.TextControllerImpl;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import com.withpersona.sdk2.inquiry.steps.ui.components.helpbottomsheet.HelpBottomSheetViewModel;
import com.withpersona.sdk2.inquiry.steps.ui.components.helpbottomsheet.HelpPagerItem;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.GovernmentIdNfcData;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.noties.markwon.MarkwonConfiguration;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005R(\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010\b\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u000f\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010\b\u0012\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\fR(\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u001b\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001b\u0010\u0015\u0012\u0004\b\u001e\u0010\u000e\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R(\u0010\u001f\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001f\u0010\b\u0012\u0004\b\"\u0010\u000e\u001a\u0004\b \u0010\n\"\u0004\b!\u0010\f¨\u0006#"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/DisableableComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/HideableComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/LoadingIndicatorComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/HelpBottomSheetComponent;", "Lcom/squareup/workflow1/ui/TextControllerImpl;", "cardAccessNumberController", "Lcom/squareup/workflow1/ui/TextControllerImpl;", "getCardAccessNumberController", "()Lcom/squareup/workflow1/ui/TextControllerImpl;", "setCardAccessNumberController", "(Lcom/squareup/workflow1/ui/TextControllerImpl;)V", "getCardAccessNumberController$annotations", "()V", "documentNumberController", "getDocumentNumberController", "setDocumentNumberController", "getDocumentNumberController$annotations", "Lio/noties/markwon/MarkwonConfiguration;", "dateOfBirthController", "Lio/noties/markwon/MarkwonConfiguration;", "getDateOfBirthController", "()Lio/noties/markwon/MarkwonConfiguration;", "setDateOfBirthController", "(Lio/noties/markwon/MarkwonConfiguration;)V", "getDateOfBirthController$annotations", "expirationDateController", "getExpirationDateController", "setExpirationDateController", "getExpirationDateController$annotations", "nfcDataController", "getNfcDataController", "setNfcDataController", "getNfcDataController$annotations", "ui-step-renderer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class GovernmentIdNfcScanComponent implements UiComponent, DisableableComponent, HideableComponent, LoadingIndicatorComponent, HelpBottomSheetComponent {
    public static final Parcelable.Creator<GovernmentIdNfcScanComponent> CREATOR = new Option.Creator(8);
    public final ArrayList associatedViews;
    public final String cardAccessNumber;
    public TextControllerImpl cardAccessNumberController;
    public final GovernmentIdNfcScan config;
    public final String dateOfBirth;
    public MarkwonConfiguration dateOfBirthController;
    public final JsonLogicBoolean disabled;
    public final String documentNumber;
    public TextControllerImpl documentNumberController;
    public final String expirationDate;
    public MarkwonConfiguration expirationDateController;
    public final GovernmentIdNfcData governmentIdNfcData;
    public final JsonLogicBoolean hidden;
    public final String name;
    public TextControllerImpl nfcDataController;
    public boolean wasTapped;

    public GovernmentIdNfcScanComponent(String str, GovernmentIdNfcScan governmentIdNfcScan, String str2, String str3, String str4, String str5, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, GovernmentIdNfcData governmentIdNfcData) {
        str.getClass();
        governmentIdNfcScan.getClass();
        str2.getClass();
        str5.getClass();
        this.name = str;
        this.config = governmentIdNfcScan;
        this.documentNumber = str2;
        this.dateOfBirth = str3;
        this.expirationDate = str4;
        this.cardAccessNumber = str5;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.governmentIdNfcData = governmentIdNfcData;
        this.associatedViews = new ArrayList();
        this.cardAccessNumberController = new TextControllerImpl(str5);
        this.documentNumberController = new TextControllerImpl(str2);
        GovernmentIdNfcScan.Companion companion = GovernmentIdNfcScan.INSTANCE;
        this.dateOfBirthController = new MarkwonConfiguration(str3, (String) null, companion.generateTextMonths());
        this.expirationDateController = new MarkwonConfiguration(str4, (String) null, companion.generateTextMonths());
        this.nfcDataController = new TextControllerImpl(governmentIdNfcData);
    }

    public static GovernmentIdNfcScanComponent copy$default(GovernmentIdNfcScanComponent governmentIdNfcScanComponent, String str, String str2, String str3, String str4, GovernmentIdNfcData governmentIdNfcData, int i) {
        String str5 = governmentIdNfcScanComponent.name;
        GovernmentIdNfcScan governmentIdNfcScan = governmentIdNfcScanComponent.config;
        if ((i & 4) != 0) {
            str = governmentIdNfcScanComponent.documentNumber;
        }
        String str6 = str;
        if ((i & 8) != 0) {
            str2 = governmentIdNfcScanComponent.dateOfBirth;
        }
        String str7 = str2;
        if ((i & 16) != 0) {
            str3 = governmentIdNfcScanComponent.expirationDate;
        }
        String str8 = str3;
        if ((i & 32) != 0) {
            str4 = governmentIdNfcScanComponent.cardAccessNumber;
        }
        String str9 = str4;
        JsonLogicBoolean jsonLogicBoolean = governmentIdNfcScanComponent.hidden;
        JsonLogicBoolean jsonLogicBoolean2 = governmentIdNfcScanComponent.disabled;
        if ((i & 256) != 0) {
            governmentIdNfcData = governmentIdNfcScanComponent.governmentIdNfcData;
        }
        str5.getClass();
        governmentIdNfcScan.getClass();
        str6.getClass();
        str9.getClass();
        return new GovernmentIdNfcScanComponent(str5, governmentIdNfcScan, str6, str7, str8, str9, jsonLogicBoolean, jsonLogicBoolean2, governmentIdNfcData);
    }

    @Json(ignore = true)
    public static /* synthetic */ void getCardAccessNumberController$annotations() {
    }

    @Json(ignore = true)
    public static /* synthetic */ void getDateOfBirthController$annotations() {
    }

    @Json(ignore = true)
    public static /* synthetic */ void getDocumentNumberController$annotations() {
    }

    @Json(ignore = true)
    public static /* synthetic */ void getExpirationDateController$annotations() {
    }

    @Json(ignore = true)
    public static /* synthetic */ void getNfcDataController$annotations() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GovernmentIdNfcScanComponent)) {
            return false;
        }
        GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) obj;
        return Intrinsics.areEqual(this.name, governmentIdNfcScanComponent.name) && Intrinsics.areEqual(this.config, governmentIdNfcScanComponent.config) && Intrinsics.areEqual(this.documentNumber, governmentIdNfcScanComponent.documentNumber) && Intrinsics.areEqual(this.dateOfBirth, governmentIdNfcScanComponent.dateOfBirth) && Intrinsics.areEqual(this.expirationDate, governmentIdNfcScanComponent.expirationDate) && Intrinsics.areEqual(this.cardAccessNumber, governmentIdNfcScanComponent.cardAccessNumber) && Intrinsics.areEqual(this.hidden, governmentIdNfcScanComponent.hidden) && Intrinsics.areEqual(this.disabled, governmentIdNfcScanComponent.disabled) && Intrinsics.areEqual(this.governmentIdNfcData, governmentIdNfcScanComponent.governmentIdNfcData);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.HideableComponent
    public final ArrayList getAssociatedViews() {
        return this.associatedViews;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.DisableableComponent
    public final JsonLogicBoolean getDisabled() {
        return this.disabled;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.HideableComponent
    public final JsonLogicBoolean getHidden() {
        return this.hidden;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent
    public final String getName() {
        return this.name;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final HelpBottomSheetViewModel getViewModel() {
        List<GovernmentIdNfcScan.ScanHint> scanHints;
        Integer num;
        GovernmentIdNfcScan governmentIdNfcScan = this.config;
        GovernmentIdNfcScan.Attributes attributes = governmentIdNfcScan.getAttributes();
        if (attributes == null || (scanHints = attributes.getScanHints()) == null) {
            return null;
        }
        List<GovernmentIdNfcScan.ScanHint> list = scanHints;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (GovernmentIdNfcScan.ScanHint scanHint : list) {
            String hintType = scanHint.getHintType();
            hintType.getClass();
            switch (hintType.hashCode()) {
                case -1978532433:
                    if (hintType.equals("horizontal_passport_scan")) {
                        num = Integer.valueOf(R.raw.pi2_horizontal_passport_scan);
                        break;
                    }
                    num = null;
                    break;
                case -1956118531:
                    if (hintType.equals("isometric_id_under_scanner")) {
                        num = Integer.valueOf(R.raw.pi2_isometric_id_under_scanner);
                        break;
                    }
                    num = null;
                    break;
                case -1505169936:
                    if (hintType.equals("passport_front_back_outside")) {
                        num = Integer.valueOf(R.raw.pi2_passport_front_back_outside);
                        break;
                    }
                    num = null;
                    break;
                case -892663386:
                    if (hintType.equals("wallet_removal")) {
                        num = Integer.valueOf(R.raw.pi2_wallet_removal);
                        break;
                    }
                    num = null;
                    break;
                case -90829931:
                    if (hintType.equals("isometric_passport_front_inside")) {
                        num = Integer.valueOf(R.raw.pi2_isometric_passport_front_inside);
                        break;
                    }
                    num = null;
                    break;
                case 834032922:
                    if (hintType.equals("isometric_id_top_of_scanner")) {
                        num = Integer.valueOf(R.raw.pi2_isometric_id_top_of_scanner);
                        break;
                    }
                    num = null;
                    break;
                case 1158542641:
                    if (hintType.equals("isometric_passport_back_inside")) {
                        num = Integer.valueOf(R.raw.pi2_isometric_passport_back_inside);
                        break;
                    }
                    num = null;
                    break;
                case 1845234141:
                    if (hintType.equals("case_removal")) {
                        num = Integer.valueOf(R.raw.pi2_case_removal);
                        break;
                    }
                    num = null;
                    break;
                case 1981666600:
                    if (hintType.equals("passport_portrait")) {
                        num = Integer.valueOf(R.raw.pi2_passport_portrait);
                        break;
                    }
                    num = null;
                    break;
                default:
                    num = null;
                    break;
            }
            arrayList.add(new HelpPagerItem(num, scanHint.getHintText()));
        }
        GovernmentIdNfcScan.Attributes attributes2 = governmentIdNfcScan.getAttributes();
        String closeHintSheetButtonText = attributes2 != null ? attributes2.getCloseHintSheetButtonText() : null;
        GovernmentIdNfcScan.Attributes attributes3 = governmentIdNfcScan.getAttributes();
        String userUnableToScanHintSheetButtonText = attributes3 != null ? attributes3.getUserUnableToScanHintSheetButtonText() : null;
        GovernmentIdNfcScan.Attributes attributes4 = governmentIdNfcScan.getAttributes();
        return new HelpBottomSheetViewModel(closeHintSheetButtonText, userUnableToScanHintSheetButtonText, attributes4 != null ? attributes4.getUnableToScanTransitionComponentName() : null, arrayList, governmentIdNfcScan.getStyles());
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.config.hashCode() + (this.name.hashCode() * 31)) * 31, 31, this.documentNumber);
        String str = this.dateOfBirth;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.expirationDate;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.cardAccessNumber);
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int hashCode2 = (m2 + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int hashCode3 = (hashCode2 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
        GovernmentIdNfcData governmentIdNfcData = this.governmentIdNfcData;
        return hashCode3 + (governmentIdNfcData != null ? governmentIdNfcData.hashCode() : 0);
    }

    public final boolean isEnabled() {
        List<GovernmentIdNfcScan.ScanHint> scanHints;
        GovernmentIdNfcScan.TipsButtonLocation tipsButtonLocation;
        GovernmentIdNfcScan governmentIdNfcScan = this.config;
        GovernmentIdNfcScan.Attributes attributes = governmentIdNfcScan.getAttributes();
        if (attributes == null || (scanHints = attributes.getScanHints()) == null || !(!scanHints.isEmpty())) {
            return false;
        }
        GovernmentIdNfcScan.Attributes attributes2 = governmentIdNfcScan.getAttributes();
        if (attributes2 == null || (tipsButtonLocation = attributes2.getTipsButtonLocation()) == null) {
            tipsButtonLocation = GovernmentIdNfcScan.TipsButtonLocation.NavigationBar;
        }
        return tipsButtonLocation == GovernmentIdNfcScan.TipsButtonLocation.NavigationBar;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.LoadingIndicatorComponent
    public final void setWasTapped(boolean z) {
        this.wasTapped = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GovernmentIdNfcScanComponent(name=");
        sb.append(this.name);
        sb.append(", config=");
        sb.append(this.config);
        sb.append(", documentNumber=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.documentNumber, ", dateOfBirth=", this.dateOfBirth, ", expirationDate=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.expirationDate, ", cardAccessNumber=", this.cardAccessNumber, ", hidden=");
        sb.append(this.hidden);
        sb.append(", disabled=");
        sb.append(this.disabled);
        sb.append(", governmentIdNfcData=");
        sb.append(this.governmentIdNfcData);
        sb.append(")");
        return sb.toString();
    }

    public final GovernmentIdNfcScanComponent updateCardAccessNumber(String str) {
        str.getClass();
        GovernmentIdNfcScanComponent copy$default = copy$default(this, null, null, null, str, null, 479);
        copy$default.cardAccessNumberController = this.cardAccessNumberController;
        copy$default.documentNumberController = this.documentNumberController;
        copy$default.dateOfBirthController = this.dateOfBirthController;
        copy$default.expirationDateController = this.expirationDateController;
        copy$default.nfcDataController = this.nfcDataController;
        return copy$default;
    }

    public final GovernmentIdNfcScanComponent updateDateOfBirth(String str) {
        GovernmentIdNfcScanComponent copy$default = copy$default(this, null, str, null, null, null, 503);
        copy$default.cardAccessNumberController = this.cardAccessNumberController;
        copy$default.documentNumberController = this.documentNumberController;
        copy$default.dateOfBirthController = this.dateOfBirthController;
        copy$default.expirationDateController = this.expirationDateController;
        copy$default.nfcDataController = this.nfcDataController;
        return copy$default;
    }

    public final GovernmentIdNfcScanComponent updateDocumentNumber(String str) {
        str.getClass();
        GovernmentIdNfcScanComponent copy$default = copy$default(this, str, null, null, null, null, 507);
        copy$default.cardAccessNumberController = this.cardAccessNumberController;
        copy$default.documentNumberController = this.documentNumberController;
        copy$default.dateOfBirthController = this.dateOfBirthController;
        copy$default.expirationDateController = this.expirationDateController;
        copy$default.nfcDataController = this.nfcDataController;
        return copy$default;
    }

    public final GovernmentIdNfcScanComponent updateExpirationDate(String str) {
        GovernmentIdNfcScanComponent copy$default = copy$default(this, null, null, str, null, null, 495);
        copy$default.cardAccessNumberController = this.cardAccessNumberController;
        copy$default.documentNumberController = this.documentNumberController;
        copy$default.dateOfBirthController = this.dateOfBirthController;
        copy$default.expirationDateController = this.expirationDateController;
        copy$default.nfcDataController = this.nfcDataController;
        return copy$default;
    }

    public final GovernmentIdNfcScanComponent updateNfcData(GovernmentIdNfcData governmentIdNfcData) {
        GovernmentIdNfcScanComponent copy$default = copy$default(this, null, null, null, null, governmentIdNfcData, 255);
        copy$default.cardAccessNumberController = this.cardAccessNumberController;
        copy$default.documentNumberController = this.documentNumberController;
        copy$default.dateOfBirthController = this.dateOfBirthController;
        copy$default.expirationDateController = this.expirationDateController;
        copy$default.nfcDataController = this.nfcDataController;
        return copy$default;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.name);
        parcel.writeParcelable(this.config, i);
        parcel.writeString(this.documentNumber);
        parcel.writeString(this.dateOfBirth);
        parcel.writeString(this.expirationDate);
        parcel.writeString(this.cardAccessNumber);
        parcel.writeParcelable(this.hidden, i);
        parcel.writeParcelable(this.disabled, i);
        GovernmentIdNfcData governmentIdNfcData = this.governmentIdNfcData;
        if (governmentIdNfcData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            governmentIdNfcData.writeToParcel(parcel, i);
        }
    }
}
