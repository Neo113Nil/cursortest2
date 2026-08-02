package com.withpersona.sdk2.camera;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public abstract class BarcodeInfo {

    public final class MrzBarcodeInfo extends BarcodeInfo {
        public final Date birthdate;
        public final Date expirationDate;
        public final String extractionRawPayload;
        public final String identificationNumber;

        public MrzBarcodeInfo(String str, String str2, Date date, Date date2) {
            this.extractionRawPayload = str;
            this.identificationNumber = str2;
            this.birthdate = date;
            this.expirationDate = date2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MrzBarcodeInfo)) {
                return false;
            }
            MrzBarcodeInfo mrzBarcodeInfo = (MrzBarcodeInfo) obj;
            return this.extractionRawPayload.equals(mrzBarcodeInfo.extractionRawPayload) && Intrinsics.areEqual(this.identificationNumber, mrzBarcodeInfo.identificationNumber) && Intrinsics.areEqual(this.birthdate, mrzBarcodeInfo.birthdate) && Intrinsics.areEqual(this.expirationDate, mrzBarcodeInfo.expirationDate);
        }

        public final int hashCode() {
            int hashCode = this.extractionRawPayload.hashCode() * 31;
            String str = this.identificationNumber;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Date date = this.birthdate;
            int hashCode3 = (hashCode2 + (date == null ? 0 : date.hashCode())) * 31;
            Date date2 = this.expirationDate;
            return hashCode3 + (date2 != null ? date2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MrzBarcodeInfo(extractionRawPayload=", this.extractionRawPayload, ", identificationNumber=", this.identificationNumber, ", birthdate=");
            m.append(this.birthdate);
            m.append(", expirationDate=");
            m.append(this.expirationDate);
            m.append(")");
            return m.toString();
        }
    }

    public final class Pdf417BarcodeInfo extends BarcodeInfo {
        public final String extractionRawPayload;

        public Pdf417BarcodeInfo(String str) {
            this.extractionRawPayload = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Pdf417BarcodeInfo) && this.extractionRawPayload.equals(((Pdf417BarcodeInfo) obj).extractionRawPayload);
        }

        public final int hashCode() {
            return this.extractionRawPayload.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Pdf417BarcodeInfo(extractionRawPayload=", this.extractionRawPayload, ")");
        }

        public final AamvaExtraction values() {
            Regex regex = AamvaExtraction.CITY;
            String str = this.extractionRawPayload;
            if (!new Regex("^@\n\\u001e\r(ANSI |AAMVA)\\d{10}.+", RegexOption.DOT_MATCHES_ALL).matches(StringsKt.trim(str).toString())) {
                return null;
            }
            Regex regex2 = AamvaExtraction.FIRST_NAME;
            if (CameraHelper.parseField(str, regex2) == null) {
                return null;
            }
            Regex regex3 = AamvaExtraction.LAST_NAME;
            if (CameraHelper.parseField(str, regex3) != null) {
                return new AamvaExtraction(CameraHelper.parseField(str, regex2), CameraHelper.parseField(str, AamvaExtraction.MIDDLE_NAME), CameraHelper.parseField(str, regex3), CameraHelper.parseField(str, AamvaExtraction.GENDER), CameraHelper.parseField(str, AamvaExtraction.STREET), CameraHelper.parseField(str, AamvaExtraction.CITY), CameraHelper.parseField(str, AamvaExtraction.STATE), CameraHelper.parseField(str, AamvaExtraction.ZIP), CameraHelper.parseField(str, AamvaExtraction.LICENSE_NUMBER), CameraHelper.convertDate(CameraHelper.parseField(str, AamvaExtraction.ISSUE_DATE)), CameraHelper.convertDate(CameraHelper.parseField(str, AamvaExtraction.EXPIRY_DATE)), CameraHelper.convertDate(CameraHelper.parseField(str, AamvaExtraction.BIRTH_DATE)), CameraHelper.parseField(str, AamvaExtraction.ISSUING_COUNTRY));
            }
            return null;
        }
    }
}
