package com.withpersona.sdk2.inquiry.nfc;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.withpersona.sdk2.inquiry.nfc.MrzKey;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class PassportNfcStrings implements Parcelable {
    public static final Parcelable.Creator<PassportNfcStrings> CREATOR = new MrzKey.Creator(29);
    public final String authenticatingDescription;
    public final String authenticatingTitle;
    public final String authenticationErrorConfirmButtonText;
    public final String authenticationErrorText;
    public final String cancelNfcScan;
    public final String connectionLostConfirmButtonText;
    public final String connectionLostText;
    public final String enablePassportNfcCancelButtonText;
    public final String enablePassportNfcConfirmButtonText;
    public final String enablePassportNfcText;
    public final String errorModalChipNotDetectedText;
    public final String errorModalChipNotDetectedTitle;
    public final String errorModalGenericErrorText;
    public final String errorModalGenericErrorTitle;
    public final String errorModalIncorrectIdDetailsText;
    public final String errorModalIncorrectIdDetailsTitle;
    public final String errorModalLostConnectionText;
    public final String errorModalLostConnectionTitle;
    public final String errorModalReenterIdDetailsButtonText;
    public final String errorModalTroubleshootingTipsButtonText;
    public final String errorModalTryAgainButtonText;
    public final String genericErrorConfirmButtonText;
    public final String genericErrorText;
    public final String incorrectIdDetailsTransitionComponentName;
    public final String nfcScanPromptDescription;
    public final String nfcScanPromptTitle;
    public final String nfcScanSuccessDescription;
    public final String nfcScanSuccessTitle;
    public final String readingDescription;
    public final String readingTitle;
    public final String rescanDocumentPromptDescription;
    public final String rescanDocumentPromptTitle;
    public final String successfulScanTransitionComponentName;
    public final String unableToScanTransitionComponentName;

    public PassportNfcStrings(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34) {
        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, str7, str8, str9, str10);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(str11, str12, str13, str14, str15);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(str16, str17, str18, str19, str20);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(str21, str22, str23, str24, str25);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(str26, str27, str28, str29, str30);
        Request$Priority$EnumUnboxingLocalUtility.m(str31, str32, str33, str34);
        this.nfcScanPromptTitle = str;
        this.nfcScanPromptDescription = str2;
        this.authenticatingDescription = str3;
        this.authenticatingTitle = str4;
        this.readingDescription = str5;
        this.readingTitle = str6;
        this.cancelNfcScan = str7;
        this.nfcScanSuccessTitle = str8;
        this.nfcScanSuccessDescription = str9;
        this.enablePassportNfcText = str10;
        this.enablePassportNfcConfirmButtonText = str11;
        this.enablePassportNfcCancelButtonText = str12;
        this.connectionLostText = str13;
        this.connectionLostConfirmButtonText = str14;
        this.authenticationErrorText = str15;
        this.authenticationErrorConfirmButtonText = str16;
        this.genericErrorText = str17;
        this.genericErrorConfirmButtonText = str18;
        this.errorModalChipNotDetectedTitle = str19;
        this.errorModalChipNotDetectedText = str20;
        this.errorModalLostConnectionTitle = str21;
        this.errorModalLostConnectionText = str22;
        this.errorModalIncorrectIdDetailsTitle = str23;
        this.errorModalIncorrectIdDetailsText = str24;
        this.errorModalGenericErrorTitle = str25;
        this.errorModalGenericErrorText = str26;
        this.errorModalTryAgainButtonText = str27;
        this.errorModalTroubleshootingTipsButtonText = str28;
        this.errorModalReenterIdDetailsButtonText = str29;
        this.rescanDocumentPromptTitle = str30;
        this.rescanDocumentPromptDescription = str31;
        this.successfulScanTransitionComponentName = str32;
        this.unableToScanTransitionComponentName = str33;
        this.incorrectIdDetailsTransitionComponentName = str34;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassportNfcStrings)) {
            return false;
        }
        PassportNfcStrings passportNfcStrings = (PassportNfcStrings) obj;
        return Intrinsics.areEqual(this.nfcScanPromptTitle, passportNfcStrings.nfcScanPromptTitle) && Intrinsics.areEqual(this.nfcScanPromptDescription, passportNfcStrings.nfcScanPromptDescription) && Intrinsics.areEqual(this.authenticatingDescription, passportNfcStrings.authenticatingDescription) && Intrinsics.areEqual(this.authenticatingTitle, passportNfcStrings.authenticatingTitle) && Intrinsics.areEqual(this.readingDescription, passportNfcStrings.readingDescription) && Intrinsics.areEqual(this.readingTitle, passportNfcStrings.readingTitle) && Intrinsics.areEqual(this.cancelNfcScan, passportNfcStrings.cancelNfcScan) && Intrinsics.areEqual(this.nfcScanSuccessTitle, passportNfcStrings.nfcScanSuccessTitle) && Intrinsics.areEqual(this.nfcScanSuccessDescription, passportNfcStrings.nfcScanSuccessDescription) && Intrinsics.areEqual(this.enablePassportNfcText, passportNfcStrings.enablePassportNfcText) && Intrinsics.areEqual(this.enablePassportNfcConfirmButtonText, passportNfcStrings.enablePassportNfcConfirmButtonText) && Intrinsics.areEqual(this.enablePassportNfcCancelButtonText, passportNfcStrings.enablePassportNfcCancelButtonText) && Intrinsics.areEqual(this.connectionLostText, passportNfcStrings.connectionLostText) && Intrinsics.areEqual(this.connectionLostConfirmButtonText, passportNfcStrings.connectionLostConfirmButtonText) && Intrinsics.areEqual(this.authenticationErrorText, passportNfcStrings.authenticationErrorText) && Intrinsics.areEqual(this.authenticationErrorConfirmButtonText, passportNfcStrings.authenticationErrorConfirmButtonText) && Intrinsics.areEqual(this.genericErrorText, passportNfcStrings.genericErrorText) && Intrinsics.areEqual(this.genericErrorConfirmButtonText, passportNfcStrings.genericErrorConfirmButtonText) && Intrinsics.areEqual(this.errorModalChipNotDetectedTitle, passportNfcStrings.errorModalChipNotDetectedTitle) && Intrinsics.areEqual(this.errorModalChipNotDetectedText, passportNfcStrings.errorModalChipNotDetectedText) && Intrinsics.areEqual(this.errorModalLostConnectionTitle, passportNfcStrings.errorModalLostConnectionTitle) && Intrinsics.areEqual(this.errorModalLostConnectionText, passportNfcStrings.errorModalLostConnectionText) && Intrinsics.areEqual(this.errorModalIncorrectIdDetailsTitle, passportNfcStrings.errorModalIncorrectIdDetailsTitle) && Intrinsics.areEqual(this.errorModalIncorrectIdDetailsText, passportNfcStrings.errorModalIncorrectIdDetailsText) && Intrinsics.areEqual(this.errorModalGenericErrorTitle, passportNfcStrings.errorModalGenericErrorTitle) && Intrinsics.areEqual(this.errorModalGenericErrorText, passportNfcStrings.errorModalGenericErrorText) && Intrinsics.areEqual(this.errorModalTryAgainButtonText, passportNfcStrings.errorModalTryAgainButtonText) && Intrinsics.areEqual(this.errorModalTroubleshootingTipsButtonText, passportNfcStrings.errorModalTroubleshootingTipsButtonText) && Intrinsics.areEqual(this.errorModalReenterIdDetailsButtonText, passportNfcStrings.errorModalReenterIdDetailsButtonText) && Intrinsics.areEqual(this.rescanDocumentPromptTitle, passportNfcStrings.rescanDocumentPromptTitle) && Intrinsics.areEqual(this.rescanDocumentPromptDescription, passportNfcStrings.rescanDocumentPromptDescription) && Intrinsics.areEqual(this.successfulScanTransitionComponentName, passportNfcStrings.successfulScanTransitionComponentName) && Intrinsics.areEqual(this.unableToScanTransitionComponentName, passportNfcStrings.unableToScanTransitionComponentName) && Intrinsics.areEqual(this.incorrectIdDetailsTransitionComponentName, passportNfcStrings.incorrectIdDetailsTransitionComponentName);
    }

    public final int hashCode() {
        return this.incorrectIdDetailsTransitionComponentName.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.nfcScanPromptTitle.hashCode() * 31, 31, this.nfcScanPromptDescription), 31, this.authenticatingDescription), 31, this.authenticatingTitle), 31, this.readingDescription), 31, this.readingTitle), 31, this.cancelNfcScan), 31, this.nfcScanSuccessTitle), 31, this.nfcScanSuccessDescription), 31, this.enablePassportNfcText), 31, this.enablePassportNfcConfirmButtonText), 31, this.enablePassportNfcCancelButtonText), 31, this.connectionLostText), 31, this.connectionLostConfirmButtonText), 31, this.authenticationErrorText), 31, this.authenticationErrorConfirmButtonText), 31, this.genericErrorText), 31, this.genericErrorConfirmButtonText), 31, this.errorModalChipNotDetectedTitle), 31, this.errorModalChipNotDetectedText), 31, this.errorModalLostConnectionTitle), 31, this.errorModalLostConnectionText), 31, this.errorModalIncorrectIdDetailsTitle), 31, this.errorModalIncorrectIdDetailsText), 31, this.errorModalGenericErrorTitle), 31, this.errorModalGenericErrorText), 31, this.errorModalTryAgainButtonText), 31, this.errorModalTroubleshootingTipsButtonText), 31, this.errorModalReenterIdDetailsButtonText), 31, this.rescanDocumentPromptTitle), 31, this.rescanDocumentPromptDescription), 31, this.successfulScanTransitionComponentName), 31, this.unableToScanTransitionComponentName);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PassportNfcStrings(nfcScanPromptTitle=", this.nfcScanPromptTitle, ", nfcScanPromptDescription=", this.nfcScanPromptDescription, ", authenticatingDescription=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.authenticatingDescription, ", authenticatingTitle=", this.authenticatingTitle, ", readingDescription=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.readingDescription, ", readingTitle=", this.readingTitle, ", cancelNfcScan=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.cancelNfcScan, ", nfcScanSuccessTitle=", this.nfcScanSuccessTitle, ", nfcScanSuccessDescription=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.nfcScanSuccessDescription, ", enablePassportNfcText=", this.enablePassportNfcText, ", enablePassportNfcConfirmButtonText=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.enablePassportNfcConfirmButtonText, ", enablePassportNfcCancelButtonText=", this.enablePassportNfcCancelButtonText, ", connectionLostText=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.connectionLostText, ", connectionLostConfirmButtonText=", this.connectionLostConfirmButtonText, ", authenticationErrorText=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.authenticationErrorText, ", authenticationErrorConfirmButtonText=", this.authenticationErrorConfirmButtonText, ", genericErrorText=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.genericErrorText, ", genericErrorConfirmButtonText=", this.genericErrorConfirmButtonText, ", errorModalChipNotDetectedTitle=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.errorModalChipNotDetectedTitle, ", errorModalChipNotDetectedText=", this.errorModalChipNotDetectedText, ", errorModalLostConnectionTitle=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.errorModalLostConnectionTitle, ", errorModalLostConnectionText=", this.errorModalLostConnectionText, ", errorModalIncorrectIdDetailsTitle=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.errorModalIncorrectIdDetailsTitle, ", errorModalIncorrectIdDetailsText=", this.errorModalIncorrectIdDetailsText, ", errorModalGenericErrorTitle=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.errorModalGenericErrorTitle, ", errorModalGenericErrorText=", this.errorModalGenericErrorText, ", errorModalTryAgainButtonText=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.errorModalTryAgainButtonText, ", errorModalTroubleshootingTipsButtonText=", this.errorModalTroubleshootingTipsButtonText, ", errorModalReenterIdDetailsButtonText=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.errorModalReenterIdDetailsButtonText, ", rescanDocumentPromptTitle=", this.rescanDocumentPromptTitle, ", rescanDocumentPromptDescription=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.rescanDocumentPromptDescription, ", successfulScanTransitionComponentName=", this.successfulScanTransitionComponentName, ", unableToScanTransitionComponentName=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.unableToScanTransitionComponentName, ", incorrectIdDetailsTransitionComponentName=", this.incorrectIdDetailsTransitionComponentName, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.nfcScanPromptTitle);
        parcel.writeString(this.nfcScanPromptDescription);
        parcel.writeString(this.authenticatingDescription);
        parcel.writeString(this.authenticatingTitle);
        parcel.writeString(this.readingDescription);
        parcel.writeString(this.readingTitle);
        parcel.writeString(this.cancelNfcScan);
        parcel.writeString(this.nfcScanSuccessTitle);
        parcel.writeString(this.nfcScanSuccessDescription);
        parcel.writeString(this.enablePassportNfcText);
        parcel.writeString(this.enablePassportNfcConfirmButtonText);
        parcel.writeString(this.enablePassportNfcCancelButtonText);
        parcel.writeString(this.connectionLostText);
        parcel.writeString(this.connectionLostConfirmButtonText);
        parcel.writeString(this.authenticationErrorText);
        parcel.writeString(this.authenticationErrorConfirmButtonText);
        parcel.writeString(this.genericErrorText);
        parcel.writeString(this.genericErrorConfirmButtonText);
        parcel.writeString(this.errorModalChipNotDetectedTitle);
        parcel.writeString(this.errorModalChipNotDetectedText);
        parcel.writeString(this.errorModalLostConnectionTitle);
        parcel.writeString(this.errorModalLostConnectionText);
        parcel.writeString(this.errorModalIncorrectIdDetailsTitle);
        parcel.writeString(this.errorModalIncorrectIdDetailsText);
        parcel.writeString(this.errorModalGenericErrorTitle);
        parcel.writeString(this.errorModalGenericErrorText);
        parcel.writeString(this.errorModalTryAgainButtonText);
        parcel.writeString(this.errorModalTroubleshootingTipsButtonText);
        parcel.writeString(this.errorModalReenterIdDetailsButtonText);
        parcel.writeString(this.rescanDocumentPromptTitle);
        parcel.writeString(this.rescanDocumentPromptDescription);
        parcel.writeString(this.successfulScanTransitionComponentName);
        parcel.writeString(this.unableToScanTransitionComponentName);
        parcel.writeString(this.incorrectIdDetailsTransitionComponentName);
    }
}
