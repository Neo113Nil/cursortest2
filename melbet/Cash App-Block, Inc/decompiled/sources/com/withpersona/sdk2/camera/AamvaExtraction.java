package com.withpersona.sdk2.camera;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes5.dex */
public final class AamvaExtraction {
    public static final Regex BIRTH_DATE;
    public static final Regex CITY;
    public static final Regex EXPIRY_DATE;
    public static final Regex FIRST_NAME;
    public static final Regex GENDER;
    public static final Regex ISSUE_DATE;
    public static final Regex ISSUING_COUNTRY;
    public static final Regex LAST_NAME;
    public static final Regex LICENSE_NUMBER;
    public static final Regex MIDDLE_NAME;
    public static final Regex STATE;
    public static final Regex STREET;
    public static final Regex ZIP;
    public final String addressCity;
    public final String addressPostalCode;
    public final String addressState;
    public final String addressStreet1;
    public final Date birthdate;
    public final Date expirationDate;
    public final String identificationNumber;
    public final Date issueDate;
    public final String issuingCountry;
    public final String nameFirst;
    public final String nameLast;
    public final String nameMiddle;
    public final String sex;

    static {
        CameraHelper cameraHelper = new CameraHelper();
        CITY = CameraHelper.access$fieldRegex(cameraHelper, "DAI");
        STATE = CameraHelper.access$fieldRegex(cameraHelper, "DAJ");
        STREET = CameraHelper.access$fieldRegex(cameraHelper, "DAG");
        ZIP = CameraHelper.access$fieldRegex(cameraHelper, "DAK");
        BIRTH_DATE = CameraHelper.access$fieldRegex(cameraHelper, "DBB");
        EXPIRY_DATE = CameraHelper.access$fieldRegex(cameraHelper, "DBA");
        FIRST_NAME = CameraHelper.access$fieldRegex(cameraHelper, "DAC");
        GENDER = CameraHelper.access$fieldRegex(cameraHelper, "DBC");
        ISSUE_DATE = CameraHelper.access$fieldRegex(cameraHelper, "DBD");
        ISSUING_COUNTRY = CameraHelper.access$fieldRegex(cameraHelper, "DCG");
        LAST_NAME = CameraHelper.access$fieldRegex(cameraHelper, "DCS");
        LICENSE_NUMBER = CameraHelper.access$fieldRegex(cameraHelper, "DAQ");
        MIDDLE_NAME = CameraHelper.access$fieldRegex(cameraHelper, "DAD");
    }

    public AamvaExtraction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Date date, Date date2, Date date3, String str10) {
        this.nameFirst = str;
        this.nameMiddle = str2;
        this.nameLast = str3;
        this.sex = str4;
        this.addressStreet1 = str5;
        this.addressCity = str6;
        this.addressState = str7;
        this.addressPostalCode = str8;
        this.identificationNumber = str9;
        this.issueDate = date;
        this.expirationDate = date2;
        this.birthdate = date3;
        this.issuingCountry = str10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AamvaExtraction)) {
            return false;
        }
        AamvaExtraction aamvaExtraction = (AamvaExtraction) obj;
        return Intrinsics.areEqual(this.nameFirst, aamvaExtraction.nameFirst) && Intrinsics.areEqual(this.nameMiddle, aamvaExtraction.nameMiddle) && Intrinsics.areEqual(this.nameLast, aamvaExtraction.nameLast) && Intrinsics.areEqual(this.sex, aamvaExtraction.sex) && Intrinsics.areEqual(this.addressStreet1, aamvaExtraction.addressStreet1) && Intrinsics.areEqual(this.addressCity, aamvaExtraction.addressCity) && Intrinsics.areEqual(this.addressState, aamvaExtraction.addressState) && Intrinsics.areEqual(this.addressPostalCode, aamvaExtraction.addressPostalCode) && Intrinsics.areEqual(this.identificationNumber, aamvaExtraction.identificationNumber) && Intrinsics.areEqual(this.issueDate, aamvaExtraction.issueDate) && Intrinsics.areEqual(this.expirationDate, aamvaExtraction.expirationDate) && Intrinsics.areEqual(this.birthdate, aamvaExtraction.birthdate) && Intrinsics.areEqual(this.issuingCountry, aamvaExtraction.issuingCountry);
    }

    public final int hashCode() {
        String str = this.nameFirst;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nameMiddle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nameLast;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sex;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.addressStreet1;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.addressCity;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.addressState;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.addressPostalCode;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.identificationNumber;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Date date = this.issueDate;
        int hashCode10 = (hashCode9 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.expirationDate;
        int hashCode11 = (hashCode10 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.birthdate;
        int hashCode12 = (hashCode11 + (date3 == null ? 0 : date3.hashCode())) * 31;
        String str10 = this.issuingCountry;
        return hashCode12 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AamvaExtraction(idClass=null, nameFirst=", this.nameFirst, ", nameMiddle=", this.nameMiddle, ", nameLast=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.nameLast, ", sex=", this.sex, ", addressStreet1=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.addressStreet1, ", addressCity=", this.addressCity, ", addressState=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.addressState, ", addressPostalCode=", this.addressPostalCode, ", identificationNumber=");
        m.append(this.identificationNumber);
        m.append(", issueDate=");
        m.append(this.issueDate);
        m.append(", expirationDate=");
        m.append(this.expirationDate);
        m.append(", birthdate=");
        m.append(this.birthdate);
        m.append(", issuingCountry=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.issuingCountry, ")");
    }
}
