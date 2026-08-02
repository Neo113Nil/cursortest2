package com.withpersona.sdk2.camera;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes5.dex */
public final class MrzExtraction {
    public static final Regex TD1_LINE1 = new Regex("([ACI][A-Z0-9<]{1})([A-Z]{3})([A-Z0-9<]{9})([0-9]{1})([A-Z0-9<]{15})");
    public static final Regex TD1_LINE2 = new Regex("([0-9]{6})([0-9]{1})([MFX<]{1})([0-9]{6})([0-9]{1})([A-Z]{3})([A-Z0-9<]{11})([0-9]{1})");
    public static final Regex TD1_LINE3 = new Regex("([A-Z0-9<]{30})");
    public static final Regex TD3_LINE1;
    public static final Regex TD3_LINE2;
    public final Date birthdate;
    public final Date expirationDate;
    public final String identificationNumber;
    public final String issuingCountry;
    public final String nameFirst;
    public final String nameLast;
    public final String rawText;
    public final String sex;

    static {
        new Regex("([ACI][A-Z0-9<]{1})([A-Z]{3})([A-Z0-9<]{31})");
        new Regex("([A-Z0-9<]{9})([0-9]{1})([A-Z]{3})([0-9]{6})([0-9]{1})([MFX<]{1})([0-9]{6})([0-9]{1})([A-Z0-9<]{7})([0-9]{1})");
        new Regex("(P[A-Z0-9<]{1})([A-Z]{3})([A-Z0-9<]+?<<+)");
        TD3_LINE1 = new Regex("(P[A-Z0-9<]{1})([A-Z]{3})([A-Z0-9<]+?)<<([A-Z0-9<]+<<+)");
        TD3_LINE2 = new Regex("([A-Z0-9<]{9})([0-9]{1})([A-Z]{3})([0-9]{6})([0-9]{1})([MFX<]{1})([0-9]{6})([0-9]{1})?([A-Z0-9<]{14})?([0-9]{1})?([0-9]{1})?");
    }

    public MrzExtraction(String str, String str2, String str3, String str4, String str5, Date date, Date date2, String str6) {
        this.rawText = str;
        this.nameFirst = str2;
        this.nameLast = str3;
        this.sex = str4;
        this.identificationNumber = str5;
        this.expirationDate = date;
        this.birthdate = date2;
        this.issuingCountry = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MrzExtraction)) {
            return false;
        }
        MrzExtraction mrzExtraction = (MrzExtraction) obj;
        return this.rawText.equals(mrzExtraction.rawText) && Intrinsics.areEqual(this.nameFirst, mrzExtraction.nameFirst) && Intrinsics.areEqual(this.nameLast, mrzExtraction.nameLast) && Intrinsics.areEqual(this.sex, mrzExtraction.sex) && Intrinsics.areEqual(this.identificationNumber, mrzExtraction.identificationNumber) && Intrinsics.areEqual(this.expirationDate, mrzExtraction.expirationDate) && Intrinsics.areEqual(this.birthdate, mrzExtraction.birthdate) && Intrinsics.areEqual(this.issuingCountry, mrzExtraction.issuingCountry);
    }

    public final int hashCode() {
        int hashCode = this.rawText.hashCode() * 961;
        String str = this.nameFirst;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 961;
        String str2 = this.nameLast;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sex;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 28629151;
        String str4 = this.identificationNumber;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 961;
        Date date = this.expirationDate;
        int hashCode6 = (hashCode5 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.birthdate;
        int hashCode7 = (hashCode6 + (date2 == null ? 0 : date2.hashCode())) * 31;
        String str5 = this.issuingCountry;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MrzExtraction(rawText=", this.rawText, ", idClass=null, nameFirst=", this.nameFirst, ", nameMiddle=null, nameLast=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.nameLast, ", sex=", this.sex, ", addressStreet1=null, addressCity=null, addressState=null, addressPostalCode=null, identificationNumber=");
        m.append(this.identificationNumber);
        m.append(", issueDate=null, expirationDate=");
        m.append(this.expirationDate);
        m.append(", birthdate=");
        m.append(this.birthdate);
        m.append(", issuingCountry=");
        m.append(this.issuingCountry);
        m.append(")");
        return m.toString();
    }
}
